/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PostClearObjectsRequest.java">
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

public class PostClearObjectsRequest  implements IRequestModel {
    private HashMap<String,String> extendQueryParameterMap;
    public HashMap<String,String> getExtendQueryParameterMap() {
        return this.extendQueryParameterMap;
    }

    public void setExtendQueryParameterMap( HashMap<String,String>  extendQueryParameterMap) {
        this.extendQueryParameterMap = extendQueryParameterMap;
    }

    private HashMap<String,File> file;
    private String objecttype;
    private String sheetname;
    private String outFormat;
    private String password;
    private Boolean checkExcelRestriction;
        public PostClearObjectsRequest()
        {

        }
        public PostClearObjectsRequest(HashMap<String,File> file, String objecttype, String sheetname, String outFormat, String password, Boolean checkExcelRestriction) {
            this.file = file;
            this.objecttype = objecttype;
            this.sheetname = sheetname;
            this.outFormat = outFormat;
            this.password = password;
            this.checkExcelRestriction = checkExcelRestriction;
        }   

        public HashMap<String,File> getFile() {
            return this.file;
        }

        public void setFile(HashMap<String,File> file) {
            this.file = file;
        }


        public String getObjecttype() {
            return this.objecttype;
        }

        public void setObjecttype(String objecttype) {
            this.objecttype = objecttype;
        }


        public String getSheetname() {
            return this.sheetname;
        }

        public void setSheetname(String sheetname) {
            this.sheetname = sheetname;
        }


        public String getOutFormat() {
            return this.outFormat;
        }

        public void setOutFormat(String outFormat) {
            this.outFormat = outFormat;
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

    @Override
    public Call buildHttpRequest(ApiClient apiClient, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener, Boolean addAuthHeaders) throws ApiException {
         if (getFile() == null) {
                    throw new ApiException("Missing the required parameter 'File' when calling PostClearObjects");
                } 
                if (getObjecttype() == null) {
                    throw new ApiException("Missing the required parameter 'Objecttype' when calling PostClearObjects");
                }       
        String localVarPath = "/cells/clearobjects";
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
            if (getObjecttype() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "objecttype", getObjecttype()));
            } 
            if (getSheetname() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "sheetname", getSheetname()));
            } 
            if (getOutFormat() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "outFormat", getOutFormat()));
            } 
            if (getPassword() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "password", getPassword()));
            } 
            if (getCheckExcelRestriction() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "checkExcelRestriction", getCheckExcelRestriction()));
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

