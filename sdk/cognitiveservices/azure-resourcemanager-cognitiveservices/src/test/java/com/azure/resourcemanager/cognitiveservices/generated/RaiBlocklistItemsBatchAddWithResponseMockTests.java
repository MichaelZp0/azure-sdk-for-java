// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager;
import com.azure.resourcemanager.cognitiveservices.models.RaiBlocklist;
import com.azure.resourcemanager.cognitiveservices.models.RaiBlocklistItemBulkRequest;
import com.azure.resourcemanager.cognitiveservices.models.RaiBlocklistItemProperties;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class RaiBlocklistItemsBatchAddWithResponseMockTests {
    @Test
    public void testBatchAddWithResponse() throws Exception {
        String responseStr
            = "{\"etag\":\"ogxsvtzarhz\",\"tags\":{\"oslpky\":\"sqktcmbjwz\",\"mqbmfuvqarwz\":\"tglwkzpgajsqjc\"},\"properties\":{\"description\":\"rebluimmbwxsf\"},\"id\":\"td\",\"name\":\"b\",\"type\":\"xekr\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        CognitiveServicesManager manager = CognitiveServicesManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        RaiBlocklist response
            = manager.raiBlocklistItems()
                .batchAddWithResponse("kwwwnckn", "zdajlskzptjxu", "weucyrth", Arrays.asList(
                    new RaiBlocklistItemBulkRequest().withName("ehmcgcje")
                        .withProperties(new RaiBlocklistItemProperties().withPattern("ehokamvfej").withIsRegex(false)),
                    new RaiBlocklistItemBulkRequest().withName("tmbqdabzfivfok")
                        .withProperties(new RaiBlocklistItemProperties().withPattern("thhzagjfw").withIsRegex(true)),
                    new RaiBlocklistItemBulkRequest().withName("hgenuzejgvkveb")
                        .withProperties(new RaiBlocklistItemProperties().withPattern("zllrz").withIsRegex(true)),
                    new RaiBlocklistItemBulkRequest().withName("dqgmih")
                        .withProperties(new RaiBlocklistItemProperties().withPattern("mcqrhnxt").withIsRegex(true))),
                    com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("sqktcmbjwz", response.tags().get("oslpky"));
        Assertions.assertEquals("rebluimmbwxsf", response.properties().description());
    }
}
