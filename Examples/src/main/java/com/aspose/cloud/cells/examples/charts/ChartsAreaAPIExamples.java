package com.aspose.cloud.cells.examples.charts;


import com.aspose.cloud.cells.api.CellsChartAreaApi;
import com.aspose.cloud.cells.client.ApiException;
import com.aspose.cloud.cells.examples.Utils;
import com.aspose.cloud.cells.model.ChartAreaResponse;
import com.aspose.cloud.cells.model.FillFormatResponse;
import com.aspose.cloud.cells.model.LineResponse;

/**
 * API tests for CellsChartAreaApi
 */

public class ChartsAreaAPIExamples {

    private final CellsChartAreaApi api = new CellsChartAreaApi();

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
    
	
    

    public void cellsChartAreaGetChartAreaTest() throws ApiException {
        String name = MYDOC;
        String sheetName = SHEET3;
        Integer chartIndex = 0;
        String folder = TEMPFOLDER;
		api.setApiClient( Utils.Ready(folder, name));
        ChartAreaResponse response = api.cellsChartAreaGetChartArea(name, sheetName, chartIndex, folder,null);

        // TODO: test validations
    }
    

    public void cellsChartAreaGetChartAreaBorderTest() throws ApiException {
        String name = MYDOC;
        String sheetName = SHEET3;
        Integer chartIndex = 0;
        String folder = TEMPFOLDER;
		api.setApiClient( Utils.Ready(folder, name));
        LineResponse response = api.cellsChartAreaGetChartAreaBorder(name, sheetName, chartIndex, folder,null);

        // TODO: test validations
    }

    public void cellsChartAreaGetChartAreaFillFormatTest() throws ApiException {
        String name = MYDOC;
        String sheetName = SHEET3;
        Integer chartIndex = 0;
        String folder = TEMPFOLDER;
		api.setApiClient( Utils.Ready(folder, name));
        FillFormatResponse response = api.cellsChartAreaGetChartAreaFillFormat(name, sheetName, chartIndex, folder,null);

        // TODO: test validations
    }
    
}