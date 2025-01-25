/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="StorageControllerTests.java">
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


public class StorageControllerTest {
    private String remoteFolder = "TestData/In";

    private  CellsApi api;
    public StorageControllerTest(){
        try {
            api = new CellsApi(CellsApiUtil.GetClientId(),CellsApiUtil.GetClientSecret(),CellsApiUtil.GetAPIVersion(),CellsApiUtil.GetBaseUrl());
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void StorageExistsTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        StorageExistsRequest request = new StorageExistsRequest();
        request.setStorageName("Default");

        StorageExist response =  this.api.storageExists(request);
    }


    @Test
    public void ObjectExistsTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        ObjectExistsRequest request = new ObjectExistsRequest();
        request.setPath("TestData/In/Book1.xlsx");

        request.setStorageName("");

        request.setVersionId("");

        ObjectExist response =  this.api.objectExists(request);
    }


    @Test
    public void GetDiscUsageTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetDiscUsageRequest request = new GetDiscUsageRequest();
        request.setStorageName("");

        DiscUsage response =  this.api.getDiscUsage(request);
    }


    @Test
    public void GetFileVersionsTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetFileVersionsRequest request = new GetFileVersionsRequest();
        request.setPath("TestData/In/Book1.xlsx");

        request.setStorageName("");

        FileVersions response =  this.api.getFileVersions(request);
    }


}
