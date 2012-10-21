package com.harlap.test.http;

/**
 * Responsible for building forwarding http requests. Builds a new request based on input request.
 * 
 * @author kristof
 */
public interface ForwardHttpRequestBuilder {

    /**
     * Builds a forward request for given input request.
     * 
     * @param request Http request.
     * @return New forward request or <code>null</code> in case we don't know how to build forward request for given input
     *         request.
     */
    FullHttpRequest getForwardRequest(final FullHttpRequest request);

}
