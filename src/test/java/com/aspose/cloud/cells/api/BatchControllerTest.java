/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="BatchControllerTests.java">
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

package com.aspose.cloud.cells.api;

import com.aspose.cloud.cells.client.*;
import com.aspose.cloud.cells.model.*;
import com.aspose.cloud.cells.request.*;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.util.HashMap;
import junit.framework.Assert;


public class BatchControllerTest {
    private String remoteFolder = "TestData/In";

    private  CellsApi api;
    public BatchControllerTest(){
        try {
            api = new CellsApi(CellsApiUtil.GetClientId(),CellsApiUtil.GetClientSecret(),CellsApiUtil.GetAPIVersion(),CellsApiUtil.GetBaseUrl());
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void PostBatchConvertTest() throws Exception {
        String localBook1 = "Book1.xlsx";
        String remoteBook1 = "Book1.xlsx";
        String localMyDoc = "myDocument.xlsx";
        String remoteMyDoc = "myDocument.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteBook1 , localBook1 , "");
        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteMyDoc , localMyDoc , "");
       
        PostBatchConvertRequest request = new PostBatchConvertRequest();
        BatchConvertRequest batchConvertRequest = new BatchConvertRequest();
        batchConvertRequest.setSourceFolder(remoteFolder);


        batchConvertRequest.setFormat("pdf");


        batchConvertRequest.setOutFolder("OutResult");


        MatchConditionRequest matchCondition = new MatchConditionRequest();
        matchCondition.setRegexPattern("(^Book)(.+)(xlsx$)");

        batchConvertRequest.setMatchCondition(matchCondition);

        request.setBatchConvertRequest(batchConvertRequest);

        File response =  this.api.postBatchConvert(request);
    }


    @Test
    public void PostBatchProtectTest() throws Exception {
        String localBook1 = "Book1.xlsx";
        String remoteBook1 = "Book1.xlsx";
        String localMyDoc = "myDocument.xlsx";
        String remoteMyDoc = "myDocument.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteBook1 , localBook1 , "");
        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteMyDoc , localMyDoc , "");
       
        PostBatchProtectRequest request = new PostBatchProtectRequest();
        BatchProtectRequest batchProtectRequest = new BatchProtectRequest();
        batchProtectRequest.setSourceFolder(remoteFolder);


        batchProtectRequest.setProtectionType("All");


        batchProtectRequest.setPassword("123456");


        batchProtectRequest.setOutFolder("OutResult");


        MatchConditionRequest matchCondition = new MatchConditionRequest();
        matchCondition.setRegexPattern("(^Book)(.+)(xlsx$)");

        batchProtectRequest.setMatchCondition(matchCondition);

        request.setBatchProtectRequest(batchProtectRequest);

        File response =  this.api.postBatchProtect(request);
    }


    @Test
    public void PostBatchLockTest() throws Exception {
        String localBook1 = "Book1.xlsx";
        String remoteBook1 = "Book1.xlsx";
        String localMyDoc = "myDocument.xlsx";
        String remoteMyDoc = "myDocument.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteBook1 , localBook1 , "");
        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteMyDoc , localMyDoc , "");
       
        PostBatchLockRequest request = new PostBatchLockRequest();
        BatchLockRequest batchLockRequest = new BatchLockRequest();
        batchLockRequest.setSourceFolder(remoteFolder);


        batchLockRequest.setPassword("123456");


        batchLockRequest.setOutFolder("OutResult");


        MatchConditionRequest matchCondition = new MatchConditionRequest();
        matchCondition.setRegexPattern("(^Book)(.+)(xlsx$)");

        batchLockRequest.setMatchCondition(matchCondition);

        request.setBatchLockRequest(batchLockRequest);

        File response =  this.api.postBatchLock(request);
    }


    @Test
    public void PostBatchUnlockTest() throws Exception {
        String localBook1 = "Book1.xlsx";
        String remoteBook1 = "Book1.xlsx";
        String localMyDoc = "myDocument.xlsx";
        String remoteMyDoc = "myDocument.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteBook1 , localBook1 , "");
        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteMyDoc , localMyDoc , "");
       
        PostBatchUnlockRequest request = new PostBatchUnlockRequest();
        BatchLockRequest batchLockRequest = new BatchLockRequest();
        batchLockRequest.setSourceFolder(remoteFolder);


        batchLockRequest.setPassword("123456");


        batchLockRequest.setOutFolder("OutResult");


        MatchConditionRequest matchCondition = new MatchConditionRequest();
        matchCondition.setRegexPattern("(^Book)(.+)(xlsx$)");

        batchLockRequest.setMatchCondition(matchCondition);

        request.setBatchLockRequest(batchLockRequest);

        File response =  this.api.postBatchUnlock(request);
    }


}
