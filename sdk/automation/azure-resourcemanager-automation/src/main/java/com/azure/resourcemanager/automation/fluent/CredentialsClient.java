// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.automation.fluent.models.CredentialInner;
import com.azure.resourcemanager.automation.models.CredentialCreateOrUpdateParameters;
import com.azure.resourcemanager.automation.models.CredentialUpdateParameters;

/**
 * An instance of this class provides access to all the operations defined in CredentialsClient.
 */
public interface CredentialsClient {
    /**
     * Delete the credential.
     * 
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param credentialName The name of credential.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String automationAccountName, String credentialName,
        Context context);

    /**
     * Delete the credential.
     * 
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param credentialName The name of credential.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String automationAccountName, String credentialName);

    /**
     * Retrieve the credential identified by credential name.
     * 
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param credentialName The name of credential.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the credential along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CredentialInner> getWithResponse(String resourceGroupName, String automationAccountName,
        String credentialName, Context context);

    /**
     * Retrieve the credential identified by credential name.
     * 
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param credentialName The name of credential.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the credential.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CredentialInner get(String resourceGroupName, String automationAccountName, String credentialName);

    /**
     * Create a credential.
     * 
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param credentialName The parameters supplied to the create or update credential operation.
     * @param parameters The parameters supplied to the create or update credential operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the credential along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CredentialInner> createOrUpdateWithResponse(String resourceGroupName, String automationAccountName,
        String credentialName, CredentialCreateOrUpdateParameters parameters, Context context);

    /**
     * Create a credential.
     * 
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param credentialName The parameters supplied to the create or update credential operation.
     * @param parameters The parameters supplied to the create or update credential operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the credential.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CredentialInner createOrUpdate(String resourceGroupName, String automationAccountName, String credentialName,
        CredentialCreateOrUpdateParameters parameters);

    /**
     * Update a credential.
     * 
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param credentialName The parameters supplied to the Update credential operation.
     * @param parameters The parameters supplied to the Update credential operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the credential along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CredentialInner> updateWithResponse(String resourceGroupName, String automationAccountName,
        String credentialName, CredentialUpdateParameters parameters, Context context);

    /**
     * Update a credential.
     * 
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param credentialName The parameters supplied to the Update credential operation.
     * @param parameters The parameters supplied to the Update credential operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the credential.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CredentialInner update(String resourceGroupName, String automationAccountName, String credentialName,
        CredentialUpdateParameters parameters);

    /**
     * Retrieve a list of credentials.
     * 
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for the list credential operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CredentialInner> listByAutomationAccount(String resourceGroupName, String automationAccountName);

    /**
     * Retrieve a list of credentials.
     * 
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for the list credential operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CredentialInner> listByAutomationAccount(String resourceGroupName, String automationAccountName,
        Context context);
}
