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
import com.aspose.cloud.cells.model.SaaSposeResponse;
import com.aspose.cloud.cells.model.VerticalPageBreaks;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * VerticalPageBreaksResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-04T14:16:31.808+08:00")
public class VerticalPageBreaksResponse extends SaaSposeResponse {
  @SerializedName("VerticalPageBreaks")
  private VerticalPageBreaks verticalPageBreaks = null;

  public VerticalPageBreaksResponse verticalPageBreaks(VerticalPageBreaks verticalPageBreaks) {
    this.verticalPageBreaks = verticalPageBreaks;
    return this;
  }

   /**
   * Get verticalPageBreaks
   * @return verticalPageBreaks
  **/
  @ApiModelProperty(value = "")
  public VerticalPageBreaks getVerticalPageBreaks() {
    return verticalPageBreaks;
  }

  public void setVerticalPageBreaks(VerticalPageBreaks verticalPageBreaks) {
    this.verticalPageBreaks = verticalPageBreaks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerticalPageBreaksResponse verticalPageBreaksResponse = (VerticalPageBreaksResponse) o;
    return Objects.equals(this.verticalPageBreaks, verticalPageBreaksResponse.verticalPageBreaks) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(verticalPageBreaks, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerticalPageBreaksResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    verticalPageBreaks: ").append(toIndentedString(verticalPageBreaks)).append("\n");
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

