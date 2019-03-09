/*
 * Copyright (c) 2016 Karl Heinz Marbaise
 *
 * Distributed under the MIT license: http://opensource.org/licenses/MIT
 */
package com.quinnshultz.opal.client.validator;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpResponseException;

/**
 * @author Karl Heinz Marbaise
 */
public class HttpResponseValidator {

    public void validateResponse(HttpResponse response) throws HttpResponseException {
        int status = response.getStatusLine().getStatusCode();
        if (status < 200 || status >= 400) {
            throw new HttpResponseException(status, response.getStatusLine().getReasonPhrase());
        }
    }
}