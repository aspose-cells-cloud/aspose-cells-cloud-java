package com.aspose.cloud.cells.examples.saveas;

import com.aspose.cloud.cells.api.CellsSaveAsApi;
import com.aspose.cloud.cells.client.ApiException;
import com.aspose.cloud.cells.examples.Base;
import com.aspose.cloud.cells.model.SaveOptions;
import com.aspose.cloud.cells.model.SaveResponse;

public class SaveAsAPIExamples extends Base{

    private final CellsSaveAsApi api = new CellsSaveAsApi();

 
    
    

    public void cellsSaveAsPostDocumentSaveAsExample() throws ApiException {
        String name = BOOK1;
        SaveOptions saveOptions = null;
        String newfilename = "newbook.xlsx";
        Boolean isAutoFitRows = true;
        Boolean isAutoFitColumns = false;
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        SaveResponse response = api.cellsSaveAsPostDocumentSaveAs(name, saveOptions, newfilename, isAutoFitRows, isAutoFitColumns, folder,null);

		System.out.println(response.getCode());
    }
    
}