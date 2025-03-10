// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iotfirmwaredefense.generated;

import com.azure.resourcemanager.iotfirmwaredefense.models.Workspace;

/**
 * Samples for Workspaces Update.
 */
public final class WorkspacesUpdateSamples {
    /*
     * x-ms-original-file: specification/fist/resource-manager/Microsoft.IoTFirmwareDefense/stable/2024-01-10/examples/
     * Workspaces_Update_MaximumSet_Gen.json
     */
    /**
     * Sample code: Workspaces_Update_MaximumSet_Gen.
     * 
     * @param manager Entry point to IoTFirmwareDefenseManager.
     */
    public static void
        workspacesUpdateMaximumSetGen(com.azure.resourcemanager.iotfirmwaredefense.IoTFirmwareDefenseManager manager) {
        Workspace resource = manager.workspaces()
            .getByResourceGroupWithResponse("rgworkspaces", "E___-3", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().apply();
    }

    /*
     * x-ms-original-file: specification/fist/resource-manager/Microsoft.IoTFirmwareDefense/stable/2024-01-10/examples/
     * Workspaces_Update_MinimumSet_Gen.json
     */
    /**
     * Sample code: Workspaces_Update_MinimumSet_Gen.
     * 
     * @param manager Entry point to IoTFirmwareDefenseManager.
     */
    public static void
        workspacesUpdateMinimumSetGen(com.azure.resourcemanager.iotfirmwaredefense.IoTFirmwareDefenseManager manager) {
        Workspace resource = manager.workspaces()
            .getByResourceGroupWithResponse("rgworkspaces", "E___-3", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().apply();
    }
}
