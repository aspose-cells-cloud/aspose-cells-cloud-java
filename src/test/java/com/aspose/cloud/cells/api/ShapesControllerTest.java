/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ShapesControllerTests.java">
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


public class ShapesControllerTest {
    private String remoteFolder = "TestData/In";

    private  CellsApi api;
    public ShapesControllerTest(){
        try {
            api = new CellsApi(CellsApiUtil.GetClientId(),CellsApiUtil.GetClientSecret(),CellsApiUtil.GetAPIVersion(),CellsApiUtil.GetBaseUrl());
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void GetWorksheetShapesTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorksheetShapesRequest request = new GetWorksheetShapesRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        ShapesResponse response =  this.api.getWorksheetShapes(request);
    }


    @Test
    public void GetWorksheetShapeTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorksheetShapeRequest request = new GetWorksheetShapeRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setShapeindex(0);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        ShapeResponse response =  this.api.getWorksheetShape(request);
    }


    @Test
    public void PutWorksheetShapeTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutWorksheetShapeRequest request = new PutWorksheetShapeRequest();
        Shape shapeDTO = new Shape();
        request.setShapeDTO(shapeDTO);

        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setDrawingType("arc");

        request.setUpperLeftRow(1);

        request.setUpperLeftColumn(1);

        request.setTop(10);

        request.setLeft(10);

        request.setWidth(100);

        request.setHeight(100);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.putWorksheetShape(request);
    }


    @Test
    public void DeleteWorksheetShapesTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        DeleteWorksheetShapesRequest request = new DeleteWorksheetShapesRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.deleteWorksheetShapes(request);
    }


    @Test
    public void DeleteWorksheetShapeTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        DeleteWorksheetShapeRequest request = new DeleteWorksheetShapeRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setShapeindex(0);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.deleteWorksheetShape(request);
    }


    @Test
    public void PostWorksheetShapeTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorksheetShapeRequest request = new PostWorksheetShapeRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setShapeindex(0);

        Shape dto = new Shape();
        dto.setLowerRightColumn(10);

        request.setDto(dto);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postWorksheetShape(request);
    }


    @Test
    public void PostWorksheetGroupShapeTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorksheetGroupShapeRequest request = new PostWorksheetGroupShapeRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet6");
         
        ArrayList<Integer> listShape = new ArrayList<Integer>();
        listShape.add(0);


        listShape.add(1);

        request.setListShape(listShape);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postWorksheetGroupShape(request);
    }


    @Test
    public void PostWorksheetUngroupShapeTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorksheetUngroupShapeRequest request = new PostWorksheetUngroupShapeRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setShapeindex(0);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postWorksheetUngroupShape(request);
    }


}
