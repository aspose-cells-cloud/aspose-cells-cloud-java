/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PostMetadataRequest.java">
 *   Copyright (c) 2023 Aspose.Cells Cloud
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

public class PostMetadataRequest  implements IRequestModel {
    private HashMap<String,String> extendQueryParameterMap;
    public HashMap<String,String> getExtendQueryParameterMap() {
        return this.extendQueryParameterMap;
    }

    public void setExtendQueryParameterMap( HashMap<String,String>  extendQueryParameterMap) {
        this.extendQueryParameterMap = extendQueryParameterMap;
    }

    private HashMap<String,File> file;
    private List<CellsDocumentProperty> cellsDocuments;
    private String password;
    private Boolean checkExcelRestriction;
    private String outFormat;
    private String region;
        public PostMetadataRequest()
        {

        }
        public PostMetadataRequest(HashMap<String,File> file, List<CellsDocumentProperty> cellsDocuments, String password, Boolean checkExcelRestriction, String outFormat, String region) {
            this.file = file;
            this.cellsDocuments = cellsDocuments;
            this.password = password;
            this.checkExcelRestriction = checkExcelRestriction;
            this.outFormat = outFormat;
            this.region = region;
        }   

        public HashMap<String,File> getFile() {
            return this.file;
        }

        public void setFile(HashMap<String,File> file) {
            this.file = file;
        }


        public List<CellsDocumentProperty> getCellsDocuments() {
            return this.cellsDocuments;
        }

        public void setCellsDocuments(List<CellsDocumentProperty> cellsDocuments) {
            this.cellsDocuments = cellsDocuments;
        }


        public String getPassword() {
            return this.password;
        }

        public void setPassword(String password) {
            this.password = password;
        }


        public Boolean getCheckExcelRestriction() {
            return this.checkExcelRestriction;
        }

        public void setCheckExcelRestriction(Boolean checkExcelRestriction) {
            this.checkExcelRestriction = checkExcelRestriction;
        }


        public String getOutFormat() {
            return this.outFormat;
        }

        public void setOutFormat(String outFormat) {
            this.outFormat = outFormat;
        }


        public String getRegion() {
            return this.region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

    @Override
    public Call buildHttpRequest(ApiClient apiClient, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener, Boolean addAuthHeaders) throws ApiException {
         if (getFile() == null) {
                    throw new ApiException("Missing the required parameter 'File' when calling PostMetadata");
                } 
                if (getCellsDocuments() == null) {
                    throw new ApiException("Missing the required parameter 'CellsDocuments' when calling PostMetadata");
                }       
        String localVarPath = "/cells/metadata/update";
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
            if (getPassword() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "password", getPassword()));
            } 
            if (getCheckExcelRestriction() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "checkExcelRestriction", getCheckExcelRestriction()));
            } 
            if (getOutFormat() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "outFormat", getOutFormat()));
            } 
            if (getRegion() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "region", getRegion()));
            }  
        if(this.extendQueryParameterMap !=null){
            for (String key :this.extendQueryParameterMap.keySet()) {
                    localVarQueryParams.addAll(apiClient.parameterToPairs("", key, this.extendQueryParameterMap.get(key)));           
            }
        }
                   
                if (getFile() != null){
                    for (String key : getFile().keySet()) {
                        localVarFormParams.put(key,getFile().get(key));                
                    }
                }      
        Object localVarPostBody = null;
        localVarFormParams.put("cellsDocuments", apiClient.getJSON().serialize(getCellsDocuments()));                
                final String[] localVarAccepts = {
                    "application/json"
                };
                final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
                if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

                final String[] localVarContentTypes = { "application/json" };
                if(getFile() != null){
                   localVarContentTypes[0] =  "multipart/form-data";
                }
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

