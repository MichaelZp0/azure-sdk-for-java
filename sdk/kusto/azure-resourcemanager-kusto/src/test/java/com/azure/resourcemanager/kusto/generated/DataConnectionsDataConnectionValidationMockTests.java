// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.kusto.KustoManager;
import com.azure.resourcemanager.kusto.fluent.models.DataConnectionInner;
import com.azure.resourcemanager.kusto.fluent.models.DataConnectionValidationInner;
import com.azure.resourcemanager.kusto.models.DataConnectionValidationListResult;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class DataConnectionsDataConnectionValidationMockTests {
    @Test
    public void testDataConnectionValidation() throws Exception {
        String responseStr
            = "{\"value\":[{\"errorMessage\":\"tlghwzhomew\"},{\"errorMessage\":\"s\"},{\"errorMessage\":\"iuh\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        KustoManager manager = KustoManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        DataConnectionValidationListResult response = manager.dataConnections()
            .dataConnectionValidation("nlzafwxudgnh", "ookrtalvnbw", "pbeme",
                new DataConnectionValidationInner().withDataConnectionName("clvdjjukyrdnqod")
                    .withProperties(new DataConnectionInner().withLocation("h")),
                com.azure.core.util.Context.NONE);

        Assertions.assertEquals("tlghwzhomew", response.value().get(0).errorMessage());
    }
}
