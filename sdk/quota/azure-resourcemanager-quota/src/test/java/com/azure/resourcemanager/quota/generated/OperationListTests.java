// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quota.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.quota.fluent.models.OperationResponseInner;
import com.azure.resourcemanager.quota.models.OperationDisplay;
import com.azure.resourcemanager.quota.models.OperationList;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class OperationListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationList model = BinaryData.fromString(
            "{\"value\":[{\"name\":\"qukkfp\",\"display\":{\"provider\":\"gsxnkjzkdeslpv\",\"resource\":\"pwiyig\",\"operation\":\"pkdwzbai\",\"description\":\"bbaumnyquped\"},\"origin\":\"jn\"}],\"nextLink\":\"ckhsmtxpsieb\"}")
            .toObject(OperationList.class);
        Assertions.assertEquals("qukkfp", model.value().get(0).name());
        Assertions.assertEquals("gsxnkjzkdeslpv", model.value().get(0).display().provider());
        Assertions.assertEquals("pwiyig", model.value().get(0).display().resource());
        Assertions.assertEquals("pkdwzbai", model.value().get(0).display().operation());
        Assertions.assertEquals("bbaumnyquped", model.value().get(0).display().description());
        Assertions.assertEquals("jn", model.value().get(0).origin());
        Assertions.assertEquals("ckhsmtxpsieb", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationList model
            = new OperationList().withValue(Arrays.asList(new OperationResponseInner().withName("qukkfp")
                .withDisplay(new OperationDisplay().withProvider("gsxnkjzkdeslpv")
                    .withResource("pwiyig")
                    .withOperation("pkdwzbai")
                    .withDescription("bbaumnyquped"))
                .withOrigin("jn"))).withNextLink("ckhsmtxpsieb");
        model = BinaryData.fromObject(model).toObject(OperationList.class);
        Assertions.assertEquals("qukkfp", model.value().get(0).name());
        Assertions.assertEquals("gsxnkjzkdeslpv", model.value().get(0).display().provider());
        Assertions.assertEquals("pwiyig", model.value().get(0).display().resource());
        Assertions.assertEquals("pkdwzbai", model.value().get(0).display().operation());
        Assertions.assertEquals("bbaumnyquped", model.value().get(0).display().description());
        Assertions.assertEquals("jn", model.value().get(0).origin());
        Assertions.assertEquals("ckhsmtxpsieb", model.nextLink());
    }
}
