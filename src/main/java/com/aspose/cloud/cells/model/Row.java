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

/**
 * Row
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-16T03:09:53.733-05:00")
public class Row {
  @SerializedName("link")
  private Link link = null;

  @SerializedName("Index")
  private Integer index = null;

  @SerializedName("Style")
  private LinkElement style = null;

  @SerializedName("GroupLevel")
  private Integer groupLevel = null;

  @SerializedName("Height")
  private Double height = null;

  @SerializedName("IsHeightMatched")
  private Boolean isHeightMatched = null;

  @SerializedName("IsHidden")
  private Boolean isHidden = null;

  @SerializedName("IsBlank")
  private Boolean isBlank = null;

  public Row link(Link link) {
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

  public Row index(Integer index) {
    this.index = index;
    return this;
  }

   /**
   * Get index
   * @return index
  **/
  @ApiModelProperty(value = "")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public Row style(LinkElement style) {
    this.style = style;
    return this;
  }

   /**
   * Get style
   * @return style
  **/
  @ApiModelProperty(value = "")
  public LinkElement getStyle() {
    return style;
  }

  public void setStyle(LinkElement style) {
    this.style = style;
  }

  public Row groupLevel(Integer groupLevel) {
    this.groupLevel = groupLevel;
    return this;
  }

   /**
   * Get groupLevel
   * @return groupLevel
  **/
  @ApiModelProperty(value = "")
  public Integer getGroupLevel() {
    return groupLevel;
  }

  public void setGroupLevel(Integer groupLevel) {
    this.groupLevel = groupLevel;
  }

  public Row height(Double height) {
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @ApiModelProperty(value = "")
  public Double getHeight() {
    return height;
  }

  public void setHeight(Double height) {
    this.height = height;
  }

  public Row isHeightMatched(Boolean isHeightMatched) {
    this.isHeightMatched = isHeightMatched;
    return this;
  }

   /**
   * Get isHeightMatched
   * @return isHeightMatched
  **/
  @ApiModelProperty(value = "")
  public Boolean IsHeightMatched() {
    return isHeightMatched;
  }

  public void setIsHeightMatched(Boolean isHeightMatched) {
    this.isHeightMatched = isHeightMatched;
  }

  public Row isHidden(Boolean isHidden) {
    this.isHidden = isHidden;
    return this;
  }

   /**
   * Get isHidden
   * @return isHidden
  **/
  @ApiModelProperty(value = "")
  public Boolean IsHidden() {
    return isHidden;
  }

  public void setIsHidden(Boolean isHidden) {
    this.isHidden = isHidden;
  }

  public Row isBlank(Boolean isBlank) {
    this.isBlank = isBlank;
    return this;
  }

   /**
   * Get isBlank
   * @return isBlank
  **/
  @ApiModelProperty(value = "")
  public Boolean IsBlank() {
    return isBlank;
  }

  public void setIsBlank(Boolean isBlank) {
    this.isBlank = isBlank;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Row row = (Row) o;
    return Objects.equals(this.link, row.link) &&
        Objects.equals(this.index, row.index) &&
        Objects.equals(this.style, row.style) &&
        Objects.equals(this.groupLevel, row.groupLevel) &&
        Objects.equals(this.height, row.height) &&
        Objects.equals(this.isHeightMatched, row.isHeightMatched) &&
        Objects.equals(this.isHidden, row.isHidden) &&
        Objects.equals(this.isBlank, row.isBlank);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, index, style, groupLevel, height, isHeightMatched, isHidden, isBlank);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Row {\n");
    
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
    sb.append("    groupLevel: ").append(toIndentedString(groupLevel)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    isHeightMatched: ").append(toIndentedString(isHeightMatched)).append("\n");
    sb.append("    isHidden: ").append(toIndentedString(isHidden)).append("\n");
    sb.append("    isBlank: ").append(toIndentedString(isBlank)).append("\n");
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

