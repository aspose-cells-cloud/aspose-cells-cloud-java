package com.aspose.cloud.cells.api;

import com.aspose.cloud.cells.client.*;
import com.aspose.cloud.cells.model.*;
import com.aspose.cloud.cells.request.*;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.util.HashMap;

public class ExamplePostWorksheetCellsRangesCopy {
    private  CellsApi api;
    public ExamplePostWorksheetCellsRangesCopy(){
        try {
            api = new CellsApi(
                System.getenv("CellsCloudClientId"),
                System.getenv("CellsCloudClientSecret"),
                "v3.0",
                System.getenv("CellsCloudApiBaseUrl")
            );
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    public void Run(){
        try{
            String remoteFolder = "TestData/In";

            String localName = "Book1.xlsx";
            String remoteName = "Book1.xlsx";

            UploadFileRequest  uploadFileRequest = new UploadFileRequest();
            uploadFileRequest.setPath( remoteFolder + "/" + remoteName );
            uploadFileRequest.setStorageName( "");
            HashMap<String,File> files = new HashMap<String,File>();
            files.put( localName , new File(localName ));
            uploadFileRequest.setUploadFiles(files);
            cellsApi.uploadFile(uploadFileRequest);
   
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

            this.api.postWorksheetCellsRangesCopy(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    }
}
