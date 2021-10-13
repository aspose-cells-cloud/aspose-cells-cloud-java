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

/**
 * Comment
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-10-10T23:25:01.778-05:00")
public class Comment {
  @SerializedName("link")
  private Link link = null;

  @SerializedName("AutoSize")
  private Boolean autoSize = null;

  @SerializedName("Author")
  private String author = null;

  @SerializedName("IsVisible")
  private Boolean isVisible = null;

  @SerializedName("TextOrientationType")
  private String textOrientationType = null;

  @SerializedName("Height")
  private Integer height = null;

  @SerializedName("Note")
  private String note = null;

  @SerializedName("Width")
  private Integer width = null;

  @SerializedName("TextVerticalAlignment")
  private String textVerticalAlignment = null;

  @SerializedName("CellName")
  private String cellName = null;

  @SerializedName("HtmlNote")
  private String htmlNote = null;

  @SerializedName("TextHorizontalAlignment")
  private String textHorizontalAlignment = null;

  public Comment link(Link link) {
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

  public Comment autoSize(Boolean autoSize) {
    this.autoSize = autoSize;
    return this;
  }

   /**
   * Get autoSize
   * @return autoSize
  **/
  @ApiModelProperty(value = "")
  public Boolean AutoSize() {
    return autoSize;
  }

  public void setAutoSize(Boolean autoSize) {
    this.autoSize = autoSize;
  }

  public Comment author(String author) {
    this.author = author;
    return this;
  }

   /**
   * Get author
   * @return author
  **/
  @ApiModelProperty(value = "")
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public Comment isVisible(Boolean isVisible) {
    this.isVisible = isVisible;
    return this;
  }

   /**
   * Get isVisible
   * @return isVisible
  **/
  @ApiModelProperty(value = "")
  public Boolean IsVisible() {
    return isVisible;
  }

  public void setIsVisible(Boolean isVisible) {
    this.isVisible = isVisible;
  }

  public Comment textOrientationType(String textOrientationType) {
    this.textOrientationType = textOrientationType;
    return this;
  }

   /**
   * Get textOrientationType
   * @return textOrientationType
  **/
  @ApiModelProperty(value = "")
  public String getTextOrientationType() {
    return textOrientationType;
  }

  public void setTextOrientationType(String textOrientationType) {
    this.textOrientationType = textOrientationType;
  }

  public Comment height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @ApiModelProperty(value = "")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public Comment note(String note) {
    this.note = note;
    return this;
  }

   /**
   * Get note
   * @return note
  **/
  @ApiModelProperty(value = "")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public Comment width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  @ApiModelProperty(value = "")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public Comment textVerticalAlignment(String textVerticalAlignment) {
    this.textVerticalAlignment = textVerticalAlignment;
    return this;
  }

   /**
   * Get textVerticalAlignment
   * @return textVerticalAlignment
  **/
  @ApiModelProperty(value = "")
  public String getTextVerticalAlignment() {
    return textVerticalAlignment;
  }

  public void setTextVerticalAlignment(String textVerticalAlignment) {
    this.textVerticalAlignment = textVerticalAlignment;
  }

  public Comment cellName(String cellName) {
    this.cellName = cellName;
    return this;
  }

   /**
   * Get cellName
   * @return cellName
  **/
  @ApiModelProperty(value = "")
  public String getCellName() {
    return cellName;
  }

  public void setCellName(String cellName) {
    this.cellName = cellName;
  }

  public Comment htmlNote(String htmlNote) {
    this.htmlNote = htmlNote;
    return this;
  }

   /**
   * Get htmlNote
   * @return htmlNote
  **/
  @ApiModelProperty(value = "")
  public String getHtmlNote() {
    return htmlNote;
  }

  public void setHtmlNote(String htmlNote) {
    this.htmlNote = htmlNote;
  }

  public Comment textHorizontalAlignment(String textHorizontalAlignment) {
    this.textHorizontalAlignment = textHorizontalAlignment;
    return this;
  }

   /**
   * Get textHorizontalAlignment
   * @return textHorizontalAlignment
  **/
  @ApiModelProperty(value = "")
  public String getTextHorizontalAlignment() {
    return textHorizontalAlignment;
  }

  public void setTextHorizontalAlignment(String textHorizontalAlignment) {
    this.textHorizontalAlignment = textHorizontalAlignment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Comment comment = (Comment) o;
    return Objects.equals(this.link, comment.link) &&
        Objects.equals(this.autoSize, comment.autoSize) &&
        Objects.equals(this.author, comment.author) &&
        Objects.equals(this.isVisible, comment.isVisible) &&
        Objects.equals(this.textOrientationType, comment.textOrientationType) &&
        Objects.equals(this.height, comment.height) &&
        Objects.equals(this.note, comment.note) &&
        Objects.equals(this.width, comment.width) &&
        Objects.equals(this.textVerticalAlignment, comment.textVerticalAlignment) &&
        Objects.equals(this.cellName, comment.cellName) &&
        Objects.equals(this.htmlNote, comment.htmlNote) &&
        Objects.equals(this.textHorizontalAlignment, comment.textHorizontalAlignment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, autoSize, author, isVisible, textOrientationType, height, note, width, textVerticalAlignment, cellName, htmlNote, textHorizontalAlignment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Comment {\n");
    
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    autoSize: ").append(toIndentedString(autoSize)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    isVisible: ").append(toIndentedString(isVisible)).append("\n");
    sb.append("    textOrientationType: ").append(toIndentedString(textOrientationType)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    textVerticalAlignment: ").append(toIndentedString(textVerticalAlignment)).append("\n");
    sb.append("    cellName: ").append(toIndentedString(cellName)).append("\n");
    sb.append("    htmlNote: ").append(toIndentedString(htmlNote)).append("\n");
    sb.append("    textHorizontalAlignment: ").append(toIndentedString(textHorizontalAlignment)).append("\n");
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

