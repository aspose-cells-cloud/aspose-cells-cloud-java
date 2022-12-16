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
import com.aspose.cloud.cells.model.Area;
import com.aspose.cloud.cells.model.Line;
import com.aspose.cloud.cells.model.TickLabels;
import com.aspose.cloud.cells.model.Title;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Axis
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-05T06:46:52.811-06:00")
public class Axis {
  @SerializedName("Area")
  private Area area = null;

  @SerializedName("AxisBetweenCategories")
  private Boolean axisBetweenCategories = null;

  @SerializedName("AxisLine")
  private Area axisLine = null;

  @SerializedName("BaseUnitScale")
  private String baseUnitScale = null;

  @SerializedName("CategoryType")
  private String categoryType = null;

  @SerializedName("CrossAt")
  private Double crossAt = null;

  @SerializedName("CrossType")
  private String crossType = null;

  @SerializedName("DisplayUnit")
  private String displayUnit = null;

  @SerializedName("HasMultiLevelLabels")
  private Boolean hasMultiLevelLabels = null;

  @SerializedName("IsAutomaticMaxValue")
  private Boolean isAutomaticMaxValue = null;

  @SerializedName("IsAutomaticMinorUnit")
  private Boolean isAutomaticMinorUnit = null;

  @SerializedName("IsAutomaticMinValue")
  private Boolean isAutomaticMinValue = null;

  @SerializedName("IsDisplayUnitLabelShown")
  private Boolean isDisplayUnitLabelShown = null;

  @SerializedName("IsAutomaticMajorUnit")
  private Boolean isAutomaticMajorUnit = null;

  @SerializedName("IsLogarithmic")
  private Boolean isLogarithmic = null;

  @SerializedName("IsPlotOrderReversed")
  private Boolean isPlotOrderReversed = null;

  @SerializedName("IsVisible")
  private Boolean isVisible = null;

  @SerializedName("LogBase")
  private Double logBase = null;

  @SerializedName("MajorGridLines")
  private Line majorGridLines = null;

  @SerializedName("MajorTickMark")
  private String majorTickMark = null;

  @SerializedName("MajorUnit")
  private Double majorUnit = null;

  @SerializedName("MajorUnitScale")
  private String majorUnitScale = null;

  @SerializedName("MaxValue")
  private Double maxValue = null;

  @SerializedName("MinorGridLines")
  private Line minorGridLines = null;

  @SerializedName("MinorTickMark")
  private String minorTickMark = null;

  @SerializedName("MinorUnit")
  private Double minorUnit = null;

  @SerializedName("MinorUnitScale")
  private String minorUnitScale = null;

  @SerializedName("MinValue")
  private Double minValue = null;

  @SerializedName("TickLabelPosition")
  private String tickLabelPosition = null;

  @SerializedName("TickLabels")
  private TickLabels tickLabels = null;

  @SerializedName("TickLabelSpacing")
  private Integer tickLabelSpacing = null;

  @SerializedName("TickMarkSpacing")
  private Integer tickMarkSpacing = null;

  @SerializedName("Title")
  private Title title = null;

  public Axis area(Area area) {
    this.area = area;
    return this;
  }

   /**
   * Get area
   * @return area
  **/
  @ApiModelProperty(value = "")
  public Area getArea() {
    return area;
  }

  public void setArea(Area area) {
    this.area = area;
  }

  public Axis axisBetweenCategories(Boolean axisBetweenCategories) {
    this.axisBetweenCategories = axisBetweenCategories;
    return this;
  }

   /**
   *  
   * @return axisBetweenCategories
  **/
  @ApiModelProperty(value = " ")
  public Boolean AxisBetweenCategories() {
    return axisBetweenCategories;
  }

  public void setAxisBetweenCategories(Boolean axisBetweenCategories) {
    this.axisBetweenCategories = axisBetweenCategories;
  }

  public Axis axisLine(Area axisLine) {
    this.axisLine = axisLine;
    return this;
  }

   /**
   * 
   * @return axisLine
  **/
  @ApiModelProperty(value = "")
  public Area getAxisLine() {
    return axisLine;
  }

  public void setAxisLine(Area axisLine) {
    this.axisLine = axisLine;
  }

  public Axis baseUnitScale(String baseUnitScale) {
    this.baseUnitScale = baseUnitScale;
    return this;
  }

   /**
   *  
   * @return baseUnitScale
  **/
  @ApiModelProperty(value = " ")
  public String getBaseUnitScale() {
    return baseUnitScale;
  }

  public void setBaseUnitScale(String baseUnitScale) {
    this.baseUnitScale = baseUnitScale;
  }

  public Axis categoryType(String categoryType) {
    this.categoryType = categoryType;
    return this;
  }

   /**
   *  
   * @return categoryType
  **/
  @ApiModelProperty(value = " ")
  public String getCategoryType() {
    return categoryType;
  }

  public void setCategoryType(String categoryType) {
    this.categoryType = categoryType;
  }

  public Axis crossAt(Double crossAt) {
    this.crossAt = crossAt;
    return this;
  }

   /**
   *  
   * @return crossAt
  **/
  @ApiModelProperty(value = " ")
  public Double getCrossAt() {
    return crossAt;
  }

  public void setCrossAt(Double crossAt) {
    this.crossAt = crossAt;
  }

  public Axis crossType(String crossType) {
    this.crossType = crossType;
    return this;
  }

   /**
   *  
   * @return crossType
  **/
  @ApiModelProperty(value = " ")
  public String getCrossType() {
    return crossType;
  }

  public void setCrossType(String crossType) {
    this.crossType = crossType;
  }

  public Axis displayUnit(String displayUnit) {
    this.displayUnit = displayUnit;
    return this;
  }

   /**
   *  
   * @return displayUnit
  **/
  @ApiModelProperty(value = " ")
  public String getDisplayUnit() {
    return displayUnit;
  }

  public void setDisplayUnit(String displayUnit) {
    this.displayUnit = displayUnit;
  }

  public Axis hasMultiLevelLabels(Boolean hasMultiLevelLabels) {
    this.hasMultiLevelLabels = hasMultiLevelLabels;
    return this;
  }

   /**
   *  
   * @return hasMultiLevelLabels
  **/
  @ApiModelProperty(value = " ")
  public Boolean HasMultiLevelLabels() {
    return hasMultiLevelLabels;
  }

  public void setHasMultiLevelLabels(Boolean hasMultiLevelLabels) {
    this.hasMultiLevelLabels = hasMultiLevelLabels;
  }

  public Axis isAutomaticMaxValue(Boolean isAutomaticMaxValue) {
    this.isAutomaticMaxValue = isAutomaticMaxValue;
    return this;
  }

   /**
   *  
   * @return isAutomaticMaxValue
  **/
  @ApiModelProperty(value = " ")
  public Boolean IsAutomaticMaxValue() {
    return isAutomaticMaxValue;
  }

  public void setIsAutomaticMaxValue(Boolean isAutomaticMaxValue) {
    this.isAutomaticMaxValue = isAutomaticMaxValue;
  }

  public Axis isAutomaticMinorUnit(Boolean isAutomaticMinorUnit) {
    this.isAutomaticMinorUnit = isAutomaticMinorUnit;
    return this;
  }

   /**
   *  
   * @return isAutomaticMinorUnit
  **/
  @ApiModelProperty(value = " ")
  public Boolean IsAutomaticMinorUnit() {
    return isAutomaticMinorUnit;
  }

  public void setIsAutomaticMinorUnit(Boolean isAutomaticMinorUnit) {
    this.isAutomaticMinorUnit = isAutomaticMinorUnit;
  }

  public Axis isAutomaticMinValue(Boolean isAutomaticMinValue) {
    this.isAutomaticMinValue = isAutomaticMinValue;
    return this;
  }

   /**
   *  
   * @return isAutomaticMinValue
  **/
  @ApiModelProperty(value = " ")
  public Boolean IsAutomaticMinValue() {
    return isAutomaticMinValue;
  }

  public void setIsAutomaticMinValue(Boolean isAutomaticMinValue) {
    this.isAutomaticMinValue = isAutomaticMinValue;
  }

  public Axis isDisplayUnitLabelShown(Boolean isDisplayUnitLabelShown) {
    this.isDisplayUnitLabelShown = isDisplayUnitLabelShown;
    return this;
  }

   /**
   *  
   * @return isDisplayUnitLabelShown
  **/
  @ApiModelProperty(value = " ")
  public Boolean IsDisplayUnitLabelShown() {
    return isDisplayUnitLabelShown;
  }

  public void setIsDisplayUnitLabelShown(Boolean isDisplayUnitLabelShown) {
    this.isDisplayUnitLabelShown = isDisplayUnitLabelShown;
  }

  public Axis isAutomaticMajorUnit(Boolean isAutomaticMajorUnit) {
    this.isAutomaticMajorUnit = isAutomaticMajorUnit;
    return this;
  }

   /**
   *  
   * @return isAutomaticMajorUnit
  **/
  @ApiModelProperty(value = " ")
  public Boolean IsAutomaticMajorUnit() {
    return isAutomaticMajorUnit;
  }

  public void setIsAutomaticMajorUnit(Boolean isAutomaticMajorUnit) {
    this.isAutomaticMajorUnit = isAutomaticMajorUnit;
  }

  public Axis isLogarithmic(Boolean isLogarithmic) {
    this.isLogarithmic = isLogarithmic;
    return this;
  }

   /**
   *  
   * @return isLogarithmic
  **/
  @ApiModelProperty(value = " ")
  public Boolean IsLogarithmic() {
    return isLogarithmic;
  }

  public void setIsLogarithmic(Boolean isLogarithmic) {
    this.isLogarithmic = isLogarithmic;
  }

  public Axis isPlotOrderReversed(Boolean isPlotOrderReversed) {
    this.isPlotOrderReversed = isPlotOrderReversed;
    return this;
  }

   /**
   *  
   * @return isPlotOrderReversed
  **/
  @ApiModelProperty(value = " ")
  public Boolean IsPlotOrderReversed() {
    return isPlotOrderReversed;
  }

  public void setIsPlotOrderReversed(Boolean isPlotOrderReversed) {
    this.isPlotOrderReversed = isPlotOrderReversed;
  }

  public Axis isVisible(Boolean isVisible) {
    this.isVisible = isVisible;
    return this;
  }

   /**
   *  
   * @return isVisible
  **/
  @ApiModelProperty(value = " ")
  public Boolean IsVisible() {
    return isVisible;
  }

  public void setIsVisible(Boolean isVisible) {
    this.isVisible = isVisible;
  }

  public Axis logBase(Double logBase) {
    this.logBase = logBase;
    return this;
  }

   /**
   *  
   * @return logBase
  **/
  @ApiModelProperty(value = " ")
  public Double getLogBase() {
    return logBase;
  }

  public void setLogBase(Double logBase) {
    this.logBase = logBase;
  }

  public Axis majorGridLines(Line majorGridLines) {
    this.majorGridLines = majorGridLines;
    return this;
  }

   /**
   * 
   * @return majorGridLines
  **/
  @ApiModelProperty(value = "")
  public Line getMajorGridLines() {
    return majorGridLines;
  }

  public void setMajorGridLines(Line majorGridLines) {
    this.majorGridLines = majorGridLines;
  }

  public Axis majorTickMark(String majorTickMark) {
    this.majorTickMark = majorTickMark;
    return this;
  }

   /**
   *  
   * @return majorTickMark
  **/
  @ApiModelProperty(value = " ")
  public String getMajorTickMark() {
    return majorTickMark;
  }

  public void setMajorTickMark(String majorTickMark) {
    this.majorTickMark = majorTickMark;
  }

  public Axis majorUnit(Double majorUnit) {
    this.majorUnit = majorUnit;
    return this;
  }

   /**
   *  
   * @return majorUnit
  **/
  @ApiModelProperty(value = " ")
  public Double getMajorUnit() {
    return majorUnit;
  }

  public void setMajorUnit(Double majorUnit) {
    this.majorUnit = majorUnit;
  }

  public Axis majorUnitScale(String majorUnitScale) {
    this.majorUnitScale = majorUnitScale;
    return this;
  }

   /**
   *  
   * @return majorUnitScale
  **/
  @ApiModelProperty(value = " ")
  public String getMajorUnitScale() {
    return majorUnitScale;
  }

  public void setMajorUnitScale(String majorUnitScale) {
    this.majorUnitScale = majorUnitScale;
  }

  public Axis maxValue(Double maxValue) {
    this.maxValue = maxValue;
    return this;
  }

   /**
   *  
   * @return maxValue
  **/
  @ApiModelProperty(value = " ")
  public Double getMaxValue() {
    return maxValue;
  }

  public void setMaxValue(Double maxValue) {
    this.maxValue = maxValue;
  }

  public Axis minorGridLines(Line minorGridLines) {
    this.minorGridLines = minorGridLines;
    return this;
  }

   /**
   * 
   * @return minorGridLines
  **/
  @ApiModelProperty(value = "")
  public Line getMinorGridLines() {
    return minorGridLines;
  }

  public void setMinorGridLines(Line minorGridLines) {
    this.minorGridLines = minorGridLines;
  }

  public Axis minorTickMark(String minorTickMark) {
    this.minorTickMark = minorTickMark;
    return this;
  }

   /**
   *  
   * @return minorTickMark
  **/
  @ApiModelProperty(value = " ")
  public String getMinorTickMark() {
    return minorTickMark;
  }

  public void setMinorTickMark(String minorTickMark) {
    this.minorTickMark = minorTickMark;
  }

  public Axis minorUnit(Double minorUnit) {
    this.minorUnit = minorUnit;
    return this;
  }

   /**
   *  
   * @return minorUnit
  **/
  @ApiModelProperty(value = " ")
  public Double getMinorUnit() {
    return minorUnit;
  }

  public void setMinorUnit(Double minorUnit) {
    this.minorUnit = minorUnit;
  }

  public Axis minorUnitScale(String minorUnitScale) {
    this.minorUnitScale = minorUnitScale;
    return this;
  }

   /**
   *  
   * @return minorUnitScale
  **/
  @ApiModelProperty(value = " ")
  public String getMinorUnitScale() {
    return minorUnitScale;
  }

  public void setMinorUnitScale(String minorUnitScale) {
    this.minorUnitScale = minorUnitScale;
  }

  public Axis minValue(Double minValue) {
    this.minValue = minValue;
    return this;
  }

   /**
   *  
   * @return minValue
  **/
  @ApiModelProperty(value = " ")
  public Double getMinValue() {
    return minValue;
  }

  public void setMinValue(Double minValue) {
    this.minValue = minValue;
  }

  public Axis tickLabelPosition(String tickLabelPosition) {
    this.tickLabelPosition = tickLabelPosition;
    return this;
  }

   /**
   *  
   * @return tickLabelPosition
  **/
  @ApiModelProperty(value = " ")
  public String getTickLabelPosition() {
    return tickLabelPosition;
  }

  public void setTickLabelPosition(String tickLabelPosition) {
    this.tickLabelPosition = tickLabelPosition;
  }

  public Axis tickLabels(TickLabels tickLabels) {
    this.tickLabels = tickLabels;
    return this;
  }

   /**
   * 
   * @return tickLabels
  **/
  @ApiModelProperty(value = "")
  public TickLabels getTickLabels() {
    return tickLabels;
  }

  public void setTickLabels(TickLabels tickLabels) {
    this.tickLabels = tickLabels;
  }

  public Axis tickLabelSpacing(Integer tickLabelSpacing) {
    this.tickLabelSpacing = tickLabelSpacing;
    return this;
  }

   /**
   * Get tickLabelSpacing
   * @return tickLabelSpacing
  **/
  @ApiModelProperty(value = "")
  public Integer getTickLabelSpacing() {
    return tickLabelSpacing;
  }

  public void setTickLabelSpacing(Integer tickLabelSpacing) {
    this.tickLabelSpacing = tickLabelSpacing;
  }

  public Axis tickMarkSpacing(Integer tickMarkSpacing) {
    this.tickMarkSpacing = tickMarkSpacing;
    return this;
  }

   /**
   * Get tickMarkSpacing
   * @return tickMarkSpacing
  **/
  @ApiModelProperty(value = "")
  public Integer getTickMarkSpacing() {
    return tickMarkSpacing;
  }

  public void setTickMarkSpacing(Integer tickMarkSpacing) {
    this.tickMarkSpacing = tickMarkSpacing;
  }

  public Axis title(Title title) {
    this.title = title;
    return this;
  }

   /**
   * 
   * @return title
  **/
  @ApiModelProperty(value = "")
  public Title getTitle() {
    return title;
  }

  public void setTitle(Title title) {
    this.title = title;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Axis axis = (Axis) o;
    return Objects.equals(this.area, axis.area) &&
        Objects.equals(this.axisBetweenCategories, axis.axisBetweenCategories) &&
        Objects.equals(this.axisLine, axis.axisLine) &&
        Objects.equals(this.baseUnitScale, axis.baseUnitScale) &&
        Objects.equals(this.categoryType, axis.categoryType) &&
        Objects.equals(this.crossAt, axis.crossAt) &&
        Objects.equals(this.crossType, axis.crossType) &&
        Objects.equals(this.displayUnit, axis.displayUnit) &&
        Objects.equals(this.hasMultiLevelLabels, axis.hasMultiLevelLabels) &&
        Objects.equals(this.isAutomaticMaxValue, axis.isAutomaticMaxValue) &&
        Objects.equals(this.isAutomaticMinorUnit, axis.isAutomaticMinorUnit) &&
        Objects.equals(this.isAutomaticMinValue, axis.isAutomaticMinValue) &&
        Objects.equals(this.isDisplayUnitLabelShown, axis.isDisplayUnitLabelShown) &&
        Objects.equals(this.isAutomaticMajorUnit, axis.isAutomaticMajorUnit) &&
        Objects.equals(this.isLogarithmic, axis.isLogarithmic) &&
        Objects.equals(this.isPlotOrderReversed, axis.isPlotOrderReversed) &&
        Objects.equals(this.isVisible, axis.isVisible) &&
        Objects.equals(this.logBase, axis.logBase) &&
        Objects.equals(this.majorGridLines, axis.majorGridLines) &&
        Objects.equals(this.majorTickMark, axis.majorTickMark) &&
        Objects.equals(this.majorUnit, axis.majorUnit) &&
        Objects.equals(this.majorUnitScale, axis.majorUnitScale) &&
        Objects.equals(this.maxValue, axis.maxValue) &&
        Objects.equals(this.minorGridLines, axis.minorGridLines) &&
        Objects.equals(this.minorTickMark, axis.minorTickMark) &&
        Objects.equals(this.minorUnit, axis.minorUnit) &&
        Objects.equals(this.minorUnitScale, axis.minorUnitScale) &&
        Objects.equals(this.minValue, axis.minValue) &&
        Objects.equals(this.tickLabelPosition, axis.tickLabelPosition) &&
        Objects.equals(this.tickLabels, axis.tickLabels) &&
        Objects.equals(this.tickLabelSpacing, axis.tickLabelSpacing) &&
        Objects.equals(this.tickMarkSpacing, axis.tickMarkSpacing) &&
        Objects.equals(this.title, axis.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(area, axisBetweenCategories, axisLine, baseUnitScale, categoryType, crossAt, crossType, displayUnit, hasMultiLevelLabels, isAutomaticMaxValue, isAutomaticMinorUnit, isAutomaticMinValue, isDisplayUnitLabelShown, isAutomaticMajorUnit, isLogarithmic, isPlotOrderReversed, isVisible, logBase, majorGridLines, majorTickMark, majorUnit, majorUnitScale, maxValue, minorGridLines, minorTickMark, minorUnit, minorUnitScale, minValue, tickLabelPosition, tickLabels, tickLabelSpacing, tickMarkSpacing, title);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Axis {\n");
    
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    axisBetweenCategories: ").append(toIndentedString(axisBetweenCategories)).append("\n");
    sb.append("    axisLine: ").append(toIndentedString(axisLine)).append("\n");
    sb.append("    baseUnitScale: ").append(toIndentedString(baseUnitScale)).append("\n");
    sb.append("    categoryType: ").append(toIndentedString(categoryType)).append("\n");
    sb.append("    crossAt: ").append(toIndentedString(crossAt)).append("\n");
    sb.append("    crossType: ").append(toIndentedString(crossType)).append("\n");
    sb.append("    displayUnit: ").append(toIndentedString(displayUnit)).append("\n");
    sb.append("    hasMultiLevelLabels: ").append(toIndentedString(hasMultiLevelLabels)).append("\n");
    sb.append("    isAutomaticMaxValue: ").append(toIndentedString(isAutomaticMaxValue)).append("\n");
    sb.append("    isAutomaticMinorUnit: ").append(toIndentedString(isAutomaticMinorUnit)).append("\n");
    sb.append("    isAutomaticMinValue: ").append(toIndentedString(isAutomaticMinValue)).append("\n");
    sb.append("    isDisplayUnitLabelShown: ").append(toIndentedString(isDisplayUnitLabelShown)).append("\n");
    sb.append("    isAutomaticMajorUnit: ").append(toIndentedString(isAutomaticMajorUnit)).append("\n");
    sb.append("    isLogarithmic: ").append(toIndentedString(isLogarithmic)).append("\n");
    sb.append("    isPlotOrderReversed: ").append(toIndentedString(isPlotOrderReversed)).append("\n");
    sb.append("    isVisible: ").append(toIndentedString(isVisible)).append("\n");
    sb.append("    logBase: ").append(toIndentedString(logBase)).append("\n");
    sb.append("    majorGridLines: ").append(toIndentedString(majorGridLines)).append("\n");
    sb.append("    majorTickMark: ").append(toIndentedString(majorTickMark)).append("\n");
    sb.append("    majorUnit: ").append(toIndentedString(majorUnit)).append("\n");
    sb.append("    majorUnitScale: ").append(toIndentedString(majorUnitScale)).append("\n");
    sb.append("    maxValue: ").append(toIndentedString(maxValue)).append("\n");
    sb.append("    minorGridLines: ").append(toIndentedString(minorGridLines)).append("\n");
    sb.append("    minorTickMark: ").append(toIndentedString(minorTickMark)).append("\n");
    sb.append("    minorUnit: ").append(toIndentedString(minorUnit)).append("\n");
    sb.append("    minorUnitScale: ").append(toIndentedString(minorUnitScale)).append("\n");
    sb.append("    minValue: ").append(toIndentedString(minValue)).append("\n");
    sb.append("    tickLabelPosition: ").append(toIndentedString(tickLabelPosition)).append("\n");
    sb.append("    tickLabels: ").append(toIndentedString(tickLabels)).append("\n");
    sb.append("    tickLabelSpacing: ").append(toIndentedString(tickLabelSpacing)).append("\n");
    sb.append("    tickMarkSpacing: ").append(toIndentedString(tickMarkSpacing)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

