/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PicturesControllerTests.java">
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


public class PicturesControllerTest {
    private String remoteFolder = "TestData/In";

    private  CellsApi api;
    public PicturesControllerTest(){
        try {
            api = new CellsApi(CellsApiUtil.GetClientId(),CellsApiUtil.GetClientSecret(),CellsApiUtil.GetAPIVersion(),CellsApiUtil.GetBaseUrl());
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void GetWorksheetPicturesTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorksheetPicturesRequest request = new GetWorksheetPicturesRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet6");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        PicturesResponse response =  this.api.getWorksheetPictures(request);
    }


    @Test
    public void GetWorksheetPictureWithFormatTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorksheetPictureWithFormatRequest request = new GetWorksheetPictureWithFormatRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet6");

        request.setPictureNumber(0);

        request.setFormat("png");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        File response =  this.api.getWorksheetPictureWithFormat(request);
    }


    @Test
    public void PutWorksheetAddPictureTest() throws Exception {
        String localName = "Book1.xlsx";
        String waterMarkPNG = "WaterMark.png";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
        CellsApiUtil.Upload(api,  remoteFolder + "/WaterMark.png" , waterMarkPNG , "");
       
        PutWorksheetAddPictureRequest request = new PutWorksheetAddPictureRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet6");

        request.setUpperLeftRow(1);

        request.setUpperLeftColumn(1);

        request.setLowerRightRow(10);

        request.setLowerRightColumn(10);

        request.setPicturePath(remoteFolder + "/WaterMark.png");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.putWorksheetAddPicture(request);
    }


    @Test
    public void PostWorkSheetPictureTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorkSheetPictureRequest request = new PostWorkSheetPictureRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet6");

        request.setPictureIndex(0);

        Picture picture = new Picture();
        picture.setLeft(10);


        picture.setBottom(10);

        request.setPicture(picture);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postWorkSheetPicture(request);
    }


    @Test
    public void DeleteWorksheetPictureTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        DeleteWorksheetPictureRequest request = new DeleteWorksheetPictureRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet6");

        request.setPictureIndex(0);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.deleteWorksheetPicture(request);
    }


    @Test
    public void DeleteWorkSheetPicturesTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        DeleteWorkSheetPicturesRequest request = new DeleteWorkSheetPicturesRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet6");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.deleteWorkSheetPictures(request);
    }


}
