/*
 * Copyright (c) 2002-2024, City of Paris
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  1. Redistributions of source code must retain the above copyright notice
 *     and the following disclaimer.
 *
 *  2. Redistributions in binary form must reproduce the above copyright notice
 *     and the following disclaimer in the documentation and/or other materials
 *     provided with the distribution.
 *
 *  3. Neither the name of 'Mairie de Paris' nor 'Lutece' nor the names of its
 *     contributors may be used to endorse or promote products derived from
 *     this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 * License 1.0
 */
package fr.paris.lutece.plugins.notificationstore.v1.web.service;

import java.util.Map;

/**
 * IHttpTransportProvider
 */
public interface IHttpTransportProvider
{
    /**
     * make a Get request on given url with parameters
     * 
     * @param strEndPointUrl
     *            url
     * @param mapParams
     *            mapParams
     * @param mapHeadersRequest
     *            request header
     * @return response list
     */
    String doGet( String strEndPointUrl, Map<String, String> mapParams, Map<String, String> mapHeadersRequest );
    
    /**
     * make POST request on given url with params and headers
     * 
     * @param strUrl
     *            url to call
     * @param mapParams
     *            params to post
     * @param mapHeadersRequest
     *            headers of the request
     * @return response body as String
     */
    String doPost( String strEndPointUrl, Map<String, String> mapParams, Map<String, String> mapHeadersRequest );

    /**
     * make POST JSON request on given url with json and headers
     * 
     * @param strUrl
     *            url to call
     * @param json
     *            json
     * @param mapHeadersRequest
     *            headers of the request
     * @return response body as String
     */
    String doPostJson( String strEndPointUrl, String json, Map<String, String> mapHeadersRequest );
    
    /**
     * make Put request on given url with params and headers
     * 
     * @param strUrl
     *            url to call
     * @param mapParams
     *            params to post
     * @param mapHeadersRequest
     *            headers of the request
     * @return response body as String
     */
    String doPut( String strEndPointUrl, Map<String, String> mapParams, Map<String, String> mapHeadersRequest );
    
    /**
     * make Put json request on given url with Json and headers
     * 
     * @param strUrl
     *            url to call
     * @param json
     *            json
     * @param mapHeadersRequest
     *            headers of the request
     * @return response body as String
     */
    String doPutJson( String strEndPointUrl, String json, Map<String, String> mapHeadersRequest );
    
    /**
     * set end point
     * 
     * @param strApiEndPointUrl
     */
    public void setApiEndPointUrl( String strApiEndPointUrl );

    /**
     * get end point
     * 
     * @return strEndPointUrl
     */
    public String getApiEndPointUrl( );

    /**
     * make a DELETE request on given url with parameters
     * 
     * @param strEndPointUrl
     *            url
     * @param mapParams
     *            mapParams
     * @param mapHeadersRequest
     *            request header
     * @return response list
     */
    public String doDelete( String strEndPointUrl, Map<String, String> mapHeadersRequest );
}
