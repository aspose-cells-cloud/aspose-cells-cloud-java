/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ConversionPngTests.java">
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


public class ConversionPngTest {
    private String remoteFolder = "TestData/In";

    private  CellsApi api;
    public ConversionPngTest(){
        try {
            api = new CellsApi(CellsApiUtil.GetClientId(),CellsApiUtil.GetClientSecret(),CellsApiUtil.GetAPIVersion(),CellsApiUtil.GetBaseUrl());
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void ConvertWorkbook_htmlTest() throws Exception {
        String localName = "cloud.png";
        String remoteName = "cloud.png";

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
        String localName = "cloud.png";
        String remoteName = "cloud.png";

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
        String localName = "cloud.png";
        String remoteName = "cloud.png";

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
        String localName = "cloud.png";
        String remoteName = "cloud.png";

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
        String localName = "cloud.png";
        String remoteName = "cloud.png";

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
    public void ConvertWorkbook_tifTest() throws Exception {
        String localName = "cloud.png";
        String remoteName = "cloud.png";

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
        String localName = "cloud.png";
        String remoteName = "cloud.png";

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
        String localName = "cloud.png";
        String remoteName = "cloud.png";

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
    public void ConvertWorkbook_jpgTest() throws Exception {
        String localName = "cloud.png";
        String remoteName = "cloud.png";

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
    public void ConvertWorkbook_mdTest() throws Exception {
        String localName = "cloud.png";
        String remoteName = "cloud.png";

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
        String localName = "cloud.png";
        String remoteName = "cloud.png";

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
    public void ConvertWorkbook_svgTest() throws Exception {
        String localName = "cloud.png";
        String remoteName = "cloud.png";

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
        String localName = "cloud.png";
        String remoteName = "cloud.png";

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
        String localName = "cloud.png";
        String remoteName = "cloud.png";

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
        String localName = "cloud.png";
        String remoteName = "cloud.png";

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
        String localName = "cloud.png";
        String remoteName = "cloud.png";

        String format = "sql";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
        request.setFormat(format);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(localName ,CellsApiUtil.GetFileHolder(localName) ); 
        request.setFile(fileMap);
        File response =  this.api.putConvertWorkbook(request);
    }


}
