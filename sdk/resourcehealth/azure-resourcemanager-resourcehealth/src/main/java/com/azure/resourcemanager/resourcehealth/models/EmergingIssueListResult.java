// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcehealth.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.resourcehealth.fluent.models.EmergingIssuesGetResultInner;
import java.io.IOException;
import java.util.List;

/**
 * The list of emerging issues.
 */
@Fluent
public final class EmergingIssueListResult implements JsonSerializable<EmergingIssueListResult> {
    /*
     * The list of emerging issues.
     */
    private List<EmergingIssuesGetResultInner> value;

    /*
     * The link used to get the next page of emerging issues.
     */
    private String nextLink;

    /**
     * Creates an instance of EmergingIssueListResult class.
     */
    public EmergingIssueListResult() {
    }

    /**
     * Get the value property: The list of emerging issues.
     * 
     * @return the value value.
     */
    public List<EmergingIssuesGetResultInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of emerging issues.
     * 
     * @param value the value value to set.
     * @return the EmergingIssueListResult object itself.
     */
    public EmergingIssueListResult withValue(List<EmergingIssuesGetResultInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The link used to get the next page of emerging issues.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link used to get the next page of emerging issues.
     * 
     * @param nextLink the nextLink value to set.
     * @return the EmergingIssueListResult object itself.
     */
    public EmergingIssueListResult withNextLink(String nextLink) {
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
     * Reads an instance of EmergingIssueListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of EmergingIssueListResult if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the EmergingIssueListResult.
     */
    public static EmergingIssueListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            EmergingIssueListResult deserializedEmergingIssueListResult = new EmergingIssueListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<EmergingIssuesGetResultInner> value
                        = reader.readArray(reader1 -> EmergingIssuesGetResultInner.fromJson(reader1));
                    deserializedEmergingIssueListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedEmergingIssueListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedEmergingIssueListResult;
        });
    }
}
