/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PostWorksheetUnmergeRequest.java">
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

public class PostWorksheetUnmergeRequest  implements IRequestModel {
    private HashMap<String,String> extendQueryParameterMap;
    public HashMap<String,String> getExtendQueryParameterMap() {
        return this.extendQueryParameterMap;
    }

    public void setExtendQueryParameterMap( HashMap<String,String>  extendQueryParameterMap) {
        this.extendQueryParameterMap = extendQueryParameterMap;
    }
    private String name;
    private String sheetName;
    private Integer startRow;
    private Integer startColumn;
    private Integer totalRows;
    private Integer totalColumns;
    private String folder;
    private String storageName;
    
        public PostWorksheetUnmergeRequest()
        {        
        }
        public PostWorksheetUnmergeRequest( String name ,  String sheetName ,  Integer startRow ,  Integer startColumn ,  Integer totalRows ,  Integer totalColumns ,  String folder ,  String storageName ) {
            this.name = name; 
            this.sheetName = sheetName; 
            this.startRow = startRow; 
            this.startColumn = startColumn; 
            this.totalRows = totalRows; 
            this.totalColumns = totalColumns; 
            this.folder = folder; 
            this.storageName = storageName; 
        }   

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }


        public String getSheetName() {
            return this.sheetName;
        }

        public void setSheetName(String sheetName) {
            this.sheetName = sheetName;
        }

        public Integer getStartRow() {
            return this.startRow;
        }

        public void setStartRow(Integer startRow) {
            this.startRow = startRow;
        }


        public Integer getStartColumn() {
            return this.startColumn;
        }

        public void setStartColumn(Integer startColumn) {
            this.startColumn = startColumn;
        }


        public Integer getTotalRows() {
            return this.totalRows;
        }

        public void setTotalRows(Integer totalRows) {
            this.totalRows = totalRows;
        }


        public Integer getTotalColumns() {
            return this.totalColumns;
        }

        public void setTotalColumns(Integer totalColumns) {
            this.totalColumns = totalColumns;
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

    
    @Override
    public Call buildHttpRequest(ApiClient apiClient, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener, Boolean addAuthHeaders) throws ApiException {
         
                if (getName() == null) {
                    throw new ApiException("Missing the required parameter 'Name' when calling PostWorksheetUnmerge");
                } 

                if (getSheetName() == null) {
                    throw new ApiException("Missing the required parameter 'SheetName' when calling PostWorksheetUnmerge");
                } 

                if (getStartRow() == null) {
                    throw new ApiException("Missing the required parameter 'StartRow' when calling PostWorksheetUnmerge");
                } 

                if (getStartColumn() == null) {
                    throw new ApiException("Missing the required parameter 'StartColumn' when calling PostWorksheetUnmerge");
                } 

                if (getTotalRows() == null) {
                    throw new ApiException("Missing the required parameter 'TotalRows' when calling PostWorksheetUnmerge");
                } 

                if (getTotalColumns() == null) {
                    throw new ApiException("Missing the required parameter 'TotalColumns' when calling PostWorksheetUnmerge");
                }       
        String localVarPath = "v3.0/cells/{name}/worksheets/{sheetName}/cells/unmerge".replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString())) 
    .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))   ;
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
            if (getStartRow() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "startRow", getStartRow()));
            } 
            if (getStartColumn() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "startColumn", getStartColumn()));
            } 
            if (getTotalRows() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "totalRows", getTotalRows()));
            } 
            if (getTotalColumns() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "totalColumns", getTotalColumns()));
            } 
            if (getFolder() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", getFolder()));
            } 
            if (getStorageName() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", getStorageName()));
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

