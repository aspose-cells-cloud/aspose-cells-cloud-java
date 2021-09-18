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
import com.aspose.cloud.cells.model.SaveOptions;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * MHtmlSaveOptions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-09-17T23:42:04.472-05:00")
public class MHtmlSaveOptions extends SaveOptions {
  @SerializedName("AttachedFilesDirectory")
  private String attachedFilesDirectory = null;

  @SerializedName("AttachedFilesUrlPrefix")
  private String attachedFilesUrlPrefix = null;

  @SerializedName("Encoding")
  private String encoding = null;

  @SerializedName("ExportActiveWorksheetOnly")
  private Boolean exportActiveWorksheetOnly = null;

  @SerializedName("ExportChartImageFormat")
  private String exportChartImageFormat = null;

  @SerializedName("ExportImagesAsBase64")
  private Boolean exportImagesAsBase64 = null;

  @SerializedName("HiddenColDisplayType")
  private String hiddenColDisplayType = null;

  @SerializedName("HiddenRowDisplayType")
  private String hiddenRowDisplayType = null;

  @SerializedName("HtmlCrossStringType")
  private String htmlCrossStringType = null;

  @SerializedName("IsExpImageToTempDir")
  private Boolean isExpImageToTempDir = null;

  @SerializedName("PageTitle")
  private String pageTitle = null;

  @SerializedName("ParseHtmlTagInCell")
  private Boolean parseHtmlTagInCell = null;

  public MHtmlSaveOptions attachedFilesDirectory(String attachedFilesDirectory) {
    this.attachedFilesDirectory = attachedFilesDirectory;
    return this;
  }

   /**
   * Get attachedFilesDirectory
   * @return attachedFilesDirectory
  **/
  @ApiModelProperty(value = "")
  public String getAttachedFilesDirectory() {
    return attachedFilesDirectory;
  }

  public void setAttachedFilesDirectory(String attachedFilesDirectory) {
    this.attachedFilesDirectory = attachedFilesDirectory;
  }

  public MHtmlSaveOptions attachedFilesUrlPrefix(String attachedFilesUrlPrefix) {
    this.attachedFilesUrlPrefix = attachedFilesUrlPrefix;
    return this;
  }

   /**
   * Get attachedFilesUrlPrefix
   * @return attachedFilesUrlPrefix
  **/
  @ApiModelProperty(value = "")
  public String getAttachedFilesUrlPrefix() {
    return attachedFilesUrlPrefix;
  }

  public void setAttachedFilesUrlPrefix(String attachedFilesUrlPrefix) {
    this.attachedFilesUrlPrefix = attachedFilesUrlPrefix;
  }

  public MHtmlSaveOptions encoding(String encoding) {
    this.encoding = encoding;
    return this;
  }

   /**
   * Get encoding
   * @return encoding
  **/
  @ApiModelProperty(value = "")
  public String getEncoding() {
    return encoding;
  }

  public void setEncoding(String encoding) {
    this.encoding = encoding;
  }

  public MHtmlSaveOptions exportActiveWorksheetOnly(Boolean exportActiveWorksheetOnly) {
    this.exportActiveWorksheetOnly = exportActiveWorksheetOnly;
    return this;
  }

   /**
   * Get exportActiveWorksheetOnly
   * @return exportActiveWorksheetOnly
  **/
  @ApiModelProperty(value = "")
  public Boolean ExportActiveWorksheetOnly() {
    return exportActiveWorksheetOnly;
  }

  public void setExportActiveWorksheetOnly(Boolean exportActiveWorksheetOnly) {
    this.exportActiveWorksheetOnly = exportActiveWorksheetOnly;
  }

  public MHtmlSaveOptions exportChartImageFormat(String exportChartImageFormat) {
    this.exportChartImageFormat = exportChartImageFormat;
    return this;
  }

   /**
   * Get exportChartImageFormat
   * @return exportChartImageFormat
  **/
  @ApiModelProperty(value = "")
  public String getExportChartImageFormat() {
    return exportChartImageFormat;
  }

  public void setExportChartImageFormat(String exportChartImageFormat) {
    this.exportChartImageFormat = exportChartImageFormat;
  }

  public MHtmlSaveOptions exportImagesAsBase64(Boolean exportImagesAsBase64) {
    this.exportImagesAsBase64 = exportImagesAsBase64;
    return this;
  }

   /**
   * Get exportImagesAsBase64
   * @return exportImagesAsBase64
  **/
  @ApiModelProperty(value = "")
  public Boolean ExportImagesAsBase64() {
    return exportImagesAsBase64;
  }

  public void setExportImagesAsBase64(Boolean exportImagesAsBase64) {
    this.exportImagesAsBase64 = exportImagesAsBase64;
  }

  public MHtmlSaveOptions hiddenColDisplayType(String hiddenColDisplayType) {
    this.hiddenColDisplayType = hiddenColDisplayType;
    return this;
  }

   /**
   * Get hiddenColDisplayType
   * @return hiddenColDisplayType
  **/
  @ApiModelProperty(value = "")
  public String getHiddenColDisplayType() {
    return hiddenColDisplayType;
  }

  public void setHiddenColDisplayType(String hiddenColDisplayType) {
    this.hiddenColDisplayType = hiddenColDisplayType;
  }

  public MHtmlSaveOptions hiddenRowDisplayType(String hiddenRowDisplayType) {
    this.hiddenRowDisplayType = hiddenRowDisplayType;
    return this;
  }

   /**
   * Get hiddenRowDisplayType
   * @return hiddenRowDisplayType
  **/
  @ApiModelProperty(value = "")
  public String getHiddenRowDisplayType() {
    return hiddenRowDisplayType;
  }

  public void setHiddenRowDisplayType(String hiddenRowDisplayType) {
    this.hiddenRowDisplayType = hiddenRowDisplayType;
  }

  public MHtmlSaveOptions htmlCrossStringType(String htmlCrossStringType) {
    this.htmlCrossStringType = htmlCrossStringType;
    return this;
  }

   /**
   * Get htmlCrossStringType
   * @return htmlCrossStringType
  **/
  @ApiModelProperty(value = "")
  public String getHtmlCrossStringType() {
    return htmlCrossStringType;
  }

  public void setHtmlCrossStringType(String htmlCrossStringType) {
    this.htmlCrossStringType = htmlCrossStringType;
  }

  public MHtmlSaveOptions isExpImageToTempDir(Boolean isExpImageToTempDir) {
    this.isExpImageToTempDir = isExpImageToTempDir;
    return this;
  }

   /**
   * Get isExpImageToTempDir
   * @return isExpImageToTempDir
  **/
  @ApiModelProperty(value = "")
  public Boolean IsExpImageToTempDir() {
    return isExpImageToTempDir;
  }

  public void setIsExpImageToTempDir(Boolean isExpImageToTempDir) {
    this.isExpImageToTempDir = isExpImageToTempDir;
  }

  public MHtmlSaveOptions pageTitle(String pageTitle) {
    this.pageTitle = pageTitle;
    return this;
  }

   /**
   * Get pageTitle
   * @return pageTitle
  **/
  @ApiModelProperty(value = "")
  public String getPageTitle() {
    return pageTitle;
  }

  public void setPageTitle(String pageTitle) {
    this.pageTitle = pageTitle;
  }

  public MHtmlSaveOptions parseHtmlTagInCell(Boolean parseHtmlTagInCell) {
    this.parseHtmlTagInCell = parseHtmlTagInCell;
    return this;
  }

   /**
   * Get parseHtmlTagInCell
   * @return parseHtmlTagInCell
  **/
  @ApiModelProperty(value = "")
  public Boolean ParseHtmlTagInCell() {
    return parseHtmlTagInCell;
  }

  public void setParseHtmlTagInCell(Boolean parseHtmlTagInCell) {
    this.parseHtmlTagInCell = parseHtmlTagInCell;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MHtmlSaveOptions mhtmlSaveOptions = (MHtmlSaveOptions) o;
    return Objects.equals(this.attachedFilesDirectory, mhtmlSaveOptions.attachedFilesDirectory) &&
        Objects.equals(this.attachedFilesUrlPrefix, mhtmlSaveOptions.attachedFilesUrlPrefix) &&
        Objects.equals(this.encoding, mhtmlSaveOptions.encoding) &&
        Objects.equals(this.exportActiveWorksheetOnly, mhtmlSaveOptions.exportActiveWorksheetOnly) &&
        Objects.equals(this.exportChartImageFormat, mhtmlSaveOptions.exportChartImageFormat) &&
        Objects.equals(this.exportImagesAsBase64, mhtmlSaveOptions.exportImagesAsBase64) &&
        Objects.equals(this.hiddenColDisplayType, mhtmlSaveOptions.hiddenColDisplayType) &&
        Objects.equals(this.hiddenRowDisplayType, mhtmlSaveOptions.hiddenRowDisplayType) &&
        Objects.equals(this.htmlCrossStringType, mhtmlSaveOptions.htmlCrossStringType) &&
        Objects.equals(this.isExpImageToTempDir, mhtmlSaveOptions.isExpImageToTempDir) &&
        Objects.equals(this.pageTitle, mhtmlSaveOptions.pageTitle) &&
        Objects.equals(this.parseHtmlTagInCell, mhtmlSaveOptions.parseHtmlTagInCell) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachedFilesDirectory, attachedFilesUrlPrefix, encoding, exportActiveWorksheetOnly, exportChartImageFormat, exportImagesAsBase64, hiddenColDisplayType, hiddenRowDisplayType, htmlCrossStringType, isExpImageToTempDir, pageTitle, parseHtmlTagInCell, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MHtmlSaveOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    attachedFilesDirectory: ").append(toIndentedString(attachedFilesDirectory)).append("\n");
    sb.append("    attachedFilesUrlPrefix: ").append(toIndentedString(attachedFilesUrlPrefix)).append("\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
    sb.append("    exportActiveWorksheetOnly: ").append(toIndentedString(exportActiveWorksheetOnly)).append("\n");
    sb.append("    exportChartImageFormat: ").append(toIndentedString(exportChartImageFormat)).append("\n");
    sb.append("    exportImagesAsBase64: ").append(toIndentedString(exportImagesAsBase64)).append("\n");
    sb.append("    hiddenColDisplayType: ").append(toIndentedString(hiddenColDisplayType)).append("\n");
    sb.append("    hiddenRowDisplayType: ").append(toIndentedString(hiddenRowDisplayType)).append("\n");
    sb.append("    htmlCrossStringType: ").append(toIndentedString(htmlCrossStringType)).append("\n");
    sb.append("    isExpImageToTempDir: ").append(toIndentedString(isExpImageToTempDir)).append("\n");
    sb.append("    pageTitle: ").append(toIndentedString(pageTitle)).append("\n");
    sb.append("    parseHtmlTagInCell: ").append(toIndentedString(parseHtmlTagInCell)).append("\n");
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

