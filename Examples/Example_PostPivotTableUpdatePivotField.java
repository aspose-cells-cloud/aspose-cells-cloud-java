package com.aspose.cloud.cells.api;

import com.aspose.cloud.cells.client.*;
import com.aspose.cloud.cells.model.*;
import com.aspose.cloud.cells.request.*;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.util.HashMap;

public class ExamplePostPivotTableUpdatePivotField {
    private  CellsApi api;
    public ExamplePostPivotTableUpdatePivotField(){
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

            String localName = "TestCase.xlsx";
            String remoteName = "TestCase.xlsx";

            UploadFileRequest  uploadFileRequest = new UploadFileRequest();
            uploadFileRequest.setPath( remoteFolder + "/" + remoteName );
            uploadFileRequest.setStorageName( "");
            HashMap<String,File> files = new HashMap<String,File>();
            files.put( localName , new File(localName ));
            uploadFileRequest.setUploadFiles(files);
            cellsApi.uploadFile(uploadFileRequest);
   
            PostPivotTableUpdatePivotFieldRequest request = new PostPivotTableUpdatePivotFieldRequest();
            request.setName(remoteName);

            request.setSheetName("Sheet4");

            request.setPivotTableIndex(0);

            request.setPivotFieldIndex(0);

            request.setPivotFieldType("Row");

            PivotField pivotField = new PivotField();
            pivotField.setShowCompact(true);

            request.setPivotField(pivotField);

            request.setNeedReCalculate(true);

            request.setFolder(remoteFolder);

            request.setStorageName("");

            this.api.postPivotTableUpdatePivotField(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    }
}
