# common-model

Library of the common model.

- [Documentation](https://nexus.bremersee.org/repository/maven-sites/common-model/1.0.0-SNAPSHOT/index.html)

### Maven

##### Plain Java Model

```xml
<dependency>
  <groupId>org.bremersee</groupId>
  <artifactId>common-model-plain</artifactId>
  <version>1.0.0-SNAPSHOT</version>
</dependency>
```

##### Generated Java Model from Swagger Definitions for the Spring Framework

```xml
<dependency>
  <groupId>org.bremersee</groupId>
  <artifactId>common-model-spring</artifactId>
  <version>1.0.0-SNAPSHOT</version>
</dependency>
```

### Maven Repository

```xml
<repositories>
  <repository>
    <id>bremersee-releases</id>
    <name>Bremersee Releases</name>
    <url>https://nexus.bremersee.org/repository/maven-releases</url>
    <snapshots>
      <enabled>false</enabled>
    </snapshots>
  </repository>
  <repository>
    <id>bremersee-snapshots</id>
    <name>Bremersee Snapshots</name>
    <url>https://nexus.bremersee.org/repository/maven-snapshots</url>
    <snapshots>
      <enabled>true</enabled>
    </snapshots>
  </repository>
</repositories>
```
