/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ConditionalFormattingsControllerTests.java">
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


public class ConditionalFormattingsControllerTest {
    private String remoteFolder = "TestData/In";

    private  CellsApi api;
    public ConditionalFormattingsControllerTest(){
        try {
            api = new CellsApi(CellsApiUtil.GetClientId(),CellsApiUtil.GetClientSecret(),CellsApiUtil.GetAPIVersion(),CellsApiUtil.GetBaseUrl());
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void GetWorksheetConditionalFormattingsTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorksheetConditionalFormattingsRequest request = new GetWorksheetConditionalFormattingsRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        ConditionalFormattingsResponse response =  this.api.getWorksheetConditionalFormattings(request);
    }


    @Test
    public void GetWorksheetConditionalFormattingTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorksheetConditionalFormattingRequest request = new GetWorksheetConditionalFormattingRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setIndex(0);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        ConditionalFormattingResponse response =  this.api.getWorksheetConditionalFormatting(request);
    }


    @Test
    public void PutWorksheetConditionalFormattingTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutWorksheetConditionalFormattingRequest request = new PutWorksheetConditionalFormattingRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        FormatCondition formatcondition = new FormatCondition();
        formatcondition.setType("CellValue");


        formatcondition.setOperator("Between");


        formatcondition.setFormula1("v1");


        formatcondition.setFormula2("v2");

        request.setFormatcondition(formatcondition);

        request.setCellArea("A1:C10");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.putWorksheetConditionalFormatting(request);
    }


    @Test
    public void PutWorksheetFormatConditionTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutWorksheetFormatConditionRequest request = new PutWorksheetFormatConditionRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setIndex(0);

        request.setCellArea("A1:C10");

        request.setType("CellValue");

        request.setOperatorType("Between");

        request.setFormula1("v1");

        request.setFormula2("v2");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.putWorksheetFormatCondition(request);
    }


    @Test
    public void PutWorksheetFormatConditionAreaTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutWorksheetFormatConditionAreaRequest request = new PutWorksheetFormatConditionAreaRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setIndex(0);

        request.setCellArea("A1:C10");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.putWorksheetFormatConditionArea(request);
    }


    @Test
    public void PutWorksheetFormatConditionConditionTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutWorksheetFormatConditionConditionRequest request = new PutWorksheetFormatConditionConditionRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setIndex(0);

        request.setType("CellValue");

        request.setOperatorType("Between");

        request.setFormula1("v1");

        request.setFormula2("v2");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.putWorksheetFormatConditionCondition(request);
    }


    @Test
    public void DeleteWorksheetConditionalFormattingsTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        DeleteWorksheetConditionalFormattingsRequest request = new DeleteWorksheetConditionalFormattingsRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.deleteWorksheetConditionalFormattings(request);
    }


    @Test
    public void DeleteWorksheetConditionalFormattingTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        DeleteWorksheetConditionalFormattingRequest request = new DeleteWorksheetConditionalFormattingRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setIndex(0);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.deleteWorksheetConditionalFormatting(request);
    }


    @Test
    public void DeleteWorksheetConditionalFormattingAreaTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        DeleteWorksheetConditionalFormattingAreaRequest request = new DeleteWorksheetConditionalFormattingAreaRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setStartRow(1);

        request.setStartColumn(1);

        request.setTotalRows(4);

        request.setTotalColumns(6);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.deleteWorksheetConditionalFormattingArea(request);
    }


}
