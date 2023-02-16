/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="HypelinksControllerTests.java">
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


public class HypelinksControllerTest {
    private String remoteFolder = "TestData/In";

    private  CellsApi api;
    public HypelinksControllerTest(){
        try {
            api = new CellsApi(CellsApiUtil.GetClientId(),CellsApiUtil.GetClientSecret(),CellsApiUtil.GetAPIVersion(),CellsApiUtil.GetBaseUrl());
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void GetWorkSheetHyperlinksTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorkSheetHyperlinksRequest request = new GetWorkSheetHyperlinksRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        HyperlinksResponse response =  this.api.getWorkSheetHyperlinks(request);
    }


    @Test
    public void GetWorkSheetHyperlinkTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorkSheetHyperlinkRequest request = new GetWorkSheetHyperlinkRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setHyperlinkIndex(0);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        HyperlinkResponse response =  this.api.getWorkSheetHyperlink(request);
    }


    @Test
    public void DeleteWorkSheetHyperlinkTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        DeleteWorkSheetHyperlinkRequest request = new DeleteWorkSheetHyperlinkRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setHyperlinkIndex(0);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.deleteWorkSheetHyperlink(request);
    }


    @Test
    public void PostWorkSheetHyperlinkTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorkSheetHyperlinkRequest request = new PostWorkSheetHyperlinkRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setHyperlinkIndex(0);

        Hyperlink hyperlink = new Hyperlink();
        hyperlink.setAddress("https://products.aspose.cloud/cells/");

        request.setHyperlink(hyperlink);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postWorkSheetHyperlink(request);
    }


    @Test
    public void PutWorkSheetHyperlinkTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutWorkSheetHyperlinkRequest request = new PutWorkSheetHyperlinkRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setFirstRow(1);

        request.setFirstColumn(1);

        request.setTotalRows(2);

        request.setTotalColumns(3);

        request.setAddress("https://products.aspose.cloud/cells/");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.putWorkSheetHyperlink(request);
    }


    @Test
    public void DeleteWorkSheetHyperlinksTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        DeleteWorkSheetHyperlinksRequest request = new DeleteWorkSheetHyperlinksRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.deleteWorkSheetHyperlinks(request);
    }


}
