/* 
 * <summary>
 *  Copyright (c) 2022 Aspose.Cells Cloud
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
 * VerticalPageBreak
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-13T18:09:02.334-05:00")
public class VerticalPageBreak {
  @SerializedName("Column")
  private Integer column = null;

  @SerializedName("StartRow")
  private Integer startRow = null;

  @SerializedName("EndRow")
  private Integer endRow = null;

  public VerticalPageBreak column(Integer column) {
    this.column = column;
    return this;
  }

   /**
   * Get column
   * @return column
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getColumn() {
    return column;
  }

  public void setColumn(Integer column) {
    this.column = column;
  }

  public VerticalPageBreak startRow(Integer startRow) {
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

  public VerticalPageBreak endRow(Integer endRow) {
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
    VerticalPageBreak verticalPageBreak = (VerticalPageBreak) o;
    return Objects.equals(this.column, verticalPageBreak.column) &&
        Objects.equals(this.startRow, verticalPageBreak.startRow) &&
        Objects.equals(this.endRow, verticalPageBreak.endRow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(column, startRow, endRow);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerticalPageBreak {\n");
    
    sb.append("    column: ").append(toIndentedString(column)).append("\n");
    sb.append("    startRow: ").append(toIndentedString(startRow)).append("\n");
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

