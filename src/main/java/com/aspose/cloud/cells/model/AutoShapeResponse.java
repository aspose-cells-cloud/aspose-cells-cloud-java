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
import com.aspose.cloud.cells.model.AutoShape;
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
 * AutoShapeResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-04T14:16:31.808+08:00")
public class AutoShapeResponse extends SaaSposeResponse {
  @SerializedName("AutoShape")
  private AutoShape autoShape = null;

  public AutoShapeResponse autoShape(AutoShape autoShape) {
    this.autoShape = autoShape;
    return this;
  }

   /**
   * Get autoShape
   * @return autoShape
  **/
  @ApiModelProperty(value = "")
  public AutoShape getAutoShape() {
    return autoShape;
  }

  public void setAutoShape(AutoShape autoShape) {
    this.autoShape = autoShape;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoShapeResponse autoShapeResponse = (AutoShapeResponse) o;
    return Objects.equals(this.autoShape, autoShapeResponse.autoShape) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoShape, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutoShapeResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    autoShape: ").append(toIndentedString(autoShape)).append("\n");
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

