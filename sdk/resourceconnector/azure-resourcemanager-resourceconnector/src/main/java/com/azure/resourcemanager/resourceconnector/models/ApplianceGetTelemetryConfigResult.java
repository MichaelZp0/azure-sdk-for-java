// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourceconnector.models;

import com.azure.resourcemanager.resourceconnector.fluent.models.ApplianceGetTelemetryConfigResultInner;

/**
 * An immutable client-side representation of ApplianceGetTelemetryConfigResult.
 */
public interface ApplianceGetTelemetryConfigResult {
    /**
     * Gets the telemetryInstrumentationKey property: Telemetry instrumentation key.
     * 
     * @return the telemetryInstrumentationKey value.
     */
    String telemetryInstrumentationKey();

    /**
     * Gets the inner com.azure.resourcemanager.resourceconnector.fluent.models.ApplianceGetTelemetryConfigResultInner
     * object.
     * 
     * @return the inner object.
     */
    ApplianceGetTelemetryConfigResultInner innerModel();
}
