package com.aspose.cloud.cells.examples;

import java.io.File;

import com.aspose.cloud.cells.api.CellsTaskApi;
import com.aspose.cloud.cells.api.OAuthApi;
import com.aspose.cloud.cells.client.ApiClient;
import com.aspose.cloud.cells.client.ApiException;
import com.aspose.cloud.cells.model.AccessTokenResponse;

public class Base {
	private static String accesstoken;
	private static String grantType = "client_credentials";
	private static String clientId = "XXXXXXXXXXXXXXXXXXXXXXx";
	private static String clientSecret = "XXXXXXXXXXXXXXXXXXXXXx";
	
	protected String BOOK1 = "Book1.xlsx";
	protected String MYDOC = "myDocument.xlsx";
	protected String PivExampleFile = "TestCase.xlsx";
	protected String TEMPFOLDER = "";
	protected String SHEET1 = "Sheet1";
	protected String SHEET2 = "Sheet2";
	protected String SHEET3 = "Sheet3";
	protected String SHEET4 = "Sheet4";
	protected String SHEET5 = "Sheet5";
	protected String SHEET6 = "Sheet6";
	protected String SHEET7 = "Sheet7";
	protected String SHEET8 = "Sheet8";
	protected String CellName = "A1";
	protected String RANGE = "A1:C10";
	protected String CELLAREA = "A1:C10";
	
	public static String GetAccessToken() {
		
		try {
			if (accesstoken == null || accesstoken == "") {
				ApiClient apiClient = new ApiClient();
				apiClient.setBasePath("https://api.aspose.cloud/");
				OAuthApi oauth2 = new OAuthApi();
				oauth2.setApiClient(apiClient);
				AccessTokenResponse accessTokenResponse = oauth2.oAuthPost(grantType, clientId, clientSecret);
				accesstoken = accessTokenResponse.getAccessToken();
			}

		} catch (ApiException e) {
			e.printStackTrace();
		}
		return accesstoken;
	}

	protected void writeFileTo(File f) {
		
		
	}
	public static ApiClient Ready(String folder, String filename) {

		CellsTaskApi apiTask = new CellsTaskApi();
		ApiClient apiClient = new ApiClient();
		apiClient.setBasePath("https://api.aspose.cloud/v1.1");
		apiClient.addDefaultHeader("Authorization", "Bearer " + GetAccessToken());
		apiTask.setApiClient(apiClient);
		
		return apiClient;
	}
}
