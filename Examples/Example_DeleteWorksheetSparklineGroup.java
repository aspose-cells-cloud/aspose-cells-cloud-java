package com.aspose.cloud.cells.api;

import com.aspose.cloud.cells.client.*;
import com.aspose.cloud.cells.model.*;
import com.aspose.cloud.cells.request.*;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.util.HashMap;

public class ExampleDeleteWorksheetSparklineGroup {
    private  CellsApi api;
    public ExampleDeleteWorksheetSparklineGroup(){
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
   
            DeleteWorksheetSparklineGroupRequest request = new DeleteWorksheetSparklineGroupRequest();
            request.setName(remoteName);

            request.setSheetName("Sheet1");

            request.setSparklineIndex(0);

            request.setFolder(remoteFolder);

            request.setStorageName("");

            this.api.deleteWorksheetSparklineGroup(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    }
}
