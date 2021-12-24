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
import com.aspose.cloud.cells.model.FileSource;
import com.aspose.cloud.cells.model.TaskParameter;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SplitWorkbookTaskParameter
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-12-23T00:44:43.052-06:00")
public class SplitWorkbookTaskParameter extends TaskParameter {
  @SerializedName("DestinationFileFormat")
  private String destinationFileFormat = null;

  @SerializedName("DestinationFilePosition")
  private FileSource destinationFilePosition = null;

  @SerializedName("VerticalResolution")
  private Integer verticalResolution = null;

  @SerializedName("HorizontalResolution")
  private Integer horizontalResolution = null;

  @SerializedName("SplitNameRule")
  private String splitNameRule = null;

  @SerializedName("Workbook")
  private FileSource workbook = null;

  public SplitWorkbookTaskParameter destinationFileFormat(String destinationFileFormat) {
    this.destinationFileFormat = destinationFileFormat;
    return this;
  }

   /**
   * Get destinationFileFormat
   * @return destinationFileFormat
  **/
  @ApiModelProperty(value = "")
  public String getDestinationFileFormat() {
    return destinationFileFormat;
  }

  public void setDestinationFileFormat(String destinationFileFormat) {
    this.destinationFileFormat = destinationFileFormat;
  }

  public SplitWorkbookTaskParameter destinationFilePosition(FileSource destinationFilePosition) {
    this.destinationFilePosition = destinationFilePosition;
    return this;
  }

   /**
   * Get destinationFilePosition
   * @return destinationFilePosition
  **/
  @ApiModelProperty(value = "")
  public FileSource getDestinationFilePosition() {
    return destinationFilePosition;
  }

  public void setDestinationFilePosition(FileSource destinationFilePosition) {
    this.destinationFilePosition = destinationFilePosition;
  }

  public SplitWorkbookTaskParameter verticalResolution(Integer verticalResolution) {
    this.verticalResolution = verticalResolution;
    return this;
  }

   /**
   * Get verticalResolution
   * @return verticalResolution
  **/
  @ApiModelProperty(value = "")
  public Integer getVerticalResolution() {
    return verticalResolution;
  }

  public void setVerticalResolution(Integer verticalResolution) {
    this.verticalResolution = verticalResolution;
  }

  public SplitWorkbookTaskParameter horizontalResolution(Integer horizontalResolution) {
    this.horizontalResolution = horizontalResolution;
    return this;
  }

   /**
   * Get horizontalResolution
   * @return horizontalResolution
  **/
  @ApiModelProperty(value = "")
  public Integer getHorizontalResolution() {
    return horizontalResolution;
  }

  public void setHorizontalResolution(Integer horizontalResolution) {
    this.horizontalResolution = horizontalResolution;
  }

  public SplitWorkbookTaskParameter splitNameRule(String splitNameRule) {
    this.splitNameRule = splitNameRule;
    return this;
  }

   /**
   * Get splitNameRule
   * @return splitNameRule
  **/
  @ApiModelProperty(value = "")
  public String getSplitNameRule() {
    return splitNameRule;
  }

  public void setSplitNameRule(String splitNameRule) {
    this.splitNameRule = splitNameRule;
  }

  public SplitWorkbookTaskParameter workbook(FileSource workbook) {
    this.workbook = workbook;
    return this;
  }

   /**
   * Get workbook
   * @return workbook
  **/
  @ApiModelProperty(value = "")
  public FileSource getWorkbook() {
    return workbook;
  }

  public void setWorkbook(FileSource workbook) {
    this.workbook = workbook;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SplitWorkbookTaskParameter splitWorkbookTaskParameter = (SplitWorkbookTaskParameter) o;
    return Objects.equals(this.destinationFileFormat, splitWorkbookTaskParameter.destinationFileFormat) &&
        Objects.equals(this.destinationFilePosition, splitWorkbookTaskParameter.destinationFilePosition) &&
        Objects.equals(this.verticalResolution, splitWorkbookTaskParameter.verticalResolution) &&
        Objects.equals(this.horizontalResolution, splitWorkbookTaskParameter.horizontalResolution) &&
        Objects.equals(this.splitNameRule, splitWorkbookTaskParameter.splitNameRule) &&
        Objects.equals(this.workbook, splitWorkbookTaskParameter.workbook) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationFileFormat, destinationFilePosition, verticalResolution, horizontalResolution, splitNameRule, workbook, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SplitWorkbookTaskParameter {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    destinationFileFormat: ").append(toIndentedString(destinationFileFormat)).append("\n");
    sb.append("    destinationFilePosition: ").append(toIndentedString(destinationFilePosition)).append("\n");
    sb.append("    verticalResolution: ").append(toIndentedString(verticalResolution)).append("\n");
    sb.append("    horizontalResolution: ").append(toIndentedString(horizontalResolution)).append("\n");
    sb.append("    splitNameRule: ").append(toIndentedString(splitNameRule)).append("\n");
    sb.append("    workbook: ").append(toIndentedString(workbook)).append("\n");
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

