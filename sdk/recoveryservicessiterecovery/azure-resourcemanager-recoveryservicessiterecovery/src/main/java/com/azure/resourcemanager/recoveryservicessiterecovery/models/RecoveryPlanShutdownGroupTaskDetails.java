// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * This class represents the recovery plan shutdown group task details.
 */
@Fluent
public final class RecoveryPlanShutdownGroupTaskDetails extends RecoveryPlanGroupTaskDetails {
    /*
     * The type of task details.
     */
    private String instanceType = "RecoveryPlanShutdownGroupTaskDetails";

    /**
     * Creates an instance of RecoveryPlanShutdownGroupTaskDetails class.
     */
    public RecoveryPlanShutdownGroupTaskDetails() {
    }

    /**
     * Get the instanceType property: The type of task details.
     * 
     * @return the instanceType value.
     */
    @Override
    public String instanceType() {
        return this.instanceType;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RecoveryPlanShutdownGroupTaskDetails withName(String name) {
        super.withName(name);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RecoveryPlanShutdownGroupTaskDetails withGroupId(String groupId) {
        super.withGroupId(groupId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RecoveryPlanShutdownGroupTaskDetails withRpGroupType(String rpGroupType) {
        super.withRpGroupType(rpGroupType);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RecoveryPlanShutdownGroupTaskDetails withChildTasks(List<AsrTask> childTasks) {
        super.withChildTasks(childTasks);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (childTasks() != null) {
            childTasks().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("childTasks", childTasks(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("name", name());
        jsonWriter.writeStringField("groupId", groupId());
        jsonWriter.writeStringField("rpGroupType", rpGroupType());
        jsonWriter.writeStringField("instanceType", this.instanceType);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RecoveryPlanShutdownGroupTaskDetails from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RecoveryPlanShutdownGroupTaskDetails if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RecoveryPlanShutdownGroupTaskDetails.
     */
    public static RecoveryPlanShutdownGroupTaskDetails fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RecoveryPlanShutdownGroupTaskDetails deserializedRecoveryPlanShutdownGroupTaskDetails
                = new RecoveryPlanShutdownGroupTaskDetails();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("childTasks".equals(fieldName)) {
                    List<AsrTask> childTasks = reader.readArray(reader1 -> AsrTask.fromJson(reader1));
                    deserializedRecoveryPlanShutdownGroupTaskDetails.withChildTasks(childTasks);
                } else if ("name".equals(fieldName)) {
                    deserializedRecoveryPlanShutdownGroupTaskDetails.withName(reader.getString());
                } else if ("groupId".equals(fieldName)) {
                    deserializedRecoveryPlanShutdownGroupTaskDetails.withGroupId(reader.getString());
                } else if ("rpGroupType".equals(fieldName)) {
                    deserializedRecoveryPlanShutdownGroupTaskDetails.withRpGroupType(reader.getString());
                } else if ("instanceType".equals(fieldName)) {
                    deserializedRecoveryPlanShutdownGroupTaskDetails.instanceType = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRecoveryPlanShutdownGroupTaskDetails;
        });
    }
}
