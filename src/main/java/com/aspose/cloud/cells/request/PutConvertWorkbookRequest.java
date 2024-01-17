/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PutConvertWorkbookRequest.java">
 *   Copyright (c) 2024 Aspose.Cells Cloud
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

public class PutConvertWorkbookRequest  implements IRequestModel {
    private HashMap<String,String> extendQueryParameterMap;
    public HashMap<String,String> getExtendQueryParameterMap() {
        return this.extendQueryParameterMap;
    }

    public void setExtendQueryParameterMap( HashMap<String,String>  extendQueryParameterMap) {
        this.extendQueryParameterMap = extendQueryParameterMap;
    }

    private HashMap<String,File> file;
    private String format;
    private String password;
    private String outPath;
    private String storageName;
    private Boolean checkExcelRestriction;
    private String streamFormat;
    private String region;
    private Boolean pageWideFitOnPerSheet;
    private Boolean pageTallFitOnPerSheet;
        public PutConvertWorkbookRequest()
        {

        }
        public PutConvertWorkbookRequest(HashMap<String,File> file, String format, String password, String outPath, String storageName, Boolean checkExcelRestriction, String streamFormat, String region, Boolean pageWideFitOnPerSheet, Boolean pageTallFitOnPerSheet) {
            this.file = file;
            this.format = format;
            this.password = password;
            this.outPath = outPath;
            this.storageName = storageName;
            this.checkExcelRestriction = checkExcelRestriction;
            this.streamFormat = streamFormat;
            this.region = region;
            this.pageWideFitOnPerSheet = pageWideFitOnPerSheet;
            this.pageTallFitOnPerSheet = pageTallFitOnPerSheet;
        }   

        public HashMap<String,File> getFile() {
            return this.file;
        }

        public void setFile(HashMap<String,File> file) {
            this.file = file;
        }


        public String getFormat() {
            return this.format;
        }

        public void setFormat(String format) {
            this.format = format;
        }


        public String getPassword() {
            return this.password;
        }

        public void setPassword(String password) {
            this.password = password;
        }


        public String getOutPath() {
            return this.outPath;
        }

        public void setOutPath(String outPath) {
            this.outPath = outPath;
        }


        public String getStorageName() {
            return this.storageName;
        }

        public void setStorageName(String storageName) {
            this.storageName = storageName;
        }


        public Boolean getCheckExcelRestriction() {
            return this.checkExcelRestriction;
        }

        public void setCheckExcelRestriction(Boolean checkExcelRestriction) {
            this.checkExcelRestriction = checkExcelRestriction;
        }


        public String getStreamFormat() {
            return this.streamFormat;
        }

        public void setStreamFormat(String streamFormat) {
            this.streamFormat = streamFormat;
        }


        public String getRegion() {
            return this.region;
        }

        public void setRegion(String region) {
            this.region = region;
        }


        public Boolean getPageWideFitOnPerSheet() {
            return this.pageWideFitOnPerSheet;
        }

        public void setPageWideFitOnPerSheet(Boolean pageWideFitOnPerSheet) {
            this.pageWideFitOnPerSheet = pageWideFitOnPerSheet;
        }


        public Boolean getPageTallFitOnPerSheet() {
            return this.pageTallFitOnPerSheet;
        }

        public void setPageTallFitOnPerSheet(Boolean pageTallFitOnPerSheet) {
            this.pageTallFitOnPerSheet = pageTallFitOnPerSheet;
        }

    @Override
    public Call buildHttpRequest(ApiClient apiClient, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener, Boolean addAuthHeaders) throws ApiException {
         if (getFile() == null) {
                    throw new ApiException("Missing the required parameter 'File' when calling PutConvertWorkbook");
                }       
        String localVarPath = "/cells/convert";
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
            if (getFormat() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "format", getFormat()));
            } 
            if (getPassword() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "password", getPassword()));
            } 
            if (getOutPath() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "outPath", getOutPath()));
            } 
            if (getStorageName() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", getStorageName()));
            } 
            if (getCheckExcelRestriction() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "checkExcelRestriction", getCheckExcelRestriction()));
            } 
            if (getStreamFormat() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "streamFormat", getStreamFormat()));
            } 
            if (getRegion() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "region", getRegion()));
            } 
            if (getPageWideFitOnPerSheet() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageWideFitOnPerSheet", getPageWideFitOnPerSheet()));
            } 
            if (getPageTallFitOnPerSheet() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageTallFitOnPerSheet", getPageTallFitOnPerSheet()));
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
                return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);

    }


}

