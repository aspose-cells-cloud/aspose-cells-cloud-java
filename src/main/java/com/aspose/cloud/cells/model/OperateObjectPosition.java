/* 
 * <summary>
 *  Copyright (c) 2020 Aspose.Cells Cloud
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
import com.aspose.cloud.cells.model.FileSource;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * OperateObjectPosition
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-18T15:44:17.049+08:00")
public class OperateObjectPosition {
  @SerializedName("ChartIndex")
  private Integer chartIndex = null;

  @SerializedName("ListObjectIndex")
  private Integer listObjectIndex = null;

  @SerializedName("SheetName")
  private String sheetName = null;

  @SerializedName("ShapeIndex")
  private Integer shapeIndex = null;

  @SerializedName("CellName")
  private String cellName = null;

  @SerializedName("Workbook")
  private FileSource workbook = null;

  public OperateObjectPosition chartIndex(Integer chartIndex) {
    this.chartIndex = chartIndex;
    return this;
  }

   /**
   * Get chartIndex
   * @return chartIndex
  **/
  @ApiModelProperty(value = "")
  public Integer getChartIndex() {
    return chartIndex;
  }

  public void setChartIndex(Integer chartIndex) {
    this.chartIndex = chartIndex;
  }

  public OperateObjectPosition listObjectIndex(Integer listObjectIndex) {
    this.listObjectIndex = listObjectIndex;
    return this;
  }

   /**
   * Get listObjectIndex
   * @return listObjectIndex
  **/
  @ApiModelProperty(value = "")
  public Integer getListObjectIndex() {
    return listObjectIndex;
  }

  public void setListObjectIndex(Integer listObjectIndex) {
    this.listObjectIndex = listObjectIndex;
  }

  public OperateObjectPosition sheetName(String sheetName) {
    this.sheetName = sheetName;
    return this;
  }

   /**
   * Get sheetName
   * @return sheetName
  **/
  @ApiModelProperty(value = "")
  public String getSheetName() {
    return sheetName;
  }

  public void setSheetName(String sheetName) {
    this.sheetName = sheetName;
  }

  public OperateObjectPosition shapeIndex(Integer shapeIndex) {
    this.shapeIndex = shapeIndex;
    return this;
  }

   /**
   * Get shapeIndex
   * @return shapeIndex
  **/
  @ApiModelProperty(value = "")
  public Integer getShapeIndex() {
    return shapeIndex;
  }

  public void setShapeIndex(Integer shapeIndex) {
    this.shapeIndex = shapeIndex;
  }

  public OperateObjectPosition cellName(String cellName) {
    this.cellName = cellName;
    return this;
  }

   /**
   * Get cellName
   * @return cellName
  **/
  @ApiModelProperty(value = "")
  public String getCellName() {
    return cellName;
  }

  public void setCellName(String cellName) {
    this.cellName = cellName;
  }

  public OperateObjectPosition workbook(FileSource workbook) {
    this.workbook = workbook;
    return this;
  }

   /**
   * Get workbook
   * @return workbook
  **/
  @ApiModelProperty(value = "")
  public FileSource getWorkbook() {
    return workbook;
  }

  public void setWorkbook(FileSource workbook) {
    this.workbook = workbook;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperateObjectPosition operateObjectPosition = (OperateObjectPosition) o;
    return Objects.equals(this.chartIndex, operateObjectPosition.chartIndex) &&
        Objects.equals(this.listObjectIndex, operateObjectPosition.listObjectIndex) &&
        Objects.equals(this.sheetName, operateObjectPosition.sheetName) &&
        Objects.equals(this.shapeIndex, operateObjectPosition.shapeIndex) &&
        Objects.equals(this.cellName, operateObjectPosition.cellName) &&
        Objects.equals(this.workbook, operateObjectPosition.workbook);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chartIndex, listObjectIndex, sheetName, shapeIndex, cellName, workbook);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperateObjectPosition {\n");
    
    sb.append("    chartIndex: ").append(toIndentedString(chartIndex)).append("\n");
    sb.append("    listObjectIndex: ").append(toIndentedString(listObjectIndex)).append("\n");
    sb.append("    sheetName: ").append(toIndentedString(sheetName)).append("\n");
    sb.append("    shapeIndex: ").append(toIndentedString(shapeIndex)).append("\n");
    sb.append("    cellName: ").append(toIndentedString(cellName)).append("\n");
    sb.append("    workbook: ").append(toIndentedString(workbook)).append("\n");
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

