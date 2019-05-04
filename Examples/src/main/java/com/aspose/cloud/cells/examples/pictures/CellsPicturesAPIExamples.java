package com.aspose.cloud.cells.examples.pictures;

import java.io.File;

import com.aspose.cloud.cells.api.CellsPicturesApi;
import com.aspose.cloud.cells.client.ApiException;
import com.aspose.cloud.cells.examples.Base;
import com.aspose.cloud.cells.model.Picture;
import com.aspose.cloud.cells.model.PictureResponse;
import com.aspose.cloud.cells.model.PicturesResponse;
import com.aspose.cloud.cells.model.SaaSposeResponse;


public class CellsPicturesAPIExamples extends Base{

	private final CellsPicturesApi api = new CellsPicturesApi();

	
	public void cellsPicturesDeleteWorkSheetPicturesExample() throws ApiException {
		String name = BOOK1;
		String sheetName = SHEET6;
		String folder = TEMPFOLDER;
		api.setApiClient(Base.Ready(folder, name));
		SaaSposeResponse response = api.cellsPicturesDeleteWorksheetPictures(name, sheetName, folder, null);
		System.out.println(response.getCode());
	}

	public void cellsPicturesDeleteWorksheetPictureExample() throws ApiException {
		String name = BOOK1;
		String sheetName = SHEET6;
		Integer pictureIndex = 0;
		String folder = TEMPFOLDER;
		api.setApiClient(Base.Ready(folder, name));
		SaaSposeResponse response = api.cellsPicturesDeleteWorksheetPicture(name, sheetName, pictureIndex, folder,
				null);
		System.out.println(response.getCode());
	}

	public void cellsPicturesGetWorksheetPictureExample() throws ApiException {
		String name = BOOK1;
		String sheetName = SHEET6;
		String format = null;
		Integer pictureNumber = 0;
		String folder = TEMPFOLDER;
		api.setApiClient(Base.Ready(folder, name));
		File response = api.cellsPicturesGetWorksheetPicture(name, sheetName, pictureNumber, format, folder, null);
		writeFileTo(response);


	}

	public void cellsPicturesGetWorksheetPicturesExample() throws ApiException {
		String name = BOOK1;
		String sheetName = SHEET6;
		String folder = TEMPFOLDER;
		api.setApiClient(Base.Ready(folder, name));
		PicturesResponse response = api.cellsPicturesGetWorksheetPictures(name, sheetName, folder, null);
		System.out.println(response.getCode());
	}

	public void cellsPicturesPostWorkSheetPictureExample() throws ApiException {
		String name = BOOK1;
		String sheetName = SHEET6;
		Integer pictureIndex = 0;
		Picture picture = new Picture();
		picture.setLeft(10);
		String folder = TEMPFOLDER;
		api.setApiClient(Base.Ready(folder, name));
		PictureResponse response = api.cellsPicturesPostWorksheetPicture(name, sheetName, pictureIndex, picture, folder,
				null);
		System.out.println(response.getCode());
	}

	public void cellsPicturesPutWorksheetAddPictureExample() throws ApiException {
		String name = BOOK1;
		String sheetName = SHEET6;
		Picture picture = null;
		Integer upperLeftRow = 1;
		Integer upperLeftColumn = 1;
		Integer lowerRightRow = 10;
		Integer lowerRightColumn = 10;
		String picturePath = "WaterMark.png";
		String folder = TEMPFOLDER;
		api.setApiClient(Base.Ready(folder, name));
		PicturesResponse response = api.cellsPicturesPutWorksheetAddPicture(name, sheetName, picture, upperLeftRow,
				upperLeftColumn, lowerRightRow, lowerRightColumn, picturePath, folder, null);
		System.out.println(response.getCode());
	}

}