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
 * HtmlSaveOptions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-13T18:09:02.334-05:00")
public class HtmlSaveOptions extends SaveOptions {
  @SerializedName("SaveAsSingleFile")
  private String saveAsSingleFile = null;

  @SerializedName("ExportHiddenWorksheet")
  private String exportHiddenWorksheet = null;

  @SerializedName("ExportGridLines")
  private String exportGridLines = null;

  @SerializedName("PresentationPreference")
  private String presentationPreference = null;

  @SerializedName("CellCssPrefix")
  private String cellCssPrefix = null;

  @SerializedName("TableCssId")
  private String tableCssId = null;

  @SerializedName("IsFullPathLink")
  private String isFullPathLink = null;

  @SerializedName("ExportWorksheetCSSSeparately")
  private String exportWorksheetCSSSeparately = null;

  @SerializedName("ExportSimilarBorderStyle")
  private String exportSimilarBorderStyle = null;

  @SerializedName("MergeEmptyTdForcely")
  private String mergeEmptyTdForcely = null;

  @SerializedName("ExportCellCoordinate")
  private String exportCellCoordinate = null;

  @SerializedName("ExportExtraHeadings")
  private String exportExtraHeadings = null;

  @SerializedName("ExportHeadings")
  private String exportHeadings = null;

  @SerializedName("ExportFormula")
  private String exportFormula = null;

  @SerializedName("AddTooltipText")
  private String addTooltipText = null;

  @SerializedName("ExportBogusRowData")
  private String exportBogusRowData = null;

  @SerializedName("ExcludeUnusedStyles")
  private String excludeUnusedStyles = null;

  @SerializedName("ExportDocumentProperties")
  private String exportDocumentProperties = null;

  @SerializedName("ExportWorksheetProperties")
  private String exportWorksheetProperties = null;

  @SerializedName("ExportWorkbookProperties")
  private String exportWorkbookProperties = null;

  @SerializedName("ExportFrameScriptsAndProperties")
  private String exportFrameScriptsAndProperties = null;

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

  public HtmlSaveOptions saveAsSingleFile(String saveAsSingleFile) {
    this.saveAsSingleFile = saveAsSingleFile;
    return this;
  }

   /**
   * Get saveAsSingleFile
   * @return saveAsSingleFile
  **/
  @ApiModelProperty(value = "")
  public String getSaveAsSingleFile() {
    return saveAsSingleFile;
  }

  public void setSaveAsSingleFile(String saveAsSingleFile) {
    this.saveAsSingleFile = saveAsSingleFile;
  }

  public HtmlSaveOptions exportHiddenWorksheet(String exportHiddenWorksheet) {
    this.exportHiddenWorksheet = exportHiddenWorksheet;
    return this;
  }

   /**
   * Get exportHiddenWorksheet
   * @return exportHiddenWorksheet
  **/
  @ApiModelProperty(value = "")
  public String getExportHiddenWorksheet() {
    return exportHiddenWorksheet;
  }

  public void setExportHiddenWorksheet(String exportHiddenWorksheet) {
    this.exportHiddenWorksheet = exportHiddenWorksheet;
  }

  public HtmlSaveOptions exportGridLines(String exportGridLines) {
    this.exportGridLines = exportGridLines;
    return this;
  }

   /**
   * Get exportGridLines
   * @return exportGridLines
  **/
  @ApiModelProperty(value = "")
  public String getExportGridLines() {
    return exportGridLines;
  }

  public void setExportGridLines(String exportGridLines) {
    this.exportGridLines = exportGridLines;
  }

  public HtmlSaveOptions presentationPreference(String presentationPreference) {
    this.presentationPreference = presentationPreference;
    return this;
  }

   /**
   * Get presentationPreference
   * @return presentationPreference
  **/
  @ApiModelProperty(value = "")
  public String getPresentationPreference() {
    return presentationPreference;
  }

  public void setPresentationPreference(String presentationPreference) {
    this.presentationPreference = presentationPreference;
  }

  public HtmlSaveOptions cellCssPrefix(String cellCssPrefix) {
    this.cellCssPrefix = cellCssPrefix;
    return this;
  }

   /**
   * Get cellCssPrefix
   * @return cellCssPrefix
  **/
  @ApiModelProperty(value = "")
  public String getCellCssPrefix() {
    return cellCssPrefix;
  }

  public void setCellCssPrefix(String cellCssPrefix) {
    this.cellCssPrefix = cellCssPrefix;
  }

  public HtmlSaveOptions tableCssId(String tableCssId) {
    this.tableCssId = tableCssId;
    return this;
  }

   /**
   * Get tableCssId
   * @return tableCssId
  **/
  @ApiModelProperty(value = "")
  public String getTableCssId() {
    return tableCssId;
  }

  public void setTableCssId(String tableCssId) {
    this.tableCssId = tableCssId;
  }

  public HtmlSaveOptions isFullPathLink(String isFullPathLink) {
    this.isFullPathLink = isFullPathLink;
    return this;
  }

   /**
   * Get isFullPathLink
   * @return isFullPathLink
  **/
  @ApiModelProperty(value = "")
  public String getIsFullPathLink() {
    return isFullPathLink;
  }

  public void setIsFullPathLink(String isFullPathLink) {
    this.isFullPathLink = isFullPathLink;
  }

  public HtmlSaveOptions exportWorksheetCSSSeparately(String exportWorksheetCSSSeparately) {
    this.exportWorksheetCSSSeparately = exportWorksheetCSSSeparately;
    return this;
  }

   /**
   * Get exportWorksheetCSSSeparately
   * @return exportWorksheetCSSSeparately
  **/
  @ApiModelProperty(value = "")
  public String getExportWorksheetCSSSeparately() {
    return exportWorksheetCSSSeparately;
  }

  public void setExportWorksheetCSSSeparately(String exportWorksheetCSSSeparately) {
    this.exportWorksheetCSSSeparately = exportWorksheetCSSSeparately;
  }

  public HtmlSaveOptions exportSimilarBorderStyle(String exportSimilarBorderStyle) {
    this.exportSimilarBorderStyle = exportSimilarBorderStyle;
    return this;
  }

   /**
   * Get exportSimilarBorderStyle
   * @return exportSimilarBorderStyle
  **/
  @ApiModelProperty(value = "")
  public String getExportSimilarBorderStyle() {
    return exportSimilarBorderStyle;
  }

  public void setExportSimilarBorderStyle(String exportSimilarBorderStyle) {
    this.exportSimilarBorderStyle = exportSimilarBorderStyle;
  }

  public HtmlSaveOptions mergeEmptyTdForcely(String mergeEmptyTdForcely) {
    this.mergeEmptyTdForcely = mergeEmptyTdForcely;
    return this;
  }

   /**
   * Get mergeEmptyTdForcely
   * @return mergeEmptyTdForcely
  **/
  @ApiModelProperty(value = "")
  public String getMergeEmptyTdForcely() {
    return mergeEmptyTdForcely;
  }

  public void setMergeEmptyTdForcely(String mergeEmptyTdForcely) {
    this.mergeEmptyTdForcely = mergeEmptyTdForcely;
  }

  public HtmlSaveOptions exportCellCoordinate(String exportCellCoordinate) {
    this.exportCellCoordinate = exportCellCoordinate;
    return this;
  }

   /**
   * Get exportCellCoordinate
   * @return exportCellCoordinate
  **/
  @ApiModelProperty(value = "")
  public String getExportCellCoordinate() {
    return exportCellCoordinate;
  }

  public void setExportCellCoordinate(String exportCellCoordinate) {
    this.exportCellCoordinate = exportCellCoordinate;
  }

  public HtmlSaveOptions exportExtraHeadings(String exportExtraHeadings) {
    this.exportExtraHeadings = exportExtraHeadings;
    return this;
  }

   /**
   * Get exportExtraHeadings
   * @return exportExtraHeadings
  **/
  @ApiModelProperty(value = "")
  public String getExportExtraHeadings() {
    return exportExtraHeadings;
  }

  public void setExportExtraHeadings(String exportExtraHeadings) {
    this.exportExtraHeadings = exportExtraHeadings;
  }

  public HtmlSaveOptions exportHeadings(String exportHeadings) {
    this.exportHeadings = exportHeadings;
    return this;
  }

   /**
   * Get exportHeadings
   * @return exportHeadings
  **/
  @ApiModelProperty(value = "")
  public String getExportHeadings() {
    return exportHeadings;
  }

  public void setExportHeadings(String exportHeadings) {
    this.exportHeadings = exportHeadings;
  }

  public HtmlSaveOptions exportFormula(String exportFormula) {
    this.exportFormula = exportFormula;
    return this;
  }

   /**
   * Get exportFormula
   * @return exportFormula
  **/
  @ApiModelProperty(value = "")
  public String getExportFormula() {
    return exportFormula;
  }

  public void setExportFormula(String exportFormula) {
    this.exportFormula = exportFormula;
  }

  public HtmlSaveOptions addTooltipText(String addTooltipText) {
    this.addTooltipText = addTooltipText;
    return this;
  }

   /**
   * Get addTooltipText
   * @return addTooltipText
  **/
  @ApiModelProperty(value = "")
  public String getAddTooltipText() {
    return addTooltipText;
  }

  public void setAddTooltipText(String addTooltipText) {
    this.addTooltipText = addTooltipText;
  }

  public HtmlSaveOptions exportBogusRowData(String exportBogusRowData) {
    this.exportBogusRowData = exportBogusRowData;
    return this;
  }

   /**
   * Get exportBogusRowData
   * @return exportBogusRowData
  **/
  @ApiModelProperty(value = "")
  public String getExportBogusRowData() {
    return exportBogusRowData;
  }

  public void setExportBogusRowData(String exportBogusRowData) {
    this.exportBogusRowData = exportBogusRowData;
  }

  public HtmlSaveOptions excludeUnusedStyles(String excludeUnusedStyles) {
    this.excludeUnusedStyles = excludeUnusedStyles;
    return this;
  }

   /**
   * Get excludeUnusedStyles
   * @return excludeUnusedStyles
  **/
  @ApiModelProperty(value = "")
  public String getExcludeUnusedStyles() {
    return excludeUnusedStyles;
  }

  public void setExcludeUnusedStyles(String excludeUnusedStyles) {
    this.excludeUnusedStyles = excludeUnusedStyles;
  }

  public HtmlSaveOptions exportDocumentProperties(String exportDocumentProperties) {
    this.exportDocumentProperties = exportDocumentProperties;
    return this;
  }

   /**
   * Get exportDocumentProperties
   * @return exportDocumentProperties
  **/
  @ApiModelProperty(value = "")
  public String getExportDocumentProperties() {
    return exportDocumentProperties;
  }

  public void setExportDocumentProperties(String exportDocumentProperties) {
    this.exportDocumentProperties = exportDocumentProperties;
  }

  public HtmlSaveOptions exportWorksheetProperties(String exportWorksheetProperties) {
    this.exportWorksheetProperties = exportWorksheetProperties;
    return this;
  }

   /**
   * Get exportWorksheetProperties
   * @return exportWorksheetProperties
  **/
  @ApiModelProperty(value = "")
  public String getExportWorksheetProperties() {
    return exportWorksheetProperties;
  }

  public void setExportWorksheetProperties(String exportWorksheetProperties) {
    this.exportWorksheetProperties = exportWorksheetProperties;
  }

  public HtmlSaveOptions exportWorkbookProperties(String exportWorkbookProperties) {
    this.exportWorkbookProperties = exportWorkbookProperties;
    return this;
  }

   /**
   * Get exportWorkbookProperties
   * @return exportWorkbookProperties
  **/
  @ApiModelProperty(value = "")
  public String getExportWorkbookProperties() {
    return exportWorkbookProperties;
  }

  public void setExportWorkbookProperties(String exportWorkbookProperties) {
    this.exportWorkbookProperties = exportWorkbookProperties;
  }

  public HtmlSaveOptions exportFrameScriptsAndProperties(String exportFrameScriptsAndProperties) {
    this.exportFrameScriptsAndProperties = exportFrameScriptsAndProperties;
    return this;
  }

   /**
   * Get exportFrameScriptsAndProperties
   * @return exportFrameScriptsAndProperties
  **/
  @ApiModelProperty(value = "")
  public String getExportFrameScriptsAndProperties() {
    return exportFrameScriptsAndProperties;
  }

  public void setExportFrameScriptsAndProperties(String exportFrameScriptsAndProperties) {
    this.exportFrameScriptsAndProperties = exportFrameScriptsAndProperties;
  }

  public HtmlSaveOptions attachedFilesDirectory(String attachedFilesDirectory) {
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

  public HtmlSaveOptions attachedFilesUrlPrefix(String attachedFilesUrlPrefix) {
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

  public HtmlSaveOptions encoding(String encoding) {
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

  public HtmlSaveOptions exportActiveWorksheetOnly(Boolean exportActiveWorksheetOnly) {
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

  public HtmlSaveOptions exportChartImageFormat(String exportChartImageFormat) {
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

  public HtmlSaveOptions exportImagesAsBase64(Boolean exportImagesAsBase64) {
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

  public HtmlSaveOptions hiddenColDisplayType(String hiddenColDisplayType) {
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

  public HtmlSaveOptions hiddenRowDisplayType(String hiddenRowDisplayType) {
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

  public HtmlSaveOptions htmlCrossStringType(String htmlCrossStringType) {
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

  public HtmlSaveOptions isExpImageToTempDir(Boolean isExpImageToTempDir) {
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

  public HtmlSaveOptions pageTitle(String pageTitle) {
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

  public HtmlSaveOptions parseHtmlTagInCell(Boolean parseHtmlTagInCell) {
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
    HtmlSaveOptions htmlSaveOptions = (HtmlSaveOptions) o;
    return Objects.equals(this.saveAsSingleFile, htmlSaveOptions.saveAsSingleFile) &&
        Objects.equals(this.exportHiddenWorksheet, htmlSaveOptions.exportHiddenWorksheet) &&
        Objects.equals(this.exportGridLines, htmlSaveOptions.exportGridLines) &&
        Objects.equals(this.presentationPreference, htmlSaveOptions.presentationPreference) &&
        Objects.equals(this.cellCssPrefix, htmlSaveOptions.cellCssPrefix) &&
        Objects.equals(this.tableCssId, htmlSaveOptions.tableCssId) &&
        Objects.equals(this.isFullPathLink, htmlSaveOptions.isFullPathLink) &&
        Objects.equals(this.exportWorksheetCSSSeparately, htmlSaveOptions.exportWorksheetCSSSeparately) &&
        Objects.equals(this.exportSimilarBorderStyle, htmlSaveOptions.exportSimilarBorderStyle) &&
        Objects.equals(this.mergeEmptyTdForcely, htmlSaveOptions.mergeEmptyTdForcely) &&
        Objects.equals(this.exportCellCoordinate, htmlSaveOptions.exportCellCoordinate) &&
        Objects.equals(this.exportExtraHeadings, htmlSaveOptions.exportExtraHeadings) &&
        Objects.equals(this.exportHeadings, htmlSaveOptions.exportHeadings) &&
        Objects.equals(this.exportFormula, htmlSaveOptions.exportFormula) &&
        Objects.equals(this.addTooltipText, htmlSaveOptions.addTooltipText) &&
        Objects.equals(this.exportBogusRowData, htmlSaveOptions.exportBogusRowData) &&
        Objects.equals(this.excludeUnusedStyles, htmlSaveOptions.excludeUnusedStyles) &&
        Objects.equals(this.exportDocumentProperties, htmlSaveOptions.exportDocumentProperties) &&
        Objects.equals(this.exportWorksheetProperties, htmlSaveOptions.exportWorksheetProperties) &&
        Objects.equals(this.exportWorkbookProperties, htmlSaveOptions.exportWorkbookProperties) &&
        Objects.equals(this.exportFrameScriptsAndProperties, htmlSaveOptions.exportFrameScriptsAndProperties) &&
        Objects.equals(this.attachedFilesDirectory, htmlSaveOptions.attachedFilesDirectory) &&
        Objects.equals(this.attachedFilesUrlPrefix, htmlSaveOptions.attachedFilesUrlPrefix) &&
        Objects.equals(this.encoding, htmlSaveOptions.encoding) &&
        Objects.equals(this.exportActiveWorksheetOnly, htmlSaveOptions.exportActiveWorksheetOnly) &&
        Objects.equals(this.exportChartImageFormat, htmlSaveOptions.exportChartImageFormat) &&
        Objects.equals(this.exportImagesAsBase64, htmlSaveOptions.exportImagesAsBase64) &&
        Objects.equals(this.hiddenColDisplayType, htmlSaveOptions.hiddenColDisplayType) &&
        Objects.equals(this.hiddenRowDisplayType, htmlSaveOptions.hiddenRowDisplayType) &&
        Objects.equals(this.htmlCrossStringType, htmlSaveOptions.htmlCrossStringType) &&
        Objects.equals(this.isExpImageToTempDir, htmlSaveOptions.isExpImageToTempDir) &&
        Objects.equals(this.pageTitle, htmlSaveOptions.pageTitle) &&
        Objects.equals(this.parseHtmlTagInCell, htmlSaveOptions.parseHtmlTagInCell) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(saveAsSingleFile, exportHiddenWorksheet, exportGridLines, presentationPreference, cellCssPrefix, tableCssId, isFullPathLink, exportWorksheetCSSSeparately, exportSimilarBorderStyle, mergeEmptyTdForcely, exportCellCoordinate, exportExtraHeadings, exportHeadings, exportFormula, addTooltipText, exportBogusRowData, excludeUnusedStyles, exportDocumentProperties, exportWorksheetProperties, exportWorkbookProperties, exportFrameScriptsAndProperties, attachedFilesDirectory, attachedFilesUrlPrefix, encoding, exportActiveWorksheetOnly, exportChartImageFormat, exportImagesAsBase64, hiddenColDisplayType, hiddenRowDisplayType, htmlCrossStringType, isExpImageToTempDir, pageTitle, parseHtmlTagInCell, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HtmlSaveOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    saveAsSingleFile: ").append(toIndentedString(saveAsSingleFile)).append("\n");
    sb.append("    exportHiddenWorksheet: ").append(toIndentedString(exportHiddenWorksheet)).append("\n");
    sb.append("    exportGridLines: ").append(toIndentedString(exportGridLines)).append("\n");
    sb.append("    presentationPreference: ").append(toIndentedString(presentationPreference)).append("\n");
    sb.append("    cellCssPrefix: ").append(toIndentedString(cellCssPrefix)).append("\n");
    sb.append("    tableCssId: ").append(toIndentedString(tableCssId)).append("\n");
    sb.append("    isFullPathLink: ").append(toIndentedString(isFullPathLink)).append("\n");
    sb.append("    exportWorksheetCSSSeparately: ").append(toIndentedString(exportWorksheetCSSSeparately)).append("\n");
    sb.append("    exportSimilarBorderStyle: ").append(toIndentedString(exportSimilarBorderStyle)).append("\n");
    sb.append("    mergeEmptyTdForcely: ").append(toIndentedString(mergeEmptyTdForcely)).append("\n");
    sb.append("    exportCellCoordinate: ").append(toIndentedString(exportCellCoordinate)).append("\n");
    sb.append("    exportExtraHeadings: ").append(toIndentedString(exportExtraHeadings)).append("\n");
    sb.append("    exportHeadings: ").append(toIndentedString(exportHeadings)).append("\n");
    sb.append("    exportFormula: ").append(toIndentedString(exportFormula)).append("\n");
    sb.append("    addTooltipText: ").append(toIndentedString(addTooltipText)).append("\n");
    sb.append("    exportBogusRowData: ").append(toIndentedString(exportBogusRowData)).append("\n");
    sb.append("    excludeUnusedStyles: ").append(toIndentedString(excludeUnusedStyles)).append("\n");
    sb.append("    exportDocumentProperties: ").append(toIndentedString(exportDocumentProperties)).append("\n");
    sb.append("    exportWorksheetProperties: ").append(toIndentedString(exportWorksheetProperties)).append("\n");
    sb.append("    exportWorkbookProperties: ").append(toIndentedString(exportWorkbookProperties)).append("\n");
    sb.append("    exportFrameScriptsAndProperties: ").append(toIndentedString(exportFrameScriptsAndProperties)).append("\n");
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

