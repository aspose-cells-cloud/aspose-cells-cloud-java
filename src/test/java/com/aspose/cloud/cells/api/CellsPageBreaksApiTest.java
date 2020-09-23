/*
 * Web API Swagger specification
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.aspose.cloud.cells.api;

import com.aspose.cloud.cells.client.ApiClient;
import com.aspose.cloud.cells.client.ApiException;
import com.aspose.cloud.cells.client.Configuration;
import com.aspose.cloud.cells.model.HorizontalPageBreakResponse;
import com.aspose.cloud.cells.model.HorizontalPageBreaksResponse;
import com.aspose.cloud.cells.model.CellsCloudResponse;
import com.aspose.cloud.cells.model.VerticalPageBreakResponse;
import com.aspose.cloud.cells.model.VerticalPageBreaksResponse;

import org.junit.Test;
import org.junit.Ignore;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CellsPageBreaksApi
 */

public class CellsPageBreaksApiTest {

	private CellsApi api;

	private String BOOK1 = "Book1.xlsx";
	private String MYDOC = "myDocument.xlsx";
	private String PivTestFile = "TestCase.xlsx";
	private String TEMPFOLDER = "JavaTest";
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

	public CellsPageBreaksApiTest() {
		try {
			api = new CellsApi(CellsApiUtil.GetClientId(),CellsApiUtil.GetClientSecret(),CellsApiUtil.GetAPIVersion(),CellsApiUtil.GetBaseUrl());
		} catch (ApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void cellsPageBreaksDeleteHorizontalPageBreakTest()
			throws ApiException {
		String name = BOOK1;
		String sheetName = SHEET1;
		Integer index = 0;
		String folder = TEMPFOLDER;
		CellsApiUtil.Upload(api, folder, name);
		CellsCloudResponse response = api
				.cellsPageBreaksDeleteHorizontalPageBreak(name, sheetName,
						index, folder, null);

		// TODO: test validations
	}

	/**
	 * 
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void cellsPageBreaksDeleteHorizontalPageBreaksTest()
			throws ApiException {
		String name = BOOK1;
		String sheetName = SHEET1;
		Integer row = 0;
		String folder = TEMPFOLDER;
		CellsApiUtil.Upload(api, folder, name);
		CellsCloudResponse response = api
				.cellsPageBreaksDeleteHorizontalPageBreaks(name, sheetName,
						row, folder, null);

		// TODO: test validations
	}

	/**
	 * 
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void cellsPageBreaksDeleteVerticalPageBreakTest()
			throws ApiException {
		String name = BOOK1;
		String sheetName = SHEET1;
		Integer index = 0;
		String folder = TEMPFOLDER;
		CellsApiUtil.Upload(api, folder, name);
		CellsCloudResponse response = api
				.cellsPageBreaksDeleteVerticalPageBreak(name, sheetName, index,
						folder, null);

		// TODO: test validations
	}

	/**
	 * 
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void cellsPageBreaksDeleteVerticalPageBreaksTest()
			throws ApiException {
		String name = BOOK1;
		String sheetName = SHEET1;
		Integer column = 0;
		String folder = TEMPFOLDER;
		CellsApiUtil.Upload(api, folder, name);
		CellsCloudResponse response = api
				.cellsPageBreaksDeleteVerticalPageBreaks(name, sheetName,
						column, folder, null);

		// TODO: test validations
	}

	/**
	 * 
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void cellsPageBreaksGetHorizontalPageBreakTest() throws ApiException {
		String name = BOOK1;
		String sheetName = SHEET1;
		Integer index = 0;
		String folder = TEMPFOLDER;
		CellsApiUtil.Upload(api, folder, name);
		HorizontalPageBreakResponse response = api
				.cellsPageBreaksGetHorizontalPageBreak(name, sheetName, index,
						folder, null);

		// TODO: test validations
	}

	/**
	 * 
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void cellsPageBreaksGetHorizontalPageBreaksTest()
			throws ApiException {
		String name = BOOK1;
		String sheetName = SHEET1;
		String folder = TEMPFOLDER;
		CellsApiUtil.Upload(api, folder, name);
		HorizontalPageBreaksResponse response = api
				.cellsPageBreaksGetHorizontalPageBreaks(name, sheetName,
						folder, null);

		// TODO: test validations
	}

	/**
	 * 
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void cellsPageBreaksGetVerticalPageBreakTest() throws ApiException {
		String name = BOOK1;
		String sheetName = SHEET1;
		Integer index = 0;
		String folder = TEMPFOLDER;
		CellsApiUtil.Upload(api, folder, name);
		VerticalPageBreakResponse response = api
				.cellsPageBreaksGetVerticalPageBreak(name, sheetName, index,
						folder, null);

		// TODO: test validations
	}

	/**
	 * 
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void cellsPageBreaksGetVerticalPageBreaksTest() throws ApiException {
		String name = BOOK1;
		String sheetName = SHEET1;
		String folder = TEMPFOLDER;
		CellsApiUtil.Upload(api, folder, name);
		VerticalPageBreaksResponse response = api
				.cellsPageBreaksGetVerticalPageBreaks(name, sheetName, folder,
						null);

		// TODO: test validations
	}

	/**
	 * 
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void cellsPageBreaksPutHorizontalPageBreakTest() throws ApiException {
		String name = BOOK1;
		String sheetName = SHEET1;
		String cellname = CellName;
		Integer row = 1;
		Integer column = 1;
		Integer startColumn = 1;
		Integer endColumn = 1;
		String folder = TEMPFOLDER;
		CellsApiUtil.Upload(api, folder, name);
		CellsCloudResponse response = api
				.cellsPageBreaksPutHorizontalPageBreak(name, sheetName,
						cellname, row, column, startColumn, endColumn, folder,
						null);

		// TODO: test validations
	}

	/**
	 * 
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void cellsPageBreaksPutVerticalPageBreakTest() throws ApiException {
		String name = BOOK1;
		String sheetName = SHEET1;
		String cellname = CellName;
		Integer column = 1;
		Integer row = 1;
		Integer startRow = 1;
		Integer endRow = 1;
		String folder = TEMPFOLDER;
		CellsApiUtil.Upload(api, folder, name);
		CellsCloudResponse response = api.cellsPageBreaksPutVerticalPageBreak(
				name, sheetName, cellname, column, row, startRow, endRow,
				folder, null);

		// TODO: test validations
	}

}
