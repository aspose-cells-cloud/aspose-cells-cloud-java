/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="CellsApiUtil.java.java">
 *   Copyright (c) 2023 Aspose.Cells Cloud
 * </copyright>
 * <summary>
 *   Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 * 
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 * 
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------
 */

package com.aspose.cloud.cells.api;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import com.aspose.cloud.cells.client.*;
import com.aspose.cloud.cells.model.*;
import com.aspose.cloud.cells.request.*;

public class CellsApiUtil {
	private static String grantType = "client_credentials";
	private static String clientId = "";
	private static String clientSecret =  "";
	private static String sourceFolder ="TestData\\";
	public static String GetSourceFolder() {
		String  envSourceFlder = System.getenv("CellsCloudTestDataFolder");
		if(envSourceFlder != "" && envSourceFlder!=null){
			File dir = new File(envSourceFlder);
			if(dir.exists()){
				System.out.println(envSourceFlder);
				return envSourceFlder;
			}
		}
		System.out.println(sourceFolder);
		File dir = new File(sourceFolder);
		if(dir.exists()){
			return sourceFolder;
		}
		return System.getProperty("user.dir") + sourceFolder;
	}
	public static String GetGrantType() {
		return grantType;
	}

	public static String GetClientId() {
		return System.getenv("CellsCloudTestClientId");
	}

	public static String GetClientSecret() {
		return System.getenv("CellsCloudTestClientSecret");
	}

	public static String GetAPIVersion() {
		return "v3.0";
	}
	public static String GetBaseUrl() {
		String apiUrl =  System.getenv("CellsCloudTestApiBaseUrl");
		if( apiUrl==null || apiUrl.isEmpty()){
			return "https://api-qa.aspose.cloud";
		}
		return apiUrl;
	}
	public static Boolean IsDockerTest(){		
		return (System.getenv("CellsCloudTestIsDockerTest").toLowerCase() == "true");
	}
	public static void Upload(CellsApi cellsApi,String remotePath ,String localFilename,String storageName) {		
		File file = new File(GetSourceFolder() + localFilename);
		try {
			UploadFileRequest  uploadFileRequest = new UploadFileRequest();
			uploadFileRequest.setPath(remotePath);
			uploadFileRequest.setStorageName(storageName);
			HashMap<String,File> files = new HashMap<String,File>();
			files.put(localFilename, file);
			uploadFileRequest.setUploadFiles(files);
			cellsApi.uploadFile(uploadFileRequest);
		} catch (ApiException | IOException e) {
			e.printStackTrace();
		}		
	}
	public static void UploadToStorage(CellsApi cellsApi,String folder ,String filename,String localFilename,String storageName) {		
		File file = new File(GetSourceFolder()+ localFilename);
		try {
			UploadFileRequest  uploadFileRequest = new UploadFileRequest();
			uploadFileRequest.setPath(folder +"\\" + filename);
			uploadFileRequest.setStorageName(storageName);
			HashMap<String,File> files = new HashMap<String,File>();
			files.put(filename, file);
			uploadFileRequest.setUploadFiles(files);
			cellsApi.uploadFile(uploadFileRequest);
		} catch (ApiException | IOException e) {
			e.printStackTrace();
		}		
	}
	public static void Upload(CellsApi cellsApi,String remotePath,String localFilename) {		
		File file = new File(GetSourceFolder() + localFilename);
		try {
			UploadFileRequest  uploadFileRequest = new UploadFileRequest();
			uploadFileRequest.setPath( remotePath);
			HashMap<String,File> files = new  HashMap<String,File>();
			files.put(localFilename, file);
			uploadFileRequest.setUploadFiles(files);
			cellsApi.uploadFile(uploadFileRequest);
		} catch (ApiException | IOException e) {
			e.printStackTrace();
		}		
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

	public static File GetFileHolder(String filename)	{		
		File file = new File(GetSourceFolder() + filename);  
        return file;
	}

}
