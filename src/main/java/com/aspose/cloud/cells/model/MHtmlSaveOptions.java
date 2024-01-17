/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="MHtmlSaveOptions.java">
 *   Copyright (c) 2024 Aspose.Cells Cloud
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


public class MHtmlSaveOptions  extends  SaveOptions {
        @SerializedName("AttachedFilesDirectory")
        private String attachedFilesDirectory ;

        public  MHtmlSaveOptions  attachedFilesDirectory(String  attachedFilesDirectory) {
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

        public  MHtmlSaveOptions  attachedFilesUrlPrefix(String  attachedFilesUrlPrefix) {
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

        public  MHtmlSaveOptions  encoding(String  encoding) {
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

        public  MHtmlSaveOptions  exportActiveWorksheetOnly(Boolean  exportActiveWorksheetOnly) {
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

        public  MHtmlSaveOptions  exportChartImageFormat(String  exportChartImageFormat) {
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

        public  MHtmlSaveOptions  exportImagesAsBase64(Boolean  exportImagesAsBase64) {
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

        public  MHtmlSaveOptions  hiddenColDisplayType(String  hiddenColDisplayType) {
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

        public  MHtmlSaveOptions  hiddenRowDisplayType(String  hiddenRowDisplayType) {
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

        public  MHtmlSaveOptions  htmlCrossStringType(String  htmlCrossStringType) {
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

        public  MHtmlSaveOptions  isExpImageToTempDir(Boolean  isExpImageToTempDir) {
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

        public  MHtmlSaveOptions  pageTitle(String  pageTitle) {
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

        public  MHtmlSaveOptions  parseHtmlTagInCell(Boolean  parseHtmlTagInCell) {
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

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            MHtmlSaveOptions mHtmlSaveOptions = (MHtmlSaveOptions) o;
            return
                Objects.equals(this.attachedFilesDirectory, mHtmlSaveOptions.attachedFilesDirectory) &&
                Objects.equals(this.attachedFilesUrlPrefix, mHtmlSaveOptions.attachedFilesUrlPrefix) &&
                Objects.equals(this.encoding, mHtmlSaveOptions.encoding) &&
                Objects.equals(this.exportActiveWorksheetOnly, mHtmlSaveOptions.exportActiveWorksheetOnly) &&
                Objects.equals(this.exportChartImageFormat, mHtmlSaveOptions.exportChartImageFormat) &&
                Objects.equals(this.exportImagesAsBase64, mHtmlSaveOptions.exportImagesAsBase64) &&
                Objects.equals(this.hiddenColDisplayType, mHtmlSaveOptions.hiddenColDisplayType) &&
                Objects.equals(this.hiddenRowDisplayType, mHtmlSaveOptions.hiddenRowDisplayType) &&
                Objects.equals(this.htmlCrossStringType, mHtmlSaveOptions.htmlCrossStringType) &&
                Objects.equals(this.isExpImageToTempDir, mHtmlSaveOptions.isExpImageToTempDir) &&
                Objects.equals(this.pageTitle, mHtmlSaveOptions.pageTitle) &&
                Objects.equals(this.parseHtmlTagInCell, mHtmlSaveOptions.parseHtmlTagInCell) &&
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

