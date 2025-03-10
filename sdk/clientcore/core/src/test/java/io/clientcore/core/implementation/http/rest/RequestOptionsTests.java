// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package io.clientcore.core.implementation.http.rest;

import io.clientcore.core.http.models.HttpHeader;
import io.clientcore.core.http.models.HttpHeaderName;
import io.clientcore.core.http.models.HttpHeaders;
import io.clientcore.core.http.models.HttpMethod;
import io.clientcore.core.http.models.HttpRequest;
import io.clientcore.core.http.models.RequestOptions;
import io.clientcore.core.models.binarydata.BinaryData;
import org.junit.jupiter.api.Test;

import java.net.URI;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RequestOptionsTests {
    private static final HttpHeaderName X_MS_FOO = HttpHeaderName.fromString("x-ms-foo");

    @Test
    public void addQueryParam() {
        final HttpRequest request
            = new HttpRequest().setMethod(HttpMethod.POST).setUri(URI.create("http://request.uri"));

        RequestOptions options = new RequestOptions().addQueryParam("foo", "bar").addQueryParam("$skipToken", "1");

        options.getRequestCallback().accept(request);

        assertTrue(request.getUri().toString().contains("?foo=bar&%24skipToken=1"));
    }

    @Test
    public void addHeader() {
        final HttpRequest request
            = new HttpRequest().setMethod(HttpMethod.POST).setUri(URI.create("http://request.uri"));

        RequestOptions options = new RequestOptions().addHeader(new HttpHeader(X_MS_FOO, "bar"))
            .addHeader(new HttpHeader(HttpHeaderName.CONTENT_TYPE, "application/json"));
        options.getRequestCallback().accept(request);

        HttpHeaders headers = request.getHeaders();
        assertEquals("bar", headers.getValue(X_MS_FOO));
        assertEquals("application/json", headers.getValue(HttpHeaderName.CONTENT_TYPE));
    }

    @Test
    public void setBody() {
        final HttpRequest request
            = new HttpRequest().setMethod(HttpMethod.POST).setUri(URI.create("http://request.uri"));

        String expected = "{\"id\":\"123\"}";

        BinaryData requestBody = BinaryData.fromString(expected);
        RequestOptions options = new RequestOptions().setBody(requestBody);
        options.getRequestCallback().accept(request);
        BinaryData actual = request.getBody();

        assertSame(requestBody, actual);
        assertEquals(expected, actual.toString());
    }

    @Test
    public void addRequestCallback() {
        final HttpRequest request
            = new HttpRequest().setMethod(HttpMethod.POST).setUri(URI.create("http://request.uri"));

        RequestOptions options = new RequestOptions().addHeader(new HttpHeader(X_MS_FOO, "bar"))
            .addRequestCallback(r -> r.setMethod(HttpMethod.GET))
            .addRequestCallback(r -> r.setUri("https://request.uri"))
            .addQueryParam("$skipToken", "1")
            .addRequestCallback(r -> r.getHeaders().set(X_MS_FOO, "baz"));

        options.getRequestCallback().accept(request);

        HttpHeaders headers = request.getHeaders();
        assertEquals("baz", headers.getValue(X_MS_FOO));
        assertEquals(HttpMethod.GET, request.getHttpMethod());
        assertEquals("https://request.uri?%24skipToken=1", request.getUri().toString());
    }
}
