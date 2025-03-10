// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated;

import com.azure.resourcemanager.storage.fluent.models.LegalHoldInner;
import java.util.Arrays;

/**
 * Samples for BlobContainers SetLegalHold.
 */
public final class BlobContainersSetLegalHoldSamples {
    /*
     * x-ms-original-file:
     * specification/storage/resource-manager/Microsoft.Storage/stable/2024-01-01/examples/BlobContainersSetLegalHold.
     * json
     */
    /**
     * Sample code: SetLegalHoldContainers.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void setLegalHoldContainers(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.storageAccounts()
            .manager()
            .serviceClient()
            .getBlobContainers()
            .setLegalHoldWithResponse("res4303", "sto7280", "container8723",
                new LegalHoldInner().withTags(Arrays.asList("tag1", "tag2", "tag3")), com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/storage/resource-manager/Microsoft.Storage/stable/2024-01-01/examples/
     * BlobContainersSetLegalHoldAllowProtectedAppendWritesAll.json
     */
    /**
     * Sample code: SetLegalHoldContainersWithAllowProtectedAppendWritesAll.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        setLegalHoldContainersWithAllowProtectedAppendWritesAll(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.storageAccounts()
            .manager()
            .serviceClient()
            .getBlobContainers()
            .setLegalHoldWithResponse("res4303", "sto7280", "container8723",
                new LegalHoldInner().withTags(Arrays.asList("tag1", "tag2", "tag3"))
                    .withAllowProtectedAppendWritesAll(true),
                com.azure.core.util.Context.NONE);
    }
}
