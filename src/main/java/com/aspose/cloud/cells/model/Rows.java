/* 
 * <summary>
 *  Copyright (c) 2019 Aspose.Cells Cloud
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
import com.aspose.cloud.cells.model.Link;
import com.aspose.cloud.cells.model.LinkElement;
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
 * Rows
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-24T14:56:32.974+08:00")
public class Rows {
  @SerializedName("link")
  private Link link = null;

  @SerializedName("MaxRow")
  private Integer maxRow = null;

  @SerializedName("RowsList")
  private List<LinkElement> rowsList = null;

  @SerializedName("RowsCount")
  private Integer rowsCount = null;

  public Rows link(Link link) {
    this.link = link;
    return this;
  }

   /**
   * Get link
   * @return link
  **/
  @ApiModelProperty(value = "")
  public Link getLink() {
    return link;
  }

  public void setLink(Link link) {
    this.link = link;
  }

  public Rows maxRow(Integer maxRow) {
    this.maxRow = maxRow;
    return this;
  }

   /**
   * Get maxRow
   * @return maxRow
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getMaxRow() {
    return maxRow;
  }

  public void setMaxRow(Integer maxRow) {
    this.maxRow = maxRow;
  }

  public Rows rowsList(List<LinkElement> rowsList) {
    this.rowsList = rowsList;
    return this;
  }

  public Rows addRowsListItem(LinkElement rowsListItem) {
    if (this.rowsList == null) {
      this.rowsList = new ArrayList<>();
    }
    this.rowsList.add(rowsListItem);
    return this;
  }

   /**
   * Get rowsList
   * @return rowsList
  **/
  @ApiModelProperty(value = "")
  public List<LinkElement> getRowsList() {
    return rowsList;
  }

  public void setRowsList(List<LinkElement> rowsList) {
    this.rowsList = rowsList;
  }

  public Rows rowsCount(Integer rowsCount) {
    this.rowsCount = rowsCount;
    return this;
  }

   /**
   * Get rowsCount
   * @return rowsCount
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getRowsCount() {
    return rowsCount;
  }

  public void setRowsCount(Integer rowsCount) {
    this.rowsCount = rowsCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rows rows = (Rows) o;
    return Objects.equals(this.link, rows.link) &&
        Objects.equals(this.maxRow, rows.maxRow) &&
        Objects.equals(this.rowsList, rows.rowsList) &&
        Objects.equals(this.rowsCount, rows.rowsCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, maxRow, rowsList, rowsCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rows {\n");
    
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    maxRow: ").append(toIndentedString(maxRow)).append("\n");
    sb.append("    rowsList: ").append(toIndentedString(rowsList)).append("\n");
    sb.append("    rowsCount: ").append(toIndentedString(rowsCount)).append("\n");
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

