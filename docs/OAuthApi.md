# OAuthApi

All URIs are relative to *https://api.aspose.cloud/v1.1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**oAuthPost**](OAuthApi.md#oAuthPost) | **POST** /oauth2/token | Get Access token


<a name="oAuthPost"></a>
# **oAuthPost**
> AccessTokenResponse oAuthPost(grantType, clientId, clientSecret)

Get Access token

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.OAuthApi;


OAuthApi apiInstance = new OAuthApi();
String grantType = "grantType_example"; // String | Grant Type
String clientId = "clientId_example"; // String | App SID
String clientSecret = "clientSecret_example"; // String | App Key
try {
    AccessTokenResponse result = apiInstance.oAuthPost(grantType, clientId, clientSecret);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthApi#oAuthPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **grantType** | **String**| Grant Type |
 **clientId** | **String**| App SID |
 **clientSecret** | **String**| App Key |

### Return type

[**AccessTokenResponse**](AccessTokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

