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
import org.apache.http.protocol.HttpContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Cosmin Stejerean, Karl Heinz Marbaise, Quinn Shultz
 */
public class OpalHttpClient implements OpalHttpConnection {
	
	private final Logger LOGGER = LoggerFactory.getLogger(getClass());
	
	private URI uri;
	private CloseableHttpClient client;
	private HttpContext localContext;

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
