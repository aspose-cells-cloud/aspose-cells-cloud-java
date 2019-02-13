package com.aspose.cloud.cells.examples.charts;

import java.io.File;

import com.aspose.cloud.cells.api.CellsChartsApi;
import com.aspose.cloud.cells.client.ApiException;
import com.aspose.cloud.cells.examples.Utils;
import com.aspose.cloud.cells.model.Chart;
import com.aspose.cloud.cells.model.ChartsResponse;
import com.aspose.cloud.cells.model.Legend;
import com.aspose.cloud.cells.model.LegendResponse;
import com.aspose.cloud.cells.model.SaaSposeResponse;
import com.aspose.cloud.cells.model.Title;
import com.aspose.cloud.cells.model.TitleResponse;

/**
 * API tests for CellsChartsApi
 */

public class ChartsAPIExamples {

	private final CellsChartsApi api = new CellsChartsApi();

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

	public void cellsChartsDeleteWorksheetChartLegendTest() throws ApiException {
		String name = MYDOC;
		String sheetName = SHEET3;
		Integer chartIndex = 1;
		String folder = TEMPFOLDER;
		api.setApiClient(Utils.Ready(folder, name));
		SaaSposeResponse response = api.cellsChartsDeleteWorksheetChartLegend(name, sheetName, chartIndex, folder,
				null);

		System.out.print(response.getCode());
	}

	public void cellsChartsDeleteWorksheetChartTitleTest() throws ApiException {
		String name = MYDOC;
		String sheetName = SHEET3;
		Integer chartIndex = 0;
		String folder = TEMPFOLDER;
		api.setApiClient(Utils.Ready(folder, name));
		SaaSposeResponse response = api.cellsChartsDeleteWorksheetChartTitle(name, sheetName, chartIndex, folder, null);

		System.out.print(response.getCode());
	}

	public void cellsChartsDeleteWorksheetClearChartsTest() throws ApiException {
		String name = MYDOC;
		String sheetName = SHEET3;
		String folder = TEMPFOLDER;
		api.setApiClient(Utils.Ready(folder, name));
		SaaSposeResponse response = api.cellsChartsDeleteWorksheetClearCharts(name, sheetName, folder, null);

		System.out.print(response.getCode());
	}

	public void cellsChartsDeleteWorksheetDeleteChartTest() throws ApiException {
		String name = MYDOC;
		String sheetName = SHEET3;
		Integer chartIndex = 0;
		String folder = TEMPFOLDER;
		api.setApiClient(Utils.Ready(folder, name));
		ChartsResponse response = api.cellsChartsDeleteWorksheetDeleteChart(name, sheetName, chartIndex, folder, null);

		System.out.print(response.getCode());
	}

	public void cellsChartsGetWorksheetChartTest() throws ApiException {
		String name = MYDOC;
		String sheetName = SHEET3;
		Integer chartNumber = 0;
		String format = "png";
		String folder = TEMPFOLDER;
		api.setApiClient(Utils.Ready(folder, name));
		File response = api.cellsChartsGetWorksheetChart(name, sheetName, chartNumber, format, folder, null);

		System.out.print(response.getCode());
	}

	public void cellsChartsGetWorksheetChartLegendTest() throws ApiException {
		String name = MYDOC;
		String sheetName = SHEET3;
		Integer chartIndex = 0;
		String folder = TEMPFOLDER;
		api.setApiClient(Utils.Ready(folder, name));
		LegendResponse response = api.cellsChartsGetWorksheetChartLegend(name, sheetName, chartIndex, folder, null);

		System.out.print(response.getCode());
	}

	public void cellsChartsGetWorksheetChartTitleTest() throws ApiException {
		String name = MYDOC;
		String sheetName = SHEET3;
		Integer chartIndex = 0;
		String folder = TEMPFOLDER;
		api.setApiClient(Utils.Ready(folder, name));
		TitleResponse response = api.cellsChartsGetWorksheetChartTitle(name, sheetName, chartIndex, folder, null);

		System.out.print(response.getCode());
	}

	public void cellsChartsGetWorksheetChartsTest() throws ApiException {
		String name = MYDOC;
		String sheetName = SHEET3;
		String folder = TEMPFOLDER;
		api.setApiClient(Utils.Ready(folder, name));
		ChartsResponse response = api.cellsChartsGetWorksheetCharts(name, sheetName, folder, null);

		System.out.print(response.getCode());
	}

	public void cellsChartsPostWorksheetChartTest() throws ApiException {
		String name = MYDOC;
		String sheetName = SHEET3;
		Integer chartIndex = 0;
		Chart chart = new Chart();
		chart.setAutoScaling(true);
		String folder = TEMPFOLDER;
		api.setApiClient(Utils.Ready(folder, name));
		SaaSposeResponse response = api.cellsChartsPostWorksheetChart(name, sheetName, chartIndex, chart, folder, null);

		System.out.print(response.getCode());
	}

	public void cellsChartsPostWorksheetChartLegendTest() throws ApiException {
		String name = MYDOC;
		String sheetName = SHEET3;
		Integer chartIndex = 0;
		Legend legend = new Legend();
		legend.setWidth(0);
		String folder = TEMPFOLDER;
		api.setApiClient(Utils.Ready(folder, name));
		LegendResponse response = api.cellsChartsPostWorksheetChartLegend(name, sheetName, chartIndex, legend, folder,
				null);

		System.out.print(response.getCode());
	}

	public void cellsChartsPostWorksheetChartTitleTest() throws ApiException {
		String name = MYDOC;
		String sheetName = SHEET3;
		Integer chartIndex = 0;
		Title title = new Title();
		title.setText("test");
		String folder = TEMPFOLDER;
		api.setApiClient(Utils.Ready(folder, name));
		TitleResponse response = api.cellsChartsPostWorksheetChartTitle(name, sheetName, chartIndex, title, folder,
				null);

		System.out.print(response.getCode());
	}

	public void cellsChartsPutWorksheetAddChartTest() throws ApiException {
		String name = MYDOC;
		String sheetName = SHEET3;
		String chartType = "Pie";
		Integer upperLeftRow = 5;
		Integer upperLeftColumn = 5;
		Integer lowerRightRow = 10;
		Integer lowerRightColumn = 10;
		String area = "C7:D11";
		Boolean isVertical = true;
		String categoryData = null;
		Boolean isAutoGetSerialName = null;
		String title = null;
		String folder = TEMPFOLDER;
		api.setApiClient(Utils.Ready(folder, name));
		ChartsResponse response = api.cellsChartsPutWorksheetAddChart(name, sheetName, chartType, upperLeftRow,
				upperLeftColumn, lowerRightRow, lowerRightColumn, area, isVertical, categoryData, isAutoGetSerialName,
				title, folder, null);

		System.out.print(response.getCode());
	}

	public void cellsChartsPutWorksheetChartLegendTest() throws ApiException {
		String name = MYDOC;
		String sheetName = SHEET3;
		Integer chartIndex = 0;
		String folder = TEMPFOLDER;
		api.setApiClient(Utils.Ready(folder, name));
		SaaSposeResponse response = api.cellsChartsPutWorksheetChartLegend(name, sheetName, chartIndex, folder, null);

		System.out.print(response.getCode());
	}

	public void cellsChartsPutWorksheetChartTitleTest() throws ApiException {
		String name = MYDOC;
		String sheetName = SHEET3;
		Integer chartIndex = 0;
		Title title = new Title();
		title.setText("test");
		String folder = TEMPFOLDER;
		api.setApiClient(Utils.Ready(folder, name));
		TitleResponse response = api.cellsChartsPutWorksheetChartTitle(name, sheetName, chartIndex, title, folder,
				null);

		System.out.print(response.getCode());
	}

}