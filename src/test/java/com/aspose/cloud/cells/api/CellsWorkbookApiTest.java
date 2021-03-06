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
import com.aspose.cloud.cells.model.AutoFitterOptions;
import com.aspose.cloud.cells.model.CalculationOptions;
import com.aspose.cloud.cells.model.ImportIntArrayOption;

import java.io.File;
import java.text.SimpleDateFormat;

import com.aspose.cloud.cells.model.ImportOption;
import com.aspose.cloud.cells.model.NameResponse;
import com.aspose.cloud.cells.model.NamesResponse;
import com.aspose.cloud.cells.model.PasswordRequest;
import com.aspose.cloud.cells.model.RangeValueResponse;
import com.aspose.cloud.cells.model.CellsCloudResponse;
import com.aspose.cloud.cells.model.SplitResultResponse;
import com.aspose.cloud.cells.model.StyleResponse;
import com.aspose.cloud.cells.model.TextItemsResponse;
import com.aspose.cloud.cells.model.WorkbookEncryptionRequest;
import com.aspose.cloud.cells.model.WorkbookProtectionRequest;
import com.aspose.cloud.cells.model.WorkbookReplaceResponse;
import com.aspose.cloud.cells.model.WorkbookResponse;
import com.aspose.cloud.cells.model.WorkbookSettings;
import com.aspose.cloud.cells.model.WorkbookSettingsResponse;

import org.junit.Test;
import org.junit.Ignore;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CellsWorkbookApi
 */

public class CellsWorkbookApiTest {

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

	public CellsWorkbookApiTest() {
		try {
			api = new CellsApi(CellsApiUtil.GetClientId(),CellsApiUtil.GetClientSecret(),CellsApiUtil.GetAPIVersion(),CellsApiUtil.GetBaseUrl());
		} catch (ApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Decrypt document.
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void cellsWorkbookDeleteDecryptDocumentTest() throws ApiException {
		String name = BOOK1;
		WorkbookEncryptionRequest encryption = new WorkbookEncryptionRequest();
		encryption.setEncryptionType("XOR");
		encryption.setKeyLength(128);
		encryption.setPassword("123456");
		String folder = TEMPFOLDER;
		CellsApiUtil.Upload(api, folder, name);
		CellsCloudResponse response = api.cellsWorkbookDeleteDecryptDocument(
				name, encryption, folder, null);

		// TODO: test validations
	}

	/**
	 * Unprotect document from changes.
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void cellsWorkbookDeleteDocumentUnprotectFromChangesTest()
			throws ApiException {
		String name = BOOK1;
		String folder = TEMPFOLDER;
		CellsApiUtil.Upload(api, folder, name);
		CellsCloudResponse response = api
				.cellsWorkbookDeleteDocumentUnprotectFromChanges(name, folder,
						null);

		// TODO: test validations
	}

	/**
	 * Unprotect document.
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void cellsWorkbookDeleteUnprotectDocumentTest() throws ApiException {
		String name = BOOK1;
		WorkbookProtectionRequest protection = new WorkbookProtectionRequest();
		protection.setProtectionType("All");
		protection.setPassword("123456");
		String folder = TEMPFOLDER;
		CellsApiUtil.Upload(api, folder, name);
		CellsCloudResponse response = api.cellsWorkbookDeleteUnprotectDocument(
				name, protection, folder, null);

		// TODO: test validations
	}

	/**
	 * Clean workbook&#39;s names.
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void cellsWorkbookDeleteWorkbookNameTest() throws ApiException {
		String name = BOOK1;
		String nameName = "Name_2";
		String folder = TEMPFOLDER;
		CellsApiUtil.Upload(api, folder, name);
		CellsCloudResponse response = api.cellsWorkbookDeleteWorkbookName(name,
				nameName, folder, null);
	}

	/**
	 * Clean workbook&#39;s names.
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void cellsWorkbookDeleteWorkbookNamesTest() throws ApiException {
		String name = BOOK1;
		String folder = TEMPFOLDER;
		CellsApiUtil.Upload(api, folder, name);
		CellsCloudResponse response = api.cellsWorkbookDeleteWorkbookNames(
				name, folder, null);
	}

	/**
	 * Read workbook info or export.
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void cellsWorkbookGetWorkbookTest() throws ApiException {
		String name = BOOK1;
		String password = null;
		Boolean isAutoFit = true;
		Boolean onlySaveTable = true;
		String format = "XPS";
		String folder = TEMPFOLDER;
		CellsApiUtil.Upload(api, folder, name);
		File response = api.cellsWorkbookGetWorkbook(name, password, format,
				isAutoFit, onlySaveTable, folder, null, null);

		// TODO: test validations
	}

	/**
	 * Read workbook info or export.
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void cellsWorkbookGetWorkbookForMDTest() throws ApiException {
		String name = BOOK1;
		String password = null;
		Boolean isAutoFit = true;
		Boolean onlySaveTable = true;
		String format = "md";
		String folder = TEMPFOLDER;
		CellsApiUtil.Upload(api, folder, name);
		File response = api.cellsWorkbookGetWorkbook(name, password, format,
				isAutoFit, onlySaveTable, folder, null, null);

		// TODO: test validations
	}

	/**
	 * Read workbook default style info.
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void cellsWorkbookGetWorkbookDefaultStyleTest() throws ApiException {
		String name = BOOK1;
		String folder = TEMPFOLDER;
		CellsApiUtil.Upload(api, folder, name);
		StyleResponse response = api.cellsWorkbookGetWorkbookDefaultStyle(name,
				folder, null);

		// TODO: test validations
	}

	/**
	 * Read workbook&#39;s name.
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void cellsWorkbookGetWorkbookNameTest() throws ApiException {
		String name = BOOK1;
		String nameName = "Name_2";
		String folder = TEMPFOLDER;
		CellsApiUtil.Upload(api, folder, name);
		NameResponse response = api.cellsWorkbookGetWorkbookName(name,
				nameName, folder, null);

		// TODO: test validations
	}

	/**
	 * Get workbook&#39;s name value.
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void cellsWorkbookGetWorkbookNameValueTest() throws ApiException {
		String name = BOOK1;
		String nameName = "Name_2";
		String folder = TEMPFOLDER;
		CellsApiUtil.Upload(api, folder, name);
		RangeValueResponse response = api.cellsWorkbookGetWorkbookNameValue(
				name, nameName, folder, null);

		// TODO: test validations
	}

	/**
	 * Read workbook&#39;s names.
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void cellsWorkbookGetWorkbookNamesTest() throws ApiException {
		String name = BOOK1;
		String folder = TEMPFOLDER;
		CellsApiUtil.Upload(api, folder, name);
		NamesResponse response = api.cellsWorkbookGetWorkbookNames(name,
				folder, null);

		// TODO: test validations
	}

	/**
	 * Read workbook&#39;s text items.
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void cellsWorkbookGetWorkbookTextItemsTest() throws ApiException {
		String name = BOOK1;
		String folder = TEMPFOLDER;
		CellsApiUtil.Upload(api, folder, name);
		TextItemsResponse response = api.cellsWorkbookGetWorkbookTextItems(
				name, folder, null);

		// TODO: test validations
	}

	/**
	 * Get Workbook Settings DTO
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void cellsWorkbookGetWorkbookSettingsTest() throws ApiException {
		String name = BOOK1;
		String folder = TEMPFOLDER;
		CellsApiUtil.Upload(api, folder, name);
		WorkbookSettingsResponse response = api
				.cellsWorkbookGetWorkbookSettings(name, folder, null);

		// TODO: test validations
	}

	/**
	 * Autofit workbook rows.
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void cellsWorkbookPostAutofitWorkbookRowsTest() throws ApiException {
		String name = BOOK1;
		AutoFitterOptions autoFitterOptions = null;
		Integer startRow = 1;
		Integer endRow = 100;
		Boolean onlyAuto = true;
		String folder = TEMPFOLDER;
		CellsApiUtil.Upload(api, folder, name);
		CellsCloudResponse response = api.cellsWorkbookPostAutofitWorkbookRows(
				name, autoFitterOptions, startRow, endRow, onlyAuto, folder,
				null);

		// TODO: test validations
	}
	/**
	 * Autofit workbook columns.
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void cellsWorkbookPostAutofitWorkbookColumnsTest() throws ApiException {
		String name = BOOK1;
		AutoFitterOptions autoFitterOptions = null;
		Integer startColumn = 1;
		Integer endColumn = 100;
		String folder = TEMPFOLDER;
		CellsApiUtil.Upload(api, folder, name);
		CellsCloudResponse response = api.cellsWorkbookPostAutofitWorkbookColumns(
				name, autoFitterOptions, startColumn, endColumn,  folder,
				null);

		// TODO: test validations
	}
	/**
	 * Encript document.
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void cellsWorkbookPostEncryptDocumentTest() throws ApiException {
		String name = BOOK1;
		WorkbookEncryptionRequest encryption = new WorkbookEncryptionRequest();
		encryption.setEncryptionType("XOR");
		encryption.setKeyLength(128);
		encryption.setPassword("123456");
		String folder = TEMPFOLDER;
		CellsApiUtil.Upload(api, folder, name);
		CellsCloudResponse response = api.cellsWorkbookPostEncryptDocument(
				name, encryption, folder, null);

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
	public void cellsWorkbookPostImportDataTest() throws ApiException {
		String name = BOOK1;
		ImportIntArrayOption data = new ImportIntArrayOption();
		data.setDestinationWorksheet(SHEET1);
		data.setFirstColumn(1);
		data.setFirstRow(3);
		data.setImportDataType("IntArray");
		data.setIsVertical(true);
		List<Integer> ld = new ArrayList<Integer>();
		ld.add(1);
		ld.add(2);
		ld.add(3);
		ld.add(4);
		data.setData(ld);
		String folder = TEMPFOLDER;
		CellsApiUtil.Upload(api, folder, name);
		CellsCloudResponse response = api.cellsWorkbookPostImportData(name,
				data, folder, null);

		// TODO: test validations
	}

	/**
	 * Protect document.
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void cellsWorkbookPostProtectDocumentTest() throws ApiException {
		String name = BOOK1;
		WorkbookProtectionRequest protection = new WorkbookProtectionRequest();
		protection.setProtectionType("All");
		protection.setPassword("123456");
		String folder = TEMPFOLDER;
		CellsApiUtil.Upload(api, folder, name);
		CellsCloudResponse response = api.cellsWorkbookPostProtectDocument(
				name, protection, folder, null);

		// TODO: test validations
	}

	/**
	 * Calculate all formulas in workbook.
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void cellsWorkbookPostWorkbookCalculateFormulaTest()
			throws ApiException {
		String name = BOOK1;
		CalculationOptions options = new CalculationOptions();
		options.setCalcStackSize(1);
		Boolean ignoreError = true;
		String folder = TEMPFOLDER;
		CellsApiUtil.Upload(api, folder, name);
		CellsCloudResponse response = api
				.cellsWorkbookPostWorkbookCalculateFormula(name, options,
						ignoreError, folder, null);

		// TODO: test validations
	}

	/**
	 * Smart marker processing result.
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void cellsWorkbookPostWorkbookGetSmartMarkerResultTest()
			throws ApiException {
		String name = BOOK1;
		String xmlFile = "ReportData.xml";
		;
		String folder = TEMPFOLDER;
		String outPath = null;
		CellsApiUtil.Upload(api, folder, name);
		CellsApiUtil.Upload(api, folder, xmlFile);
		File response = api.cellsWorkbookPostWorkbookGetSmartMarkerResult(name,
				folder +"/"+ xmlFile, folder, null, outPath);

		// TODO: test validations
	}

	/**
	 * Update Workbook setting
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void cellsWorkbookPostWorkbookSettingsTest() throws ApiException {
		String name = BOOK1;
		WorkbookSettings settings = new WorkbookSettings();
		settings.setAutoCompressPictures(true);
		String folder = TEMPFOLDER;
		CellsApiUtil.Upload(api, folder, name);
		CellsCloudResponse response = api.cellsWorkbookPostWorkbookSettings(
				name, settings, folder, null);

		// TODO: test validations
	}

	/**
	 * Split workbook.
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void cellsWorkbookPostWorkbookSplitTest() throws ApiException {
		String name = BOOK1;
		String format = "png";
		Integer from = 1;
		Integer to = 3;
		Integer horizontalResolution = 100;
		Integer verticalResolution = 90;
		String folder = TEMPFOLDER;
		CellsApiUtil.Upload(api, folder, name);
		SplitResultResponse response = api.cellsWorkbookPostWorkbookSplit(name,
				format, from, to, horizontalResolution, verticalResolution,
				folder, folder, null);

		// TODO: test validations
	}

	/**
	 * Merge workbooks.
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void cellsWorkbookPostWorkbooksMergeTest() throws ApiException {
		String name = BOOK1;
		String mergeWith = "myDocument.xlsx";
		String folder = TEMPFOLDER;
		CellsApiUtil.Upload(api, folder, name);
		CellsApiUtil.Upload(api, folder, mergeWith);
		WorkbookResponse response = api.cellsWorkbookPostWorkbooksMerge(name,
				folder + "/" + mergeWith, folder, null);

		// TODO: test validations
	}

	/**
	 * Replace text.
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void cellsWorkbookPostWorkbooksTextReplaceTest() throws ApiException {
		String name = BOOK1;
		String oldValue = "!22";
		String newValue = "22";
		String folder = TEMPFOLDER;
		CellsApiUtil.Upload(api, folder, name);
		WorkbookReplaceResponse response = api
				.cellsWorkbookPostWorkbooksTextReplace(name, oldValue,
						newValue, folder, null);

		// TODO: test validations
	}

	/**
	 * Search text.
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void cellsWorkbookPostWorkbooksTextSearchTest() throws ApiException {
		String name = BOOK1;
		String text = "test";
		String folder = TEMPFOLDER;
		CellsApiUtil.Upload(api, folder, name);
		TextItemsResponse response = api.cellsWorkbookPostWorkbooksTextSearch(
				name, text, folder, null);

		// TODO: test validations
	}

	/**
	 * Convert workbook from request content to some format.
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void cellsWorkbookPutConvertWorkbookTest() throws ApiException {
		String format = "pdf";
		String password = null;
		String outPath = null;
		String name = BOOK1;
		String folder = TEMPFOLDER;
		CellsApiUtil.Upload(api, folder, name);
		File response = api.cellsWorkbookPutConvertWorkbook(
				CellsApiUtil.GetFileHolder(name), format, password, outPath);
		
		// TODO: test validations
	}

	/**
	 * Protect document from changes.
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void cellsWorkbookPutDocumentProtectFromChangesTest()
			throws ApiException {
		String name = BOOK1;
		PasswordRequest password = new PasswordRequest();
		password.setPassword("123456");
		String folder = TEMPFOLDER;
		CellsApiUtil.Upload(api, folder, name);
		CellsCloudResponse response = api
				.cellsWorkbookPutDocumentProtectFromChanges(name, password,
						folder, null);

		// TODO: test validations
	}

	/**
	 * Create new workbook using deferent methods.
	 *
	 * 
	 *
	 * @throws ApiException
	 *             if the Api call fails
	 */
	@Test
	public void cellsWorkbookPutWorkbookCreateTest() throws ApiException {
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
		String name = "NewBook_" + df.format(new Date()) + ".xlsx";
		String templateFile = BOOK1;
		String dataFile = "ReportData.xml";
		String folder = TEMPFOLDER;
		CellsApiUtil.Upload(api, folder, dataFile);
		CellsApiUtil.Upload(api, folder, templateFile);
		WorkbookResponse response = api.cellsWorkbookPutWorkbookCreate(name,
				folder + "/" + templateFile, folder + "/" + dataFile, true,
				folder, null);

		// TODO: test validations
	}

	@Test
	public void cellsWorkbookDeleteBackgroupTest() throws ApiException {
		String name = BOOK1;
		String folder = TEMPFOLDER;
		CellsApiUtil.Upload(api, folder, name);
		CellsCloudResponse response = api
				.cellsWorkbookDeleteWorkbookBackground(name, folder, null);
	}

	@Test
	public void cellsWorkbookPutBackgroupTest() throws ApiException {
		String name = BOOK1;
		String folder = TEMPFOLDER;
		CellsApiUtil.Upload(api, folder, name);
		byte[] png = CellsApiUtil.GetFileData("WaterMark.png");
		CellsCloudResponse response = api.cellsWorkbookPutWorkbookBackground(
				name, png, folder, null);
	}
}
