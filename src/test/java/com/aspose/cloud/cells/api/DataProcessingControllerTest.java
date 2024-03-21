/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="DataProcessingControllerTests.java">
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

import com.aspose.cloud.cells.client.*;
import com.aspose.cloud.cells.model.*;
import com.aspose.cloud.cells.request.*;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.util.HashMap;
import junit.framework.Assert;


public class DataProcessingControllerTest {
    private String remoteFolder = "TestData/In";

    private  CellsApi api;
    public DataProcessingControllerTest(){
        try {
            api = new CellsApi(CellsApiUtil.GetClientId(),CellsApiUtil.GetClientSecret(),CellsApiUtil.GetAPIVersion(),CellsApiUtil.GetBaseUrl());
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void PostWorkbookDataCleansingTest() throws Exception {
        String localName = "BookCsvDuplicateData.csv";
        String remoteName = "BookCsvDuplicateData.csv";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorkbookDataCleansingRequest request = new PostWorkbookDataCleansingRequest();
        request.setName(remoteName);

        DataCleansing dataCleansing = new DataCleansing();
        dataCleansing.setNeedFillData(true);


        DataFill dataFill = new DataFill();
        DataFillValue dataFillDefaultValue = new DataFillValue();
        dataFillDefaultValue.setDefaultDate("2024-01-01");


        dataFillDefaultValue.setDefaultNumber(0);


        dataFillDefaultValue.setDefaultBoolean(false);

        dataFill.setDataFillDefaultValue(dataFillDefaultValue);

        dataCleansing.setDataFill(dataFill);

        request.setDataCleansing(dataCleansing);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        FileInfo response =  this.api.postWorkbookDataCleansing(request);
    }


    @Test
    public void PostWorkbookDataDeduplicationTest() throws Exception {
        String localName = "BookCsvDuplicateData.csv";
        String remoteName = "BookCsvDuplicateData.csv";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorkbookDataDeduplicationRequest request = new PostWorkbookDataDeduplicationRequest();
        request.setName(remoteName);

        DeduplicationRegion deduplicationRegion = new DeduplicationRegion();
        request.setDeduplicationRegion(deduplicationRegion);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        FileInfo response =  this.api.postWorkbookDataDeduplication(request);
    }


    @Test
    public void PostWorkbookDataFillTest() throws Exception {
        String localName = "BookCsvDuplicateData.csv";
        String remoteName = "BookCsvDuplicateData.csv";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorkbookDataFillRequest request = new PostWorkbookDataFillRequest();
        request.setName(remoteName);

        DataFill dataFill = new DataFill();
        DataFillValue dataFillDefaultValue = new DataFillValue();
        dataFillDefaultValue.setDefaultDate("2024-01-01");


        dataFillDefaultValue.setDefaultNumber(0);


        dataFillDefaultValue.setDefaultBoolean(false);

        dataFill.setDataFillDefaultValue(dataFillDefaultValue);

        request.setDataFill(dataFill);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        FileInfo response =  this.api.postWorkbookDataFill(request);
    }


}
