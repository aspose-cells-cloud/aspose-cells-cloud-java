/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="AutoFilterControllerTests.java">
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


public class AutoFilterControllerTest {
    private String remoteFolder = "TestData/In";

    private  CellsApi api;
    public AutoFilterControllerTest(){
        try {
            api = new CellsApi(CellsApiUtil.GetClientId(),CellsApiUtil.GetClientSecret(),CellsApiUtil.GetAPIVersion(),CellsApiUtil.GetBaseUrl());
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void GetWorksheetAutoFilterTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorksheetAutoFilterRequest request = new GetWorksheetAutoFilterRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        AutoFilterResponse response =  this.api.getWorksheetAutoFilter(request);
    }


    @Test
    public void PutWorksheetDateFilterTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutWorksheetDateFilterRequest request = new PutWorksheetDateFilterRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setRange("A1:B1");

        request.setFieldIndex(0);

        request.setDateTimeGroupingType("Year");

        request.setYear(1920);

        request.setMatchBlanks(false);

        request.setRefresh(true);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.putWorksheetDateFilter(request);
    }


    @Test
    public void PutWorksheetFilterTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutWorksheetFilterRequest request = new PutWorksheetFilterRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setRange("A1:B1");

        request.setFieldIndex(0);

        request.setCriteria("Year");

        request.setMatchBlanks(false);

        request.setRefresh(true);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.putWorksheetFilter(request);
    }


    @Test
    public void PutWorksheetIconFilterTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutWorksheetIconFilterRequest request = new PutWorksheetIconFilterRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setRange("A1:B1");

        request.setFieldIndex(0);

        request.setIconSetType("ArrowsGray3");

        request.setIconId(1);

        request.setMatchBlanks(false);

        request.setRefresh(true);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.putWorksheetIconFilter(request);
    }


    @Test
    public void PutWorksheetCustomFilterTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutWorksheetCustomFilterRequest request = new PutWorksheetCustomFilterRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setRange("A1:B1");

        request.setFieldIndex(0);

        request.setOperatorType1("LessOrEqual");

        request.setCriteria1("1");

        request.setMatchBlanks(false);

        request.setRefresh(true);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.putWorksheetCustomFilter(request);
    }


    @Test
    public void PutWorksheetDynamicFilterTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutWorksheetDynamicFilterRequest request = new PutWorksheetDynamicFilterRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setRange("A1:B1");

        request.setFieldIndex(0);

        request.setDynamicFilterType("BelowAverage");

        request.setMatchBlanks(false);

        request.setRefresh(true);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.putWorksheetDynamicFilter(request);
    }


    @Test
    public void PutWorksheetFilterTop10Test() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutWorksheetFilterTop10Request request = new PutWorksheetFilterTop10Request();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setRange("A1:B1");

        request.setFieldIndex(0);

        request.setIsTop(true);

        request.setIsPercent(true);

        request.setItemCount(1);

        request.setMatchBlanks(false);

        request.setRefresh(true);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.putWorksheetFilterTop10(request);
    }


    @Test
    public void PutWorksheetColorFilterTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutWorksheetColorFilterRequest request = new PutWorksheetColorFilterRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setRange("A1:B1");

        request.setFieldIndex(0);

        ColorFilterRequest colorFilter = new ColorFilterRequest();
        colorFilter.setPattern("Solid");


        CellsColor foregroundColor = new CellsColor();
        foregroundColor.setType("Automatic");


        Color color = new Color();
        color.setR(48);


        color.setG(48);


        color.setB(48);

        foregroundColor.setColor(color);

        colorFilter.setForegroundColor(foregroundColor);

        request.setColorFilter(colorFilter);

        request.setMatchBlanks(true);

        request.setRefresh(true);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.putWorksheetColorFilter(request);
    }


    @Test
    public void PostWorksheetMatchBlanksTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorksheetMatchBlanksRequest request = new PostWorksheetMatchBlanksRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setFieldIndex(0);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postWorksheetMatchBlanks(request);
    }


    @Test
    public void PostWorksheetMatchNonBlanksTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorksheetMatchNonBlanksRequest request = new PostWorksheetMatchNonBlanksRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setFieldIndex(0);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postWorksheetMatchNonBlanks(request);
    }


    @Test
    public void PostWorksheetAutoFilterRefreshTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorksheetAutoFilterRefreshRequest request = new PostWorksheetAutoFilterRefreshRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postWorksheetAutoFilterRefresh(request);
    }


    @Test
    public void DeleteWorksheetDateFilterTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        DeleteWorksheetDateFilterRequest request = new DeleteWorksheetDateFilterRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setFieldIndex(0);

        request.setDateTimeGroupingType("Year");

        request.setYear(1920);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.deleteWorksheetDateFilter(request);
    }


    @Test
    public void DeleteWorksheetFilterTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        DeleteWorksheetFilterRequest request = new DeleteWorksheetFilterRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setFieldIndex(0);

        request.setCriteria("year");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.deleteWorksheetFilter(request);
    }


}
