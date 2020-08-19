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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CellArea
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-19T15:56:27.996+08:00")
public class CellArea {
  @SerializedName("StartRow")
  private Integer startRow = null;

  @SerializedName("StartColumn")
  private Integer startColumn = null;

  @SerializedName("EndColumn")
  private Integer endColumn = null;

  @SerializedName("EndRow")
  private Integer endRow = null;

  public CellArea startRow(Integer startRow) {
    this.startRow = startRow;
    return this;
  }

   /**
   * Get startRow
   * @return startRow
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getStartRow() {
    return startRow;
  }

  public void setStartRow(Integer startRow) {
    this.startRow = startRow;
  }

  public CellArea startColumn(Integer startColumn) {
    this.startColumn = startColumn;
    return this;
  }

   /**
   * Get startColumn
   * @return startColumn
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getStartColumn() {
    return startColumn;
  }

  public void setStartColumn(Integer startColumn) {
    this.startColumn = startColumn;
  }

  public CellArea endColumn(Integer endColumn) {
    this.endColumn = endColumn;
    return this;
  }

   /**
   * Get endColumn
   * @return endColumn
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getEndColumn() {
    return endColumn;
  }

  public void setEndColumn(Integer endColumn) {
    this.endColumn = endColumn;
  }

  public CellArea endRow(Integer endRow) {
    this.endRow = endRow;
    return this;
  }

   /**
   * Get endRow
   * @return endRow
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getEndRow() {
    return endRow;
  }

  public void setEndRow(Integer endRow) {
    this.endRow = endRow;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CellArea cellArea = (CellArea) o;
    return Objects.equals(this.startRow, cellArea.startRow) &&
        Objects.equals(this.startColumn, cellArea.startColumn) &&
        Objects.equals(this.endColumn, cellArea.endColumn) &&
        Objects.equals(this.endRow, cellArea.endRow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startRow, startColumn, endColumn, endRow);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CellArea {\n");
    
    sb.append("    startRow: ").append(toIndentedString(startRow)).append("\n");
    sb.append("    startColumn: ").append(toIndentedString(startColumn)).append("\n");
    sb.append("    endColumn: ").append(toIndentedString(endColumn)).append("\n");
    sb.append("    endRow: ").append(toIndentedString(endRow)).append("\n");
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

