package com.aspose.cloud.cells.examples.pivottables;

import java.util.ArrayList;
import java.util.List;

import com.aspose.cloud.cells.api.CellsPivotTablesApi;
import com.aspose.cloud.cells.client.ApiException;
import com.aspose.cloud.cells.examples.Base;
import com.aspose.cloud.cells.model.FilterColumn;
import com.aspose.cloud.cells.model.Font;
import com.aspose.cloud.cells.model.PivotFieldResponse;
import com.aspose.cloud.cells.model.PivotFilter;
import com.aspose.cloud.cells.model.PivotFilterResponse;
import com.aspose.cloud.cells.model.PivotFiltersResponse;
import com.aspose.cloud.cells.model.PivotTableFieldRequest;
import com.aspose.cloud.cells.model.PivotTableResponse;
import com.aspose.cloud.cells.model.PivotTablesResponse;
import com.aspose.cloud.cells.model.SaaSposeResponse;
import com.aspose.cloud.cells.model.Style;
import com.aspose.cloud.cells.model.Top10Filter;


public class PivotTablesAPIExamples extends Base {

	private final CellsPivotTablesApi api = new CellsPivotTablesApi();



	public void cellsPivotTablesDeletePivotTableFieldExample() throws ApiException {
		String name = PivExampleFile;

		String sheetName = SHEET4;
		Integer pivotTableIndex = 0;
		String pivotFieldType = "row";
		PivotTableFieldRequest request = new PivotTableFieldRequest();
		List<Integer> data = new ArrayList<Integer>();
		data.add(1);
		request.setData(data);
		String folder = TEMPFOLDER;
		api.setApiClient(Base.Ready(folder, name));
		SaaSposeResponse response = api.cellsPivotTablesDeletePivotTableField(name, sheetName, pivotTableIndex,
				pivotFieldType, request, folder, null);

		System.out.println(response.getCode());
	}

	public void cellsPivotTablesDeleteWorksheetPivotTableExample() throws ApiException {
		String name = PivExampleFile;
		String sheetName = SHEET4;
		Integer pivotTableIndex = 0;
		String folder = TEMPFOLDER;
		api.setApiClient(Base.Ready(folder, name));
		SaaSposeResponse response = api.cellsPivotTablesDeleteWorksheetPivotTable(name, sheetName, pivotTableIndex,
				folder, null);

		System.out.println(response.getCode());
	}

	public void cellsPivotTablesDeleteWorksheetPivotTableFilterExample() throws ApiException {
		String name = PivExampleFile;
		String sheetName = SHEET4;
		Integer pivotTableIndex = 0;
		Integer fieldIndex = 0;
		Boolean needReCalculate = true;
		String folder = TEMPFOLDER;
		api.setApiClient(Base.Ready(folder, name));
		SaaSposeResponse response = api.cellsPivotTablesDeleteWorksheetPivotTableFilter(name, sheetName,
				pivotTableIndex, fieldIndex, needReCalculate, folder, null);

		System.out.println(response.getCode());
	}

	public void cellsPivotTablesDeleteWorksheetPivotTableFiltersExample() throws ApiException {
		String name = PivExampleFile;
		String sheetName = SHEET4;
		Integer pivotTableIndex = 0;
		Boolean needReCalculate = true;
		String folder = TEMPFOLDER;
		api.setApiClient(Base.Ready(folder, name));
		SaaSposeResponse response = api.cellsPivotTablesDeleteWorksheetPivotTableFilters(name, sheetName,
				pivotTableIndex, needReCalculate, folder, null);

		System.out.println(response.getCode());
	}

	public void cellsPivotTablesDeleteWorksheetPivotTablesExample() throws ApiException {
		String name = PivExampleFile;
		String sheetName = SHEET4;
		String folder = TEMPFOLDER;
		api.setApiClient(Base.Ready(folder, name));
		SaaSposeResponse response = api.cellsPivotTablesDeleteWorksheetPivotTables(name, sheetName, folder, null);

		System.out.println(response.getCode());
	}

	public void cellsPivotTablesGetPivotTableFieldExample() throws ApiException {
		String name = PivExampleFile;
		;
		String sheetName = SHEET4;
		Integer pivotTableIndex = 0;
		Integer pivotFieldIndex = 0;
		String pivotFieldType = "Row";
		String folder = TEMPFOLDER;
		api.setApiClient(Base.Ready(folder, name));
		PivotFieldResponse response = api.cellsPivotTablesGetPivotTableField(name, sheetName, pivotTableIndex,
				pivotFieldIndex, pivotFieldType, folder, null);

		System.out.println(response.getCode());
	}

	public void cellsPivotTablesGetWorksheetPivotTableExample() throws ApiException {
		String name = PivExampleFile;
		String sheetName = SHEET4;
		Integer pivottableIndex = 0;
		String folder = TEMPFOLDER;
		api.setApiClient(Base.Ready(folder, name));
		PivotTableResponse response = api.cellsPivotTablesGetWorksheetPivotTable(name, sheetName, pivottableIndex,
				folder, null);

		System.out.println(response.getCode());
	}

	public void cellsPivotTablesGetWorksheetPivotTableFilterExample() throws ApiException {
		String name = PivExampleFile;
		;
		String sheetName = SHEET4;
		Integer pivotTableIndex = 0;
		Integer filterIndex = 0;
		String folder = TEMPFOLDER;
		api.setApiClient(Base.Ready(folder, name));

		PivotFilter filter = new PivotFilter();
		filter.setFieldIndex(0);
		filter.setFilterType("Count");
		List<FilterColumn> listFC = new ArrayList<FilterColumn>();
		FilterColumn filterColumn = new FilterColumn();
		filterColumn.setFilterType("Top10");
		filterColumn.setFieldIndex(0);
		Top10Filter top = new Top10Filter();
		top.setItems(1);
		top.setIsPercent(true);
		top.setIsTop(true);
		filterColumn.setTop10Filter(top);
		listFC.add(filterColumn);

		api.setApiClient(Base.Ready(folder, name));

		PivotFilterResponse response1 = api.cellsPivotTablesGetWorksheetPivotTableFilter(name, sheetName,
				pivotTableIndex, filterIndex, folder, null);

		System.out.println(response1.getCode());
	}

	public void cellsPivotTablesGetWorksheetPivotTableFiltersExample() throws ApiException {
		String name = PivExampleFile;
		String sheetName = SHEET4;
		Integer pivotTableIndex = 0;
		String folder = TEMPFOLDER;
		api.setApiClient(Base.Ready(folder, name));
		PivotFiltersResponse response = api.cellsPivotTablesGetWorksheetPivotTableFilters(name, sheetName,
				pivotTableIndex, folder, null);

		System.out.println(response.getCode());
	}

	public void cellsPivotTablesGetWorksheetPivotTablesExample() throws ApiException {
		String name = PivExampleFile;
		String sheetName = SHEET4;
		String folder = TEMPFOLDER;
		api.setApiClient(Base.Ready(folder, name));
		PivotTablesResponse response = api.cellsPivotTablesGetWorksheetPivotTables(name, sheetName, folder, null);

		System.out.println(response.getCode());
	}

	public void cellsPivotTablesPostPivotTableCellStyleExample() throws ApiException {
		String name = PivExampleFile;
		String sheetName = SHEET4;
		Integer pivotTableIndex = 0;
		Integer column = 1;
		Integer row = 1;
		Style style = new Style();
		Font font = new Font();
		font.setSize(10);
		style.setFont(font);
		Boolean needReCalculate = true;
		String folder = TEMPFOLDER;
		api.setApiClient(Base.Ready(folder, name));
		SaaSposeResponse response = api.cellsPivotTablesPostPivotTableCellStyle(name, sheetName, pivotTableIndex,
				column, row, style, needReCalculate, folder, null);

		System.out.println(response.getCode());
	}

	public void cellsPivotTablesPostPivotTableFieldHideItemExample() throws ApiException {
		String name = PivExampleFile;
		String sheetName = SHEET4;
		Integer pivotTableIndex = 0;
		String pivotFieldType = "Row";
		Integer fieldIndex = 0;
		Integer itemIndex = 1;
		Boolean isHide = true;
		Boolean needReCalculate = true;
		String folder = TEMPFOLDER;
		api.setApiClient(Base.Ready(folder, name));
		SaaSposeResponse response = api.cellsPivotTablesPostPivotTableFieldHideItem(name, sheetName, pivotTableIndex,
				pivotFieldType, fieldIndex, itemIndex, isHide, needReCalculate, folder, null);

		System.out.println(response.getCode());
	}

	public void cellsPivotTablesPostPivotTableFieldMoveToExample() throws ApiException {
		String name = PivExampleFile;
		String sheetName = SHEET4;
		Integer pivotTableIndex = 0;
		Integer fieldIndex = 0;
		String from = "Row";
		String to = "Column";
		String folder = TEMPFOLDER;
		api.setApiClient(Base.Ready(folder, name));
		SaaSposeResponse response = api.cellsPivotTablesPostPivotTableFieldMoveTo(name, sheetName, pivotTableIndex,
				fieldIndex, from, to, folder, null);

		System.out.println(response.getCode());
	}

	public void cellsPivotTablesPostPivotTableStyleExample() throws ApiException {
		String name = PivExampleFile;

		String sheetName = SHEET4;
		Integer pivotTableIndex = 0;
		Style style = new Style();
		Font font = new Font();
		font.setSize(10);
		style.setFont(font);
		Boolean needReCalculate = true;
		String folder = TEMPFOLDER;
		api.setApiClient(Base.Ready(folder, name));
		SaaSposeResponse response = api.cellsPivotTablesPostPivotTableStyle(name, sheetName, pivotTableIndex, style,
				needReCalculate, folder, null);

		System.out.println(response.getCode());
	}

	public void cellsPivotTablesPostWorksheetPivotTableCalculateExample() throws ApiException {
		String name = PivExampleFile;

		String sheetName = SHEET4;
		Integer pivotTableIndex = 0;
		String folder = TEMPFOLDER;
		api.setApiClient(Base.Ready(folder, name));
		SaaSposeResponse response = api.cellsPivotTablesPostWorksheetPivotTableCalculate(name, sheetName,
				pivotTableIndex, folder, null);

		System.out.println(response.getCode());
	}

	public void cellsPivotTablesPostWorksheetPivotTableMoveExample() throws ApiException {
		String name = PivExampleFile;
		String sheetName = SHEET4;
		Integer pivotTableIndex = 0;
		Integer row = 1;
		Integer column = 1;
		String destCellName = "C10";
		String folder = TEMPFOLDER;
		api.setApiClient(Base.Ready(folder, name));
		SaaSposeResponse response = api.cellsPivotTablesPostWorksheetPivotTableMove(name, sheetName, pivotTableIndex,
				row, column, destCellName, folder, null);

		System.out.println(response.getCode());
	}

	public void cellsPivotTablesPutPivotTableFieldExample() throws ApiException {
		String name = PivExampleFile;
		String sheetName = SHEET4;
		Integer pivotTableIndex = 0;
		String pivotFieldType = "Row";
		PivotTableFieldRequest request = new PivotTableFieldRequest();
		List<Integer> data = new ArrayList<Integer>();
		data.add(1);
		request.setData(data);
		Boolean needReCalculate = null;
		String folder = TEMPFOLDER;
		api.setApiClient(Base.Ready(folder, name));
		SaaSposeResponse response = api.cellsPivotTablesPutPivotTableField(name, sheetName, pivotTableIndex,
				pivotFieldType, request, needReCalculate, folder, null);

		System.out.println(response.getCode());
	}

	public void cellsPivotTablesPutWorksheetPivotTableExample() throws ApiException {
		String name = PivExampleFile;
		String sheetName = SHEET4;
		String folder = TEMPFOLDER;
		String sourceData = "Sheet1!C6:E13";
		String destCellName = "C1";
		String tableName = "ExamplePivot";
		Boolean useSameSource = true;
		api.setApiClient(Base.Ready(folder, name));
		PivotTableResponse response = api.cellsPivotTablesPutWorksheetPivotTable(name, sheetName, null, folder, null,
				sourceData, destCellName, tableName, useSameSource);

		System.out.println(response.getCode());
	}

	public void cellsPivotTablesPutWorksheetPivotTableFilterExample() throws ApiException {
		String name = PivExampleFile;
		String sheetName = SHEET4;
		Integer pivotTableIndex = 0;
		PivotFilter filter = new PivotFilter();
		filter.setFieldIndex(0);
		filter.setFilterType("Count");
		List<FilterColumn> listFC = new ArrayList<FilterColumn>();
		FilterColumn filterColumn = new FilterColumn();
		filterColumn.setFilterType("Top10");
		filterColumn.setFieldIndex(0);
		Top10Filter top = new Top10Filter();
		top.setItems(1);
		top.setIsPercent(true);
		top.setIsTop(true);
		filterColumn.setTop10Filter(top);
		listFC.add(filterColumn);
		Boolean needReCalculate = true;
		String folder = TEMPFOLDER;
		api.setApiClient(Base.Ready(folder, name));
		SaaSposeResponse response = api.cellsPivotTablesPutWorksheetPivotTableFilter(name, sheetName, pivotTableIndex,
				filter, needReCalculate, folder, null);

		System.out.println(response.getCode());
	}

}