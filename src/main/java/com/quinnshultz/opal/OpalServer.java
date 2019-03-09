/*
 * Copyright (c) 2013 Cosmin Stejerean, Karl Heinz Marbaise, and contributors from the Jenkins Java API client project.
 * Copyright (c) 2019 Quinn Shultz
 *
 * Distributed under the MIT license: http://opensource.org/licenses/MIT
 */
package com.quinnshultz.opal;

import java.io.Closeable;
import java.io.IOException;
import java.net.URI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.quinnshultz.opal.client.OpalHttpConnection;

/**
 * @author Cosmin Stejerean, Karl Heinz Marbaise, Quinn Shultz
 */
public class OpalServer implements Closeable {
	
	private final Logger LOGGER = LoggerFactory.getLogger(getClass());
	
	private final OpalHttpConnection client;
	
	public OpalServer(URI serverUri) {
		client = null; // TODO Initialized client to suppress warnings
	}

	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub
		
	}

}
