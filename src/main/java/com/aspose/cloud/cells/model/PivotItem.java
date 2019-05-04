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
 * PivotItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-02T16:48:31.575+08:00")
public class PivotItem {
  @SerializedName("Index")
  private Integer index = null;

  @SerializedName("IsHidden")
  private Boolean isHidden = null;

  @SerializedName("Name")
  private String name = null;

  public PivotItem index(Integer index) {
    this.index = index;
    return this;
  }

   /**
   * Get index
   * @return index
  **/
  @ApiModelProperty(value = "")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public PivotItem isHidden(Boolean isHidden) {
    this.isHidden = isHidden;
    return this;
  }

   /**
   * Represents whether the specified item visible.
   * @return isHidden
  **/
  @ApiModelProperty(value = "Represents whether the specified item visible.")
  public Boolean isIsHidden() {
    return isHidden;
  }

  public void setIsHidden(Boolean isHidden) {
    this.isHidden = isHidden;
  }

  public PivotItem name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Gets the name
   * @return name
  **/
  @ApiModelProperty(value = "Gets the name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PivotItem pivotItem = (PivotItem) o;
    return Objects.equals(this.index, pivotItem.index) &&
        Objects.equals(this.isHidden, pivotItem.isHidden) &&
        Objects.equals(this.name, pivotItem.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, isHidden, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PivotItem {\n");
    
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    isHidden: ").append(toIndentedString(isHidden)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

