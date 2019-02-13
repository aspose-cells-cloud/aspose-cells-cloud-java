package com.aspose.cloud.cells.examples.properties;


import com.aspose.cloud.cells.api.CellsPropertiesApi;
import com.aspose.cloud.cells.client.ApiException;
import com.aspose.cloud.cells.examples.Utils;
import com.aspose.cloud.cells.model.CellsDocumentPropertiesResponse;
import com.aspose.cloud.cells.model.CellsDocumentProperty;
import com.aspose.cloud.cells.model.CellsDocumentPropertyResponse;


public class CellsPropertiesAPIExamples {

    private final CellsPropertiesApi api = new CellsPropertiesApi();

    private String BOOK1 = "Book1.xlsx";
    private String MYDOC = "myDocument.xlsx";
    private String PivTestFile = "TestCase.xlsx";
    private String TEMPFOLDER = "Temp";
    private String SHEET1 = "Sheet1";
    private String SHEET2 = "Sheet2";
    private String SHEET3 = "Sheet3";
    private String SHEET4 = "Sheet4";
    private String SHEET5 = "Sheet5";
    private String SHEET6 = "Sheet6";
    private String SHEET7 = "Sheet7";
    private String SHEET8 = "Sheet8";
    private String CellName = "A1";
    private String RANGE = "A1:C10";
    private String CELLAREA = "A1:C10";
    
	
    
    public void cellsPropertiesDeleteDocumentPropertiesTest() throws ApiException {
        String name = BOOK1;
        String folder = TEMPFOLDER;
		api.setApiClient( Utils.Ready(folder, name));
        CellsDocumentPropertiesResponse response = api.cellsPropertiesDeleteDocumentProperties(name, folder,null);

		System.out.println(response.getCode());

    }
    

    public void cellsPropertiesDeleteDocumentPropertyTest() throws ApiException {
        String name = BOOK1;
        String propertyName = "Author";
        String folder = TEMPFOLDER;
		api.setApiClient( Utils.Ready(folder, name));
        CellsDocumentPropertiesResponse response = api.cellsPropertiesDeleteDocumentProperty(name, propertyName, folder,null);

		System.out.println(response.getCode());

    }

    public void cellsPropertiesGetDocumentPropertiesTest() throws ApiException {
        String name = BOOK1;
        String folder = TEMPFOLDER;
		api.setApiClient( Utils.Ready(folder, name));
        CellsDocumentPropertiesResponse response = api.cellsPropertiesGetDocumentProperties(name, folder,null);

		System.out.println(response.getCode());

    }
    

    public void cellsPropertiesGetDocumentPropertyTest() throws ApiException {
        String name = BOOK1;
        String propertyName ="Author";
        String folder = TEMPFOLDER;
		api.setApiClient( Utils.Ready(folder, name));
        CellsDocumentPropertyResponse response = api.cellsPropertiesGetDocumentProperty(name, propertyName, folder,null);

		System.out.println(response.getCode());

    }
    

    public void cellsPropertiesPutDocumentPropertyTest() throws ApiException {
        String name = BOOK1;
        String propertyName ="Name";
        CellsDocumentProperty property = new CellsDocumentProperty();
        property.setName("Name");
        property.setValue("Roy");
        String folder = TEMPFOLDER;
		api.setApiClient( Utils.Ready(folder, name));
        CellsDocumentPropertyResponse response = api.cellsPropertiesPutDocumentProperty(name, propertyName, property, folder,null);

		System.out.println(response.getCode());

    }
    
}
