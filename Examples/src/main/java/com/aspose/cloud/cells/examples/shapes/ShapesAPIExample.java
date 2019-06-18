package com.aspose.cloud.cells.examples.shapes;

import com.aspose.cloud.cells.api.CellsShapesApi;
import com.aspose.cloud.cells.client.ApiException;
import com.aspose.cloud.cells.examples.Base;
import com.aspose.cloud.cells.model.SaaSposeResponse;
import com.aspose.cloud.cells.model.Shape;
import com.aspose.cloud.cells.model.ShapeResponse;
import com.aspose.cloud.cells.model.ShapesResponse;


public class ShapesAPIExample extends Base{

	private final CellsShapesApi api = new CellsShapesApi();

	

	public void cellsShapesDeleteWorksheetShapeExample() throws ApiException {
		String name = BOOK1;
		String sheetName = SHEET6;
		Integer shapeindex = 0;
		String folder = TEMPFOLDER;
		api.setApiClient(Base.Ready(folder, name));
		SaaSposeResponse response = api.cellsShapesDeleteWorksheetShape(name, sheetName, shapeindex, folder, null);

		System.out.println(response.getCode());
	}

	public void cellsShapesDeleteWorksheetShapesExample() throws ApiException {
		String name = BOOK1;
		String sheetName = SHEET1;
		String folder = TEMPFOLDER;
		api.setApiClient(Base.Ready(folder, name));
		SaaSposeResponse response = api.cellsShapesDeleteWorksheetShapes(name, sheetName, folder, null);

		System.out.println(response.getCode());
	}

	public void cellsShapesGetWorksheetShapeExample() throws ApiException {
		String name = BOOK1;
		String sheetName = SHEET6;
		Integer shapeindex = 0;
		String folder = TEMPFOLDER;
		api.setApiClient(Base.Ready(folder, name));
		ShapeResponse response = api.cellsShapesGetWorksheetShape(name, sheetName, shapeindex, folder, null);

		System.out.println(response.getCode());
	}

	public void cellsShapesGetWorksheetShapesExample() throws ApiException {
		String name = BOOK1;
		String sheetName = SHEET1;
		String folder = TEMPFOLDER;
		api.setApiClient(Base.Ready(folder, name));
		ShapesResponse response = api.cellsShapesGetWorksheetShapes(name, sheetName, folder, null);
		System.out.print(response);

		
	}

	public void cellsShapesPostWorksheetShapeExample() throws ApiException {
		String name = BOOK1;
		String sheetName = SHEET6;
		Integer shapeindex = 0;
		Shape dto = new Shape();
		dto.setLowerRightColumn(10);
		String folder = TEMPFOLDER;
		api.setApiClient(Base.Ready(folder, name));
		SaaSposeResponse response = api.cellsShapesPostWorksheetShape(name, sheetName, shapeindex, dto, folder, null);

		System.out.println(response.getCode());
	}

	public void cellsShapesPutWorksheetShapeExample() throws ApiException {
		String name = BOOK1;
		String sheetName = SHEET1;
		String drawingType = "button";
		Integer upperLeftRow = 1;
		Integer upperLeftColumn = 1;
		Integer top = 10;
		Integer left = 10;
		Integer width = 100;
		Integer height = 90;
		String folder = TEMPFOLDER;
		api.setApiClient(Base.Ready(folder, name));
		ShapeResponse response = api.cellsShapesPutWorksheetShape(name, sheetName, drawingType, upperLeftRow,
				upperLeftColumn, top, left, width, height, folder, null);

		System.out.println(response.getCode());
	}

		
	public static void main(String argv[]) throws ApiException {
		new ShapesAPIExample().cellsShapesPutWorksheetShapeExample();
	}
}