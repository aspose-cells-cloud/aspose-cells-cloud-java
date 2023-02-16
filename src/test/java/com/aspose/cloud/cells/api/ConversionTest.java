/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ConversionTests.java">
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


public class ConversionTest {
    private String remoteFolder = "TestData/In";

    private  CellsApi api;
    public ConversionTest(){
        try {
            api = new CellsApi(CellsApiUtil.GetClientId(),CellsApiUtil.GetClientSecret(),CellsApiUtil.GetAPIVersion(),CellsApiUtil.GetBaseUrl());
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void WorkbookSaveAs_csv_DotNetSDKOutResultPostExcelSaveAscsvTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "csv";
        String newfilename = "DotNetSDK/OutResult/PostExcelSaveAs.csv";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorkbookSaveAsRequest request = new PostWorkbookSaveAsRequest();
        request.setName(remoteName);

        request.setNewfilename(newfilename);

        PdfSaveOptions saveOptions = new PdfSaveOptions();
        saveOptions.setSaveFormat(format);

        request.setSaveOptions(saveOptions);

        request.setFolder(remoteFolder);

        SaveResponse response =  this.api.postWorkbookSaveAs(request);
    }


    @Test
    public void WorkbookSaveAs_xls_DotNetSDKOutResultPostExcelSaveAsxlsTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "xls";
        String newfilename = "DotNetSDK/OutResult/PostExcelSaveAs.xls";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorkbookSaveAsRequest request = new PostWorkbookSaveAsRequest();
        request.setName(remoteName);

        request.setNewfilename(newfilename);

        PdfSaveOptions saveOptions = new PdfSaveOptions();
        saveOptions.setSaveFormat(format);

        request.setSaveOptions(saveOptions);

        request.setFolder(remoteFolder);

        SaveResponse response =  this.api.postWorkbookSaveAs(request);
    }


    @Test
    public void WorkbookSaveAs_html_DotNetSDKOutResultPostExcelSaveAshtmlTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "html";
        String newfilename = "DotNetSDK/OutResult/PostExcelSaveAs.html";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorkbookSaveAsRequest request = new PostWorkbookSaveAsRequest();
        request.setName(remoteName);

        request.setNewfilename(newfilename);

        PdfSaveOptions saveOptions = new PdfSaveOptions();
        saveOptions.setSaveFormat(format);

        request.setSaveOptions(saveOptions);

        request.setFolder(remoteFolder);

        SaveResponse response =  this.api.postWorkbookSaveAs(request);
    }


    @Test
    public void WorkbookSaveAs_mhtml_DotNetSDKOutResultPostExcelSaveAsmhtmlTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "mhtml";
        String newfilename = "DotNetSDK/OutResult/PostExcelSaveAs.mhtml";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorkbookSaveAsRequest request = new PostWorkbookSaveAsRequest();
        request.setName(remoteName);

        request.setNewfilename(newfilename);

        PdfSaveOptions saveOptions = new PdfSaveOptions();
        saveOptions.setSaveFormat(format);

        request.setSaveOptions(saveOptions);

        request.setFolder(remoteFolder);

        SaveResponse response =  this.api.postWorkbookSaveAs(request);
    }


    @Test
    public void WorkbookSaveAs_ods_DotNetSDKOutResultPostExcelSaveAsodsTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "ods";
        String newfilename = "DotNetSDK/OutResult/PostExcelSaveAs.ods";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorkbookSaveAsRequest request = new PostWorkbookSaveAsRequest();
        request.setName(remoteName);

        request.setNewfilename(newfilename);

        PdfSaveOptions saveOptions = new PdfSaveOptions();
        saveOptions.setSaveFormat(format);

        request.setSaveOptions(saveOptions);

        request.setFolder(remoteFolder);

        SaveResponse response =  this.api.postWorkbookSaveAs(request);
    }


    @Test
    public void WorkbookSaveAs_pdf_DotNetSDKOutResultPostExcelSaveAspdfTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "pdf";
        String newfilename = "DotNetSDK/OutResult/PostExcelSaveAs.pdf";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorkbookSaveAsRequest request = new PostWorkbookSaveAsRequest();
        request.setName(remoteName);

        request.setNewfilename(newfilename);

        PdfSaveOptions saveOptions = new PdfSaveOptions();
        saveOptions.setSaveFormat(format);

        request.setSaveOptions(saveOptions);

        request.setFolder(remoteFolder);

        SaveResponse response =  this.api.postWorkbookSaveAs(request);
    }


    @Test
    public void WorkbookSaveAs_xml_DotNetSDKOutResultPostExcelSaveAsxmlTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "xml";
        String newfilename = "DotNetSDK/OutResult/PostExcelSaveAs.xml";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorkbookSaveAsRequest request = new PostWorkbookSaveAsRequest();
        request.setName(remoteName);

        request.setNewfilename(newfilename);

        PdfSaveOptions saveOptions = new PdfSaveOptions();
        saveOptions.setSaveFormat(format);

        request.setSaveOptions(saveOptions);

        request.setFolder(remoteFolder);

        SaveResponse response =  this.api.postWorkbookSaveAs(request);
    }


    @Test
    public void WorkbookSaveAs_txt_DotNetSDKOutResultPostExcelSaveAstxtTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "txt";
        String newfilename = "DotNetSDK/OutResult/PostExcelSaveAs.txt";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorkbookSaveAsRequest request = new PostWorkbookSaveAsRequest();
        request.setName(remoteName);

        request.setNewfilename(newfilename);

        PdfSaveOptions saveOptions = new PdfSaveOptions();
        saveOptions.setSaveFormat(format);

        request.setSaveOptions(saveOptions);

        request.setFolder(remoteFolder);

        SaveResponse response =  this.api.postWorkbookSaveAs(request);
    }


    @Test
    public void WorkbookSaveAs_tif_DotNetSDKOutResultPostExcelSaveAstifTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "tif";
        String newfilename = "DotNetSDK/OutResult/PostExcelSaveAs.tif";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorkbookSaveAsRequest request = new PostWorkbookSaveAsRequest();
        request.setName(remoteName);

        request.setNewfilename(newfilename);

        PdfSaveOptions saveOptions = new PdfSaveOptions();
        saveOptions.setSaveFormat(format);

        request.setSaveOptions(saveOptions);

        request.setFolder(remoteFolder);

        SaveResponse response =  this.api.postWorkbookSaveAs(request);
    }


    @Test
    public void WorkbookSaveAs_xlsb_DotNetSDKOutResultPostExcelSaveAsxlsbTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "xlsb";
        String newfilename = "DotNetSDK/OutResult/PostExcelSaveAs.xlsb";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorkbookSaveAsRequest request = new PostWorkbookSaveAsRequest();
        request.setName(remoteName);

        request.setNewfilename(newfilename);

        PdfSaveOptions saveOptions = new PdfSaveOptions();
        saveOptions.setSaveFormat(format);

        request.setSaveOptions(saveOptions);

        request.setFolder(remoteFolder);

        SaveResponse response =  this.api.postWorkbookSaveAs(request);
    }


    @Test
    public void WorkbookSaveAs_xlsm_DotNetSDKOutResultPostExcelSaveAsxlsmTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "xlsm";
        String newfilename = "DotNetSDK/OutResult/PostExcelSaveAs.xlsm";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorkbookSaveAsRequest request = new PostWorkbookSaveAsRequest();
        request.setName(remoteName);

        request.setNewfilename(newfilename);

        PdfSaveOptions saveOptions = new PdfSaveOptions();
        saveOptions.setSaveFormat(format);

        request.setSaveOptions(saveOptions);

        request.setFolder(remoteFolder);

        SaveResponse response =  this.api.postWorkbookSaveAs(request);
    }


    @Test
    public void WorkbookSaveAs_xlsx_DotNetSDKOutResultPostExcelSaveAsxlsxTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "xlsx";
        String newfilename = "DotNetSDK/OutResult/PostExcelSaveAs.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorkbookSaveAsRequest request = new PostWorkbookSaveAsRequest();
        request.setName(remoteName);

        request.setNewfilename(newfilename);

        PdfSaveOptions saveOptions = new PdfSaveOptions();
        saveOptions.setSaveFormat(format);

        request.setSaveOptions(saveOptions);

        request.setFolder(remoteFolder);

        SaveResponse response =  this.api.postWorkbookSaveAs(request);
    }


    @Test
    public void WorkbookSaveAs_xltm_DotNetSDKOutResultPostExcelSaveAsxltmTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "xltm";
        String newfilename = "DotNetSDK/OutResult/PostExcelSaveAs.xltm";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorkbookSaveAsRequest request = new PostWorkbookSaveAsRequest();
        request.setName(remoteName);

        request.setNewfilename(newfilename);

        PdfSaveOptions saveOptions = new PdfSaveOptions();
        saveOptions.setSaveFormat(format);

        request.setSaveOptions(saveOptions);

        request.setFolder(remoteFolder);

        SaveResponse response =  this.api.postWorkbookSaveAs(request);
    }


    @Test
    public void WorkbookSaveAs_xltx_DotNetSDKOutResultPostExcelSaveAsxltxTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "xltx";
        String newfilename = "DotNetSDK/OutResult/PostExcelSaveAs.xltx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorkbookSaveAsRequest request = new PostWorkbookSaveAsRequest();
        request.setName(remoteName);

        request.setNewfilename(newfilename);

        PdfSaveOptions saveOptions = new PdfSaveOptions();
        saveOptions.setSaveFormat(format);

        request.setSaveOptions(saveOptions);

        request.setFolder(remoteFolder);

        SaveResponse response =  this.api.postWorkbookSaveAs(request);
    }


    @Test
    public void WorkbookSaveAs_xps_DotNetSDKOutResultPostExcelSaveAsxpsTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "xps";
        String newfilename = "DotNetSDK/OutResult/PostExcelSaveAs.xps";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorkbookSaveAsRequest request = new PostWorkbookSaveAsRequest();
        request.setName(remoteName);

        request.setNewfilename(newfilename);

        PdfSaveOptions saveOptions = new PdfSaveOptions();
        saveOptions.setSaveFormat(format);

        request.setSaveOptions(saveOptions);

        request.setFolder(remoteFolder);

        SaveResponse response =  this.api.postWorkbookSaveAs(request);
    }


    @Test
    public void WorkbookSaveAs_png_DotNetSDKOutResultPostExcelSaveAspngTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "png";
        String newfilename = "DotNetSDK/OutResult/PostExcelSaveAs.png";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorkbookSaveAsRequest request = new PostWorkbookSaveAsRequest();
        request.setName(remoteName);

        request.setNewfilename(newfilename);

        PdfSaveOptions saveOptions = new PdfSaveOptions();
        saveOptions.setSaveFormat(format);

        request.setSaveOptions(saveOptions);

        request.setFolder(remoteFolder);

        SaveResponse response =  this.api.postWorkbookSaveAs(request);
    }


    @Test
    public void WorkbookSaveAs_jpg_DotNetSDKOutResultPostExcelSaveAsjpgTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "jpg";
        String newfilename = "DotNetSDK/OutResult/PostExcelSaveAs.jpg";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorkbookSaveAsRequest request = new PostWorkbookSaveAsRequest();
        request.setName(remoteName);

        request.setNewfilename(newfilename);

        PdfSaveOptions saveOptions = new PdfSaveOptions();
        saveOptions.setSaveFormat(format);

        request.setSaveOptions(saveOptions);

        request.setFolder(remoteFolder);

        SaveResponse response =  this.api.postWorkbookSaveAs(request);
    }


    @Test
    public void WorkbookSaveAs_gif_DotNetSDKOutResultPostExcelSaveAsgifTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "gif";
        String newfilename = "DotNetSDK/OutResult/PostExcelSaveAs.gif";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorkbookSaveAsRequest request = new PostWorkbookSaveAsRequest();
        request.setName(remoteName);

        request.setNewfilename(newfilename);

        PdfSaveOptions saveOptions = new PdfSaveOptions();
        saveOptions.setSaveFormat(format);

        request.setSaveOptions(saveOptions);

        request.setFolder(remoteFolder);

        SaveResponse response =  this.api.postWorkbookSaveAs(request);
    }


    @Test
    public void WorkbookSaveAs_emf_DotNetSDKOutResultPostExcelSaveAsemfTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "emf";
        String newfilename = "DotNetSDK/OutResult/PostExcelSaveAs.emf";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorkbookSaveAsRequest request = new PostWorkbookSaveAsRequest();
        request.setName(remoteName);

        request.setNewfilename(newfilename);

        PdfSaveOptions saveOptions = new PdfSaveOptions();
        saveOptions.setSaveFormat(format);

        request.setSaveOptions(saveOptions);

        request.setFolder(remoteFolder);

        SaveResponse response =  this.api.postWorkbookSaveAs(request);
    }


    @Test
    public void WorkbookSaveAs_bmp_DotNetSDKOutResultPostExcelSaveAsbmpTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "bmp";
        String newfilename = "DotNetSDK/OutResult/PostExcelSaveAs.bmp";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorkbookSaveAsRequest request = new PostWorkbookSaveAsRequest();
        request.setName(remoteName);

        request.setNewfilename(newfilename);

        PdfSaveOptions saveOptions = new PdfSaveOptions();
        saveOptions.setSaveFormat(format);

        request.setSaveOptions(saveOptions);

        request.setFolder(remoteFolder);

        SaveResponse response =  this.api.postWorkbookSaveAs(request);
    }


    @Test
    public void WorkbookSaveAs_md_DotNetSDKOutResultPostExcelSaveAsmdTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "md";
        String newfilename = "DotNetSDK/OutResult/PostExcelSaveAs.md";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorkbookSaveAsRequest request = new PostWorkbookSaveAsRequest();
        request.setName(remoteName);

        request.setNewfilename(newfilename);

        PdfSaveOptions saveOptions = new PdfSaveOptions();
        saveOptions.setSaveFormat(format);

        request.setSaveOptions(saveOptions);

        request.setFolder(remoteFolder);

        SaveResponse response =  this.api.postWorkbookSaveAs(request);
    }


    @Test
    public void WorkbookSaveAs_numbers_DotNetSDKOutResultPostExcelSaveAsnumbersTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "numbers";
        String newfilename = "DotNetSDK/OutResult/PostExcelSaveAs.numbers";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorkbookSaveAsRequest request = new PostWorkbookSaveAsRequest();
        request.setName(remoteName);

        request.setNewfilename(newfilename);

        PdfSaveOptions saveOptions = new PdfSaveOptions();
        saveOptions.setSaveFormat(format);

        request.setSaveOptions(saveOptions);

        request.setFolder(remoteFolder);

        SaveResponse response =  this.api.postWorkbookSaveAs(request);
    }


    @Test
    public void WorkbookSaveAs_wmf_DotNetSDKOutResultPostExcelSaveAswmfTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "wmf";
        String newfilename = "DotNetSDK/OutResult/PostExcelSaveAs.wmf";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorkbookSaveAsRequest request = new PostWorkbookSaveAsRequest();
        request.setName(remoteName);

        request.setNewfilename(newfilename);

        PdfSaveOptions saveOptions = new PdfSaveOptions();
        saveOptions.setSaveFormat(format);

        request.setSaveOptions(saveOptions);

        request.setFolder(remoteFolder);

        SaveResponse response =  this.api.postWorkbookSaveAs(request);
    }


    @Test
    public void WorkbookSaveAs_svg_DotNetSDKOutResultPostExcelSaveAssvgTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "svg";
        String newfilename = "DotNetSDK/OutResult/PostExcelSaveAs.svg";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorkbookSaveAsRequest request = new PostWorkbookSaveAsRequest();
        request.setName(remoteName);

        request.setNewfilename(newfilename);

        PdfSaveOptions saveOptions = new PdfSaveOptions();
        saveOptions.setSaveFormat(format);

        request.setSaveOptions(saveOptions);

        request.setFolder(remoteFolder);

        SaveResponse response =  this.api.postWorkbookSaveAs(request);
    }


    @Test
    public void WorkbookSaveAs_docx_DotNetSDKOutResultPostExcelSaveAsdocxTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "docx";
        String newfilename = "DotNetSDK/OutResult/PostExcelSaveAs.docx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorkbookSaveAsRequest request = new PostWorkbookSaveAsRequest();
        request.setName(remoteName);

        request.setNewfilename(newfilename);

        PdfSaveOptions saveOptions = new PdfSaveOptions();
        saveOptions.setSaveFormat(format);

        request.setSaveOptions(saveOptions);

        request.setFolder(remoteFolder);

        SaveResponse response =  this.api.postWorkbookSaveAs(request);
    }


    @Test
    public void WorkbookSaveAs_pptx_DotNetSDKOutResultPostExcelSaveAspptxTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "pptx";
        String newfilename = "DotNetSDK/OutResult/PostExcelSaveAs.pptx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorkbookSaveAsRequest request = new PostWorkbookSaveAsRequest();
        request.setName(remoteName);

        request.setNewfilename(newfilename);

        PdfSaveOptions saveOptions = new PdfSaveOptions();
        saveOptions.setSaveFormat(format);

        request.setSaveOptions(saveOptions);

        request.setFolder(remoteFolder);

        SaveResponse response =  this.api.postWorkbookSaveAs(request);
    }


    @Test
    public void WorkbookSaveAs_json_DotNetSDKOutResultPostExcelSaveAsjsonTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "json";
        String newfilename = "DotNetSDK/OutResult/PostExcelSaveAs.json";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorkbookSaveAsRequest request = new PostWorkbookSaveAsRequest();
        request.setName(remoteName);

        request.setNewfilename(newfilename);

        PdfSaveOptions saveOptions = new PdfSaveOptions();
        saveOptions.setSaveFormat(format);

        request.setSaveOptions(saveOptions);

        request.setFolder(remoteFolder);

        SaveResponse response =  this.api.postWorkbookSaveAs(request);
    }


    @Test
    public void WorkbookSaveAs_sql_DotNetSDKOutResultPostExcelSaveAssqlTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "sql";
        String newfilename = "DotNetSDK/OutResult/PostExcelSaveAs.sql";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorkbookSaveAsRequest request = new PostWorkbookSaveAsRequest();
        request.setName(remoteName);

        request.setNewfilename(newfilename);

        PdfSaveOptions saveOptions = new PdfSaveOptions();
        saveOptions.setSaveFormat(format);

        request.setSaveOptions(saveOptions);

        request.setFolder(remoteFolder);

        SaveResponse response =  this.api.postWorkbookSaveAs(request);
    }


    @Test
    public void GetWorkbookFormat_csvTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "csv";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorkbookRequest request = new GetWorkbookRequest();
        request.setName(remoteName);

        request.setFormat(format);

        request.setFolder(remoteFolder);

        File response =  this.api.getWorkbook(request);
    }


    @Test
    public void GetWorkbookFormat_xlsTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "xls";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorkbookRequest request = new GetWorkbookRequest();
        request.setName(remoteName);

        request.setFormat(format);

        request.setFolder(remoteFolder);

        File response =  this.api.getWorkbook(request);
    }


    @Test
    public void GetWorkbookFormat_htmlTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "html";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorkbookRequest request = new GetWorkbookRequest();
        request.setName(remoteName);

        request.setFormat(format);

        request.setFolder(remoteFolder);

        File response =  this.api.getWorkbook(request);
    }


    @Test
    public void GetWorkbookFormat_mhtmlTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "mhtml";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorkbookRequest request = new GetWorkbookRequest();
        request.setName(remoteName);

        request.setFormat(format);

        request.setFolder(remoteFolder);

        File response =  this.api.getWorkbook(request);
    }


    @Test
    public void GetWorkbookFormat_odsTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "ods";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorkbookRequest request = new GetWorkbookRequest();
        request.setName(remoteName);

        request.setFormat(format);

        request.setFolder(remoteFolder);

        File response =  this.api.getWorkbook(request);
    }


    @Test
    public void GetWorkbookFormat_pdfTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "pdf";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorkbookRequest request = new GetWorkbookRequest();
        request.setName(remoteName);

        request.setFormat(format);

        request.setFolder(remoteFolder);

        File response =  this.api.getWorkbook(request);
    }


    @Test
    public void GetWorkbookFormat_xmlTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "xml";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorkbookRequest request = new GetWorkbookRequest();
        request.setName(remoteName);

        request.setFormat(format);

        request.setFolder(remoteFolder);

        File response =  this.api.getWorkbook(request);
    }


    @Test
    public void GetWorkbookFormat_txtTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "txt";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorkbookRequest request = new GetWorkbookRequest();
        request.setName(remoteName);

        request.setFormat(format);

        request.setFolder(remoteFolder);

        File response =  this.api.getWorkbook(request);
    }


    @Test
    public void GetWorkbookFormat_tifTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "tif";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorkbookRequest request = new GetWorkbookRequest();
        request.setName(remoteName);

        request.setFormat(format);

        request.setFolder(remoteFolder);

        File response =  this.api.getWorkbook(request);
    }


    @Test
    public void GetWorkbookFormat_xlsbTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "xlsb";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorkbookRequest request = new GetWorkbookRequest();
        request.setName(remoteName);

        request.setFormat(format);

        request.setFolder(remoteFolder);

        File response =  this.api.getWorkbook(request);
    }


    @Test
    public void GetWorkbookFormat_xlsmTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "xlsm";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorkbookRequest request = new GetWorkbookRequest();
        request.setName(remoteName);

        request.setFormat(format);

        request.setFolder(remoteFolder);

        File response =  this.api.getWorkbook(request);
    }


    @Test
    public void GetWorkbookFormat_xlsxTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorkbookRequest request = new GetWorkbookRequest();
        request.setName(remoteName);

        request.setFormat(format);

        request.setFolder(remoteFolder);

        File response =  this.api.getWorkbook(request);
    }


    @Test
    public void GetWorkbookFormat_xltmTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "xltm";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorkbookRequest request = new GetWorkbookRequest();
        request.setName(remoteName);

        request.setFormat(format);

        request.setFolder(remoteFolder);

        File response =  this.api.getWorkbook(request);
    }


    @Test
    public void GetWorkbookFormat_xltxTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "xltx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorkbookRequest request = new GetWorkbookRequest();
        request.setName(remoteName);

        request.setFormat(format);

        request.setFolder(remoteFolder);

        File response =  this.api.getWorkbook(request);
    }


    @Test
    public void GetWorkbookFormat_xpsTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "xps";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorkbookRequest request = new GetWorkbookRequest();
        request.setName(remoteName);

        request.setFormat(format);

        request.setFolder(remoteFolder);

        File response =  this.api.getWorkbook(request);
    }


    @Test
    public void GetWorkbookFormat_pngTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "png";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorkbookRequest request = new GetWorkbookRequest();
        request.setName(remoteName);

        request.setFormat(format);

        request.setFolder(remoteFolder);

        File response =  this.api.getWorkbook(request);
    }


    @Test
    public void GetWorkbookFormat_jpgTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "jpg";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorkbookRequest request = new GetWorkbookRequest();
        request.setName(remoteName);

        request.setFormat(format);

        request.setFolder(remoteFolder);

        File response =  this.api.getWorkbook(request);
    }


    @Test
    public void GetWorkbookFormat_gifTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "gif";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorkbookRequest request = new GetWorkbookRequest();
        request.setName(remoteName);

        request.setFormat(format);

        request.setFolder(remoteFolder);

        File response =  this.api.getWorkbook(request);
    }


    @Test
    public void GetWorkbookFormat_emfTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "emf";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorkbookRequest request = new GetWorkbookRequest();
        request.setName(remoteName);

        request.setFormat(format);

        request.setFolder(remoteFolder);

        File response =  this.api.getWorkbook(request);
    }


    @Test
    public void GetWorkbookFormat_bmpTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "bmp";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorkbookRequest request = new GetWorkbookRequest();
        request.setName(remoteName);

        request.setFormat(format);

        request.setFolder(remoteFolder);

        File response =  this.api.getWorkbook(request);
    }


    @Test
    public void GetWorkbookFormat_mdTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "md";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorkbookRequest request = new GetWorkbookRequest();
        request.setName(remoteName);

        request.setFormat(format);

        request.setFolder(remoteFolder);

        File response =  this.api.getWorkbook(request);
    }


    @Test
    public void GetWorkbookFormat_numbersTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "numbers";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorkbookRequest request = new GetWorkbookRequest();
        request.setName(remoteName);

        request.setFormat(format);

        request.setFolder(remoteFolder);

        File response =  this.api.getWorkbook(request);
    }


    @Test
    public void GetWorkbookFormat_wmfTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "wmf";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorkbookRequest request = new GetWorkbookRequest();
        request.setName(remoteName);

        request.setFormat(format);

        request.setFolder(remoteFolder);

        File response =  this.api.getWorkbook(request);
    }


    @Test
    public void GetWorkbookFormat_svgTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "svg";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorkbookRequest request = new GetWorkbookRequest();
        request.setName(remoteName);

        request.setFormat(format);

        request.setFolder(remoteFolder);

        File response =  this.api.getWorkbook(request);
    }


    @Test
    public void GetWorkbookFormat_docxTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "docx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorkbookRequest request = new GetWorkbookRequest();
        request.setName(remoteName);

        request.setFormat(format);

        request.setFolder(remoteFolder);

        File response =  this.api.getWorkbook(request);
    }


    @Test
    public void GetWorkbookFormat_pptxTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "pptx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorkbookRequest request = new GetWorkbookRequest();
        request.setName(remoteName);

        request.setFormat(format);

        request.setFolder(remoteFolder);

        File response =  this.api.getWorkbook(request);
    }


    @Test
    public void GetWorkbookFormat_jsonTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "json";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorkbookRequest request = new GetWorkbookRequest();
        request.setName(remoteName);

        request.setFormat(format);

        request.setFolder(remoteFolder);

        File response =  this.api.getWorkbook(request);
    }


    @Test
    public void GetWorkbookFormat_sqlTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "sql";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorkbookRequest request = new GetWorkbookRequest();
        request.setName(remoteName);

        request.setFormat(format);

        request.setFolder(remoteFolder);

        File response =  this.api.getWorkbook(request);
    }


    @Test
    public void ConvertWorkbook_csvTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "csv";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(localName ,CellsApiUtil.GetFileHolder(localName) ); 
        request.setFile(fileMap);
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbook_xlsTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "xls";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(localName ,CellsApiUtil.GetFileHolder(localName) ); 
        request.setFile(fileMap);
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbook_htmlTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "html";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(localName ,CellsApiUtil.GetFileHolder(localName) ); 
        request.setFile(fileMap);
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbook_mhtmlTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "mhtml";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(localName ,CellsApiUtil.GetFileHolder(localName) ); 
        request.setFile(fileMap);
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbook_odsTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "ods";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(localName ,CellsApiUtil.GetFileHolder(localName) ); 
        request.setFile(fileMap);
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbook_pdfTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "pdf";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(localName ,CellsApiUtil.GetFileHolder(localName) ); 
        request.setFile(fileMap);
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbook_xmlTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "xml";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(localName ,CellsApiUtil.GetFileHolder(localName) ); 
        request.setFile(fileMap);
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbook_txtTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "txt";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(localName ,CellsApiUtil.GetFileHolder(localName) ); 
        request.setFile(fileMap);
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbook_tifTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "tif";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(localName ,CellsApiUtil.GetFileHolder(localName) ); 
        request.setFile(fileMap);
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbook_xlsbTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "xlsb";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(localName ,CellsApiUtil.GetFileHolder(localName) ); 
        request.setFile(fileMap);
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbook_xlsmTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "xlsm";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(localName ,CellsApiUtil.GetFileHolder(localName) ); 
        request.setFile(fileMap);
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbook_xlsxTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(localName ,CellsApiUtil.GetFileHolder(localName) ); 
        request.setFile(fileMap);
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbook_xltmTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "xltm";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(localName ,CellsApiUtil.GetFileHolder(localName) ); 
        request.setFile(fileMap);
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbook_xltxTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "xltx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(localName ,CellsApiUtil.GetFileHolder(localName) ); 
        request.setFile(fileMap);
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbook_xpsTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "xps";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(localName ,CellsApiUtil.GetFileHolder(localName) ); 
        request.setFile(fileMap);
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbook_pngTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "png";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(localName ,CellsApiUtil.GetFileHolder(localName) ); 
        request.setFile(fileMap);
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbook_jpgTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "jpg";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(localName ,CellsApiUtil.GetFileHolder(localName) ); 
        request.setFile(fileMap);
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbook_gifTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "gif";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(localName ,CellsApiUtil.GetFileHolder(localName) ); 
        request.setFile(fileMap);
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbook_emfTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "emf";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(localName ,CellsApiUtil.GetFileHolder(localName) ); 
        request.setFile(fileMap);
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbook_bmpTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "bmp";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(localName ,CellsApiUtil.GetFileHolder(localName) ); 
        request.setFile(fileMap);
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbook_mdTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "md";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(localName ,CellsApiUtil.GetFileHolder(localName) ); 
        request.setFile(fileMap);
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbook_numbersTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "numbers";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(localName ,CellsApiUtil.GetFileHolder(localName) ); 
        request.setFile(fileMap);
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbook_wmfTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "wmf";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(localName ,CellsApiUtil.GetFileHolder(localName) ); 
        request.setFile(fileMap);
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbook_svgTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "svg";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(localName ,CellsApiUtil.GetFileHolder(localName) ); 
        request.setFile(fileMap);
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbook_docxTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "docx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(localName ,CellsApiUtil.GetFileHolder(localName) ); 
        request.setFile(fileMap);
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbook_pptxTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "pptx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(localName ,CellsApiUtil.GetFileHolder(localName) ); 
        request.setFile(fileMap);
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbook_jsonTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "json";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(localName ,CellsApiUtil.GetFileHolder(localName) ); 
        request.setFile(fileMap);
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbook_sqlTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "sql";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(localName ,CellsApiUtil.GetFileHolder(localName) ); 
        request.setFile(fileMap);
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbookSaveCloud_csv_DotNetSDKOutResultConvertWorkbookcsvTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "csv";
        String outPath = "DotNetSDK/OutResult/ConvertWorkbook.csv";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);

        request.setOutPath(outPath);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(localName ,CellsApiUtil.GetFileHolder(localName) ); 
        request.setFile(fileMap);
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbookSaveCloud_xls_DotNetSDKOutResultConvertWorkbookxlsTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "xls";
        String outPath = "DotNetSDK/OutResult/ConvertWorkbook.xls";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);

        request.setOutPath(outPath);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(localName ,CellsApiUtil.GetFileHolder(localName) ); 
        request.setFile(fileMap);
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbookSaveCloud_html_DotNetSDKOutResultConvertWorkbookhtmlTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "html";
        String outPath = "DotNetSDK/OutResult/ConvertWorkbook.html";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);

        request.setOutPath(outPath);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(localName ,CellsApiUtil.GetFileHolder(localName) ); 
        request.setFile(fileMap);
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbookSaveCloud_mhtml_DotNetSDKOutResultConvertWorkbookmhtmlTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "mhtml";
        String outPath = "DotNetSDK/OutResult/ConvertWorkbook.mhtml";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);

        request.setOutPath(outPath);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(localName ,CellsApiUtil.GetFileHolder(localName) ); 
        request.setFile(fileMap);
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbookSaveCloud_ods_DotNetSDKOutResultConvertWorkbookodsTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "ods";
        String outPath = "DotNetSDK/OutResult/ConvertWorkbook.ods";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);

        request.setOutPath(outPath);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(localName ,CellsApiUtil.GetFileHolder(localName) ); 
        request.setFile(fileMap);
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbookSaveCloud_pdf_DotNetSDKOutResultConvertWorkbookpdfTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "pdf";
        String outPath = "DotNetSDK/OutResult/ConvertWorkbook.pdf";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);

        request.setOutPath(outPath);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(localName ,CellsApiUtil.GetFileHolder(localName) ); 
        request.setFile(fileMap);
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbookSaveCloud_xml_DotNetSDKOutResultConvertWorkbookxmlTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "xml";
        String outPath = "DotNetSDK/OutResult/ConvertWorkbook.xml";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);

        request.setOutPath(outPath);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(localName ,CellsApiUtil.GetFileHolder(localName) ); 
        request.setFile(fileMap);
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbookSaveCloud_txt_DotNetSDKOutResultConvertWorkbooktxtTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "txt";
        String outPath = "DotNetSDK/OutResult/ConvertWorkbook.txt";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);

        request.setOutPath(outPath);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(localName ,CellsApiUtil.GetFileHolder(localName) ); 
        request.setFile(fileMap);
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbookSaveCloud_tif_DotNetSDKOutResultConvertWorkbooktifTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "tif";
        String outPath = "DotNetSDK/OutResult/ConvertWorkbook.tif";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);

        request.setOutPath(outPath);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(localName ,CellsApiUtil.GetFileHolder(localName) ); 
        request.setFile(fileMap);
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbookSaveCloud_xlsb_DotNetSDKOutResultConvertWorkbookxlsbTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "xlsb";
        String outPath = "DotNetSDK/OutResult/ConvertWorkbook.xlsb";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);

        request.setOutPath(outPath);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(localName ,CellsApiUtil.GetFileHolder(localName) ); 
        request.setFile(fileMap);
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbookSaveCloud_xlsm_DotNetSDKOutResultConvertWorkbookxlsmTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "xlsm";
        String outPath = "DotNetSDK/OutResult/ConvertWorkbook.xlsm";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);

        request.setOutPath(outPath);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(localName ,CellsApiUtil.GetFileHolder(localName) ); 
        request.setFile(fileMap);
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbookSaveCloud_xlsx_DotNetSDKOutResultConvertWorkbookxlsxTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "xlsx";
        String outPath = "DotNetSDK/OutResult/ConvertWorkbook.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);

        request.setOutPath(outPath);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(localName ,CellsApiUtil.GetFileHolder(localName) ); 
        request.setFile(fileMap);
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbookSaveCloud_xltm_DotNetSDKOutResultConvertWorkbookxltmTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "xltm";
        String outPath = "DotNetSDK/OutResult/ConvertWorkbook.xltm";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);

        request.setOutPath(outPath);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(localName ,CellsApiUtil.GetFileHolder(localName) ); 
        request.setFile(fileMap);
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbookSaveCloud_xltx_DotNetSDKOutResultConvertWorkbookxltxTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "xltx";
        String outPath = "DotNetSDK/OutResult/ConvertWorkbook.xltx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);

        request.setOutPath(outPath);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(localName ,CellsApiUtil.GetFileHolder(localName) ); 
        request.setFile(fileMap);
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbookSaveCloud_xps_DotNetSDKOutResultConvertWorkbookxpsTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "xps";
        String outPath = "DotNetSDK/OutResult/ConvertWorkbook.xps";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);

        request.setOutPath(outPath);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(localName ,CellsApiUtil.GetFileHolder(localName) ); 
        request.setFile(fileMap);
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbookSaveCloud_png_DotNetSDKOutResultConvertWorkbookpngTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "png";
        String outPath = "DotNetSDK/OutResult/ConvertWorkbook.png";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);

        request.setOutPath(outPath);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(localName ,CellsApiUtil.GetFileHolder(localName) ); 
        request.setFile(fileMap);
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbookSaveCloud_jpg_DotNetSDKOutResultConvertWorkbookjpgTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "jpg";
        String outPath = "DotNetSDK/OutResult/ConvertWorkbook.jpg";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);

        request.setOutPath(outPath);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(localName ,CellsApiUtil.GetFileHolder(localName) ); 
        request.setFile(fileMap);
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbookSaveCloud_gif_DotNetSDKOutResultConvertWorkbookgifTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "gif";
        String outPath = "DotNetSDK/OutResult/ConvertWorkbook.gif";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);

        request.setOutPath(outPath);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(localName ,CellsApiUtil.GetFileHolder(localName) ); 
        request.setFile(fileMap);
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbookSaveCloud_emf_DotNetSDKOutResultConvertWorkbookemfTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "emf";
        String outPath = "DotNetSDK/OutResult/ConvertWorkbook.emf";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);

        request.setOutPath(outPath);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(localName ,CellsApiUtil.GetFileHolder(localName) ); 
        request.setFile(fileMap);
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbookSaveCloud_bmp_DotNetSDKOutResultConvertWorkbookbmpTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "bmp";
        String outPath = "DotNetSDK/OutResult/ConvertWorkbook.bmp";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);

        request.setOutPath(outPath);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(localName ,CellsApiUtil.GetFileHolder(localName) ); 
        request.setFile(fileMap);
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbookSaveCloud_md_DotNetSDKOutResultConvertWorkbookmdTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "md";
        String outPath = "DotNetSDK/OutResult/ConvertWorkbook.md";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);

        request.setOutPath(outPath);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(localName ,CellsApiUtil.GetFileHolder(localName) ); 
        request.setFile(fileMap);
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbookSaveCloud_numbers_DotNetSDKOutResultConvertWorkbooknumbersTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "numbers";
        String outPath = "DotNetSDK/OutResult/ConvertWorkbook.numbers";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);

        request.setOutPath(outPath);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(localName ,CellsApiUtil.GetFileHolder(localName) ); 
        request.setFile(fileMap);
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbookSaveCloud_wmf_DotNetSDKOutResultConvertWorkbookwmfTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "wmf";
        String outPath = "DotNetSDK/OutResult/ConvertWorkbook.wmf";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);

        request.setOutPath(outPath);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(localName ,CellsApiUtil.GetFileHolder(localName) ); 
        request.setFile(fileMap);
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbookSaveCloud_svg_DotNetSDKOutResultConvertWorkbooksvgTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "svg";
        String outPath = "DotNetSDK/OutResult/ConvertWorkbook.svg";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);

        request.setOutPath(outPath);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(localName ,CellsApiUtil.GetFileHolder(localName) ); 
        request.setFile(fileMap);
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbookSaveCloud_docx_DotNetSDKOutResultConvertWorkbookdocxTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "docx";
        String outPath = "DotNetSDK/OutResult/ConvertWorkbook.docx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);

        request.setOutPath(outPath);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(localName ,CellsApiUtil.GetFileHolder(localName) ); 
        request.setFile(fileMap);
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbookSaveCloud_pptx_DotNetSDKOutResultConvertWorkbookpptxTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "pptx";
        String outPath = "DotNetSDK/OutResult/ConvertWorkbook.pptx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);

        request.setOutPath(outPath);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(localName ,CellsApiUtil.GetFileHolder(localName) ); 
        request.setFile(fileMap);
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbookSaveCloud_json_DotNetSDKOutResultConvertWorkbookjsonTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "json";
        String outPath = "DotNetSDK/OutResult/ConvertWorkbook.json";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);

        request.setOutPath(outPath);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(localName ,CellsApiUtil.GetFileHolder(localName) ); 
        request.setFile(fileMap);
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbookSaveCloud_sql_DotNetSDKOutResultConvertWorkbooksqlTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "sql";
        String outPath = "DotNetSDK/OutResult/ConvertWorkbook.sql";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);

        request.setOutPath(outPath);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(localName ,CellsApiUtil.GetFileHolder(localName) ); 
        request.setFile(fileMap);
        File response =  this.api.putConvertWorkbook(request);
    }


}
