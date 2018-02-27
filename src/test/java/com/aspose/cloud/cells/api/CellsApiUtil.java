package com.aspose.cloud.cells.api;

import com.aspose.cloud.cells.client.ApiClient;
import com.aspose.cloud.cells.client.ApiException;
import com.aspose.cloud.cells.model.AccessTokenResponse;
import com.aspose.cloud.cells.model.CellsObjectOperateTaskParameter;
import com.aspose.cloud.cells.model.FileSource;
import com.aspose.cloud.cells.model.OperateObject;
import com.aspose.cloud.cells.model.OperateObjectPosition;
import com.aspose.cloud.cells.model.ResultDestination;
import com.aspose.cloud.cells.model.SaveResultTaskParameter;
import com.aspose.cloud.cells.model.TaskData;
import com.aspose.cloud.cells.model.TaskDescription;
import com.aspose.cloud.cells.model.WorkbookSettings;
import com.aspose.cloud.cells.model.WorkbookSettingsOperateParameter;

public class CellsApiUtil {
	private static String accesstoken;
	private static String grantType = "client_credentials";
	private static String clientId = "your clientId";
	private static String clientSecret = "your clientSecret";

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

	public static ApiClient Ready(String folder, String filename) {
		TaskData taskdata = new TaskData();
		TaskDescription task1 = new TaskDescription();
		task1.setTaskType("CellsObjectOperate");
		CellsObjectOperateTaskParameter param1 = new CellsObjectOperateTaskParameter();
		OperateObject optObject = new OperateObject();
		optObject.setOperateObjectType("WorkbookSettings");
		OperateObjectPosition p = new OperateObjectPosition();
		FileSource fileSource = new FileSource();
		fileSource.setFilePath(filename);
		fileSource.setFileSourceType("CloudFileSystem");
		p.setWorkbook(fileSource);
		optObject.setPosition(p);
		param1.setOperateObject(optObject);
		FileSource fileDestinatio = new FileSource();
		fileDestinatio.setFilePath(filename);
		fileDestinatio.setFileSourceType("InMemoryFiles");
		param1.setDestinationWorkbook(fileDestinatio);
		WorkbookSettingsOperateParameter oparam1 = new WorkbookSettingsOperateParameter();
		WorkbookSettings setting = new WorkbookSettings();
		setting.setAutoCompressPictures(true);
		oparam1.setWorkbookSettings(setting);
		oparam1.setOperateType("Update");
		param1.setOperateParameter(oparam1);
		task1.setTaskParameter(param1);
		taskdata.addTasksItem(task1);

		TaskDescription task2 = new TaskDescription();
		task2.setTaskType("SaveResult");
		SaveResultTaskParameter param2 = new SaveResultTaskParameter();
		param2.setResultSource("InMemoryFiles");
		ResultDestination result = new ResultDestination();
		result.setDestinationType("CloudFileSystem");
		result.setInputFile(filename);
		result.setOutputFile(folder + "/" + filename);
		param2.setResultDestination(result);
		task2.setTaskParameter(param2);
		taskdata.addTasksItem(task2);

		CellsTaskApi apiTask = new CellsTaskApi();
		ApiClient apiClient = new ApiClient();
		apiClient.setBasePath("https://api.aspose.cloud/v1.1");
		apiClient.addDefaultHeader("Authorization", "Bearer " + GetAccessToken());
		apiTask.setApiClient(apiClient);
		try {
			apiTask.cellsTaskPostRunTask(taskdata);
		} catch (ApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return apiClient;
	}
}
