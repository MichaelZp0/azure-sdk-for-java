// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * The IoTSecuritySolutionAnalyticsModelPropertiesDevicesMetricsItem model.
 */
@Fluent
public final class IoTSecuritySolutionAnalyticsModelPropertiesDevicesMetricsItem
    implements JsonSerializable<IoTSecuritySolutionAnalyticsModelPropertiesDevicesMetricsItem> {
    /*
     * Aggregation of IoT Security solution device alert metrics by date.
     */
    private OffsetDateTime date;

    /*
     * Device alert count by severity.
     */
    private IoTSeverityMetrics devicesMetrics;

    /**
     * Creates an instance of IoTSecuritySolutionAnalyticsModelPropertiesDevicesMetricsItem class.
     */
    public IoTSecuritySolutionAnalyticsModelPropertiesDevicesMetricsItem() {
    }

    /**
     * Get the date property: Aggregation of IoT Security solution device alert metrics by date.
     * 
     * @return the date value.
     */
    public OffsetDateTime date() {
        return this.date;
    }

    /**
     * Set the date property: Aggregation of IoT Security solution device alert metrics by date.
     * 
     * @param date the date value to set.
     * @return the IoTSecuritySolutionAnalyticsModelPropertiesDevicesMetricsItem object itself.
     */
    public IoTSecuritySolutionAnalyticsModelPropertiesDevicesMetricsItem withDate(OffsetDateTime date) {
        this.date = date;
        return this;
    }

    /**
     * Get the devicesMetrics property: Device alert count by severity.
     * 
     * @return the devicesMetrics value.
     */
    public IoTSeverityMetrics devicesMetrics() {
        return this.devicesMetrics;
    }

    /**
     * Set the devicesMetrics property: Device alert count by severity.
     * 
     * @param devicesMetrics the devicesMetrics value to set.
     * @return the IoTSecuritySolutionAnalyticsModelPropertiesDevicesMetricsItem object itself.
     */
    public IoTSecuritySolutionAnalyticsModelPropertiesDevicesMetricsItem
        withDevicesMetrics(IoTSeverityMetrics devicesMetrics) {
        this.devicesMetrics = devicesMetrics;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (devicesMetrics() != null) {
            devicesMetrics().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("date",
            this.date == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.date));
        jsonWriter.writeJsonField("devicesMetrics", this.devicesMetrics);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IoTSecuritySolutionAnalyticsModelPropertiesDevicesMetricsItem from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IoTSecuritySolutionAnalyticsModelPropertiesDevicesMetricsItem if the JsonReader was
     * pointing to an instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the
     * IoTSecuritySolutionAnalyticsModelPropertiesDevicesMetricsItem.
     */
    public static IoTSecuritySolutionAnalyticsModelPropertiesDevicesMetricsItem fromJson(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            IoTSecuritySolutionAnalyticsModelPropertiesDevicesMetricsItem deserializedIoTSecuritySolutionAnalyticsModelPropertiesDevicesMetricsItem
                = new IoTSecuritySolutionAnalyticsModelPropertiesDevicesMetricsItem();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("date".equals(fieldName)) {
                    deserializedIoTSecuritySolutionAnalyticsModelPropertiesDevicesMetricsItem.date = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("devicesMetrics".equals(fieldName)) {
                    deserializedIoTSecuritySolutionAnalyticsModelPropertiesDevicesMetricsItem.devicesMetrics
                        = IoTSeverityMetrics.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedIoTSecuritySolutionAnalyticsModelPropertiesDevicesMetricsItem;
        });
    }
}
