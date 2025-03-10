// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The sku.
 */
@Fluent
public final class IntegrationServiceEnvironmentSkuDefinitionSku
    implements JsonSerializable<IntegrationServiceEnvironmentSkuDefinitionSku> {
    /*
     * The sku name.
     */
    private IntegrationServiceEnvironmentSkuName name;

    /*
     * The sku tier.
     */
    private String tier;

    /**
     * Creates an instance of IntegrationServiceEnvironmentSkuDefinitionSku class.
     */
    public IntegrationServiceEnvironmentSkuDefinitionSku() {
    }

    /**
     * Get the name property: The sku name.
     * 
     * @return the name value.
     */
    public IntegrationServiceEnvironmentSkuName name() {
        return this.name;
    }

    /**
     * Set the name property: The sku name.
     * 
     * @param name the name value to set.
     * @return the IntegrationServiceEnvironmentSkuDefinitionSku object itself.
     */
    public IntegrationServiceEnvironmentSkuDefinitionSku withName(IntegrationServiceEnvironmentSkuName name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tier property: The sku tier.
     * 
     * @return the tier value.
     */
    public String tier() {
        return this.tier;
    }

    /**
     * Set the tier property: The sku tier.
     * 
     * @param tier the tier value to set.
     * @return the IntegrationServiceEnvironmentSkuDefinitionSku object itself.
     */
    public IntegrationServiceEnvironmentSkuDefinitionSku withTier(String tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name == null ? null : this.name.toString());
        jsonWriter.writeStringField("tier", this.tier);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IntegrationServiceEnvironmentSkuDefinitionSku from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IntegrationServiceEnvironmentSkuDefinitionSku if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the IntegrationServiceEnvironmentSkuDefinitionSku.
     */
    public static IntegrationServiceEnvironmentSkuDefinitionSku fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            IntegrationServiceEnvironmentSkuDefinitionSku deserializedIntegrationServiceEnvironmentSkuDefinitionSku
                = new IntegrationServiceEnvironmentSkuDefinitionSku();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedIntegrationServiceEnvironmentSkuDefinitionSku.name
                        = IntegrationServiceEnvironmentSkuName.fromString(reader.getString());
                } else if ("tier".equals(fieldName)) {
                    deserializedIntegrationServiceEnvironmentSkuDefinitionSku.tier = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedIntegrationServiceEnvironmentSkuDefinitionSku;
        });
    }
}
