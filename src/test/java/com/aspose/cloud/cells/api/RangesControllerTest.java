/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="RangesControllerTests.java">
 *   Copyright (c) 2024 Aspose.Cells Cloud
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


public class RangesControllerTest {
    private String remoteFolder = "TestData/In";

    private  CellsApi api;
    public RangesControllerTest(){
        try {
            api = new CellsApi(CellsApiUtil.GetClientId(),CellsApiUtil.GetClientSecret(),CellsApiUtil.GetAPIVersion(),CellsApiUtil.GetBaseUrl());
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void PostWorksheetCellsRangesCopyTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorksheetCellsRangesCopyRequest request = new PostWorksheetCellsRangesCopyRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        RangeCopyRequest rangeOperate = new RangeCopyRequest();
        rangeOperate.setOperate("copydata");


        Range source = new Range();
        source.setColumnCount(1);


        source.setColumnWidth(10.0);


        source.setFirstRow(1);


        source.setRowCount(10);

        rangeOperate.setSource(source);


        Range target = new Range();
        target.setColumnCount(1);


        target.setColumnWidth(10.0);


        target.setFirstRow(10);


        target.setRowCount(10);

        rangeOperate.setTarget(target);

        request.setRangeOperate(rangeOperate);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postWorksheetCellsRangesCopy(request);
    }


    @Test
    public void PostWorksheetCellsRangeMergeTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorksheetCellsRangeMergeRequest request = new PostWorksheetCellsRangeMergeRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        Range range = new Range();
        range.setColumnCount(1);


        range.setColumnWidth(10.0);


        range.setFirstRow(1);


        range.setRowCount(10);

        request.setRange(range);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postWorksheetCellsRangeMerge(request);
    }


    @Test
    public void PostWorksheetCellsRangeUnMergeTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorksheetCellsRangeUnMergeRequest request = new PostWorksheetCellsRangeUnMergeRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        Range range = new Range();
        range.setColumnCount(1);


        range.setColumnWidth(10.0);


        range.setFirstRow(1);


        range.setRowCount(10);

        request.setRange(range);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postWorksheetCellsRangeUnMerge(request);
    }


    @Test
    public void PostWorksheetCellsRangeStyleTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorksheetCellsRangeStyleRequest request = new PostWorksheetCellsRangeStyleRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        RangeSetStyleRequest rangeOperate = new RangeSetStyleRequest();
        Style style = new Style();
        Font font = new Font();
        font.setSize(16);

        style.setFont(font);

        rangeOperate.setStyle(style);


        Range range = new Range();
        range.setColumnCount(1);


        range.setColumnWidth(10.0);


        range.setFirstRow(1);


        range.setRowCount(10);

        rangeOperate.setRange(range);

        request.setRangeOperate(rangeOperate);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postWorksheetCellsRangeStyle(request);
    }


    @Test
    public void GetWorksheetCellsRangeValueTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorksheetCellsRangeValueRequest request = new GetWorksheetCellsRangeValueRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setNamerange("Name_2");

        request.setFirstRow(0);

        request.setFirstColumn(0);

        request.setRowCount(3);

        request.setColumnCount(2);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        RangeValueResponse response =  this.api.getWorksheetCellsRangeValue(request);
    }


    @Test
    public void PostWorksheetCellsRangeValueTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorksheetCellsRangeValueRequest request = new PostWorksheetCellsRangeValueRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        Range range = new Range();
        range.setColumnCount(1);


        range.setColumnWidth(10.0);


        range.setFirstRow(1);


        range.setRowCount(10);

        request.setRange(range);

        request.setValue("100");

        request.setIsConverted(true);

        request.setSetStyle(true);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postWorksheetCellsRangeValue(request);
    }


    @Test
    public void PostWorksheetCellsRangeMoveToTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorksheetCellsRangeMoveToRequest request = new PostWorksheetCellsRangeMoveToRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        Range range = new Range();
        range.setColumnCount(1);


        range.setColumnWidth(10.0);


        range.setFirstRow(1);


        range.setRowCount(10);

        request.setRange(range);

        request.setDestRow(10);

        request.setDestColumn(10);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postWorksheetCellsRangeMoveTo(request);
    }


    @Test
    public void PostWorksheetCellsRangeOutlineBorderTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorksheetCellsRangeOutlineBorderRequest request = new PostWorksheetCellsRangeOutlineBorderRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        RangeSetOutlineBorderRequest rangeOperate = new RangeSetOutlineBorderRequest();
        rangeOperate.setBorderEdge("LeftBorder");


        rangeOperate.setBorderStyle("Dotted");


        Color borderColor = new Color();
        borderColor.setR(48);


        borderColor.setG(48);


        borderColor.setB(48);

        rangeOperate.setBorderColor(borderColor);


        Range range = new Range();
        range.setColumnCount(1);


        range.setColumnWidth(10.0);


        range.setFirstRow(1);


        range.setRowCount(10);

        rangeOperate.setRange(range);

        request.setRangeOperate(rangeOperate);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postWorksheetCellsRangeOutlineBorder(request);
    }


    @Test
    public void PostWorksheetCellsRangeColumnWidthTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorksheetCellsRangeColumnWidthRequest request = new PostWorksheetCellsRangeColumnWidthRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        Range range = new Range();
        range.setColumnCount(1);


        range.setColumnWidth(10.0);


        range.setFirstRow(1);


        range.setRowCount(10);

        request.setRange(range);

        request.setValue(10.7);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postWorksheetCellsRangeColumnWidth(request);
    }


    @Test
    public void PostWorksheetCellsRangeRowHeightTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorksheetCellsRangeRowHeightRequest request = new PostWorksheetCellsRangeRowHeightRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        Range range = new Range();
        range.setColumnCount(1);


        range.setColumnWidth(10.0);


        range.setFirstRow(1);


        range.setRowCount(10);

        request.setRange(range);

        request.setValue(10.9);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postWorksheetCellsRangeRowHeight(request);
    }


    @Test
    public void PutWorksheetCellsRangeTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutWorksheetCellsRangeRequest request = new PutWorksheetCellsRangeRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setRange("A1:C6");

        request.setShift("Down");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.putWorksheetCellsRange(request);
    }


    @Test
    public void DeleteWorksheetCellsRangeTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        DeleteWorksheetCellsRangeRequest request = new DeleteWorksheetCellsRangeRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setRange("A1:C6");

        request.setShift("Up");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.deleteWorksheetCellsRange(request);
    }


    @Test
    public void PostWorksheetCellsRangeSortTest() throws Exception {
        String localName = "Group.xlsx";
        String remoteName = "Group.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorksheetCellsRangeSortRequest request = new PostWorksheetCellsRangeSortRequest();
        request.setName(remoteName);

        request.setSheetName("book1");

        RangeSortRequest rangeSortRequest = new RangeSortRequest();
        DataSorter dataSorter = new DataSorter();
        dataSorter.setCaseSensitive(true);

        rangeSortRequest.setDataSorter(dataSorter);


        Range cellArea = new Range();
        cellArea.setColumnCount(3);


        cellArea.setFirstColumn(0);


        cellArea.setFirstRow(0);


        cellArea.setRowCount(15);

        rangeSortRequest.setCellArea(cellArea);

        request.setRangeSortRequest(rangeSortRequest);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postWorksheetCellsRangeSort(request);
    }


}
