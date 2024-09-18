/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TextProcessingControllerTests.java">
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


public class TextProcessingControllerTest {
    private String remoteFolder = "TestData/In";

    private  CellsApi api;
    public TextProcessingControllerTest(){
        try {
            api = new CellsApi(CellsApiUtil.GetClientId(),CellsApiUtil.GetClientSecret(),CellsApiUtil.GetAPIVersion(),CellsApiUtil.GetBaseUrl());
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void PostAddTextContentTest() throws Exception {
        String localName = "BookText.xlsx";
        String remoteName = "BookText.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostAddTextContentRequest request = new PostAddTextContentRequest();
        AddTextOptions addTextOptions = new AddTextOptions();
        DataSource dataSource = new DataSource();
        dataSource.setDataSourceType("CloudFileSystem");


        dataSource.setDataPath("BookText.xlsx");

        addTextOptions.setDataSource(dataSource);


        addTextOptions.setText("Aspose.Cells Cloud is an excellent product.");


        addTextOptions.setWorksheet("202401");


        addTextOptions.setSelectPoistion("AtTheBeginning");


        addTextOptions.setSkipEmptyCells(true);

        request.setAddTextOptions(addTextOptions);

        FileInfo response =  this.api.postAddTextContent(request);
    }


    @Test
    public void PostTrimContentTest() throws Exception {
        String localName = "BookText.xlsx";
        String remoteName = "BookText.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostTrimContentRequest request = new PostTrimContentRequest();
        TrimContentOptions trimContentOptions = new TrimContentOptions();
        DataSource dataSource = new DataSource();
        dataSource.setDataSourceType("CloudFileSystem");


        dataSource.setDataPath("BookText.xlsx");

        trimContentOptions.setDataSource(dataSource);


        trimContentOptions.setTrimLeading(true);


        trimContentOptions.setTrimTrailing(true);


        trimContentOptions.setTrimSpaceBetweenWordTo1(true);


        trimContentOptions.setRemoveAllLineBreaks(true);


        ScopeOptions scopeOptions = new ScopeOptions();
        scopeOptions.setScope("EntireWorkbook");

        trimContentOptions.setScopeOptions(scopeOptions);

        request.setTrimContentOptions(trimContentOptions);

        FileInfo response =  this.api.postTrimContent(request);
    }


    @Test
    public void PostUpdateWordCaseTest() throws Exception {
        String localName = "BookText.xlsx";
        String remoteName = "BookText.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostUpdateWordCaseRequest request = new PostUpdateWordCaseRequest();
        WordCaseOptions wordCaseOptions = new WordCaseOptions();
        DataSource dataSource = new DataSource();
        dataSource.setDataSourceType("CloudFileSystem");


        dataSource.setDataPath("BookText.xlsx");

        wordCaseOptions.setDataSource(dataSource);


        wordCaseOptions.setWordCaseType("None");


        ScopeOptions scopeOptions = new ScopeOptions();
        scopeOptions.setScope("EntireWorkbook");

        wordCaseOptions.setScopeOptions(scopeOptions);

        request.setWordCaseOptions(wordCaseOptions);

        FileInfo response =  this.api.postUpdateWordCase(request);
    }


}
