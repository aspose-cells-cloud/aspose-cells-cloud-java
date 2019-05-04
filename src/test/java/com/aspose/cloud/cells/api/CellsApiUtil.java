package com.aspose.cloud.cells.api;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.aspose.cloud.cells.client.ApiClient;
import com.aspose.cloud.cells.client.ApiException;
import com.aspose.cloud.cells.model.AccessTokenResponse;
import com.aspose.storage.api.*;


public class CellsApiUtil {
	private static String accesstoken;
	private static String grantType = "client_credentials";
	private static String clientId = "your sid";
	private static String clientSecret = "your key";
	private static String sourceFolder ="test data foler";
	public static String GetSourceFolder() {
		return sourceFolder;
	}
	public static String GetGrantType() {
		return grantType;
	}

	public static String GetClientId() {
		return clientId;
	}

	public static String GetClientSecret() {
		return clientSecret;
	}

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
	public static void Upload( String filename) {		
		StorageApi storageHelper = new StorageApi(clientSecret,clientId);
		File file = new File(sourceFolder + filename);
		storageHelper.PutCreate( filename, null, null, file);		
	}
	public static ApiClient Ready(String folder, String filename) {
		
		StorageApi storageHelper = new StorageApi(clientSecret,clientId);
		File file = new File(sourceFolder + filename);
		storageHelper.PutCreate(folder + "/" + filename, null, null, file);
		
		CellsTaskApi apiTask = new CellsTaskApi();
		ApiClient apiClient = new ApiClient();
		apiClient.setBasePath("https://api.aspose.cloud/v1.1");
		apiClient.addDefaultHeader("Authorization", "Bearer " + GetAccessToken());
		apiTask.setApiClient(apiClient);
		return apiClient;
	}
	public static byte[] GetFileData(String filename)	{		
        try {  
            File file = new File(GetSourceFolder() + filename);  
            FileInputStream fis = new FileInputStream(file);  
            ByteArrayOutputStream bos = new ByteArrayOutputStream(1000);  
            byte[] b = new byte[1000];  
            int n;  
            while ((n = fis.read(b)) != -1) {  
                bos.write(b, 0, n);  
            }  
            fis.close();  
            bos.close();  
            return bos.toByteArray();  
        } catch (FileNotFoundException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }
		return null;  
	}
	
}
