package com.aspose.cloud.cells.examples.pictures;

import java.io.File;

import com.aspose.cloud.cells.api.CellsPicturesApi;
import com.aspose.cloud.cells.client.ApiException;
import com.aspose.cloud.cells.examples.Utils;
import com.aspose.cloud.cells.model.Picture;
import com.aspose.cloud.cells.model.PictureResponse;
import com.aspose.cloud.cells.model.PicturesResponse;
import com.aspose.cloud.cells.model.SaaSposeResponse;

import junit.framework.Assert;

/**
 * API tests for CellsPicturesApi
 */

public class CellsPicturesAPIExamples {

	private final CellsPicturesApi api = new CellsPicturesApi();

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

	public void cellsPicturesDeleteWorkSheetPicturesTest() throws ApiException {
		String name = BOOK1;
		String sheetName = SHEET6;
		String folder = TEMPFOLDER;
		api.setApiClient(Utils.Ready(folder, name));
		SaaSposeResponse response = api.cellsPicturesDeleteWorksheetPictures(name, sheetName, folder, null);
		System.out.println(response.getCode());
	}

	public void cellsPicturesDeleteWorksheetPictureTest() throws ApiException {
		String name = BOOK1;
		String sheetName = SHEET6;
		Integer pictureIndex = 0;
		String folder = TEMPFOLDER;
		api.setApiClient(Utils.Ready(folder, name));
		SaaSposeResponse response = api.cellsPicturesDeleteWorksheetPicture(name, sheetName, pictureIndex, folder,
				null);
		System.out.println(response.getCode());
	}

	public void cellsPicturesGetWorksheetPictureTest() throws ApiException {
		String name = BOOK1;
		String sheetName = SHEET6;
		String format = null;
		Integer pictureNumber = 0;
		String folder = TEMPFOLDER;
		api.setApiClient(Utils.Ready(folder, name));
		File response = api.cellsPicturesGetWorksheetPicture(name, sheetName, pictureNumber, format, folder, null);

	}

	public void cellsPicturesGetWorksheetPicturesTest() throws ApiException {
		String name = BOOK1;
		String sheetName = SHEET6;
		String folder = TEMPFOLDER;
		api.setApiClient(Utils.Ready(folder, name));
		PicturesResponse response = api.cellsPicturesGetWorksheetPictures(name, sheetName, folder, null);
		System.out.println(response.getCode());
	}

	public void cellsPicturesPostWorkSheetPictureTest() throws ApiException {
		String name = BOOK1;
		String sheetName = SHEET6;
		Integer pictureIndex = 0;
		Picture picture = new Picture();
		picture.setLeft(10);
		String folder = TEMPFOLDER;
		api.setApiClient(Utils.Ready(folder, name));
		PictureResponse response = api.cellsPicturesPostWorksheetPicture(name, sheetName, pictureIndex, picture, folder,
				null);
		System.out.println(response.getCode());
	}

	public void cellsPicturesPutWorksheetAddPictureTest() throws ApiException {
		String name = BOOK1;
		String sheetName = SHEET6;
		Picture picture = null;
		Integer upperLeftRow = 1;
		Integer upperLeftColumn = 1;
		Integer lowerRightRow = 10;
		Integer lowerRightColumn = 10;
		String picturePath = "WaterMark.png";
		String folder = TEMPFOLDER;
		api.setApiClient(Utils.Ready(folder, name));
		PicturesResponse response = api.cellsPicturesPutWorksheetAddPicture(name, sheetName, picture, upperLeftRow,
				upperLeftColumn, lowerRightRow, lowerRightColumn, picturePath, folder, null);
		System.out.println(response.getCode());
	}

}