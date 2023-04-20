/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="XmlControllerTests.java">
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


public class XmlControllerTest {
    private String remoteFolder = "TestData/In";

    private  CellsApi api;
    public XmlControllerTest(){
        try {
            api = new CellsApi(CellsApiUtil.GetClientId(),CellsApiUtil.GetClientSecret(),CellsApiUtil.GetAPIVersion(),CellsApiUtil.GetBaseUrl());
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void PostWorkbookExportXMLTest() throws Exception {
        String localName = "Template.xlsx";
        String remoteName = "Template.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorkbookExportXMLRequest request = new PostWorkbookExportXMLRequest();
        request.setName(remoteName);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        File response =  this.api.postWorkbookExportXML(request);
    }


    @Test
    public void PostWorkbookImportXMLTest() throws Exception {
        String localName = "Template.xlsx";
        String dataXML = "data.xml";
        String remoteName = "Template.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
        CellsApiUtil.Upload(api,  remoteFolder + "/data.xml" , dataXML , "");
       
        PostWorkbookImportXMLRequest request = new PostWorkbookImportXMLRequest();
        request.setName(remoteName);

        ImportXMLRequest importXMLRequest = new ImportXMLRequest();
        FileSource xMLFileSource = new FileSource();
        xMLFileSource.setFileSourceType("CloudFileSystem");


        xMLFileSource.setFilePath(remoteFolder + "/data.xml");

        importXMLRequest.setXMLFileSource(xMLFileSource);


        ImportPosition importPosition = new ImportPosition();
        importPosition.setSheetName("Sheet1");


        importPosition.setRowIndex(3);


        importPosition.setColumnIndex(4);

        importXMLRequest.setImportPosition(importPosition);

        request.setImportXMLRequest(importXMLRequest);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        File response =  this.api.postWorkbookImportXML(request);
    }


}
