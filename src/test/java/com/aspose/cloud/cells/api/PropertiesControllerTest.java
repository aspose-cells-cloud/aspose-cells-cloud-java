/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PropertiesControllerTests.java">
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


public class PropertiesControllerTest {
    private String remoteFolder = "TestData/In";

    private  CellsApi api;
    public PropertiesControllerTest(){
        try {
            api = new CellsApi(CellsApiUtil.GetClientId(),CellsApiUtil.GetClientSecret(),CellsApiUtil.GetAPIVersion(),CellsApiUtil.GetBaseUrl());
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void GetDocumentPropertiesTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetDocumentPropertiesRequest request = new GetDocumentPropertiesRequest();
        request.setName(remoteName);

        request.setType("All");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsDocumentPropertiesResponse response =  this.api.getDocumentProperties(request);
    }


    @Test
    public void GetDocumentPropertyTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetDocumentPropertyRequest request = new GetDocumentPropertyRequest();
        request.setName(remoteName);

        request.setPropertyName("Author");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsDocumentPropertyResponse response =  this.api.getDocumentProperty(request);
    }


    @Test
    public void PutDocumentPropertyTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutDocumentPropertyRequest request = new PutDocumentPropertyRequest();
        request.setName(remoteName);

        CellsDocumentProperty property = new CellsDocumentProperty();
        property.setName("Author");


        property.setValue("cells developer");

        request.setProperty(property);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.putDocumentProperty(request);
    }


    @Test
    public void DeleteDocumentPropertyTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        DeleteDocumentPropertyRequest request = new DeleteDocumentPropertyRequest();
        request.setName(remoteName);

        request.setPropertyName("Author");

        request.setType("All");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.deleteDocumentProperty(request);
    }


    @Test
    public void DeleteDocumentPropertiesTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        DeleteDocumentPropertiesRequest request = new DeleteDocumentPropertiesRequest();
        request.setName(remoteName);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.deleteDocumentProperties(request);
    }


}
