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
 * Cells
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-17T20:48:47.090-05:00")
public class Cells {
  @SerializedName("link")
  private Link link = null;

  @SerializedName("Rows")
  private LinkElement rows = null;

  @SerializedName("CellCount")
  private Integer cellCount = null;

  @SerializedName("MaxRow")
  private Integer maxRow = null;

  @SerializedName("CellList")
  private List<LinkElement> cellList = null;

  @SerializedName("MaxColumn")
  private Integer maxColumn = null;

  @SerializedName("Columns")
  private LinkElement columns = null;

  public Cells link(Link link) {
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

  public Cells rows(LinkElement rows) {
    this.rows = rows;
    return this;
  }

   /**
   * Get rows
   * @return rows
  **/
  @ApiModelProperty(value = "")
  public LinkElement getRows() {
    return rows;
  }

  public void setRows(LinkElement rows) {
    this.rows = rows;
  }

  public Cells cellCount(Integer cellCount) {
    this.cellCount = cellCount;
    return this;
  }

   /**
   * Get cellCount
   * @return cellCount
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getCellCount() {
    return cellCount;
  }

  public void setCellCount(Integer cellCount) {
    this.cellCount = cellCount;
  }

  public Cells maxRow(Integer maxRow) {
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

  public Cells cellList(List<LinkElement> cellList) {
    this.cellList = cellList;
    return this;
  }

  public Cells addCellListItem(LinkElement cellListItem) {
    if (this.cellList == null) {
      this.cellList = new ArrayList<>();
    }
    this.cellList.add(cellListItem);
    return this;
  }

   /**
   * Get cellList
   * @return cellList
  **/
  @ApiModelProperty(value = "")
  public List<LinkElement> getCellList() {
    return cellList;
  }

  public void setCellList(List<LinkElement> cellList) {
    this.cellList = cellList;
  }

  public Cells maxColumn(Integer maxColumn) {
    this.maxColumn = maxColumn;
    return this;
  }

   /**
   * Maximum column index of cell which contains data.             
   * @return maxColumn
  **/
  @ApiModelProperty(required = true, value = "Maximum column index of cell which contains data.             ")
  public Integer getMaxColumn() {
    return maxColumn;
  }

  public void setMaxColumn(Integer maxColumn) {
    this.maxColumn = maxColumn;
  }

  public Cells columns(LinkElement columns) {
    this.columns = columns;
    return this;
  }

   /**
   * Get columns
   * @return columns
  **/
  @ApiModelProperty(value = "")
  public LinkElement getColumns() {
    return columns;
  }

  public void setColumns(LinkElement columns) {
    this.columns = columns;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cells cells = (Cells) o;
    return Objects.equals(this.link, cells.link) &&
        Objects.equals(this.rows, cells.rows) &&
        Objects.equals(this.cellCount, cells.cellCount) &&
        Objects.equals(this.maxRow, cells.maxRow) &&
        Objects.equals(this.cellList, cells.cellList) &&
        Objects.equals(this.maxColumn, cells.maxColumn) &&
        Objects.equals(this.columns, cells.columns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, rows, cellCount, maxRow, cellList, maxColumn, columns);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cells {\n");
    
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    cellCount: ").append(toIndentedString(cellCount)).append("\n");
    sb.append("    maxRow: ").append(toIndentedString(maxRow)).append("\n");
    sb.append("    cellList: ").append(toIndentedString(cellList)).append("\n");
    sb.append("    maxColumn: ").append(toIndentedString(maxColumn)).append("\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
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

