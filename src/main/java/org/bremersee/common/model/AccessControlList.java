/*
 * Copyright 2020 the original author or authors.
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

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.List;
import javax.annotation.Nullable;
import javax.validation.Valid;
import org.immutables.value.Value;

/**
 * Specifies permissions and who is granted.
 *
 * @author Christian Bremer
 */
@Value.Immutable
@Valid
@Schema(description = "Specifies permissions and who is granted.")
@JsonDeserialize(builder = ImmutableAccessControlList.Builder.class)
public interface AccessControlList {

  /**
   * Creates new builder.
   *
   * @return the access control list builder
   */
  static ImmutableAccessControlList.Builder builder() {
    return ImmutableAccessControlList.builder();
  }

  /**
   * The owner is always granted and can only be changed by the owner.
   *
   * @return the owner
   */
  @Schema(description = "The owner is always granted and can only be changed by the owner.")
  @Nullable
  String getOwner();

  /**
   * Get entries.
   *
   * @return the entries
   */
  @Schema(description = "The access control entries.")
  @Value.Default
  default List<AccessControlEntry> getEntries() {
    return List.of();
  }

}
