// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob.models;

/**
 * The blob legal hold result.
 */
public interface BlobLegalHoldResult {
    /**
     * Gets whether a legal hold is enabled on the blob.
     *
     * @return whether a legal hold is enabled on the blob.
     */
    boolean hasLegalHold();
}
