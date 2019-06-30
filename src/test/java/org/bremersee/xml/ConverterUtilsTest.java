package org.bremersee.xml;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * The converter utilities test.
 *
 * @author Christian Bremer
 */
public class ConverterUtilsTest {

  private static String xmlCalStrZ = "2019-03-27T17:41:31.687Z";

  private static String xmlCalStrNewYork = "2019-03-27T13:45:44.157-04:00";

  private static XMLGregorianCalendar xmlCalZ;

  private static XMLGregorianCalendar xmlCalNewYork;

  private static OffsetDateTime dateTimeZ;

  private static OffsetDateTime dateTimeNewYork;

  /**
   * Setup test.
   */
  @BeforeClass
  public static void setup() {
    try {
      xmlCalZ = DatatypeFactory.newInstance().newXMLGregorianCalendar(xmlCalStrZ);
      xmlCalNewYork = DatatypeFactory.newInstance().newXMLGregorianCalendar(xmlCalStrNewYork);

    } catch (DatatypeConfigurationException e) {
      throw new RuntimeException("Creating XMLGregorianCalendar failed.", e);
    }
    dateTimeZ = OffsetDateTime.parse(xmlCalStrZ, DateTimeFormatter.ISO_OFFSET_DATE_TIME);
    dateTimeNewYork = OffsetDateTime
        .parse(xmlCalStrNewYork, DateTimeFormatter.ISO_OFFSET_DATE_TIME);

    Assert.assertEquals(xmlCalZ.toXMLFormat(), dateTimeZ.toString());
    Assert.assertEquals(xmlCalNewYork.toXMLFormat(), dateTimeNewYork.toString());
  }

  /**
   * Duration test.
   */
  @Test
  public void duration() {
    Duration xmlDuration = ConverterUtils.millisToXmlDuration(1234L);
    Assert.assertNotNull(xmlDuration);
    Long millis = ConverterUtils.xmlDurationToMillis(xmlDuration);
    Assert.assertNotNull(millis);
    Assert.assertEquals(Long.valueOf(1234L), millis);

    xmlDuration = ConverterUtils.durationToXmlDuration(java.time.Duration.ofMillis(987655432L));
    Assert.assertNotNull(xmlDuration);
    java.time.Duration duration = ConverterUtils.xmlDurationToDuration(xmlDuration);
    Assert.assertNotNull(duration);
    Assert.assertEquals(987655432L, duration.toMillis());

    Assert.assertNull(ConverterUtils.millisToXmlDuration(null));
    Assert.assertNull(ConverterUtils.durationToXmlDuration(null));
    Assert.assertNull(ConverterUtils.xmlDurationToDuration(null));
    Assert.assertNull(ConverterUtils.xmlDurationToMillis(null));
  }

  /**
   * Calendar test.
   */
  @Test
  public void calendar() {
    GregorianCalendar cal = ConverterUtils.xmlCalendarToCalendar(xmlCalZ);
    Assert.assertNotNull(cal);
    Assert.assertEquals(xmlCalStrZ, ConverterUtils.calendarToXmlCalendar(cal).toXMLFormat());

    cal = ConverterUtils.xmlCalendarToCalendar(xmlCalNewYork);
    Assert.assertNotNull(cal);
    Assert.assertEquals(xmlCalStrNewYork, ConverterUtils.calendarToXmlCalendar(cal).toXMLFormat());

    Assert.assertNull(ConverterUtils.xmlCalendarToCalendar(null));
    Assert.assertNull(ConverterUtils.calendarToXmlCalendar(null));
  }

  /**
   * Date time test.
   */
  @Test
  public void dateTime() {
    OffsetDateTime dateTime = ConverterUtils.xmlCalendarToOffsetDateTime(xmlCalZ);
    Assert.assertNotNull(dateTime);
    Assert.assertEquals(
        xmlCalStrZ,
        ConverterUtils.offsetDateTimeToXmlCalendar(dateTime).toXMLFormat());

    dateTime = ConverterUtils.xmlCalendarToOffsetDateTime(xmlCalNewYork);
    Assert.assertNotNull(dateTime);
    Assert.assertEquals(
        xmlCalStrNewYork,
        ConverterUtils.offsetDateTimeToXmlCalendar(dateTime).toXMLFormat());

    Assert.assertNull(ConverterUtils.xmlCalendarToOffsetDateTime(null));
    Assert.assertNull(ConverterUtils.offsetDateTimeToXmlCalendar(null));
  }

  /**
   * Date time UTC test.
   */
  @Test
  public void dateTimeUtc() {
    OffsetDateTime dateTime = ConverterUtils.xmlCalendarToOffsetDateTimeUtc(xmlCalNewYork);
    Assert.assertNotNull(dateTime);
    Assert.assertEquals(
        dateTime.toString(),
        ConverterUtils.offsetDateTimeToXmlCalendarUtc(dateTime).toXMLFormat());
    Assert.assertTrue(dateTime.toString().endsWith("Z"));

    Assert.assertNull(ConverterUtils.xmlCalendarToOffsetDateTimeUtc(null));
    Assert.assertNull(ConverterUtils.offsetDateTimeToXmlCalendarUtc(null));
  }

  /**
   * Date test.
   */
  @Test
  public void date() {
    Date date = ConverterUtils.xmlCalendarToDate(xmlCalZ);
    Assert.assertNotNull(date);
    Assert.assertEquals(Date.from(dateTimeZ.toInstant()), date);

    XMLGregorianCalendar cal = ConverterUtils.dateToXmlCalendar(date, TimeZone.getTimeZone("GMT"));
    Assert.assertNotNull(cal);
    Assert.assertEquals(date, cal.toGregorianCalendar().getTime());
    Assert.assertEquals(xmlCalStrZ, cal.toXMLFormat());

    date = ConverterUtils.xmlCalendarToDate(xmlCalNewYork);
    Assert.assertNotNull(date);
    Assert.assertEquals(Date.from(dateTimeNewYork.toInstant()), date);

    cal = ConverterUtils.dateToXmlCalendar(date, TimeZone.getTimeZone("America/New_York"));
    Assert.assertNotNull(cal);
    Assert.assertEquals(date, cal.toGregorianCalendar().getTime());
    Assert.assertEquals(xmlCalStrNewYork, cal.toXMLFormat());

    Assert.assertNull(ConverterUtils.xmlCalendarToDate(null));
    Assert.assertNull(ConverterUtils.dateToXmlCalendar(null));
  }

  /**
   * Instant test.
   */
  @Test
  public void instant() {
    Instant instant = ConverterUtils.xmlCalendarToInstant(xmlCalZ);
    Assert.assertNotNull(instant);
    Assert.assertEquals(xmlCalZ.toGregorianCalendar().getTime().toInstant(), instant);

    XMLGregorianCalendar cal = ConverterUtils.instantToXmlCalendar(instant, ZoneOffset.UTC);
    Assert.assertNotNull(cal);
    Assert.assertEquals(instant, cal.toGregorianCalendar().getTime().toInstant());
    Assert.assertEquals(xmlCalStrZ, cal.toXMLFormat());

    instant = ConverterUtils.xmlCalendarToInstant(xmlCalNewYork);
    Assert.assertNotNull(instant);
    Assert.assertEquals(xmlCalNewYork.toGregorianCalendar().getTime().toInstant(), instant);

    cal = ConverterUtils.instantToXmlCalendar(
        instant, TimeZone.getTimeZone("America/New_York").toZoneId());
    Assert.assertNotNull(cal);
    Assert.assertEquals(instant, cal.toGregorianCalendar().getTime().toInstant());
    Assert.assertEquals(xmlCalStrNewYork, cal.toXMLFormat());

    Assert.assertNull(ConverterUtils.xmlCalendarToInstant(null));
    Assert.assertNull(ConverterUtils.instantToXmlCalendar(null));
  }

  /**
   * Millis test.
   */
  @Test
  public void millis() {
    Long millis = ConverterUtils.xmlCalendarToMillis(xmlCalZ);
    Assert.assertNotNull(millis);
    Assert.assertEquals(xmlCalZ.toGregorianCalendar().getTime().getTime(), (long) millis);

    XMLGregorianCalendar cal = ConverterUtils.millisToXmlCalendar(
        millis, TimeZone.getTimeZone("GMT"));
    Assert.assertNotNull(cal);
    Assert.assertEquals((long) millis, cal.toGregorianCalendar().getTime().getTime());
    Assert.assertEquals(xmlCalStrZ, cal.toXMLFormat());

    millis = ConverterUtils.xmlCalendarToMillis(xmlCalNewYork);
    Assert.assertNotNull(millis);
    Assert.assertEquals(Date.from(dateTimeNewYork.toInstant()), new Date(millis));

    cal = ConverterUtils.millisToXmlCalendar(millis, TimeZone.getTimeZone("America/New_York"));
    Assert.assertNotNull(cal);
    Assert.assertEquals((long) millis, cal.toGregorianCalendar().getTime().getTime());
    Assert.assertEquals(xmlCalStrNewYork, cal.toXMLFormat());

    Assert.assertNull(ConverterUtils.xmlCalendarToMillis(null));
    Assert.assertNull(ConverterUtils.millisToXmlCalendar(null));
  }

}