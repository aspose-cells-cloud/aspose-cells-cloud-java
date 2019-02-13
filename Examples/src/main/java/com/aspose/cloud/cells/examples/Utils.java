package com.aspose.cloud.cells.examples;

import com.aspose.cloud.cells.api.CellsTaskApi;
import com.aspose.cloud.cells.api.OAuthApi;
import com.aspose.cloud.cells.client.ApiClient;
import com.aspose.cloud.cells.client.ApiException;
import com.aspose.cloud.cells.model.AccessTokenResponse;

public class Utils {
	private static String accesstoken;
	private static String grantType = "client_credentials";
	private static String clientId = "xxxxx-xxxx-xxxx-xxxx-xxxxxxx";
	private static String clientSecret = "xxxxxxxxxxxxxxxxxxx";
	public static String GetAccessToken() {
		
		try {
			if (accesstoken == null || accesstoken == "") {
				System.out.println("--------------------------");
				ApiClient apiClient = new ApiClient();
				apiClient.setBasePath("https://api.aspose.cloud/");
				OAuthApi oauth2 = new OAuthApi();
				oauth2.setApiClient(apiClient);
				AccessTokenResponse accessTokenResponse = oauth2.oAuthPost(grantType, clientId, clientSecret);
				accesstoken = accessTokenResponse.getAccessToken();
			}

		} catch (ApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return accesstoken;
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
