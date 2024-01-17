/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PutWorksheetFormatConditionConditionRequest.java">
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

public class PutWorksheetFormatConditionConditionRequest  implements IRequestModel {
    private HashMap<String,String> extendQueryParameterMap;
    public HashMap<String,String> getExtendQueryParameterMap() {
        return this.extendQueryParameterMap;
    }

    public void setExtendQueryParameterMap( HashMap<String,String>  extendQueryParameterMap) {
        this.extendQueryParameterMap = extendQueryParameterMap;
    }

    private String name;
    private String sheetName;
    private Integer index;
    private String type;
    private String operatorType;
    private String formula1;
    private String formula2;
    private String folder;
    private String storageName;
        public PutWorksheetFormatConditionConditionRequest()
        {

        }
        public PutWorksheetFormatConditionConditionRequest(String name, String sheetName, Integer index, String type, String operatorType, String formula1, String formula2, String folder, String storageName) {
            this.name = name;
            this.sheetName = sheetName;
            this.index = index;
            this.type = type;
            this.operatorType = operatorType;
            this.formula1 = formula1;
            this.formula2 = formula2;
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


        public Integer getIndex() {
            return this.index;
        }

        public void setIndex(Integer index) {
            this.index = index;
        }


        public String getType() {
            return this.type;
        }

        public void setType(String type) {
            this.type = type;
        }


        public String getOperatorType() {
            return this.operatorType;
        }

        public void setOperatorType(String operatorType) {
            this.operatorType = operatorType;
        }


        public String getFormula1() {
            return this.formula1;
        }

        public void setFormula1(String formula1) {
            this.formula1 = formula1;
        }


        public String getFormula2() {
            return this.formula2;
        }

        public void setFormula2(String formula2) {
            this.formula2 = formula2;
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
                    throw new ApiException("Missing the required parameter 'Name' when calling PutWorksheetFormatConditionCondition");
                } 
                if (getSheetName() == null) {
                    throw new ApiException("Missing the required parameter 'SheetName' when calling PutWorksheetFormatConditionCondition");
                } 
                if (getIndex() == null) {
                    throw new ApiException("Missing the required parameter 'Index' when calling PutWorksheetFormatConditionCondition");
                } 
                if (getType() == null) {
                    throw new ApiException("Missing the required parameter 'Type' when calling PutWorksheetFormatConditionCondition");
                } 
                if (getOperatorType() == null) {
                    throw new ApiException("Missing the required parameter 'OperatorType' when calling PutWorksheetFormatConditionCondition");
                } 
                if (getFormula1() == null) {
                    throw new ApiException("Missing the required parameter 'Formula1' when calling PutWorksheetFormatConditionCondition");
                } 
                if (getFormula2() == null) {
                    throw new ApiException("Missing the required parameter 'Formula2' when calling PutWorksheetFormatConditionCondition");
                }       
        String localVarPath = "/cells/{name}/worksheets/{sheetName}/conditionalFormattings/{index}/condition".replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString())) 
    .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString())) 
    .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(index.toString()))   ;
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
            if (getType() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", getType()));
            } 
            if (getOperatorType() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "operatorType", getOperatorType()));
            } 
            if (getFormula1() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "formula1", getFormula1()));
            } 
            if (getFormula2() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "formula2", getFormula2()));
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
                return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);

    }


}

