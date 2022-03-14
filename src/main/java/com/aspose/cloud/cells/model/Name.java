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
 * Name
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-13T18:09:02.334-05:00")
public class Name {
  @SerializedName("link")
  private Link link = null;

  @SerializedName("Comment")
  private String comment = null;

  @SerializedName("Text")
  private String text = null;

  @SerializedName("WorksheetIndex")
  private Integer worksheetIndex = null;

  @SerializedName("R1C1RefersTo")
  private String r1C1RefersTo = null;

  @SerializedName("RefersTo")
  private String refersTo = null;

  @SerializedName("IsReferred")
  private Boolean isReferred = null;

  @SerializedName("IsVisible")
  private Boolean isVisible = null;

  public Name link(Link link) {
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

  public Name comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @ApiModelProperty(value = "")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public Name text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @ApiModelProperty(value = "")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Name worksheetIndex(Integer worksheetIndex) {
    this.worksheetIndex = worksheetIndex;
    return this;
  }

   /**
   * Get worksheetIndex
   * @return worksheetIndex
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getWorksheetIndex() {
    return worksheetIndex;
  }

  public void setWorksheetIndex(Integer worksheetIndex) {
    this.worksheetIndex = worksheetIndex;
  }

  public Name r1C1RefersTo(String r1C1RefersTo) {
    this.r1C1RefersTo = r1C1RefersTo;
    return this;
  }

   /**
   * Get r1C1RefersTo
   * @return r1C1RefersTo
  **/
  @ApiModelProperty(value = "")
  public String getR1C1RefersTo() {
    return r1C1RefersTo;
  }

  public void setR1C1RefersTo(String r1C1RefersTo) {
    this.r1C1RefersTo = r1C1RefersTo;
  }

  public Name refersTo(String refersTo) {
    this.refersTo = refersTo;
    return this;
  }

   /**
   * Get refersTo
   * @return refersTo
  **/
  @ApiModelProperty(value = "")
  public String getRefersTo() {
    return refersTo;
  }

  public void setRefersTo(String refersTo) {
    this.refersTo = refersTo;
  }

  public Name isReferred(Boolean isReferred) {
    this.isReferred = isReferred;
    return this;
  }

   /**
   * Get isReferred
   * @return isReferred
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean IsReferred() {
    return isReferred;
  }

  public void setIsReferred(Boolean isReferred) {
    this.isReferred = isReferred;
  }

  public Name isVisible(Boolean isVisible) {
    this.isVisible = isVisible;
    return this;
  }

   /**
   * Get isVisible
   * @return isVisible
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean IsVisible() {
    return isVisible;
  }

  public void setIsVisible(Boolean isVisible) {
    this.isVisible = isVisible;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Name name = (Name) o;
    return Objects.equals(this.link, name.link) &&
        Objects.equals(this.comment, name.comment) &&
        Objects.equals(this.text, name.text) &&
        Objects.equals(this.worksheetIndex, name.worksheetIndex) &&
        Objects.equals(this.r1C1RefersTo, name.r1C1RefersTo) &&
        Objects.equals(this.refersTo, name.refersTo) &&
        Objects.equals(this.isReferred, name.isReferred) &&
        Objects.equals(this.isVisible, name.isVisible);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, comment, text, worksheetIndex, r1C1RefersTo, refersTo, isReferred, isVisible);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Name {\n");
    
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    worksheetIndex: ").append(toIndentedString(worksheetIndex)).append("\n");
    sb.append("    r1C1RefersTo: ").append(toIndentedString(r1C1RefersTo)).append("\n");
    sb.append("    refersTo: ").append(toIndentedString(refersTo)).append("\n");
    sb.append("    isReferred: ").append(toIndentedString(isReferred)).append("\n");
    sb.append("    isVisible: ").append(toIndentedString(isVisible)).append("\n");
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

