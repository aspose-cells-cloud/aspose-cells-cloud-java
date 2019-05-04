package com.aspose.cloud.cells.examples.workbook;


import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.aspose.cloud.cells.api.CellsWorkbookApi;
import com.aspose.cloud.cells.client.ApiException;
import com.aspose.cloud.cells.examples.Base;
import com.aspose.cloud.cells.model.AutoFitterOptions;
import com.aspose.cloud.cells.model.CalculationOptions;
import com.aspose.cloud.cells.model.ImportIntArrayOption;
import com.aspose.cloud.cells.model.NameResponse;
import com.aspose.cloud.cells.model.NamesResponse;
import com.aspose.cloud.cells.model.PasswordRequest;
import com.aspose.cloud.cells.model.RangeValueResponse;
import com.aspose.cloud.cells.model.SaaSposeResponse;
import com.aspose.cloud.cells.model.SplitResultResponse;
import com.aspose.cloud.cells.model.StyleResponse;
import com.aspose.cloud.cells.model.TextItemsResponse;
import com.aspose.cloud.cells.model.WorkbookEncryptionRequest;
import com.aspose.cloud.cells.model.WorkbookProtectionRequest;
import com.aspose.cloud.cells.model.WorkbookReplaceResponse;
import com.aspose.cloud.cells.model.WorkbookResponse;
import com.aspose.cloud.cells.model.WorkbookSettings;
import com.aspose.cloud.cells.model.WorkbookSettingsResponse;

public class CellsWorkbookApiExamples extends Base{

    private final CellsWorkbookApi api = new CellsWorkbookApi();

  
	

    public void cellsWorkbookDeleteDecryptDocumentExample() throws ApiException {
       String name = BOOK1;
        WorkbookEncryptionRequest encryption = new WorkbookEncryptionRequest();
        encryption.setEncryptionType("XOR");
        encryption.setKeyLength(128);
        encryption.setPassword("123456");
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        SaaSposeResponse response = api.cellsWorkbookDeleteDecryptDocument(name, encryption, folder,null);


		System.out.println(response);
    }
    

    public void cellsWorkbookDeleteDocumentUnprotectFromChangesExample() throws ApiException {
       String name = BOOK1;
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        SaaSposeResponse response = api.cellsWorkbookDeleteDocumentUnprotectFromChanges(name, folder,null);


		System.out.println(response.getCode());
    }
    

    public void cellsWorkbookDeleteUnprotectDocumentExample() throws ApiException {
       String name = BOOK1;
        WorkbookProtectionRequest protection = new WorkbookProtectionRequest();
        protection.setProtectionType("All");
        protection.setPassword("123456");
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        SaaSposeResponse response = api.cellsWorkbookDeleteUnprotectDocument(name, protection, folder,null);


		System.out.println(response.getCode());
    }
    

    public void cellsWorkbookDeleteWorkbookNameExample() throws ApiException {
        String name = BOOK1;
        String nameName = "Name_2";
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        SaaSposeResponse response = api.cellsWorkbookDeleteWorkbookName(name, nameName, folder,null);

		System.out.println(response.getCode());
    }

    public void cellsWorkbookDeleteWorkbookNamesExample() throws ApiException {
        String name = BOOK1;
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        SaaSposeResponse response = api.cellsWorkbookDeleteWorkbookNames(name, folder,null);

		System.out.println(response.getCode());
    }
    

    public void cellsWorkbookGetWorkbookExample() throws ApiException {
       String name = BOOK1;
        String password = null;
        Boolean isAutoFit = true;
        Boolean onlySaveTable = true;
        String format = "XPS";
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        File response = api.cellsWorkbookGetWorkbook(name, password, format, isAutoFit, onlySaveTable, folder,null,null);
        writeFileTo(response);


    }
    

    public void cellsWorkbookGetWorkbookDefaultStyleExample() throws ApiException {
       String name = BOOK1;
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        StyleResponse response = api.cellsWorkbookGetWorkbookDefaultStyle(name, folder,null);


		System.out.println(response.getCode());
    }

    public void cellsWorkbookGetWorkbookNameExample() throws ApiException {
       String name = BOOK1;
        String nameName =  "Name_2";
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        NameResponse response = api.cellsWorkbookGetWorkbookName(name, nameName, folder,null);


		System.out.println(response.getCode());
    }
    

    public void cellsWorkbookGetWorkbookNameValueExample() throws ApiException {
        String name = BOOK1;
        String nameName = "Name_2";
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        RangeValueResponse response = api.cellsWorkbookGetWorkbookNameValue(name, nameName, folder,null);


		System.out.println(response.getCode());
    }
    

    public void cellsWorkbookGetWorkbookNamesExample() throws ApiException {
       String name = BOOK1;
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        NamesResponse response = api.cellsWorkbookGetWorkbookNames(name, folder,null);


		System.out.println(response.getCode());
    }

    public void cellsWorkbookGetWorkbookTextItemsExample() throws ApiException {
       String name = BOOK1;
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        TextItemsResponse response = api.cellsWorkbookGetWorkbookTextItems(name, folder,null);


		System.out.println(response.getCode());
    }
    

    public void cellsWorkbookGetWorkbookSettingsExample() throws ApiException {
       String name = BOOK1;
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        WorkbookSettingsResponse response = api.cellsWorkbookGetWorkbookSettings(name, folder,null);


		System.out.println(response.getCode());
    }
    

    public void cellsWorkbookPostAutofitWorkbookRowsExample() throws ApiException {
       String name = BOOK1;
        AutoFitterOptions autoFitterOptions = null;
        Integer startRow = 1;
        Integer endRow = 100;
        Boolean onlyAuto = true;
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        SaaSposeResponse response = api.cellsWorkbookPostAutofitWorkbookRows(name, autoFitterOptions, startRow, endRow, onlyAuto, folder,null);


		System.out.println(response.getCode());
    }
    

    public void cellsWorkbookPostEncryptDocumentExample() throws ApiException {
       String name = BOOK1;
        WorkbookEncryptionRequest encryption = new WorkbookEncryptionRequest();
        encryption.setEncryptionType("XOR");
        encryption.setKeyLength(128);
        encryption.setPassword("123456");
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        SaaSposeResponse response = api.cellsWorkbookPostEncryptDocument(name, encryption, folder,null);


		System.out.println(response.getCode());
    }
    
    public void cellsWorkbookPostImportDataExample() throws ApiException {
       String name = BOOK1;
       ImportIntArrayOption data = new ImportIntArrayOption();
       data.setDestinationWorksheet ( SHEET1);
       data.setFirstColumn ( 1);
       data.setFirstRow ( 3);
       data.setImportDataType ( "IntArray");
       data.setIsVertical ( true);
       List<Integer> ld = new ArrayList<Integer>();
       ld.add(1);ld.add(2);ld.add(3);ld.add(4);
       data.setData(ld);
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        SaaSposeResponse response = api.cellsWorkbookPostImportData(name, data, folder,null);


		System.out.println(response.getCode());
    }
    

    public void cellsWorkbookPostProtectDocumentExample() throws ApiException {
       String name = BOOK1;
        WorkbookProtectionRequest protection = new WorkbookProtectionRequest();
        protection.setProtectionType("All");
        protection.setPassword("123456");
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        SaaSposeResponse response = api.cellsWorkbookPostProtectDocument(name, protection, folder,null);


		System.out.println(response.getCode());
    }
    

    public void cellsWorkbookPostWorkbookCalculateFormulaExample() throws ApiException {
       String name = BOOK1;
        CalculationOptions options = new CalculationOptions();
        options.setCalcStackSize(1);
        Boolean ignoreError = true;
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        SaaSposeResponse response = api.cellsWorkbookPostWorkbookCalculateFormula(name, options, ignoreError, folder,null);


		System.out.println(response.getCode());
    }
    

    public void cellsWorkbookPostWorkbookGetSmartMarkerResultExample() throws ApiException {
       String name = BOOK1;
        String xmlFile = "ReportData.xml";;
        String folder = TEMPFOLDER;
        String outPath = null;
		api.setApiClient( Base.Ready(folder, name));
        File response = api.cellsWorkbookPostWorkbookGetSmartMarkerResult(name, xmlFile, folder,null, outPath);
        writeFileTo(response);


    }
    

    public void cellsWorkbookPostWorkbookSettingsExample() throws ApiException {
       String name = BOOK1;
        WorkbookSettings settings = new WorkbookSettings();
        settings.setAutoCompressPictures(true);
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        SaaSposeResponse response = api.cellsWorkbookPostWorkbookSettings(name, settings, folder,null);


		System.out.println(response.getCode());
    }
    

    public void cellsWorkbookPostWorkbookSplitExample() throws ApiException {
       String name = BOOK1;
        String format =  "png";
        Integer from = 1;
        Integer to = 3;
        Integer horizontalResolution = 100;
        Integer verticalResolution = 90;
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        SplitResultResponse response = api.cellsWorkbookPostWorkbookSplit(name, format, from, to, horizontalResolution, verticalResolution, folder,null);


		System.out.println(response.getCode());
    }

    public void cellsWorkbookPostWorkbooksMergeExample() throws ApiException {
       String name = BOOK1;
        String mergeWith = "myDocument.xlsx";
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        WorkbookResponse response = api.cellsWorkbookPostWorkbooksMerge(name, mergeWith, folder,null);


		System.out.println(response.getCode());
    }
    

    public void cellsWorkbookPostWorkbooksTextReplaceExample() throws ApiException {
       String name = BOOK1;
        String oldValue =  "!22";
        String newValue =  "22";
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        WorkbookReplaceResponse response = api.cellsWorkbookPostWorkbooksTextReplace(name, oldValue, newValue, folder,null);


		System.out.println(response.getCode());
    }
    

    public void cellsWorkbookPostWorkbooksTextSearchExample() throws ApiException {
       String name = BOOK1;
        String text ="Example";
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        TextItemsResponse response = api.cellsWorkbookPostWorkbooksTextSearch(name, text, folder,null);


		System.out.println(response.getCode());
    }
    

  

    public void cellsWorkbookPutDocumentProtectFromChangesExample() throws ApiException {
       String name = BOOK1;
        PasswordRequest password = new PasswordRequest();
        password.setPassword("123456");
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        SaaSposeResponse response = api.cellsWorkbookPutDocumentProtectFromChanges(name, password, folder,null);

        System.out.println(response);

    }

    public void cellsWorkbookPutWorkbookCreateExample() throws ApiException {
    	SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
        String name ="NewBook_"+df.format(new Date())+".xlsx" ;
        String templateFile =  BOOK1;
        String dataFile ="ReportData.xml";
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        WorkbookResponse response = api.cellsWorkbookPutWorkbookCreate(name,   templateFile,  dataFile, folder,null);


		System.out.println(response.getCode());
    }
    
}