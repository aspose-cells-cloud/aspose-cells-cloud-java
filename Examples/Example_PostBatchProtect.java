package com.aspose.cloud.cells.api;

import com.aspose.cloud.cells.client.*;
import com.aspose.cloud.cells.model.*;
import com.aspose.cloud.cells.request.*;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.util.HashMap;

public class ExamplePostBatchProtect {
    private  CellsApi api;
    public ExamplePostBatchProtect(){
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

            String localBook1 = "Book1.xlsx";
            String remoteBook1 = "Book1.xlsx";
            String localMyDoc = "myDocument.xlsx";
            String remoteMyDoc = "myDocument.xlsx";

            UploadFileRequest  uploadFileRequest = new UploadFileRequest();
            uploadFileRequest.setPath( remoteFolder + "/" + remoteBook1 );
            uploadFileRequest.setStorageName( "");
            HashMap<String,File> files = new HashMap<String,File>();
            files.put( localBook1 , new File(localBook1 ));
            uploadFileRequest.setUploadFiles(files);
            cellsApi.uploadFile(uploadFileRequest);
            UploadFileRequest  uploadFileRequest = new UploadFileRequest();
            uploadFileRequest.setPath( remoteFolder + "/" + remoteMyDoc );
            uploadFileRequest.setStorageName( "");
            HashMap<String,File> files = new HashMap<String,File>();
            files.put( localMyDoc , new File(localMyDoc ));
            uploadFileRequest.setUploadFiles(files);
            cellsApi.uploadFile(uploadFileRequest);
   
            PostBatchProtectRequest request = new PostBatchProtectRequest();
            BatchProtectRequest batchProtectRequest = new BatchProtectRequest();
            batchProtectRequest.setSourceFolder(remoteFolder);


            batchProtectRequest.setProtectionType("All");


            batchProtectRequest.setPassword("123456");


            batchProtectRequest.setOutFolder("OutResult");


            MatchConditionRequest matchCondition = new MatchConditionRequest();
            matchCondition.setRegexPattern("(^Book)(.+)(xlsx$)");

            batchProtectRequest.setMatchCondition(matchCondition);

            request.setBatchProtectRequest(batchProtectRequest);

            this.api.postBatchProtect(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    }
}