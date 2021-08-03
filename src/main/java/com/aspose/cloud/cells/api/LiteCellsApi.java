/* 
 * <summary>
 *  Copyright (c) 2021 Aspose.Cells Cloud
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
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
 */


package com.aspose.cloud.cells.api;

import com.aspose.cloud.cells.client.ApiCallback;
import com.aspose.cloud.cells.client.ApiClient;
import com.aspose.cloud.cells.client.ApiException;
import com.aspose.cloud.cells.client.ApiResponse;
import com.aspose.cloud.cells.client.Configuration;
import com.aspose.cloud.cells.client.Pair;
import com.aspose.cloud.cells.client.ProgressRequestBody;
import com.aspose.cloud.cells.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.aspose.cloud.cells.model.CellsDocumentProperty;
import java.io.File;
import com.aspose.cloud.cells.model.FileInfo;
import com.aspose.cloud.cells.model.FilesResult;
import com.aspose.cloud.cells.model.TextItem;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Iterator;

public class LiteCellsApi {
    private ApiClient apiClient;

    public LiteCellsApi(String clientId, String clientSecret, String Version, String baseURI) throws ApiException {

        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(baseURI.endsWith("/") ? baseURI.substring(0,
                baseURI.length() - 1) : baseURI);
        apiClient.setApiVersion(Version);
        if((clientId == null || clientId.length() == 0) && (clientSecret == null ||clientSecret.length() == 0)){
            apiClient.SetNeedAuth(false);
        }else{
            String accesstoken = apiClient.getAccessToken("client_credentials", clientId, clientSecret, "v3.0");
            apiClient.addDefaultHeader("Authorization", "Bearer " + accesstoken);
        }
        setApiClient(apiClient);
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for deleteMetadata
     * @param file File to upload (required)
     * @param type  (optional, default to all)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteMetadataCall(HashMap<String,File> file, String type, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/cells/metadata/delete";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (type != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (file != null){
            for (String key : file.keySet()) {
                localVarFormParams.put(key,file.get(key));                
            }
        // localVarFormParams.put("File", file);
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
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
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteMetadataValidateBeforeCall(HashMap<String,File> file, String type, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'file' is set
        if (file == null) {
            throw new ApiException("Missing the required parameter 'file' when calling deleteMetadata(Async)");
        }
        
        
        com.squareup.okhttp.Call call = deleteMetadataCall(file, type, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * 
     * @param file File to upload (required)
     * @param type  (optional, default to all)
     * @return FilesResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FilesResult deleteMetadata(HashMap<String,File> file, String type) throws ApiException {
        ApiResponse<FilesResult> resp = deleteMetadataWithHttpInfo(file, type);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param file File to upload (required)
     * @param type  (optional, default to all)
     * @return ApiResponse&lt;FilesResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FilesResult> deleteMetadataWithHttpInfo(HashMap<String,File> file, String type) throws ApiException {
        com.squareup.okhttp.Call call = deleteMetadataValidateBeforeCall(file, type, null, null);
        Type localVarReturnType = new TypeToken<FilesResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param file File to upload (required)
     * @param type  (optional, default to all)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteMetadataAsync(HashMap<String,File> file, String type, final ApiCallback<FilesResult> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteMetadataValidateBeforeCall(file, type, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FilesResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getMetadata
     * @param file File to upload (required)
     * @param type  (optional, default to all)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getMetadataCall(HashMap<String,File> file, String type, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/cells/metadata/get";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (type != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (file != null){
            for (String key : file.keySet()) {
                localVarFormParams.put(key,file.get(key));                
            }
        // localVarFormParams.put("File", file);
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
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
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getMetadataValidateBeforeCall(HashMap<String,File> file, String type, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'file' is set
        if (file == null) {
            throw new ApiException("Missing the required parameter 'file' when calling getMetadata(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getMetadataCall(file, type, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * 
     * @param file File to upload (required)
     * @param type  (optional, default to all)
     * @return List&lt;CellsDocumentProperty&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<CellsDocumentProperty> getMetadata(HashMap<String,File> file, String type) throws ApiException {
        ApiResponse<List<CellsDocumentProperty>> resp = getMetadataWithHttpInfo(file, type);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param file File to upload (required)
     * @param type  (optional, default to all)
     * @return ApiResponse&lt;List&lt;CellsDocumentProperty&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<CellsDocumentProperty>> getMetadataWithHttpInfo(HashMap<String,File> file, String type) throws ApiException {
        com.squareup.okhttp.Call call = getMetadataValidateBeforeCall(file, type, null, null);
        Type localVarReturnType = new TypeToken<List<CellsDocumentProperty>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param file File to upload (required)
     * @param type  (optional, default to all)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getMetadataAsync(HashMap<String,File> file, String type, final ApiCallback<List<CellsDocumentProperty>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getMetadataValidateBeforeCall(file, type, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<CellsDocumentProperty>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postAssemble
     * @param file File to upload (required)
     * @param datasource  (required)
     * @param format  (optional, default to Xlsx)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postAssembleCall(HashMap<String,File> file, String datasource, String format, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/cells/assemble";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (datasource != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "datasource", datasource));
        if (format != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "format", format));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (file != null){
            for (String key : file.keySet()) {
                localVarFormParams.put(key,file.get(key));                
            }
        // localVarFormParams.put("File", file);
        }
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
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
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postAssembleValidateBeforeCall(HashMap<String,File> file, String datasource, String format, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'file' is set
        if (file == null) {
            throw new ApiException("Missing the required parameter 'file' when calling postAssemble(Async)");
        }
        
        // verify the required parameter 'datasource' is set
        if (datasource == null) {
            throw new ApiException("Missing the required parameter 'datasource' when calling postAssemble(Async)");
        }
        
        
        com.squareup.okhttp.Call call = postAssembleCall(file, datasource, format, progressListener, progressRequestListener);
        return call;
        
    }

    /**
     * 
     * 
     * @param file File to upload (required)
     * @param datasource  (required)
     * @param format  (optional, default to Xlsx)
     * @return FilesResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FilesResult postAssemble(HashMap<String,File> file, String datasource, String format) throws ApiException {
        ApiResponse<FilesResult> resp = postAssembleWithHttpInfo(file, datasource, format);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param file File to upload (required)
     * @param datasource  (required)
     * @param format  (optional, default to Xlsx)
     * @return ApiResponse&lt;FilesResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FilesResult> postAssembleWithHttpInfo(HashMap<String,File> file, String datasource, String format) throws ApiException {
        com.squareup.okhttp.Call call = postAssembleValidateBeforeCall(file, datasource, format, null, null);
        Type localVarReturnType = new TypeToken<FilesResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param file File to upload (required)
     * @param datasource  (required)
     * @param format  (optional, default to Xlsx)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postAssembleAsync(HashMap<String,File> file, String datasource, String format, final ApiCallback<FilesResult> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postAssembleValidateBeforeCall(file, datasource, format, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FilesResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postClearObjects
     * @param file File to upload (required)
     * @param objecttype  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postClearObjectsCall(HashMap<String,File> file, String objecttype, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/cells/clearobjects";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (objecttype != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "objecttype", objecttype));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (file != null){
            for (String key : file.keySet()) {
                localVarFormParams.put(key,file.get(key));                
            }
        // localVarFormParams.put("File", file);
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
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
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postClearObjectsValidateBeforeCall(HashMap<String,File> file, String objecttype, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'file' is set
        if (file == null) {
            throw new ApiException("Missing the required parameter 'file' when calling postClearObjects(Async)");
        }
        
        // verify the required parameter 'objecttype' is set
        if (objecttype == null) {
            throw new ApiException("Missing the required parameter 'objecttype' when calling postClearObjects(Async)");
        }
        
        
        com.squareup.okhttp.Call call = postClearObjectsCall(file, objecttype, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * 
     * @param file File to upload (required)
     * @param objecttype  (required)
     * @return FilesResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FilesResult postClearObjects(HashMap<String,File> file, String objecttype) throws ApiException {
        ApiResponse<FilesResult> resp = postClearObjectsWithHttpInfo(file, objecttype);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param file File to upload (required)
     * @param objecttype  (required)
     * @return ApiResponse&lt;FilesResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FilesResult> postClearObjectsWithHttpInfo(HashMap<String,File> file, String objecttype) throws ApiException {
        com.squareup.okhttp.Call call = postClearObjectsValidateBeforeCall(file, objecttype, null, null);
        Type localVarReturnType = new TypeToken<FilesResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param file File to upload (required)
     * @param objecttype  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postClearObjectsAsync(HashMap<String,File> file, String objecttype, final ApiCallback<FilesResult> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postClearObjectsValidateBeforeCall(file, objecttype, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FilesResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postExport
     * @param file File to upload (required)
     * @param objectType  (required)
     * @param format  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postExportCall(HashMap<String,File> file, String objectType, String format, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/cells/export";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (objectType != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "objectType", objectType));
        if (format != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "format", format));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (file != null){
            for (String key : file.keySet()) {
                localVarFormParams.put(key,file.get(key));                
            }
        // localVarFormParams.put("File", file);
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
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
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postExportValidateBeforeCall(HashMap<String,File> file, String objectType, String format, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'file' is set
        if (file == null) {
            throw new ApiException("Missing the required parameter 'file' when calling postExport(Async)");
        }
        
        // verify the required parameter 'objectType' is set
        if (objectType == null) {
            throw new ApiException("Missing the required parameter 'objectType' when calling postExport(Async)");
        }
        
        // verify the required parameter 'format' is set
        if (format == null) {
            throw new ApiException("Missing the required parameter 'format' when calling postExport(Async)");
        }
        
        
        com.squareup.okhttp.Call call = postExportCall(file, objectType, format, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * 
     * @param file File to upload (required)
     * @param objectType  (required)
     * @param format  (required)
     * @return FilesResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FilesResult postExport(HashMap<String,File> file, String objectType, String format) throws ApiException {
        ApiResponse<FilesResult> resp = postExportWithHttpInfo(file, objectType, format);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param file File to upload (required)
     * @param objectType  (required)
     * @param format  (required)
     * @return ApiResponse&lt;FilesResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FilesResult> postExportWithHttpInfo(HashMap<String,File> file, String objectType, String format) throws ApiException {
        com.squareup.okhttp.Call call = postExportValidateBeforeCall(file, objectType, format, null, null);
        Type localVarReturnType = new TypeToken<FilesResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param file File to upload (required)
     * @param objectType  (required)
     * @param format  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postExportAsync(HashMap<String,File> file, String objectType, String format, final ApiCallback<FilesResult> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postExportValidateBeforeCall(file, objectType, format, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FilesResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postMerge
     * @param file File to upload (required)
     * @param format  (optional, default to xlsx)
     * @param mergeToOneSheet  (optional, default to false)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postMergeCall(HashMap<String,File> file, String format, Boolean mergeToOneSheet, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/cells/merge";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (format != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "format", format));
        if (mergeToOneSheet != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "mergeToOneSheet", mergeToOneSheet));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (file != null){
            for (String key : file.keySet()) {
                localVarFormParams.put(key,file.get(key));                
            }
        // localVarFormParams.put("File", file);
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
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
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postMergeValidateBeforeCall(HashMap<String,File> file, String format, Boolean mergeToOneSheet, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'file' is set
        if (file == null) {
            throw new ApiException("Missing the required parameter 'file' when calling postMerge(Async)");
        }
        
        
        com.squareup.okhttp.Call call = postMergeCall(file, format, mergeToOneSheet, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * 
     * @param file File to upload (required)
     * @param format  (optional, default to xlsx)
     * @param mergeToOneSheet  (optional, default to false)
     * @return FileInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FileInfo postMerge(HashMap<String,File> file, String format, Boolean mergeToOneSheet) throws ApiException {
        ApiResponse<FileInfo> resp = postMergeWithHttpInfo(file, format, mergeToOneSheet);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param file File to upload (required)
     * @param format  (optional, default to xlsx)
     * @param mergeToOneSheet  (optional, default to false)
     * @return ApiResponse&lt;FileInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FileInfo> postMergeWithHttpInfo(HashMap<String,File> file, String format, Boolean mergeToOneSheet) throws ApiException {
        com.squareup.okhttp.Call call = postMergeValidateBeforeCall(file, format, mergeToOneSheet, null, null);
        Type localVarReturnType = new TypeToken<FileInfo>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param file File to upload (required)
     * @param format  (optional, default to xlsx)
     * @param mergeToOneSheet  (optional, default to false)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postMergeAsync(HashMap<String,File> file, String format, Boolean mergeToOneSheet, final ApiCallback<FileInfo> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postMergeValidateBeforeCall(file, format, mergeToOneSheet, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FileInfo>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postMetadata
     * @param file File to upload (required)
     * @param documentProperties Cells document property. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postMetadataCall(HashMap<String,File> file, CellsDocumentProperty[] documentProperties, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = documentProperties;
        
        // create path and map variables
        String localVarPath = "/cells/metadata/update";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (file != null){
            for (String key : file.keySet()) {
                localVarFormParams.put(key,file.get(key));                
            }
            if(documentProperties != null){
                localVarFormParams.put("DocumentProperties", apiClient.getJSON().serialize(documentProperties));
            }
        // localVarFormParams.put("File", file);
        }

        final String[] localVarAccepts = {
            "multipart/form-data"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
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
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postMetadataValidateBeforeCall(HashMap<String,File> file, CellsDocumentProperty[] documentProperties, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'file' is set
        if (file == null) {
            throw new ApiException("Missing the required parameter 'file' when calling postMetadata(Async)");
        }
        
        // verify the required parameter 'documentProperties' is set
        if (documentProperties == null) {
            throw new ApiException("Missing the required parameter 'documentProperties' when calling postMetadata(Async)");
        }
        
        
        com.squareup.okhttp.Call call = postMetadataCall(file, documentProperties, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * 
     * @param file File to upload (required)
     * @param documentProperties Cells document property. (required)
     * @return FilesResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FilesResult postMetadata(HashMap<String,File> file, CellsDocumentProperty[] documentProperties) throws ApiException {
        ApiResponse<FilesResult> resp = postMetadataWithHttpInfo(file, documentProperties);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param file File to upload (required)
     * @param documentProperties Cells document property. (required)
     * @return ApiResponse&lt;FilesResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FilesResult> postMetadataWithHttpInfo(HashMap<String,File> file, CellsDocumentProperty[] documentProperties) throws ApiException {
        com.squareup.okhttp.Call call = postMetadataValidateBeforeCall(file, documentProperties, null, null);
        Type localVarReturnType = new TypeToken<FilesResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param file File to upload (required)
     * @param documentProperties Cells document property. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postMetadataAsync(HashMap<String,File> file, CellsDocumentProperty[] documentProperties, final ApiCallback<FilesResult> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postMetadataValidateBeforeCall(file, documentProperties, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FilesResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postProtect
     * @param file File to upload (required)
     * @param password  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postProtectCall(HashMap<String,File> file, String password, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/cells/protect";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (password != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "password", password));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (file != null){
            for (String key : file.keySet()) {
                localVarFormParams.put(key,file.get(key));                
            }
        // localVarFormParams.put("File", file);
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
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
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postProtectValidateBeforeCall(HashMap<String,File> file, String password, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'file' is set
        if (file == null) {
            throw new ApiException("Missing the required parameter 'file' when calling postProtect(Async)");
        }
        
        // verify the required parameter 'password' is set
        if (password == null) {
            throw new ApiException("Missing the required parameter 'password' when calling postProtect(Async)");
        }
        
        
        com.squareup.okhttp.Call call = postProtectCall(file, password, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * 
     * @param file File to upload (required)
     * @param password  (required)
     * @return FilesResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FilesResult postProtect(HashMap<String,File> file, String password) throws ApiException {
        ApiResponse<FilesResult> resp = postProtectWithHttpInfo(file, password);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param file File to upload (required)
     * @param password  (required)
     * @return ApiResponse&lt;FilesResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FilesResult> postProtectWithHttpInfo(HashMap<String,File> file, String password) throws ApiException {
        com.squareup.okhttp.Call call = postProtectValidateBeforeCall(file, password, null, null);
        Type localVarReturnType = new TypeToken<FilesResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param file File to upload (required)
     * @param password  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postProtectAsync(HashMap<String,File> file, String password, final ApiCallback<FilesResult> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postProtectValidateBeforeCall(file, password, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FilesResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
        /**
     * Build call for postSearch
     * @param file File to upload (required)
     * @param text  (required)
     * @param password  (optional)
     * @param sheetname  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postSearchCall(HashMap<String,File> file, String text, String password, String sheetname, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/cells/search";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (text != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "text", text));
        if (password != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "password", password));
        if (sheetname != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sheetname", sheetname));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (file != null){
            for (String key : file.keySet()) {
                localVarFormParams.put(key,file.get(key));                
            }
        // localVarFormParams.put("File", file);
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
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
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postSearchValidateBeforeCall(HashMap<String,File> file, String text, String password, String sheetname, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'file' is set
        if (file == null) {
            throw new ApiException("Missing the required parameter 'file' when calling postSearch(Async)");
        }
        
        // verify the required parameter 'text' is set
        if (text == null) {
            throw new ApiException("Missing the required parameter 'text' when calling postSearch(Async)");
        }
        
        
        com.squareup.okhttp.Call call = postSearchCall(file, text, password, sheetname,  progressListener, progressRequestListener);
        return call;
       
    }

    /**
     * 
     * 
     * @param file File to upload (required)
     * @param text  (required)
     * @param password  (optional)
     * @param sheetname  (optional)
     * @return List&lt;TextItem&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<TextItem> postSearch(HashMap<String,File> file, String text, String password, String sheetname) throws ApiException {
        ApiResponse<List<TextItem>> resp = postSearchWithHttpInfo(file, text, password, sheetname);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param file File to upload (required)
     * @param text  (required)
     * @param password  (optional)
     * @param sheetname  (optional)
     * @return ApiResponse&lt;List&lt;TextItem&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<TextItem>> postSearchWithHttpInfo(HashMap<String,File> file, String text, String password, String sheetname) throws ApiException {
        com.squareup.okhttp.Call call = postSearchValidateBeforeCall(file, text, password, sheetname,  null, null);
        Type localVarReturnType = new TypeToken<List<TextItem>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param file File to upload (required)
     * @param text  (required)
     * @param password  (optional)
     * @param sheetname  (optional)
     * @param path  (optional)
     * @param storageName  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postSearchAsync(HashMap<String,File> file, String text, String password, String sheetname, final ApiCallback<List<TextItem>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postSearchValidateBeforeCall(file, text, password, sheetname,  progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<TextItem>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for postSplit
     * @param file File to upload (required)
     * @param format  (required)
     * @param password  (optional)
     * @param from  (optional)
     * @param to  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postSplitCall(HashMap<String,File> file, String format, String password, Integer from, Integer to,final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/cells/split";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (format != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "format", format));
        if (password != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "password", password));
        if (from != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
        if (to != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (file != null){
            for (String key : file.keySet()) {
                localVarFormParams.put(key,file.get(key));                
            }
        // localVarFormParams.put("File", file);
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
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
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postSplitValidateBeforeCall(HashMap<String,File> file, String format, String password, Integer from, Integer to,  final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'file' is set
        if (file == null) {
            throw new ApiException("Missing the required parameter 'file' when calling postSplit(Async)");
        }
        
        // verify the required parameter 'format' is set
        if (format == null) {
            throw new ApiException("Missing the required parameter 'format' when calling postSplit(Async)");
        }
        
        
        com.squareup.okhttp.Call call = postSplitCall(file, format, password, from, to, progressListener, progressRequestListener);
        return call;
    }

    /**
     * 
     * 
     * @param file File to upload (required)
     * @param format  (required)
     * @param password  (optional)
     * @param from  (optional)
     * @param to  (optional)
     * @return FilesResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FilesResult postSplit(HashMap<String,File> file, String format, String password, Integer from, Integer to) throws ApiException {
        ApiResponse<FilesResult> resp = postSplitWithHttpInfo(file, format, password, from, to);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param file File to upload (required)
     * @param format  (required)
     * @param password  (optional)
     * @param from  (optional)
     * @param to  (optional)
     * @return ApiResponse&lt;FilesResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FilesResult> postSplitWithHttpInfo(HashMap<String,File> file, String format, String password, Integer from, Integer to) throws ApiException {
        com.squareup.okhttp.Call call = postSplitValidateBeforeCall(file, format, password, from, to,null, null);
        Type localVarReturnType = new TypeToken<FilesResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param file File to upload (required)
     * @param format  (required)
     * @param password  (optional)
     * @param from  (optional)
     * @param to  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postSplitAsync(HashMap<String,File> file, String format, String password, Integer from, Integer to, final ApiCallback<FilesResult> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postSplitValidateBeforeCall(file, format, password, from, to,  progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FilesResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postUnlock
     * @param file File to upload (required)
     * @param password  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postUnlockCall(HashMap<String,File> file, String password, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/cells/unlock";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (password != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "password", password));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (file != null){
            for (String key : file.keySet()) {
                localVarFormParams.put(key,file.get(key));                
            }
        // localVarFormParams.put("File", file);
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
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
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postUnlockValidateBeforeCall(HashMap<String,File> file, String password, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'file' is set
        if (file == null) {
            throw new ApiException("Missing the required parameter 'file' when calling postUnlock(Async)");
        }
        
        // verify the required parameter 'password' is set
        if (password == null) {
            throw new ApiException("Missing the required parameter 'password' when calling postUnlock(Async)");
        }
        
        
        com.squareup.okhttp.Call call = postUnlockCall(file, password, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * 
     * @param file File to upload (required)
     * @param password  (required)
     * @return FilesResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FilesResult postUnlock(HashMap<String,File> file, String password) throws ApiException {
        ApiResponse<FilesResult> resp = postUnlockWithHttpInfo(file, password);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param file File to upload (required)
     * @param password  (required)
     * @return ApiResponse&lt;FilesResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FilesResult> postUnlockWithHttpInfo(HashMap<String,File> file, String password) throws ApiException {
        com.squareup.okhttp.Call call = postUnlockValidateBeforeCall(file, password, null, null);
        Type localVarReturnType = new TypeToken<FilesResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param file File to upload (required)
     * @param password  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postUnlockAsync(HashMap<String,File> file, String password, final ApiCallback<FilesResult> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postUnlockValidateBeforeCall(file, password, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FilesResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postWatermark
     * @param file File to upload (required)
     * @param text  (required)
     * @param color  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postWatermarkCall(HashMap<String,File> file, String text, String color, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/cells/watermark";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (text != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "text", text));
        if (color != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "color", color));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (file != null){
            for (String key : file.keySet()) {
                localVarFormParams.put(key,file.get(key));                
            }
        // localVarFormParams.put("File", file);
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
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
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postWatermarkValidateBeforeCall(HashMap<String,File> file, String text, String color, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'file' is set
        if (file == null) {
            throw new ApiException("Missing the required parameter 'file' when calling postWatermark(Async)");
        }
        
        // verify the required parameter 'text' is set
        if (text == null) {
            throw new ApiException("Missing the required parameter 'text' when calling postWatermark(Async)");
        }
        
        // verify the required parameter 'color' is set
        if (color == null) {
            throw new ApiException("Missing the required parameter 'color' when calling postWatermark(Async)");
        }
        
        
        com.squareup.okhttp.Call call = postWatermarkCall(file, text, color, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * 
     * @param file File to upload (required)
     * @param text  (required)
     * @param color  (required)
     * @return FilesResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FilesResult postWatermark(HashMap<String,File> file, String text, String color) throws ApiException {
        ApiResponse<FilesResult> resp = postWatermarkWithHttpInfo(file, text, color);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param file File to upload (required)
     * @param text  (required)
     * @param color  (required)
     * @return ApiResponse&lt;FilesResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FilesResult> postWatermarkWithHttpInfo(HashMap<String,File> file, String text, String color) throws ApiException {
        com.squareup.okhttp.Call call = postWatermarkValidateBeforeCall(file, text, color, null, null);
        Type localVarReturnType = new TypeToken<FilesResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param file File to upload (required)
     * @param text  (required)
     * @param color  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postWatermarkAsync(HashMap<String,File> file, String text, String color, final ApiCallback<FilesResult> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postWatermarkValidateBeforeCall(file, text, color, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FilesResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
