package com.aspose.cloud.cells.api;

import com.aspose.cloud.cells.client.*;
import com.aspose.cloud.cells.model.*;
import com.aspose.cloud.cells.request.*;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.util.HashMap;

public class ExamplePostProtect {
    private  CellsApi api;
    public ExamplePostProtect(){
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
            String assemblyTestXlsx = "assemblytest.xlsx";

   
            PostProtectRequest request = new PostProtectRequest();
            ProtectWorkbookRequest protectWorkbookRequest = new ProtectWorkbookRequest();
            protectWorkbookRequest.setAwaysOpenReadOnly(true);


            protectWorkbookRequest.setEncryptWithPassword("123456");

            request.setProtectWorkbookRequest(protectWorkbookRequest);

            request.setPassword("123456");
             

            HashMap<String,File> fileMap = new HashMap<String,File>(); 
            fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
            request.setFile(fileMap);
            this.api.postProtect(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    }
}
