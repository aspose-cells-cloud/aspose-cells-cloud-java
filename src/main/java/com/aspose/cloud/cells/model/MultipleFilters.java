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
import com.aspose.cloud.cells.model.MultipleFilter;
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
 * MultipleFilters
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-01-21T01:47:19.323-06:00")
public class MultipleFilters {
  @SerializedName("MultipleFilterList")
  private List<MultipleFilter> multipleFilterList = null;

  @SerializedName("MatchBlank")
  private Boolean matchBlank = null;

  public MultipleFilters multipleFilterList(List<MultipleFilter> multipleFilterList) {
    this.multipleFilterList = multipleFilterList;
    return this;
  }

  public MultipleFilters addMultipleFilterListItem(MultipleFilter multipleFilterListItem) {
    if (this.multipleFilterList == null) {
      this.multipleFilterList = new ArrayList<>();
    }
    this.multipleFilterList.add(multipleFilterListItem);
    return this;
  }

   /**
   * Get multipleFilterList
   * @return multipleFilterList
  **/
  @ApiModelProperty(value = "")
  public List<MultipleFilter> getMultipleFilterList() {
    return multipleFilterList;
  }

  public void setMultipleFilterList(List<MultipleFilter> multipleFilterList) {
    this.multipleFilterList = multipleFilterList;
  }

  public MultipleFilters matchBlank(Boolean matchBlank) {
    this.matchBlank = matchBlank;
    return this;
  }

   /**
   * Get matchBlank
   * @return matchBlank
  **/
  @ApiModelProperty(value = "")
  public Boolean MatchBlank() {
    return matchBlank;
  }

  public void setMatchBlank(Boolean matchBlank) {
    this.matchBlank = matchBlank;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultipleFilters multipleFilters = (MultipleFilters) o;
    return Objects.equals(this.multipleFilterList, multipleFilters.multipleFilterList) &&
        Objects.equals(this.matchBlank, multipleFilters.matchBlank);
  }

  @Override
  public int hashCode() {
    return Objects.hash(multipleFilterList, matchBlank);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultipleFilters {\n");
    
    sb.append("    multipleFilterList: ").append(toIndentedString(multipleFilterList)).append("\n");
    sb.append("    matchBlank: ").append(toIndentedString(matchBlank)).append("\n");
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

