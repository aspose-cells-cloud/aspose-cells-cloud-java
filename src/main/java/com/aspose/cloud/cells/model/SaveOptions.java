/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="SaveOptions.java">
 *   Copyright (c) 2023 Aspose.Cells Cloud
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


public class SaveOptions {
        @SerializedName("SaveFormat")
        private String saveFormat ;

        public  SaveOptions  saveFormat(String  saveFormat) {
            this.saveFormat =  saveFormat;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getSaveFormat() {
            return saveFormat;
        }

        public void setSaveFormat(String saveFormat) {
            this.saveFormat = saveFormat;
        }

        @SerializedName("CachedFileFolder")
        private String cachedFileFolder ;

        public  SaveOptions  cachedFileFolder(String  cachedFileFolder) {
            this.cachedFileFolder =  cachedFileFolder;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getCachedFileFolder() {
            return cachedFileFolder;
        }

        public void setCachedFileFolder(String cachedFileFolder) {
            this.cachedFileFolder = cachedFileFolder;
        }

        @SerializedName("ClearData")
        private Boolean clearData ;

        public  SaveOptions  clearData(Boolean  clearData) {
            this.clearData =  clearData;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getClearData() {
            return clearData;
        }

        public void setClearData(Boolean clearData) {
            this.clearData = clearData;
        }

        @SerializedName("CreateDirectory")
        private Boolean createDirectory ;

        public  SaveOptions  createDirectory(Boolean  createDirectory) {
            this.createDirectory =  createDirectory;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getCreateDirectory() {
            return createDirectory;
        }

        public void setCreateDirectory(Boolean createDirectory) {
            this.createDirectory = createDirectory;
        }

        @SerializedName("EnableHTTPCompression")
        private Boolean enableHTTPCompression ;

        public  SaveOptions  enableHTTPCompression(Boolean  enableHTTPCompression) {
            this.enableHTTPCompression =  enableHTTPCompression;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getEnableHTTPCompression() {
            return enableHTTPCompression;
        }

        public void setEnableHTTPCompression(Boolean enableHTTPCompression) {
            this.enableHTTPCompression = enableHTTPCompression;
        }

        @SerializedName("RefreshChartCache")
        private Boolean refreshChartCache ;

        public  SaveOptions  refreshChartCache(Boolean  refreshChartCache) {
            this.refreshChartCache =  refreshChartCache;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getRefreshChartCache() {
            return refreshChartCache;
        }

        public void setRefreshChartCache(Boolean refreshChartCache) {
            this.refreshChartCache = refreshChartCache;
        }

        @SerializedName("SortNames")
        private Boolean sortNames ;

        public  SaveOptions  sortNames(Boolean  sortNames) {
            this.sortNames =  sortNames;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getSortNames() {
            return sortNames;
        }

        public void setSortNames(Boolean sortNames) {
            this.sortNames = sortNames;
        }

        @SerializedName("ValidateMergedAreas")
        private Boolean validateMergedAreas ;

        public  SaveOptions  validateMergedAreas(Boolean  validateMergedAreas) {
            this.validateMergedAreas =  validateMergedAreas;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getValidateMergedAreas() {
            return validateMergedAreas;
        }

        public void setValidateMergedAreas(Boolean validateMergedAreas) {
            this.validateMergedAreas = validateMergedAreas;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            SaveOptions saveOptions = (SaveOptions) o;
            return
                Objects.equals(this.saveFormat, saveOptions.saveFormat) &&
                Objects.equals(this.cachedFileFolder, saveOptions.cachedFileFolder) &&
                Objects.equals(this.clearData, saveOptions.clearData) &&
                Objects.equals(this.createDirectory, saveOptions.createDirectory) &&
                Objects.equals(this.enableHTTPCompression, saveOptions.enableHTTPCompression) &&
                Objects.equals(this.refreshChartCache, saveOptions.refreshChartCache) &&
                Objects.equals(this.sortNames, saveOptions.sortNames) &&
                Objects.equals(this.validateMergedAreas, saveOptions.validateMergedAreas);
      }

      @Override
      public int hashCode() {
        return Objects.hash(saveFormat, cachedFileFolder, clearData, createDirectory, enableHTTPCompression, refreshChartCache, sortNames, validateMergedAreas);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class SaveOptions {\n");
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

