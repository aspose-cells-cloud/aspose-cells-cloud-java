/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ChartsControllerTests.java">
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


public class ChartsControllerTest {
    private String remoteFolder = "TestData/In";

    private  CellsApi api;
    public ChartsControllerTest(){
        try {
            api = new CellsApi(CellsApiUtil.GetClientId(),CellsApiUtil.GetClientSecret(),CellsApiUtil.GetAPIVersion(),CellsApiUtil.GetBaseUrl());
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void GetWorksheetChartsTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorksheetChartsRequest request = new GetWorksheetChartsRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet4");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        ChartsResponse response =  this.api.getWorksheetCharts(request);
    }


    @Test
    public void GetWorksheetChartTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorksheetChartRequest request = new GetWorksheetChartRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet4");

        request.setChartNumber(0);

        request.setFormat("png");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        File response =  this.api.getWorksheetChart(request);
    }


    @Test
    public void PutWorksheetChartTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutWorksheetChartRequest request = new PutWorksheetChartRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet4");

        request.setChartType("Pie");

        request.setUpperLeftRow(5);

        request.setUpperLeftColumn(5);

        request.setLowerRightRow(10);

        request.setLowerRightColumn(10);

        request.setArea("C7:D11");

        request.setIsVertical(true);

        request.setTitle("Aspose Chart");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.putWorksheetChart(request);
    }


    @Test
    public void DeleteWorksheetChartTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        DeleteWorksheetChartRequest request = new DeleteWorksheetChartRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet4");

        request.setChartIndex(0);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.deleteWorksheetChart(request);
    }


    @Test
    public void PostWorksheetChartTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorksheetChartRequest request = new PostWorksheetChartRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet4");

        request.setChartIndex(0);

        Chart chart = new Chart();
        chart.setShowLegend(true);


        chart.setShowDataTable(true);

        request.setChart(chart);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postWorksheetChart(request);
    }


    @Test
    public void GetWorksheetChartLegendTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorksheetChartLegendRequest request = new GetWorksheetChartLegendRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet4");

        request.setChartIndex(0);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        LegendResponse response =  this.api.getWorksheetChartLegend(request);
    }


    @Test
    public void PostWorksheetChartLegendTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorksheetChartLegendRequest request = new PostWorksheetChartLegendRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet4");

        request.setChartIndex(0);

        Legend legend = new Legend();
        legend.setPosition("Top");

        request.setLegend(legend);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postWorksheetChartLegend(request);
    }


    @Test
    public void PutWorksheetChartLegendTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutWorksheetChartLegendRequest request = new PutWorksheetChartLegendRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet4");

        request.setChartIndex(0);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.putWorksheetChartLegend(request);
    }


    @Test
    public void DeleteWorksheetChartLegendTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        DeleteWorksheetChartLegendRequest request = new DeleteWorksheetChartLegendRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet4");

        request.setChartIndex(0);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.deleteWorksheetChartLegend(request);
    }


    @Test
    public void DeleteWorksheetChartsTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        DeleteWorksheetChartsRequest request = new DeleteWorksheetChartsRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet4");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.deleteWorksheetCharts(request);
    }


    @Test
    public void GetWorksheetChartTitleTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorksheetChartTitleRequest request = new GetWorksheetChartTitleRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet4");

        request.setChartIndex(0);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        TitleResponse response =  this.api.getWorksheetChartTitle(request);
    }


    @Test
    public void PostWorksheetChartTitleTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorksheetChartTitleRequest request = new PostWorksheetChartTitleRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet4");

        request.setChartIndex(0);

        Title title = new Title();
        title.setIsVisible(true);

        request.setTitle(title);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postWorksheetChartTitle(request);
    }


    @Test
    public void PutWorksheetChartTitleTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutWorksheetChartTitleRequest request = new PutWorksheetChartTitleRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet4");

        request.setChartIndex(0);

        Title title = new Title();
        title.setIsVisible(true);

        request.setTitle(title);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.putWorksheetChartTitle(request);
    }


    @Test
    public void DeleteWorksheetChartTitleTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        DeleteWorksheetChartTitleRequest request = new DeleteWorksheetChartTitleRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet4");

        request.setChartIndex(0);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.deleteWorksheetChartTitle(request);
    }


}
