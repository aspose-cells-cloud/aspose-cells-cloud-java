/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="LightCellsTests.java">
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


public class LightCellsTest {
    private  CellsApi api;
    public LightCellsTest(){
        try {
            api = new CellsApi(CellsApiUtil.GetClientId(),CellsApiUtil.GetClientSecret(),CellsApiUtil.GetAPIVersion(),CellsApiUtil.GetBaseUrl());
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void PostSplit_csvTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "csv";

       
        PostSplitRequest request = new PostSplitRequest();
        request.setFormat(format);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postSplit(request);
    }


    @Test
    public void PostSplit_xlsTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "xls";

       
        PostSplitRequest request = new PostSplitRequest();
        request.setFormat(format);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postSplit(request);
    }


    @Test
    public void PostSplit_htmlTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "html";

       
        PostSplitRequest request = new PostSplitRequest();
        request.setFormat(format);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postSplit(request);
    }


    @Test
    public void PostSplit_mhtmlTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "mhtml";

       
        PostSplitRequest request = new PostSplitRequest();
        request.setFormat(format);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postSplit(request);
    }


    @Test
    public void PostSplit_odsTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "ods";

       
        PostSplitRequest request = new PostSplitRequest();
        request.setFormat(format);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postSplit(request);
    }


    @Test
    public void PostSplit_pdfTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "pdf";

       
        PostSplitRequest request = new PostSplitRequest();
        request.setFormat(format);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postSplit(request);
    }


    @Test
    public void PostSplit_xmlTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "xml";

       
        PostSplitRequest request = new PostSplitRequest();
        request.setFormat(format);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postSplit(request);
    }


    @Test
    public void PostSplit_txtTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "txt";

       
        PostSplitRequest request = new PostSplitRequest();
        request.setFormat(format);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postSplit(request);
    }


    @Test
    public void PostSplit_tifTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "tif";

       
        PostSplitRequest request = new PostSplitRequest();
        request.setFormat(format);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postSplit(request);
    }


    @Test
    public void PostSplit_xlsbTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "xlsb";

       
        PostSplitRequest request = new PostSplitRequest();
        request.setFormat(format);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postSplit(request);
    }


    @Test
    public void PostSplit_xlsmTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "xlsm";

       
        PostSplitRequest request = new PostSplitRequest();
        request.setFormat(format);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postSplit(request);
    }


    @Test
    public void PostSplit_xlsxTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "xlsx";

       
        PostSplitRequest request = new PostSplitRequest();
        request.setFormat(format);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postSplit(request);
    }


    @Test
    public void PostSplit_xltmTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "xltm";

       
        PostSplitRequest request = new PostSplitRequest();
        request.setFormat(format);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postSplit(request);
    }


    @Test
    public void PostSplit_xltxTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "xltx";

       
        PostSplitRequest request = new PostSplitRequest();
        request.setFormat(format);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postSplit(request);
    }


    @Test
    public void PostSplit_xpsTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "xps";

       
        PostSplitRequest request = new PostSplitRequest();
        request.setFormat(format);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postSplit(request);
    }


    @Test
    public void PostSplit_pngTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "png";

       
        PostSplitRequest request = new PostSplitRequest();
        request.setFormat(format);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postSplit(request);
    }


    @Test
    public void PostSplit_jpgTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "jpg";

       
        PostSplitRequest request = new PostSplitRequest();
        request.setFormat(format);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postSplit(request);
    }


    @Test
    public void PostSplit_gifTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "gif";

       
        PostSplitRequest request = new PostSplitRequest();
        request.setFormat(format);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postSplit(request);
    }


    @Test
    public void PostSplit_emfTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "emf";

       
        PostSplitRequest request = new PostSplitRequest();
        request.setFormat(format);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postSplit(request);
    }


    @Test
    public void PostSplit_bmpTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "bmp";

       
        PostSplitRequest request = new PostSplitRequest();
        request.setFormat(format);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postSplit(request);
    }


    @Test
    public void PostSplit_mdTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "md";

       
        PostSplitRequest request = new PostSplitRequest();
        request.setFormat(format);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postSplit(request);
    }


    @Test
    public void PostSplit_numbersTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "numbers";

       
        PostSplitRequest request = new PostSplitRequest();
        request.setFormat(format);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postSplit(request);
    }


    @Test
    public void PostSplit_wmfTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "wmf";

       
        PostSplitRequest request = new PostSplitRequest();
        request.setFormat(format);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postSplit(request);
    }


    @Test
    public void PostSplit_svgTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "svg";

       
        PostSplitRequest request = new PostSplitRequest();
        request.setFormat(format);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postSplit(request);
    }


    @Test
    public void PostSplit_docxTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "docx";

       
        PostSplitRequest request = new PostSplitRequest();
        request.setFormat(format);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postSplit(request);
    }


    @Test
    public void PostSplit_pptxTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "pptx";

       
        PostSplitRequest request = new PostSplitRequest();
        request.setFormat(format);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postSplit(request);
    }


    @Test
    public void PostSplit_jsonTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "json";

       
        PostSplitRequest request = new PostSplitRequest();
        request.setFormat(format);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postSplit(request);
    }


    @Test
    public void PostSplit_sqlTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "sql";

       
        PostSplitRequest request = new PostSplitRequest();
        request.setFormat(format);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postSplit(request);
    }


    @Test
    public void PostAssemble_csvTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "csv";

       
        PostAssembleRequest request = new PostAssembleRequest();
        request.setFormat(format);

        request.setDatasource("ds");
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postAssemble(request);
    }


    @Test
    public void PostAssemble_xlsTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "xls";

       
        PostAssembleRequest request = new PostAssembleRequest();
        request.setFormat(format);

        request.setDatasource("ds");
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postAssemble(request);
    }


    @Test
    public void PostAssemble_htmlTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "html";

       
        PostAssembleRequest request = new PostAssembleRequest();
        request.setFormat(format);

        request.setDatasource("ds");
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postAssemble(request);
    }


    @Test
    public void PostAssemble_mhtmlTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "mhtml";

       
        PostAssembleRequest request = new PostAssembleRequest();
        request.setFormat(format);

        request.setDatasource("ds");
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postAssemble(request);
    }


    @Test
    public void PostAssemble_odsTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "ods";

       
        PostAssembleRequest request = new PostAssembleRequest();
        request.setFormat(format);

        request.setDatasource("ds");
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postAssemble(request);
    }


    @Test
    public void PostAssemble_pdfTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "pdf";

       
        PostAssembleRequest request = new PostAssembleRequest();
        request.setFormat(format);

        request.setDatasource("ds");
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postAssemble(request);
    }


    @Test
    public void PostAssemble_xmlTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "xml";

       
        PostAssembleRequest request = new PostAssembleRequest();
        request.setFormat(format);

        request.setDatasource("ds");
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postAssemble(request);
    }


    @Test
    public void PostAssemble_txtTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "txt";

       
        PostAssembleRequest request = new PostAssembleRequest();
        request.setFormat(format);

        request.setDatasource("ds");
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postAssemble(request);
    }


    @Test
    public void PostAssemble_tifTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "tif";

       
        PostAssembleRequest request = new PostAssembleRequest();
        request.setFormat(format);

        request.setDatasource("ds");
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postAssemble(request);
    }


    @Test
    public void PostAssemble_xlsbTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "xlsb";

       
        PostAssembleRequest request = new PostAssembleRequest();
        request.setFormat(format);

        request.setDatasource("ds");
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postAssemble(request);
    }


    @Test
    public void PostAssemble_xlsmTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "xlsm";

       
        PostAssembleRequest request = new PostAssembleRequest();
        request.setFormat(format);

        request.setDatasource("ds");
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postAssemble(request);
    }


    @Test
    public void PostAssemble_xlsxTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "xlsx";

       
        PostAssembleRequest request = new PostAssembleRequest();
        request.setFormat(format);

        request.setDatasource("ds");
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postAssemble(request);
    }


    @Test
    public void PostAssemble_xltmTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "xltm";

       
        PostAssembleRequest request = new PostAssembleRequest();
        request.setFormat(format);

        request.setDatasource("ds");
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postAssemble(request);
    }


    @Test
    public void PostAssemble_xltxTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "xltx";

       
        PostAssembleRequest request = new PostAssembleRequest();
        request.setFormat(format);

        request.setDatasource("ds");
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postAssemble(request);
    }


    @Test
    public void PostAssemble_xpsTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "xps";

       
        PostAssembleRequest request = new PostAssembleRequest();
        request.setFormat(format);

        request.setDatasource("ds");
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postAssemble(request);
    }


    @Test
    public void PostAssemble_pngTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "png";

       
        PostAssembleRequest request = new PostAssembleRequest();
        request.setFormat(format);

        request.setDatasource("ds");
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postAssemble(request);
    }


    @Test
    public void PostAssemble_jpgTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "jpg";

       
        PostAssembleRequest request = new PostAssembleRequest();
        request.setFormat(format);

        request.setDatasource("ds");
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postAssemble(request);
    }


    @Test
    public void PostAssemble_gifTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "gif";

       
        PostAssembleRequest request = new PostAssembleRequest();
        request.setFormat(format);

        request.setDatasource("ds");
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postAssemble(request);
    }


    @Test
    public void PostAssemble_emfTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "emf";

       
        PostAssembleRequest request = new PostAssembleRequest();
        request.setFormat(format);

        request.setDatasource("ds");
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postAssemble(request);
    }


    @Test
    public void PostAssemble_bmpTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "bmp";

       
        PostAssembleRequest request = new PostAssembleRequest();
        request.setFormat(format);

        request.setDatasource("ds");
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postAssemble(request);
    }


    @Test
    public void PostAssemble_mdTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "md";

       
        PostAssembleRequest request = new PostAssembleRequest();
        request.setFormat(format);

        request.setDatasource("ds");
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postAssemble(request);
    }


    @Test
    public void PostAssemble_numbersTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "numbers";

       
        PostAssembleRequest request = new PostAssembleRequest();
        request.setFormat(format);

        request.setDatasource("ds");
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postAssemble(request);
    }


    @Test
    public void PostAssemble_wmfTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "wmf";

       
        PostAssembleRequest request = new PostAssembleRequest();
        request.setFormat(format);

        request.setDatasource("ds");
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postAssemble(request);
    }


    @Test
    public void PostAssemble_svgTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "svg";

       
        PostAssembleRequest request = new PostAssembleRequest();
        request.setFormat(format);

        request.setDatasource("ds");
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postAssemble(request);
    }


    @Test
    public void PostAssemble_docxTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "docx";

       
        PostAssembleRequest request = new PostAssembleRequest();
        request.setFormat(format);

        request.setDatasource("ds");
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postAssemble(request);
    }


    @Test
    public void PostAssemble_pptxTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "pptx";

       
        PostAssembleRequest request = new PostAssembleRequest();
        request.setFormat(format);

        request.setDatasource("ds");
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postAssemble(request);
    }


    @Test
    public void PostAssemble_jsonTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "json";

       
        PostAssembleRequest request = new PostAssembleRequest();
        request.setFormat(format);

        request.setDatasource("ds");
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postAssemble(request);
    }


    @Test
    public void PostAssemble_sqlTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "sql";

       
        PostAssembleRequest request = new PostAssembleRequest();
        request.setFormat(format);

        request.setDatasource("ds");
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postAssemble(request);
    }


    @Test
    public void PostExport_csv_workbookTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "csv";
        String objectType = "workbook";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_xls_workbookTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "xls";
        String objectType = "workbook";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_html_workbookTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "html";
        String objectType = "workbook";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_mhtml_workbookTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "mhtml";
        String objectType = "workbook";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_ods_workbookTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "ods";
        String objectType = "workbook";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_pdf_workbookTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "pdf";
        String objectType = "workbook";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_xml_workbookTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "xml";
        String objectType = "workbook";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_txt_workbookTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "txt";
        String objectType = "workbook";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_tif_workbookTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "tif";
        String objectType = "workbook";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_xlsb_workbookTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "xlsb";
        String objectType = "workbook";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_xlsm_workbookTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "xlsm";
        String objectType = "workbook";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_xlsx_workbookTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "xlsx";
        String objectType = "workbook";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_xltm_workbookTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "xltm";
        String objectType = "workbook";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_xltx_workbookTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "xltx";
        String objectType = "workbook";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_xps_workbookTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "xps";
        String objectType = "workbook";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_png_workbookTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "png";
        String objectType = "workbook";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_jpg_workbookTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "jpg";
        String objectType = "workbook";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_gif_workbookTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "gif";
        String objectType = "workbook";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_emf_workbookTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "emf";
        String objectType = "workbook";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_bmp_workbookTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "bmp";
        String objectType = "workbook";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_md_workbookTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "md";
        String objectType = "workbook";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_numbers_workbookTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "numbers";
        String objectType = "workbook";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_wmf_workbookTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "wmf";
        String objectType = "workbook";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_svg_workbookTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "svg";
        String objectType = "workbook";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_docx_workbookTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "docx";
        String objectType = "workbook";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_pptx_workbookTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "pptx";
        String objectType = "workbook";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_json_workbookTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "json";
        String objectType = "workbook";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_sql_workbookTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "sql";
        String objectType = "workbook";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_csv_worksheetTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "csv";
        String objectType = "worksheet";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_xls_worksheetTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "xls";
        String objectType = "worksheet";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_html_worksheetTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "html";
        String objectType = "worksheet";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_mhtml_worksheetTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "mhtml";
        String objectType = "worksheet";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_ods_worksheetTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "ods";
        String objectType = "worksheet";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_pdf_worksheetTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "pdf";
        String objectType = "worksheet";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_xml_worksheetTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "xml";
        String objectType = "worksheet";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_txt_worksheetTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "txt";
        String objectType = "worksheet";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_tif_worksheetTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "tif";
        String objectType = "worksheet";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_xlsb_worksheetTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "xlsb";
        String objectType = "worksheet";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_xlsm_worksheetTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "xlsm";
        String objectType = "worksheet";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_xlsx_worksheetTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "xlsx";
        String objectType = "worksheet";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_xltm_worksheetTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "xltm";
        String objectType = "worksheet";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_xltx_worksheetTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "xltx";
        String objectType = "worksheet";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_xps_worksheetTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "xps";
        String objectType = "worksheet";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_png_worksheetTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "png";
        String objectType = "worksheet";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_jpg_worksheetTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "jpg";
        String objectType = "worksheet";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_gif_worksheetTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "gif";
        String objectType = "worksheet";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_emf_worksheetTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "emf";
        String objectType = "worksheet";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_bmp_worksheetTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "bmp";
        String objectType = "worksheet";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_md_worksheetTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "md";
        String objectType = "worksheet";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_numbers_worksheetTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "numbers";
        String objectType = "worksheet";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_wmf_worksheetTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "wmf";
        String objectType = "worksheet";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_svg_worksheetTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "svg";
        String objectType = "worksheet";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_docx_worksheetTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "docx";
        String objectType = "worksheet";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_pptx_worksheetTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "pptx";
        String objectType = "worksheet";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_json_worksheetTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "json";
        String objectType = "worksheet";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_sql_worksheetTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "sql";
        String objectType = "worksheet";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_pdf_chartTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "pdf";
        String objectType = "chart";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_tif_chartTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "tif";
        String objectType = "chart";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_png_chartTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "png";
        String objectType = "chart";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_jpg_chartTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "jpg";
        String objectType = "chart";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_gif_chartTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "gif";
        String objectType = "chart";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_emf_chartTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "emf";
        String objectType = "chart";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_bmp_chartTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "bmp";
        String objectType = "chart";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_png_pictureTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "png";
        String objectType = "picture";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_jpg_pictureTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "jpg";
        String objectType = "picture";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_gif_pictureTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "gif";
        String objectType = "picture";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_emf_pictureTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "emf";
        String objectType = "picture";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_bmp_pictureTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "bmp";
        String objectType = "picture";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_csv_listobjectTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "csv";
        String objectType = "listobject";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_xls_listobjectTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "xls";
        String objectType = "listobject";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_html_listobjectTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "html";
        String objectType = "listobject";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_mhtml_listobjectTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "mhtml";
        String objectType = "listobject";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_ods_listobjectTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "ods";
        String objectType = "listobject";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_pdf_listobjectTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "pdf";
        String objectType = "listobject";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_xml_listobjectTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "xml";
        String objectType = "listobject";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_txt_listobjectTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "txt";
        String objectType = "listobject";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_tif_listobjectTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "tif";
        String objectType = "listobject";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_xlsb_listobjectTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "xlsb";
        String objectType = "listobject";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_xlsm_listobjectTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "xlsm";
        String objectType = "listobject";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_xlsx_listobjectTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "xlsx";
        String objectType = "listobject";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_xltm_listobjectTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "xltm";
        String objectType = "listobject";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_xltx_listobjectTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "xltx";
        String objectType = "listobject";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_xps_listobjectTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "xps";
        String objectType = "listobject";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_png_listobjectTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "png";
        String objectType = "listobject";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_jpg_listobjectTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "jpg";
        String objectType = "listobject";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_gif_listobjectTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "gif";
        String objectType = "listobject";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_emf_listobjectTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "emf";
        String objectType = "listobject";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_bmp_listobjectTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "bmp";
        String objectType = "listobject";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_md_listobjectTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "md";
        String objectType = "listobject";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_numbers_listobjectTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "numbers";
        String objectType = "listobject";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_wmf_listobjectTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "wmf";
        String objectType = "listobject";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_svg_listobjectTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "svg";
        String objectType = "listobject";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_docx_listobjectTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "docx";
        String objectType = "listobject";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_pptx_listobjectTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "pptx";
        String objectType = "listobject";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_json_listobjectTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "json";
        String objectType = "listobject";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_sql_listobjectTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "sql";
        String objectType = "listobject";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_png_oleobjectTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "png";
        String objectType = "oleobject";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_jpg_oleobjectTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "jpg";
        String objectType = "oleobject";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_gif_oleobjectTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "gif";
        String objectType = "oleobject";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_emf_oleobjectTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "emf";
        String objectType = "oleobject";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostExport_bmp_oleobjectTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String book1Xlsx = "Book1.xlsx";

        String format = "bmp";
        String objectType = "oleobject";

       
        PostExportRequest request = new PostExportRequest();
        request.setFormat(format);

        request.setObjectType(objectType);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postExport(request);
    }


    @Test
    public void PostCompress_50Test() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        Integer compressLevel = 50;

       
        PostCompressRequest request = new PostCompressRequest();
        request.setCompressLevel(compressLevel);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postCompress(request);
    }


    @Test
    public void PostCompress_90Test() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        Integer compressLevel = 90;

       
        PostCompressRequest request = new PostCompressRequest();
        request.setCompressLevel(compressLevel);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postCompress(request);
    }


    @Test
    public void PostMerge_csv_trueTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "csv";
        Boolean mergeToOneSheet = true;

       
        PostMergeRequest request = new PostMergeRequest();
        request.setFormat(format);

        request.setMergeToOneSheet(mergeToOneSheet);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FileInfo response =  this.api.postMerge(request);
    }


    @Test
    public void PostMerge_xls_trueTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "xls";
        Boolean mergeToOneSheet = true;

       
        PostMergeRequest request = new PostMergeRequest();
        request.setFormat(format);

        request.setMergeToOneSheet(mergeToOneSheet);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FileInfo response =  this.api.postMerge(request);
    }


    @Test
    public void PostMerge_html_trueTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "html";
        Boolean mergeToOneSheet = true;

       
        PostMergeRequest request = new PostMergeRequest();
        request.setFormat(format);

        request.setMergeToOneSheet(mergeToOneSheet);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FileInfo response =  this.api.postMerge(request);
    }


    @Test
    public void PostMerge_mhtml_trueTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "mhtml";
        Boolean mergeToOneSheet = true;

       
        PostMergeRequest request = new PostMergeRequest();
        request.setFormat(format);

        request.setMergeToOneSheet(mergeToOneSheet);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FileInfo response =  this.api.postMerge(request);
    }


    @Test
    public void PostMerge_ods_trueTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "ods";
        Boolean mergeToOneSheet = true;

       
        PostMergeRequest request = new PostMergeRequest();
        request.setFormat(format);

        request.setMergeToOneSheet(mergeToOneSheet);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FileInfo response =  this.api.postMerge(request);
    }


    @Test
    public void PostMerge_pdf_trueTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "pdf";
        Boolean mergeToOneSheet = true;

       
        PostMergeRequest request = new PostMergeRequest();
        request.setFormat(format);

        request.setMergeToOneSheet(mergeToOneSheet);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FileInfo response =  this.api.postMerge(request);
    }


    @Test
    public void PostMerge_xml_trueTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "xml";
        Boolean mergeToOneSheet = true;

       
        PostMergeRequest request = new PostMergeRequest();
        request.setFormat(format);

        request.setMergeToOneSheet(mergeToOneSheet);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FileInfo response =  this.api.postMerge(request);
    }


    @Test
    public void PostMerge_txt_trueTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "txt";
        Boolean mergeToOneSheet = true;

       
        PostMergeRequest request = new PostMergeRequest();
        request.setFormat(format);

        request.setMergeToOneSheet(mergeToOneSheet);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FileInfo response =  this.api.postMerge(request);
    }


    @Test
    public void PostMerge_tif_trueTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "tif";
        Boolean mergeToOneSheet = true;

       
        PostMergeRequest request = new PostMergeRequest();
        request.setFormat(format);

        request.setMergeToOneSheet(mergeToOneSheet);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FileInfo response =  this.api.postMerge(request);
    }


    @Test
    public void PostMerge_xlsb_trueTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "xlsb";
        Boolean mergeToOneSheet = true;

       
        PostMergeRequest request = new PostMergeRequest();
        request.setFormat(format);

        request.setMergeToOneSheet(mergeToOneSheet);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FileInfo response =  this.api.postMerge(request);
    }


    @Test
    public void PostMerge_xlsm_trueTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "xlsm";
        Boolean mergeToOneSheet = true;

       
        PostMergeRequest request = new PostMergeRequest();
        request.setFormat(format);

        request.setMergeToOneSheet(mergeToOneSheet);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FileInfo response =  this.api.postMerge(request);
    }


    @Test
    public void PostMerge_xlsx_trueTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "xlsx";
        Boolean mergeToOneSheet = true;

       
        PostMergeRequest request = new PostMergeRequest();
        request.setFormat(format);

        request.setMergeToOneSheet(mergeToOneSheet);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FileInfo response =  this.api.postMerge(request);
    }


    @Test
    public void PostMerge_xltm_trueTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "xltm";
        Boolean mergeToOneSheet = true;

       
        PostMergeRequest request = new PostMergeRequest();
        request.setFormat(format);

        request.setMergeToOneSheet(mergeToOneSheet);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FileInfo response =  this.api.postMerge(request);
    }


    @Test
    public void PostMerge_xltx_trueTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "xltx";
        Boolean mergeToOneSheet = true;

       
        PostMergeRequest request = new PostMergeRequest();
        request.setFormat(format);

        request.setMergeToOneSheet(mergeToOneSheet);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FileInfo response =  this.api.postMerge(request);
    }


    @Test
    public void PostMerge_xps_trueTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "xps";
        Boolean mergeToOneSheet = true;

       
        PostMergeRequest request = new PostMergeRequest();
        request.setFormat(format);

        request.setMergeToOneSheet(mergeToOneSheet);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FileInfo response =  this.api.postMerge(request);
    }


    @Test
    public void PostMerge_png_trueTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "png";
        Boolean mergeToOneSheet = true;

       
        PostMergeRequest request = new PostMergeRequest();
        request.setFormat(format);

        request.setMergeToOneSheet(mergeToOneSheet);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FileInfo response =  this.api.postMerge(request);
    }


    @Test
    public void PostMerge_jpg_trueTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "jpg";
        Boolean mergeToOneSheet = true;

       
        PostMergeRequest request = new PostMergeRequest();
        request.setFormat(format);

        request.setMergeToOneSheet(mergeToOneSheet);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FileInfo response =  this.api.postMerge(request);
    }


    @Test
    public void PostMerge_gif_trueTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "gif";
        Boolean mergeToOneSheet = true;

       
        PostMergeRequest request = new PostMergeRequest();
        request.setFormat(format);

        request.setMergeToOneSheet(mergeToOneSheet);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FileInfo response =  this.api.postMerge(request);
    }


    @Test
    public void PostMerge_emf_trueTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "emf";
        Boolean mergeToOneSheet = true;

       
        PostMergeRequest request = new PostMergeRequest();
        request.setFormat(format);

        request.setMergeToOneSheet(mergeToOneSheet);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FileInfo response =  this.api.postMerge(request);
    }


    @Test
    public void PostMerge_bmp_trueTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "bmp";
        Boolean mergeToOneSheet = true;

       
        PostMergeRequest request = new PostMergeRequest();
        request.setFormat(format);

        request.setMergeToOneSheet(mergeToOneSheet);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FileInfo response =  this.api.postMerge(request);
    }


    @Test
    public void PostMerge_md_trueTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "md";
        Boolean mergeToOneSheet = true;

       
        PostMergeRequest request = new PostMergeRequest();
        request.setFormat(format);

        request.setMergeToOneSheet(mergeToOneSheet);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FileInfo response =  this.api.postMerge(request);
    }


    @Test
    public void PostMerge_numbers_trueTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "numbers";
        Boolean mergeToOneSheet = true;

       
        PostMergeRequest request = new PostMergeRequest();
        request.setFormat(format);

        request.setMergeToOneSheet(mergeToOneSheet);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FileInfo response =  this.api.postMerge(request);
    }


    @Test
    public void PostMerge_wmf_trueTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "wmf";
        Boolean mergeToOneSheet = true;

       
        PostMergeRequest request = new PostMergeRequest();
        request.setFormat(format);

        request.setMergeToOneSheet(mergeToOneSheet);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FileInfo response =  this.api.postMerge(request);
    }


    @Test
    public void PostMerge_svg_trueTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "svg";
        Boolean mergeToOneSheet = true;

       
        PostMergeRequest request = new PostMergeRequest();
        request.setFormat(format);

        request.setMergeToOneSheet(mergeToOneSheet);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FileInfo response =  this.api.postMerge(request);
    }


    @Test
    public void PostMerge_docx_falseTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "docx";
        Boolean mergeToOneSheet = false;

       
        PostMergeRequest request = new PostMergeRequest();
        request.setFormat(format);

        request.setMergeToOneSheet(mergeToOneSheet);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FileInfo response =  this.api.postMerge(request);
    }


    @Test
    public void PostMerge_pptx_falseTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "pptx";
        Boolean mergeToOneSheet = false;

       
        PostMergeRequest request = new PostMergeRequest();
        request.setFormat(format);

        request.setMergeToOneSheet(mergeToOneSheet);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FileInfo response =  this.api.postMerge(request);
    }


    @Test
    public void PostMerge_json_falseTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "json";
        Boolean mergeToOneSheet = false;

       
        PostMergeRequest request = new PostMergeRequest();
        request.setFormat(format);

        request.setMergeToOneSheet(mergeToOneSheet);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FileInfo response =  this.api.postMerge(request);
    }


    @Test
    public void PostMerge_sql_falseTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String format = "sql";
        Boolean mergeToOneSheet = false;

       
        PostMergeRequest request = new PostMergeRequest();
        request.setFormat(format);

        request.setMergeToOneSheet(mergeToOneSheet);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FileInfo response =  this.api.postMerge(request);
    }


    @Test
    public void PostUnlockTest() throws Exception {
        String needUnlockXlsx = "needUnlock.xlsx";

       
        PostUnlockRequest request = new PostUnlockRequest();
        request.setPassword("123456");
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(needUnlockXlsx ,CellsApiUtil.GetFileHolder(needUnlockXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postUnlock(request);
    }


    @Test
    public void PostProtectTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

       
        PostProtectRequest request = new PostProtectRequest();
        request.setPassword("123456");
        request.setProtectWorkbookRequst(new ProtectWorkbookRequst());
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postProtect(request);
    }


    @Test
    public void PostSearchTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

       
        PostSearchRequest request = new PostSearchRequest();
        request.setText("12");
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        List<TextItem> response =  this.api.postSearch(request);
    }


    @Test
    public void PostReplaceTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

       
        PostReplaceRequest request = new PostReplaceRequest();
        request.setText("12");

        request.setNewtext("newtext");
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postReplace(request);
    }


    @Test
    public void PostReplaceOnlySheetnameTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

       
        PostReplaceRequest request = new PostReplaceRequest();
        request.setText("12");

        request.setNewtext("newtext");

        request.setSheetname("Sheet1");
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postReplace(request);
    }


    @Test
    public void PostWatermarkTest() throws Exception {
        String assemblyTestXlsx = "assemblytest.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

       
        PostWatermarkRequest request = new PostWatermarkRequest();
        request.setText("aspose.cells cloud sdk");

        request.setColor("#773322");
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postWatermark(request);
    }


    @Test
    public void PostClearObjects_chartTest() throws Exception {
        String book1Xlsx = "Book1.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String objecttype = "chart";

       
        PostClearObjectsRequest request = new PostClearObjectsRequest();
        request.setObjecttype(objecttype);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postClearObjects(request);
    }


    @Test
    public void PostClearObjects_commentTest() throws Exception {
        String book1Xlsx = "Book1.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String objecttype = "comment";

       
        PostClearObjectsRequest request = new PostClearObjectsRequest();
        request.setObjecttype(objecttype);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postClearObjects(request);
    }


    @Test
    public void PostClearObjects_pictureTest() throws Exception {
        String book1Xlsx = "Book1.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String objecttype = "picture";

       
        PostClearObjectsRequest request = new PostClearObjectsRequest();
        request.setObjecttype(objecttype);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postClearObjects(request);
    }


    @Test
    public void PostClearObjects_shapeTest() throws Exception {
        String book1Xlsx = "Book1.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String objecttype = "shape";

       
        PostClearObjectsRequest request = new PostClearObjectsRequest();
        request.setObjecttype(objecttype);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postClearObjects(request);
    }


    @Test
    public void PostClearObjects_listobjectTest() throws Exception {
        String book1Xlsx = "Book1.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String objecttype = "listobject";

       
        PostClearObjectsRequest request = new PostClearObjectsRequest();
        request.setObjecttype(objecttype);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postClearObjects(request);
    }


    @Test
    public void PostClearObjects_hyperlinkTest() throws Exception {
        String book1Xlsx = "Book1.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String objecttype = "hyperlink";

       
        PostClearObjectsRequest request = new PostClearObjectsRequest();
        request.setObjecttype(objecttype);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postClearObjects(request);
    }


    @Test
    public void PostClearObjects_oleobjectTest() throws Exception {
        String book1Xlsx = "Book1.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String objecttype = "oleobject";

       
        PostClearObjectsRequest request = new PostClearObjectsRequest();
        request.setObjecttype(objecttype);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postClearObjects(request);
    }


    @Test
    public void PostClearObjects_pivottableTest() throws Exception {
        String book1Xlsx = "Book1.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String objecttype = "pivottable";

       
        PostClearObjectsRequest request = new PostClearObjectsRequest();
        request.setObjecttype(objecttype);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postClearObjects(request);
    }


    @Test
    public void PostClearObjects_validationTest() throws Exception {
        String book1Xlsx = "Book1.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String objecttype = "validation";

       
        PostClearObjectsRequest request = new PostClearObjectsRequest();
        request.setObjecttype(objecttype);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postClearObjects(request);
    }


    @Test
    public void PostClearObjects_BackgroundTest() throws Exception {
        String book1Xlsx = "Book1.xlsx";
        String dataSourceXlsx = "datasource.xlsx";

        String objecttype = "Background";

       
        PostClearObjectsRequest request = new PostClearObjectsRequest();
        request.setObjecttype(objecttype);
         
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postClearObjects(request);
    }

    @Test
    public void PostRepair_xlsxTest() throws Exception {
        String book1Xlsx = "Book1.xlsx";

        String format = "xlsx";

       
        PostRepairRequest request = new PostRepairRequest();
        request.setFormat(format);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postRepair(request);
    }


    @Test
    public void PostRepair_pdfTest() throws Exception {
        String book1Xlsx = "Book1.xlsx";

        String format = "pdf";

       
        PostRepairRequest request = new PostRepairRequest();
        request.setFormat(format);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postRepair(request);
    }


    @Test
    public void PostRepair_csvTest() throws Exception {
        String book1Xlsx = "Book1.xlsx";

        String format = "csv";

       
        PostRepairRequest request = new PostRepairRequest();
        request.setFormat(format);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postRepair(request);
    }


    @Test
    public void PostRepair_pngTest() throws Exception {
        String book1Xlsx = "Book1.xlsx";

        String format = "png";

       
        PostRepairRequest request = new PostRepairRequest();
        request.setFormat(format);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postRepair(request);
    }

    @Test
    public void PostReverse_rows_pdfTest() throws Exception {
        String book1Xlsx = "Book1.xlsx";

        String rotateType = "rows";
        String format = "pdf";

       
        PostReverseRequest request = new PostReverseRequest();
        request.setRotateType(rotateType);

        request.setFormat(format);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postReverse(request);
    }


    @Test
    public void PostReverse_cols_pdfTest() throws Exception {
        String book1Xlsx = "Book1.xlsx";

        String rotateType = "cols";
        String format = "pdf";

       
        PostReverseRequest request = new PostReverseRequest();
        request.setRotateType(rotateType);

        request.setFormat(format);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postReverse(request);
    }


    @Test
    public void PostReverse_both_pdfTest() throws Exception {
        String book1Xlsx = "Book1.xlsx";

        String rotateType = "both";
        String format = "pdf";

       
        PostReverseRequest request = new PostReverseRequest();
        request.setRotateType(rotateType);

        request.setFormat(format);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postReverse(request);
    }


    @Test
    public void PostReverse_rows_csvTest() throws Exception {
        String book1Xlsx = "Book1.xlsx";

        String rotateType = "rows";
        String format = "csv";

       
        PostReverseRequest request = new PostReverseRequest();
        request.setRotateType(rotateType);

        request.setFormat(format);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postReverse(request);
    }


    @Test
    public void PostReverse_cols_pngTest() throws Exception {
        String book1Xlsx = "Book1.xlsx";

        String rotateType = "cols";
        String format = "png";

       
        PostReverseRequest request = new PostReverseRequest();
        request.setRotateType(rotateType);

        request.setFormat(format);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postReverse(request);
    }


    @Test
    public void PostReverse_both_xlsxTest() throws Exception {
        String book1Xlsx = "Book1.xlsx";

        String rotateType = "both";
        String format = "xlsx";

       
        PostReverseRequest request = new PostReverseRequest();
        request.setRotateType(rotateType);

        request.setFormat(format);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postReverse(request);
    }


    @Test
    public void GetMetadataTest() throws Exception {
        String book1Xlsx = "Book1.xlsx";

       
        GetMetadataRequest request = new GetMetadataRequest();
        request.setType("all");
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        List<CellsDocumentProperty> response =  this.api.getMetadata(request);
    }


    @Test
    public void DeleteMetadataTest() throws Exception {
        String book1Xlsx = "Book1.xlsx";

       
        DeleteMetadataRequest request = new DeleteMetadataRequest();
        request.setType("all");
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.deleteMetadata(request);
    }


    @Test
    public void PostMetadataTest() throws Exception {
        String book1Xlsx = "Book1.xlsx";

       
        PostMetadataRequest request = new PostMetadataRequest();
         
        ArrayList<CellsDocumentProperty> cellsDocuments = new ArrayList<CellsDocumentProperty>();
        CellsDocumentProperty cellsDocument = new CellsDocumentProperty();
        cellsDocument.setName("Author");


        cellsDocument.setValue("roy.wang");

        cellsDocuments.add(cellsDocument);

        request.setCellsDocuments(cellsDocuments);
         

        HashMap<String,File> fileMap = new HashMap<String,File>(); 
        fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
        request.setFile(fileMap);
        FilesResult response =  this.api.postMetadata(request);
    }


}
