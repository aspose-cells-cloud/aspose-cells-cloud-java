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
    public void WorkbookSaveAs_csv_OutResultPostExcelSaveAscsvTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "csv";
        String newfilename = "OutResult/PostExcelSaveAs.csv";

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
    public void WorkbookSaveAs_xls_OutResultPostExcelSaveAsxlsTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "xls";
        String newfilename = "OutResult/PostExcelSaveAs.xls";

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
    public void WorkbookSaveAs_html_OutResultPostExcelSaveAshtmlTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "html";
        String newfilename = "OutResult/PostExcelSaveAs.html";

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
    public void WorkbookSaveAs_mhtml_OutResultPostExcelSaveAsmhtmlTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "mhtml";
        String newfilename = "OutResult/PostExcelSaveAs.mhtml";

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
    public void WorkbookSaveAs_ods_OutResultPostExcelSaveAsodsTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "ods";
        String newfilename = "OutResult/PostExcelSaveAs.ods";

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
    public void WorkbookSaveAs_pdf_OutResultPostExcelSaveAspdfTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "pdf";
        String newfilename = "OutResult/PostExcelSaveAs.pdf";

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
    public void WorkbookSaveAs_xml_OutResultPostExcelSaveAsxmlTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "xml";
        String newfilename = "OutResult/PostExcelSaveAs.xml";

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
    public void WorkbookSaveAs_txt_OutResultPostExcelSaveAstxtTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "txt";
        String newfilename = "OutResult/PostExcelSaveAs.txt";

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
    public void WorkbookSaveAs_tif_OutResultPostExcelSaveAstifTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "tif";
        String newfilename = "OutResult/PostExcelSaveAs.tif";

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
    public void WorkbookSaveAs_xlsb_OutResultPostExcelSaveAsxlsbTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "xlsb";
        String newfilename = "OutResult/PostExcelSaveAs.xlsb";

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
    public void WorkbookSaveAs_xlsm_OutResultPostExcelSaveAsxlsmTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "xlsm";
        String newfilename = "OutResult/PostExcelSaveAs.xlsm";

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
    public void WorkbookSaveAs_xlsx_OutResultPostExcelSaveAsxlsxTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "xlsx";
        String newfilename = "OutResult/PostExcelSaveAs.xlsx";

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
    public void WorkbookSaveAs_xltm_OutResultPostExcelSaveAsxltmTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "xltm";
        String newfilename = "OutResult/PostExcelSaveAs.xltm";

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
    public void WorkbookSaveAs_xltx_OutResultPostExcelSaveAsxltxTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "xltx";
        String newfilename = "OutResult/PostExcelSaveAs.xltx";

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
    public void WorkbookSaveAs_xps_OutResultPostExcelSaveAsxpsTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "xps";
        String newfilename = "OutResult/PostExcelSaveAs.xps";

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
    public void WorkbookSaveAs_png_OutResultPostExcelSaveAspngTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "png";
        String newfilename = "OutResult/PostExcelSaveAs.png";

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
    public void WorkbookSaveAs_md_OutResultPostExcelSaveAsmdTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "md";
        String newfilename = "OutResult/PostExcelSaveAs.md";

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
    public void WorkbookSaveAs_numbers_OutResultPostExcelSaveAsnumbersTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "numbers";
        String newfilename = "OutResult/PostExcelSaveAs.numbers";

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
    public void WorkbookSaveAs_svg_OutResultPostExcelSaveAssvgTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "svg";
        String newfilename = "OutResult/PostExcelSaveAs.svg";

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
    public void WorkbookSaveAs_docx_OutResultPostExcelSaveAsdocxTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "docx";
        String newfilename = "OutResult/PostExcelSaveAs.docx";

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
    public void WorkbookSaveAs_pptx_OutResultPostExcelSaveAspptxTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "pptx";
        String newfilename = "OutResult/PostExcelSaveAs.pptx";

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
    public void WorkbookSaveAs_json_OutResultPostExcelSaveAsjsonTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "json";
        String newfilename = "OutResult/PostExcelSaveAs.json";

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
    public void WorkbookSaveAs_sql_OutResultPostExcelSaveAssqlTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "sql";
        String newfilename = "OutResult/PostExcelSaveAs.sql";

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
    public void ConvertWorkbookSaveCloud_csv_OutResultConvertWorkbookcsvTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "csv";
        String outPath = "OutResult/ConvertWorkbook.csv";

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
    public void ConvertWorkbookSaveCloud_xls_OutResultConvertWorkbookxlsTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "xls";
        String outPath = "OutResult/ConvertWorkbook.xls";

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
    public void ConvertWorkbookSaveCloud_html_OutResultConvertWorkbookhtmlTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "html";
        String outPath = "OutResult/ConvertWorkbook.html";

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
    public void ConvertWorkbookSaveCloud_mhtml_OutResultConvertWorkbookmhtmlTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "mhtml";
        String outPath = "OutResult/ConvertWorkbook.mhtml";

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
    public void ConvertWorkbookSaveCloud_ods_OutResultConvertWorkbookodsTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "ods";
        String outPath = "OutResult/ConvertWorkbook.ods";

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
    public void ConvertWorkbookSaveCloud_pdf_OutResultConvertWorkbookpdfTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "pdf";
        String outPath = "OutResult/ConvertWorkbook.pdf";

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
    public void ConvertWorkbookSaveCloud_xml_OutResultConvertWorkbookxmlTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "xml";
        String outPath = "OutResult/ConvertWorkbook.xml";

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
    public void ConvertWorkbookSaveCloud_txt_OutResultConvertWorkbooktxtTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "txt";
        String outPath = "OutResult/ConvertWorkbook.txt";

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
    public void ConvertWorkbookSaveCloud_tif_OutResultConvertWorkbooktifTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "tif";
        String outPath = "OutResult/ConvertWorkbook.tif";

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
    public void ConvertWorkbookSaveCloud_xlsb_OutResultConvertWorkbookxlsbTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "xlsb";
        String outPath = "OutResult/ConvertWorkbook.xlsb";

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
    public void ConvertWorkbookSaveCloud_xlsm_OutResultConvertWorkbookxlsmTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "xlsm";
        String outPath = "OutResult/ConvertWorkbook.xlsm";

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
    public void ConvertWorkbookSaveCloud_xlsx_OutResultConvertWorkbookxlsxTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "xlsx";
        String outPath = "OutResult/ConvertWorkbook.xlsx";

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
    public void ConvertWorkbookSaveCloud_xltm_OutResultConvertWorkbookxltmTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "xltm";
        String outPath = "OutResult/ConvertWorkbook.xltm";

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
    public void ConvertWorkbookSaveCloud_xltx_OutResultConvertWorkbookxltxTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "xltx";
        String outPath = "OutResult/ConvertWorkbook.xltx";

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
    public void ConvertWorkbookSaveCloud_xps_OutResultConvertWorkbookxpsTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "xps";
        String outPath = "OutResult/ConvertWorkbook.xps";

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
    public void ConvertWorkbookSaveCloud_png_OutResultConvertWorkbookpngTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "png";
        String outPath = "OutResult/ConvertWorkbook.png";

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
    public void ConvertWorkbookSaveCloud_md_OutResultConvertWorkbookmdTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "md";
        String outPath = "OutResult/ConvertWorkbook.md";

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
    public void ConvertWorkbookSaveCloud_numbers_OutResultConvertWorkbooknumbersTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "numbers";
        String outPath = "OutResult/ConvertWorkbook.numbers";

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
    public void ConvertWorkbookSaveCloud_svg_OutResultConvertWorkbooksvgTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "svg";
        String outPath = "OutResult/ConvertWorkbook.svg";

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
    public void ConvertWorkbookSaveCloud_docx_OutResultConvertWorkbookdocxTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "docx";
        String outPath = "OutResult/ConvertWorkbook.docx";

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
    public void ConvertWorkbookSaveCloud_pptx_OutResultConvertWorkbookpptxTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "pptx";
        String outPath = "OutResult/ConvertWorkbook.pptx";

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
    public void ConvertWorkbookSaveCloud_json_OutResultConvertWorkbookjsonTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "json";
        String outPath = "OutResult/ConvertWorkbook.json";

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
    public void ConvertWorkbookSaveCloud_sql_OutResultConvertWorkbooksqlTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        String format = "sql";
        String outPath = "OutResult/ConvertWorkbook.sql";

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
