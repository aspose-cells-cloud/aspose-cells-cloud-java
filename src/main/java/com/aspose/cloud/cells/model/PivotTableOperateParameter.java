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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PivotTableOperateParameter
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-09-17T23:42:04.472-05:00")
public class PivotTableOperateParameter extends OperateParameter {
  @SerializedName("PivotFieldColumns")
  private List<Integer> pivotFieldColumns = null;

  @SerializedName("PivotTableIndex")
  private Integer pivotTableIndex = null;

  @SerializedName("TableName")
  private String tableName = null;

  @SerializedName("UseSameSource")
  private Boolean useSameSource = null;

  @SerializedName("PivotFieldData")
  private List<Integer> pivotFieldData = null;

  @SerializedName("PivotFieldRows")
  private List<Integer> pivotFieldRows = null;

  @SerializedName("DestCellName")
  private String destCellName = null;

  @SerializedName("SourceData")
  private String sourceData = null;

  public PivotTableOperateParameter pivotFieldColumns(List<Integer> pivotFieldColumns) {
    this.pivotFieldColumns = pivotFieldColumns;
    return this;
  }

  public PivotTableOperateParameter addPivotFieldColumnsItem(Integer pivotFieldColumnsItem) {
    if (this.pivotFieldColumns == null) {
      this.pivotFieldColumns = new ArrayList<>();
    }
    this.pivotFieldColumns.add(pivotFieldColumnsItem);
    return this;
  }

   /**
   * Get pivotFieldColumns
   * @return pivotFieldColumns
  **/
  @ApiModelProperty(value = "")
  public List<Integer> getPivotFieldColumns() {
    return pivotFieldColumns;
  }

  public void setPivotFieldColumns(List<Integer> pivotFieldColumns) {
    this.pivotFieldColumns = pivotFieldColumns;
  }

  public PivotTableOperateParameter pivotTableIndex(Integer pivotTableIndex) {
    this.pivotTableIndex = pivotTableIndex;
    return this;
  }

   /**
   * Get pivotTableIndex
   * @return pivotTableIndex
  **/
  @ApiModelProperty(value = "")
  public Integer getPivotTableIndex() {
    return pivotTableIndex;
  }

  public void setPivotTableIndex(Integer pivotTableIndex) {
    this.pivotTableIndex = pivotTableIndex;
  }

  public PivotTableOperateParameter tableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

   /**
   * Get tableName
   * @return tableName
  **/
  @ApiModelProperty(value = "")
  public String getTableName() {
    return tableName;
  }

  public void setTableName(String tableName) {
    this.tableName = tableName;
  }

  public PivotTableOperateParameter useSameSource(Boolean useSameSource) {
    this.useSameSource = useSameSource;
    return this;
  }

   /**
   * Get useSameSource
   * @return useSameSource
  **/
  @ApiModelProperty(value = "")
  public Boolean UseSameSource() {
    return useSameSource;
  }

  public void setUseSameSource(Boolean useSameSource) {
    this.useSameSource = useSameSource;
  }

  public PivotTableOperateParameter pivotFieldData(List<Integer> pivotFieldData) {
    this.pivotFieldData = pivotFieldData;
    return this;
  }

  public PivotTableOperateParameter addPivotFieldDataItem(Integer pivotFieldDataItem) {
    if (this.pivotFieldData == null) {
      this.pivotFieldData = new ArrayList<>();
    }
    this.pivotFieldData.add(pivotFieldDataItem);
    return this;
  }

   /**
   * Get pivotFieldData
   * @return pivotFieldData
  **/
  @ApiModelProperty(value = "")
  public List<Integer> getPivotFieldData() {
    return pivotFieldData;
  }

  public void setPivotFieldData(List<Integer> pivotFieldData) {
    this.pivotFieldData = pivotFieldData;
  }

  public PivotTableOperateParameter pivotFieldRows(List<Integer> pivotFieldRows) {
    this.pivotFieldRows = pivotFieldRows;
    return this;
  }

  public PivotTableOperateParameter addPivotFieldRowsItem(Integer pivotFieldRowsItem) {
    if (this.pivotFieldRows == null) {
      this.pivotFieldRows = new ArrayList<>();
    }
    this.pivotFieldRows.add(pivotFieldRowsItem);
    return this;
  }

   /**
   * Get pivotFieldRows
   * @return pivotFieldRows
  **/
  @ApiModelProperty(value = "")
  public List<Integer> getPivotFieldRows() {
    return pivotFieldRows;
  }

  public void setPivotFieldRows(List<Integer> pivotFieldRows) {
    this.pivotFieldRows = pivotFieldRows;
  }

  public PivotTableOperateParameter destCellName(String destCellName) {
    this.destCellName = destCellName;
    return this;
  }

   /**
   * Get destCellName
   * @return destCellName
  **/
  @ApiModelProperty(value = "")
  public String getDestCellName() {
    return destCellName;
  }

  public void setDestCellName(String destCellName) {
    this.destCellName = destCellName;
  }

  public PivotTableOperateParameter sourceData(String sourceData) {
    this.sourceData = sourceData;
    return this;
  }

   /**
   * Get sourceData
   * @return sourceData
  **/
  @ApiModelProperty(value = "")
  public String getSourceData() {
    return sourceData;
  }

  public void setSourceData(String sourceData) {
    this.sourceData = sourceData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PivotTableOperateParameter pivotTableOperateParameter = (PivotTableOperateParameter) o;
    return Objects.equals(this.pivotFieldColumns, pivotTableOperateParameter.pivotFieldColumns) &&
        Objects.equals(this.pivotTableIndex, pivotTableOperateParameter.pivotTableIndex) &&
        Objects.equals(this.tableName, pivotTableOperateParameter.tableName) &&
        Objects.equals(this.useSameSource, pivotTableOperateParameter.useSameSource) &&
        Objects.equals(this.pivotFieldData, pivotTableOperateParameter.pivotFieldData) &&
        Objects.equals(this.pivotFieldRows, pivotTableOperateParameter.pivotFieldRows) &&
        Objects.equals(this.destCellName, pivotTableOperateParameter.destCellName) &&
        Objects.equals(this.sourceData, pivotTableOperateParameter.sourceData) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pivotFieldColumns, pivotTableIndex, tableName, useSameSource, pivotFieldData, pivotFieldRows, destCellName, sourceData, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PivotTableOperateParameter {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    pivotFieldColumns: ").append(toIndentedString(pivotFieldColumns)).append("\n");
    sb.append("    pivotTableIndex: ").append(toIndentedString(pivotTableIndex)).append("\n");
    sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
    sb.append("    useSameSource: ").append(toIndentedString(useSameSource)).append("\n");
    sb.append("    pivotFieldData: ").append(toIndentedString(pivotFieldData)).append("\n");
    sb.append("    pivotFieldRows: ").append(toIndentedString(pivotFieldRows)).append("\n");
    sb.append("    destCellName: ").append(toIndentedString(destCellName)).append("\n");
    sb.append("    sourceData: ").append(toIndentedString(sourceData)).append("\n");
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

