/*
 * Copyright 2019 ConsenSys AG.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package tech.pegasys.pantheon.plugin.services;

import tech.pegasys.pantheon.plugin.services.storage.KeyValueStorageFactory;
import tech.pegasys.pantheon.plugin.services.storage.SegmentIdentifier;

import java.util.List;

/** This service allows plugins to register as an available storage engine. */
public interface StorageService {

  /**
   * Registers a factory as available for creating key-value storage instances.
   *
   * @param factory creates instances providing key-value storage.
   */
  void registerKeyValueStorage(KeyValueStorageFactory factory);

  /**
   * Retrieves the identifiers for the isolation segments that could be requested during operation.
   *
   * @return full set of possible segments required from the storage service.
   */
  List<SegmentIdentifier> getAllSegmentIdentifiers();
}
