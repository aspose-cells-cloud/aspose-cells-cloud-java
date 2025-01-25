/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="SparklineGroupsControllerTests.java">
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


public class SparklineGroupsControllerTest {
    private String remoteFolder = "TestData/In";

    private  CellsApi api;
    public SparklineGroupsControllerTest(){
        try {
            api = new CellsApi(CellsApiUtil.GetClientId(),CellsApiUtil.GetClientSecret(),CellsApiUtil.GetAPIVersion(),CellsApiUtil.GetBaseUrl());
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void GetWorksheetSparklineGroupsTest() throws Exception {
        String localName = "TestCase.xlsx";
        String remoteName = "TestCase.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorksheetSparklineGroupsRequest request = new GetWorksheetSparklineGroupsRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        SparklineGroupsResponse response =  this.api.getWorksheetSparklineGroups(request);
    }


    @Test
    public void GetWorksheetSparklineGroupTest() throws Exception {
        String localName = "TestCase.xlsx";
        String remoteName = "TestCase.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorksheetSparklineGroupRequest request = new GetWorksheetSparklineGroupRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setSparklineIndex(0);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        SparklineGroupResponse response =  this.api.getWorksheetSparklineGroup(request);
    }


    @Test
    public void DeleteWorksheetSparklineGroupsTest() throws Exception {
        String localName = "TestCase.xlsx";
        String remoteName = "TestCase.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        DeleteWorksheetSparklineGroupsRequest request = new DeleteWorksheetSparklineGroupsRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.deleteWorksheetSparklineGroups(request);
    }


    @Test
    public void DeleteWorksheetSparklineGroupTest() throws Exception {
        String localName = "TestCase.xlsx";
        String remoteName = "TestCase.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        DeleteWorksheetSparklineGroupRequest request = new DeleteWorksheetSparklineGroupRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setSparklineIndex(0);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.deleteWorksheetSparklineGroup(request);
    }


    @Test
    public void PutWorksheetSparklineGroupTest() throws Exception {
        String localName = "TestCase.xlsx";
        String remoteName = "TestCase.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutWorksheetSparklineGroupRequest request = new PutWorksheetSparklineGroupRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setType("Line");

        request.setDataRange("C6:E13");

        request.setIsVertical(false);

        request.setLocationRange("G6:G13");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.putWorksheetSparklineGroup(request);
    }


    @Test
    public void PostWorksheetSparklineGroupTest() throws Exception {
        String localName = "TestCase.xlsx";
        String remoteName = "TestCase.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorksheetSparklineGroupRequest request = new PostWorksheetSparklineGroupRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setSparklineGroupIndex(0);

        SparklineGroup sparklineGroup = new SparklineGroup();
        sparklineGroup.setDisplayHidden(true);


        sparklineGroup.setPlotRightToLeft(true);

        request.setSparklineGroup(sparklineGroup);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postWorksheetSparklineGroup(request);
    }


}
