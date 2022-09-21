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
import com.aspose.cloud.cells.model.MatchConditionRequest;
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
 * BatchConvertRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-16T03:09:53.733-05:00")
public class BatchConvertRequest {
  @SerializedName("SourceFolder")
  private String sourceFolder = null;

  @SerializedName("SourceStorage")
  private String sourceStorage = null;

  @SerializedName("MatchCondition")
  private MatchConditionRequest matchCondition = null;

  @SerializedName("Format")
  private String format = null;

  @SerializedName("OutFolder")
  private String outFolder = null;

  @SerializedName("OutStorage")
  private String outStorage = null;

  @SerializedName("SaveOptions")
  private SaveOptions saveOptions = null;

  public BatchConvertRequest sourceFolder(String sourceFolder) {
    this.sourceFolder = sourceFolder;
    return this;
  }

   /**
   * Get sourceFolder
   * @return sourceFolder
  **/
  @ApiModelProperty(value = "")
  public String getSourceFolder() {
    return sourceFolder;
  }

  public void setSourceFolder(String sourceFolder) {
    this.sourceFolder = sourceFolder;
  }

  public BatchConvertRequest sourceStorage(String sourceStorage) {
    this.sourceStorage = sourceStorage;
    return this;
  }

   /**
   * Get sourceStorage
   * @return sourceStorage
  **/
  @ApiModelProperty(value = "")
  public String getSourceStorage() {
    return sourceStorage;
  }

  public void setSourceStorage(String sourceStorage) {
    this.sourceStorage = sourceStorage;
  }

  public BatchConvertRequest matchCondition(MatchConditionRequest matchCondition) {
    this.matchCondition = matchCondition;
    return this;
  }

   /**
   * Get matchCondition
   * @return matchCondition
  **/
  @ApiModelProperty(value = "")
  public MatchConditionRequest getMatchCondition() {
    return matchCondition;
  }

  public void setMatchCondition(MatchConditionRequest matchCondition) {
    this.matchCondition = matchCondition;
  }

  public BatchConvertRequest format(String format) {
    this.format = format;
    return this;
  }

   /**
   * Get format
   * @return format
  **/
  @ApiModelProperty(value = "")
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public BatchConvertRequest outFolder(String outFolder) {
    this.outFolder = outFolder;
    return this;
  }

   /**
   * Get outFolder
   * @return outFolder
  **/
  @ApiModelProperty(value = "")
  public String getOutFolder() {
    return outFolder;
  }

  public void setOutFolder(String outFolder) {
    this.outFolder = outFolder;
  }

  public BatchConvertRequest outStorage(String outStorage) {
    this.outStorage = outStorage;
    return this;
  }

   /**
   * Get outStorage
   * @return outStorage
  **/
  @ApiModelProperty(value = "")
  public String getOutStorage() {
    return outStorage;
  }

  public void setOutStorage(String outStorage) {
    this.outStorage = outStorage;
  }

  public BatchConvertRequest saveOptions(SaveOptions saveOptions) {
    this.saveOptions = saveOptions;
    return this;
  }

   /**
   * Get saveOptions
   * @return saveOptions
  **/
  @ApiModelProperty(value = "")
  public SaveOptions getSaveOptions() {
    return saveOptions;
  }

  public void setSaveOptions(SaveOptions saveOptions) {
    this.saveOptions = saveOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchConvertRequest batchConvertRequest = (BatchConvertRequest) o;
    return Objects.equals(this.sourceFolder, batchConvertRequest.sourceFolder) &&
        Objects.equals(this.sourceStorage, batchConvertRequest.sourceStorage) &&
        Objects.equals(this.matchCondition, batchConvertRequest.matchCondition) &&
        Objects.equals(this.format, batchConvertRequest.format) &&
        Objects.equals(this.outFolder, batchConvertRequest.outFolder) &&
        Objects.equals(this.outStorage, batchConvertRequest.outStorage) &&
        Objects.equals(this.saveOptions, batchConvertRequest.saveOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceFolder, sourceStorage, matchCondition, format, outFolder, outStorage, saveOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchConvertRequest {\n");
    
    sb.append("    sourceFolder: ").append(toIndentedString(sourceFolder)).append("\n");
    sb.append("    sourceStorage: ").append(toIndentedString(sourceStorage)).append("\n");
    sb.append("    matchCondition: ").append(toIndentedString(matchCondition)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    outFolder: ").append(toIndentedString(outFolder)).append("\n");
    sb.append("    outStorage: ").append(toIndentedString(outStorage)).append("\n");
    sb.append("    saveOptions: ").append(toIndentedString(saveOptions)).append("\n");
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

