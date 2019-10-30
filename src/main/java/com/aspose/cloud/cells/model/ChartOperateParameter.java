/* 
 * <summary>
 *  Copyright (c) 2019 Aspose.Cells Cloud
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
import com.aspose.cloud.cells.model.OperateParameter;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ChartOperateParameter
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-24T14:56:32.974+08:00")
public class ChartOperateParameter extends OperateParameter {
  @SerializedName("string")
  private String string = null;

  @SerializedName("Area")
  private String area = null;

  @SerializedName("CategoryData")
  private String categoryData = null;

  @SerializedName("UpperLeftRow")
  private Integer upperLeftRow = null;

  @SerializedName("LowerRightColumn")
  private Integer lowerRightColumn = null;

  @SerializedName("LowerRightRow")
  private Integer lowerRightRow = null;

  @SerializedName("IsAutoGetSerialName")
  private Boolean isAutoGetSerialName = null;

  @SerializedName("ChartType")
  private String chartType = null;

  @SerializedName("IsVertical")
  private Boolean isVertical = null;

  public ChartOperateParameter string(String string) {
    this.string = string;
    return this;
  }

   /**
   * Get string
   * @return string
  **/
  @ApiModelProperty(value = "")
  public String getString() {
    return string;
  }

  public void setString(String string) {
    this.string = string;
  }

  public ChartOperateParameter area(String area) {
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

  public ChartOperateParameter categoryData(String categoryData) {
    this.categoryData = categoryData;
    return this;
  }

   /**
   * Get categoryData
   * @return categoryData
  **/
  @ApiModelProperty(value = "")
  public String getCategoryData() {
    return categoryData;
  }

  public void setCategoryData(String categoryData) {
    this.categoryData = categoryData;
  }

  public ChartOperateParameter upperLeftRow(Integer upperLeftRow) {
    this.upperLeftRow = upperLeftRow;
    return this;
  }

   /**
   * Get upperLeftRow
   * @return upperLeftRow
  **/
  @ApiModelProperty(value = "")
  public Integer getUpperLeftRow() {
    return upperLeftRow;
  }

  public void setUpperLeftRow(Integer upperLeftRow) {
    this.upperLeftRow = upperLeftRow;
  }

  public ChartOperateParameter lowerRightColumn(Integer lowerRightColumn) {
    this.lowerRightColumn = lowerRightColumn;
    return this;
  }

   /**
   * Get lowerRightColumn
   * @return lowerRightColumn
  **/
  @ApiModelProperty(value = "")
  public Integer getLowerRightColumn() {
    return lowerRightColumn;
  }

  public void setLowerRightColumn(Integer lowerRightColumn) {
    this.lowerRightColumn = lowerRightColumn;
  }

  public ChartOperateParameter lowerRightRow(Integer lowerRightRow) {
    this.lowerRightRow = lowerRightRow;
    return this;
  }

   /**
   * Get lowerRightRow
   * @return lowerRightRow
  **/
  @ApiModelProperty(value = "")
  public Integer getLowerRightRow() {
    return lowerRightRow;
  }

  public void setLowerRightRow(Integer lowerRightRow) {
    this.lowerRightRow = lowerRightRow;
  }

  public ChartOperateParameter isAutoGetSerialName(Boolean isAutoGetSerialName) {
    this.isAutoGetSerialName = isAutoGetSerialName;
    return this;
  }

   /**
   * Get isAutoGetSerialName
   * @return isAutoGetSerialName
  **/
  @ApiModelProperty(value = "")
  public Boolean IsAutoGetSerialName() {
    return isAutoGetSerialName;
  }

  public void setIsAutoGetSerialName(Boolean isAutoGetSerialName) {
    this.isAutoGetSerialName = isAutoGetSerialName;
  }

  public ChartOperateParameter chartType(String chartType) {
    this.chartType = chartType;
    return this;
  }

   /**
   * Get chartType
   * @return chartType
  **/
  @ApiModelProperty(value = "")
  public String getChartType() {
    return chartType;
  }

  public void setChartType(String chartType) {
    this.chartType = chartType;
  }

  public ChartOperateParameter isVertical(Boolean isVertical) {
    this.isVertical = isVertical;
    return this;
  }

   /**
   * Get isVertical
   * @return isVertical
  **/
  @ApiModelProperty(value = "")
  public Boolean IsVertical() {
    return isVertical;
  }

  public void setIsVertical(Boolean isVertical) {
    this.isVertical = isVertical;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChartOperateParameter chartOperateParameter = (ChartOperateParameter) o;
    return Objects.equals(this.string, chartOperateParameter.string) &&
        Objects.equals(this.area, chartOperateParameter.area) &&
        Objects.equals(this.categoryData, chartOperateParameter.categoryData) &&
        Objects.equals(this.upperLeftRow, chartOperateParameter.upperLeftRow) &&
        Objects.equals(this.lowerRightColumn, chartOperateParameter.lowerRightColumn) &&
        Objects.equals(this.lowerRightRow, chartOperateParameter.lowerRightRow) &&
        Objects.equals(this.isAutoGetSerialName, chartOperateParameter.isAutoGetSerialName) &&
        Objects.equals(this.chartType, chartOperateParameter.chartType) &&
        Objects.equals(this.isVertical, chartOperateParameter.isVertical) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(string, area, categoryData, upperLeftRow, lowerRightColumn, lowerRightRow, isAutoGetSerialName, chartType, isVertical, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChartOperateParameter {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    string: ").append(toIndentedString(string)).append("\n");
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    categoryData: ").append(toIndentedString(categoryData)).append("\n");
    sb.append("    upperLeftRow: ").append(toIndentedString(upperLeftRow)).append("\n");
    sb.append("    lowerRightColumn: ").append(toIndentedString(lowerRightColumn)).append("\n");
    sb.append("    lowerRightRow: ").append(toIndentedString(lowerRightRow)).append("\n");
    sb.append("    isAutoGetSerialName: ").append(toIndentedString(isAutoGetSerialName)).append("\n");
    sb.append("    chartType: ").append(toIndentedString(chartType)).append("\n");
    sb.append("    isVertical: ").append(toIndentedString(isVertical)).append("\n");
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

