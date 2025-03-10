// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Input for the task that gets TDE certificates in Base64 encoded format.
 */
@Fluent
public final class GetTdeCertificatesSqlTaskInput implements JsonSerializable<GetTdeCertificatesSqlTaskInput> {
    /*
     * Connection information for SQL Server
     */
    private SqlConnectionInfo connectionInfo;

    /*
     * Backup file share information for file share to be used for temporarily storing files.
     */
    private FileShare backupFileShare;

    /*
     * List containing certificate names and corresponding password to use for encrypting the exported certificate.
     */
    private List<SelectedCertificateInput> selectedCertificates;

    /**
     * Creates an instance of GetTdeCertificatesSqlTaskInput class.
     */
    public GetTdeCertificatesSqlTaskInput() {
    }

    /**
     * Get the connectionInfo property: Connection information for SQL Server.
     * 
     * @return the connectionInfo value.
     */
    public SqlConnectionInfo connectionInfo() {
        return this.connectionInfo;
    }

    /**
     * Set the connectionInfo property: Connection information for SQL Server.
     * 
     * @param connectionInfo the connectionInfo value to set.
     * @return the GetTdeCertificatesSqlTaskInput object itself.
     */
    public GetTdeCertificatesSqlTaskInput withConnectionInfo(SqlConnectionInfo connectionInfo) {
        this.connectionInfo = connectionInfo;
        return this;
    }

    /**
     * Get the backupFileShare property: Backup file share information for file share to be used for temporarily storing
     * files.
     * 
     * @return the backupFileShare value.
     */
    public FileShare backupFileShare() {
        return this.backupFileShare;
    }

    /**
     * Set the backupFileShare property: Backup file share information for file share to be used for temporarily storing
     * files.
     * 
     * @param backupFileShare the backupFileShare value to set.
     * @return the GetTdeCertificatesSqlTaskInput object itself.
     */
    public GetTdeCertificatesSqlTaskInput withBackupFileShare(FileShare backupFileShare) {
        this.backupFileShare = backupFileShare;
        return this;
    }

    /**
     * Get the selectedCertificates property: List containing certificate names and corresponding password to use for
     * encrypting the exported certificate.
     * 
     * @return the selectedCertificates value.
     */
    public List<SelectedCertificateInput> selectedCertificates() {
        return this.selectedCertificates;
    }

    /**
     * Set the selectedCertificates property: List containing certificate names and corresponding password to use for
     * encrypting the exported certificate.
     * 
     * @param selectedCertificates the selectedCertificates value to set.
     * @return the GetTdeCertificatesSqlTaskInput object itself.
     */
    public GetTdeCertificatesSqlTaskInput
        withSelectedCertificates(List<SelectedCertificateInput> selectedCertificates) {
        this.selectedCertificates = selectedCertificates;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (connectionInfo() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property connectionInfo in model GetTdeCertificatesSqlTaskInput"));
        } else {
            connectionInfo().validate();
        }
        if (backupFileShare() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property backupFileShare in model GetTdeCertificatesSqlTaskInput"));
        } else {
            backupFileShare().validate();
        }
        if (selectedCertificates() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property selectedCertificates in model GetTdeCertificatesSqlTaskInput"));
        } else {
            selectedCertificates().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(GetTdeCertificatesSqlTaskInput.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("connectionInfo", this.connectionInfo);
        jsonWriter.writeJsonField("backupFileShare", this.backupFileShare);
        jsonWriter.writeArrayField("selectedCertificates", this.selectedCertificates,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of GetTdeCertificatesSqlTaskInput from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GetTdeCertificatesSqlTaskInput if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the GetTdeCertificatesSqlTaskInput.
     */
    public static GetTdeCertificatesSqlTaskInput fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GetTdeCertificatesSqlTaskInput deserializedGetTdeCertificatesSqlTaskInput
                = new GetTdeCertificatesSqlTaskInput();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("connectionInfo".equals(fieldName)) {
                    deserializedGetTdeCertificatesSqlTaskInput.connectionInfo = SqlConnectionInfo.fromJson(reader);
                } else if ("backupFileShare".equals(fieldName)) {
                    deserializedGetTdeCertificatesSqlTaskInput.backupFileShare = FileShare.fromJson(reader);
                } else if ("selectedCertificates".equals(fieldName)) {
                    List<SelectedCertificateInput> selectedCertificates
                        = reader.readArray(reader1 -> SelectedCertificateInput.fromJson(reader1));
                    deserializedGetTdeCertificatesSqlTaskInput.selectedCertificates = selectedCertificates;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedGetTdeCertificatesSqlTaskInput;
        });
    }
}
