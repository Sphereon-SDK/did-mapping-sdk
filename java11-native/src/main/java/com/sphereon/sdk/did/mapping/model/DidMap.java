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


package com.sphereon.sdk.did.mapping.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.sphereon.sdk.did.mapping.model.DidInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * DidMap
 */
@JsonPropertyOrder({
  DidMap.JSON_PROPERTY_APPLICATION_ID,
  DidMap.JSON_PROPERTY_DID_INFO,
  DidMap.JSON_PROPERTY_USER_ID
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-11-21T15:19:36.065206+01:00[Europe/Amsterdam]")
public class DidMap {
  public static final String JSON_PROPERTY_APPLICATION_ID = "applicationId";
  private String applicationId;

  public static final String JSON_PROPERTY_DID_INFO = "didInfo";
  private DidInfo didInfo;

  public static final String JSON_PROPERTY_USER_ID = "userId";
  private String userId;


  public DidMap applicationId(String applicationId) {
    
    this.applicationId = applicationId;
    return this;
  }

   /**
   * Get applicationId
   * @return applicationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_APPLICATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getApplicationId() {
    return applicationId;
  }


  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }


  public DidMap didInfo(DidInfo didInfo) {
    
    this.didInfo = didInfo;
    return this;
  }

   /**
   * Get didInfo
   * @return didInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DID_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DidInfo getDidInfo() {
    return didInfo;
  }


  public void setDidInfo(DidInfo didInfo) {
    this.didInfo = didInfo;
  }


  public DidMap userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DidMap didMap = (DidMap) o;
    return Objects.equals(this.applicationId, didMap.applicationId) &&
        Objects.equals(this.didInfo, didMap.didInfo) &&
        Objects.equals(this.userId, didMap.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationId, didInfo, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DidMap {\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    didInfo: ").append(toIndentedString(didInfo)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

