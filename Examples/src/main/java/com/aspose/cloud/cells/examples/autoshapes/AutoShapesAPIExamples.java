package com.aspose.cloud.cells.examples.autoshapes;

import java.io.File;

import com.aspose.cloud.cells.api.CellsAutoshapesApi;
import com.aspose.cloud.cells.client.ApiException;
import com.aspose.cloud.cells.examples.Base;
import com.aspose.cloud.cells.model.AutoShapesResponse;

public class AutoShapesAPIExamples extends Base {

	private final CellsAutoshapesApi api = new CellsAutoshapesApi();

	public void cellsAutoshapesGetWorksheetAutoshapeExample() throws ApiException {
		String name = MYDOC;
		String sheetName = SHEET2;
		Integer autoshapeNumber = 4;
		String format = "png";
		String folder = TEMPFOLDER;
		api.setApiClient(Base.Ready(folder, name));
		File response = api.cellsAutoshapesGetWorksheetAutoshape(name, sheetName, autoshapeNumber, format, folder,
				null);
		writeFileTo(response);

	}

	public void cellsAutoshapesGetWorksheetAutoshapesExample() throws ApiException {
		String name = MYDOC;
		String sheetName = SHEET2;
		String folder = TEMPFOLDER;
		api.setApiClient(Base.Ready(folder, name));
		AutoShapesResponse response = api.cellsAutoshapesGetWorksheetAutoshapes(name, sheetName, folder, null);

		System.out.print(response);
	}

}