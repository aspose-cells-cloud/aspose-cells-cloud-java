/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="RemoveCharactersRequest.java">
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

public class RemoveCharactersRequest  implements IRequestModel {
    private HashMap<String,String> extendQueryParameterMap;
    public HashMap<String,String> getExtendQueryParameterMap() {
        return this.extendQueryParameterMap;
    }

    public void setExtendQueryParameterMap( HashMap<String,String>  extendQueryParameterMap) {
        this.extendQueryParameterMap = extendQueryParameterMap;
    }
    private Integer theFirstNCharacters;
    private Integer theLastNCharacters;
    private String allCharactersBeforeText;
    private String allCharactersAfterText;
    private String removeTextMethod;
    private String characterSets;
    private String removeCustomValue;
    private String worksheet;
    private String range;
    private String outPath;
    private String outStorageName;
    private String region;
    private String password;
    
     
     
     private String spreadsheet;            
        public RemoveCharactersRequest()
        {        
        }
        public RemoveCharactersRequest( String  spreadsheet    ,  Integer theFirstNCharacters ,  Integer theLastNCharacters ,  String allCharactersBeforeText ,  String allCharactersAfterText ,  String removeTextMethod ,  String characterSets ,  String removeCustomValue ,  String worksheet ,  String range ,  String outPath ,  String outStorageName ,  String region ,  String password ) {
              this.spreadsheet  = spreadsheet;  
            this.theFirstNCharacters = theFirstNCharacters; 
            this.theLastNCharacters = theLastNCharacters; 
            this.allCharactersBeforeText = allCharactersBeforeText; 
            this.allCharactersAfterText = allCharactersAfterText; 
            this.removeTextMethod = removeTextMethod; 
            this.characterSets = characterSets; 
            this.removeCustomValue = removeCustomValue; 
            this.worksheet = worksheet; 
            this.range = range; 
            this.outPath = outPath; 
            this.outStorageName = outStorageName; 
            this.region = region; 
            this.password = password; 
        }   

        public Integer getTheFirstNCharacters() {
            return this.theFirstNCharacters;
        }

        public void setTheFirstNCharacters(Integer theFirstNCharacters) {
            this.theFirstNCharacters = theFirstNCharacters;
        }


        public Integer getTheLastNCharacters() {
            return this.theLastNCharacters;
        }

        public void setTheLastNCharacters(Integer theLastNCharacters) {
            this.theLastNCharacters = theLastNCharacters;
        }


        public String getAllCharactersBeforeText() {
            return this.allCharactersBeforeText;
        }

        public void setAllCharactersBeforeText(String allCharactersBeforeText) {
            this.allCharactersBeforeText = allCharactersBeforeText;
        }


        public String getAllCharactersAfterText() {
            return this.allCharactersAfterText;
        }

        public void setAllCharactersAfterText(String allCharactersAfterText) {
            this.allCharactersAfterText = allCharactersAfterText;
        }


        public String getRemoveTextMethod() {
            return this.removeTextMethod;
        }

        public void setRemoveTextMethod(String removeTextMethod) {
            this.removeTextMethod = removeTextMethod;
        }


        public String getCharacterSets() {
            return this.characterSets;
        }

        public void setCharacterSets(String characterSets) {
            this.characterSets = characterSets;
        }


        public String getRemoveCustomValue() {
            return this.removeCustomValue;
        }

        public void setRemoveCustomValue(String removeCustomValue) {
            this.removeCustomValue = removeCustomValue;
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
                    throw new ApiException("Missing the required parameter 'Spreadsheet' when calling RemoveCharacters");
                } 

                if (getTheFirstNCharacters() == null) {
                    throw new ApiException("Missing the required parameter 'TheFirstNCharacters' when calling RemoveCharacters");
                } 

                if (getTheLastNCharacters() == null) {
                    throw new ApiException("Missing the required parameter 'TheLastNCharacters' when calling RemoveCharacters");
                } 

                if (getAllCharactersBeforeText() == null) {
                    throw new ApiException("Missing the required parameter 'AllCharactersBeforeText' when calling RemoveCharacters");
                } 

                if (getAllCharactersAfterText() == null) {
                    throw new ApiException("Missing the required parameter 'AllCharactersAfterText' when calling RemoveCharacters");
                } 

                if (getRemoveTextMethod() == null) {
                    throw new ApiException("Missing the required parameter 'RemoveTextMethod' when calling RemoveCharacters");
                } 

                if (getCharacterSets() == null) {
                    throw new ApiException("Missing the required parameter 'CharacterSets' when calling RemoveCharacters");
                } 

                if (getRemoveCustomValue() == null) {
                    throw new ApiException("Missing the required parameter 'RemoveCustomValue' when calling RemoveCharacters");
                } 

                if (getWorksheet() == null) {
                    throw new ApiException("Missing the required parameter 'Worksheet' when calling RemoveCharacters");
                } 

                if (getRange() == null) {
                    throw new ApiException("Missing the required parameter 'Range' when calling RemoveCharacters");
                }       
        String localVarPath = "v4.0/cells/content/remove/characters";
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
            if (getTheFirstNCharacters() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "theFirstNCharacters", getTheFirstNCharacters()));
            } 
            if (getTheLastNCharacters() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "theLastNCharacters", getTheLastNCharacters()));
            } 
            if (getAllCharactersBeforeText() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "allCharactersBeforeText", getAllCharactersBeforeText()));
            } 
            if (getAllCharactersAfterText() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "allCharactersAfterText", getAllCharactersAfterText()));
            } 
            if (getRemoveTextMethod() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "removeTextMethod", getRemoveTextMethod()));
            } 
            if (getCharacterSets() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "characterSets", getCharacterSets()));
            } 
            if (getRemoveCustomValue() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "removeCustomValue", getRemoveCustomValue()));
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

