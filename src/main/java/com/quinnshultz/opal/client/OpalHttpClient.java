/*
 * Copyright (c) 2013 Cosmin Stejerean, Karl Heinz Marbaise, and contributors from the Jenkins Java API client project.
 * Copyright (c) 2019 Quinn Shultz
 *
 * Distributed under the MIT license: http://opensource.org/licenses/MIT
 */
package com.quinnshultz.opal.client;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.protocol.HttpContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.quinnshultz.opal.client.validator.HttpResponseValidator;

/**
 * @author Cosmin Stejerean, Karl Heinz Marbaise, Quinn Shultz
 */
public class OpalHttpClient implements OpalHttpConnection {
	
	private final Logger LOGGER = LoggerFactory.getLogger(getClass());
	
	private URI uri;
	private CloseableHttpClient client;
	private HttpContext localContext;
	private HttpResponseValidator httpResponseValidator;
	private ObjectMapper mapper;
	private String context;
	private String opalVersion;
	
	public final static String EMPTY_VERSION = "UNKNOWN";

	/**
	 * Create an authenticated Opal HTTP client
	 * 
	 * @param uri Location of the opal server (ex. http://localhost:8080)
	 * @param username Username to use when connecting
	 * @param password Password or auth token to use when connecting
	 */
	public OpalHttpClient(URI uri, String username, String password) {
		this(uri, HttpClientBuilder.create(), username, password);
	}
	
	/**
     * Create an authenticated Opal HTTP client
     *
     * @param uri Location of the opal server (ex. http://localhost:8080)
     * @param builder Configured HttpClientBuilder to be used
     * @param username Username to use when connecting
     * @param password Password or auth token to use when connecting
     */
	public OpalHttpClient(URI uri, HttpClientBuilder buider, String username, String password) {
		
	}
	
	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String get(String path) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InputStream getFile(URI path) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

}
