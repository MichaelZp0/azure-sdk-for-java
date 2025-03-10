// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Subscription key parameter names details.
 */
@Fluent
public final class SubscriptionKeyParameterNamesContract
    implements JsonSerializable<SubscriptionKeyParameterNamesContract> {
    /*
     * Subscription key header name.
     */
    private String headerProperty;

    /*
     * Subscription key query string parameter name.
     */
    private String query;

    /**
     * Creates an instance of SubscriptionKeyParameterNamesContract class.
     */
    public SubscriptionKeyParameterNamesContract() {
    }

    /**
     * Get the headerProperty property: Subscription key header name.
     * 
     * @return the headerProperty value.
     */
    public String headerProperty() {
        return this.headerProperty;
    }

    /**
     * Set the headerProperty property: Subscription key header name.
     * 
     * @param headerProperty the headerProperty value to set.
     * @return the SubscriptionKeyParameterNamesContract object itself.
     */
    public SubscriptionKeyParameterNamesContract withHeaderProperty(String headerProperty) {
        this.headerProperty = headerProperty;
        return this;
    }

    /**
     * Get the query property: Subscription key query string parameter name.
     * 
     * @return the query value.
     */
    public String query() {
        return this.query;
    }

    /**
     * Set the query property: Subscription key query string parameter name.
     * 
     * @param query the query value to set.
     * @return the SubscriptionKeyParameterNamesContract object itself.
     */
    public SubscriptionKeyParameterNamesContract withQuery(String query) {
        this.query = query;
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
        jsonWriter.writeStringField("header", this.headerProperty);
        jsonWriter.writeStringField("query", this.query);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SubscriptionKeyParameterNamesContract from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SubscriptionKeyParameterNamesContract if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SubscriptionKeyParameterNamesContract.
     */
    public static SubscriptionKeyParameterNamesContract fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SubscriptionKeyParameterNamesContract deserializedSubscriptionKeyParameterNamesContract
                = new SubscriptionKeyParameterNamesContract();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("header".equals(fieldName)) {
                    deserializedSubscriptionKeyParameterNamesContract.headerProperty = reader.getString();
                } else if ("query".equals(fieldName)) {
                    deserializedSubscriptionKeyParameterNamesContract.query = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSubscriptionKeyParameterNamesContract;
        });
    }
}
