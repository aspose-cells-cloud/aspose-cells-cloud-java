/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="SplitTextRequest.java">
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

public class SplitTextRequest  implements IRequestModel {
    private HashMap<String,String> extendQueryParameterMap;
    public HashMap<String,String> getExtendQueryParameterMap() {
        return this.extendQueryParameterMap;
    }

    public void setExtendQueryParameterMap( HashMap<String,String>  extendQueryParameterMap) {
        this.extendQueryParameterMap = extendQueryParameterMap;
    }
    private String splitDelimitersType;
    private String customDelimiter;
    private Boolean keepDelimitersInResultingCells;
    private String keepDelimitersPosition;
    private String howToSplit;
    private String worksheet;
    private String range;
    private String outPath;
    private String outStorageName;
    private String region;
    private String password;
    
     
     
     private String spreadsheet;            
        public SplitTextRequest()
        {        
        }
        public SplitTextRequest( String  spreadsheet    ,  String splitDelimitersType ,  String customDelimiter ,  Boolean keepDelimitersInResultingCells ,  String keepDelimitersPosition ,  String howToSplit ,  String worksheet ,  String range ,  String outPath ,  String outStorageName ,  String region ,  String password ) {
              this.spreadsheet  = spreadsheet;  
            this.splitDelimitersType = splitDelimitersType; 
            this.customDelimiter = customDelimiter; 
            this.keepDelimitersInResultingCells = keepDelimitersInResultingCells; 
            this.keepDelimitersPosition = keepDelimitersPosition; 
            this.howToSplit = howToSplit; 
            this.worksheet = worksheet; 
            this.range = range; 
            this.outPath = outPath; 
            this.outStorageName = outStorageName; 
            this.region = region; 
            this.password = password; 
        }   

        public String getSplitDelimitersType() {
            return this.splitDelimitersType;
        }

        public void setSplitDelimitersType(String splitDelimitersType) {
            this.splitDelimitersType = splitDelimitersType;
        }


        public String getCustomDelimiter() {
            return this.customDelimiter;
        }

        public void setCustomDelimiter(String customDelimiter) {
            this.customDelimiter = customDelimiter;
        }


        public Boolean getKeepDelimitersInResultingCells() {
            return this.keepDelimitersInResultingCells;
        }

        public void setKeepDelimitersInResultingCells(Boolean keepDelimitersInResultingCells) {
            this.keepDelimitersInResultingCells = keepDelimitersInResultingCells;
        }


        public String getKeepDelimitersPosition() {
            return this.keepDelimitersPosition;
        }

        public void setKeepDelimitersPosition(String keepDelimitersPosition) {
            this.keepDelimitersPosition = keepDelimitersPosition;
        }


        public String getHowToSplit() {
            return this.howToSplit;
        }

        public void setHowToSplit(String howToSplit) {
            this.howToSplit = howToSplit;
        }


        public String getWorksheet() {
            return this.worksheet;
        }

        public void setWorksheet(String worksheet) {
            this.worksheet = worksheet;
        }


        public String getRange() {
            return this.range;
        }

        public void setRange(String range) {
            this.range = range;
        }


        public String getOutPath() {
            return this.outPath;
        }

        public void setOutPath(String outPath) {
            this.outPath = outPath;
        }


        public String getOutStorageName() {
            return this.outStorageName;
        }

        public void setOutStorageName(String outStorageName) {
            this.outStorageName = outStorageName;
        }


        public String getRegion() {
            return this.region;
        }

        public void setRegion(String region) {
            this.region = region;
        }


        public String getPassword() {
            return this.password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

    
     
            public String getSpreadsheet() {
                    return this.spreadsheet;
            }
            public void setSpreadsheet(String spreadsheet) {
                this.spreadsheet = spreadsheet;
            }
         
        
    @Override
    public Call buildHttpRequest(ApiClient apiClient, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener, Boolean addAuthHeaders) throws ApiException {
          
         
                if ( getSpreadsheet() == null ) {
                    throw new ApiException("Missing the required parameter 'Spreadsheet' when calling SplitText");
                } 

                if (getSplitDelimitersType() == null) {
                    throw new ApiException("Missing the required parameter 'SplitDelimitersType' when calling SplitText");
                } 

                if (getCustomDelimiter() == null) {
                    throw new ApiException("Missing the required parameter 'CustomDelimiter' when calling SplitText");
                } 

                if (getKeepDelimitersInResultingCells() == null) {
                    throw new ApiException("Missing the required parameter 'KeepDelimitersInResultingCells' when calling SplitText");
                } 

                if (getKeepDelimitersPosition() == null) {
                    throw new ApiException("Missing the required parameter 'KeepDelimitersPosition' when calling SplitText");
                } 

                if (getHowToSplit() == null) {
                    throw new ApiException("Missing the required parameter 'HowToSplit' when calling SplitText");
                }       
        String localVarPath = "v4.0/cells/content/split/text";
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
            if (getSplitDelimitersType() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "splitDelimitersType", getSplitDelimitersType()));
            } 
            if (getCustomDelimiter() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "customDelimiter", getCustomDelimiter()));
            } 
            if (getKeepDelimitersInResultingCells() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "keepDelimitersInResultingCells", getKeepDelimitersInResultingCells()));
            } 
            if (getKeepDelimitersPosition() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "keepDelimitersPosition", getKeepDelimitersPosition()));
            } 
            if (getHowToSplit() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "HowToSplit", getHowToSplit()));
            } 
            if (getWorksheet() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "worksheet", getWorksheet()));
            } 
            if (getRange() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "range", getRange()));
            } 
            if (getOutPath() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "outPath", getOutPath()));
            } 
            if (getOutStorageName() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "outStorageName", getOutStorageName()));
            } 
            if (getRegion() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "region", getRegion()));
            } 
            if (getPassword() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "password", getPassword()));
            }  
        if(this.extendQueryParameterMap !=null){
            for (String key :this.extendQueryParameterMap.keySet()) {
                    localVarQueryParams.addAll(apiClient.parameterToPairs("", key, this.extendQueryParameterMap.get(key)));           
            }
        }
                   
            File SpreadsheetToUpload = new File(getSpreadsheet());
            if (SpreadsheetToUpload.exists()) {
                    localVarFormParams.put(SpreadsheetToUpload.getName(), SpreadsheetToUpload);
            }     
                  
        Object localVarPostBody = null;
                final String[] localVarAccepts = {
                    "application/json"
                };
                final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
                if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

                final String[] localVarContentTypes = { "multipart/form-data"  };        
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

