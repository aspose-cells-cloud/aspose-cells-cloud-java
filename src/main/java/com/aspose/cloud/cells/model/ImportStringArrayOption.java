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
import com.aspose.cloud.cells.model.FileSource;
import com.aspose.cloud.cells.model.ImportOption;
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
 * ImportStringArrayOption
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-17T20:48:47.090-05:00")
public class ImportStringArrayOption extends ImportOption {
  @SerializedName("Data")
  private List<String> data = null;

  @SerializedName("IsVertical")
  private Boolean isVertical = null;

  @SerializedName("FirstRow")
  private Integer firstRow = null;

  @SerializedName("FirstColumn")
  private Integer firstColumn = null;

  public ImportStringArrayOption data(List<String> data) {
    this.data = data;
    return this;
  }

  public ImportStringArrayOption addDataItem(String dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")
  public List<String> getData() {
    return data;
  }

  public void setData(List<String> data) {
    this.data = data;
  }

  public ImportStringArrayOption isVertical(Boolean isVertical) {
    this.isVertical = isVertical;
    return this;
  }

   /**
   * Get isVertical
   * @return isVertical
  **/
  @ApiModelProperty(value = "")
  public Boolean IsVertical() {
    return isVertical;
  }

  public void setIsVertical(Boolean isVertical) {
    this.isVertical = isVertical;
  }

  public ImportStringArrayOption firstRow(Integer firstRow) {
    this.firstRow = firstRow;
    return this;
  }

   /**
   * Get firstRow
   * @return firstRow
  **/
  @ApiModelProperty(value = "")
  public Integer getFirstRow() {
    return firstRow;
  }

  public void setFirstRow(Integer firstRow) {
    this.firstRow = firstRow;
  }

  public ImportStringArrayOption firstColumn(Integer firstColumn) {
    this.firstColumn = firstColumn;
    return this;
  }

   /**
   * Get firstColumn
   * @return firstColumn
  **/
  @ApiModelProperty(value = "")
  public Integer getFirstColumn() {
    return firstColumn;
  }

  public void setFirstColumn(Integer firstColumn) {
    this.firstColumn = firstColumn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportStringArrayOption importStringArrayOption = (ImportStringArrayOption) o;
    return Objects.equals(this.data, importStringArrayOption.data) &&
        Objects.equals(this.isVertical, importStringArrayOption.isVertical) &&
        Objects.equals(this.firstRow, importStringArrayOption.firstRow) &&
        Objects.equals(this.firstColumn, importStringArrayOption.firstColumn) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, isVertical, firstRow, firstColumn, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportStringArrayOption {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    isVertical: ").append(toIndentedString(isVertical)).append("\n");
    sb.append("    firstRow: ").append(toIndentedString(firstRow)).append("\n");
    sb.append("    firstColumn: ").append(toIndentedString(firstColumn)).append("\n");
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

