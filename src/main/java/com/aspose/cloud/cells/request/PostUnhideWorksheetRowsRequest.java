/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PostUnhideWorksheetRowsRequest.java">
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

public class PostUnhideWorksheetRowsRequest  implements IRequestModel {

    private String name;
    private String sheetName;
    private Integer startrow;
    private Integer totalRows;
    private Double height;
    private String folder;
    private String storageName;
        public PostUnhideWorksheetRowsRequest()
        {

        }
        public PostUnhideWorksheetRowsRequest(String name, String sheetName, Integer startrow, Integer totalRows, Double height, String folder, String storageName) {
            this.name = name;
            this.sheetName = sheetName;
            this.startrow = startrow;
            this.totalRows = totalRows;
            this.height = height;
            this.folder = folder;
            this.storageName = storageName;
        }   

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }


        public String getSheetName() {
            return sheetName;
        }

        public void setSheetName(String sheetName) {
            this.sheetName = sheetName;
        }


        public Integer getStartrow() {
            return startrow;
        }

        public void setStartrow(Integer startrow) {
            this.startrow = startrow;
        }


        public Integer getTotalRows() {
            return totalRows;
        }

        public void setTotalRows(Integer totalRows) {
            this.totalRows = totalRows;
        }


        public Double getHeight() {
            return height;
        }

        public void setHeight(Double height) {
            this.height = height;
        }


        public String getFolder() {
            return folder;
        }

        public void setFolder(String folder) {
            this.folder = folder;
        }


        public String getStorageName() {
            return storageName;
        }

        public void setStorageName(String storageName) {
            this.storageName = storageName;
        }

    @Override
    public Call buildHttpRequest(ApiClient apiClient, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener, Boolean addAuthHeaders) throws ApiException {
         if (getName() == null) {
                    throw new ApiException("Missing the required parameter 'Name' when calling PostUnhideWorksheetRows");
                } 
                if (getSheetName() == null) {
                    throw new ApiException("Missing the required parameter 'SheetName' when calling PostUnhideWorksheetRows");
                } 
                if (getStartrow() == null) {
                    throw new ApiException("Missing the required parameter 'Startrow' when calling PostUnhideWorksheetRows");
                } 
                if (getTotalRows() == null) {
                    throw new ApiException("Missing the required parameter 'TotalRows' when calling PostUnhideWorksheetRows");
                }       
        String localVarPath = "/cells/{name}/worksheets/{sheetName}/cells/rows/unhide".replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString())) 
    .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))   ;
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
            if (getStartrow() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "startrow", getStartrow()));
            } 
            if (getTotalRows() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "totalRows", getTotalRows()));
            } 
            if (getHeight() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "height", getHeight()));
            } 
            if (getFolder() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", getFolder()));
            } 
            if (getStorageName() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", getStorageName()));
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

