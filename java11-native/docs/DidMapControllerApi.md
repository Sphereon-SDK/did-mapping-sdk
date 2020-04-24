# DidMapControllerApi

All URIs are relative to *http://localhost:45647*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDidMap**](DidMapControllerApi.md#getDidMap) | **GET** /didmaps/{applicationId}/{userId} | Get a stored DID Map
[**storeDidMaps**](DidMapControllerApi.md#storeDidMaps) | **POST** /didmaps | Store DID Maps



## getDidMap

> DidMappingResponse getDidMap(applicationId, userId)

Get a stored DID Map

Retrieve a previously stored DID Map based of an App ID and User ID

### Example

```java
// Import classes:
import com.sphereon.sdk.did.mapping.handler.ApiClient;
import com.sphereon.sdk.did.mapping.handler.ApiException;
import com.sphereon.sdk.did.mapping.handler.Configuration;
import com.sphereon.sdk.did.mapping.handler.models.*;
import com.sphereon.sdk.did.mapping.api.DidMapControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:45647");

        DidMapControllerApi apiInstance = new DidMapControllerApi(defaultClient);
        String applicationId = "applicationId_example"; // String | applicationId
        String userId = "userId_example"; // String | userId
        try {
            DidMappingResponse result = apiInstance.getDidMap(applicationId, userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DidMapControllerApi#getDidMap");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **String**| applicationId |
 **userId** | **String**| userId |

### Return type

[**DidMappingResponse**](DidMappingResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Did Map found. |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Did Map not found. |  -  |


## storeDidMaps

> DidMappingResponse storeDidMaps(didMapRequest)

Store DID Maps

Submit a list of DID Maps, associating a User ID to the necessary DID information for authentication

### Example

```java
// Import classes:
import com.sphereon.sdk.did.mapping.handler.ApiClient;
import com.sphereon.sdk.did.mapping.handler.ApiException;
import com.sphereon.sdk.did.mapping.handler.Configuration;
import com.sphereon.sdk.did.mapping.handler.models.*;
import com.sphereon.sdk.did.mapping.api.DidMapControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:45647");

        DidMapControllerApi apiInstance = new DidMapControllerApi(defaultClient);
        DidMappingRequest didMapRequest = new DidMappingRequest(); // DidMappingRequest | didMapRequest
        try {
            DidMappingResponse result = apiInstance.storeDidMaps(didMapRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DidMapControllerApi#storeDidMaps");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **didMapRequest** | [**DidMappingRequest**](DidMappingRequest.md)| didMapRequest |

### Return type

[**DidMappingResponse**](DidMappingResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=UTF-8
- **Accept**: application/json;charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Did Maps stored. |  -  |
| **201** | Created |  -  |
| **400** | One or more DID Maps format invalid. |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

