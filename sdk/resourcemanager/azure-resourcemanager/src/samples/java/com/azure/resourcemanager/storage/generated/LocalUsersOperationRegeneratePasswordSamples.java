// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated;

/**
 * Samples for LocalUsersOperation RegeneratePassword.
 */
public final class LocalUsersOperationRegeneratePasswordSamples {
    /*
     * x-ms-original-file:
     * specification/storage/resource-manager/Microsoft.Storage/stable/2024-01-01/examples/LocalUserRegeneratePassword.
     * json
     */
    /**
     * Sample code: RegenerateLocalUserPassword.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void regenerateLocalUserPassword(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.storageAccounts()
            .manager()
            .serviceClient()
            .getLocalUsersOperations()
            .regeneratePasswordWithResponse("res6977", "sto2527", "user1", com.azure.core.util.Context.NONE);
    }
}
