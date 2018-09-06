/*
 * Web API Swagger specification
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.aspose.cloud.cells.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SortKey
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-05T14:42:39.608+08:00")
public class SortKey {
  @SerializedName("CustomList")
  private String customList = null;

  @SerializedName("SortOrder")
  private String sortOrder = null;

  @SerializedName("Key")
  private Integer key = null;

  public SortKey customList(String customList) {
    this.customList = customList;
    return this;
  }

   /**
   * Get customList
   * @return customList
  **/
  @ApiModelProperty(value = "")
  public String getCustomList() {
    return customList;
  }

  public void setCustomList(String customList) {
    this.customList = customList;
  }

  public SortKey sortOrder(String sortOrder) {
    this.sortOrder = sortOrder;
    return this;
  }

   /**
   * Get sortOrder
   * @return sortOrder
  **/
  @ApiModelProperty(value = "")
  public String getSortOrder() {
    return sortOrder;
  }

  public void setSortOrder(String sortOrder) {
    this.sortOrder = sortOrder;
  }

  public SortKey key(Integer key) {
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getKey() {
    return key;
  }

  public void setKey(Integer key) {
    this.key = key;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SortKey sortKey = (SortKey) o;
    return Objects.equals(this.customList, sortKey.customList) &&
        Objects.equals(this.sortOrder, sortKey.sortOrder) &&
        Objects.equals(this.key, sortKey.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customList, sortOrder, key);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SortKey {\n");
    
    sb.append("    customList: ").append(toIndentedString(customList)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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

