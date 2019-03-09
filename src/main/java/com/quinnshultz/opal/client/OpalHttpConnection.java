/*
 * Copyright (c) 2019 Dell Green and Quinn Shultz
 *
 * Distributed under the MIT license: http://opensource.org/licenses/MIT
 */
package com.quinnshultz.opal.client;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;

/**
 * @author Dell Green, Quinn Shultz
 */
public interface OpalHttpConnection extends Closeable {

	@Override
	public void close();
	
	/**
     * Perform a GET request and parse the response and return a simple string
     * of the content
     *
     * @param path path to request, can be relative or absolute
     * @return the entity text
     * @throws IOException in case of an error.
     */
	String get(String path) throws IOException;
	
	/**
     * Perform a GET request and return the response as InputStream
     *
     * @param path path to request, can be relative or absolute
     * @return the response stream
     * @throws IOException in case of an error.
     */
	InputStream getFile(URI path) throws IOException;
	
}
