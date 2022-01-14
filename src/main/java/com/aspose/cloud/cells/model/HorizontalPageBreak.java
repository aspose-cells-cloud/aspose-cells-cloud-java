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
 * HorizontalPageBreak
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-08T17:58:31.285-06:00")
public class HorizontalPageBreak {
  @SerializedName("StartColumn")
  private Integer startColumn = null;

  @SerializedName("EndColumn")
  private Integer endColumn = null;

  @SerializedName("Row")
  private Integer row = null;

  public HorizontalPageBreak startColumn(Integer startColumn) {
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

  public HorizontalPageBreak endColumn(Integer endColumn) {
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

  public HorizontalPageBreak row(Integer row) {
    this.row = row;
    return this;
  }

   /**
   * Get row
   * @return row
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getRow() {
    return row;
  }

  public void setRow(Integer row) {
    this.row = row;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HorizontalPageBreak horizontalPageBreak = (HorizontalPageBreak) o;
    return Objects.equals(this.startColumn, horizontalPageBreak.startColumn) &&
        Objects.equals(this.endColumn, horizontalPageBreak.endColumn) &&
        Objects.equals(this.row, horizontalPageBreak.row);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startColumn, endColumn, row);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HorizontalPageBreak {\n");
    
    sb.append("    startColumn: ").append(toIndentedString(startColumn)).append("\n");
    sb.append("    endColumn: ").append(toIndentedString(endColumn)).append("\n");
    sb.append("    row: ").append(toIndentedString(row)).append("\n");
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

