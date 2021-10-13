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
 * CreatePivotTableRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-10-10T23:25:01.778-05:00")
public class CreatePivotTableRequest {
  @SerializedName("PivotFieldColumns")
  private List<Integer> pivotFieldColumns = null;

  @SerializedName("Name")
  private String name = null;

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

  public CreatePivotTableRequest pivotFieldColumns(List<Integer> pivotFieldColumns) {
    this.pivotFieldColumns = pivotFieldColumns;
    return this;
  }

  public CreatePivotTableRequest addPivotFieldColumnsItem(Integer pivotFieldColumnsItem) {
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

  public CreatePivotTableRequest name(String name) {
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

  public CreatePivotTableRequest useSameSource(Boolean useSameSource) {
    this.useSameSource = useSameSource;
    return this;
  }

   /**
   * Get useSameSource
   * @return useSameSource
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean UseSameSource() {
    return useSameSource;
  }

  public void setUseSameSource(Boolean useSameSource) {
    this.useSameSource = useSameSource;
  }

  public CreatePivotTableRequest pivotFieldData(List<Integer> pivotFieldData) {
    this.pivotFieldData = pivotFieldData;
    return this;
  }

  public CreatePivotTableRequest addPivotFieldDataItem(Integer pivotFieldDataItem) {
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

  public CreatePivotTableRequest pivotFieldRows(List<Integer> pivotFieldRows) {
    this.pivotFieldRows = pivotFieldRows;
    return this;
  }

  public CreatePivotTableRequest addPivotFieldRowsItem(Integer pivotFieldRowsItem) {
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

  public CreatePivotTableRequest destCellName(String destCellName) {
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

  public CreatePivotTableRequest sourceData(String sourceData) {
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
    CreatePivotTableRequest createPivotTableRequest = (CreatePivotTableRequest) o;
    return Objects.equals(this.pivotFieldColumns, createPivotTableRequest.pivotFieldColumns) &&
        Objects.equals(this.name, createPivotTableRequest.name) &&
        Objects.equals(this.useSameSource, createPivotTableRequest.useSameSource) &&
        Objects.equals(this.pivotFieldData, createPivotTableRequest.pivotFieldData) &&
        Objects.equals(this.pivotFieldRows, createPivotTableRequest.pivotFieldRows) &&
        Objects.equals(this.destCellName, createPivotTableRequest.destCellName) &&
        Objects.equals(this.sourceData, createPivotTableRequest.sourceData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pivotFieldColumns, name, useSameSource, pivotFieldData, pivotFieldRows, destCellName, sourceData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePivotTableRequest {\n");
    
    sb.append("    pivotFieldColumns: ").append(toIndentedString(pivotFieldColumns)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

