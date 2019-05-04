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
import com.aspose.cloud.cells.model.FileSource;
import com.aspose.cloud.cells.model.OperateObject;
import com.aspose.cloud.cells.model.OperateParameter;
import com.aspose.cloud.cells.model.TaskParameter;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CellsObjectOperateTaskParameter
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-02T16:48:31.575+08:00")
public class CellsObjectOperateTaskParameter extends TaskParameter {
  @SerializedName("OperateParameter")
  private OperateParameter operateParameter = null;

  @SerializedName("DestinationWorkbook")
  private FileSource destinationWorkbook = null;

  @SerializedName("OperateObject")
  private OperateObject operateObject = null;

  public CellsObjectOperateTaskParameter operateParameter(OperateParameter operateParameter) {
    this.operateParameter = operateParameter;
    return this;
  }

   /**
   * Get operateParameter
   * @return operateParameter
  **/
  @ApiModelProperty(value = "")
  public OperateParameter getOperateParameter() {
    return operateParameter;
  }

  public void setOperateParameter(OperateParameter operateParameter) {
    this.operateParameter = operateParameter;
  }

  public CellsObjectOperateTaskParameter destinationWorkbook(FileSource destinationWorkbook) {
    this.destinationWorkbook = destinationWorkbook;
    return this;
  }

   /**
   * Get destinationWorkbook
   * @return destinationWorkbook
  **/
  @ApiModelProperty(value = "")
  public FileSource getDestinationWorkbook() {
    return destinationWorkbook;
  }

  public void setDestinationWorkbook(FileSource destinationWorkbook) {
    this.destinationWorkbook = destinationWorkbook;
  }

  public CellsObjectOperateTaskParameter operateObject(OperateObject operateObject) {
    this.operateObject = operateObject;
    return this;
  }

   /**
   * Get operateObject
   * @return operateObject
  **/
  @ApiModelProperty(value = "")
  public OperateObject getOperateObject() {
    return operateObject;
  }

  public void setOperateObject(OperateObject operateObject) {
    this.operateObject = operateObject;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CellsObjectOperateTaskParameter cellsObjectOperateTaskParameter = (CellsObjectOperateTaskParameter) o;
    return Objects.equals(this.operateParameter, cellsObjectOperateTaskParameter.operateParameter) &&
        Objects.equals(this.destinationWorkbook, cellsObjectOperateTaskParameter.destinationWorkbook) &&
        Objects.equals(this.operateObject, cellsObjectOperateTaskParameter.operateObject) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operateParameter, destinationWorkbook, operateObject, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CellsObjectOperateTaskParameter {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    operateParameter: ").append(toIndentedString(operateParameter)).append("\n");
    sb.append("    destinationWorkbook: ").append(toIndentedString(destinationWorkbook)).append("\n");
    sb.append("    operateObject: ").append(toIndentedString(operateObject)).append("\n");
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

