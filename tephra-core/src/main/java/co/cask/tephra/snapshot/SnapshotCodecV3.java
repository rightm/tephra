/*
 * Copyright © 2015 Cask Data, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package co.cask.tephra.snapshot;

/**
 * Handles serialization/deserialization of a {@link co.cask.tephra.persist.TransactionSnapshot}
 * and its elements to {@code byte[]}.
 *
 * <p>The serialization/deserialization of this codec is the same as that performed by {@link SnapshotCodecV2},
 * but a new version number is used to allow easy migration from projects using deprecated codecs with
 * conflicting version numbers.</p>
 */
public class SnapshotCodecV3 extends SnapshotCodecV2 {
  @Override
  public int getVersion() {
    return 3;
  }
}
