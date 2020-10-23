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
import com.aspose.cloud.cells.model.Link;
import com.aspose.cloud.cells.model.LinkElement;
import com.aspose.cloud.cells.model.VerticalPageBreak;
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
 * VerticalPageBreaks
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-19T23:40:54.225-05:00")
public class VerticalPageBreaks {
  @SerializedName("link")
  private Link link = null;

  @SerializedName("VerticalPageBreakList")
  private List<VerticalPageBreak> verticalPageBreakList = null;

  public VerticalPageBreaks link(Link link) {
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

  public VerticalPageBreaks verticalPageBreakList(List<VerticalPageBreak> verticalPageBreakList) {
    this.verticalPageBreakList = verticalPageBreakList;
    return this;
  }

  public VerticalPageBreaks addVerticalPageBreakListItem(VerticalPageBreak verticalPageBreakListItem) {
    if (this.verticalPageBreakList == null) {
      this.verticalPageBreakList = new ArrayList<>();
    }
    this.verticalPageBreakList.add(verticalPageBreakListItem);
    return this;
  }

   /**
   * Get verticalPageBreakList
   * @return verticalPageBreakList
  **/
  @ApiModelProperty(value = "")
  public List<VerticalPageBreak> getVerticalPageBreakList() {
    return verticalPageBreakList;
  }

  public void setVerticalPageBreakList(List<VerticalPageBreak> verticalPageBreakList) {
    this.verticalPageBreakList = verticalPageBreakList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerticalPageBreaks verticalPageBreaks = (VerticalPageBreaks) o;
    return Objects.equals(this.link, verticalPageBreaks.link) &&
        Objects.equals(this.verticalPageBreakList, verticalPageBreaks.verticalPageBreakList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, verticalPageBreakList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerticalPageBreaks {\n");
    
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    verticalPageBreakList: ").append(toIndentedString(verticalPageBreakList)).append("\n");
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

