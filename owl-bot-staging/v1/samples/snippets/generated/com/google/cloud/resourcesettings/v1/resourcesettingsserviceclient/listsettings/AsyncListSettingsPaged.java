/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.resourcesettings.v1.samples;

// [START resourcesettings_v1_generated_resourcesettingsserviceclient_listsettings_paged_async]
import com.google.cloud.resourcesettings.v1.ListSettingsRequest;
import com.google.cloud.resourcesettings.v1.ListSettingsResponse;
import com.google.cloud.resourcesettings.v1.ResourceSettingsServiceClient;
import com.google.cloud.resourcesettings.v1.Setting;
import com.google.cloud.resourcesettings.v1.SettingView;
import com.google.common.base.Strings;

public class AsyncListSettingsPaged {

  public static void main(String[] args) throws Exception {
    asyncListSettingsPaged();
  }

  public static void asyncListSettingsPaged() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (ResourceSettingsServiceClient resourceSettingsServiceClient =
        ResourceSettingsServiceClient.create()) {
      ListSettingsRequest request =
          ListSettingsRequest.newBuilder()
              .setParent("ListSettingsRequest-286838706".toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .setView(SettingView.forNumber(0))
              .build();
      while (true) {
        ListSettingsResponse response =
            resourceSettingsServiceClient.listSettingsCallable().call(request);
        for (Setting element : response.getSettingsList()) {
          // doThingsWith(element);
        }
        String nextPageToken = response.getNextPageToken();
        if (!Strings.isNullOrEmpty(nextPageToken)) {
          request = request.toBuilder().setPageToken(nextPageToken).build();
        } else {
          break;
        }
      }
    }
  }
}
// [END resourcesettings_v1_generated_resourcesettingsserviceclient_listsettings_paged_async]
