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
 * Workbook
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-07-08T01:54:35.499-05:00")
public class Workbook {
  @SerializedName("Links")
  private List<Link> links = null;

  @SerializedName("Settings")
  private LinkElement settings = null;

  @SerializedName("IsProtected")
  private String isProtected = null;

  @SerializedName("IsWriteProtected")
  private String isWriteProtected = null;

  @SerializedName("FileName")
  private String fileName = null;

  @SerializedName("DocumentProperties")
  private LinkElement documentProperties = null;

  @SerializedName("Names")
  private LinkElement names = null;

  @SerializedName("DefaultStyle")
  private LinkElement defaultStyle = null;

  @SerializedName("IsEncryption")
  private String isEncryption = null;

  @SerializedName("Worksheets")
  private LinkElement worksheets = null;

  @SerializedName("Password")
  private String password = null;

  public Workbook links(List<Link> links) {
    this.links = links;
    return this;
  }

  public Workbook addLinksItem(Link linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public List<Link> getLinks() {
    return links;
  }

  public void setLinks(List<Link> links) {
    this.links = links;
  }

  public Workbook settings(LinkElement settings) {
    this.settings = settings;
    return this;
  }

   /**
   * Get settings
   * @return settings
  **/
  @ApiModelProperty(value = "")
  public LinkElement getSettings() {
    return settings;
  }

  public void setSettings(LinkElement settings) {
    this.settings = settings;
  }

  public Workbook isProtected(String isProtected) {
    this.isProtected = isProtected;
    return this;
  }

   /**
   * Get isProtected
   * @return isProtected
  **/
  @ApiModelProperty(value = "")
  public String getIsProtected() {
    return isProtected;
  }

  public void setIsProtected(String isProtected) {
    this.isProtected = isProtected;
  }

  public Workbook isWriteProtected(String isWriteProtected) {
    this.isWriteProtected = isWriteProtected;
    return this;
  }

   /**
   * Get isWriteProtected
   * @return isWriteProtected
  **/
  @ApiModelProperty(value = "")
  public String getIsWriteProtected() {
    return isWriteProtected;
  }

  public void setIsWriteProtected(String isWriteProtected) {
    this.isWriteProtected = isWriteProtected;
  }

  public Workbook fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * Get fileName
   * @return fileName
  **/
  @ApiModelProperty(value = "")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public Workbook documentProperties(LinkElement documentProperties) {
    this.documentProperties = documentProperties;
    return this;
  }

   /**
   * Get documentProperties
   * @return documentProperties
  **/
  @ApiModelProperty(value = "")
  public LinkElement getDocumentProperties() {
    return documentProperties;
  }

  public void setDocumentProperties(LinkElement documentProperties) {
    this.documentProperties = documentProperties;
  }

  public Workbook names(LinkElement names) {
    this.names = names;
    return this;
  }

   /**
   * Get names
   * @return names
  **/
  @ApiModelProperty(value = "")
  public LinkElement getNames() {
    return names;
  }

  public void setNames(LinkElement names) {
    this.names = names;
  }

  public Workbook defaultStyle(LinkElement defaultStyle) {
    this.defaultStyle = defaultStyle;
    return this;
  }

   /**
   * Get defaultStyle
   * @return defaultStyle
  **/
  @ApiModelProperty(value = "")
  public LinkElement getDefaultStyle() {
    return defaultStyle;
  }

  public void setDefaultStyle(LinkElement defaultStyle) {
    this.defaultStyle = defaultStyle;
  }

  public Workbook isEncryption(String isEncryption) {
    this.isEncryption = isEncryption;
    return this;
  }

   /**
   * Get isEncryption
   * @return isEncryption
  **/
  @ApiModelProperty(value = "")
  public String getIsEncryption() {
    return isEncryption;
  }

  public void setIsEncryption(String isEncryption) {
    this.isEncryption = isEncryption;
  }

  public Workbook worksheets(LinkElement worksheets) {
    this.worksheets = worksheets;
    return this;
  }

   /**
   * Get worksheets
   * @return worksheets
  **/
  @ApiModelProperty(value = "")
  public LinkElement getWorksheets() {
    return worksheets;
  }

  public void setWorksheets(LinkElement worksheets) {
    this.worksheets = worksheets;
  }

  public Workbook password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @ApiModelProperty(value = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Workbook workbook = (Workbook) o;
    return Objects.equals(this.links, workbook.links) &&
        Objects.equals(this.settings, workbook.settings) &&
        Objects.equals(this.isProtected, workbook.isProtected) &&
        Objects.equals(this.isWriteProtected, workbook.isWriteProtected) &&
        Objects.equals(this.fileName, workbook.fileName) &&
        Objects.equals(this.documentProperties, workbook.documentProperties) &&
        Objects.equals(this.names, workbook.names) &&
        Objects.equals(this.defaultStyle, workbook.defaultStyle) &&
        Objects.equals(this.isEncryption, workbook.isEncryption) &&
        Objects.equals(this.worksheets, workbook.worksheets) &&
        Objects.equals(this.password, workbook.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, settings, isProtected, isWriteProtected, fileName, documentProperties, names, defaultStyle, isEncryption, worksheets, password);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Workbook {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    isProtected: ").append(toIndentedString(isProtected)).append("\n");
    sb.append("    isWriteProtected: ").append(toIndentedString(isWriteProtected)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    documentProperties: ").append(toIndentedString(documentProperties)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    defaultStyle: ").append(toIndentedString(defaultStyle)).append("\n");
    sb.append("    isEncryption: ").append(toIndentedString(isEncryption)).append("\n");
    sb.append("    worksheets: ").append(toIndentedString(worksheets)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

