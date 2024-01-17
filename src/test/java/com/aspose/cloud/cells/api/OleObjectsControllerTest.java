/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="OleObjectsControllerTests.java">
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


public class OleObjectsControllerTest {
    private String remoteFolder = "TestData/In";

    private  CellsApi api;
    public OleObjectsControllerTest(){
        try {
            api = new CellsApi(CellsApiUtil.GetClientId(),CellsApiUtil.GetClientSecret(),CellsApiUtil.GetAPIVersion(),CellsApiUtil.GetBaseUrl());
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void GetWorksheetOleObjectsTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorksheetOleObjectsRequest request = new GetWorksheetOleObjectsRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet6");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        OleObjectsResponse response =  this.api.getWorksheetOleObjects(request);
    }


    @Test
    public void GetWorksheetOleObjectTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorksheetOleObjectRequest request = new GetWorksheetOleObjectRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet6");

        request.setObjectNumber(0);

        request.setFormat("png");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        File response =  this.api.getWorksheetOleObject(request);
    }


    @Test
    public void DeleteWorksheetOleObjectsTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        DeleteWorksheetOleObjectsRequest request = new DeleteWorksheetOleObjectsRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet6");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.deleteWorksheetOleObjects(request);
    }


    @Test
    public void DeleteWorksheetOleObjectTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        DeleteWorksheetOleObjectRequest request = new DeleteWorksheetOleObjectRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet6");

        request.setOleObjectIndex(0);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.deleteWorksheetOleObject(request);
    }


    @Test
    public void PostUpdateWorksheetOleObjectTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostUpdateWorksheetOleObjectRequest request = new PostUpdateWorksheetOleObjectRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet6");

        request.setOleObjectIndex(0);

        OleObject ole = new OleObject();
        ole.setLeft(10);


        ole.setRight(10);


        ole.setHeight(90);


        ole.setWidth(78);

        request.setOle(ole);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postUpdateWorksheetOleObject(request);
    }


    @Test
    public void PutWorksheetOleObjectTest() throws Exception {
        String localName = "Book1.xlsx";
        String oLEDoc = "OLEDoc.docx";
        String wordJPG = "word.jpg";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
        CellsApiUtil.Upload(api,  "OLEDoc.docx" , oLEDoc , "");
        CellsApiUtil.Upload(api,  "word.jpg" , wordJPG , "");
       
        PutWorksheetOleObjectRequest request = new PutWorksheetOleObjectRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet6");

        request.setUpperLeftRow(1);

        request.setUpperLeftColumn(1);

        request.setHeight(100);

        request.setWidth(80);

        request.setOleFile("OLEDoc.docx");

        request.setImageFile("word.jpg");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.putWorksheetOleObject(request);
    }


}
