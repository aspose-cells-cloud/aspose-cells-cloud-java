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
import com.aspose.cloud.cells.model.LinkElement;
import com.aspose.cloud.cells.model.SaaSposeResponse;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * WorksheetReplaceResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-02T16:48:31.575+08:00")
public class WorksheetReplaceResponse extends SaaSposeResponse {
  @SerializedName("Matches")
  private Integer matches = null;

  @SerializedName("Worksheet")
  private LinkElement worksheet = null;

  public WorksheetReplaceResponse matches(Integer matches) {
    this.matches = matches;
    return this;
  }

   /**
   * Get matches
   * @return matches
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getMatches() {
    return matches;
  }

  public void setMatches(Integer matches) {
    this.matches = matches;
  }

  public WorksheetReplaceResponse worksheet(LinkElement worksheet) {
    this.worksheet = worksheet;
    return this;
  }

   /**
   * Get worksheet
   * @return worksheet
  **/
  @ApiModelProperty(value = "")
  public LinkElement getWorksheet() {
    return worksheet;
  }

  public void setWorksheet(LinkElement worksheet) {
    this.worksheet = worksheet;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorksheetReplaceResponse worksheetReplaceResponse = (WorksheetReplaceResponse) o;
    return Objects.equals(this.matches, worksheetReplaceResponse.matches) &&
        Objects.equals(this.worksheet, worksheetReplaceResponse.worksheet) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matches, worksheet, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorksheetReplaceResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    matches: ").append(toIndentedString(matches)).append("\n");
    sb.append("    worksheet: ").append(toIndentedString(worksheet)).append("\n");
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

