/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ConversionJsonTests.java">
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


public class ConversionJsonTest {
    private String remoteFolder = "TestData/In";


    private  CellsApi api;
    public ConversionJsonTest(){
        try {
            api = new CellsApi(CellsApiUtil.GetClientId(),CellsApiUtil.GetClientSecret(),CellsApiUtil.GetAPIVersion(),CellsApiUtil.GetBaseUrl());
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void ConvertWorkbook_csvTest() throws Exception {
        String localName = "codegen-spec.json";
        String remoteName = "codegen-spec.json";

        String format = "csv";
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setLocalPath(CellsApiUtil.GetLocalFilePath(localName) );
        request.setFormat(format);


        //HashMap<String,File> fileMap = new HashMap<String,File>();
        //fileMap.put(localName ,CellsApiUtil.GetFileHolder(localName) );
        //request.setFile(fileMap);
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbook_xlsTest() throws Exception {
        String localName = "codegen-spec.json";
        String remoteName = "codegen-spec.json";

        String format = "xls";


        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);

        request.setLocalPath(CellsApiUtil.GetLocalFilePath(localName) );
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbook_htmlTest() throws Exception {
        String localName = "codegen-spec.json";
        String remoteName = "codegen-spec.json";
        String format = "html";
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);

        request.setLocalPath(CellsApiUtil.GetLocalFilePath(localName) );

        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbook_mhtmlTest() throws Exception {
        String localName = "codegen-spec.json";
        String remoteName = "codegen-spec.json";
        String format = "mhtml";
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);
        request.setLocalPath(CellsApiUtil.GetLocalFilePath(localName) );
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbook_odsTest() throws Exception {
        String localName = "codegen-spec.json";
        String remoteName = "codegen-spec.json";
        String format = "ods";
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);
        request.setLocalPath(CellsApiUtil.GetLocalFilePath(localName) );
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbook_pdfTest() throws Exception {
        String localName = "codegen-spec.json";
        String remoteName = "codegen-spec.json";

        String format = "pdf";


        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);


        request.setLocalPath(CellsApiUtil.GetLocalFilePath(localName) );
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbook_xmlTest() throws Exception {
        String localName = "codegen-spec.json";
        String remoteName = "codegen-spec.json";
        String format = "xml";
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);


        request.setLocalPath(CellsApiUtil.GetLocalFilePath(localName) );
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbook_txtTest() throws Exception {
        String localName = "codegen-spec.json";
        String remoteName = "codegen-spec.json";

        String format = "txt";


        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);


        request.setLocalPath(CellsApiUtil.GetLocalFilePath(localName) );
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbook_xlsbTest() throws Exception {
        String localName = "codegen-spec.json";
        String remoteName = "codegen-spec.json";

        String format = "xlsb";



        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);


        request.setLocalPath(CellsApiUtil.GetLocalFilePath(localName) );
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbook_xpsTest() throws Exception {
        String localName = "codegen-spec.json";
        String remoteName = "codegen-spec.json";

        String format = "xps";



        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);


        request.setLocalPath(CellsApiUtil.GetLocalFilePath(localName) );
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbook_mdTest() throws Exception {
        String localName = "codegen-spec.json";
        String remoteName = "codegen-spec.json";

        String format = "md";



        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);


        request.setLocalPath(CellsApiUtil.GetLocalFilePath(localName) );
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbook_svgTest() throws Exception {
        String localName = "codegen-spec.json";
        String remoteName = "codegen-spec.json";

        String format = "svg";



        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);


        request.setLocalPath(CellsApiUtil.GetLocalFilePath(localName) );
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbook_docxTest() throws Exception {
        String localName = "codegen-spec.json";
        String remoteName = "codegen-spec.json";

        String format = "docx";



        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);


        request.setLocalPath(CellsApiUtil.GetLocalFilePath(localName) );
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbook_pptxTest() throws Exception {
        String localName = "codegen-spec.json";
        String remoteName = "codegen-spec.json";

        String format = "pptx";



        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);


        request.setLocalPath(CellsApiUtil.GetLocalFilePath(localName) );
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbook_jsonTest() throws Exception {
        String localName = "codegen-spec.json";
        String remoteName = "codegen-spec.json";

        String format = "json";


        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);


        request.setLocalPath(CellsApiUtil.GetLocalFilePath(localName) );
        File response =  this.api.putConvertWorkbook(request);
    }


    @Test
    public void ConvertWorkbook_sqlTest() throws Exception {
        String localName = "codegen-spec.json";
        String remoteName = "codegen-spec.json";

        String format = "sql";



        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);


        request.setLocalPath(CellsApiUtil.GetLocalFilePath(localName) );
        File response =  this.api.putConvertWorkbook(request);
    }


}
