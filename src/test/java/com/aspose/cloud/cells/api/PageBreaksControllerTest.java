/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PageBreaksControllerTests.java">
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


public class PageBreaksControllerTest {
    private String remoteFolder = "TestData/In";

    private  CellsApi api;
    public PageBreaksControllerTest(){
        try {
            api = new CellsApi(CellsApiUtil.GetClientId(),CellsApiUtil.GetClientSecret(),CellsApiUtil.GetAPIVersion(),CellsApiUtil.GetBaseUrl());
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void GetVerticalPageBreaksTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetVerticalPageBreaksRequest request = new GetVerticalPageBreaksRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        VerticalPageBreaksResponse response =  this.api.getVerticalPageBreaks(request);
    }


    @Test
    public void GetHorizontalPageBreaksTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetHorizontalPageBreaksRequest request = new GetHorizontalPageBreaksRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        HorizontalPageBreaksResponse response =  this.api.getHorizontalPageBreaks(request);
    }


    @Test
    public void GetVerticalPageBreakTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetVerticalPageBreakRequest request = new GetVerticalPageBreakRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setIndex(0);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        VerticalPageBreakResponse response =  this.api.getVerticalPageBreak(request);
    }


    @Test
    public void GetHorizontalPageBreakTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetHorizontalPageBreakRequest request = new GetHorizontalPageBreakRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setIndex(0);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        HorizontalPageBreakResponse response =  this.api.getHorizontalPageBreak(request);
    }


    @Test
    public void PutVerticalPageBreakTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutVerticalPageBreakRequest request = new PutVerticalPageBreakRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setCellname("A1");

        request.setColumn(1);

        request.setRow(1);

        request.setStartRow(1);

        request.setEndRow(1);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.putVerticalPageBreak(request);
    }


    @Test
    public void PutHorizontalPageBreakTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutHorizontalPageBreakRequest request = new PutHorizontalPageBreakRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setCellname("A1");

        request.setRow(1);

        request.setColumn(1);

        request.setStartColumn(1);

        request.setEndColumn(1);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.putHorizontalPageBreak(request);
    }


    @Test
    public void DeleteVerticalPageBreaksTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        DeleteVerticalPageBreaksRequest request = new DeleteVerticalPageBreaksRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setColumn(0);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.deleteVerticalPageBreaks(request);
    }


    @Test
    public void DeleteHorizontalPageBreaksTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        DeleteHorizontalPageBreaksRequest request = new DeleteHorizontalPageBreaksRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setRow(0);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.deleteHorizontalPageBreaks(request);
    }


    @Test
    public void DeleteVerticalPageBreakTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        DeleteVerticalPageBreakRequest request = new DeleteVerticalPageBreakRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setIndex(0);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.deleteVerticalPageBreak(request);
    }


    @Test
    public void DeleteHorizontalPageBreakTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        DeleteHorizontalPageBreakRequest request = new DeleteHorizontalPageBreakRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setIndex(0);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.deleteHorizontalPageBreak(request);
    }


}
