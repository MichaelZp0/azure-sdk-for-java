// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

/**
 * Samples for Slices ListByMobileNetwork.
 */
public final class SlicesListByMobileNetworkSamples {
    /*
     * x-ms-original-file:
     * specification/mobilenetwork/resource-manager/Microsoft.MobileNetwork/stable/2024-04-01/examples/
     * SliceListByMobileNetwork.json
     */
    /**
     * Sample code: List network slices in a mobile network.
     * 
     * @param manager Entry point to MobileNetworkManager.
     */
    public static void
        listNetworkSlicesInAMobileNetwork(com.azure.resourcemanager.mobilenetwork.MobileNetworkManager manager) {
        manager.slices().listByMobileNetwork("rg1", "testMobileNetwork", com.azure.core.util.Context.NONE);
    }
}
