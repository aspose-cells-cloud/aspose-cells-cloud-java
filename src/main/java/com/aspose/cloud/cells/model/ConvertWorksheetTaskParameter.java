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
 * ConvertWorksheetTaskParameter
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-13T18:09:02.334-05:00")
public class ConvertWorksheetTaskParameter extends TaskParameter {
  @SerializedName("Workbook")
  private FileSource workbook = null;

  @SerializedName("Sheet")
  private String sheet = null;

  @SerializedName("Target")
  private FileSource target = null;

  @SerializedName("Format")
  private String format = null;

  @SerializedName("Area")
  private String area = null;

  @SerializedName("PageIndex")
  private Integer pageIndex = null;

  @SerializedName("VerticalResolution")
  private Integer verticalResolution = null;

  @SerializedName("HorizontalResolution")
  private Integer horizontalResolution = null;

  public ConvertWorksheetTaskParameter workbook(FileSource workbook) {
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

  public ConvertWorksheetTaskParameter sheet(String sheet) {
    this.sheet = sheet;
    return this;
  }

   /**
   * Get sheet
   * @return sheet
  **/
  @ApiModelProperty(value = "")
  public String getSheet() {
    return sheet;
  }

  public void setSheet(String sheet) {
    this.sheet = sheet;
  }

  public ConvertWorksheetTaskParameter target(FileSource target) {
    this.target = target;
    return this;
  }

   /**
   * Get target
   * @return target
  **/
  @ApiModelProperty(value = "")
  public FileSource getTarget() {
    return target;
  }

  public void setTarget(FileSource target) {
    this.target = target;
  }

  public ConvertWorksheetTaskParameter format(String format) {
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

  public ConvertWorksheetTaskParameter area(String area) {
    this.area = area;
    return this;
  }

   /**
   * Get area
   * @return area
  **/
  @ApiModelProperty(value = "")
  public String getArea() {
    return area;
  }

  public void setArea(String area) {
    this.area = area;
  }

  public ConvertWorksheetTaskParameter pageIndex(Integer pageIndex) {
    this.pageIndex = pageIndex;
    return this;
  }

   /**
   * Get pageIndex
   * @return pageIndex
  **/
  @ApiModelProperty(value = "")
  public Integer getPageIndex() {
    return pageIndex;
  }

  public void setPageIndex(Integer pageIndex) {
    this.pageIndex = pageIndex;
  }

  public ConvertWorksheetTaskParameter verticalResolution(Integer verticalResolution) {
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

  public ConvertWorksheetTaskParameter horizontalResolution(Integer horizontalResolution) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConvertWorksheetTaskParameter convertWorksheetTaskParameter = (ConvertWorksheetTaskParameter) o;
    return Objects.equals(this.workbook, convertWorksheetTaskParameter.workbook) &&
        Objects.equals(this.sheet, convertWorksheetTaskParameter.sheet) &&
        Objects.equals(this.target, convertWorksheetTaskParameter.target) &&
        Objects.equals(this.format, convertWorksheetTaskParameter.format) &&
        Objects.equals(this.area, convertWorksheetTaskParameter.area) &&
        Objects.equals(this.pageIndex, convertWorksheetTaskParameter.pageIndex) &&
        Objects.equals(this.verticalResolution, convertWorksheetTaskParameter.verticalResolution) &&
        Objects.equals(this.horizontalResolution, convertWorksheetTaskParameter.horizontalResolution) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workbook, sheet, target, format, area, pageIndex, verticalResolution, horizontalResolution, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConvertWorksheetTaskParameter {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    workbook: ").append(toIndentedString(workbook)).append("\n");
    sb.append("    sheet: ").append(toIndentedString(sheet)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    pageIndex: ").append(toIndentedString(pageIndex)).append("\n");
    sb.append("    verticalResolution: ").append(toIndentedString(verticalResolution)).append("\n");
    sb.append("    horizontalResolution: ").append(toIndentedString(horizontalResolution)).append("\n");
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

