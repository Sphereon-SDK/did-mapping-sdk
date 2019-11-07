/*
 * Did Mapping MS
 * A microservice for storing associations between user IDs and DIDs for applications that want to use DID-Auth
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.sphereon.sdk.did.mapping.api;

import com.sphereon.sdk.did.mapping.handler.ApiClient;
import com.sphereon.sdk.did.mapping.handler.ApiException;
import com.sphereon.sdk.did.mapping.handler.Pair;

import com.sphereon.sdk.did.mapping.model.DidMappingRequest;
import com.sphereon.sdk.did.mapping.model.DidMappingResponse;
import com.sphereon.sdk.did.mapping.model.ExceptionResponseBody;
import com.sphereon.sdk.did.mapping.model.ResponseEntity;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.function.Consumer;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.List;
import java.util.Map;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-11-06T11:11:43.575532+01:00[Europe/Amsterdam]")
public class DidMapControllerApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;

  public DidMapControllerApi() {
    this(new ApiClient());
  }

  public DidMapControllerApi(ApiClient apiClient) {
    memberVarHttpClient = apiClient.getHttpClient();
    memberVarObjectMapper = apiClient.getObjectMapper();
    memberVarBaseUri = apiClient.getBaseUri();
    memberVarInterceptor = apiClient.getRequestInterceptor();
    memberVarReadTimeout = apiClient.getReadTimeout();
  }

  /**
   * Get a stored DID Map
   * Submit a list of DID Maps, associating a User ID to the necessary DID information for authentication
   * @param applicationId applicationId (required)
   * @param userId userId (required)
   * @return ResponseEntity
   * @throws ApiException if fails to make API call
   */
  public ResponseEntity storeDidMaps(String applicationId, String userId) throws ApiException {
    // verify the required parameter 'applicationId' is set
    if (applicationId == null) {
      throw new ApiException(400, "Missing the required parameter 'applicationId' when calling storeDidMaps");
    }
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling storeDidMaps");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/didmaps/{applicationId}/{userId}"
        .replace("{applicationId}", ApiClient.urlEncode(applicationId.toString()))
        .replace("{userId}", ApiClient.urlEncode(userId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

    try {
      localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }

      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (localVarResponse.statusCode()/ 100 != 2) {
        throw new ApiException(localVarResponse.statusCode(),
            "storeDidMaps call received non-success response",
            localVarResponse.headers(),
            localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }

      return memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<ResponseEntity>() {});
    } catch (IOException | InterruptedException e) {
      throw new ApiException(e);
    }
  }
  /**
   * Store DID Maps
   * Submit a list of DID Maps, associating a User ID to the necessary DID information for authentication
   * @param didMapRequest didMapRequest (required)
   * @return DidMappingResponse
   * @throws ApiException if fails to make API call
   */
  public DidMappingResponse storeDidMaps1(DidMappingRequest didMapRequest) throws ApiException {
    // verify the required parameter 'didMapRequest' is set
    if (didMapRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'didMapRequest' when calling storeDidMaps1");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/didmaps";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(didMapRequest);
      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }

      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (localVarResponse.statusCode()/ 100 != 2) {
        throw new ApiException(localVarResponse.statusCode(),
            "storeDidMaps1 call received non-success response",
            localVarResponse.headers(),
            localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }

      return memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<DidMappingResponse>() {});
    } catch (IOException | InterruptedException e) {
      throw new ApiException(e);
    }
  }
}
