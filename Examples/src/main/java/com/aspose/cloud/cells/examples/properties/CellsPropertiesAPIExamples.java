package com.aspose.cloud.cells.examples.properties;


import com.aspose.cloud.cells.api.CellsPropertiesApi;
import com.aspose.cloud.cells.client.ApiException;
import com.aspose.cloud.cells.examples.Base;
import com.aspose.cloud.cells.model.CellsDocumentPropertiesResponse;
import com.aspose.cloud.cells.model.CellsDocumentProperty;
import com.aspose.cloud.cells.model.CellsDocumentPropertyResponse;


public class CellsPropertiesAPIExamples extends Base{

    private final CellsPropertiesApi api = new CellsPropertiesApi();

  
    
	
    
    public void cellsPropertiesDeleteDocumentPropertiesExample() throws ApiException {
        String name = BOOK1;
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        CellsDocumentPropertiesResponse response = api.cellsPropertiesDeleteDocumentProperties(name, folder,null);

		System.out.println(response.getCode());

    }
    

    public void cellsPropertiesDeleteDocumentPropertyExample() throws ApiException {
        String name = BOOK1;
        String propertyName = "Author";
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        CellsDocumentPropertiesResponse response = api.cellsPropertiesDeleteDocumentProperty(name, propertyName, folder,null);

		System.out.println(response.getCode());

    }

    public void cellsPropertiesGetDocumentPropertiesExample() throws ApiException {
        String name = BOOK1;
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        CellsDocumentPropertiesResponse response = api.cellsPropertiesGetDocumentProperties(name, folder,null);

		System.out.println(response.getCode());

    }
    

    public void cellsPropertiesGetDocumentPropertyExample() throws ApiException {
        String name = BOOK1;
        String propertyName ="Author";
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        CellsDocumentPropertyResponse response = api.cellsPropertiesGetDocumentProperty(name, propertyName, folder,null);

		System.out.println(response.getCode());

    }
    

    public void cellsPropertiesPutDocumentPropertyExample() throws ApiException {
        String name = BOOK1;
        String propertyName ="Name";
        CellsDocumentProperty property = new CellsDocumentProperty();
        property.setName("Name");
        property.setValue("Roy");
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        CellsDocumentPropertyResponse response = api.cellsPropertiesPutDocumentProperty(name, propertyName, property, folder,null);

		System.out.println(response.getCode());

    }
    
}
