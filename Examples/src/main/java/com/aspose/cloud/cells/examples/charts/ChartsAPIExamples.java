package com.aspose.cloud.cells.examples.charts;

import java.io.File;

import com.aspose.cloud.cells.api.CellsChartsApi;
import com.aspose.cloud.cells.client.ApiException;
import com.aspose.cloud.cells.examples.Base;
import com.aspose.cloud.cells.model.Chart;
import com.aspose.cloud.cells.model.ChartsResponse;
import com.aspose.cloud.cells.model.Legend;
import com.aspose.cloud.cells.model.LegendResponse;
import com.aspose.cloud.cells.model.SaaSposeResponse;
import com.aspose.cloud.cells.model.Title;
import com.aspose.cloud.cells.model.TitleResponse;

public class ChartsAPIExamples extends Base {

	private final CellsChartsApi api = new CellsChartsApi();

	public void cellsChartsDeleteWorksheetChartLegendExample() throws ApiException {
		String name = MYDOC;
		String sheetName = SHEET3;
		Integer chartIndex = 1;
		String folder = TEMPFOLDER;
		api.setApiClient(Base.Ready(folder, name));
		SaaSposeResponse response = api.cellsChartsDeleteWorksheetChartLegend(name, sheetName, chartIndex, folder,
				null);

		System.out.print(response.getCode());
	}

	public void cellsChartsDeleteWorksheetChartTitleExample() throws ApiException {
		String name = MYDOC;
		String sheetName = SHEET3;
		Integer chartIndex = 0;
		String folder = TEMPFOLDER;
		api.setApiClient(Base.Ready(folder, name));
		SaaSposeResponse response = api.cellsChartsDeleteWorksheetChartTitle(name, sheetName, chartIndex, folder, null);

		System.out.print(response.getCode());
	}

	public void cellsChartsDeleteWorksheetClearChartsExample() throws ApiException {
		String name = MYDOC;
		String sheetName = SHEET3;
		String folder = TEMPFOLDER;
		api.setApiClient(Base.Ready(folder, name));
		SaaSposeResponse response = api.cellsChartsDeleteWorksheetClearCharts(name, sheetName, folder, null);

		System.out.print(response.getCode());
	}

	public void cellsChartsDeleteWorksheetDeleteChartExample() throws ApiException {
		String name = MYDOC;
		String sheetName = SHEET3;
		Integer chartIndex = 0;
		String folder = TEMPFOLDER;
		api.setApiClient(Base.Ready(folder, name));
		ChartsResponse response = api.cellsChartsDeleteWorksheetDeleteChart(name, sheetName, chartIndex, folder, null);

		System.out.print(response.getCode());
	}

	public void cellsChartsGetWorksheetChartExample() throws ApiException {
		String name = MYDOC;
		String sheetName = SHEET3;
		Integer chartNumber = 0;
		String format = "png";
		String folder = TEMPFOLDER;
		api.setApiClient(Base.Ready(folder, name));
		File response = api.cellsChartsGetWorksheetChart(name, sheetName, chartNumber, format, folder, null);
		writeFileTo(response);

	}

	public void cellsChartsGetWorksheetChartLegendExample() throws ApiException {
		String name = MYDOC;
		String sheetName = SHEET3;
		Integer chartIndex = 0;
		String folder = TEMPFOLDER;
		api.setApiClient(Base.Ready(folder, name));
		LegendResponse response = api.cellsChartsGetWorksheetChartLegend(name, sheetName, chartIndex, folder, null);

		System.out.print(response.getCode());
	}

	public void cellsChartsGetWorksheetChartTitleExample() throws ApiException {
		String name = MYDOC;
		String sheetName = SHEET3;
		Integer chartIndex = 0;
		String folder = TEMPFOLDER;
		api.setApiClient(Base.Ready(folder, name));
		TitleResponse response = api.cellsChartsGetWorksheetChartTitle(name, sheetName, chartIndex, folder, null);

		System.out.print(response.getCode());
	}

	public void cellsChartsGetWorksheetChartsExample() throws ApiException {
		String name = MYDOC;
		String sheetName = SHEET3;
		String folder = TEMPFOLDER;
		api.setApiClient(Base.Ready(folder, name));
		ChartsResponse response = api.cellsChartsGetWorksheetCharts(name, sheetName, folder, null);

		System.out.print(response.getCode());
	}

	public void cellsChartsPostWorksheetChartExample() throws ApiException {
		String name = MYDOC;
		String sheetName = SHEET3;
		Integer chartIndex = 0;
		Chart chart = new Chart();
		chart.setAutoScaling(true);
		String folder = TEMPFOLDER;
		api.setApiClient(Base.Ready(folder, name));
		SaaSposeResponse response = api.cellsChartsPostWorksheetChart(name, sheetName, chartIndex, chart, folder, null);

		System.out.print(response.getCode());
	}

	public void cellsChartsPostWorksheetChartLegendExample() throws ApiException {
		String name = MYDOC;
		String sheetName = SHEET3;
		Integer chartIndex = 0;
		Legend legend = new Legend();
		legend.setWidth(0);
		String folder = TEMPFOLDER;
		api.setApiClient(Base.Ready(folder, name));
		LegendResponse response = api.cellsChartsPostWorksheetChartLegend(name, sheetName, chartIndex, legend, folder,
				null);

		System.out.print(response.getCode());
	}

	public void cellsChartsPostWorksheetChartTitleExample() throws ApiException {
		String name = MYDOC;
		String sheetName = SHEET3;
		Integer chartIndex = 0;
		Title title = new Title();
		title.setText("Example");
		String folder = TEMPFOLDER;
		api.setApiClient(Base.Ready(folder, name));
		TitleResponse response = api.cellsChartsPostWorksheetChartTitle(name, sheetName, chartIndex, title, folder,
				null);

		System.out.print(response.getCode());
	}

	public void cellsChartsPutWorksheetAddChartExample() throws ApiException {
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
		api.setApiClient(Base.Ready(folder, name));
		ChartsResponse response = api.cellsChartsPutWorksheetAddChart(name, sheetName, chartType, upperLeftRow,
				upperLeftColumn, lowerRightRow, lowerRightColumn, area, isVertical, categoryData, isAutoGetSerialName,
				title, folder, null);

		System.out.print(response.getCode());
	}

	public void cellsChartsPutWorksheetChartLegendExample() throws ApiException {
		String name = MYDOC;
		String sheetName = SHEET3;
		Integer chartIndex = 0;
		String folder = TEMPFOLDER;
		api.setApiClient(Base.Ready(folder, name));
		SaaSposeResponse response = api.cellsChartsPutWorksheetChartLegend(name, sheetName, chartIndex, folder, null);

		System.out.print(response.getCode());
	}

	public void cellsChartsPutWorksheetChartTitleExample() throws ApiException {
		String name = MYDOC;
		String sheetName = SHEET3;
		Integer chartIndex = 0;
		Title title = new Title();
		title.setText("Example");
		String folder = TEMPFOLDER;
		api.setApiClient(Base.Ready(folder, name));
		TitleResponse response = api.cellsChartsPutWorksheetChartTitle(name, sheetName, chartIndex, title, folder,
				null);

		System.out.print(response.getCode());
	}

}