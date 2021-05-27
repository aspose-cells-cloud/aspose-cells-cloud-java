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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SaveOptions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-17T20:48:47.090-05:00")

public class SaveOptions {
  @SerializedName("EnableHTTPCompression")
  private Boolean enableHTTPCompression = null;

  @SerializedName("SaveFormat")
  private String saveFormat = null;

  @SerializedName("ClearData")
  private Boolean clearData = null;

  @SerializedName("CachedFileFolder")
  private String cachedFileFolder = null;

  @SerializedName("ValidateMergedAreas")
  private Boolean validateMergedAreas = null;

  @SerializedName("RefreshChartCache")
  private Boolean refreshChartCache = null;

  @SerializedName("CreateDirectory")
  private Boolean createDirectory = null;

  @SerializedName("SortNames")
  private Boolean sortNames = null;

  public SaveOptions enableHTTPCompression(Boolean enableHTTPCompression) {
    this.enableHTTPCompression = enableHTTPCompression;
    return this;
  }

   /**
   * Get enableHTTPCompression
   * @return enableHTTPCompression
  **/
  @ApiModelProperty(value = "")
  public Boolean EnableHTTPCompression() {
    return enableHTTPCompression;
  }

  public void setEnableHTTPCompression(Boolean enableHTTPCompression) {
    this.enableHTTPCompression = enableHTTPCompression;
  }

  public SaveOptions saveFormat(String saveFormat) {
    this.saveFormat = saveFormat;
    return this;
  }

   /**
   * Get saveFormat
   * @return saveFormat
  **/
  @ApiModelProperty(value = "")
  public String getSaveFormat() {
    return saveFormat;
  }

  public void setSaveFormat(String saveFormat) {
    this.saveFormat = saveFormat;
  }

  public SaveOptions clearData(Boolean clearData) {
    this.clearData = clearData;
    return this;
  }

   /**
   * Make the workbook empty after saving the file.
   * @return clearData
  **/
  @ApiModelProperty(value = "Make the workbook empty after saving the file.")
  public Boolean ClearData() {
    return clearData;
  }

  public void setClearData(Boolean clearData) {
    this.clearData = clearData;
  }

  public SaveOptions cachedFileFolder(String cachedFileFolder) {
    this.cachedFileFolder = cachedFileFolder;
    return this;
  }

   /**
   * The cached file folder is used to store some large data.
   * @return cachedFileFolder
  **/
  @ApiModelProperty(value = "The cached file folder is used to store some large data.")
  public String getCachedFileFolder() {
    return cachedFileFolder;
  }

  public void setCachedFileFolder(String cachedFileFolder) {
    this.cachedFileFolder = cachedFileFolder;
  }

  public SaveOptions validateMergedAreas(Boolean validateMergedAreas) {
    this.validateMergedAreas = validateMergedAreas;
    return this;
  }

   /**
   * Indicates whether validate merged areas before saving the file. The default value is false.             
   * @return validateMergedAreas
  **/
  @ApiModelProperty(value = "Indicates whether validate merged areas before saving the file. The default value is false.             ")
  public Boolean ValidateMergedAreas() {
    return validateMergedAreas;
  }

  public void setValidateMergedAreas(Boolean validateMergedAreas) {
    this.validateMergedAreas = validateMergedAreas;
  }

  public SaveOptions refreshChartCache(Boolean refreshChartCache) {
    this.refreshChartCache = refreshChartCache;
    return this;
  }

   /**
   * Get refreshChartCache
   * @return refreshChartCache
  **/
  @ApiModelProperty(value = "")
  public Boolean RefreshChartCache() {
    return refreshChartCache;
  }

  public void setRefreshChartCache(Boolean refreshChartCache) {
    this.refreshChartCache = refreshChartCache;
  }

  public SaveOptions createDirectory(Boolean createDirectory) {
    this.createDirectory = createDirectory;
    return this;
  }

   /**
   * If true and the directory does not exist, the directory will be automatically created before saving the file.             
   * @return createDirectory
  **/
  @ApiModelProperty(value = "If true and the directory does not exist, the directory will be automatically created before saving the file.             ")
  public Boolean CreateDirectory() {
    return createDirectory;
  }

  public void setCreateDirectory(Boolean createDirectory) {
    this.createDirectory = createDirectory;
  }

  public SaveOptions sortNames(Boolean sortNames) {
    this.sortNames = sortNames;
    return this;
  }

   /**
   * Get sortNames
   * @return sortNames
  **/
  @ApiModelProperty(value = "")
  public Boolean SortNames() {
    return sortNames;
  }

  public void setSortNames(Boolean sortNames) {
    this.sortNames = sortNames;
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
    return Objects.equals(this.enableHTTPCompression, saveOptions.enableHTTPCompression) &&
        Objects.equals(this.saveFormat, saveOptions.saveFormat) &&
        Objects.equals(this.clearData, saveOptions.clearData) &&
        Objects.equals(this.cachedFileFolder, saveOptions.cachedFileFolder) &&
        Objects.equals(this.validateMergedAreas, saveOptions.validateMergedAreas) &&
        Objects.equals(this.refreshChartCache, saveOptions.refreshChartCache) &&
        Objects.equals(this.createDirectory, saveOptions.createDirectory) &&
        Objects.equals(this.sortNames, saveOptions.sortNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableHTTPCompression, saveFormat, clearData, cachedFileFolder, validateMergedAreas, refreshChartCache, createDirectory, sortNames);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaveOptions {\n");
    
    sb.append("    enableHTTPCompression: ").append(toIndentedString(enableHTTPCompression)).append("\n");
    sb.append("    saveFormat: ").append(toIndentedString(saveFormat)).append("\n");
    sb.append("    clearData: ").append(toIndentedString(clearData)).append("\n");
    sb.append("    cachedFileFolder: ").append(toIndentedString(cachedFileFolder)).append("\n");
    sb.append("    validateMergedAreas: ").append(toIndentedString(validateMergedAreas)).append("\n");
    sb.append("    refreshChartCache: ").append(toIndentedString(refreshChartCache)).append("\n");
    sb.append("    createDirectory: ").append(toIndentedString(createDirectory)).append("\n");
    sb.append("    sortNames: ").append(toIndentedString(sortNames)).append("\n");
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

