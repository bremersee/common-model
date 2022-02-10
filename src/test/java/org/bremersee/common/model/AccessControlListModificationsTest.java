/*
 * Copyright 2018-2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.bremersee.common.model;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.assertj.core.api.SoftAssertions;
import org.assertj.core.api.junit.jupiter.SoftAssertionsExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

/**
 * The access control list modifications test.
 *
 * @author Christian Bremer
 */
@ExtendWith(SoftAssertionsExtension.class)
class AccessControlListModificationsTest {

  /**
   * Gets new new owner.
   *
   * @param softly the soft assertions
   */
  @Test
  void getNewNewOwner(SoftAssertions softly) {
    softly
        .assertThat(AccessControlListModifications
            .builder()
            .newOwner("someone")
            .build()
            .getNewOwner())
        .isEqualTo("someone");

    softly
        .assertThat(AccessControlListModifications
            .from(AccessControlList.builder()
                .owner("someone")
                .build())
            .build()
            .getNewOwner())
        .isEqualTo("someone");
  }

  /**
   * Gets modifications.
   */
  @Test
  void getModifications() {
    List<AccessControlEntryModifications> expected = List.of(
        AccessControlEntryModifications.builder()
            .permission("write")
            .addAddUsers("someone-else")
            .build()
    );
    assertThat(
        AccessControlListModifications.builder()
            .newOwner("someone")
            .modifications(expected)
            .build()
            .getModifications())
        .containsExactlyElementsOf(expected);
  }
}