// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.devtestlabs.fluent.models.SecretInner;
import java.io.IOException;
import java.util.List;

/**
 * The response of a list operation.
 */
@Fluent
public final class SecretList implements JsonSerializable<SecretList> {
    /*
     * Results of the list operation.
     */
    private List<SecretInner> value;

    /*
     * Link for next set of results.
     */
    private String nextLink;

    /**
     * Creates an instance of SecretList class.
     */
    public SecretList() {
    }

    /**
     * Get the value property: Results of the list operation.
     * 
     * @return the value value.
     */
    public List<SecretInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Results of the list operation.
     * 
     * @param value the value value to set.
     * @return the SecretList object itself.
     */
    public SecretList withValue(List<SecretInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Link for next set of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Link for next set of results.
     * 
     * @param nextLink the nextLink value to set.
     * @return the SecretList object itself.
     */
    public SecretList withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SecretList from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SecretList if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the SecretList.
     */
    public static SecretList fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SecretList deserializedSecretList = new SecretList();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<SecretInner> value = reader.readArray(reader1 -> SecretInner.fromJson(reader1));
                    deserializedSecretList.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedSecretList.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSecretList;
        });
    }
}
