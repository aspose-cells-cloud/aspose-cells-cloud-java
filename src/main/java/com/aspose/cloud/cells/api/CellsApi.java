/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="CellsApi.java">
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

package com.aspose.cloud.cells.api;

import com.aspose.cloud.cells.*;
import com.aspose.cloud.cells.model.*;
import com.aspose.cloud.cells.request.*;
import com.aspose.cloud.cells.client.*;
import com.google.gson.reflect.TypeToken;
import com.squareup.okhttp.Response;
import java.io.IOException;
import javax.crypto.NoSuchPaddingException;

import java.io.File;
import java.lang.reflect.Type;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.*;

public class CellsApi {

    private ApiClient apiClient;

    public CellsApi(String clientId, String clientSecret) throws ApiException {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath("https://api.aspose.cloud");
        apiClient.setApiVersion("v3.0");
        String accesstoken = apiClient.getAccessToken("client_credentials", clientId, clientSecret, "v3.0");
        apiClient.addDefaultHeader("Authorization", "Bearer " + accesstoken);
        this.apiClient = apiClient;
    }

    public CellsApi(String clientId, String clientSecret, String Version, String baseURI) throws ApiException {
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
        this.apiClient = apiClient;
    }

         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postAnalyzeExcelValidateBeforeCall(PostAnalyzeExcelRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  List<AnalyzedResult>  postAnalyzeExcel(PostAnalyzeExcelRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< List<AnalyzedResult> > resp = postAnalyzeExcelWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< List<AnalyzedResult> > resp = postAnalyzeExcelWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< List<AnalyzedResult> > postAnalyzeExcelWithHttpInfo(PostAnalyzeExcelRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postAnalyzeExcelValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< List<AnalyzedResult> >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postAnalyzeExcelAsync( PostAnalyzeExcelRequest request, final ApiCallback< List<AnalyzedResult> > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postAnalyzeExcelValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< List<AnalyzedResult> >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getWorksheetAutoFilterValidateBeforeCall(GetWorksheetAutoFilterRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  AutoFilterResponse  getWorksheetAutoFilter(GetWorksheetAutoFilterRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< AutoFilterResponse > resp = getWorksheetAutoFilterWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< AutoFilterResponse > resp = getWorksheetAutoFilterWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< AutoFilterResponse > getWorksheetAutoFilterWithHttpInfo(GetWorksheetAutoFilterRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getWorksheetAutoFilterValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< AutoFilterResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getWorksheetAutoFilterAsync( GetWorksheetAutoFilterRequest request, final ApiCallback< AutoFilterResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getWorksheetAutoFilterValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< AutoFilterResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call putWorksheetDateFilterValidateBeforeCall(PutWorksheetDateFilterRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  putWorksheetDateFilter(PutWorksheetDateFilterRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = putWorksheetDateFilterWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = putWorksheetDateFilterWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > putWorksheetDateFilterWithHttpInfo(PutWorksheetDateFilterRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  putWorksheetDateFilterValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  putWorksheetDateFilterAsync( PutWorksheetDateFilterRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  putWorksheetDateFilterValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call putWorksheetFilterValidateBeforeCall(PutWorksheetFilterRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  putWorksheetFilter(PutWorksheetFilterRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = putWorksheetFilterWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = putWorksheetFilterWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > putWorksheetFilterWithHttpInfo(PutWorksheetFilterRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  putWorksheetFilterValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  putWorksheetFilterAsync( PutWorksheetFilterRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  putWorksheetFilterValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call putWorksheetIconFilterValidateBeforeCall(PutWorksheetIconFilterRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  putWorksheetIconFilter(PutWorksheetIconFilterRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = putWorksheetIconFilterWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = putWorksheetIconFilterWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > putWorksheetIconFilterWithHttpInfo(PutWorksheetIconFilterRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  putWorksheetIconFilterValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  putWorksheetIconFilterAsync( PutWorksheetIconFilterRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  putWorksheetIconFilterValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call putWorksheetCustomFilterValidateBeforeCall(PutWorksheetCustomFilterRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  putWorksheetCustomFilter(PutWorksheetCustomFilterRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = putWorksheetCustomFilterWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = putWorksheetCustomFilterWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > putWorksheetCustomFilterWithHttpInfo(PutWorksheetCustomFilterRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  putWorksheetCustomFilterValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  putWorksheetCustomFilterAsync( PutWorksheetCustomFilterRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  putWorksheetCustomFilterValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call putWorksheetDynamicFilterValidateBeforeCall(PutWorksheetDynamicFilterRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  putWorksheetDynamicFilter(PutWorksheetDynamicFilterRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = putWorksheetDynamicFilterWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = putWorksheetDynamicFilterWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > putWorksheetDynamicFilterWithHttpInfo(PutWorksheetDynamicFilterRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  putWorksheetDynamicFilterValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  putWorksheetDynamicFilterAsync( PutWorksheetDynamicFilterRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  putWorksheetDynamicFilterValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call putWorksheetFilterTop10ValidateBeforeCall(PutWorksheetFilterTop10Request request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  putWorksheetFilterTop10(PutWorksheetFilterTop10Request request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = putWorksheetFilterTop10WithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = putWorksheetFilterTop10WithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > putWorksheetFilterTop10WithHttpInfo(PutWorksheetFilterTop10Request request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  putWorksheetFilterTop10ValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  putWorksheetFilterTop10Async( PutWorksheetFilterTop10Request request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  putWorksheetFilterTop10ValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call putWorksheetColorFilterValidateBeforeCall(PutWorksheetColorFilterRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  putWorksheetColorFilter(PutWorksheetColorFilterRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = putWorksheetColorFilterWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = putWorksheetColorFilterWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > putWorksheetColorFilterWithHttpInfo(PutWorksheetColorFilterRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  putWorksheetColorFilterValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  putWorksheetColorFilterAsync( PutWorksheetColorFilterRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  putWorksheetColorFilterValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postWorksheetMatchBlanksValidateBeforeCall(PostWorksheetMatchBlanksRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postWorksheetMatchBlanks(PostWorksheetMatchBlanksRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postWorksheetMatchBlanksWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postWorksheetMatchBlanksWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postWorksheetMatchBlanksWithHttpInfo(PostWorksheetMatchBlanksRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postWorksheetMatchBlanksValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postWorksheetMatchBlanksAsync( PostWorksheetMatchBlanksRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postWorksheetMatchBlanksValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postWorksheetMatchNonBlanksValidateBeforeCall(PostWorksheetMatchNonBlanksRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postWorksheetMatchNonBlanks(PostWorksheetMatchNonBlanksRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postWorksheetMatchNonBlanksWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postWorksheetMatchNonBlanksWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postWorksheetMatchNonBlanksWithHttpInfo(PostWorksheetMatchNonBlanksRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postWorksheetMatchNonBlanksValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postWorksheetMatchNonBlanksAsync( PostWorksheetMatchNonBlanksRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postWorksheetMatchNonBlanksValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postWorksheetAutoFilterRefreshValidateBeforeCall(PostWorksheetAutoFilterRefreshRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postWorksheetAutoFilterRefresh(PostWorksheetAutoFilterRefreshRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postWorksheetAutoFilterRefreshWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postWorksheetAutoFilterRefreshWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postWorksheetAutoFilterRefreshWithHttpInfo(PostWorksheetAutoFilterRefreshRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postWorksheetAutoFilterRefreshValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postWorksheetAutoFilterRefreshAsync( PostWorksheetAutoFilterRefreshRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postWorksheetAutoFilterRefreshValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call deleteWorksheetDateFilterValidateBeforeCall(DeleteWorksheetDateFilterRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  deleteWorksheetDateFilter(DeleteWorksheetDateFilterRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = deleteWorksheetDateFilterWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = deleteWorksheetDateFilterWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > deleteWorksheetDateFilterWithHttpInfo(DeleteWorksheetDateFilterRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  deleteWorksheetDateFilterValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  deleteWorksheetDateFilterAsync( DeleteWorksheetDateFilterRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  deleteWorksheetDateFilterValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call deleteWorksheetFilterValidateBeforeCall(DeleteWorksheetFilterRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  deleteWorksheetFilter(DeleteWorksheetFilterRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = deleteWorksheetFilterWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = deleteWorksheetFilterWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > deleteWorksheetFilterWithHttpInfo(DeleteWorksheetFilterRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  deleteWorksheetFilterValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  deleteWorksheetFilterAsync( DeleteWorksheetFilterRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  deleteWorksheetFilterValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getWorksheetAutoshapesValidateBeforeCall(GetWorksheetAutoshapesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  AutoShapesResponse  getWorksheetAutoshapes(GetWorksheetAutoshapesRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< AutoShapesResponse > resp = getWorksheetAutoshapesWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< AutoShapesResponse > resp = getWorksheetAutoshapesWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< AutoShapesResponse > getWorksheetAutoshapesWithHttpInfo(GetWorksheetAutoshapesRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getWorksheetAutoshapesValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< AutoShapesResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getWorksheetAutoshapesAsync( GetWorksheetAutoshapesRequest request, final ApiCallback< AutoShapesResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getWorksheetAutoshapesValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< AutoShapesResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getWorksheetAutoshapeWithFormatValidateBeforeCall(GetWorksheetAutoshapeWithFormatRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  File  getWorksheetAutoshapeWithFormat(GetWorksheetAutoshapeWithFormatRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< File > resp = getWorksheetAutoshapeWithFormatWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< File > resp = getWorksheetAutoshapeWithFormatWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< File > getWorksheetAutoshapeWithFormatWithHttpInfo(GetWorksheetAutoshapeWithFormatRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getWorksheetAutoshapeWithFormatValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< File >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getWorksheetAutoshapeWithFormatAsync( GetWorksheetAutoshapeWithFormatRequest request, final ApiCallback< HashMap<String,File> > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getWorksheetAutoshapeWithFormatValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< HashMap<String,File> >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postBatchConvertValidateBeforeCall(PostBatchConvertRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  File  postBatchConvert(PostBatchConvertRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< File > resp = postBatchConvertWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< File > resp = postBatchConvertWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< File > postBatchConvertWithHttpInfo(PostBatchConvertRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postBatchConvertValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< File >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postBatchConvertAsync( PostBatchConvertRequest request, final ApiCallback< HashMap<String,File> > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postBatchConvertValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< HashMap<String,File> >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postBatchProtectValidateBeforeCall(PostBatchProtectRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  File  postBatchProtect(PostBatchProtectRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< File > resp = postBatchProtectWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< File > resp = postBatchProtectWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< File > postBatchProtectWithHttpInfo(PostBatchProtectRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postBatchProtectValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< File >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postBatchProtectAsync( PostBatchProtectRequest request, final ApiCallback< HashMap<String,File> > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postBatchProtectValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< HashMap<String,File> >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postBatchLockValidateBeforeCall(PostBatchLockRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  File  postBatchLock(PostBatchLockRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< File > resp = postBatchLockWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< File > resp = postBatchLockWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< File > postBatchLockWithHttpInfo(PostBatchLockRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postBatchLockValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< File >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postBatchLockAsync( PostBatchLockRequest request, final ApiCallback< HashMap<String,File> > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postBatchLockValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< HashMap<String,File> >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postBatchUnlockValidateBeforeCall(PostBatchUnlockRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  File  postBatchUnlock(PostBatchUnlockRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< File > resp = postBatchUnlockWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< File > resp = postBatchUnlockWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< File > postBatchUnlockWithHttpInfo(PostBatchUnlockRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postBatchUnlockValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< File >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postBatchUnlockAsync( PostBatchUnlockRequest request, final ApiCallback< HashMap<String,File> > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postBatchUnlockValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< HashMap<String,File> >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postBatchSplitValidateBeforeCall(PostBatchSplitRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  File  postBatchSplit(PostBatchSplitRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< File > resp = postBatchSplitWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< File > resp = postBatchSplitWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< File > postBatchSplitWithHttpInfo(PostBatchSplitRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postBatchSplitValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< File >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postBatchSplitAsync( PostBatchSplitRequest request, final ApiCallback< HashMap<String,File> > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postBatchSplitValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< HashMap<String,File> >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postClearContentsValidateBeforeCall(PostClearContentsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postClearContents(PostClearContentsRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postClearContentsWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postClearContentsWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postClearContentsWithHttpInfo(PostClearContentsRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postClearContentsValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postClearContentsAsync( PostClearContentsRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postClearContentsValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postClearFormatsValidateBeforeCall(PostClearFormatsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postClearFormats(PostClearFormatsRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postClearFormatsWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postClearFormatsWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postClearFormatsWithHttpInfo(PostClearFormatsRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postClearFormatsValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postClearFormatsAsync( PostClearFormatsRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postClearFormatsValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postUpdateWorksheetRangeStyleValidateBeforeCall(PostUpdateWorksheetRangeStyleRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postUpdateWorksheetRangeStyle(PostUpdateWorksheetRangeStyleRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postUpdateWorksheetRangeStyleWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postUpdateWorksheetRangeStyleWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postUpdateWorksheetRangeStyleWithHttpInfo(PostUpdateWorksheetRangeStyleRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postUpdateWorksheetRangeStyleValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postUpdateWorksheetRangeStyleAsync( PostUpdateWorksheetRangeStyleRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postUpdateWorksheetRangeStyleValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postWorksheetMergeValidateBeforeCall(PostWorksheetMergeRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postWorksheetMerge(PostWorksheetMergeRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postWorksheetMergeWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postWorksheetMergeWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postWorksheetMergeWithHttpInfo(PostWorksheetMergeRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postWorksheetMergeValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postWorksheetMergeAsync( PostWorksheetMergeRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postWorksheetMergeValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postWorksheetUnmergeValidateBeforeCall(PostWorksheetUnmergeRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postWorksheetUnmerge(PostWorksheetUnmergeRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postWorksheetUnmergeWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postWorksheetUnmergeWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postWorksheetUnmergeWithHttpInfo(PostWorksheetUnmergeRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postWorksheetUnmergeValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postWorksheetUnmergeAsync( PostWorksheetUnmergeRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postWorksheetUnmergeValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getWorksheetCellsValidateBeforeCall(GetWorksheetCellsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsResponse  getWorksheetCells(GetWorksheetCellsRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsResponse > resp = getWorksheetCellsWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsResponse > resp = getWorksheetCellsWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsResponse > getWorksheetCellsWithHttpInfo(GetWorksheetCellsRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getWorksheetCellsValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getWorksheetCellsAsync( GetWorksheetCellsRequest request, final ApiCallback< CellsResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getWorksheetCellsValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getWorksheetCellValidateBeforeCall(GetWorksheetCellRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  String  getWorksheetCell(GetWorksheetCellRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< String > resp = getWorksheetCellWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< String > resp = getWorksheetCellWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< String > getWorksheetCellWithHttpInfo(GetWorksheetCellRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getWorksheetCellValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< String >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getWorksheetCellAsync( GetWorksheetCellRequest request, final ApiCallback< String > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getWorksheetCellValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< String >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getWorksheetCellStyleValidateBeforeCall(GetWorksheetCellStyleRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  StyleResponse  getWorksheetCellStyle(GetWorksheetCellStyleRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< StyleResponse > resp = getWorksheetCellStyleWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< StyleResponse > resp = getWorksheetCellStyleWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< StyleResponse > getWorksheetCellStyleWithHttpInfo(GetWorksheetCellStyleRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getWorksheetCellStyleValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< StyleResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getWorksheetCellStyleAsync( GetWorksheetCellStyleRequest request, final ApiCallback< StyleResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getWorksheetCellStyleValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< StyleResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postWorksheetCellSetValueValidateBeforeCall(PostWorksheetCellSetValueRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellResponse  postWorksheetCellSetValue(PostWorksheetCellSetValueRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellResponse > resp = postWorksheetCellSetValueWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellResponse > resp = postWorksheetCellSetValueWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellResponse > postWorksheetCellSetValueWithHttpInfo(PostWorksheetCellSetValueRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postWorksheetCellSetValueValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postWorksheetCellSetValueAsync( PostWorksheetCellSetValueRequest request, final ApiCallback< CellResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postWorksheetCellSetValueValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postUpdateWorksheetCellStyleValidateBeforeCall(PostUpdateWorksheetCellStyleRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postUpdateWorksheetCellStyle(PostUpdateWorksheetCellStyleRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postUpdateWorksheetCellStyleWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postUpdateWorksheetCellStyleWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postUpdateWorksheetCellStyleWithHttpInfo(PostUpdateWorksheetCellStyleRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postUpdateWorksheetCellStyleValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postUpdateWorksheetCellStyleAsync( PostUpdateWorksheetCellStyleRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postUpdateWorksheetCellStyleValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postSetCellRangeValueValidateBeforeCall(PostSetCellRangeValueRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postSetCellRangeValue(PostSetCellRangeValueRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postSetCellRangeValueWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postSetCellRangeValueWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postSetCellRangeValueWithHttpInfo(PostSetCellRangeValueRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postSetCellRangeValueValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postSetCellRangeValueAsync( PostSetCellRangeValueRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postSetCellRangeValueValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postCopyCellIntoCellValidateBeforeCall(PostCopyCellIntoCellRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postCopyCellIntoCell(PostCopyCellIntoCellRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postCopyCellIntoCellWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postCopyCellIntoCellWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postCopyCellIntoCellWithHttpInfo(PostCopyCellIntoCellRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postCopyCellIntoCellValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postCopyCellIntoCellAsync( PostCopyCellIntoCellRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postCopyCellIntoCellValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getCellHtmlStringValidateBeforeCall(GetCellHtmlStringRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  String  getCellHtmlString(GetCellHtmlStringRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< String > resp = getCellHtmlStringWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< String > resp = getCellHtmlStringWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< String > getCellHtmlStringWithHttpInfo(GetCellHtmlStringRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getCellHtmlStringValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< String >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getCellHtmlStringAsync( GetCellHtmlStringRequest request, final ApiCallback< String > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getCellHtmlStringValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< String >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postSetCellHtmlStringValidateBeforeCall(PostSetCellHtmlStringRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postSetCellHtmlString(PostSetCellHtmlStringRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postSetCellHtmlStringWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postSetCellHtmlStringWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postSetCellHtmlStringWithHttpInfo(PostSetCellHtmlStringRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postSetCellHtmlStringValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postSetCellHtmlStringAsync( PostSetCellHtmlStringRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postSetCellHtmlStringValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postCellCalculateValidateBeforeCall(PostCellCalculateRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postCellCalculate(PostCellCalculateRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postCellCalculateWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postCellCalculateWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postCellCalculateWithHttpInfo(PostCellCalculateRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postCellCalculateValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postCellCalculateAsync( PostCellCalculateRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postCellCalculateValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postCellCharactersValidateBeforeCall(PostCellCharactersRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postCellCharacters(PostCellCharactersRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postCellCharactersWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postCellCharactersWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postCellCharactersWithHttpInfo(PostCellCharactersRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postCellCharactersValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postCellCharactersAsync( PostCellCharactersRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postCellCharactersValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getWorksheetColumnsValidateBeforeCall(GetWorksheetColumnsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  ColumnsResponse  getWorksheetColumns(GetWorksheetColumnsRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< ColumnsResponse > resp = getWorksheetColumnsWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< ColumnsResponse > resp = getWorksheetColumnsWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< ColumnsResponse > getWorksheetColumnsWithHttpInfo(GetWorksheetColumnsRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getWorksheetColumnsValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< ColumnsResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getWorksheetColumnsAsync( GetWorksheetColumnsRequest request, final ApiCallback< ColumnsResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getWorksheetColumnsValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< ColumnsResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postSetWorksheetColumnWidthValidateBeforeCall(PostSetWorksheetColumnWidthRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postSetWorksheetColumnWidth(PostSetWorksheetColumnWidthRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postSetWorksheetColumnWidthWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postSetWorksheetColumnWidthWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postSetWorksheetColumnWidthWithHttpInfo(PostSetWorksheetColumnWidthRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postSetWorksheetColumnWidthValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postSetWorksheetColumnWidthAsync( PostSetWorksheetColumnWidthRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postSetWorksheetColumnWidthValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getWorksheetColumnValidateBeforeCall(GetWorksheetColumnRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  ColumnResponse  getWorksheetColumn(GetWorksheetColumnRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< ColumnResponse > resp = getWorksheetColumnWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< ColumnResponse > resp = getWorksheetColumnWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< ColumnResponse > getWorksheetColumnWithHttpInfo(GetWorksheetColumnRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getWorksheetColumnValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< ColumnResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getWorksheetColumnAsync( GetWorksheetColumnRequest request, final ApiCallback< ColumnResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getWorksheetColumnValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< ColumnResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call putInsertWorksheetColumnsValidateBeforeCall(PutInsertWorksheetColumnsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  putInsertWorksheetColumns(PutInsertWorksheetColumnsRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = putInsertWorksheetColumnsWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = putInsertWorksheetColumnsWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > putInsertWorksheetColumnsWithHttpInfo(PutInsertWorksheetColumnsRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  putInsertWorksheetColumnsValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  putInsertWorksheetColumnsAsync( PutInsertWorksheetColumnsRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  putInsertWorksheetColumnsValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call deleteWorksheetColumnsValidateBeforeCall(DeleteWorksheetColumnsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  deleteWorksheetColumns(DeleteWorksheetColumnsRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = deleteWorksheetColumnsWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = deleteWorksheetColumnsWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > deleteWorksheetColumnsWithHttpInfo(DeleteWorksheetColumnsRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  deleteWorksheetColumnsValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  deleteWorksheetColumnsAsync( DeleteWorksheetColumnsRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  deleteWorksheetColumnsValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postHideWorksheetColumnsValidateBeforeCall(PostHideWorksheetColumnsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postHideWorksheetColumns(PostHideWorksheetColumnsRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postHideWorksheetColumnsWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postHideWorksheetColumnsWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postHideWorksheetColumnsWithHttpInfo(PostHideWorksheetColumnsRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postHideWorksheetColumnsValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postHideWorksheetColumnsAsync( PostHideWorksheetColumnsRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postHideWorksheetColumnsValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postUnhideWorksheetColumnsValidateBeforeCall(PostUnhideWorksheetColumnsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postUnhideWorksheetColumns(PostUnhideWorksheetColumnsRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postUnhideWorksheetColumnsWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postUnhideWorksheetColumnsWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postUnhideWorksheetColumnsWithHttpInfo(PostUnhideWorksheetColumnsRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postUnhideWorksheetColumnsValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postUnhideWorksheetColumnsAsync( PostUnhideWorksheetColumnsRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postUnhideWorksheetColumnsValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postGroupWorksheetColumnsValidateBeforeCall(PostGroupWorksheetColumnsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postGroupWorksheetColumns(PostGroupWorksheetColumnsRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postGroupWorksheetColumnsWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postGroupWorksheetColumnsWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postGroupWorksheetColumnsWithHttpInfo(PostGroupWorksheetColumnsRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postGroupWorksheetColumnsValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postGroupWorksheetColumnsAsync( PostGroupWorksheetColumnsRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postGroupWorksheetColumnsValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postUngroupWorksheetColumnsValidateBeforeCall(PostUngroupWorksheetColumnsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postUngroupWorksheetColumns(PostUngroupWorksheetColumnsRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postUngroupWorksheetColumnsWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postUngroupWorksheetColumnsWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postUngroupWorksheetColumnsWithHttpInfo(PostUngroupWorksheetColumnsRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postUngroupWorksheetColumnsValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postUngroupWorksheetColumnsAsync( PostUngroupWorksheetColumnsRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postUngroupWorksheetColumnsValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postCopyWorksheetColumnsValidateBeforeCall(PostCopyWorksheetColumnsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postCopyWorksheetColumns(PostCopyWorksheetColumnsRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postCopyWorksheetColumnsWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postCopyWorksheetColumnsWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postCopyWorksheetColumnsWithHttpInfo(PostCopyWorksheetColumnsRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postCopyWorksheetColumnsValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postCopyWorksheetColumnsAsync( PostCopyWorksheetColumnsRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postCopyWorksheetColumnsValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postColumnStyleValidateBeforeCall(PostColumnStyleRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postColumnStyle(PostColumnStyleRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postColumnStyleWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postColumnStyleWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postColumnStyleWithHttpInfo(PostColumnStyleRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postColumnStyleValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postColumnStyleAsync( PostColumnStyleRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postColumnStyleValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getWorksheetRowsValidateBeforeCall(GetWorksheetRowsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  RowsResponse  getWorksheetRows(GetWorksheetRowsRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< RowsResponse > resp = getWorksheetRowsWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< RowsResponse > resp = getWorksheetRowsWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< RowsResponse > getWorksheetRowsWithHttpInfo(GetWorksheetRowsRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getWorksheetRowsValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< RowsResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getWorksheetRowsAsync( GetWorksheetRowsRequest request, final ApiCallback< RowsResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getWorksheetRowsValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< RowsResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getWorksheetRowValidateBeforeCall(GetWorksheetRowRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  RowResponse  getWorksheetRow(GetWorksheetRowRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< RowResponse > resp = getWorksheetRowWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< RowResponse > resp = getWorksheetRowWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< RowResponse > getWorksheetRowWithHttpInfo(GetWorksheetRowRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getWorksheetRowValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< RowResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getWorksheetRowAsync( GetWorksheetRowRequest request, final ApiCallback< RowResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getWorksheetRowValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< RowResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call deleteWorksheetRowValidateBeforeCall(DeleteWorksheetRowRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  deleteWorksheetRow(DeleteWorksheetRowRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = deleteWorksheetRowWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = deleteWorksheetRowWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > deleteWorksheetRowWithHttpInfo(DeleteWorksheetRowRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  deleteWorksheetRowValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  deleteWorksheetRowAsync( DeleteWorksheetRowRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  deleteWorksheetRowValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call deleteWorksheetRowsValidateBeforeCall(DeleteWorksheetRowsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  deleteWorksheetRows(DeleteWorksheetRowsRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = deleteWorksheetRowsWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = deleteWorksheetRowsWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > deleteWorksheetRowsWithHttpInfo(DeleteWorksheetRowsRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  deleteWorksheetRowsValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  deleteWorksheetRowsAsync( DeleteWorksheetRowsRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  deleteWorksheetRowsValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call putInsertWorksheetRowsValidateBeforeCall(PutInsertWorksheetRowsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  putInsertWorksheetRows(PutInsertWorksheetRowsRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = putInsertWorksheetRowsWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = putInsertWorksheetRowsWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > putInsertWorksheetRowsWithHttpInfo(PutInsertWorksheetRowsRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  putInsertWorksheetRowsValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  putInsertWorksheetRowsAsync( PutInsertWorksheetRowsRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  putInsertWorksheetRowsValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call putInsertWorksheetRowValidateBeforeCall(PutInsertWorksheetRowRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  putInsertWorksheetRow(PutInsertWorksheetRowRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = putInsertWorksheetRowWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = putInsertWorksheetRowWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > putInsertWorksheetRowWithHttpInfo(PutInsertWorksheetRowRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  putInsertWorksheetRowValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  putInsertWorksheetRowAsync( PutInsertWorksheetRowRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  putInsertWorksheetRowValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postUpdateWorksheetRowValidateBeforeCall(PostUpdateWorksheetRowRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postUpdateWorksheetRow(PostUpdateWorksheetRowRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postUpdateWorksheetRowWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postUpdateWorksheetRowWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postUpdateWorksheetRowWithHttpInfo(PostUpdateWorksheetRowRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postUpdateWorksheetRowValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postUpdateWorksheetRowAsync( PostUpdateWorksheetRowRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postUpdateWorksheetRowValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postHideWorksheetRowsValidateBeforeCall(PostHideWorksheetRowsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postHideWorksheetRows(PostHideWorksheetRowsRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postHideWorksheetRowsWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postHideWorksheetRowsWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postHideWorksheetRowsWithHttpInfo(PostHideWorksheetRowsRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postHideWorksheetRowsValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postHideWorksheetRowsAsync( PostHideWorksheetRowsRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postHideWorksheetRowsValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postUnhideWorksheetRowsValidateBeforeCall(PostUnhideWorksheetRowsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postUnhideWorksheetRows(PostUnhideWorksheetRowsRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postUnhideWorksheetRowsWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postUnhideWorksheetRowsWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postUnhideWorksheetRowsWithHttpInfo(PostUnhideWorksheetRowsRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postUnhideWorksheetRowsValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postUnhideWorksheetRowsAsync( PostUnhideWorksheetRowsRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postUnhideWorksheetRowsValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postGroupWorksheetRowsValidateBeforeCall(PostGroupWorksheetRowsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postGroupWorksheetRows(PostGroupWorksheetRowsRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postGroupWorksheetRowsWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postGroupWorksheetRowsWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postGroupWorksheetRowsWithHttpInfo(PostGroupWorksheetRowsRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postGroupWorksheetRowsValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postGroupWorksheetRowsAsync( PostGroupWorksheetRowsRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postGroupWorksheetRowsValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postUngroupWorksheetRowsValidateBeforeCall(PostUngroupWorksheetRowsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postUngroupWorksheetRows(PostUngroupWorksheetRowsRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postUngroupWorksheetRowsWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postUngroupWorksheetRowsWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postUngroupWorksheetRowsWithHttpInfo(PostUngroupWorksheetRowsRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postUngroupWorksheetRowsValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postUngroupWorksheetRowsAsync( PostUngroupWorksheetRowsRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postUngroupWorksheetRowsValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postCopyWorksheetRowsValidateBeforeCall(PostCopyWorksheetRowsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postCopyWorksheetRows(PostCopyWorksheetRowsRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postCopyWorksheetRowsWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postCopyWorksheetRowsWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postCopyWorksheetRowsWithHttpInfo(PostCopyWorksheetRowsRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postCopyWorksheetRowsValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postCopyWorksheetRowsAsync( PostCopyWorksheetRowsRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postCopyWorksheetRowsValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postRowStyleValidateBeforeCall(PostRowStyleRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postRowStyle(PostRowStyleRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postRowStyleWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postRowStyleWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postRowStyleWithHttpInfo(PostRowStyleRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postRowStyleValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postRowStyleAsync( PostRowStyleRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postRowStyleValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getCellsCloudServicesHealthCheckValidateBeforeCall(GetCellsCloudServicesHealthCheckRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  String  getCellsCloudServicesHealthCheck(GetCellsCloudServicesHealthCheckRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< String > resp = getCellsCloudServicesHealthCheckWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< String > resp = getCellsCloudServicesHealthCheckWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< String > getCellsCloudServicesHealthCheckWithHttpInfo(GetCellsCloudServicesHealthCheckRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getCellsCloudServicesHealthCheckValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< String >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getCellsCloudServicesHealthCheckAsync( GetCellsCloudServicesHealthCheckRequest request, final ApiCallback< String > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getCellsCloudServicesHealthCheckValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< String >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getCellsCloudServiceStatusValidateBeforeCall(GetCellsCloudServiceStatusRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  String  getCellsCloudServiceStatus(GetCellsCloudServiceStatusRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< String > resp = getCellsCloudServiceStatusWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< String > resp = getCellsCloudServiceStatusWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< String > getCellsCloudServiceStatusWithHttpInfo(GetCellsCloudServiceStatusRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getCellsCloudServiceStatusValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< String >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getCellsCloudServiceStatusAsync( GetCellsCloudServiceStatusRequest request, final ApiCallback< String > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getCellsCloudServiceStatusValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< String >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getChartAreaValidateBeforeCall(GetChartAreaRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  ChartAreaResponse  getChartArea(GetChartAreaRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< ChartAreaResponse > resp = getChartAreaWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< ChartAreaResponse > resp = getChartAreaWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< ChartAreaResponse > getChartAreaWithHttpInfo(GetChartAreaRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getChartAreaValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< ChartAreaResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getChartAreaAsync( GetChartAreaRequest request, final ApiCallback< ChartAreaResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getChartAreaValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< ChartAreaResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getChartAreaFillFormatValidateBeforeCall(GetChartAreaFillFormatRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  FillFormatResponse  getChartAreaFillFormat(GetChartAreaFillFormatRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< FillFormatResponse > resp = getChartAreaFillFormatWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< FillFormatResponse > resp = getChartAreaFillFormatWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< FillFormatResponse > getChartAreaFillFormatWithHttpInfo(GetChartAreaFillFormatRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getChartAreaFillFormatValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< FillFormatResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getChartAreaFillFormatAsync( GetChartAreaFillFormatRequest request, final ApiCallback< FillFormatResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getChartAreaFillFormatValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< FillFormatResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getChartAreaBorderValidateBeforeCall(GetChartAreaBorderRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  LineResponse  getChartAreaBorder(GetChartAreaBorderRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< LineResponse > resp = getChartAreaBorderWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< LineResponse > resp = getChartAreaBorderWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< LineResponse > getChartAreaBorderWithHttpInfo(GetChartAreaBorderRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getChartAreaBorderValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< LineResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getChartAreaBorderAsync( GetChartAreaBorderRequest request, final ApiCallback< LineResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getChartAreaBorderValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< LineResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getWorksheetChartsValidateBeforeCall(GetWorksheetChartsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  ChartsResponse  getWorksheetCharts(GetWorksheetChartsRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< ChartsResponse > resp = getWorksheetChartsWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< ChartsResponse > resp = getWorksheetChartsWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< ChartsResponse > getWorksheetChartsWithHttpInfo(GetWorksheetChartsRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getWorksheetChartsValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< ChartsResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getWorksheetChartsAsync( GetWorksheetChartsRequest request, final ApiCallback< ChartsResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getWorksheetChartsValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< ChartsResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getWorksheetChartValidateBeforeCall(GetWorksheetChartRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  File  getWorksheetChart(GetWorksheetChartRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< File > resp = getWorksheetChartWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< File > resp = getWorksheetChartWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< File > getWorksheetChartWithHttpInfo(GetWorksheetChartRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getWorksheetChartValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< File >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getWorksheetChartAsync( GetWorksheetChartRequest request, final ApiCallback< HashMap<String,File> > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getWorksheetChartValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< HashMap<String,File> >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call putWorksheetChartValidateBeforeCall(PutWorksheetChartRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  putWorksheetChart(PutWorksheetChartRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = putWorksheetChartWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = putWorksheetChartWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > putWorksheetChartWithHttpInfo(PutWorksheetChartRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  putWorksheetChartValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  putWorksheetChartAsync( PutWorksheetChartRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  putWorksheetChartValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call deleteWorksheetChartValidateBeforeCall(DeleteWorksheetChartRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  deleteWorksheetChart(DeleteWorksheetChartRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = deleteWorksheetChartWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = deleteWorksheetChartWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > deleteWorksheetChartWithHttpInfo(DeleteWorksheetChartRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  deleteWorksheetChartValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  deleteWorksheetChartAsync( DeleteWorksheetChartRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  deleteWorksheetChartValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postWorksheetChartValidateBeforeCall(PostWorksheetChartRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postWorksheetChart(PostWorksheetChartRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postWorksheetChartWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postWorksheetChartWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postWorksheetChartWithHttpInfo(PostWorksheetChartRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postWorksheetChartValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postWorksheetChartAsync( PostWorksheetChartRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postWorksheetChartValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getWorksheetChartLegendValidateBeforeCall(GetWorksheetChartLegendRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  LegendResponse  getWorksheetChartLegend(GetWorksheetChartLegendRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< LegendResponse > resp = getWorksheetChartLegendWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< LegendResponse > resp = getWorksheetChartLegendWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< LegendResponse > getWorksheetChartLegendWithHttpInfo(GetWorksheetChartLegendRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getWorksheetChartLegendValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< LegendResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getWorksheetChartLegendAsync( GetWorksheetChartLegendRequest request, final ApiCallback< LegendResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getWorksheetChartLegendValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< LegendResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postWorksheetChartLegendValidateBeforeCall(PostWorksheetChartLegendRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postWorksheetChartLegend(PostWorksheetChartLegendRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postWorksheetChartLegendWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postWorksheetChartLegendWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postWorksheetChartLegendWithHttpInfo(PostWorksheetChartLegendRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postWorksheetChartLegendValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postWorksheetChartLegendAsync( PostWorksheetChartLegendRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postWorksheetChartLegendValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call putWorksheetChartLegendValidateBeforeCall(PutWorksheetChartLegendRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  putWorksheetChartLegend(PutWorksheetChartLegendRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = putWorksheetChartLegendWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = putWorksheetChartLegendWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > putWorksheetChartLegendWithHttpInfo(PutWorksheetChartLegendRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  putWorksheetChartLegendValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  putWorksheetChartLegendAsync( PutWorksheetChartLegendRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  putWorksheetChartLegendValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call deleteWorksheetChartLegendValidateBeforeCall(DeleteWorksheetChartLegendRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  deleteWorksheetChartLegend(DeleteWorksheetChartLegendRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = deleteWorksheetChartLegendWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = deleteWorksheetChartLegendWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > deleteWorksheetChartLegendWithHttpInfo(DeleteWorksheetChartLegendRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  deleteWorksheetChartLegendValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  deleteWorksheetChartLegendAsync( DeleteWorksheetChartLegendRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  deleteWorksheetChartLegendValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call deleteWorksheetChartsValidateBeforeCall(DeleteWorksheetChartsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  deleteWorksheetCharts(DeleteWorksheetChartsRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = deleteWorksheetChartsWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = deleteWorksheetChartsWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > deleteWorksheetChartsWithHttpInfo(DeleteWorksheetChartsRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  deleteWorksheetChartsValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  deleteWorksheetChartsAsync( DeleteWorksheetChartsRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  deleteWorksheetChartsValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getWorksheetChartTitleValidateBeforeCall(GetWorksheetChartTitleRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  TitleResponse  getWorksheetChartTitle(GetWorksheetChartTitleRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< TitleResponse > resp = getWorksheetChartTitleWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< TitleResponse > resp = getWorksheetChartTitleWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< TitleResponse > getWorksheetChartTitleWithHttpInfo(GetWorksheetChartTitleRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getWorksheetChartTitleValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< TitleResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getWorksheetChartTitleAsync( GetWorksheetChartTitleRequest request, final ApiCallback< TitleResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getWorksheetChartTitleValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< TitleResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postWorksheetChartTitleValidateBeforeCall(PostWorksheetChartTitleRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postWorksheetChartTitle(PostWorksheetChartTitleRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postWorksheetChartTitleWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postWorksheetChartTitleWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postWorksheetChartTitleWithHttpInfo(PostWorksheetChartTitleRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postWorksheetChartTitleValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postWorksheetChartTitleAsync( PostWorksheetChartTitleRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postWorksheetChartTitleValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call putWorksheetChartTitleValidateBeforeCall(PutWorksheetChartTitleRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  putWorksheetChartTitle(PutWorksheetChartTitleRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = putWorksheetChartTitleWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = putWorksheetChartTitleWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > putWorksheetChartTitleWithHttpInfo(PutWorksheetChartTitleRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  putWorksheetChartTitleValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  putWorksheetChartTitleAsync( PutWorksheetChartTitleRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  putWorksheetChartTitleValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call deleteWorksheetChartTitleValidateBeforeCall(DeleteWorksheetChartTitleRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  deleteWorksheetChartTitle(DeleteWorksheetChartTitleRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = deleteWorksheetChartTitleWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = deleteWorksheetChartTitleWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > deleteWorksheetChartTitleWithHttpInfo(DeleteWorksheetChartTitleRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  deleteWorksheetChartTitleValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  deleteWorksheetChartTitleAsync( DeleteWorksheetChartTitleRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  deleteWorksheetChartTitleValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getChartSeriesAxisValidateBeforeCall(GetChartSeriesAxisRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  AxisResponse  getChartSeriesAxis(GetChartSeriesAxisRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< AxisResponse > resp = getChartSeriesAxisWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< AxisResponse > resp = getChartSeriesAxisWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< AxisResponse > getChartSeriesAxisWithHttpInfo(GetChartSeriesAxisRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getChartSeriesAxisValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< AxisResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getChartSeriesAxisAsync( GetChartSeriesAxisRequest request, final ApiCallback< AxisResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getChartSeriesAxisValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< AxisResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getChartCategoryAxisValidateBeforeCall(GetChartCategoryAxisRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  AxisResponse  getChartCategoryAxis(GetChartCategoryAxisRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< AxisResponse > resp = getChartCategoryAxisWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< AxisResponse > resp = getChartCategoryAxisWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< AxisResponse > getChartCategoryAxisWithHttpInfo(GetChartCategoryAxisRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getChartCategoryAxisValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< AxisResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getChartCategoryAxisAsync( GetChartCategoryAxisRequest request, final ApiCallback< AxisResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getChartCategoryAxisValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< AxisResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getChartValueAxisValidateBeforeCall(GetChartValueAxisRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  AxisResponse  getChartValueAxis(GetChartValueAxisRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< AxisResponse > resp = getChartValueAxisWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< AxisResponse > resp = getChartValueAxisWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< AxisResponse > getChartValueAxisWithHttpInfo(GetChartValueAxisRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getChartValueAxisValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< AxisResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getChartValueAxisAsync( GetChartValueAxisRequest request, final ApiCallback< AxisResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getChartValueAxisValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< AxisResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getChartSecondCategoryAxisValidateBeforeCall(GetChartSecondCategoryAxisRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  AxisResponse  getChartSecondCategoryAxis(GetChartSecondCategoryAxisRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< AxisResponse > resp = getChartSecondCategoryAxisWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< AxisResponse > resp = getChartSecondCategoryAxisWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< AxisResponse > getChartSecondCategoryAxisWithHttpInfo(GetChartSecondCategoryAxisRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getChartSecondCategoryAxisValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< AxisResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getChartSecondCategoryAxisAsync( GetChartSecondCategoryAxisRequest request, final ApiCallback< AxisResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getChartSecondCategoryAxisValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< AxisResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getChartSecondValueAxisValidateBeforeCall(GetChartSecondValueAxisRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  AxisResponse  getChartSecondValueAxis(GetChartSecondValueAxisRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< AxisResponse > resp = getChartSecondValueAxisWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< AxisResponse > resp = getChartSecondValueAxisWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< AxisResponse > getChartSecondValueAxisWithHttpInfo(GetChartSecondValueAxisRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getChartSecondValueAxisValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< AxisResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getChartSecondValueAxisAsync( GetChartSecondValueAxisRequest request, final ApiCallback< AxisResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getChartSecondValueAxisValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< AxisResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postChartSeriesAxisValidateBeforeCall(PostChartSeriesAxisRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postChartSeriesAxis(PostChartSeriesAxisRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postChartSeriesAxisWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postChartSeriesAxisWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postChartSeriesAxisWithHttpInfo(PostChartSeriesAxisRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postChartSeriesAxisValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postChartSeriesAxisAsync( PostChartSeriesAxisRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postChartSeriesAxisValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postChartCategoryAxisValidateBeforeCall(PostChartCategoryAxisRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postChartCategoryAxis(PostChartCategoryAxisRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postChartCategoryAxisWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postChartCategoryAxisWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postChartCategoryAxisWithHttpInfo(PostChartCategoryAxisRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postChartCategoryAxisValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postChartCategoryAxisAsync( PostChartCategoryAxisRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postChartCategoryAxisValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postChartValueAxisValidateBeforeCall(PostChartValueAxisRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postChartValueAxis(PostChartValueAxisRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postChartValueAxisWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postChartValueAxisWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postChartValueAxisWithHttpInfo(PostChartValueAxisRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postChartValueAxisValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postChartValueAxisAsync( PostChartValueAxisRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postChartValueAxisValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postChartSecondCategoryAxisValidateBeforeCall(PostChartSecondCategoryAxisRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postChartSecondCategoryAxis(PostChartSecondCategoryAxisRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postChartSecondCategoryAxisWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postChartSecondCategoryAxisWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postChartSecondCategoryAxisWithHttpInfo(PostChartSecondCategoryAxisRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postChartSecondCategoryAxisValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postChartSecondCategoryAxisAsync( PostChartSecondCategoryAxisRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postChartSecondCategoryAxisValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postChartSecondValueAxisValidateBeforeCall(PostChartSecondValueAxisRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postChartSecondValueAxis(PostChartSecondValueAxisRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postChartSecondValueAxisWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postChartSecondValueAxisWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postChartSecondValueAxisWithHttpInfo(PostChartSecondValueAxisRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postChartSecondValueAxisValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postChartSecondValueAxisAsync( PostChartSecondValueAxisRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postChartSecondValueAxisValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getWorksheetConditionalFormattingsValidateBeforeCall(GetWorksheetConditionalFormattingsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  ConditionalFormattingsResponse  getWorksheetConditionalFormattings(GetWorksheetConditionalFormattingsRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< ConditionalFormattingsResponse > resp = getWorksheetConditionalFormattingsWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< ConditionalFormattingsResponse > resp = getWorksheetConditionalFormattingsWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< ConditionalFormattingsResponse > getWorksheetConditionalFormattingsWithHttpInfo(GetWorksheetConditionalFormattingsRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getWorksheetConditionalFormattingsValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< ConditionalFormattingsResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getWorksheetConditionalFormattingsAsync( GetWorksheetConditionalFormattingsRequest request, final ApiCallback< ConditionalFormattingsResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getWorksheetConditionalFormattingsValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< ConditionalFormattingsResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getWorksheetConditionalFormattingValidateBeforeCall(GetWorksheetConditionalFormattingRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  ConditionalFormattingResponse  getWorksheetConditionalFormatting(GetWorksheetConditionalFormattingRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< ConditionalFormattingResponse > resp = getWorksheetConditionalFormattingWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< ConditionalFormattingResponse > resp = getWorksheetConditionalFormattingWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< ConditionalFormattingResponse > getWorksheetConditionalFormattingWithHttpInfo(GetWorksheetConditionalFormattingRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getWorksheetConditionalFormattingValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< ConditionalFormattingResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getWorksheetConditionalFormattingAsync( GetWorksheetConditionalFormattingRequest request, final ApiCallback< ConditionalFormattingResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getWorksheetConditionalFormattingValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< ConditionalFormattingResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call putWorksheetConditionalFormattingValidateBeforeCall(PutWorksheetConditionalFormattingRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  putWorksheetConditionalFormatting(PutWorksheetConditionalFormattingRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = putWorksheetConditionalFormattingWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = putWorksheetConditionalFormattingWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > putWorksheetConditionalFormattingWithHttpInfo(PutWorksheetConditionalFormattingRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  putWorksheetConditionalFormattingValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  putWorksheetConditionalFormattingAsync( PutWorksheetConditionalFormattingRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  putWorksheetConditionalFormattingValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call putWorksheetFormatConditionValidateBeforeCall(PutWorksheetFormatConditionRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  putWorksheetFormatCondition(PutWorksheetFormatConditionRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = putWorksheetFormatConditionWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = putWorksheetFormatConditionWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > putWorksheetFormatConditionWithHttpInfo(PutWorksheetFormatConditionRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  putWorksheetFormatConditionValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  putWorksheetFormatConditionAsync( PutWorksheetFormatConditionRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  putWorksheetFormatConditionValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call putWorksheetFormatConditionAreaValidateBeforeCall(PutWorksheetFormatConditionAreaRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  putWorksheetFormatConditionArea(PutWorksheetFormatConditionAreaRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = putWorksheetFormatConditionAreaWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = putWorksheetFormatConditionAreaWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > putWorksheetFormatConditionAreaWithHttpInfo(PutWorksheetFormatConditionAreaRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  putWorksheetFormatConditionAreaValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  putWorksheetFormatConditionAreaAsync( PutWorksheetFormatConditionAreaRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  putWorksheetFormatConditionAreaValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call putWorksheetFormatConditionConditionValidateBeforeCall(PutWorksheetFormatConditionConditionRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  putWorksheetFormatConditionCondition(PutWorksheetFormatConditionConditionRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = putWorksheetFormatConditionConditionWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = putWorksheetFormatConditionConditionWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > putWorksheetFormatConditionConditionWithHttpInfo(PutWorksheetFormatConditionConditionRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  putWorksheetFormatConditionConditionValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  putWorksheetFormatConditionConditionAsync( PutWorksheetFormatConditionConditionRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  putWorksheetFormatConditionConditionValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call deleteWorksheetConditionalFormattingsValidateBeforeCall(DeleteWorksheetConditionalFormattingsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  deleteWorksheetConditionalFormattings(DeleteWorksheetConditionalFormattingsRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = deleteWorksheetConditionalFormattingsWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = deleteWorksheetConditionalFormattingsWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > deleteWorksheetConditionalFormattingsWithHttpInfo(DeleteWorksheetConditionalFormattingsRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  deleteWorksheetConditionalFormattingsValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  deleteWorksheetConditionalFormattingsAsync( DeleteWorksheetConditionalFormattingsRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  deleteWorksheetConditionalFormattingsValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call deleteWorksheetConditionalFormattingValidateBeforeCall(DeleteWorksheetConditionalFormattingRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  deleteWorksheetConditionalFormatting(DeleteWorksheetConditionalFormattingRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = deleteWorksheetConditionalFormattingWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = deleteWorksheetConditionalFormattingWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > deleteWorksheetConditionalFormattingWithHttpInfo(DeleteWorksheetConditionalFormattingRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  deleteWorksheetConditionalFormattingValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  deleteWorksheetConditionalFormattingAsync( DeleteWorksheetConditionalFormattingRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  deleteWorksheetConditionalFormattingValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call deleteWorksheetConditionalFormattingAreaValidateBeforeCall(DeleteWorksheetConditionalFormattingAreaRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  deleteWorksheetConditionalFormattingArea(DeleteWorksheetConditionalFormattingAreaRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = deleteWorksheetConditionalFormattingAreaWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = deleteWorksheetConditionalFormattingAreaWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > deleteWorksheetConditionalFormattingAreaWithHttpInfo(DeleteWorksheetConditionalFormattingAreaRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  deleteWorksheetConditionalFormattingAreaValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  deleteWorksheetConditionalFormattingAreaAsync( DeleteWorksheetConditionalFormattingAreaRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  deleteWorksheetConditionalFormattingAreaValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getWorkbookValidateBeforeCall(GetWorkbookRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  File  getWorkbook(GetWorkbookRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< File > resp = getWorkbookWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< File > resp = getWorkbookWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< File > getWorkbookWithHttpInfo(GetWorkbookRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getWorkbookValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< File >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getWorkbookAsync( GetWorkbookRequest request, final ApiCallback< HashMap<String,File> > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getWorkbookValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< HashMap<String,File> >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call putConvertWorkbookValidateBeforeCall(PutConvertWorkbookRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  File  putConvertWorkbook(PutConvertWorkbookRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< File > resp = putConvertWorkbookWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< File > resp = putConvertWorkbookWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< File > putConvertWorkbookWithHttpInfo(PutConvertWorkbookRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  putConvertWorkbookValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< File >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  putConvertWorkbookAsync( PutConvertWorkbookRequest request, final ApiCallback< HashMap<String,File> > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  putConvertWorkbookValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< HashMap<String,File> >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postWorkbookSaveAsValidateBeforeCall(PostWorkbookSaveAsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  SaveResponse  postWorkbookSaveAs(PostWorkbookSaveAsRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< SaveResponse > resp = postWorkbookSaveAsWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< SaveResponse > resp = postWorkbookSaveAsWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< SaveResponse > postWorkbookSaveAsWithHttpInfo(PostWorkbookSaveAsRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postWorkbookSaveAsValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< SaveResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postWorkbookSaveAsAsync( PostWorkbookSaveAsRequest request, final ApiCallback< SaveResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postWorkbookSaveAsValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< SaveResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postConvertWorkbookToPDFValidateBeforeCall(PostConvertWorkbookToPDFRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  FileInfo  postConvertWorkbookToPDF(PostConvertWorkbookToPDFRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< FileInfo > resp = postConvertWorkbookToPDFWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< FileInfo > resp = postConvertWorkbookToPDFWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< FileInfo > postConvertWorkbookToPDFWithHttpInfo(PostConvertWorkbookToPDFRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postConvertWorkbookToPDFValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< FileInfo >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postConvertWorkbookToPDFAsync( PostConvertWorkbookToPDFRequest request, final ApiCallback< FileInfo > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postConvertWorkbookToPDFValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< FileInfo >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postConvertWorkbookToPNGValidateBeforeCall(PostConvertWorkbookToPNGRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  FileInfo  postConvertWorkbookToPNG(PostConvertWorkbookToPNGRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< FileInfo > resp = postConvertWorkbookToPNGWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< FileInfo > resp = postConvertWorkbookToPNGWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< FileInfo > postConvertWorkbookToPNGWithHttpInfo(PostConvertWorkbookToPNGRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postConvertWorkbookToPNGValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< FileInfo >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postConvertWorkbookToPNGAsync( PostConvertWorkbookToPNGRequest request, final ApiCallback< FileInfo > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postConvertWorkbookToPNGValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< FileInfo >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postConvertWorkbookToDocxValidateBeforeCall(PostConvertWorkbookToDocxRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  FileInfo  postConvertWorkbookToDocx(PostConvertWorkbookToDocxRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< FileInfo > resp = postConvertWorkbookToDocxWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< FileInfo > resp = postConvertWorkbookToDocxWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< FileInfo > postConvertWorkbookToDocxWithHttpInfo(PostConvertWorkbookToDocxRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postConvertWorkbookToDocxValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< FileInfo >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postConvertWorkbookToDocxAsync( PostConvertWorkbookToDocxRequest request, final ApiCallback< FileInfo > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postConvertWorkbookToDocxValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< FileInfo >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postConvertWorkbookToPptxValidateBeforeCall(PostConvertWorkbookToPptxRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  FileInfo  postConvertWorkbookToPptx(PostConvertWorkbookToPptxRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< FileInfo > resp = postConvertWorkbookToPptxWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< FileInfo > resp = postConvertWorkbookToPptxWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< FileInfo > postConvertWorkbookToPptxWithHttpInfo(PostConvertWorkbookToPptxRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postConvertWorkbookToPptxValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< FileInfo >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postConvertWorkbookToPptxAsync( PostConvertWorkbookToPptxRequest request, final ApiCallback< FileInfo > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postConvertWorkbookToPptxValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< FileInfo >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postConvertWorkbookToHtmlValidateBeforeCall(PostConvertWorkbookToHtmlRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  FileInfo  postConvertWorkbookToHtml(PostConvertWorkbookToHtmlRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< FileInfo > resp = postConvertWorkbookToHtmlWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< FileInfo > resp = postConvertWorkbookToHtmlWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< FileInfo > postConvertWorkbookToHtmlWithHttpInfo(PostConvertWorkbookToHtmlRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postConvertWorkbookToHtmlValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< FileInfo >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postConvertWorkbookToHtmlAsync( PostConvertWorkbookToHtmlRequest request, final ApiCallback< FileInfo > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postConvertWorkbookToHtmlValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< FileInfo >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postConvertWorkbookToMarkdownValidateBeforeCall(PostConvertWorkbookToMarkdownRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  FileInfo  postConvertWorkbookToMarkdown(PostConvertWorkbookToMarkdownRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< FileInfo > resp = postConvertWorkbookToMarkdownWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< FileInfo > resp = postConvertWorkbookToMarkdownWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< FileInfo > postConvertWorkbookToMarkdownWithHttpInfo(PostConvertWorkbookToMarkdownRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postConvertWorkbookToMarkdownValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< FileInfo >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postConvertWorkbookToMarkdownAsync( PostConvertWorkbookToMarkdownRequest request, final ApiCallback< FileInfo > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postConvertWorkbookToMarkdownValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< FileInfo >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postConvertWorkbookToJsonValidateBeforeCall(PostConvertWorkbookToJsonRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  FileInfo  postConvertWorkbookToJson(PostConvertWorkbookToJsonRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< FileInfo > resp = postConvertWorkbookToJsonWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< FileInfo > resp = postConvertWorkbookToJsonWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< FileInfo > postConvertWorkbookToJsonWithHttpInfo(PostConvertWorkbookToJsonRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postConvertWorkbookToJsonValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< FileInfo >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postConvertWorkbookToJsonAsync( PostConvertWorkbookToJsonRequest request, final ApiCallback< FileInfo > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postConvertWorkbookToJsonValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< FileInfo >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postConvertWorkbookToSQLValidateBeforeCall(PostConvertWorkbookToSQLRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  FileInfo  postConvertWorkbookToSQL(PostConvertWorkbookToSQLRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< FileInfo > resp = postConvertWorkbookToSQLWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< FileInfo > resp = postConvertWorkbookToSQLWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< FileInfo > postConvertWorkbookToSQLWithHttpInfo(PostConvertWorkbookToSQLRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postConvertWorkbookToSQLValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< FileInfo >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postConvertWorkbookToSQLAsync( PostConvertWorkbookToSQLRequest request, final ApiCallback< FileInfo > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postConvertWorkbookToSQLValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< FileInfo >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postConvertWorkbookToCSVValidateBeforeCall(PostConvertWorkbookToCSVRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  FileInfo  postConvertWorkbookToCSV(PostConvertWorkbookToCSVRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< FileInfo > resp = postConvertWorkbookToCSVWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< FileInfo > resp = postConvertWorkbookToCSVWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< FileInfo > postConvertWorkbookToCSVWithHttpInfo(PostConvertWorkbookToCSVRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postConvertWorkbookToCSVValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< FileInfo >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postConvertWorkbookToCSVAsync( PostConvertWorkbookToCSVRequest request, final ApiCallback< FileInfo > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postConvertWorkbookToCSVValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< FileInfo >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postExportValidateBeforeCall(PostExportRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  FilesResult  postExport(PostExportRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< FilesResult > resp = postExportWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< FilesResult > resp = postExportWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< FilesResult > postExportWithHttpInfo(PostExportRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postExportValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< FilesResult >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postExportAsync( PostExportRequest request, final ApiCallback< FilesResult > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postExportValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< FilesResult >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postWorkbookExportXMLValidateBeforeCall(PostWorkbookExportXMLRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  File  postWorkbookExportXML(PostWorkbookExportXMLRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< File > resp = postWorkbookExportXMLWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< File > resp = postWorkbookExportXMLWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< File > postWorkbookExportXMLWithHttpInfo(PostWorkbookExportXMLRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postWorkbookExportXMLValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< File >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postWorkbookExportXMLAsync( PostWorkbookExportXMLRequest request, final ApiCallback< HashMap<String,File> > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postWorkbookExportXMLValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< HashMap<String,File> >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postWorkbookImportJsonValidateBeforeCall(PostWorkbookImportJsonRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  File  postWorkbookImportJson(PostWorkbookImportJsonRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< File > resp = postWorkbookImportJsonWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< File > resp = postWorkbookImportJsonWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< File > postWorkbookImportJsonWithHttpInfo(PostWorkbookImportJsonRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postWorkbookImportJsonValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< File >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postWorkbookImportJsonAsync( PostWorkbookImportJsonRequest request, final ApiCallback< HashMap<String,File> > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postWorkbookImportJsonValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< HashMap<String,File> >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postWorkbookImportXMLValidateBeforeCall(PostWorkbookImportXMLRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  File  postWorkbookImportXML(PostWorkbookImportXMLRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< File > resp = postWorkbookImportXMLWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< File > resp = postWorkbookImportXMLWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< File > postWorkbookImportXMLWithHttpInfo(PostWorkbookImportXMLRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postWorkbookImportXMLValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< File >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postWorkbookImportXMLAsync( PostWorkbookImportXMLRequest request, final ApiCallback< HashMap<String,File> > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postWorkbookImportXMLValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< HashMap<String,File> >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postImportDataValidateBeforeCall(PostImportDataRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postImportData(PostImportDataRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postImportDataWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postImportDataWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postImportDataWithHttpInfo(PostImportDataRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postImportDataValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postImportDataAsync( PostImportDataRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postImportDataValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getWorksheetHyperlinksValidateBeforeCall(GetWorksheetHyperlinksRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  HyperlinksResponse  getWorksheetHyperlinks(GetWorksheetHyperlinksRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< HyperlinksResponse > resp = getWorksheetHyperlinksWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< HyperlinksResponse > resp = getWorksheetHyperlinksWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< HyperlinksResponse > getWorksheetHyperlinksWithHttpInfo(GetWorksheetHyperlinksRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getWorksheetHyperlinksValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< HyperlinksResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getWorksheetHyperlinksAsync( GetWorksheetHyperlinksRequest request, final ApiCallback< HyperlinksResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getWorksheetHyperlinksValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< HyperlinksResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getWorksheetHyperlinkValidateBeforeCall(GetWorksheetHyperlinkRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  HyperlinkResponse  getWorksheetHyperlink(GetWorksheetHyperlinkRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< HyperlinkResponse > resp = getWorksheetHyperlinkWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< HyperlinkResponse > resp = getWorksheetHyperlinkWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< HyperlinkResponse > getWorksheetHyperlinkWithHttpInfo(GetWorksheetHyperlinkRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getWorksheetHyperlinkValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< HyperlinkResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getWorksheetHyperlinkAsync( GetWorksheetHyperlinkRequest request, final ApiCallback< HyperlinkResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getWorksheetHyperlinkValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< HyperlinkResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call deleteWorksheetHyperlinkValidateBeforeCall(DeleteWorksheetHyperlinkRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  deleteWorksheetHyperlink(DeleteWorksheetHyperlinkRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = deleteWorksheetHyperlinkWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = deleteWorksheetHyperlinkWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > deleteWorksheetHyperlinkWithHttpInfo(DeleteWorksheetHyperlinkRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  deleteWorksheetHyperlinkValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  deleteWorksheetHyperlinkAsync( DeleteWorksheetHyperlinkRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  deleteWorksheetHyperlinkValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postWorksheetHyperlinkValidateBeforeCall(PostWorksheetHyperlinkRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postWorksheetHyperlink(PostWorksheetHyperlinkRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postWorksheetHyperlinkWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postWorksheetHyperlinkWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postWorksheetHyperlinkWithHttpInfo(PostWorksheetHyperlinkRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postWorksheetHyperlinkValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postWorksheetHyperlinkAsync( PostWorksheetHyperlinkRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postWorksheetHyperlinkValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call putWorksheetHyperlinkValidateBeforeCall(PutWorksheetHyperlinkRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  putWorksheetHyperlink(PutWorksheetHyperlinkRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = putWorksheetHyperlinkWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = putWorksheetHyperlinkWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > putWorksheetHyperlinkWithHttpInfo(PutWorksheetHyperlinkRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  putWorksheetHyperlinkValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  putWorksheetHyperlinkAsync( PutWorksheetHyperlinkRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  putWorksheetHyperlinkValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call deleteWorksheetHyperlinksValidateBeforeCall(DeleteWorksheetHyperlinksRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  deleteWorksheetHyperlinks(DeleteWorksheetHyperlinksRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = deleteWorksheetHyperlinksWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = deleteWorksheetHyperlinksWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > deleteWorksheetHyperlinksWithHttpInfo(DeleteWorksheetHyperlinksRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  deleteWorksheetHyperlinksValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  deleteWorksheetHyperlinksAsync( DeleteWorksheetHyperlinksRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  deleteWorksheetHyperlinksValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postAssembleValidateBeforeCall(PostAssembleRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  FilesResult  postAssemble(PostAssembleRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< FilesResult > resp = postAssembleWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< FilesResult > resp = postAssembleWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< FilesResult > postAssembleWithHttpInfo(PostAssembleRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postAssembleValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< FilesResult >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postAssembleAsync( PostAssembleRequest request, final ApiCallback< FilesResult > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postAssembleValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< FilesResult >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postCompressValidateBeforeCall(PostCompressRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  FilesResult  postCompress(PostCompressRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< FilesResult > resp = postCompressWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< FilesResult > resp = postCompressWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< FilesResult > postCompressWithHttpInfo(PostCompressRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postCompressValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< FilesResult >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postCompressAsync( PostCompressRequest request, final ApiCallback< FilesResult > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postCompressValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< FilesResult >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postMergeValidateBeforeCall(PostMergeRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  FileInfo  postMerge(PostMergeRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< FileInfo > resp = postMergeWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< FileInfo > resp = postMergeWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< FileInfo > postMergeWithHttpInfo(PostMergeRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postMergeValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< FileInfo >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postMergeAsync( PostMergeRequest request, final ApiCallback< FileInfo > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postMergeValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< FileInfo >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postSplitValidateBeforeCall(PostSplitRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  FilesResult  postSplit(PostSplitRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< FilesResult > resp = postSplitWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< FilesResult > resp = postSplitWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< FilesResult > postSplitWithHttpInfo(PostSplitRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postSplitValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< FilesResult >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postSplitAsync( PostSplitRequest request, final ApiCallback< FilesResult > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postSplitValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< FilesResult >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postSearchValidateBeforeCall(PostSearchRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  List<TextItem>  postSearch(PostSearchRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< List<TextItem> > resp = postSearchWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< List<TextItem> > resp = postSearchWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< List<TextItem> > postSearchWithHttpInfo(PostSearchRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postSearchValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< List<TextItem> >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postSearchAsync( PostSearchRequest request, final ApiCallback< List<TextItem> > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postSearchValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< List<TextItem> >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postReplaceValidateBeforeCall(PostReplaceRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  FilesResult  postReplace(PostReplaceRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< FilesResult > resp = postReplaceWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< FilesResult > resp = postReplaceWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< FilesResult > postReplaceWithHttpInfo(PostReplaceRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postReplaceValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< FilesResult >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postReplaceAsync( PostReplaceRequest request, final ApiCallback< FilesResult > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postReplaceValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< FilesResult >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postImportValidateBeforeCall(PostImportRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  FilesResult  postImport(PostImportRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< FilesResult > resp = postImportWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< FilesResult > resp = postImportWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< FilesResult > postImportWithHttpInfo(PostImportRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postImportValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< FilesResult >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postImportAsync( PostImportRequest request, final ApiCallback< FilesResult > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postImportValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< FilesResult >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postWatermarkValidateBeforeCall(PostWatermarkRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  FilesResult  postWatermark(PostWatermarkRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< FilesResult > resp = postWatermarkWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< FilesResult > resp = postWatermarkWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< FilesResult > postWatermarkWithHttpInfo(PostWatermarkRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postWatermarkValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< FilesResult >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postWatermarkAsync( PostWatermarkRequest request, final ApiCallback< FilesResult > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postWatermarkValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< FilesResult >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postClearObjectsValidateBeforeCall(PostClearObjectsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  FilesResult  postClearObjects(PostClearObjectsRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< FilesResult > resp = postClearObjectsWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< FilesResult > resp = postClearObjectsWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< FilesResult > postClearObjectsWithHttpInfo(PostClearObjectsRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postClearObjectsValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< FilesResult >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postClearObjectsAsync( PostClearObjectsRequest request, final ApiCallback< FilesResult > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postClearObjectsValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< FilesResult >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postReverseValidateBeforeCall(PostReverseRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  FilesResult  postReverse(PostReverseRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< FilesResult > resp = postReverseWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< FilesResult > resp = postReverseWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< FilesResult > postReverseWithHttpInfo(PostReverseRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postReverseValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< FilesResult >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postReverseAsync( PostReverseRequest request, final ApiCallback< FilesResult > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postReverseValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< FilesResult >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postRepairValidateBeforeCall(PostRepairRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  FilesResult  postRepair(PostRepairRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< FilesResult > resp = postRepairWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< FilesResult > resp = postRepairWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< FilesResult > postRepairWithHttpInfo(PostRepairRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postRepairValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< FilesResult >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postRepairAsync( PostRepairRequest request, final ApiCallback< FilesResult > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postRepairValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< FilesResult >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postRotateValidateBeforeCall(PostRotateRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  FilesResult  postRotate(PostRotateRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< FilesResult > resp = postRotateWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< FilesResult > resp = postRotateWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< FilesResult > postRotateWithHttpInfo(PostRotateRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postRotateValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< FilesResult >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postRotateAsync( PostRotateRequest request, final ApiCallback< FilesResult > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postRotateValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< FilesResult >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postMetadataValidateBeforeCall(PostMetadataRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  FilesResult  postMetadata(PostMetadataRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< FilesResult > resp = postMetadataWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< FilesResult > resp = postMetadataWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< FilesResult > postMetadataWithHttpInfo(PostMetadataRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postMetadataValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< FilesResult >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postMetadataAsync( PostMetadataRequest request, final ApiCallback< FilesResult > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postMetadataValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< FilesResult >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getMetadataValidateBeforeCall(GetMetadataRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  List<CellsDocumentProperty>  getMetadata(GetMetadataRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< List<CellsDocumentProperty> > resp = getMetadataWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< List<CellsDocumentProperty> > resp = getMetadataWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< List<CellsDocumentProperty> > getMetadataWithHttpInfo(GetMetadataRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getMetadataValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< List<CellsDocumentProperty> >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getMetadataAsync( GetMetadataRequest request, final ApiCallback< List<CellsDocumentProperty> > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getMetadataValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< List<CellsDocumentProperty> >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call deleteMetadataValidateBeforeCall(DeleteMetadataRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  FilesResult  deleteMetadata(DeleteMetadataRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< FilesResult > resp = deleteMetadataWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< FilesResult > resp = deleteMetadataWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< FilesResult > deleteMetadataWithHttpInfo(DeleteMetadataRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  deleteMetadataValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< FilesResult >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  deleteMetadataAsync( DeleteMetadataRequest request, final ApiCallback< FilesResult > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  deleteMetadataValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< FilesResult >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getWorksheetListObjectsValidateBeforeCall(GetWorksheetListObjectsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  ListObjectsResponse  getWorksheetListObjects(GetWorksheetListObjectsRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< ListObjectsResponse > resp = getWorksheetListObjectsWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< ListObjectsResponse > resp = getWorksheetListObjectsWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< ListObjectsResponse > getWorksheetListObjectsWithHttpInfo(GetWorksheetListObjectsRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getWorksheetListObjectsValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< ListObjectsResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getWorksheetListObjectsAsync( GetWorksheetListObjectsRequest request, final ApiCallback< ListObjectsResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getWorksheetListObjectsValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< ListObjectsResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getWorksheetListObjectValidateBeforeCall(GetWorksheetListObjectRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  File  getWorksheetListObject(GetWorksheetListObjectRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< File > resp = getWorksheetListObjectWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< File > resp = getWorksheetListObjectWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< File > getWorksheetListObjectWithHttpInfo(GetWorksheetListObjectRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getWorksheetListObjectValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< File >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getWorksheetListObjectAsync( GetWorksheetListObjectRequest request, final ApiCallback< HashMap<String,File> > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getWorksheetListObjectValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< HashMap<String,File> >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call putWorksheetListObjectValidateBeforeCall(PutWorksheetListObjectRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  putWorksheetListObject(PutWorksheetListObjectRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = putWorksheetListObjectWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = putWorksheetListObjectWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > putWorksheetListObjectWithHttpInfo(PutWorksheetListObjectRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  putWorksheetListObjectValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  putWorksheetListObjectAsync( PutWorksheetListObjectRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  putWorksheetListObjectValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call deleteWorksheetListObjectsValidateBeforeCall(DeleteWorksheetListObjectsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  deleteWorksheetListObjects(DeleteWorksheetListObjectsRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = deleteWorksheetListObjectsWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = deleteWorksheetListObjectsWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > deleteWorksheetListObjectsWithHttpInfo(DeleteWorksheetListObjectsRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  deleteWorksheetListObjectsValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  deleteWorksheetListObjectsAsync( DeleteWorksheetListObjectsRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  deleteWorksheetListObjectsValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call deleteWorksheetListObjectValidateBeforeCall(DeleteWorksheetListObjectRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  deleteWorksheetListObject(DeleteWorksheetListObjectRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = deleteWorksheetListObjectWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = deleteWorksheetListObjectWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > deleteWorksheetListObjectWithHttpInfo(DeleteWorksheetListObjectRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  deleteWorksheetListObjectValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  deleteWorksheetListObjectAsync( DeleteWorksheetListObjectRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  deleteWorksheetListObjectValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postWorksheetListObjectValidateBeforeCall(PostWorksheetListObjectRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postWorksheetListObject(PostWorksheetListObjectRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postWorksheetListObjectWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postWorksheetListObjectWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postWorksheetListObjectWithHttpInfo(PostWorksheetListObjectRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postWorksheetListObjectValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postWorksheetListObjectAsync( PostWorksheetListObjectRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postWorksheetListObjectValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postWorksheetListObjectConvertToRangeValidateBeforeCall(PostWorksheetListObjectConvertToRangeRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postWorksheetListObjectConvertToRange(PostWorksheetListObjectConvertToRangeRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postWorksheetListObjectConvertToRangeWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postWorksheetListObjectConvertToRangeWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postWorksheetListObjectConvertToRangeWithHttpInfo(PostWorksheetListObjectConvertToRangeRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postWorksheetListObjectConvertToRangeValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postWorksheetListObjectConvertToRangeAsync( PostWorksheetListObjectConvertToRangeRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postWorksheetListObjectConvertToRangeValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postWorksheetListObjectSummarizeWithPivotTableValidateBeforeCall(PostWorksheetListObjectSummarizeWithPivotTableRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postWorksheetListObjectSummarizeWithPivotTable(PostWorksheetListObjectSummarizeWithPivotTableRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postWorksheetListObjectSummarizeWithPivotTableWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postWorksheetListObjectSummarizeWithPivotTableWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postWorksheetListObjectSummarizeWithPivotTableWithHttpInfo(PostWorksheetListObjectSummarizeWithPivotTableRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postWorksheetListObjectSummarizeWithPivotTableValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postWorksheetListObjectSummarizeWithPivotTableAsync( PostWorksheetListObjectSummarizeWithPivotTableRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postWorksheetListObjectSummarizeWithPivotTableValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postWorksheetListObjectSortTableValidateBeforeCall(PostWorksheetListObjectSortTableRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postWorksheetListObjectSortTable(PostWorksheetListObjectSortTableRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postWorksheetListObjectSortTableWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postWorksheetListObjectSortTableWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postWorksheetListObjectSortTableWithHttpInfo(PostWorksheetListObjectSortTableRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postWorksheetListObjectSortTableValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postWorksheetListObjectSortTableAsync( PostWorksheetListObjectSortTableRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postWorksheetListObjectSortTableValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postWorksheetListObjectRemoveDuplicatesValidateBeforeCall(PostWorksheetListObjectRemoveDuplicatesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postWorksheetListObjectRemoveDuplicates(PostWorksheetListObjectRemoveDuplicatesRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postWorksheetListObjectRemoveDuplicatesWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postWorksheetListObjectRemoveDuplicatesWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postWorksheetListObjectRemoveDuplicatesWithHttpInfo(PostWorksheetListObjectRemoveDuplicatesRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postWorksheetListObjectRemoveDuplicatesValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postWorksheetListObjectRemoveDuplicatesAsync( PostWorksheetListObjectRemoveDuplicatesRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postWorksheetListObjectRemoveDuplicatesValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postWorksheetListObjectInsertSlicerValidateBeforeCall(PostWorksheetListObjectInsertSlicerRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postWorksheetListObjectInsertSlicer(PostWorksheetListObjectInsertSlicerRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postWorksheetListObjectInsertSlicerWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postWorksheetListObjectInsertSlicerWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postWorksheetListObjectInsertSlicerWithHttpInfo(PostWorksheetListObjectInsertSlicerRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postWorksheetListObjectInsertSlicerValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postWorksheetListObjectInsertSlicerAsync( PostWorksheetListObjectInsertSlicerRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postWorksheetListObjectInsertSlicerValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postWorksheetListColumnValidateBeforeCall(PostWorksheetListColumnRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postWorksheetListColumn(PostWorksheetListColumnRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postWorksheetListColumnWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postWorksheetListColumnWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postWorksheetListColumnWithHttpInfo(PostWorksheetListColumnRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postWorksheetListColumnValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postWorksheetListColumnAsync( PostWorksheetListColumnRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postWorksheetListColumnValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postWorksheetListColumnsTotalValidateBeforeCall(PostWorksheetListColumnsTotalRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postWorksheetListColumnsTotal(PostWorksheetListColumnsTotalRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postWorksheetListColumnsTotalWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postWorksheetListColumnsTotalWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postWorksheetListColumnsTotalWithHttpInfo(PostWorksheetListColumnsTotalRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postWorksheetListColumnsTotalValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postWorksheetListColumnsTotalAsync( PostWorksheetListColumnsTotalRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postWorksheetListColumnsTotalValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getWorksheetOleObjectsValidateBeforeCall(GetWorksheetOleObjectsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  OleObjectsResponse  getWorksheetOleObjects(GetWorksheetOleObjectsRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< OleObjectsResponse > resp = getWorksheetOleObjectsWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< OleObjectsResponse > resp = getWorksheetOleObjectsWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< OleObjectsResponse > getWorksheetOleObjectsWithHttpInfo(GetWorksheetOleObjectsRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getWorksheetOleObjectsValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< OleObjectsResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getWorksheetOleObjectsAsync( GetWorksheetOleObjectsRequest request, final ApiCallback< OleObjectsResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getWorksheetOleObjectsValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< OleObjectsResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getWorksheetOleObjectValidateBeforeCall(GetWorksheetOleObjectRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  File  getWorksheetOleObject(GetWorksheetOleObjectRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< File > resp = getWorksheetOleObjectWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< File > resp = getWorksheetOleObjectWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< File > getWorksheetOleObjectWithHttpInfo(GetWorksheetOleObjectRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getWorksheetOleObjectValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< File >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getWorksheetOleObjectAsync( GetWorksheetOleObjectRequest request, final ApiCallback< HashMap<String,File> > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getWorksheetOleObjectValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< HashMap<String,File> >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call deleteWorksheetOleObjectsValidateBeforeCall(DeleteWorksheetOleObjectsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  deleteWorksheetOleObjects(DeleteWorksheetOleObjectsRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = deleteWorksheetOleObjectsWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = deleteWorksheetOleObjectsWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > deleteWorksheetOleObjectsWithHttpInfo(DeleteWorksheetOleObjectsRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  deleteWorksheetOleObjectsValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  deleteWorksheetOleObjectsAsync( DeleteWorksheetOleObjectsRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  deleteWorksheetOleObjectsValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call deleteWorksheetOleObjectValidateBeforeCall(DeleteWorksheetOleObjectRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  deleteWorksheetOleObject(DeleteWorksheetOleObjectRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = deleteWorksheetOleObjectWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = deleteWorksheetOleObjectWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > deleteWorksheetOleObjectWithHttpInfo(DeleteWorksheetOleObjectRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  deleteWorksheetOleObjectValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  deleteWorksheetOleObjectAsync( DeleteWorksheetOleObjectRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  deleteWorksheetOleObjectValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postUpdateWorksheetOleObjectValidateBeforeCall(PostUpdateWorksheetOleObjectRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postUpdateWorksheetOleObject(PostUpdateWorksheetOleObjectRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postUpdateWorksheetOleObjectWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postUpdateWorksheetOleObjectWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postUpdateWorksheetOleObjectWithHttpInfo(PostUpdateWorksheetOleObjectRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postUpdateWorksheetOleObjectValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postUpdateWorksheetOleObjectAsync( PostUpdateWorksheetOleObjectRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postUpdateWorksheetOleObjectValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call putWorksheetOleObjectValidateBeforeCall(PutWorksheetOleObjectRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  putWorksheetOleObject(PutWorksheetOleObjectRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = putWorksheetOleObjectWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = putWorksheetOleObjectWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > putWorksheetOleObjectWithHttpInfo(PutWorksheetOleObjectRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  putWorksheetOleObjectValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  putWorksheetOleObjectAsync( PutWorksheetOleObjectRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  putWorksheetOleObjectValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getVerticalPageBreaksValidateBeforeCall(GetVerticalPageBreaksRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  VerticalPageBreaksResponse  getVerticalPageBreaks(GetVerticalPageBreaksRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< VerticalPageBreaksResponse > resp = getVerticalPageBreaksWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< VerticalPageBreaksResponse > resp = getVerticalPageBreaksWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< VerticalPageBreaksResponse > getVerticalPageBreaksWithHttpInfo(GetVerticalPageBreaksRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getVerticalPageBreaksValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< VerticalPageBreaksResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getVerticalPageBreaksAsync( GetVerticalPageBreaksRequest request, final ApiCallback< VerticalPageBreaksResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getVerticalPageBreaksValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< VerticalPageBreaksResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getHorizontalPageBreaksValidateBeforeCall(GetHorizontalPageBreaksRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  HorizontalPageBreaksResponse  getHorizontalPageBreaks(GetHorizontalPageBreaksRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< HorizontalPageBreaksResponse > resp = getHorizontalPageBreaksWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< HorizontalPageBreaksResponse > resp = getHorizontalPageBreaksWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< HorizontalPageBreaksResponse > getHorizontalPageBreaksWithHttpInfo(GetHorizontalPageBreaksRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getHorizontalPageBreaksValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< HorizontalPageBreaksResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getHorizontalPageBreaksAsync( GetHorizontalPageBreaksRequest request, final ApiCallback< HorizontalPageBreaksResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getHorizontalPageBreaksValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< HorizontalPageBreaksResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getVerticalPageBreakValidateBeforeCall(GetVerticalPageBreakRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  VerticalPageBreakResponse  getVerticalPageBreak(GetVerticalPageBreakRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< VerticalPageBreakResponse > resp = getVerticalPageBreakWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< VerticalPageBreakResponse > resp = getVerticalPageBreakWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< VerticalPageBreakResponse > getVerticalPageBreakWithHttpInfo(GetVerticalPageBreakRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getVerticalPageBreakValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< VerticalPageBreakResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getVerticalPageBreakAsync( GetVerticalPageBreakRequest request, final ApiCallback< VerticalPageBreakResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getVerticalPageBreakValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< VerticalPageBreakResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getHorizontalPageBreakValidateBeforeCall(GetHorizontalPageBreakRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  HorizontalPageBreakResponse  getHorizontalPageBreak(GetHorizontalPageBreakRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< HorizontalPageBreakResponse > resp = getHorizontalPageBreakWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< HorizontalPageBreakResponse > resp = getHorizontalPageBreakWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< HorizontalPageBreakResponse > getHorizontalPageBreakWithHttpInfo(GetHorizontalPageBreakRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getHorizontalPageBreakValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< HorizontalPageBreakResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getHorizontalPageBreakAsync( GetHorizontalPageBreakRequest request, final ApiCallback< HorizontalPageBreakResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getHorizontalPageBreakValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< HorizontalPageBreakResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call putVerticalPageBreakValidateBeforeCall(PutVerticalPageBreakRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  putVerticalPageBreak(PutVerticalPageBreakRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = putVerticalPageBreakWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = putVerticalPageBreakWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > putVerticalPageBreakWithHttpInfo(PutVerticalPageBreakRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  putVerticalPageBreakValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  putVerticalPageBreakAsync( PutVerticalPageBreakRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  putVerticalPageBreakValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call putHorizontalPageBreakValidateBeforeCall(PutHorizontalPageBreakRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  putHorizontalPageBreak(PutHorizontalPageBreakRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = putHorizontalPageBreakWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = putHorizontalPageBreakWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > putHorizontalPageBreakWithHttpInfo(PutHorizontalPageBreakRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  putHorizontalPageBreakValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  putHorizontalPageBreakAsync( PutHorizontalPageBreakRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  putHorizontalPageBreakValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call deleteVerticalPageBreaksValidateBeforeCall(DeleteVerticalPageBreaksRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  deleteVerticalPageBreaks(DeleteVerticalPageBreaksRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = deleteVerticalPageBreaksWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = deleteVerticalPageBreaksWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > deleteVerticalPageBreaksWithHttpInfo(DeleteVerticalPageBreaksRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  deleteVerticalPageBreaksValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  deleteVerticalPageBreaksAsync( DeleteVerticalPageBreaksRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  deleteVerticalPageBreaksValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call deleteHorizontalPageBreaksValidateBeforeCall(DeleteHorizontalPageBreaksRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  deleteHorizontalPageBreaks(DeleteHorizontalPageBreaksRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = deleteHorizontalPageBreaksWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = deleteHorizontalPageBreaksWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > deleteHorizontalPageBreaksWithHttpInfo(DeleteHorizontalPageBreaksRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  deleteHorizontalPageBreaksValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  deleteHorizontalPageBreaksAsync( DeleteHorizontalPageBreaksRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  deleteHorizontalPageBreaksValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call deleteVerticalPageBreakValidateBeforeCall(DeleteVerticalPageBreakRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  deleteVerticalPageBreak(DeleteVerticalPageBreakRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = deleteVerticalPageBreakWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = deleteVerticalPageBreakWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > deleteVerticalPageBreakWithHttpInfo(DeleteVerticalPageBreakRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  deleteVerticalPageBreakValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  deleteVerticalPageBreakAsync( DeleteVerticalPageBreakRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  deleteVerticalPageBreakValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call deleteHorizontalPageBreakValidateBeforeCall(DeleteHorizontalPageBreakRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  deleteHorizontalPageBreak(DeleteHorizontalPageBreakRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = deleteHorizontalPageBreakWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = deleteHorizontalPageBreakWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > deleteHorizontalPageBreakWithHttpInfo(DeleteHorizontalPageBreakRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  deleteHorizontalPageBreakValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  deleteHorizontalPageBreakAsync( DeleteHorizontalPageBreakRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  deleteHorizontalPageBreakValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getPageSetupValidateBeforeCall(GetPageSetupRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  PageSetupResponse  getPageSetup(GetPageSetupRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< PageSetupResponse > resp = getPageSetupWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< PageSetupResponse > resp = getPageSetupWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< PageSetupResponse > getPageSetupWithHttpInfo(GetPageSetupRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getPageSetupValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< PageSetupResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getPageSetupAsync( GetPageSetupRequest request, final ApiCallback< PageSetupResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getPageSetupValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< PageSetupResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postPageSetupValidateBeforeCall(PostPageSetupRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postPageSetup(PostPageSetupRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postPageSetupWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postPageSetupWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postPageSetupWithHttpInfo(PostPageSetupRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postPageSetupValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postPageSetupAsync( PostPageSetupRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postPageSetupValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call deleteHeaderFooterValidateBeforeCall(DeleteHeaderFooterRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  deleteHeaderFooter(DeleteHeaderFooterRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = deleteHeaderFooterWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = deleteHeaderFooterWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > deleteHeaderFooterWithHttpInfo(DeleteHeaderFooterRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  deleteHeaderFooterValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  deleteHeaderFooterAsync( DeleteHeaderFooterRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  deleteHeaderFooterValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getHeaderValidateBeforeCall(GetHeaderRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  PageSectionsResponse  getHeader(GetHeaderRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< PageSectionsResponse > resp = getHeaderWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< PageSectionsResponse > resp = getHeaderWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< PageSectionsResponse > getHeaderWithHttpInfo(GetHeaderRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getHeaderValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< PageSectionsResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getHeaderAsync( GetHeaderRequest request, final ApiCallback< PageSectionsResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getHeaderValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< PageSectionsResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postHeaderValidateBeforeCall(PostHeaderRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postHeader(PostHeaderRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postHeaderWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postHeaderWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postHeaderWithHttpInfo(PostHeaderRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postHeaderValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postHeaderAsync( PostHeaderRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postHeaderValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getFooterValidateBeforeCall(GetFooterRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  PageSectionsResponse  getFooter(GetFooterRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< PageSectionsResponse > resp = getFooterWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< PageSectionsResponse > resp = getFooterWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< PageSectionsResponse > getFooterWithHttpInfo(GetFooterRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getFooterValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< PageSectionsResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getFooterAsync( GetFooterRequest request, final ApiCallback< PageSectionsResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getFooterValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< PageSectionsResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postFooterValidateBeforeCall(PostFooterRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postFooter(PostFooterRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postFooterWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postFooterWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postFooterWithHttpInfo(PostFooterRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postFooterValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postFooterAsync( PostFooterRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postFooterValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postFitWideToPagesValidateBeforeCall(PostFitWideToPagesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postFitWideToPages(PostFitWideToPagesRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postFitWideToPagesWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postFitWideToPagesWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postFitWideToPagesWithHttpInfo(PostFitWideToPagesRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postFitWideToPagesValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postFitWideToPagesAsync( PostFitWideToPagesRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postFitWideToPagesValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postFitTallToPagesValidateBeforeCall(PostFitTallToPagesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postFitTallToPages(PostFitTallToPagesRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postFitTallToPagesWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postFitTallToPagesWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postFitTallToPagesWithHttpInfo(PostFitTallToPagesRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postFitTallToPagesValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postFitTallToPagesAsync( PostFitTallToPagesRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postFitTallToPagesValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getWorksheetPicturesValidateBeforeCall(GetWorksheetPicturesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  PicturesResponse  getWorksheetPictures(GetWorksheetPicturesRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< PicturesResponse > resp = getWorksheetPicturesWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< PicturesResponse > resp = getWorksheetPicturesWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< PicturesResponse > getWorksheetPicturesWithHttpInfo(GetWorksheetPicturesRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getWorksheetPicturesValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< PicturesResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getWorksheetPicturesAsync( GetWorksheetPicturesRequest request, final ApiCallback< PicturesResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getWorksheetPicturesValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< PicturesResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getWorksheetPictureWithFormatValidateBeforeCall(GetWorksheetPictureWithFormatRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  File  getWorksheetPictureWithFormat(GetWorksheetPictureWithFormatRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< File > resp = getWorksheetPictureWithFormatWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< File > resp = getWorksheetPictureWithFormatWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< File > getWorksheetPictureWithFormatWithHttpInfo(GetWorksheetPictureWithFormatRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getWorksheetPictureWithFormatValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< File >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getWorksheetPictureWithFormatAsync( GetWorksheetPictureWithFormatRequest request, final ApiCallback< HashMap<String,File> > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getWorksheetPictureWithFormatValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< HashMap<String,File> >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call putWorksheetAddPictureValidateBeforeCall(PutWorksheetAddPictureRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  putWorksheetAddPicture(PutWorksheetAddPictureRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = putWorksheetAddPictureWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = putWorksheetAddPictureWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > putWorksheetAddPictureWithHttpInfo(PutWorksheetAddPictureRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  putWorksheetAddPictureValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  putWorksheetAddPictureAsync( PutWorksheetAddPictureRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  putWorksheetAddPictureValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postWorksheetPictureValidateBeforeCall(PostWorksheetPictureRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postWorksheetPicture(PostWorksheetPictureRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postWorksheetPictureWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postWorksheetPictureWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postWorksheetPictureWithHttpInfo(PostWorksheetPictureRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postWorksheetPictureValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postWorksheetPictureAsync( PostWorksheetPictureRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postWorksheetPictureValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call deleteWorksheetPictureValidateBeforeCall(DeleteWorksheetPictureRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  deleteWorksheetPicture(DeleteWorksheetPictureRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = deleteWorksheetPictureWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = deleteWorksheetPictureWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > deleteWorksheetPictureWithHttpInfo(DeleteWorksheetPictureRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  deleteWorksheetPictureValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  deleteWorksheetPictureAsync( DeleteWorksheetPictureRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  deleteWorksheetPictureValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call deleteWorksheetPicturesValidateBeforeCall(DeleteWorksheetPicturesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  deleteWorksheetPictures(DeleteWorksheetPicturesRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = deleteWorksheetPicturesWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = deleteWorksheetPicturesWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > deleteWorksheetPicturesWithHttpInfo(DeleteWorksheetPicturesRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  deleteWorksheetPicturesValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  deleteWorksheetPicturesAsync( DeleteWorksheetPicturesRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  deleteWorksheetPicturesValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getWorksheetPivotTablesValidateBeforeCall(GetWorksheetPivotTablesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  PivotTablesResponse  getWorksheetPivotTables(GetWorksheetPivotTablesRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< PivotTablesResponse > resp = getWorksheetPivotTablesWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< PivotTablesResponse > resp = getWorksheetPivotTablesWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< PivotTablesResponse > getWorksheetPivotTablesWithHttpInfo(GetWorksheetPivotTablesRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getWorksheetPivotTablesValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< PivotTablesResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getWorksheetPivotTablesAsync( GetWorksheetPivotTablesRequest request, final ApiCallback< PivotTablesResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getWorksheetPivotTablesValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< PivotTablesResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getWorksheetPivotTableValidateBeforeCall(GetWorksheetPivotTableRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  PivotTableResponse  getWorksheetPivotTable(GetWorksheetPivotTableRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< PivotTableResponse > resp = getWorksheetPivotTableWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< PivotTableResponse > resp = getWorksheetPivotTableWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< PivotTableResponse > getWorksheetPivotTableWithHttpInfo(GetWorksheetPivotTableRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getWorksheetPivotTableValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< PivotTableResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getWorksheetPivotTableAsync( GetWorksheetPivotTableRequest request, final ApiCallback< PivotTableResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getWorksheetPivotTableValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< PivotTableResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getPivotTableFieldValidateBeforeCall(GetPivotTableFieldRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  PivotFieldResponse  getPivotTableField(GetPivotTableFieldRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< PivotFieldResponse > resp = getPivotTableFieldWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< PivotFieldResponse > resp = getPivotTableFieldWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< PivotFieldResponse > getPivotTableFieldWithHttpInfo(GetPivotTableFieldRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getPivotTableFieldValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< PivotFieldResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getPivotTableFieldAsync( GetPivotTableFieldRequest request, final ApiCallback< PivotFieldResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getPivotTableFieldValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< PivotFieldResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getWorksheetPivotTableFiltersValidateBeforeCall(GetWorksheetPivotTableFiltersRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  PivotFiltersResponse  getWorksheetPivotTableFilters(GetWorksheetPivotTableFiltersRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< PivotFiltersResponse > resp = getWorksheetPivotTableFiltersWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< PivotFiltersResponse > resp = getWorksheetPivotTableFiltersWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< PivotFiltersResponse > getWorksheetPivotTableFiltersWithHttpInfo(GetWorksheetPivotTableFiltersRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getWorksheetPivotTableFiltersValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< PivotFiltersResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getWorksheetPivotTableFiltersAsync( GetWorksheetPivotTableFiltersRequest request, final ApiCallback< PivotFiltersResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getWorksheetPivotTableFiltersValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< PivotFiltersResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getWorksheetPivotTableFilterValidateBeforeCall(GetWorksheetPivotTableFilterRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  PivotFilterResponse  getWorksheetPivotTableFilter(GetWorksheetPivotTableFilterRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< PivotFilterResponse > resp = getWorksheetPivotTableFilterWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< PivotFilterResponse > resp = getWorksheetPivotTableFilterWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< PivotFilterResponse > getWorksheetPivotTableFilterWithHttpInfo(GetWorksheetPivotTableFilterRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getWorksheetPivotTableFilterValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< PivotFilterResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getWorksheetPivotTableFilterAsync( GetWorksheetPivotTableFilterRequest request, final ApiCallback< PivotFilterResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getWorksheetPivotTableFilterValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< PivotFilterResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call putWorksheetPivotTableValidateBeforeCall(PutWorksheetPivotTableRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  putWorksheetPivotTable(PutWorksheetPivotTableRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = putWorksheetPivotTableWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = putWorksheetPivotTableWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > putWorksheetPivotTableWithHttpInfo(PutWorksheetPivotTableRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  putWorksheetPivotTableValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  putWorksheetPivotTableAsync( PutWorksheetPivotTableRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  putWorksheetPivotTableValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call putPivotTableFieldValidateBeforeCall(PutPivotTableFieldRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  putPivotTableField(PutPivotTableFieldRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = putPivotTableFieldWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = putPivotTableFieldWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > putPivotTableFieldWithHttpInfo(PutPivotTableFieldRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  putPivotTableFieldValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  putPivotTableFieldAsync( PutPivotTableFieldRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  putPivotTableFieldValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call putWorksheetPivotTableFilterValidateBeforeCall(PutWorksheetPivotTableFilterRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  putWorksheetPivotTableFilter(PutWorksheetPivotTableFilterRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = putWorksheetPivotTableFilterWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = putWorksheetPivotTableFilterWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > putWorksheetPivotTableFilterWithHttpInfo(PutWorksheetPivotTableFilterRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  putWorksheetPivotTableFilterValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  putWorksheetPivotTableFilterAsync( PutWorksheetPivotTableFilterRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  putWorksheetPivotTableFilterValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postPivotTableFieldHideItemValidateBeforeCall(PostPivotTableFieldHideItemRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postPivotTableFieldHideItem(PostPivotTableFieldHideItemRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postPivotTableFieldHideItemWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postPivotTableFieldHideItemWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postPivotTableFieldHideItemWithHttpInfo(PostPivotTableFieldHideItemRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postPivotTableFieldHideItemValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postPivotTableFieldHideItemAsync( PostPivotTableFieldHideItemRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postPivotTableFieldHideItemValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postPivotTableFieldMoveToValidateBeforeCall(PostPivotTableFieldMoveToRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postPivotTableFieldMoveTo(PostPivotTableFieldMoveToRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postPivotTableFieldMoveToWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postPivotTableFieldMoveToWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postPivotTableFieldMoveToWithHttpInfo(PostPivotTableFieldMoveToRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postPivotTableFieldMoveToValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postPivotTableFieldMoveToAsync( PostPivotTableFieldMoveToRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postPivotTableFieldMoveToValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postPivotTableCellStyleValidateBeforeCall(PostPivotTableCellStyleRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postPivotTableCellStyle(PostPivotTableCellStyleRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postPivotTableCellStyleWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postPivotTableCellStyleWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postPivotTableCellStyleWithHttpInfo(PostPivotTableCellStyleRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postPivotTableCellStyleValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postPivotTableCellStyleAsync( PostPivotTableCellStyleRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postPivotTableCellStyleValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postPivotTableStyleValidateBeforeCall(PostPivotTableStyleRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postPivotTableStyle(PostPivotTableStyleRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postPivotTableStyleWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postPivotTableStyleWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postPivotTableStyleWithHttpInfo(PostPivotTableStyleRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postPivotTableStyleValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postPivotTableStyleAsync( PostPivotTableStyleRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postPivotTableStyleValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postPivotTableUpdatePivotFieldsValidateBeforeCall(PostPivotTableUpdatePivotFieldsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postPivotTableUpdatePivotFields(PostPivotTableUpdatePivotFieldsRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postPivotTableUpdatePivotFieldsWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postPivotTableUpdatePivotFieldsWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postPivotTableUpdatePivotFieldsWithHttpInfo(PostPivotTableUpdatePivotFieldsRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postPivotTableUpdatePivotFieldsValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postPivotTableUpdatePivotFieldsAsync( PostPivotTableUpdatePivotFieldsRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postPivotTableUpdatePivotFieldsValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postPivotTableUpdatePivotFieldValidateBeforeCall(PostPivotTableUpdatePivotFieldRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postPivotTableUpdatePivotField(PostPivotTableUpdatePivotFieldRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postPivotTableUpdatePivotFieldWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postPivotTableUpdatePivotFieldWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postPivotTableUpdatePivotFieldWithHttpInfo(PostPivotTableUpdatePivotFieldRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postPivotTableUpdatePivotFieldValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postPivotTableUpdatePivotFieldAsync( PostPivotTableUpdatePivotFieldRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postPivotTableUpdatePivotFieldValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postWorksheetPivotTableCalculateValidateBeforeCall(PostWorksheetPivotTableCalculateRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postWorksheetPivotTableCalculate(PostWorksheetPivotTableCalculateRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postWorksheetPivotTableCalculateWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postWorksheetPivotTableCalculateWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postWorksheetPivotTableCalculateWithHttpInfo(PostWorksheetPivotTableCalculateRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postWorksheetPivotTableCalculateValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postWorksheetPivotTableCalculateAsync( PostWorksheetPivotTableCalculateRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postWorksheetPivotTableCalculateValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postWorksheetPivotTableMoveValidateBeforeCall(PostWorksheetPivotTableMoveRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postWorksheetPivotTableMove(PostWorksheetPivotTableMoveRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postWorksheetPivotTableMoveWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postWorksheetPivotTableMoveWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postWorksheetPivotTableMoveWithHttpInfo(PostWorksheetPivotTableMoveRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postWorksheetPivotTableMoveValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postWorksheetPivotTableMoveAsync( PostWorksheetPivotTableMoveRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postWorksheetPivotTableMoveValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call deleteWorksheetPivotTablesValidateBeforeCall(DeleteWorksheetPivotTablesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  deleteWorksheetPivotTables(DeleteWorksheetPivotTablesRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = deleteWorksheetPivotTablesWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = deleteWorksheetPivotTablesWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > deleteWorksheetPivotTablesWithHttpInfo(DeleteWorksheetPivotTablesRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  deleteWorksheetPivotTablesValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  deleteWorksheetPivotTablesAsync( DeleteWorksheetPivotTablesRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  deleteWorksheetPivotTablesValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call deleteWorksheetPivotTableValidateBeforeCall(DeleteWorksheetPivotTableRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  deleteWorksheetPivotTable(DeleteWorksheetPivotTableRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = deleteWorksheetPivotTableWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = deleteWorksheetPivotTableWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > deleteWorksheetPivotTableWithHttpInfo(DeleteWorksheetPivotTableRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  deleteWorksheetPivotTableValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  deleteWorksheetPivotTableAsync( DeleteWorksheetPivotTableRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  deleteWorksheetPivotTableValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call deletePivotTableFieldValidateBeforeCall(DeletePivotTableFieldRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  deletePivotTableField(DeletePivotTableFieldRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = deletePivotTableFieldWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = deletePivotTableFieldWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > deletePivotTableFieldWithHttpInfo(DeletePivotTableFieldRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  deletePivotTableFieldValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  deletePivotTableFieldAsync( DeletePivotTableFieldRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  deletePivotTableFieldValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call deleteWorksheetPivotTableFiltersValidateBeforeCall(DeleteWorksheetPivotTableFiltersRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  deleteWorksheetPivotTableFilters(DeleteWorksheetPivotTableFiltersRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = deleteWorksheetPivotTableFiltersWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = deleteWorksheetPivotTableFiltersWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > deleteWorksheetPivotTableFiltersWithHttpInfo(DeleteWorksheetPivotTableFiltersRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  deleteWorksheetPivotTableFiltersValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  deleteWorksheetPivotTableFiltersAsync( DeleteWorksheetPivotTableFiltersRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  deleteWorksheetPivotTableFiltersValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call deleteWorksheetPivotTableFilterValidateBeforeCall(DeleteWorksheetPivotTableFilterRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  deleteWorksheetPivotTableFilter(DeleteWorksheetPivotTableFilterRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = deleteWorksheetPivotTableFilterWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = deleteWorksheetPivotTableFilterWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > deleteWorksheetPivotTableFilterWithHttpInfo(DeleteWorksheetPivotTableFilterRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  deleteWorksheetPivotTableFilterValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  deleteWorksheetPivotTableFilterAsync( DeleteWorksheetPivotTableFilterRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  deleteWorksheetPivotTableFilterValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getDocumentPropertiesValidateBeforeCall(GetDocumentPropertiesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsDocumentPropertiesResponse  getDocumentProperties(GetDocumentPropertiesRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsDocumentPropertiesResponse > resp = getDocumentPropertiesWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsDocumentPropertiesResponse > resp = getDocumentPropertiesWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsDocumentPropertiesResponse > getDocumentPropertiesWithHttpInfo(GetDocumentPropertiesRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getDocumentPropertiesValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsDocumentPropertiesResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getDocumentPropertiesAsync( GetDocumentPropertiesRequest request, final ApiCallback< CellsDocumentPropertiesResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getDocumentPropertiesValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsDocumentPropertiesResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call putDocumentPropertyValidateBeforeCall(PutDocumentPropertyRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  putDocumentProperty(PutDocumentPropertyRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = putDocumentPropertyWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = putDocumentPropertyWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > putDocumentPropertyWithHttpInfo(PutDocumentPropertyRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  putDocumentPropertyValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  putDocumentPropertyAsync( PutDocumentPropertyRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  putDocumentPropertyValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getDocumentPropertyValidateBeforeCall(GetDocumentPropertyRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsDocumentPropertyResponse  getDocumentProperty(GetDocumentPropertyRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsDocumentPropertyResponse > resp = getDocumentPropertyWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsDocumentPropertyResponse > resp = getDocumentPropertyWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsDocumentPropertyResponse > getDocumentPropertyWithHttpInfo(GetDocumentPropertyRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getDocumentPropertyValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsDocumentPropertyResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getDocumentPropertyAsync( GetDocumentPropertyRequest request, final ApiCallback< CellsDocumentPropertyResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getDocumentPropertyValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsDocumentPropertyResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call deleteDocumentPropertyValidateBeforeCall(DeleteDocumentPropertyRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  deleteDocumentProperty(DeleteDocumentPropertyRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = deleteDocumentPropertyWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = deleteDocumentPropertyWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > deleteDocumentPropertyWithHttpInfo(DeleteDocumentPropertyRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  deleteDocumentPropertyValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  deleteDocumentPropertyAsync( DeleteDocumentPropertyRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  deleteDocumentPropertyValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call deleteDocumentPropertiesValidateBeforeCall(DeleteDocumentPropertiesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  deleteDocumentProperties(DeleteDocumentPropertiesRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = deleteDocumentPropertiesWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = deleteDocumentPropertiesWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > deleteDocumentPropertiesWithHttpInfo(DeleteDocumentPropertiesRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  deleteDocumentPropertiesValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  deleteDocumentPropertiesAsync( DeleteDocumentPropertiesRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  deleteDocumentPropertiesValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postDigitalSignatureValidateBeforeCall(PostDigitalSignatureRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postDigitalSignature(PostDigitalSignatureRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postDigitalSignatureWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postDigitalSignatureWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postDigitalSignatureWithHttpInfo(PostDigitalSignatureRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postDigitalSignatureValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postDigitalSignatureAsync( PostDigitalSignatureRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postDigitalSignatureValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postEncryptWorkbookValidateBeforeCall(PostEncryptWorkbookRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postEncryptWorkbook(PostEncryptWorkbookRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postEncryptWorkbookWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postEncryptWorkbookWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postEncryptWorkbookWithHttpInfo(PostEncryptWorkbookRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postEncryptWorkbookValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postEncryptWorkbookAsync( PostEncryptWorkbookRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postEncryptWorkbookValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call deleteDecryptWorkbookValidateBeforeCall(DeleteDecryptWorkbookRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  deleteDecryptWorkbook(DeleteDecryptWorkbookRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = deleteDecryptWorkbookWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = deleteDecryptWorkbookWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > deleteDecryptWorkbookWithHttpInfo(DeleteDecryptWorkbookRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  deleteDecryptWorkbookValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  deleteDecryptWorkbookAsync( DeleteDecryptWorkbookRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  deleteDecryptWorkbookValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postProtectWorkbookValidateBeforeCall(PostProtectWorkbookRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postProtectWorkbook(PostProtectWorkbookRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postProtectWorkbookWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postProtectWorkbookWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postProtectWorkbookWithHttpInfo(PostProtectWorkbookRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postProtectWorkbookValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postProtectWorkbookAsync( PostProtectWorkbookRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postProtectWorkbookValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call deleteUnProtectWorkbookValidateBeforeCall(DeleteUnProtectWorkbookRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  deleteUnProtectWorkbook(DeleteUnProtectWorkbookRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = deleteUnProtectWorkbookWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = deleteUnProtectWorkbookWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > deleteUnProtectWorkbookWithHttpInfo(DeleteUnProtectWorkbookRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  deleteUnProtectWorkbookValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  deleteUnProtectWorkbookAsync( DeleteUnProtectWorkbookRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  deleteUnProtectWorkbookValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call putDocumentProtectFromChangesValidateBeforeCall(PutDocumentProtectFromChangesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  putDocumentProtectFromChanges(PutDocumentProtectFromChangesRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = putDocumentProtectFromChangesWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = putDocumentProtectFromChangesWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > putDocumentProtectFromChangesWithHttpInfo(PutDocumentProtectFromChangesRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  putDocumentProtectFromChangesValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  putDocumentProtectFromChangesAsync( PutDocumentProtectFromChangesRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  putDocumentProtectFromChangesValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call deleteDocumentUnProtectFromChangesValidateBeforeCall(DeleteDocumentUnProtectFromChangesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  deleteDocumentUnProtectFromChanges(DeleteDocumentUnProtectFromChangesRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = deleteDocumentUnProtectFromChangesWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = deleteDocumentUnProtectFromChangesWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > deleteDocumentUnProtectFromChangesWithHttpInfo(DeleteDocumentUnProtectFromChangesRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  deleteDocumentUnProtectFromChangesValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  deleteDocumentUnProtectFromChangesAsync( DeleteDocumentUnProtectFromChangesRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  deleteDocumentUnProtectFromChangesValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postUnlockValidateBeforeCall(PostUnlockRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  FilesResult  postUnlock(PostUnlockRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< FilesResult > resp = postUnlockWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< FilesResult > resp = postUnlockWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< FilesResult > postUnlockWithHttpInfo(PostUnlockRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postUnlockValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< FilesResult >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postUnlockAsync( PostUnlockRequest request, final ApiCallback< FilesResult > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postUnlockValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< FilesResult >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postLockValidateBeforeCall(PostLockRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  FilesResult  postLock(PostLockRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< FilesResult > resp = postLockWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< FilesResult > resp = postLockWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< FilesResult > postLockWithHttpInfo(PostLockRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postLockValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< FilesResult >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postLockAsync( PostLockRequest request, final ApiCallback< FilesResult > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postLockValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< FilesResult >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postProtectValidateBeforeCall(PostProtectRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  FilesResult  postProtect(PostProtectRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< FilesResult > resp = postProtectWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< FilesResult > resp = postProtectWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< FilesResult > postProtectWithHttpInfo(PostProtectRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postProtectValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< FilesResult >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postProtectAsync( PostProtectRequest request, final ApiCallback< FilesResult > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postProtectValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< FilesResult >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postWorksheetCellsRangesCopyValidateBeforeCall(PostWorksheetCellsRangesCopyRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postWorksheetCellsRangesCopy(PostWorksheetCellsRangesCopyRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postWorksheetCellsRangesCopyWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postWorksheetCellsRangesCopyWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postWorksheetCellsRangesCopyWithHttpInfo(PostWorksheetCellsRangesCopyRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postWorksheetCellsRangesCopyValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postWorksheetCellsRangesCopyAsync( PostWorksheetCellsRangesCopyRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postWorksheetCellsRangesCopyValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postWorksheetCellsRangeMergeValidateBeforeCall(PostWorksheetCellsRangeMergeRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postWorksheetCellsRangeMerge(PostWorksheetCellsRangeMergeRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postWorksheetCellsRangeMergeWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postWorksheetCellsRangeMergeWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postWorksheetCellsRangeMergeWithHttpInfo(PostWorksheetCellsRangeMergeRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postWorksheetCellsRangeMergeValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postWorksheetCellsRangeMergeAsync( PostWorksheetCellsRangeMergeRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postWorksheetCellsRangeMergeValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postWorksheetCellsRangeUnMergeValidateBeforeCall(PostWorksheetCellsRangeUnMergeRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postWorksheetCellsRangeUnMerge(PostWorksheetCellsRangeUnMergeRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postWorksheetCellsRangeUnMergeWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postWorksheetCellsRangeUnMergeWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postWorksheetCellsRangeUnMergeWithHttpInfo(PostWorksheetCellsRangeUnMergeRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postWorksheetCellsRangeUnMergeValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postWorksheetCellsRangeUnMergeAsync( PostWorksheetCellsRangeUnMergeRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postWorksheetCellsRangeUnMergeValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postWorksheetCellsRangeStyleValidateBeforeCall(PostWorksheetCellsRangeStyleRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postWorksheetCellsRangeStyle(PostWorksheetCellsRangeStyleRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postWorksheetCellsRangeStyleWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postWorksheetCellsRangeStyleWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postWorksheetCellsRangeStyleWithHttpInfo(PostWorksheetCellsRangeStyleRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postWorksheetCellsRangeStyleValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postWorksheetCellsRangeStyleAsync( PostWorksheetCellsRangeStyleRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postWorksheetCellsRangeStyleValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getWorksheetCellsRangeValueValidateBeforeCall(GetWorksheetCellsRangeValueRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  RangeValueResponse  getWorksheetCellsRangeValue(GetWorksheetCellsRangeValueRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< RangeValueResponse > resp = getWorksheetCellsRangeValueWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< RangeValueResponse > resp = getWorksheetCellsRangeValueWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< RangeValueResponse > getWorksheetCellsRangeValueWithHttpInfo(GetWorksheetCellsRangeValueRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getWorksheetCellsRangeValueValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< RangeValueResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getWorksheetCellsRangeValueAsync( GetWorksheetCellsRangeValueRequest request, final ApiCallback< RangeValueResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getWorksheetCellsRangeValueValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< RangeValueResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postWorksheetCellsRangeValueValidateBeforeCall(PostWorksheetCellsRangeValueRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postWorksheetCellsRangeValue(PostWorksheetCellsRangeValueRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postWorksheetCellsRangeValueWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postWorksheetCellsRangeValueWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postWorksheetCellsRangeValueWithHttpInfo(PostWorksheetCellsRangeValueRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postWorksheetCellsRangeValueValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postWorksheetCellsRangeValueAsync( PostWorksheetCellsRangeValueRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postWorksheetCellsRangeValueValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postWorksheetCellsRangeMoveToValidateBeforeCall(PostWorksheetCellsRangeMoveToRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postWorksheetCellsRangeMoveTo(PostWorksheetCellsRangeMoveToRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postWorksheetCellsRangeMoveToWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postWorksheetCellsRangeMoveToWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postWorksheetCellsRangeMoveToWithHttpInfo(PostWorksheetCellsRangeMoveToRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postWorksheetCellsRangeMoveToValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postWorksheetCellsRangeMoveToAsync( PostWorksheetCellsRangeMoveToRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postWorksheetCellsRangeMoveToValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postWorksheetCellsRangeSortValidateBeforeCall(PostWorksheetCellsRangeSortRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postWorksheetCellsRangeSort(PostWorksheetCellsRangeSortRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postWorksheetCellsRangeSortWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postWorksheetCellsRangeSortWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postWorksheetCellsRangeSortWithHttpInfo(PostWorksheetCellsRangeSortRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postWorksheetCellsRangeSortValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postWorksheetCellsRangeSortAsync( PostWorksheetCellsRangeSortRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postWorksheetCellsRangeSortValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postWorksheetCellsRangeOutlineBorderValidateBeforeCall(PostWorksheetCellsRangeOutlineBorderRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postWorksheetCellsRangeOutlineBorder(PostWorksheetCellsRangeOutlineBorderRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postWorksheetCellsRangeOutlineBorderWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postWorksheetCellsRangeOutlineBorderWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postWorksheetCellsRangeOutlineBorderWithHttpInfo(PostWorksheetCellsRangeOutlineBorderRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postWorksheetCellsRangeOutlineBorderValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postWorksheetCellsRangeOutlineBorderAsync( PostWorksheetCellsRangeOutlineBorderRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postWorksheetCellsRangeOutlineBorderValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postWorksheetCellsRangeColumnWidthValidateBeforeCall(PostWorksheetCellsRangeColumnWidthRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postWorksheetCellsRangeColumnWidth(PostWorksheetCellsRangeColumnWidthRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postWorksheetCellsRangeColumnWidthWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postWorksheetCellsRangeColumnWidthWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postWorksheetCellsRangeColumnWidthWithHttpInfo(PostWorksheetCellsRangeColumnWidthRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postWorksheetCellsRangeColumnWidthValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postWorksheetCellsRangeColumnWidthAsync( PostWorksheetCellsRangeColumnWidthRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postWorksheetCellsRangeColumnWidthValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postWorksheetCellsRangeRowHeightValidateBeforeCall(PostWorksheetCellsRangeRowHeightRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postWorksheetCellsRangeRowHeight(PostWorksheetCellsRangeRowHeightRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postWorksheetCellsRangeRowHeightWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postWorksheetCellsRangeRowHeightWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postWorksheetCellsRangeRowHeightWithHttpInfo(PostWorksheetCellsRangeRowHeightRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postWorksheetCellsRangeRowHeightValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postWorksheetCellsRangeRowHeightAsync( PostWorksheetCellsRangeRowHeightRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postWorksheetCellsRangeRowHeightValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call putWorksheetCellsRangeValidateBeforeCall(PutWorksheetCellsRangeRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  putWorksheetCellsRange(PutWorksheetCellsRangeRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = putWorksheetCellsRangeWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = putWorksheetCellsRangeWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > putWorksheetCellsRangeWithHttpInfo(PutWorksheetCellsRangeRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  putWorksheetCellsRangeValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  putWorksheetCellsRangeAsync( PutWorksheetCellsRangeRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  putWorksheetCellsRangeValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call deleteWorksheetCellsRangeValidateBeforeCall(DeleteWorksheetCellsRangeRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  deleteWorksheetCellsRange(DeleteWorksheetCellsRangeRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = deleteWorksheetCellsRangeWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = deleteWorksheetCellsRangeWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > deleteWorksheetCellsRangeWithHttpInfo(DeleteWorksheetCellsRangeRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  deleteWorksheetCellsRangeValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  deleteWorksheetCellsRangeAsync( DeleteWorksheetCellsRangeRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  deleteWorksheetCellsRangeValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getWorksheetShapesValidateBeforeCall(GetWorksheetShapesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  ShapesResponse  getWorksheetShapes(GetWorksheetShapesRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< ShapesResponse > resp = getWorksheetShapesWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< ShapesResponse > resp = getWorksheetShapesWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< ShapesResponse > getWorksheetShapesWithHttpInfo(GetWorksheetShapesRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getWorksheetShapesValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< ShapesResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getWorksheetShapesAsync( GetWorksheetShapesRequest request, final ApiCallback< ShapesResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getWorksheetShapesValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< ShapesResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getWorksheetShapeValidateBeforeCall(GetWorksheetShapeRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  ShapeResponse  getWorksheetShape(GetWorksheetShapeRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< ShapeResponse > resp = getWorksheetShapeWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< ShapeResponse > resp = getWorksheetShapeWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< ShapeResponse > getWorksheetShapeWithHttpInfo(GetWorksheetShapeRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getWorksheetShapeValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< ShapeResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getWorksheetShapeAsync( GetWorksheetShapeRequest request, final ApiCallback< ShapeResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getWorksheetShapeValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< ShapeResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call putWorksheetShapeValidateBeforeCall(PutWorksheetShapeRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  putWorksheetShape(PutWorksheetShapeRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = putWorksheetShapeWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = putWorksheetShapeWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > putWorksheetShapeWithHttpInfo(PutWorksheetShapeRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  putWorksheetShapeValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  putWorksheetShapeAsync( PutWorksheetShapeRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  putWorksheetShapeValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call deleteWorksheetShapesValidateBeforeCall(DeleteWorksheetShapesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  deleteWorksheetShapes(DeleteWorksheetShapesRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = deleteWorksheetShapesWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = deleteWorksheetShapesWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > deleteWorksheetShapesWithHttpInfo(DeleteWorksheetShapesRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  deleteWorksheetShapesValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  deleteWorksheetShapesAsync( DeleteWorksheetShapesRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  deleteWorksheetShapesValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call deleteWorksheetShapeValidateBeforeCall(DeleteWorksheetShapeRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  deleteWorksheetShape(DeleteWorksheetShapeRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = deleteWorksheetShapeWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = deleteWorksheetShapeWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > deleteWorksheetShapeWithHttpInfo(DeleteWorksheetShapeRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  deleteWorksheetShapeValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  deleteWorksheetShapeAsync( DeleteWorksheetShapeRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  deleteWorksheetShapeValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postWorksheetShapeValidateBeforeCall(PostWorksheetShapeRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postWorksheetShape(PostWorksheetShapeRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postWorksheetShapeWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postWorksheetShapeWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postWorksheetShapeWithHttpInfo(PostWorksheetShapeRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postWorksheetShapeValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postWorksheetShapeAsync( PostWorksheetShapeRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postWorksheetShapeValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postWorksheetGroupShapeValidateBeforeCall(PostWorksheetGroupShapeRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postWorksheetGroupShape(PostWorksheetGroupShapeRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postWorksheetGroupShapeWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postWorksheetGroupShapeWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postWorksheetGroupShapeWithHttpInfo(PostWorksheetGroupShapeRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postWorksheetGroupShapeValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postWorksheetGroupShapeAsync( PostWorksheetGroupShapeRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postWorksheetGroupShapeValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postWorksheetUngroupShapeValidateBeforeCall(PostWorksheetUngroupShapeRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postWorksheetUngroupShape(PostWorksheetUngroupShapeRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postWorksheetUngroupShapeWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postWorksheetUngroupShapeWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postWorksheetUngroupShapeWithHttpInfo(PostWorksheetUngroupShapeRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postWorksheetUngroupShapeValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postWorksheetUngroupShapeAsync( PostWorksheetUngroupShapeRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postWorksheetUngroupShapeValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getWorksheetSparklineGroupsValidateBeforeCall(GetWorksheetSparklineGroupsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  SparklineGroupsResponse  getWorksheetSparklineGroups(GetWorksheetSparklineGroupsRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< SparklineGroupsResponse > resp = getWorksheetSparklineGroupsWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< SparklineGroupsResponse > resp = getWorksheetSparklineGroupsWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< SparklineGroupsResponse > getWorksheetSparklineGroupsWithHttpInfo(GetWorksheetSparklineGroupsRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getWorksheetSparklineGroupsValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< SparklineGroupsResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getWorksheetSparklineGroupsAsync( GetWorksheetSparklineGroupsRequest request, final ApiCallback< SparklineGroupsResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getWorksheetSparklineGroupsValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< SparklineGroupsResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getWorksheetSparklineGroupValidateBeforeCall(GetWorksheetSparklineGroupRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  SparklineGroupResponse  getWorksheetSparklineGroup(GetWorksheetSparklineGroupRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< SparklineGroupResponse > resp = getWorksheetSparklineGroupWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< SparklineGroupResponse > resp = getWorksheetSparklineGroupWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< SparklineGroupResponse > getWorksheetSparklineGroupWithHttpInfo(GetWorksheetSparklineGroupRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getWorksheetSparklineGroupValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< SparklineGroupResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getWorksheetSparklineGroupAsync( GetWorksheetSparklineGroupRequest request, final ApiCallback< SparklineGroupResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getWorksheetSparklineGroupValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< SparklineGroupResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call deleteWorksheetSparklineGroupsValidateBeforeCall(DeleteWorksheetSparklineGroupsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  deleteWorksheetSparklineGroups(DeleteWorksheetSparklineGroupsRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = deleteWorksheetSparklineGroupsWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = deleteWorksheetSparklineGroupsWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > deleteWorksheetSparklineGroupsWithHttpInfo(DeleteWorksheetSparklineGroupsRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  deleteWorksheetSparklineGroupsValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  deleteWorksheetSparklineGroupsAsync( DeleteWorksheetSparklineGroupsRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  deleteWorksheetSparklineGroupsValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call deleteWorksheetSparklineGroupValidateBeforeCall(DeleteWorksheetSparklineGroupRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  deleteWorksheetSparklineGroup(DeleteWorksheetSparklineGroupRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = deleteWorksheetSparklineGroupWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = deleteWorksheetSparklineGroupWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > deleteWorksheetSparklineGroupWithHttpInfo(DeleteWorksheetSparklineGroupRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  deleteWorksheetSparklineGroupValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  deleteWorksheetSparklineGroupAsync( DeleteWorksheetSparklineGroupRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  deleteWorksheetSparklineGroupValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call putWorksheetSparklineGroupValidateBeforeCall(PutWorksheetSparklineGroupRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  putWorksheetSparklineGroup(PutWorksheetSparklineGroupRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = putWorksheetSparklineGroupWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = putWorksheetSparklineGroupWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > putWorksheetSparklineGroupWithHttpInfo(PutWorksheetSparklineGroupRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  putWorksheetSparklineGroupValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  putWorksheetSparklineGroupAsync( PutWorksheetSparklineGroupRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  putWorksheetSparklineGroupValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postWorksheetSparklineGroupValidateBeforeCall(PostWorksheetSparklineGroupRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postWorksheetSparklineGroup(PostWorksheetSparklineGroupRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postWorksheetSparklineGroupWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postWorksheetSparklineGroupWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postWorksheetSparklineGroupWithHttpInfo(PostWorksheetSparklineGroupRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postWorksheetSparklineGroupValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postWorksheetSparklineGroupAsync( PostWorksheetSparklineGroupRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postWorksheetSparklineGroupValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postRunTaskValidateBeforeCall(PostRunTaskRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  File  postRunTask(PostRunTaskRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< File > resp = postRunTaskWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< File > resp = postRunTaskWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< File > postRunTaskWithHttpInfo(PostRunTaskRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postRunTaskValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< File >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postRunTaskAsync( PostRunTaskRequest request, final ApiCallback< HashMap<String,File> > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postRunTaskValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< HashMap<String,File> >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getWorkbookDefaultStyleValidateBeforeCall(GetWorkbookDefaultStyleRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  StyleResponse  getWorkbookDefaultStyle(GetWorkbookDefaultStyleRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< StyleResponse > resp = getWorkbookDefaultStyleWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< StyleResponse > resp = getWorkbookDefaultStyleWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< StyleResponse > getWorkbookDefaultStyleWithHttpInfo(GetWorkbookDefaultStyleRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getWorkbookDefaultStyleValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< StyleResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getWorkbookDefaultStyleAsync( GetWorkbookDefaultStyleRequest request, final ApiCallback< StyleResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getWorkbookDefaultStyleValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< StyleResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getWorkbookTextItemsValidateBeforeCall(GetWorkbookTextItemsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  TextItemsResponse  getWorkbookTextItems(GetWorkbookTextItemsRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< TextItemsResponse > resp = getWorkbookTextItemsWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< TextItemsResponse > resp = getWorkbookTextItemsWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< TextItemsResponse > getWorkbookTextItemsWithHttpInfo(GetWorkbookTextItemsRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getWorkbookTextItemsValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< TextItemsResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getWorkbookTextItemsAsync( GetWorkbookTextItemsRequest request, final ApiCallback< TextItemsResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getWorkbookTextItemsValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< TextItemsResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getWorkbookNamesValidateBeforeCall(GetWorkbookNamesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  NamesResponse  getWorkbookNames(GetWorkbookNamesRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< NamesResponse > resp = getWorkbookNamesWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< NamesResponse > resp = getWorkbookNamesWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< NamesResponse > getWorkbookNamesWithHttpInfo(GetWorkbookNamesRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getWorkbookNamesValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< NamesResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getWorkbookNamesAsync( GetWorkbookNamesRequest request, final ApiCallback< NamesResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getWorkbookNamesValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< NamesResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call putWorkbookNameValidateBeforeCall(PutWorkbookNameRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  putWorkbookName(PutWorkbookNameRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = putWorkbookNameWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = putWorkbookNameWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > putWorkbookNameWithHttpInfo(PutWorkbookNameRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  putWorkbookNameValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  putWorkbookNameAsync( PutWorkbookNameRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  putWorkbookNameValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getWorkbookNameValidateBeforeCall(GetWorkbookNameRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  NameResponse  getWorkbookName(GetWorkbookNameRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< NameResponse > resp = getWorkbookNameWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< NameResponse > resp = getWorkbookNameWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< NameResponse > getWorkbookNameWithHttpInfo(GetWorkbookNameRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getWorkbookNameValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< NameResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getWorkbookNameAsync( GetWorkbookNameRequest request, final ApiCallback< NameResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getWorkbookNameValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< NameResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postWorkbookNameValidateBeforeCall(PostWorkbookNameRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postWorkbookName(PostWorkbookNameRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postWorkbookNameWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postWorkbookNameWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postWorkbookNameWithHttpInfo(PostWorkbookNameRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postWorkbookNameValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postWorkbookNameAsync( PostWorkbookNameRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postWorkbookNameValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getWorkbookNameValueValidateBeforeCall(GetWorkbookNameValueRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  RangeValueResponse  getWorkbookNameValue(GetWorkbookNameValueRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< RangeValueResponse > resp = getWorkbookNameValueWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< RangeValueResponse > resp = getWorkbookNameValueWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< RangeValueResponse > getWorkbookNameValueWithHttpInfo(GetWorkbookNameValueRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getWorkbookNameValueValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< RangeValueResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getWorkbookNameValueAsync( GetWorkbookNameValueRequest request, final ApiCallback< RangeValueResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getWorkbookNameValueValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< RangeValueResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call deleteWorkbookNamesValidateBeforeCall(DeleteWorkbookNamesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  deleteWorkbookNames(DeleteWorkbookNamesRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = deleteWorkbookNamesWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = deleteWorkbookNamesWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > deleteWorkbookNamesWithHttpInfo(DeleteWorkbookNamesRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  deleteWorkbookNamesValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  deleteWorkbookNamesAsync( DeleteWorkbookNamesRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  deleteWorkbookNamesValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call deleteWorkbookNameValidateBeforeCall(DeleteWorkbookNameRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  deleteWorkbookName(DeleteWorkbookNameRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = deleteWorkbookNameWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = deleteWorkbookNameWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > deleteWorkbookNameWithHttpInfo(DeleteWorkbookNameRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  deleteWorkbookNameValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  deleteWorkbookNameAsync( DeleteWorkbookNameRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  deleteWorkbookNameValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postWorkbooksMergeValidateBeforeCall(PostWorkbooksMergeRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  WorkbookResponse  postWorkbooksMerge(PostWorkbooksMergeRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< WorkbookResponse > resp = postWorkbooksMergeWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< WorkbookResponse > resp = postWorkbooksMergeWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< WorkbookResponse > postWorkbooksMergeWithHttpInfo(PostWorkbooksMergeRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postWorkbooksMergeValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< WorkbookResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postWorkbooksMergeAsync( PostWorkbooksMergeRequest request, final ApiCallback< WorkbookResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postWorkbooksMergeValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< WorkbookResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postWorkbooksTextSearchValidateBeforeCall(PostWorkbooksTextSearchRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  TextItemsResponse  postWorkbooksTextSearch(PostWorkbooksTextSearchRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< TextItemsResponse > resp = postWorkbooksTextSearchWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< TextItemsResponse > resp = postWorkbooksTextSearchWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< TextItemsResponse > postWorkbooksTextSearchWithHttpInfo(PostWorkbooksTextSearchRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postWorkbooksTextSearchValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< TextItemsResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postWorkbooksTextSearchAsync( PostWorkbooksTextSearchRequest request, final ApiCallback< TextItemsResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postWorkbooksTextSearchValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< TextItemsResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postWorkbookTextReplaceValidateBeforeCall(PostWorkbookTextReplaceRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  WorkbookReplaceResponse  postWorkbookTextReplace(PostWorkbookTextReplaceRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< WorkbookReplaceResponse > resp = postWorkbookTextReplaceWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< WorkbookReplaceResponse > resp = postWorkbookTextReplaceWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< WorkbookReplaceResponse > postWorkbookTextReplaceWithHttpInfo(PostWorkbookTextReplaceRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postWorkbookTextReplaceValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< WorkbookReplaceResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postWorkbookTextReplaceAsync( PostWorkbookTextReplaceRequest request, final ApiCallback< WorkbookReplaceResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postWorkbookTextReplaceValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< WorkbookReplaceResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postWorkbookGetSmartMarkerResultValidateBeforeCall(PostWorkbookGetSmartMarkerResultRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  File  postWorkbookGetSmartMarkerResult(PostWorkbookGetSmartMarkerResultRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< File > resp = postWorkbookGetSmartMarkerResultWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< File > resp = postWorkbookGetSmartMarkerResultWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< File > postWorkbookGetSmartMarkerResultWithHttpInfo(PostWorkbookGetSmartMarkerResultRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postWorkbookGetSmartMarkerResultValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< File >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postWorkbookGetSmartMarkerResultAsync( PostWorkbookGetSmartMarkerResultRequest request, final ApiCallback< HashMap<String,File> > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postWorkbookGetSmartMarkerResultValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< HashMap<String,File> >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call putWorkbookCreateValidateBeforeCall(PutWorkbookCreateRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  putWorkbookCreate(PutWorkbookCreateRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = putWorkbookCreateWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = putWorkbookCreateWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > putWorkbookCreateWithHttpInfo(PutWorkbookCreateRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  putWorkbookCreateValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  putWorkbookCreateAsync( PutWorkbookCreateRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  putWorkbookCreateValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postWorkbookSplitValidateBeforeCall(PostWorkbookSplitRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  SplitResultResponse  postWorkbookSplit(PostWorkbookSplitRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< SplitResultResponse > resp = postWorkbookSplitWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< SplitResultResponse > resp = postWorkbookSplitWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< SplitResultResponse > postWorkbookSplitWithHttpInfo(PostWorkbookSplitRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postWorkbookSplitValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< SplitResultResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postWorkbookSplitAsync( PostWorkbookSplitRequest request, final ApiCallback< SplitResultResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postWorkbookSplitValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< SplitResultResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postWorkbookCalculateFormulaValidateBeforeCall(PostWorkbookCalculateFormulaRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postWorkbookCalculateFormula(PostWorkbookCalculateFormulaRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postWorkbookCalculateFormulaWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postWorkbookCalculateFormulaWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postWorkbookCalculateFormulaWithHttpInfo(PostWorkbookCalculateFormulaRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postWorkbookCalculateFormulaValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postWorkbookCalculateFormulaAsync( PostWorkbookCalculateFormulaRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postWorkbookCalculateFormulaValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postAutofitWorkbookRowsValidateBeforeCall(PostAutofitWorkbookRowsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postAutofitWorkbookRows(PostAutofitWorkbookRowsRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postAutofitWorkbookRowsWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postAutofitWorkbookRowsWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postAutofitWorkbookRowsWithHttpInfo(PostAutofitWorkbookRowsRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postAutofitWorkbookRowsValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postAutofitWorkbookRowsAsync( PostAutofitWorkbookRowsRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postAutofitWorkbookRowsValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postAutofitWorkbookColumnsValidateBeforeCall(PostAutofitWorkbookColumnsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postAutofitWorkbookColumns(PostAutofitWorkbookColumnsRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postAutofitWorkbookColumnsWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postAutofitWorkbookColumnsWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postAutofitWorkbookColumnsWithHttpInfo(PostAutofitWorkbookColumnsRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postAutofitWorkbookColumnsValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postAutofitWorkbookColumnsAsync( PostAutofitWorkbookColumnsRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postAutofitWorkbookColumnsValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getWorkbookSettingsValidateBeforeCall(GetWorkbookSettingsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  WorkbookSettingsResponse  getWorkbookSettings(GetWorkbookSettingsRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< WorkbookSettingsResponse > resp = getWorkbookSettingsWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< WorkbookSettingsResponse > resp = getWorkbookSettingsWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< WorkbookSettingsResponse > getWorkbookSettingsWithHttpInfo(GetWorkbookSettingsRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getWorkbookSettingsValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< WorkbookSettingsResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getWorkbookSettingsAsync( GetWorkbookSettingsRequest request, final ApiCallback< WorkbookSettingsResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getWorkbookSettingsValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< WorkbookSettingsResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postWorkbookSettingsValidateBeforeCall(PostWorkbookSettingsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postWorkbookSettings(PostWorkbookSettingsRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postWorkbookSettingsWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postWorkbookSettingsWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postWorkbookSettingsWithHttpInfo(PostWorkbookSettingsRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postWorkbookSettingsValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postWorkbookSettingsAsync( PostWorkbookSettingsRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postWorkbookSettingsValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call putWorkbookBackgroundValidateBeforeCall(PutWorkbookBackgroundRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  putWorkbookBackground(PutWorkbookBackgroundRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = putWorkbookBackgroundWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = putWorkbookBackgroundWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > putWorkbookBackgroundWithHttpInfo(PutWorkbookBackgroundRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  putWorkbookBackgroundValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  putWorkbookBackgroundAsync( PutWorkbookBackgroundRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  putWorkbookBackgroundValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call deleteWorkbookBackgroundValidateBeforeCall(DeleteWorkbookBackgroundRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  deleteWorkbookBackground(DeleteWorkbookBackgroundRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = deleteWorkbookBackgroundWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = deleteWorkbookBackgroundWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > deleteWorkbookBackgroundWithHttpInfo(DeleteWorkbookBackgroundRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  deleteWorkbookBackgroundValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  deleteWorkbookBackgroundAsync( DeleteWorkbookBackgroundRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  deleteWorkbookBackgroundValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call putWorkbookWaterMarkerValidateBeforeCall(PutWorkbookWaterMarkerRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  putWorkbookWaterMarker(PutWorkbookWaterMarkerRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = putWorkbookWaterMarkerWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = putWorkbookWaterMarkerWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > putWorkbookWaterMarkerWithHttpInfo(PutWorkbookWaterMarkerRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  putWorkbookWaterMarkerValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  putWorkbookWaterMarkerAsync( PutWorkbookWaterMarkerRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  putWorkbookWaterMarkerValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getPageCountValidateBeforeCall(GetPageCountRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  Integer  getPageCount(GetPageCountRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< Integer > resp = getPageCountWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< Integer > resp = getPageCountWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< Integer > getPageCountWithHttpInfo(GetPageCountRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getPageCountValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< Integer >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getPageCountAsync( GetPageCountRequest request, final ApiCallback< Integer > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getPageCountValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< Integer >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getWorksheetsValidateBeforeCall(GetWorksheetsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  WorksheetsResponse  getWorksheets(GetWorksheetsRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< WorksheetsResponse > resp = getWorksheetsWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< WorksheetsResponse > resp = getWorksheetsWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< WorksheetsResponse > getWorksheetsWithHttpInfo(GetWorksheetsRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getWorksheetsValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< WorksheetsResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getWorksheetsAsync( GetWorksheetsRequest request, final ApiCallback< WorksheetsResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getWorksheetsValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< WorksheetsResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getWorksheetWithFormatValidateBeforeCall(GetWorksheetWithFormatRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  File  getWorksheetWithFormat(GetWorksheetWithFormatRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< File > resp = getWorksheetWithFormatWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< File > resp = getWorksheetWithFormatWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< File > getWorksheetWithFormatWithHttpInfo(GetWorksheetWithFormatRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getWorksheetWithFormatValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< File >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getWorksheetWithFormatAsync( GetWorksheetWithFormatRequest request, final ApiCallback< HashMap<String,File> > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getWorksheetWithFormatValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< HashMap<String,File> >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call putChangeVisibilityWorksheetValidateBeforeCall(PutChangeVisibilityWorksheetRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  putChangeVisibilityWorksheet(PutChangeVisibilityWorksheetRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = putChangeVisibilityWorksheetWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = putChangeVisibilityWorksheetWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > putChangeVisibilityWorksheetWithHttpInfo(PutChangeVisibilityWorksheetRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  putChangeVisibilityWorksheetValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  putChangeVisibilityWorksheetAsync( PutChangeVisibilityWorksheetRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  putChangeVisibilityWorksheetValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call putActiveWorksheetValidateBeforeCall(PutActiveWorksheetRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  putActiveWorksheet(PutActiveWorksheetRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = putActiveWorksheetWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = putActiveWorksheetWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > putActiveWorksheetWithHttpInfo(PutActiveWorksheetRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  putActiveWorksheetValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  putActiveWorksheetAsync( PutActiveWorksheetRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  putActiveWorksheetValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call putInsertNewWorksheetValidateBeforeCall(PutInsertNewWorksheetRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  putInsertNewWorksheet(PutInsertNewWorksheetRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = putInsertNewWorksheetWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = putInsertNewWorksheetWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > putInsertNewWorksheetWithHttpInfo(PutInsertNewWorksheetRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  putInsertNewWorksheetValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  putInsertNewWorksheetAsync( PutInsertNewWorksheetRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  putInsertNewWorksheetValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call putAddNewWorksheetValidateBeforeCall(PutAddNewWorksheetRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  putAddNewWorksheet(PutAddNewWorksheetRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = putAddNewWorksheetWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = putAddNewWorksheetWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > putAddNewWorksheetWithHttpInfo(PutAddNewWorksheetRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  putAddNewWorksheetValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  putAddNewWorksheetAsync( PutAddNewWorksheetRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  putAddNewWorksheetValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call deleteWorksheetValidateBeforeCall(DeleteWorksheetRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  deleteWorksheet(DeleteWorksheetRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = deleteWorksheetWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = deleteWorksheetWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > deleteWorksheetWithHttpInfo(DeleteWorksheetRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  deleteWorksheetValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  deleteWorksheetAsync( DeleteWorksheetRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  deleteWorksheetValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call deleteWorksheetsValidateBeforeCall(DeleteWorksheetsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  deleteWorksheets(DeleteWorksheetsRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = deleteWorksheetsWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = deleteWorksheetsWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > deleteWorksheetsWithHttpInfo(DeleteWorksheetsRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  deleteWorksheetsValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  deleteWorksheetsAsync( DeleteWorksheetsRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  deleteWorksheetsValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postMoveWorksheetValidateBeforeCall(PostMoveWorksheetRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postMoveWorksheet(PostMoveWorksheetRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postMoveWorksheetWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postMoveWorksheetWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postMoveWorksheetWithHttpInfo(PostMoveWorksheetRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postMoveWorksheetValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postMoveWorksheetAsync( PostMoveWorksheetRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postMoveWorksheetValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call putProtectWorksheetValidateBeforeCall(PutProtectWorksheetRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  putProtectWorksheet(PutProtectWorksheetRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = putProtectWorksheetWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = putProtectWorksheetWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > putProtectWorksheetWithHttpInfo(PutProtectWorksheetRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  putProtectWorksheetValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  putProtectWorksheetAsync( PutProtectWorksheetRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  putProtectWorksheetValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call deleteUnprotectWorksheetValidateBeforeCall(DeleteUnprotectWorksheetRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  deleteUnprotectWorksheet(DeleteUnprotectWorksheetRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = deleteUnprotectWorksheetWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = deleteUnprotectWorksheetWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > deleteUnprotectWorksheetWithHttpInfo(DeleteUnprotectWorksheetRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  deleteUnprotectWorksheetValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  deleteUnprotectWorksheetAsync( DeleteUnprotectWorksheetRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  deleteUnprotectWorksheetValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getWorksheetTextItemsValidateBeforeCall(GetWorksheetTextItemsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  TextItemsResponse  getWorksheetTextItems(GetWorksheetTextItemsRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< TextItemsResponse > resp = getWorksheetTextItemsWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< TextItemsResponse > resp = getWorksheetTextItemsWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< TextItemsResponse > getWorksheetTextItemsWithHttpInfo(GetWorksheetTextItemsRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getWorksheetTextItemsValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< TextItemsResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getWorksheetTextItemsAsync( GetWorksheetTextItemsRequest request, final ApiCallback< TextItemsResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getWorksheetTextItemsValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< TextItemsResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getWorksheetCommentsValidateBeforeCall(GetWorksheetCommentsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CommentsResponse  getWorksheetComments(GetWorksheetCommentsRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CommentsResponse > resp = getWorksheetCommentsWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CommentsResponse > resp = getWorksheetCommentsWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CommentsResponse > getWorksheetCommentsWithHttpInfo(GetWorksheetCommentsRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getWorksheetCommentsValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CommentsResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getWorksheetCommentsAsync( GetWorksheetCommentsRequest request, final ApiCallback< CommentsResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getWorksheetCommentsValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CommentsResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getWorksheetCommentValidateBeforeCall(GetWorksheetCommentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CommentResponse  getWorksheetComment(GetWorksheetCommentRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CommentResponse > resp = getWorksheetCommentWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CommentResponse > resp = getWorksheetCommentWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CommentResponse > getWorksheetCommentWithHttpInfo(GetWorksheetCommentRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getWorksheetCommentValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CommentResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getWorksheetCommentAsync( GetWorksheetCommentRequest request, final ApiCallback< CommentResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getWorksheetCommentValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CommentResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call putWorksheetCommentValidateBeforeCall(PutWorksheetCommentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CommentResponse  putWorksheetComment(PutWorksheetCommentRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CommentResponse > resp = putWorksheetCommentWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CommentResponse > resp = putWorksheetCommentWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CommentResponse > putWorksheetCommentWithHttpInfo(PutWorksheetCommentRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  putWorksheetCommentValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CommentResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  putWorksheetCommentAsync( PutWorksheetCommentRequest request, final ApiCallback< CommentResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  putWorksheetCommentValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CommentResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postWorksheetCommentValidateBeforeCall(PostWorksheetCommentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postWorksheetComment(PostWorksheetCommentRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postWorksheetCommentWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postWorksheetCommentWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postWorksheetCommentWithHttpInfo(PostWorksheetCommentRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postWorksheetCommentValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postWorksheetCommentAsync( PostWorksheetCommentRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postWorksheetCommentValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call deleteWorksheetCommentValidateBeforeCall(DeleteWorksheetCommentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  deleteWorksheetComment(DeleteWorksheetCommentRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = deleteWorksheetCommentWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = deleteWorksheetCommentWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > deleteWorksheetCommentWithHttpInfo(DeleteWorksheetCommentRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  deleteWorksheetCommentValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  deleteWorksheetCommentAsync( DeleteWorksheetCommentRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  deleteWorksheetCommentValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call deleteWorksheetCommentsValidateBeforeCall(DeleteWorksheetCommentsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  deleteWorksheetComments(DeleteWorksheetCommentsRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = deleteWorksheetCommentsWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = deleteWorksheetCommentsWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > deleteWorksheetCommentsWithHttpInfo(DeleteWorksheetCommentsRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  deleteWorksheetCommentsValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  deleteWorksheetCommentsAsync( DeleteWorksheetCommentsRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  deleteWorksheetCommentsValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getWorksheetMergedCellsValidateBeforeCall(GetWorksheetMergedCellsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  MergedCellsResponse  getWorksheetMergedCells(GetWorksheetMergedCellsRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< MergedCellsResponse > resp = getWorksheetMergedCellsWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< MergedCellsResponse > resp = getWorksheetMergedCellsWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< MergedCellsResponse > getWorksheetMergedCellsWithHttpInfo(GetWorksheetMergedCellsRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getWorksheetMergedCellsValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< MergedCellsResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getWorksheetMergedCellsAsync( GetWorksheetMergedCellsRequest request, final ApiCallback< MergedCellsResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getWorksheetMergedCellsValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< MergedCellsResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getWorksheetMergedCellValidateBeforeCall(GetWorksheetMergedCellRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  MergedCellResponse  getWorksheetMergedCell(GetWorksheetMergedCellRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< MergedCellResponse > resp = getWorksheetMergedCellWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< MergedCellResponse > resp = getWorksheetMergedCellWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< MergedCellResponse > getWorksheetMergedCellWithHttpInfo(GetWorksheetMergedCellRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getWorksheetMergedCellValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< MergedCellResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getWorksheetMergedCellAsync( GetWorksheetMergedCellRequest request, final ApiCallback< MergedCellResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getWorksheetMergedCellValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< MergedCellResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getWorksheetCalculateFormulaValidateBeforeCall(GetWorksheetCalculateFormulaRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  SingleValueResponse  getWorksheetCalculateFormula(GetWorksheetCalculateFormulaRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< SingleValueResponse > resp = getWorksheetCalculateFormulaWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< SingleValueResponse > resp = getWorksheetCalculateFormulaWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< SingleValueResponse > getWorksheetCalculateFormulaWithHttpInfo(GetWorksheetCalculateFormulaRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getWorksheetCalculateFormulaValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< SingleValueResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getWorksheetCalculateFormulaAsync( GetWorksheetCalculateFormulaRequest request, final ApiCallback< SingleValueResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getWorksheetCalculateFormulaValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< SingleValueResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postWorksheetCalculateFormulaValidateBeforeCall(PostWorksheetCalculateFormulaRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  SingleValueResponse  postWorksheetCalculateFormula(PostWorksheetCalculateFormulaRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< SingleValueResponse > resp = postWorksheetCalculateFormulaWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< SingleValueResponse > resp = postWorksheetCalculateFormulaWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< SingleValueResponse > postWorksheetCalculateFormulaWithHttpInfo(PostWorksheetCalculateFormulaRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postWorksheetCalculateFormulaValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< SingleValueResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postWorksheetCalculateFormulaAsync( PostWorksheetCalculateFormulaRequest request, final ApiCallback< SingleValueResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postWorksheetCalculateFormulaValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< SingleValueResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postWorksheetTextSearchValidateBeforeCall(PostWorksheetTextSearchRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  TextItemsResponse  postWorksheetTextSearch(PostWorksheetTextSearchRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< TextItemsResponse > resp = postWorksheetTextSearchWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< TextItemsResponse > resp = postWorksheetTextSearchWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< TextItemsResponse > postWorksheetTextSearchWithHttpInfo(PostWorksheetTextSearchRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postWorksheetTextSearchValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< TextItemsResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postWorksheetTextSearchAsync( PostWorksheetTextSearchRequest request, final ApiCallback< TextItemsResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postWorksheetTextSearchValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< TextItemsResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postWorksheetTextReplaceValidateBeforeCall(PostWorksheetTextReplaceRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  WorksheetReplaceResponse  postWorksheetTextReplace(PostWorksheetTextReplaceRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< WorksheetReplaceResponse > resp = postWorksheetTextReplaceWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< WorksheetReplaceResponse > resp = postWorksheetTextReplaceWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< WorksheetReplaceResponse > postWorksheetTextReplaceWithHttpInfo(PostWorksheetTextReplaceRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postWorksheetTextReplaceValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< WorksheetReplaceResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postWorksheetTextReplaceAsync( PostWorksheetTextReplaceRequest request, final ApiCallback< WorksheetReplaceResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postWorksheetTextReplaceValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< WorksheetReplaceResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postWorksheetRangeSortValidateBeforeCall(PostWorksheetRangeSortRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postWorksheetRangeSort(PostWorksheetRangeSortRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postWorksheetRangeSortWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postWorksheetRangeSortWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postWorksheetRangeSortWithHttpInfo(PostWorksheetRangeSortRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postWorksheetRangeSortValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postWorksheetRangeSortAsync( PostWorksheetRangeSortRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postWorksheetRangeSortValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postAutofitWorksheetRowValidateBeforeCall(PostAutofitWorksheetRowRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postAutofitWorksheetRow(PostAutofitWorksheetRowRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postAutofitWorksheetRowWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postAutofitWorksheetRowWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postAutofitWorksheetRowWithHttpInfo(PostAutofitWorksheetRowRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postAutofitWorksheetRowValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postAutofitWorksheetRowAsync( PostAutofitWorksheetRowRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postAutofitWorksheetRowValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postAutofitWorksheetRowsValidateBeforeCall(PostAutofitWorksheetRowsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postAutofitWorksheetRows(PostAutofitWorksheetRowsRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postAutofitWorksheetRowsWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postAutofitWorksheetRowsWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postAutofitWorksheetRowsWithHttpInfo(PostAutofitWorksheetRowsRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postAutofitWorksheetRowsValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postAutofitWorksheetRowsAsync( PostAutofitWorksheetRowsRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postAutofitWorksheetRowsValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postAutofitWorksheetColumnsValidateBeforeCall(PostAutofitWorksheetColumnsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postAutofitWorksheetColumns(PostAutofitWorksheetColumnsRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postAutofitWorksheetColumnsWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postAutofitWorksheetColumnsWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postAutofitWorksheetColumnsWithHttpInfo(PostAutofitWorksheetColumnsRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postAutofitWorksheetColumnsValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postAutofitWorksheetColumnsAsync( PostAutofitWorksheetColumnsRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postAutofitWorksheetColumnsValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call putWorksheetBackgroundValidateBeforeCall(PutWorksheetBackgroundRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  putWorksheetBackground(PutWorksheetBackgroundRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = putWorksheetBackgroundWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = putWorksheetBackgroundWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > putWorksheetBackgroundWithHttpInfo(PutWorksheetBackgroundRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  putWorksheetBackgroundValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  putWorksheetBackgroundAsync( PutWorksheetBackgroundRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  putWorksheetBackgroundValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call deleteWorksheetBackgroundValidateBeforeCall(DeleteWorksheetBackgroundRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  deleteWorksheetBackground(DeleteWorksheetBackgroundRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = deleteWorksheetBackgroundWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = deleteWorksheetBackgroundWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > deleteWorksheetBackgroundWithHttpInfo(DeleteWorksheetBackgroundRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  deleteWorksheetBackgroundValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  deleteWorksheetBackgroundAsync( DeleteWorksheetBackgroundRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  deleteWorksheetBackgroundValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call putWorksheetFreezePanesValidateBeforeCall(PutWorksheetFreezePanesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  putWorksheetFreezePanes(PutWorksheetFreezePanesRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = putWorksheetFreezePanesWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = putWorksheetFreezePanesWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > putWorksheetFreezePanesWithHttpInfo(PutWorksheetFreezePanesRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  putWorksheetFreezePanesValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  putWorksheetFreezePanesAsync( PutWorksheetFreezePanesRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  putWorksheetFreezePanesValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call deleteWorksheetFreezePanesValidateBeforeCall(DeleteWorksheetFreezePanesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  deleteWorksheetFreezePanes(DeleteWorksheetFreezePanesRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = deleteWorksheetFreezePanesWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = deleteWorksheetFreezePanesWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > deleteWorksheetFreezePanesWithHttpInfo(DeleteWorksheetFreezePanesRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  deleteWorksheetFreezePanesValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  deleteWorksheetFreezePanesAsync( DeleteWorksheetFreezePanesRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  deleteWorksheetFreezePanesValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postCopyWorksheetValidateBeforeCall(PostCopyWorksheetRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postCopyWorksheet(PostCopyWorksheetRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postCopyWorksheetWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postCopyWorksheetWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postCopyWorksheetWithHttpInfo(PostCopyWorksheetRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postCopyWorksheetValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postCopyWorksheetAsync( PostCopyWorksheetRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postCopyWorksheetValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postRenameWorksheetValidateBeforeCall(PostRenameWorksheetRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postRenameWorksheet(PostRenameWorksheetRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postRenameWorksheetWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postRenameWorksheetWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postRenameWorksheetWithHttpInfo(PostRenameWorksheetRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postRenameWorksheetValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postRenameWorksheetAsync( PostRenameWorksheetRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postRenameWorksheetValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postUpdateWorksheetPropertyValidateBeforeCall(PostUpdateWorksheetPropertyRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postUpdateWorksheetProperty(PostUpdateWorksheetPropertyRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postUpdateWorksheetPropertyWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postUpdateWorksheetPropertyWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postUpdateWorksheetPropertyWithHttpInfo(PostUpdateWorksheetPropertyRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postUpdateWorksheetPropertyValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postUpdateWorksheetPropertyAsync( PostUpdateWorksheetPropertyRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postUpdateWorksheetPropertyValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getNamedRangesValidateBeforeCall(GetNamedRangesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  RangesResponse  getNamedRanges(GetNamedRangesRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< RangesResponse > resp = getNamedRangesWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< RangesResponse > resp = getNamedRangesWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< RangesResponse > getNamedRangesWithHttpInfo(GetNamedRangesRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getNamedRangesValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< RangesResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getNamedRangesAsync( GetNamedRangesRequest request, final ApiCallback< RangesResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getNamedRangesValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< RangesResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getNamedRangeValueValidateBeforeCall(GetNamedRangeValueRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  RangeValueResponse  getNamedRangeValue(GetNamedRangeValueRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< RangeValueResponse > resp = getNamedRangeValueWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< RangeValueResponse > resp = getNamedRangeValueWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< RangeValueResponse > getNamedRangeValueWithHttpInfo(GetNamedRangeValueRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getNamedRangeValueValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< RangeValueResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getNamedRangeValueAsync( GetNamedRangeValueRequest request, final ApiCallback< RangeValueResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getNamedRangeValueValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< RangeValueResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postUpdateWorksheetZoomValidateBeforeCall(PostUpdateWorksheetZoomRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postUpdateWorksheetZoom(PostUpdateWorksheetZoomRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postUpdateWorksheetZoomWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postUpdateWorksheetZoomWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postUpdateWorksheetZoomWithHttpInfo(PostUpdateWorksheetZoomRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postUpdateWorksheetZoomValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postUpdateWorksheetZoomAsync( PostUpdateWorksheetZoomRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postUpdateWorksheetZoomValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getWorksheetPageCountValidateBeforeCall(GetWorksheetPageCountRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  Integer  getWorksheetPageCount(GetWorksheetPageCountRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< Integer > resp = getWorksheetPageCountWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< Integer > resp = getWorksheetPageCountWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< Integer > getWorksheetPageCountWithHttpInfo(GetWorksheetPageCountRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getWorksheetPageCountValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< Integer >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getWorksheetPageCountAsync( GetWorksheetPageCountRequest request, final ApiCallback< Integer > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getWorksheetPageCountValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< Integer >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getWorksheetValidationsValidateBeforeCall(GetWorksheetValidationsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  ValidationsResponse  getWorksheetValidations(GetWorksheetValidationsRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< ValidationsResponse > resp = getWorksheetValidationsWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< ValidationsResponse > resp = getWorksheetValidationsWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< ValidationsResponse > getWorksheetValidationsWithHttpInfo(GetWorksheetValidationsRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getWorksheetValidationsValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< ValidationsResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getWorksheetValidationsAsync( GetWorksheetValidationsRequest request, final ApiCallback< ValidationsResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getWorksheetValidationsValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< ValidationsResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getWorksheetValidationValidateBeforeCall(GetWorksheetValidationRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  ValidationResponse  getWorksheetValidation(GetWorksheetValidationRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< ValidationResponse > resp = getWorksheetValidationWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< ValidationResponse > resp = getWorksheetValidationWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< ValidationResponse > getWorksheetValidationWithHttpInfo(GetWorksheetValidationRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getWorksheetValidationValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< ValidationResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getWorksheetValidationAsync( GetWorksheetValidationRequest request, final ApiCallback< ValidationResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getWorksheetValidationValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< ValidationResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call putWorksheetValidationValidateBeforeCall(PutWorksheetValidationRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  putWorksheetValidation(PutWorksheetValidationRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = putWorksheetValidationWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = putWorksheetValidationWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > putWorksheetValidationWithHttpInfo(PutWorksheetValidationRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  putWorksheetValidationValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  putWorksheetValidationAsync( PutWorksheetValidationRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  putWorksheetValidationValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call postWorksheetValidationValidateBeforeCall(PostWorksheetValidationRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  postWorksheetValidation(PostWorksheetValidationRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = postWorksheetValidationWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = postWorksheetValidationWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > postWorksheetValidationWithHttpInfo(PostWorksheetValidationRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  postWorksheetValidationValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  postWorksheetValidationAsync( PostWorksheetValidationRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  postWorksheetValidationValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call deleteWorksheetValidationValidateBeforeCall(DeleteWorksheetValidationRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  deleteWorksheetValidation(DeleteWorksheetValidationRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = deleteWorksheetValidationWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = deleteWorksheetValidationWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > deleteWorksheetValidationWithHttpInfo(DeleteWorksheetValidationRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  deleteWorksheetValidationValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  deleteWorksheetValidationAsync( DeleteWorksheetValidationRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  deleteWorksheetValidationValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call deleteWorksheetValidationsValidateBeforeCall(DeleteWorksheetValidationsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  CellsCloudResponse  deleteWorksheetValidations(DeleteWorksheetValidationsRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< CellsCloudResponse > resp = deleteWorksheetValidationsWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< CellsCloudResponse > resp = deleteWorksheetValidationsWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< CellsCloudResponse > deleteWorksheetValidationsWithHttpInfo(DeleteWorksheetValidationsRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  deleteWorksheetValidationsValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  deleteWorksheetValidationsAsync( DeleteWorksheetValidationsRequest request, final ApiCallback< CellsCloudResponse > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  deleteWorksheetValidationsValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< CellsCloudResponse >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call downloadFileValidateBeforeCall(DownloadFileRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  File  downloadFile(DownloadFileRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< File > resp = downloadFileWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< File > resp = downloadFileWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< File > downloadFileWithHttpInfo(DownloadFileRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  downloadFileValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< File >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  downloadFileAsync( DownloadFileRequest request, final ApiCallback< HashMap<String,File> > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  downloadFileValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< HashMap<String,File> >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call uploadFileValidateBeforeCall(UploadFileRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  FilesUploadResult  uploadFile(UploadFileRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< FilesUploadResult > resp = uploadFileWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< FilesUploadResult > resp = uploadFileWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< FilesUploadResult > uploadFileWithHttpInfo(UploadFileRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  uploadFileValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< FilesUploadResult >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  uploadFileAsync( UploadFileRequest request, final ApiCallback< FilesUploadResult > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  uploadFileValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< FilesUploadResult >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call copyFileValidateBeforeCall(CopyFileRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  void  copyFile(CopyFileRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< Void > resp = copyFileWithHttpInfo(request);
                  return ;  
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< Void > resp = copyFileWithHttpInfo(request);
                      return ;        
                 }
                 throw ex;
             }
         }

         private ApiResponse< Void > copyFileWithHttpInfo(CopyFileRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  copyFileValidateBeforeCall(request, null, null);
             return apiClient.execute(call);
         }

         public com.squareup.okhttp.Call  copyFileAsync( CopyFileRequest request, final ApiCallback< Void > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  copyFileValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< Void >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call moveFileValidateBeforeCall(MoveFileRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  void  moveFile(MoveFileRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< Void > resp = moveFileWithHttpInfo(request);
                  return ;  
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< Void > resp = moveFileWithHttpInfo(request);
                      return ;        
                 }
                 throw ex;
             }
         }

         private ApiResponse< Void > moveFileWithHttpInfo(MoveFileRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  moveFileValidateBeforeCall(request, null, null);
             return apiClient.execute(call);
         }

         public com.squareup.okhttp.Call  moveFileAsync( MoveFileRequest request, final ApiCallback< Void > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  moveFileValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< Void >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call deleteFileValidateBeforeCall(DeleteFileRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  void  deleteFile(DeleteFileRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< Void > resp = deleteFileWithHttpInfo(request);
                  return ;  
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< Void > resp = deleteFileWithHttpInfo(request);
                      return ;        
                 }
                 throw ex;
             }
         }

         private ApiResponse< Void > deleteFileWithHttpInfo(DeleteFileRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  deleteFileValidateBeforeCall(request, null, null);
             return apiClient.execute(call);
         }

         public com.squareup.okhttp.Call  deleteFileAsync( DeleteFileRequest request, final ApiCallback< Void > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  deleteFileValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< Void >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getFilesListValidateBeforeCall(GetFilesListRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  FilesList  getFilesList(GetFilesListRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< FilesList > resp = getFilesListWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< FilesList > resp = getFilesListWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< FilesList > getFilesListWithHttpInfo(GetFilesListRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getFilesListValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< FilesList >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getFilesListAsync( GetFilesListRequest request, final ApiCallback< FilesList > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getFilesListValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< FilesList >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call createFolderValidateBeforeCall(CreateFolderRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  void  createFolder(CreateFolderRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< Void > resp = createFolderWithHttpInfo(request);
                  return ;  
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< Void > resp = createFolderWithHttpInfo(request);
                      return ;        
                 }
                 throw ex;
             }
         }

         private ApiResponse< Void > createFolderWithHttpInfo(CreateFolderRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  createFolderValidateBeforeCall(request, null, null);
             return apiClient.execute(call);
         }

         public com.squareup.okhttp.Call  createFolderAsync( CreateFolderRequest request, final ApiCallback< Void > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  createFolderValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< Void >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call copyFolderValidateBeforeCall(CopyFolderRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  void  copyFolder(CopyFolderRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< Void > resp = copyFolderWithHttpInfo(request);
                  return ;  
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< Void > resp = copyFolderWithHttpInfo(request);
                      return ;        
                 }
                 throw ex;
             }
         }

         private ApiResponse< Void > copyFolderWithHttpInfo(CopyFolderRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  copyFolderValidateBeforeCall(request, null, null);
             return apiClient.execute(call);
         }

         public com.squareup.okhttp.Call  copyFolderAsync( CopyFolderRequest request, final ApiCallback< Void > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  copyFolderValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< Void >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call moveFolderValidateBeforeCall(MoveFolderRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  void  moveFolder(MoveFolderRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< Void > resp = moveFolderWithHttpInfo(request);
                  return ;  
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< Void > resp = moveFolderWithHttpInfo(request);
                      return ;        
                 }
                 throw ex;
             }
         }

         private ApiResponse< Void > moveFolderWithHttpInfo(MoveFolderRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  moveFolderValidateBeforeCall(request, null, null);
             return apiClient.execute(call);
         }

         public com.squareup.okhttp.Call  moveFolderAsync( MoveFolderRequest request, final ApiCallback< Void > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  moveFolderValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< Void >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call deleteFolderValidateBeforeCall(DeleteFolderRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  void  deleteFolder(DeleteFolderRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< Void > resp = deleteFolderWithHttpInfo(request);
                  return ;  
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< Void > resp = deleteFolderWithHttpInfo(request);
                      return ;        
                 }
                 throw ex;
             }
         }

         private ApiResponse< Void > deleteFolderWithHttpInfo(DeleteFolderRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  deleteFolderValidateBeforeCall(request, null, null);
             return apiClient.execute(call);
         }

         public com.squareup.okhttp.Call  deleteFolderAsync( DeleteFolderRequest request, final ApiCallback< Void > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  deleteFolderValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< Void >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call storageExistsValidateBeforeCall(StorageExistsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  StorageExist  storageExists(StorageExistsRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< StorageExist > resp = storageExistsWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< StorageExist > resp = storageExistsWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< StorageExist > storageExistsWithHttpInfo(StorageExistsRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  storageExistsValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< StorageExist >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  storageExistsAsync( StorageExistsRequest request, final ApiCallback< StorageExist > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  storageExistsValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< StorageExist >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call objectExistsValidateBeforeCall(ObjectExistsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  ObjectExist  objectExists(ObjectExistsRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< ObjectExist > resp = objectExistsWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< ObjectExist > resp = objectExistsWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< ObjectExist > objectExistsWithHttpInfo(ObjectExistsRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  objectExistsValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< ObjectExist >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  objectExistsAsync( ObjectExistsRequest request, final ApiCallback< ObjectExist > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  objectExistsValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< ObjectExist >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getDiscUsageValidateBeforeCall(GetDiscUsageRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  DiscUsage  getDiscUsage(GetDiscUsageRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< DiscUsage > resp = getDiscUsageWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< DiscUsage > resp = getDiscUsageWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< DiscUsage > getDiscUsageWithHttpInfo(GetDiscUsageRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getDiscUsageValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< DiscUsage >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getDiscUsageAsync( GetDiscUsageRequest request, final ApiCallback< DiscUsage > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getDiscUsageValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< DiscUsage >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }


         @SuppressWarnings("rawtypes")
         private com.squareup.okhttp.Call getFileVersionsValidateBeforeCall(GetFileVersionsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, IOException {
             return request.buildHttpRequest(apiClient, progressListener, progressRequestListener, true);
         }

         public  FileVersions  getFileVersions(GetFileVersionsRequest request) throws ApiException,  IOException {
             try {
                 ApiResponse< FileVersions > resp = getFileVersionsWithHttpInfo(request);
                  return resp.getData(); 
             }
             catch (ApiException ex) {
                 if (ex.getCode() == apiClient.getNotAuthCode()) {
                     apiClient.requestToken();
                     ApiResponse< FileVersions > resp = getFileVersionsWithHttpInfo(request);
                      return resp.getData();       
                 }
                 throw ex;
             }
         }

         private ApiResponse< FileVersions > getFileVersionsWithHttpInfo(GetFileVersionsRequest request) throws ApiException,  IOException {
             com.squareup.okhttp.Call call =  getFileVersionsValidateBeforeCall(request, null, null);
             Type localVarReturnType = new TypeToken< FileVersions >(){}.getType();
             return apiClient.execute(call, localVarReturnType);
         }

         public com.squareup.okhttp.Call  getFileVersionsAsync( GetFileVersionsRequest request, final ApiCallback< FileVersions > callback) throws ApiException,  IOException {

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

             com.squareup.okhttp.Call call =  getFileVersionsValidateBeforeCall(request, progressListener, progressRequestListener);
             Type localVarReturnType = new TypeToken< FileVersions >(){}.getType();
             apiClient.executeAsync(call, localVarReturnType, callback);
             return call;
         }

}