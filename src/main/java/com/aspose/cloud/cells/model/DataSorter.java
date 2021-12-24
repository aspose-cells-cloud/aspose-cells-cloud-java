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
import com.aspose.cloud.cells.model.SortKey;
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
 * DataSorter
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-12-23T20:05:07.092-06:00")
public class DataSorter {
  @SerializedName("CaseSensitive")
  private Boolean caseSensitive = null;

  @SerializedName("KeyList")
  private List<SortKey> keyList = null;

  @SerializedName("HasHeaders")
  private Boolean hasHeaders = null;

  @SerializedName("SortLeftToRight")
  private Boolean sortLeftToRight = null;

  public DataSorter caseSensitive(Boolean caseSensitive) {
    this.caseSensitive = caseSensitive;
    return this;
  }

   /**
   * Get caseSensitive
   * @return caseSensitive
  **/
  @ApiModelProperty(value = "")
  public Boolean CaseSensitive() {
    return caseSensitive;
  }

  public void setCaseSensitive(Boolean caseSensitive) {
    this.caseSensitive = caseSensitive;
  }

  public DataSorter keyList(List<SortKey> keyList) {
    this.keyList = keyList;
    return this;
  }

  public DataSorter addKeyListItem(SortKey keyListItem) {
    if (this.keyList == null) {
      this.keyList = new ArrayList<>();
    }
    this.keyList.add(keyListItem);
    return this;
  }

   /**
   * Get keyList
   * @return keyList
  **/
  @ApiModelProperty(value = "")
  public List<SortKey> getKeyList() {
    return keyList;
  }

  public void setKeyList(List<SortKey> keyList) {
    this.keyList = keyList;
  }

  public DataSorter hasHeaders(Boolean hasHeaders) {
    this.hasHeaders = hasHeaders;
    return this;
  }

   /**
   * Get hasHeaders
   * @return hasHeaders
  **/
  @ApiModelProperty(value = "")
  public Boolean HasHeaders() {
    return hasHeaders;
  }

  public void setHasHeaders(Boolean hasHeaders) {
    this.hasHeaders = hasHeaders;
  }

  public DataSorter sortLeftToRight(Boolean sortLeftToRight) {
    this.sortLeftToRight = sortLeftToRight;
    return this;
  }

   /**
   * Get sortLeftToRight
   * @return sortLeftToRight
  **/
  @ApiModelProperty(value = "")
  public Boolean SortLeftToRight() {
    return sortLeftToRight;
  }

  public void setSortLeftToRight(Boolean sortLeftToRight) {
    this.sortLeftToRight = sortLeftToRight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataSorter dataSorter = (DataSorter) o;
    return Objects.equals(this.caseSensitive, dataSorter.caseSensitive) &&
        Objects.equals(this.keyList, dataSorter.keyList) &&
        Objects.equals(this.hasHeaders, dataSorter.hasHeaders) &&
        Objects.equals(this.sortLeftToRight, dataSorter.sortLeftToRight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caseSensitive, keyList, hasHeaders, sortLeftToRight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataSorter {\n");
    
    sb.append("    caseSensitive: ").append(toIndentedString(caseSensitive)).append("\n");
    sb.append("    keyList: ").append(toIndentedString(keyList)).append("\n");
    sb.append("    hasHeaders: ").append(toIndentedString(hasHeaders)).append("\n");
    sb.append("    sortLeftToRight: ").append(toIndentedString(sortLeftToRight)).append("\n");
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

