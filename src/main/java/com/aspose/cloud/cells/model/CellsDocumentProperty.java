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
 * CellsDocumentProperty
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-07-08T01:54:35.499-05:00")
public class CellsDocumentProperty {
  @SerializedName("link")
  private Link link = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Value")
  private String value = null;

  @SerializedName("IsLinkedToContent")
  private String isLinkedToContent = null;

  @SerializedName("Source")
  private String source = null;

  @SerializedName("Type")
  private String type = null;

  @SerializedName("IsGeneratedName")
  private String isGeneratedName = null;

  public CellsDocumentProperty link(Link link) {
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

  public CellsDocumentProperty name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Returns the name of the property.             
   * @return name
  **/
  @ApiModelProperty(value = "Returns the name of the property.             ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CellsDocumentProperty value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Gets or sets the value of the property.
   * @return value
  **/
  @ApiModelProperty(value = "Gets or sets the value of the property.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public CellsDocumentProperty isLinkedToContent(String isLinkedToContent) {
    this.isLinkedToContent = isLinkedToContent;
    return this;
  }

   /**
   * Indicates whether this property is linked to content
   * @return isLinkedToContent
  **/
  @ApiModelProperty(value = "Indicates whether this property is linked to content")
  public String getIsLinkedToContent() {
    return isLinkedToContent;
  }

  public void setIsLinkedToContent(String isLinkedToContent) {
    this.isLinkedToContent = isLinkedToContent;
  }

  public CellsDocumentProperty source(String source) {
    this.source = source;
    return this;
  }

   /**
   * The linked content source.
   * @return source
  **/
  @ApiModelProperty(value = "The linked content source.")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public CellsDocumentProperty type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Gets the data type of the property.             
   * @return type
  **/
  @ApiModelProperty(value = "Gets the data type of the property.             ")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public CellsDocumentProperty isGeneratedName(String isGeneratedName) {
    this.isGeneratedName = isGeneratedName;
    return this;
  }

   /**
   * Returns true if this property does not have a name in the OLE2 storage and a   unique name was generated only for the public API.             
   * @return isGeneratedName
  **/
  @ApiModelProperty(value = "Returns true if this property does not have a name in the OLE2 storage and a   unique name was generated only for the public API.             ")
  public String getIsGeneratedName() {
    return isGeneratedName;
  }

  public void setIsGeneratedName(String isGeneratedName) {
    this.isGeneratedName = isGeneratedName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CellsDocumentProperty cellsDocumentProperty = (CellsDocumentProperty) o;
    return Objects.equals(this.link, cellsDocumentProperty.link) &&
        Objects.equals(this.name, cellsDocumentProperty.name) &&
        Objects.equals(this.value, cellsDocumentProperty.value) &&
        Objects.equals(this.isLinkedToContent, cellsDocumentProperty.isLinkedToContent) &&
        Objects.equals(this.source, cellsDocumentProperty.source) &&
        Objects.equals(this.type, cellsDocumentProperty.type) &&
        Objects.equals(this.isGeneratedName, cellsDocumentProperty.isGeneratedName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, name, value, isLinkedToContent, source, type, isGeneratedName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CellsDocumentProperty {\n");
    
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    isLinkedToContent: ").append(toIndentedString(isLinkedToContent)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    isGeneratedName: ").append(toIndentedString(isGeneratedName)).append("\n");
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

