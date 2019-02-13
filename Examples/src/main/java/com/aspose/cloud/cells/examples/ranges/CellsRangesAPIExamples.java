package com.aspose.cloud.cells.examples.ranges;

import com.aspose.cloud.cells.api.CellsRangesApi;
import com.aspose.cloud.cells.client.ApiException;
import com.aspose.cloud.cells.examples.Utils;
import com.aspose.cloud.cells.model.Color;
import com.aspose.cloud.cells.model.Font;
import com.aspose.cloud.cells.model.PasteOptions;
import com.aspose.cloud.cells.model.Range;
import com.aspose.cloud.cells.model.RangeCopyRequest;
import com.aspose.cloud.cells.model.RangeSetOutlineBorderRequest;
import com.aspose.cloud.cells.model.RangeSetStyleRequest;
import com.aspose.cloud.cells.model.RangeValueResponse;
import com.aspose.cloud.cells.model.SaaSposeResponse;
import com.aspose.cloud.cells.model.Style;

/**
 * API tests for CellsRangesApi
 */

public class CellsRangesAPIExamples {

	private final CellsRangesApi api = new CellsRangesApi();

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

	public void cellsRangesGetWorksheetCellsRangeValueTest() throws ApiException {
		String name = BOOK1;
		String sheetName = SHEET1;
		String folder = TEMPFOLDER;
		Integer firstRow = 0;
		Integer firstColumn = 0;
		Integer rowCount = 3;
		Integer columnCount = 2;
		api.setApiClient(Utils.Ready(folder, name));

		RangeValueResponse response = api.cellsRangesGetWorksheetCellsRangeValue(name, sheetName, null, firstRow,
				firstColumn, rowCount, columnCount, folder, null);

		String rangeName = "A1:B3";
		response = api.cellsRangesGetWorksheetCellsRangeValue(name, sheetName, rangeName, null, null, null, null,
				folder, null);

		rangeName = "Name_2";
		response = api.cellsRangesGetWorksheetCellsRangeValue(name, sheetName, rangeName, null, null, null, null,
				folder, null);
	}

	public void cellsRangesPostWorksheetCellsRangeColumnWidthTest() throws ApiException {
		String name = BOOK1;
		String sheetName = SHEET1;
		Double value = 10.01;
		Range range = new Range();
		range.setFirstColumn(1);
		range.setFirstRow(1);
		range.setColumnCount(1);
		range.setRowCount(10);
		range.setColumnWidth(10.01);
		String folder = TEMPFOLDER;
		api.setApiClient(Utils.Ready(folder, name));
		SaaSposeResponse response = api.cellsRangesPostWorksheetCellsRangeColumnWidth(name, sheetName, value, range,
				folder, null);

		System.out.println(response.getCode());

	}

	public void cellsRangesPostWorksheetCellsRangeMergeTest() throws ApiException {
		String name = BOOK1;
		String sheetName = SHEET1;
		Range range = new Range();
		range.setFirstColumn(1);
		range.setFirstRow(1);
		range.setColumnCount(1);
		range.setRowCount(10);
		String folder = TEMPFOLDER;
		api.setApiClient(Utils.Ready(folder, name));
		SaaSposeResponse response = api.cellsRangesPostWorksheetCellsRangeMerge(name, sheetName, range, folder, null);

		System.out.println(response.getCode());

	}

	public void cellsRangesPostWorksheetCellsRangeMoveToTest() throws ApiException {
		String name = BOOK1;
		String sheetName = SHEET1;
		Integer destRow = 1;
		Integer destColumn = 1;
		Range range = new Range();
		range.setFirstColumn(1);
		range.setFirstRow(1);
		range.setColumnCount(1);
		range.setRowCount(10);
		String folder = TEMPFOLDER;
		api.setApiClient(Utils.Ready(folder, name));
		SaaSposeResponse response = api.cellsRangesPostWorksheetCellsRangeMoveTo(name, sheetName, destRow, destColumn,
				range, folder, null);

		System.out.println(response.getCode());

	}

	public void cellsRangesPostWorksheetCellsRangeOutlineBorderTest() throws ApiException {
		String name = BOOK1;
		String sheetName = SHEET1;
		RangeSetOutlineBorderRequest rangeOperate = new RangeSetOutlineBorderRequest();
		Color borderColor = new Color();
		borderColor.setG(123);
		rangeOperate.setBorderColor(borderColor);
		rangeOperate.setBorderEdge("LeftBorder");
		rangeOperate.setBorderStyle("Dotted");
		Range range = new Range();
		range.setFirstColumn(1);
		range.setFirstRow(1);
		range.setColumnCount(1);
		range.setRowCount(10);
		rangeOperate.setRange(range);
		String folder = TEMPFOLDER;
		api.setApiClient(Utils.Ready(folder, name));
		SaaSposeResponse response = api.cellsRangesPostWorksheetCellsRangeOutlineBorder(name, sheetName, rangeOperate,
				folder, null);

		System.out.println(response.getCode());

	}

	public void cellsRangesPostWorksheetCellsRangeRowHeightTest() throws ApiException {
		String name = BOOK1;
		String sheetName = SHEET1;
		Double value = 10.99;
		Range range = new Range();
		range.setFirstColumn(1);
		range.setFirstRow(1);
		range.setColumnCount(1);
		range.setRowCount(10);
		String folder = TEMPFOLDER;
		api.setApiClient(Utils.Ready(folder, name));
		SaaSposeResponse response = api.cellsRangesPostWorksheetCellsRangeRowHeight(name, sheetName, value, range,
				folder, null);

		System.out.println(response.getCode());

	}

	public void cellsRangesPostWorksheetCellsRangeStyleTest() throws ApiException {
		String name = BOOK1;
		String sheetName = SHEET1;
		RangeSetStyleRequest rangeOperate = new RangeSetStyleRequest();
		Range range = new Range();
		range.setFirstColumn(1);
		range.setFirstRow(1);
		range.setColumnCount(1);
		range.setRowCount(10);
		rangeOperate.setRange(range);
		Style style = new Style();
		Font font = new Font();
		font.setSize(10);
		style.setFont(font);
		rangeOperate.setStyle(style);
		String folder = TEMPFOLDER;
		api.setApiClient(Utils.Ready(folder, name));
		SaaSposeResponse response = api.cellsRangesPostWorksheetCellsRangeStyle(name, sheetName, rangeOperate, folder,
				null);

		System.out.println(response.getCode());

	}

	public void cellsRangesPostWorksheetCellsRangeUnMergeTest() throws ApiException {
		String name = BOOK1;
		String sheetName = SHEET1;
		Range range = new Range();
		range.setFirstColumn(1);
		range.setFirstRow(1);
		range.setColumnCount(1);
		range.setRowCount(10);
		String folder = TEMPFOLDER;
		api.setApiClient(Utils.Ready(folder, name));
		SaaSposeResponse response = api.cellsRangesPostWorksheetCellsRangeUnmerge(name, sheetName, range, folder, null);

		System.out.println(response.getCode());

	}

	public void cellsRangesPostWorksheetCellsRangeValueTest() throws ApiException {
		String name = BOOK1;
		String sheetName = SHEET1;
		String value = "10";
		Range range = new Range();
		range.setFirstColumn(1);
		range.setFirstRow(1);
		range.setColumnCount(1);
		range.setRowCount(10);
		Boolean isConverted = true;
		Boolean setStyle = true;
		String folder = TEMPFOLDER;
		api.setApiClient(Utils.Ready(folder, name));
		SaaSposeResponse response = api.cellsRangesPostWorksheetCellsRangeValue(name, sheetName, value, range,
				isConverted, setStyle, folder, null);

		System.out.println(response.getCode());

	}

	public void cellsRangesPostWorksheetCellsRangesTest() throws ApiException {
		String name = BOOK1;
		String sheetName = SHEET1;
		RangeCopyRequest rangeOperate = new RangeCopyRequest();
		rangeOperate.setOperate("copydata");
		PasteOptions po = new PasteOptions();
		po.setOnlyVisibleCells(true);
		rangeOperate.setPasteOptions(po);
		Range range = new Range();
		range.setFirstColumn(1);
		range.setFirstRow(1);
		range.setColumnCount(1);
		range.setRowCount(10);
		rangeOperate.setSource(range);
		Range range2 = new Range();
		range2.setFirstColumn(10);
		range2.setFirstRow(10);
		range2.setColumnCount(1);
		range2.setRowCount(10);
		rangeOperate.setTarget(range2);
		String folder = TEMPFOLDER;
		api.setApiClient(Utils.Ready(folder, name));
		SaaSposeResponse response = api.cellsRangesPostWorksheetCellsRanges(name, sheetName, rangeOperate, folder,
				null);

		System.out.println(response.getCode());

	}

}