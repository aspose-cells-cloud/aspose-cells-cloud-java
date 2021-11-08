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

/**
 * Range
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-01T17:19:06.500-05:00")
public class Range {
  @SerializedName("ColumnCount")
  private Integer columnCount = null;

  @SerializedName("RowHeight")
  private Double rowHeight = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("FirstColumn")
  private Integer firstColumn = null;

  @SerializedName("ColumnWidth")
  private Double columnWidth = null;

  @SerializedName("RefersTo")
  private String refersTo = null;

  @SerializedName("RowCount")
  private Integer rowCount = null;

  @SerializedName("FirstRow")
  private Integer firstRow = null;

  @SerializedName("Worksheet")
  private String worksheet = null;

  public Range columnCount(Integer columnCount) {
    this.columnCount = columnCount;
    return this;
  }

   /**
   * Gets the count of columns in the range.
   * @return columnCount
  **/
  @ApiModelProperty(required = true, value = "Gets the count of columns in the range.")
  public Integer getColumnCount() {
    return columnCount;
  }

  public void setColumnCount(Integer columnCount) {
    this.columnCount = columnCount;
  }

  public Range rowHeight(Double rowHeight) {
    this.rowHeight = rowHeight;
    return this;
  }

   /**
   * Sets or gets the height of rows in this range
   * @return rowHeight
  **/
  @ApiModelProperty(required = true, value = "Sets or gets the height of rows in this range")
  public Double getRowHeight() {
    return rowHeight;
  }

  public void setRowHeight(Double rowHeight) {
    this.rowHeight = rowHeight;
  }

  public Range name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Gets or sets the name of the range.
   * @return name
  **/
  @ApiModelProperty(value = "Gets or sets the name of the range.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Range firstColumn(Integer firstColumn) {
    this.firstColumn = firstColumn;
    return this;
  }

   /**
   * Gets the index of the first column of the range.
   * @return firstColumn
  **/
  @ApiModelProperty(required = true, value = "Gets the index of the first column of the range.")
  public Integer getFirstColumn() {
    return firstColumn;
  }

  public void setFirstColumn(Integer firstColumn) {
    this.firstColumn = firstColumn;
  }

  public Range columnWidth(Double columnWidth) {
    this.columnWidth = columnWidth;
    return this;
  }

   /**
   * Sets or gets the column width of this range
   * @return columnWidth
  **/
  @ApiModelProperty(required = true, value = "Sets or gets the column width of this range")
  public Double getColumnWidth() {
    return columnWidth;
  }

  public void setColumnWidth(Double columnWidth) {
    this.columnWidth = columnWidth;
  }

  public Range refersTo(String refersTo) {
    this.refersTo = refersTo;
    return this;
  }

   /**
   * Gets the range&#39;s refers to.
   * @return refersTo
  **/
  @ApiModelProperty(value = "Gets the range's refers to.")
  public String getRefersTo() {
    return refersTo;
  }

  public void setRefersTo(String refersTo) {
    this.refersTo = refersTo;
  }

  public Range rowCount(Integer rowCount) {
    this.rowCount = rowCount;
    return this;
  }

   /**
   * Gets the count of rows in the range.
   * @return rowCount
  **/
  @ApiModelProperty(required = true, value = "Gets the count of rows in the range.")
  public Integer getRowCount() {
    return rowCount;
  }

  public void setRowCount(Integer rowCount) {
    this.rowCount = rowCount;
  }

  public Range firstRow(Integer firstRow) {
    this.firstRow = firstRow;
    return this;
  }

   /**
   * Gets the index of the first row of the range.
   * @return firstRow
  **/
  @ApiModelProperty(required = true, value = "Gets the index of the first row of the range.")
  public Integer getFirstRow() {
    return firstRow;
  }

  public void setFirstRow(Integer firstRow) {
    this.firstRow = firstRow;
  }

  public Range worksheet(String worksheet) {
    this.worksheet = worksheet;
    return this;
  }

   /**
   * Gets the Aspose.Cells.Range.Worksheetobject which contains this range.
   * @return worksheet
  **/
  @ApiModelProperty(value = "Gets the Aspose.Cells.Range.Worksheetobject which contains this range.")
  public String getWorksheet() {
    return worksheet;
  }

  public void setWorksheet(String worksheet) {
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
    Range range = (Range) o;
    return Objects.equals(this.columnCount, range.columnCount) &&
        Objects.equals(this.rowHeight, range.rowHeight) &&
        Objects.equals(this.name, range.name) &&
        Objects.equals(this.firstColumn, range.firstColumn) &&
        Objects.equals(this.columnWidth, range.columnWidth) &&
        Objects.equals(this.refersTo, range.refersTo) &&
        Objects.equals(this.rowCount, range.rowCount) &&
        Objects.equals(this.firstRow, range.firstRow) &&
        Objects.equals(this.worksheet, range.worksheet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnCount, rowHeight, name, firstColumn, columnWidth, refersTo, rowCount, firstRow, worksheet);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Range {\n");
    
    sb.append("    columnCount: ").append(toIndentedString(columnCount)).append("\n");
    sb.append("    rowHeight: ").append(toIndentedString(rowHeight)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    firstColumn: ").append(toIndentedString(firstColumn)).append("\n");
    sb.append("    columnWidth: ").append(toIndentedString(columnWidth)).append("\n");
    sb.append("    refersTo: ").append(toIndentedString(refersTo)).append("\n");
    sb.append("    rowCount: ").append(toIndentedString(rowCount)).append("\n");
    sb.append("    firstRow: ").append(toIndentedString(firstRow)).append("\n");
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

