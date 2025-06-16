/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="GetWorksheetCellsRangeValueRequest.java">
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

public class GetWorksheetCellsRangeValueRequest  implements IRequestModel {
    private HashMap<String,String> extendQueryParameterMap;
    public HashMap<String,String> getExtendQueryParameterMap() {
        return this.extendQueryParameterMap;
    }

    public void setExtendQueryParameterMap( HashMap<String,String>  extendQueryParameterMap) {
        this.extendQueryParameterMap = extendQueryParameterMap;
    }
    private String name;
    private String sheetName;
    private String namerange;
    private Integer firstRow;
    private Integer firstColumn;
    private Integer rowCount;
    private Integer columnCount;
    private String folder;
    private String storageName;
    
        public GetWorksheetCellsRangeValueRequest()
        {        
        }
        public GetWorksheetCellsRangeValueRequest( String name ,  String sheetName ,  String namerange ,  Integer firstRow ,  Integer firstColumn ,  Integer rowCount ,  Integer columnCount ,  String folder ,  String storageName ) {
            this.name = name; 
            this.sheetName = sheetName; 
            this.namerange = namerange; 
            this.firstRow = firstRow; 
            this.firstColumn = firstColumn; 
            this.rowCount = rowCount; 
            this.columnCount = columnCount; 
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

        public String getNamerange() {
            return this.namerange;
        }

        public void setNamerange(String namerange) {
            this.namerange = namerange;
        }


        public Integer getFirstRow() {
            return this.firstRow;
        }

        public void setFirstRow(Integer firstRow) {
            this.firstRow = firstRow;
        }


        public Integer getFirstColumn() {
            return this.firstColumn;
        }

        public void setFirstColumn(Integer firstColumn) {
            this.firstColumn = firstColumn;
        }


        public Integer getRowCount() {
            return this.rowCount;
        }

        public void setRowCount(Integer rowCount) {
            this.rowCount = rowCount;
        }


        public Integer getColumnCount() {
            return this.columnCount;
        }

        public void setColumnCount(Integer columnCount) {
            this.columnCount = columnCount;
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
                    throw new ApiException("Missing the required parameter 'Name' when calling GetWorksheetCellsRangeValue");
                } 

                if (getSheetName() == null) {
                    throw new ApiException("Missing the required parameter 'SheetName' when calling GetWorksheetCellsRangeValue");
                }       
        String localVarPath = "v3.0/cells/{name}/worksheets/{sheetName}/ranges/value".replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString())) 
    .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))   ;
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
            if (getNamerange() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "namerange", getNamerange()));
            } 
            if (getFirstRow() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "firstRow", getFirstRow()));
            } 
            if (getFirstColumn() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "firstColumn", getFirstColumn()));
            } 
            if (getRowCount() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "rowCount", getRowCount()));
            } 
            if (getColumnCount() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "columnCount", getColumnCount()));
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
                return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);

    }
}

