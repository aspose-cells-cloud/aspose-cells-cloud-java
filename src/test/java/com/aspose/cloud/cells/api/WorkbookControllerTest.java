/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="WorkbookControllerTests.java">
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


public class WorkbookControllerTest {
    private String remoteFolder = "TestData/In";

    private  CellsApi api;
    public WorkbookControllerTest(){
        try {
            api = new CellsApi(CellsApiUtil.GetClientId(),CellsApiUtil.GetClientSecret(),CellsApiUtil.GetAPIVersion(),CellsApiUtil.GetBaseUrl());
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void PostDigitalSignatureTest() throws Exception {
        String localName = "Book1.xlsx";
        String roywangPFX = "roywang.pfx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
        CellsApiUtil.Upload(api,  remoteFolder + "/roywang.pfx" , roywangPFX , "");
       
        PostDigitalSignatureRequest request = new PostDigitalSignatureRequest();
        request.setName(remoteName);

        request.setDigitalsignaturefile(remoteFolder + "/roywang.pfx");

        request.setPassword("123456");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postDigitalSignature(request);
    }


    @Test
    public void PostEncryptWorkbookTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostEncryptWorkbookRequest request = new PostEncryptWorkbookRequest();
        request.setName(remoteName);

        WorkbookEncryptionRequest encryption = new WorkbookEncryptionRequest();
        encryption.setPassword("123456");


        encryption.setEncryptionType("XOR");


        encryption.setKeyLength(128);

        request.setEncryption(encryption);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postEncryptWorkbook(request);
    }


    @Test
    public void DeleteDecryptWorkbookTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        DeleteDecryptWorkbookRequest request = new DeleteDecryptWorkbookRequest();
        request.setName(remoteName);

        WorkbookEncryptionRequest encryption = new WorkbookEncryptionRequest();
        encryption.setPassword("123456");


        encryption.setEncryptionType("XOR");


        encryption.setKeyLength(128);

        request.setEncryption(encryption);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.deleteDecryptWorkbook(request);
    }


    @Test
    public void PostProtectWorkbookTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostProtectWorkbookRequest request = new PostProtectWorkbookRequest();
        request.setName(remoteName);

        WorkbookProtectionRequest protectWorkbookRequest = new WorkbookProtectionRequest();
        protectWorkbookRequest.setPassword("123456");


        protectWorkbookRequest.setProtectionType("ALL");

        request.setProtectWorkbookRequest(protectWorkbookRequest);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postProtectWorkbook(request);
    }


    @Test
    public void DeleteUnProtectWorkbookTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        DeleteUnProtectWorkbookRequest request = new DeleteUnProtectWorkbookRequest();
        request.setName(remoteName);

        WorkbookProtectionRequest protection = new WorkbookProtectionRequest();
        protection.setPassword("123456");


        protection.setProtectionType("ALL");

        request.setProtection(protection);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.deleteUnProtectWorkbook(request);
    }


    @Test
    public void GetWorkbookDefaultStyleTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorkbookDefaultStyleRequest request = new GetWorkbookDefaultStyleRequest();
        request.setName(remoteName);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        StyleResponse response =  this.api.getWorkbookDefaultStyle(request);
    }


    @Test
    public void GetWorkbookTextItemsTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorkbookTextItemsRequest request = new GetWorkbookTextItemsRequest();
        request.setName(remoteName);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        TextItemsResponse response =  this.api.getWorkbookTextItems(request);
    }


    @Test
    public void GetWorkbookNamesTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorkbookNamesRequest request = new GetWorkbookNamesRequest();
        request.setName(remoteName);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        NamesResponse response =  this.api.getWorkbookNames(request);
    }


    @Test
    public void PutWorkbookNameTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutWorkbookNameRequest request = new PutWorkbookNameRequest();
        request.setName(remoteName);

        Name newName = new Name();
        newName.setText("name_1804");


        newName.setComment("KeepSourceFormatting");


        newName.setRefersTo("=Sheet1!$I$4");

        request.setNewName(newName);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.putWorkbookName(request);
    }


    @Test
    public void GetWorkbookNameTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorkbookNameRequest request = new GetWorkbookNameRequest();
        request.setName(remoteName);

        request.setNameName("Name_2");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        NameResponse response =  this.api.getWorkbookName(request);
    }


    @Test
    public void PostWorkbookNameTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorkbookNameRequest request = new PostWorkbookNameRequest();
        request.setName(remoteName);

        request.setNameName("Name_2");

        Name newName = new Name();
        newName.setText("name_1804");


        newName.setComment("KeepSourceFormatting");


        newName.setRefersTo("=Sheet1!$I$4");

        request.setNewName(newName);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postWorkbookName(request);
    }


    @Test
    public void GetWorkbookNameValueTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorkbookNameValueRequest request = new GetWorkbookNameValueRequest();
        request.setName(remoteName);

        request.setNameName("Name_2");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        RangeValueResponse response =  this.api.getWorkbookNameValue(request);
    }


    @Test
    public void DeleteWorkbookNamesTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        DeleteWorkbookNamesRequest request = new DeleteWorkbookNamesRequest();
        request.setName(remoteName);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.deleteWorkbookNames(request);
    }


    @Test
    public void DeleteWorkbookNameTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        DeleteWorkbookNameRequest request = new DeleteWorkbookNameRequest();
        request.setName(remoteName);

        request.setNameName("Name_2");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.deleteWorkbookName(request);
    }


    @Test
    public void PutDocumentProtectFromChangesTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutDocumentProtectFromChangesRequest request = new PutDocumentProtectFromChangesRequest();
        request.setName(remoteName);

        PasswordRequest password = new PasswordRequest();
        password.setPassword("123456");

        request.setPassword(password);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.putDocumentProtectFromChanges(request);
    }


    @Test
    public void DeleteDocumentUnProtectFromChangesTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        DeleteDocumentUnProtectFromChangesRequest request = new DeleteDocumentUnProtectFromChangesRequest();
        request.setName(remoteName);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.deleteDocumentUnProtectFromChanges(request);
    }


    @Test
    public void PostWorkbooksMergeTest() throws Exception {
        String localName = "Book1.xlsx";
        String myDocumentXLSX = "myDocument.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
        CellsApiUtil.Upload(api,  remoteFolder + "/myDocument.xlsx" , myDocumentXLSX , "");
       
        PostWorkbooksMergeRequest request = new PostWorkbooksMergeRequest();
        request.setName(remoteName);

        request.setMergeWith(remoteFolder + "/myDocument.xlsx");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        request.setMergedStorageName("");

        WorkbookResponse response =  this.api.postWorkbooksMerge(request);
    }


    @Test
    public void PostWorkbooksTextSearchTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorkbooksTextSearchRequest request = new PostWorkbooksTextSearchRequest();
        request.setName(remoteName);

        request.setText("1234");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        TextItemsResponse response =  this.api.postWorkbooksTextSearch(request);
    }


    @Test
    public void PostWorkbookTextReplaceTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorkbookTextReplaceRequest request = new PostWorkbookTextReplaceRequest();
        request.setName(remoteName);

        request.setOldValue("1234");

        request.setNewValue("5678");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        WorkbookReplaceResponse response =  this.api.postWorkbookTextReplace(request);
    }


    @Test
    public void PostWorkbookGetSmartMarkerResultTest() throws Exception {
        String localName = "Book1.xlsx";
        String reportDataXML = "ReportData.xml";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
        CellsApiUtil.Upload(api,  remoteFolder + "/ReportData.xml" , reportDataXML , "");
       
        PostWorkbookGetSmartMarkerResultRequest request = new PostWorkbookGetSmartMarkerResultRequest();
        request.setName(remoteName);

        request.setXmlFile(remoteFolder + "/ReportData.xml");

        request.setFolder(remoteFolder);

        request.setOutPath("OutResult/SmartMarkerResult.xlsx");

        request.setStorageName("");

        request.setOutStorageName("");

        File response =  this.api.postWorkbookGetSmartMarkerResult(request);
    }


    @Test
    public void PutWorkbookCreateTest() throws Exception {
        String localName = "Book1.xlsx";
        String reportDataXML = "ReportData.xml";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
        CellsApiUtil.Upload(api,  remoteFolder + "/ReportData.xml" , reportDataXML , "");
       
        PutWorkbookCreateRequest request = new PutWorkbookCreateRequest();
        request.setName("PutWorkbookCreate.xlsx");

        request.setTemplateFile(remoteFolder + "/" + remoteName);

        request.setDataFile(remoteFolder + "/ReportData.xml");

        request.setIsWriteOver(true);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        request.setCheckExcelRestriction(true);

        CellsCloudResponse response =  this.api.putWorkbookCreate(request);
    }


    @Test
    public void PostWorkbookSplitTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorkbookSplitRequest request = new PostWorkbookSplitRequest();
        request.setName(remoteName);

        request.setFormat("png");

        request.setOutFolder("OutResult");

        request.setFrom(1);

        request.setTo(5);

        request.setSplitNameRule("sheetname");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        request.setOutStorageName("");

        SplitResultResponse response =  this.api.postWorkbookSplit(request);
    }


    @Test
    public void PostImportDataTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostImportDataRequest request = new PostImportDataRequest();
        ImportIntArrayOption importOption = new ImportIntArrayOption();
        importOption.setDestinationWorksheet("Sheet1");


        importOption.setFirstColumn(1);


        importOption.setFirstRow(3);


        importOption.setImportDataType("IntArray");


        importOption.setIsInsert(true);


        importOption.setIsVertical(true);

         
        ArrayList<Integer> importOptionData = new ArrayList<Integer>();
        importOption.setData(importOptionData);

        request.setImportOption(importOption);

        request.setName(remoteName);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postImportData(request);
    }


    @Test
    public void PostWorkbookCalculateFormulaTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorkbookCalculateFormulaRequest request = new PostWorkbookCalculateFormulaRequest();
        request.setName(remoteName);

        CalculationOptions options = new CalculationOptions();
        options.setIgnoreError(true);


        options.setRecursive(true);

        request.setOptions(options);

        request.setIgnoreError(true);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postWorkbookCalculateFormula(request);
    }


    @Test
    public void PostAutofitWorkbookRowsTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostAutofitWorkbookRowsRequest request = new PostAutofitWorkbookRowsRequest();
        request.setName(remoteName);

        request.setStartRow(1);

        request.setEndRow(100);

        request.setOnlyAuto(true);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postAutofitWorkbookRows(request);
    }


    @Test
    public void PostAutofitWorkbookColumnsTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostAutofitWorkbookColumnsRequest request = new PostAutofitWorkbookColumnsRequest();
        request.setName(remoteName);

        request.setStartColumn(1);

        request.setEndColumn(20);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postAutofitWorkbookColumns(request);
    }


    @Test
    public void GetWorkbookSettingsTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorkbookSettingsRequest request = new GetWorkbookSettingsRequest();
        request.setName(remoteName);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        WorkbookSettingsResponse response =  this.api.getWorkbookSettings(request);
    }


    @Test
    public void PostWorkbookSettingsTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorkbookSettingsRequest request = new PostWorkbookSettingsRequest();
        request.setName(remoteName);

        WorkbookSettings settings = new WorkbookSettings();
        settings.setAutoCompressPictures(true);


        settings.setHidePivotFieldList(true);

        request.setSettings(settings);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postWorkbookSettings(request);
    }


    @Test
    public void PutWorkbookBackgroundTest() throws Exception {
        String localName = "Book1.xlsx";
        String waterMarkPNG = "WaterMark.png";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
        CellsApiUtil.Upload(api,  remoteFolder + "/WaterMark.png" , waterMarkPNG , "");
       
        PutWorkbookBackgroundRequest request = new PutWorkbookBackgroundRequest();
        request.setName(remoteName);

        request.setPicPath(remoteFolder + "/WaterMark.png");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.putWorkbookBackground(request);
    }


    @Test
    public void DeleteWorkbookBackgroundTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        DeleteWorkbookBackgroundRequest request = new DeleteWorkbookBackgroundRequest();
        request.setName(remoteName);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.deleteWorkbookBackground(request);
    }


    @Test
    public void PutWorkbookWaterMarkerTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutWorkbookWaterMarkerRequest request = new PutWorkbookWaterMarkerRequest();
        request.setName(remoteName);

        TextWaterMarkerRequest textWaterMarkerRequest = new TextWaterMarkerRequest();
        textWaterMarkerRequest.setText("Aspose Cells Cloud");


        textWaterMarkerRequest.setFontSize(12);

        request.setTextWaterMarkerRequest(textWaterMarkerRequest);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.putWorkbookWaterMarker(request);
    }


    @Test
    public void GetPageCountTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetPageCountRequest request = new GetPageCountRequest();
        request.setName(remoteName);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        Integer response =  this.api.getPageCount(request);
    }


}
