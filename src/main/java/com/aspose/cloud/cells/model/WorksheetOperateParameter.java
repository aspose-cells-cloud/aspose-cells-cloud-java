/* 
 * <summary>
 *  Copyright (c) 2021 Aspose.Cells Cloud
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 * 
 *  The above copyright notice and this permission notice shall be included in all 
 *  copies or substantial portions of the Software.
 * 
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 */


package com.aspose.cloud.cells.model;

import java.util.Objects;
import com.aspose.cloud.cells.model.OperateParameter;
import com.aspose.cloud.cells.model.WorksheetMovingRequest;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * WorksheetOperateParameter
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-17T20:48:47.090-05:00")
public class WorksheetOperateParameter extends OperateParameter {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("SheetType")
  private String sheetType = null;

  @SerializedName("NewName")
  private String newName = null;

  @SerializedName("MovingRequest")
  private WorksheetMovingRequest movingRequest = null;

  public WorksheetOperateParameter name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public WorksheetOperateParameter sheetType(String sheetType) {
    this.sheetType = sheetType;
    return this;
  }

   /**
   * Get sheetType
   * @return sheetType
  **/
  @ApiModelProperty(value = "")
  public String getSheetType() {
    return sheetType;
  }

  public void setSheetType(String sheetType) {
    this.sheetType = sheetType;
  }

  public WorksheetOperateParameter newName(String newName) {
    this.newName = newName;
    return this;
  }

   /**
   * Get newName
   * @return newName
  **/
  @ApiModelProperty(value = "")
  public String getNewName() {
    return newName;
  }

  public void setNewName(String newName) {
    this.newName = newName;
  }

  public WorksheetOperateParameter movingRequest(WorksheetMovingRequest movingRequest) {
    this.movingRequest = movingRequest;
    return this;
  }

   /**
   * Get movingRequest
   * @return movingRequest
  **/
  @ApiModelProperty(value = "")
  public WorksheetMovingRequest getMovingRequest() {
    return movingRequest;
  }

  public void setMovingRequest(WorksheetMovingRequest movingRequest) {
    this.movingRequest = movingRequest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorksheetOperateParameter worksheetOperateParameter = (WorksheetOperateParameter) o;
    return Objects.equals(this.name, worksheetOperateParameter.name) &&
        Objects.equals(this.sheetType, worksheetOperateParameter.sheetType) &&
        Objects.equals(this.newName, worksheetOperateParameter.newName) &&
        Objects.equals(this.movingRequest, worksheetOperateParameter.movingRequest) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, sheetType, newName, movingRequest, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorksheetOperateParameter {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sheetType: ").append(toIndentedString(sheetType)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
    sb.append("    movingRequest: ").append(toIndentedString(movingRequest)).append("\n");
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

