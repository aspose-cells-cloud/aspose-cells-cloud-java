/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PostWorkbookSplitRequest.java">
 *   Copyright (c) 2025 Aspose.Cells Cloud
 * </copyright>
 * <summary>
 *   Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 * 
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 * 
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------
 */
package com.aspose.cloud.cells.request;
import com.aspose.cloud.cells.client.*;
import com.aspose.cloud.cells.model.*;
import com.squareup.okhttp.*;
import java.io.*;
import java.lang.reflect.Type;
import java.util.*;

public class PostWorkbookSplitRequest  implements IRequestModel {
    private HashMap<String,String> extendQueryParameterMap;
    public HashMap<String,String> getExtendQueryParameterMap() {
        return this.extendQueryParameterMap;
    }

    public void setExtendQueryParameterMap( HashMap<String,String>  extendQueryParameterMap) {
        this.extendQueryParameterMap = extendQueryParameterMap;
    }
    private String name;
    private String format;
    private String outFolder;
    private Integer from;
    private Integer to;
    private Integer horizontalResolution;
    private Integer verticalResolution;
    private String splitNameRule;
    private String folder;
    private String storageName;
    private String outStorageName;
    
        public PostWorkbookSplitRequest()
        {        
        }
        public PostWorkbookSplitRequest( String name ,  String format ,  String outFolder ,  Integer from ,  Integer to ,  Integer horizontalResolution ,  Integer verticalResolution ,  String splitNameRule ,  String folder ,  String storageName ,  String outStorageName ) {
            this.name = name; 
            this.format = format; 
            this.outFolder = outFolder; 
            this.from = from; 
            this.to = to; 
            this.horizontalResolution = horizontalResolution; 
            this.verticalResolution = verticalResolution; 
            this.splitNameRule = splitNameRule; 
            this.folder = folder; 
            this.storageName = storageName; 
            this.outStorageName = outStorageName; 
        }   

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getFormat() {
            return this.format;
        }

        public void setFormat(String format) {
            this.format = format;
        }


        public String getOutFolder() {
            return this.outFolder;
        }

        public void setOutFolder(String outFolder) {
            this.outFolder = outFolder;
        }


        public Integer getFrom() {
            return this.from;
        }

        public void setFrom(Integer from) {
            this.from = from;
        }


        public Integer getTo() {
            return this.to;
        }

        public void setTo(Integer to) {
            this.to = to;
        }


        public Integer getHorizontalResolution() {
            return this.horizontalResolution;
        }

        public void setHorizontalResolution(Integer horizontalResolution) {
            this.horizontalResolution = horizontalResolution;
        }


        public Integer getVerticalResolution() {
            return this.verticalResolution;
        }

        public void setVerticalResolution(Integer verticalResolution) {
            this.verticalResolution = verticalResolution;
        }


        public String getSplitNameRule() {
            return this.splitNameRule;
        }

        public void setSplitNameRule(String splitNameRule) {
            this.splitNameRule = splitNameRule;
        }


        public String getFolder() {
            return this.folder;
        }

        public void setFolder(String folder) {
            this.folder = folder;
        }


        public String getStorageName() {
            return this.storageName;
        }

        public void setStorageName(String storageName) {
            this.storageName = storageName;
        }


        public String getOutStorageName() {
            return this.outStorageName;
        }

        public void setOutStorageName(String outStorageName) {
            this.outStorageName = outStorageName;
        }

    
    @Override
    public Call buildHttpRequest(ApiClient apiClient, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener, Boolean addAuthHeaders) throws ApiException {
         
                if (getName() == null) {
                    throw new ApiException("Missing the required parameter 'Name' when calling PostWorkbookSplit");
                }       
        String localVarPath = "v3.0/cells/{name}/split".replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))   ;
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
            if (getFormat() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "format", getFormat()));
            } 
            if (getOutFolder() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "outFolder", getOutFolder()));
            } 
            if (getFrom() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", getFrom()));
            } 
            if (getTo() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", getTo()));
            } 
            if (getHorizontalResolution() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "horizontalResolution", getHorizontalResolution()));
            } 
            if (getVerticalResolution() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "verticalResolution", getVerticalResolution()));
            } 
            if (getSplitNameRule() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "splitNameRule", getSplitNameRule()));
            } 
            if (getFolder() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", getFolder()));
            } 
            if (getStorageName() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", getStorageName()));
            } 
            if (getOutStorageName() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "outStorageName", getOutStorageName()));
            }  
        if(this.extendQueryParameterMap !=null){
            for (String key :this.extendQueryParameterMap.keySet()) {
                    localVarQueryParams.addAll(apiClient.parameterToPairs("", key, this.extendQueryParameterMap.get(key)));           
            }
        }
        Object localVarPostBody = null;
                final String[] localVarAccepts = {
                    "application/json"
                };
                final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
                if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

                final String[] localVarContentTypes = { "application/json" };        
                final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
                localVarHeaderParams.put("Content-Type", localVarContentType);

                if(progressListener != null) {
                    apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                        @Override
                        public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                            com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                            return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                            .build();
                        }
                    });
                }

                String[] localVarAuthNames = new String[] {  };
                return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);

    }
}

