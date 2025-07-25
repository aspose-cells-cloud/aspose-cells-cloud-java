/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ConvertTableToPdfRequest.java">
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

public class ConvertTableToPdfRequest  implements IRequestModel {
    private HashMap<String,String> extendQueryParameterMap;
    public HashMap<String,String> getExtendQueryParameterMap() {
        return this.extendQueryParameterMap;
    }

    public void setExtendQueryParameterMap( HashMap<String,String>  extendQueryParameterMap) {
        this.extendQueryParameterMap = extendQueryParameterMap;
    }
    private String worksheet;
    private String tableName;
    private String outPath;
    private String outStorageName;
    private String fontsLocation;
    private String regoin;
    private String password;
    
     
     
            private String spreadsheet;
        public ConvertTableToPdfRequest()
        {        
        }
        public ConvertTableToPdfRequest( String  spreadsheet    ,  String worksheet ,  String tableName ,  String outPath ,  String outStorageName ,  String fontsLocation ,  String regoin ,  String password ) {
              this.spreadsheet  = spreadsheet;  
            this.worksheet = worksheet; 
            this.tableName = tableName; 
            this.outPath = outPath; 
            this.outStorageName = outStorageName; 
            this.fontsLocation = fontsLocation; 
            this.regoin = regoin; 
            this.password = password; 
        }   

        public String getWorksheet() {
            return this.worksheet;
        }

        public void setWorksheet(String worksheet) {
            this.worksheet = worksheet;
        }


        public String getTableName() {
            return this.tableName;
        }

        public void setTableName(String tableName) {
            this.tableName = tableName;
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


        public String getFontsLocation() {
            return this.fontsLocation;
        }

        public void setFontsLocation(String fontsLocation) {
            this.fontsLocation = fontsLocation;
        }


        public String getRegoin() {
            return this.regoin;
        }

        public void setRegoin(String regoin) {
            this.regoin = regoin;
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
                    throw new ApiException("Missing the required parameter 'Spreadsheet' when calling ConvertTableToPdf");
                } 

                if (getWorksheet() == null) {
                    throw new ApiException("Missing the required parameter 'Worksheet' when calling ConvertTableToPdf");
                } 

                if (getTableName() == null) {
                    throw new ApiException("Missing the required parameter 'TableName' when calling ConvertTableToPdf");
                }       
        String localVarPath = "v4.0/cells/convert/table/pdf";
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
            if (getWorksheet() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "worksheet", getWorksheet()));
            } 
            if (getTableName() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "tableName", getTableName()));
            } 
            if (getOutPath() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "outPath", getOutPath()));
            } 
            if (getOutStorageName() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "outStorageName", getOutStorageName()));
            } 
            if (getFontsLocation() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "fontsLocation", getFontsLocation()));
            } 
            if (getRegoin() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "regoin", getRegoin()));
            } 
            if (getPassword() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "password", getPassword()));
            }  
        if(this.extendQueryParameterMap !=null){
            for (String key :this.extendQueryParameterMap.keySet()) {
                    localVarQueryParams.addAll(apiClient.parameterToPairs("", key, this.extendQueryParameterMap.get(key)));           
            }
        }
                   
            File fileToUpload = new File(getSpreadsheet());
            if (fileToUpload.exists()) {
                    localVarFormParams.put(fileToUpload.getName(), fileToUpload);
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

