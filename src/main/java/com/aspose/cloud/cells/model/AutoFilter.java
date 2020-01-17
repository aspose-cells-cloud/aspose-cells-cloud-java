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
import com.aspose.cloud.cells.model.DataSorter;
import com.aspose.cloud.cells.model.FilterColumn;
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
 * AutoFilter
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-02T17:30:33.766+08:00")
public class AutoFilter {
  @SerializedName("link")
  private Link link = null;

  @SerializedName("Range")
  private String range = null;

  @SerializedName("FilterColumns")
  private List<FilterColumn> filterColumns = null;

  @SerializedName("Sorter")
  private DataSorter sorter = null;

  public AutoFilter link(Link link) {
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

  public AutoFilter range(String range) {
    this.range = range;
    return this;
  }

   /**
   * Get range
   * @return range
  **/
  @ApiModelProperty(value = "")
  public String getRange() {
    return range;
  }

  public void setRange(String range) {
    this.range = range;
  }

  public AutoFilter filterColumns(List<FilterColumn> filterColumns) {
    this.filterColumns = filterColumns;
    return this;
  }

  public AutoFilter addFilterColumnsItem(FilterColumn filterColumnsItem) {
    if (this.filterColumns == null) {
      this.filterColumns = new ArrayList<>();
    }
    this.filterColumns.add(filterColumnsItem);
    return this;
  }

   /**
   * Get filterColumns
   * @return filterColumns
  **/
  @ApiModelProperty(value = "")
  public List<FilterColumn> getFilterColumns() {
    return filterColumns;
  }

  public void setFilterColumns(List<FilterColumn> filterColumns) {
    this.filterColumns = filterColumns;
  }

  public AutoFilter sorter(DataSorter sorter) {
    this.sorter = sorter;
    return this;
  }

   /**
   * Get sorter
   * @return sorter
  **/
  @ApiModelProperty(value = "")
  public DataSorter getSorter() {
    return sorter;
  }

  public void setSorter(DataSorter sorter) {
    this.sorter = sorter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoFilter autoFilter = (AutoFilter) o;
    return Objects.equals(this.link, autoFilter.link) &&
        Objects.equals(this.range, autoFilter.range) &&
        Objects.equals(this.filterColumns, autoFilter.filterColumns) &&
        Objects.equals(this.sorter, autoFilter.sorter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, range, filterColumns, sorter);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutoFilter {\n");
    
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    filterColumns: ").append(toIndentedString(filterColumns)).append("\n");
    sb.append("    sorter: ").append(toIndentedString(sorter)).append("\n");
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

