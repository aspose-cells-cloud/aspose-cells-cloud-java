/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="HtmlSaveOptions.java">
 *   Copyright (c) 2025 Aspose.Cells Cloud
 * </copyright>
 * <summary>
 *   Permission is hereby granted, free of charge, to any person obtaining a copy
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
 * --------------------------------------------------------------------------------
 */

package com.aspose.cloud.cells.model;

import java.util.Objects;
import io.swagger.annotations.ApiModelProperty;
import com.aspose.cloud.cells.model.*;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import java.time.OffsetDateTime;


public class HtmlSaveOptions  extends  SaveOptions {
        @SerializedName("ExportPageHeaders")
        private Boolean exportPageHeaders ;

        public  HtmlSaveOptions  exportPageHeaders(Boolean  exportPageHeaders) {
            this.exportPageHeaders =  exportPageHeaders;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getExportPageHeaders() {
            return exportPageHeaders;
        }

        public void setExportPageHeaders(Boolean exportPageHeaders) {
            this.exportPageHeaders = exportPageHeaders;
        }

        @SerializedName("ExportPageFooters")
        private Boolean exportPageFooters ;

        public  HtmlSaveOptions  exportPageFooters(Boolean  exportPageFooters) {
            this.exportPageFooters =  exportPageFooters;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getExportPageFooters() {
            return exportPageFooters;
        }

        public void setExportPageFooters(Boolean exportPageFooters) {
            this.exportPageFooters = exportPageFooters;
        }

        @SerializedName("ExportRowColumnHeadings")
        private Boolean exportRowColumnHeadings ;

        public  HtmlSaveOptions  exportRowColumnHeadings(Boolean  exportRowColumnHeadings) {
            this.exportRowColumnHeadings =  exportRowColumnHeadings;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getExportRowColumnHeadings() {
            return exportRowColumnHeadings;
        }

        public void setExportRowColumnHeadings(Boolean exportRowColumnHeadings) {
            this.exportRowColumnHeadings = exportRowColumnHeadings;
        }

        @SerializedName("ShowAllSheets")
        private Boolean showAllSheets ;

        public  HtmlSaveOptions  showAllSheets(Boolean  showAllSheets) {
            this.showAllSheets =  showAllSheets;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getShowAllSheets() {
            return showAllSheets;
        }

        public void setShowAllSheets(Boolean showAllSheets) {
            this.showAllSheets = showAllSheets;
        }

        @SerializedName("ImageOptions")
        private ImageOrPrintOptions imageOptions ;

        public  HtmlSaveOptions  imageOptions(ImageOrPrintOptions  imageOptions) {
            this.imageOptions =  imageOptions;
            return this;
        }

        @ApiModelProperty(value = "")
        public ImageOrPrintOptions getImageOptions() {
            return imageOptions;
        }

        public void setImageOptions(ImageOrPrintOptions imageOptions) {
            this.imageOptions = imageOptions;
        }

        @SerializedName("SaveAsSingleFile")
        private Boolean saveAsSingleFile ;

        public  HtmlSaveOptions  saveAsSingleFile(Boolean  saveAsSingleFile) {
            this.saveAsSingleFile =  saveAsSingleFile;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getSaveAsSingleFile() {
            return saveAsSingleFile;
        }

        public void setSaveAsSingleFile(Boolean saveAsSingleFile) {
            this.saveAsSingleFile = saveAsSingleFile;
        }

        @SerializedName("ExportHiddenWorksheet")
        private Boolean exportHiddenWorksheet ;

        public  HtmlSaveOptions  exportHiddenWorksheet(Boolean  exportHiddenWorksheet) {
            this.exportHiddenWorksheet =  exportHiddenWorksheet;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getExportHiddenWorksheet() {
            return exportHiddenWorksheet;
        }

        public void setExportHiddenWorksheet(Boolean exportHiddenWorksheet) {
            this.exportHiddenWorksheet = exportHiddenWorksheet;
        }

        @SerializedName("ExportGridLines")
        private Boolean exportGridLines ;

        public  HtmlSaveOptions  exportGridLines(Boolean  exportGridLines) {
            this.exportGridLines =  exportGridLines;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getExportGridLines() {
            return exportGridLines;
        }

        public void setExportGridLines(Boolean exportGridLines) {
            this.exportGridLines = exportGridLines;
        }

        @SerializedName("PresentationPreference")
        private Boolean presentationPreference ;

        public  HtmlSaveOptions  presentationPreference(Boolean  presentationPreference) {
            this.presentationPreference =  presentationPreference;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getPresentationPreference() {
            return presentationPreference;
        }

        public void setPresentationPreference(Boolean presentationPreference) {
            this.presentationPreference = presentationPreference;
        }

        @SerializedName("CellCssPrefix")
        private String cellCssPrefix ;

        public  HtmlSaveOptions  cellCssPrefix(String  cellCssPrefix) {
            this.cellCssPrefix =  cellCssPrefix;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getCellCssPrefix() {
            return cellCssPrefix;
        }

        public void setCellCssPrefix(String cellCssPrefix) {
            this.cellCssPrefix = cellCssPrefix;
        }

        @SerializedName("TableCssId")
        private String tableCssId ;

        public  HtmlSaveOptions  tableCssId(String  tableCssId) {
            this.tableCssId =  tableCssId;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getTableCssId() {
            return tableCssId;
        }

        public void setTableCssId(String tableCssId) {
            this.tableCssId = tableCssId;
        }

        @SerializedName("IsFullPathLink")
        private Boolean isFullPathLink ;

        public  HtmlSaveOptions  isFullPathLink(Boolean  isFullPathLink) {
            this.isFullPathLink =  isFullPathLink;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getIsFullPathLink() {
            return isFullPathLink;
        }

        public void setIsFullPathLink(Boolean isFullPathLink) {
            this.isFullPathLink = isFullPathLink;
        }

        @SerializedName("ExportWorksheetCSSSeparately")
        private Boolean exportWorksheetCSSSeparately ;

        public  HtmlSaveOptions  exportWorksheetCSSSeparately(Boolean  exportWorksheetCSSSeparately) {
            this.exportWorksheetCSSSeparately =  exportWorksheetCSSSeparately;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getExportWorksheetCSSSeparately() {
            return exportWorksheetCSSSeparately;
        }

        public void setExportWorksheetCSSSeparately(Boolean exportWorksheetCSSSeparately) {
            this.exportWorksheetCSSSeparately = exportWorksheetCSSSeparately;
        }

        @SerializedName("ExportSimilarBorderStyle")
        private Boolean exportSimilarBorderStyle ;

        public  HtmlSaveOptions  exportSimilarBorderStyle(Boolean  exportSimilarBorderStyle) {
            this.exportSimilarBorderStyle =  exportSimilarBorderStyle;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getExportSimilarBorderStyle() {
            return exportSimilarBorderStyle;
        }

        public void setExportSimilarBorderStyle(Boolean exportSimilarBorderStyle) {
            this.exportSimilarBorderStyle = exportSimilarBorderStyle;
        }

        @SerializedName("MergeEmptyTdForcely")
        private Boolean mergeEmptyTdForcely ;

        public  HtmlSaveOptions  mergeEmptyTdForcely(Boolean  mergeEmptyTdForcely) {
            this.mergeEmptyTdForcely =  mergeEmptyTdForcely;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getMergeEmptyTdForcely() {
            return mergeEmptyTdForcely;
        }

        public void setMergeEmptyTdForcely(Boolean mergeEmptyTdForcely) {
            this.mergeEmptyTdForcely = mergeEmptyTdForcely;
        }

        @SerializedName("ExportCellCoordinate")
        private Boolean exportCellCoordinate ;

        public  HtmlSaveOptions  exportCellCoordinate(Boolean  exportCellCoordinate) {
            this.exportCellCoordinate =  exportCellCoordinate;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getExportCellCoordinate() {
            return exportCellCoordinate;
        }

        public void setExportCellCoordinate(Boolean exportCellCoordinate) {
            this.exportCellCoordinate = exportCellCoordinate;
        }

        @SerializedName("ExportExtraHeadings")
        private Boolean exportExtraHeadings ;

        public  HtmlSaveOptions  exportExtraHeadings(Boolean  exportExtraHeadings) {
            this.exportExtraHeadings =  exportExtraHeadings;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getExportExtraHeadings() {
            return exportExtraHeadings;
        }

        public void setExportExtraHeadings(Boolean exportExtraHeadings) {
            this.exportExtraHeadings = exportExtraHeadings;
        }

        @SerializedName("ExportHeadings")
        private Boolean exportHeadings ;

        public  HtmlSaveOptions  exportHeadings(Boolean  exportHeadings) {
            this.exportHeadings =  exportHeadings;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getExportHeadings() {
            return exportHeadings;
        }

        public void setExportHeadings(Boolean exportHeadings) {
            this.exportHeadings = exportHeadings;
        }

        @SerializedName("ExportFormula")
        private Boolean exportFormula ;

        public  HtmlSaveOptions  exportFormula(Boolean  exportFormula) {
            this.exportFormula =  exportFormula;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getExportFormula() {
            return exportFormula;
        }

        public void setExportFormula(Boolean exportFormula) {
            this.exportFormula = exportFormula;
        }

        @SerializedName("AddTooltipText")
        private Boolean addTooltipText ;

        public  HtmlSaveOptions  addTooltipText(Boolean  addTooltipText) {
            this.addTooltipText =  addTooltipText;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getAddTooltipText() {
            return addTooltipText;
        }

        public void setAddTooltipText(Boolean addTooltipText) {
            this.addTooltipText = addTooltipText;
        }

        @SerializedName("ExportBogusRowData")
        private Boolean exportBogusRowData ;

        public  HtmlSaveOptions  exportBogusRowData(Boolean  exportBogusRowData) {
            this.exportBogusRowData =  exportBogusRowData;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getExportBogusRowData() {
            return exportBogusRowData;
        }

        public void setExportBogusRowData(Boolean exportBogusRowData) {
            this.exportBogusRowData = exportBogusRowData;
        }

        @SerializedName("ExcludeUnusedStyles")
        private Boolean excludeUnusedStyles ;

        public  HtmlSaveOptions  excludeUnusedStyles(Boolean  excludeUnusedStyles) {
            this.excludeUnusedStyles =  excludeUnusedStyles;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getExcludeUnusedStyles() {
            return excludeUnusedStyles;
        }

        public void setExcludeUnusedStyles(Boolean excludeUnusedStyles) {
            this.excludeUnusedStyles = excludeUnusedStyles;
        }

        @SerializedName("ExportDocumentProperties")
        private Boolean exportDocumentProperties ;

        public  HtmlSaveOptions  exportDocumentProperties(Boolean  exportDocumentProperties) {
            this.exportDocumentProperties =  exportDocumentProperties;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getExportDocumentProperties() {
            return exportDocumentProperties;
        }

        public void setExportDocumentProperties(Boolean exportDocumentProperties) {
            this.exportDocumentProperties = exportDocumentProperties;
        }

        @SerializedName("ExportWorksheetProperties")
        private Boolean exportWorksheetProperties ;

        public  HtmlSaveOptions  exportWorksheetProperties(Boolean  exportWorksheetProperties) {
            this.exportWorksheetProperties =  exportWorksheetProperties;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getExportWorksheetProperties() {
            return exportWorksheetProperties;
        }

        public void setExportWorksheetProperties(Boolean exportWorksheetProperties) {
            this.exportWorksheetProperties = exportWorksheetProperties;
        }

        @SerializedName("ExportWorkbookProperties")
        private Boolean exportWorkbookProperties ;

        public  HtmlSaveOptions  exportWorkbookProperties(Boolean  exportWorkbookProperties) {
            this.exportWorkbookProperties =  exportWorkbookProperties;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getExportWorkbookProperties() {
            return exportWorkbookProperties;
        }

        public void setExportWorkbookProperties(Boolean exportWorkbookProperties) {
            this.exportWorkbookProperties = exportWorkbookProperties;
        }

        @SerializedName("ExportFrameScriptsAndProperties")
        private Boolean exportFrameScriptsAndProperties ;

        public  HtmlSaveOptions  exportFrameScriptsAndProperties(Boolean  exportFrameScriptsAndProperties) {
            this.exportFrameScriptsAndProperties =  exportFrameScriptsAndProperties;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getExportFrameScriptsAndProperties() {
            return exportFrameScriptsAndProperties;
        }

        public void setExportFrameScriptsAndProperties(Boolean exportFrameScriptsAndProperties) {
            this.exportFrameScriptsAndProperties = exportFrameScriptsAndProperties;
        }

        @SerializedName("AttachedFilesDirectory")
        private String attachedFilesDirectory ;

        public  HtmlSaveOptions  attachedFilesDirectory(String  attachedFilesDirectory) {
            this.attachedFilesDirectory =  attachedFilesDirectory;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getAttachedFilesDirectory() {
            return attachedFilesDirectory;
        }

        public void setAttachedFilesDirectory(String attachedFilesDirectory) {
            this.attachedFilesDirectory = attachedFilesDirectory;
        }

        @SerializedName("AttachedFilesUrlPrefix")
        private String attachedFilesUrlPrefix ;

        public  HtmlSaveOptions  attachedFilesUrlPrefix(String  attachedFilesUrlPrefix) {
            this.attachedFilesUrlPrefix =  attachedFilesUrlPrefix;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getAttachedFilesUrlPrefix() {
            return attachedFilesUrlPrefix;
        }

        public void setAttachedFilesUrlPrefix(String attachedFilesUrlPrefix) {
            this.attachedFilesUrlPrefix = attachedFilesUrlPrefix;
        }

        @SerializedName("Encoding")
        private String encoding ;

        public  HtmlSaveOptions  encoding(String  encoding) {
            this.encoding =  encoding;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getEncoding() {
            return encoding;
        }

        public void setEncoding(String encoding) {
            this.encoding = encoding;
        }

        @SerializedName("ExportActiveWorksheetOnly")
        private Boolean exportActiveWorksheetOnly ;

        public  HtmlSaveOptions  exportActiveWorksheetOnly(Boolean  exportActiveWorksheetOnly) {
            this.exportActiveWorksheetOnly =  exportActiveWorksheetOnly;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getExportActiveWorksheetOnly() {
            return exportActiveWorksheetOnly;
        }

        public void setExportActiveWorksheetOnly(Boolean exportActiveWorksheetOnly) {
            this.exportActiveWorksheetOnly = exportActiveWorksheetOnly;
        }

        @SerializedName("ExportChartImageFormat")
        private String exportChartImageFormat ;

        public  HtmlSaveOptions  exportChartImageFormat(String  exportChartImageFormat) {
            this.exportChartImageFormat =  exportChartImageFormat;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getExportChartImageFormat() {
            return exportChartImageFormat;
        }

        public void setExportChartImageFormat(String exportChartImageFormat) {
            this.exportChartImageFormat = exportChartImageFormat;
        }

        @SerializedName("ExportImagesAsBase64")
        private Boolean exportImagesAsBase64 ;

        public  HtmlSaveOptions  exportImagesAsBase64(Boolean  exportImagesAsBase64) {
            this.exportImagesAsBase64 =  exportImagesAsBase64;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getExportImagesAsBase64() {
            return exportImagesAsBase64;
        }

        public void setExportImagesAsBase64(Boolean exportImagesAsBase64) {
            this.exportImagesAsBase64 = exportImagesAsBase64;
        }

        @SerializedName("HiddenColDisplayType")
        private String hiddenColDisplayType ;

        public  HtmlSaveOptions  hiddenColDisplayType(String  hiddenColDisplayType) {
            this.hiddenColDisplayType =  hiddenColDisplayType;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getHiddenColDisplayType() {
            return hiddenColDisplayType;
        }

        public void setHiddenColDisplayType(String hiddenColDisplayType) {
            this.hiddenColDisplayType = hiddenColDisplayType;
        }

        @SerializedName("HiddenRowDisplayType")
        private String hiddenRowDisplayType ;

        public  HtmlSaveOptions  hiddenRowDisplayType(String  hiddenRowDisplayType) {
            this.hiddenRowDisplayType =  hiddenRowDisplayType;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getHiddenRowDisplayType() {
            return hiddenRowDisplayType;
        }

        public void setHiddenRowDisplayType(String hiddenRowDisplayType) {
            this.hiddenRowDisplayType = hiddenRowDisplayType;
        }

        @SerializedName("HtmlCrossStringType")
        private String htmlCrossStringType ;

        public  HtmlSaveOptions  htmlCrossStringType(String  htmlCrossStringType) {
            this.htmlCrossStringType =  htmlCrossStringType;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getHtmlCrossStringType() {
            return htmlCrossStringType;
        }

        public void setHtmlCrossStringType(String htmlCrossStringType) {
            this.htmlCrossStringType = htmlCrossStringType;
        }

        @SerializedName("IsExpImageToTempDir")
        private Boolean isExpImageToTempDir ;

        public  HtmlSaveOptions  isExpImageToTempDir(Boolean  isExpImageToTempDir) {
            this.isExpImageToTempDir =  isExpImageToTempDir;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getIsExpImageToTempDir() {
            return isExpImageToTempDir;
        }

        public void setIsExpImageToTempDir(Boolean isExpImageToTempDir) {
            this.isExpImageToTempDir = isExpImageToTempDir;
        }

        @SerializedName("PageTitle")
        private String pageTitle ;

        public  HtmlSaveOptions  pageTitle(String  pageTitle) {
            this.pageTitle =  pageTitle;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getPageTitle() {
            return pageTitle;
        }

        public void setPageTitle(String pageTitle) {
            this.pageTitle = pageTitle;
        }

        @SerializedName("ParseHtmlTagInCell")
        private Boolean parseHtmlTagInCell ;

        public  HtmlSaveOptions  parseHtmlTagInCell(Boolean  parseHtmlTagInCell) {
            this.parseHtmlTagInCell =  parseHtmlTagInCell;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getParseHtmlTagInCell() {
            return parseHtmlTagInCell;
        }

        public void setParseHtmlTagInCell(Boolean parseHtmlTagInCell) {
            this.parseHtmlTagInCell = parseHtmlTagInCell;
        }

        @SerializedName("CellNameAttribute")
        private String cellNameAttribute ;

        public  HtmlSaveOptions  cellNameAttribute(String  cellNameAttribute) {
            this.cellNameAttribute =  cellNameAttribute;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getCellNameAttribute() {
            return cellNameAttribute;
        }

        public void setCellNameAttribute(String cellNameAttribute) {
            this.cellNameAttribute = cellNameAttribute;
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
            return
                Objects.equals(this.exportPageHeaders, htmlSaveOptions.exportPageHeaders) &&
                Objects.equals(this.exportPageFooters, htmlSaveOptions.exportPageFooters) &&
                Objects.equals(this.exportRowColumnHeadings, htmlSaveOptions.exportRowColumnHeadings) &&
                Objects.equals(this.showAllSheets, htmlSaveOptions.showAllSheets) &&
                Objects.equals(this.imageOptions, htmlSaveOptions.imageOptions) &&
                Objects.equals(this.saveAsSingleFile, htmlSaveOptions.saveAsSingleFile) &&
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
                Objects.equals(this.cellNameAttribute, htmlSaveOptions.cellNameAttribute) &&
                super.equals(o);
      }

      @Override
      public int hashCode() {
        return Objects.hash(exportPageHeaders, exportPageFooters, exportRowColumnHeadings, showAllSheets, imageOptions, saveAsSingleFile, exportHiddenWorksheet, exportGridLines, presentationPreference, cellCssPrefix, tableCssId, isFullPathLink, exportWorksheetCSSSeparately, exportSimilarBorderStyle, mergeEmptyTdForcely, exportCellCoordinate, exportExtraHeadings, exportHeadings, exportFormula, addTooltipText, exportBogusRowData, excludeUnusedStyles, exportDocumentProperties, exportWorksheetProperties, exportWorkbookProperties, exportFrameScriptsAndProperties, attachedFilesDirectory, attachedFilesUrlPrefix, encoding, exportActiveWorksheetOnly, exportChartImageFormat, exportImagesAsBase64, hiddenColDisplayType, hiddenRowDisplayType, htmlCrossStringType, isExpImageToTempDir, pageTitle, parseHtmlTagInCell, cellNameAttribute, super.hashCode());
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class HtmlSaveOptions {\n");
            sb.append("    exportPageHeaders: ").append(toIndentedString(getExportPageHeaders())).append("\n");
            sb.append("    exportPageFooters: ").append(toIndentedString(getExportPageFooters())).append("\n");
            sb.append("    exportRowColumnHeadings: ").append(toIndentedString(getExportRowColumnHeadings())).append("\n");
            sb.append("    showAllSheets: ").append(toIndentedString(getShowAllSheets())).append("\n");
            sb.append("    imageOptions: ").append(toIndentedString(getImageOptions())).append("\n");
            sb.append("    saveAsSingleFile: ").append(toIndentedString(getSaveAsSingleFile())).append("\n");
            sb.append("    exportHiddenWorksheet: ").append(toIndentedString(getExportHiddenWorksheet())).append("\n");
            sb.append("    exportGridLines: ").append(toIndentedString(getExportGridLines())).append("\n");
            sb.append("    presentationPreference: ").append(toIndentedString(getPresentationPreference())).append("\n");
            sb.append("    cellCssPrefix: ").append(toIndentedString(getCellCssPrefix())).append("\n");
            sb.append("    tableCssId: ").append(toIndentedString(getTableCssId())).append("\n");
            sb.append("    isFullPathLink: ").append(toIndentedString(getIsFullPathLink())).append("\n");
            sb.append("    exportWorksheetCSSSeparately: ").append(toIndentedString(getExportWorksheetCSSSeparately())).append("\n");
            sb.append("    exportSimilarBorderStyle: ").append(toIndentedString(getExportSimilarBorderStyle())).append("\n");
            sb.append("    mergeEmptyTdForcely: ").append(toIndentedString(getMergeEmptyTdForcely())).append("\n");
            sb.append("    exportCellCoordinate: ").append(toIndentedString(getExportCellCoordinate())).append("\n");
            sb.append("    exportExtraHeadings: ").append(toIndentedString(getExportExtraHeadings())).append("\n");
            sb.append("    exportHeadings: ").append(toIndentedString(getExportHeadings())).append("\n");
            sb.append("    exportFormula: ").append(toIndentedString(getExportFormula())).append("\n");
            sb.append("    addTooltipText: ").append(toIndentedString(getAddTooltipText())).append("\n");
            sb.append("    exportBogusRowData: ").append(toIndentedString(getExportBogusRowData())).append("\n");
            sb.append("    excludeUnusedStyles: ").append(toIndentedString(getExcludeUnusedStyles())).append("\n");
            sb.append("    exportDocumentProperties: ").append(toIndentedString(getExportDocumentProperties())).append("\n");
            sb.append("    exportWorksheetProperties: ").append(toIndentedString(getExportWorksheetProperties())).append("\n");
            sb.append("    exportWorkbookProperties: ").append(toIndentedString(getExportWorkbookProperties())).append("\n");
            sb.append("    exportFrameScriptsAndProperties: ").append(toIndentedString(getExportFrameScriptsAndProperties())).append("\n");
            sb.append("    attachedFilesDirectory: ").append(toIndentedString(getAttachedFilesDirectory())).append("\n");
            sb.append("    attachedFilesUrlPrefix: ").append(toIndentedString(getAttachedFilesUrlPrefix())).append("\n");
            sb.append("    encoding: ").append(toIndentedString(getEncoding())).append("\n");
            sb.append("    exportActiveWorksheetOnly: ").append(toIndentedString(getExportActiveWorksheetOnly())).append("\n");
            sb.append("    exportChartImageFormat: ").append(toIndentedString(getExportChartImageFormat())).append("\n");
            sb.append("    exportImagesAsBase64: ").append(toIndentedString(getExportImagesAsBase64())).append("\n");
            sb.append("    hiddenColDisplayType: ").append(toIndentedString(getHiddenColDisplayType())).append("\n");
            sb.append("    hiddenRowDisplayType: ").append(toIndentedString(getHiddenRowDisplayType())).append("\n");
            sb.append("    htmlCrossStringType: ").append(toIndentedString(getHtmlCrossStringType())).append("\n");
            sb.append("    isExpImageToTempDir: ").append(toIndentedString(getIsExpImageToTempDir())).append("\n");
            sb.append("    pageTitle: ").append(toIndentedString(getPageTitle())).append("\n");
            sb.append("    parseHtmlTagInCell: ").append(toIndentedString(getParseHtmlTagInCell())).append("\n");
            sb.append("    cellNameAttribute: ").append(toIndentedString(getCellNameAttribute())).append("\n");
            sb.append("    saveFormat: ").append(toIndentedString(getSaveFormat())).append("\n");
            sb.append("    cachedFileFolder: ").append(toIndentedString(getCachedFileFolder())).append("\n");
            sb.append("    clearData: ").append(toIndentedString(getClearData())).append("\n");
            sb.append("    createDirectory: ").append(toIndentedString(getCreateDirectory())).append("\n");
            sb.append("    enableHTTPCompression: ").append(toIndentedString(getEnableHTTPCompression())).append("\n");
            sb.append("    refreshChartCache: ").append(toIndentedString(getRefreshChartCache())).append("\n");
            sb.append("    sortNames: ").append(toIndentedString(getSortNames())).append("\n");
            sb.append("    validateMergedAreas: ").append(toIndentedString(getValidateMergedAreas())).append("\n");
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

