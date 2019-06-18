package com.aspose.cloud.cells.examples.charts;


import com.aspose.cloud.cells.api.CellsChartAreaApi;
import com.aspose.cloud.cells.client.ApiException;
import com.aspose.cloud.cells.examples.Base;
import com.aspose.cloud.cells.model.ChartAreaResponse;
import com.aspose.cloud.cells.model.FillFormatResponse;
import com.aspose.cloud.cells.model.LineResponse;


public class ChartsAreaAPIExamples extends Base{

    private final CellsChartAreaApi api = new CellsChartAreaApi();

   
    
	
    

    public void cellsChartAreaGetChartAreaExample() throws ApiException {
        String name = MYDOC;
        String sheetName = SHEET3;
        Integer chartIndex = 0;
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        ChartAreaResponse response = api.cellsChartAreaGetChartArea(name, sheetName, chartIndex, folder,null);

        System.out.print(response.getCode());
    }
    

    public void cellsChartAreaGetChartAreaBorderExample() throws ApiException {
        String name = MYDOC;
        String sheetName = SHEET3;
        Integer chartIndex = 0;
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        LineResponse response = api.cellsChartAreaGetChartAreaBorder(name, sheetName, chartIndex, folder,null);

        System.out.print(response.getCode());
    }

    public void cellsChartAreaGetChartAreaFillFormatExample() throws ApiException {
        String name = MYDOC;
        String sheetName = SHEET3;
        Integer chartIndex = 0;
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        FillFormatResponse response = api.cellsChartAreaGetChartAreaFillFormat(name, sheetName, chartIndex, folder,null);

        System.out.print(response.getCode());
    }
    
}