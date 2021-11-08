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
import com.aspose.cloud.cells.model.CellsColor;
import com.aspose.cloud.cells.model.Sparkline;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SparklineGroup
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-01T17:19:06.500-05:00")
public class SparklineGroup {
  @SerializedName("DisplayHidden")
  private Boolean displayHidden = null;

  @SerializedName("FirstPointColor")
  private CellsColor firstPointColor = null;

  @SerializedName("HighPointColor")
  private CellsColor highPointColor = null;

  @SerializedName("HorizontalAxisColor")
  private CellsColor horizontalAxisColor = null;

  @SerializedName("HorizontalAxisDateRange")
  private String horizontalAxisDateRange = null;

  @SerializedName("LastPointColor")
  private CellsColor lastPointColor = null;

  @SerializedName("LineWeight")
  private Double lineWeight = null;

  @SerializedName("LowPointColor")
  private CellsColor lowPointColor = null;

  @SerializedName("MarkersColor")
  private CellsColor markersColor = null;

  @SerializedName("NegativePointsColor")
  private CellsColor negativePointsColor = null;

  @SerializedName("PlotEmptyCellsType")
  private String plotEmptyCellsType = null;

  @SerializedName("PlotRightToLeft")
  private Boolean plotRightToLeft = null;

  @SerializedName("PresetStyle")
  private String presetStyle = null;

  @SerializedName("SeriesColor")
  private CellsColor seriesColor = null;

  @SerializedName("ShowFirstPoint")
  private Boolean showFirstPoint = null;

  @SerializedName("ShowHighPoint")
  private Boolean showHighPoint = null;

  @SerializedName("ShowHorizontalAxis")
  private Boolean showHorizontalAxis = null;

  @SerializedName("ShowLastPoint")
  private Boolean showLastPoint = null;

  @SerializedName("ShowLowPoint")
  private Boolean showLowPoint = null;

  @SerializedName("ShowMarkers")
  private Boolean showMarkers = null;

  @SerializedName("ShowNegativePoints")
  private Boolean showNegativePoints = null;

  @SerializedName("SparklineCollection")
  private List<Sparkline> sparklineCollection = null;

  @SerializedName("Type")
  private String type = null;

  @SerializedName("VerticalAxisMaxValue")
  private Double verticalAxisMaxValue = null;

  @SerializedName("VerticalAxisMaxValueType")
  private String verticalAxisMaxValueType = null;

  @SerializedName("VerticalAxisMinValue")
  private Double verticalAxisMinValue = null;

  @SerializedName("VerticalAxisMinValueType")
  private String verticalAxisMinValueType = null;

  public SparklineGroup displayHidden(Boolean displayHidden) {
    this.displayHidden = displayHidden;
    return this;
  }

   /**
   * Get displayHidden
   * @return displayHidden
  **/
  @ApiModelProperty(value = "")
  public Boolean DisplayHidden() {
    return displayHidden;
  }

  public void setDisplayHidden(Boolean displayHidden) {
    this.displayHidden = displayHidden;
  }

  public SparklineGroup firstPointColor(CellsColor firstPointColor) {
    this.firstPointColor = firstPointColor;
    return this;
  }

   /**
   * Get firstPointColor
   * @return firstPointColor
  **/
  @ApiModelProperty(value = "")
  public CellsColor getFirstPointColor() {
    return firstPointColor;
  }

  public void setFirstPointColor(CellsColor firstPointColor) {
    this.firstPointColor = firstPointColor;
  }

  public SparklineGroup highPointColor(CellsColor highPointColor) {
    this.highPointColor = highPointColor;
    return this;
  }

   /**
   * Get highPointColor
   * @return highPointColor
  **/
  @ApiModelProperty(value = "")
  public CellsColor getHighPointColor() {
    return highPointColor;
  }

  public void setHighPointColor(CellsColor highPointColor) {
    this.highPointColor = highPointColor;
  }

  public SparklineGroup horizontalAxisColor(CellsColor horizontalAxisColor) {
    this.horizontalAxisColor = horizontalAxisColor;
    return this;
  }

   /**
   * Get horizontalAxisColor
   * @return horizontalAxisColor
  **/
  @ApiModelProperty(value = "")
  public CellsColor getHorizontalAxisColor() {
    return horizontalAxisColor;
  }

  public void setHorizontalAxisColor(CellsColor horizontalAxisColor) {
    this.horizontalAxisColor = horizontalAxisColor;
  }

  public SparklineGroup horizontalAxisDateRange(String horizontalAxisDateRange) {
    this.horizontalAxisDateRange = horizontalAxisDateRange;
    return this;
  }

   /**
   * Get horizontalAxisDateRange
   * @return horizontalAxisDateRange
  **/
  @ApiModelProperty(value = "")
  public String getHorizontalAxisDateRange() {
    return horizontalAxisDateRange;
  }

  public void setHorizontalAxisDateRange(String horizontalAxisDateRange) {
    this.horizontalAxisDateRange = horizontalAxisDateRange;
  }

  public SparklineGroup lastPointColor(CellsColor lastPointColor) {
    this.lastPointColor = lastPointColor;
    return this;
  }

   /**
   * Get lastPointColor
   * @return lastPointColor
  **/
  @ApiModelProperty(value = "")
  public CellsColor getLastPointColor() {
    return lastPointColor;
  }

  public void setLastPointColor(CellsColor lastPointColor) {
    this.lastPointColor = lastPointColor;
  }

  public SparklineGroup lineWeight(Double lineWeight) {
    this.lineWeight = lineWeight;
    return this;
  }

   /**
   * Get lineWeight
   * @return lineWeight
  **/
  @ApiModelProperty(value = "")
  public Double getLineWeight() {
    return lineWeight;
  }

  public void setLineWeight(Double lineWeight) {
    this.lineWeight = lineWeight;
  }

  public SparklineGroup lowPointColor(CellsColor lowPointColor) {
    this.lowPointColor = lowPointColor;
    return this;
  }

   /**
   * Get lowPointColor
   * @return lowPointColor
  **/
  @ApiModelProperty(value = "")
  public CellsColor getLowPointColor() {
    return lowPointColor;
  }

  public void setLowPointColor(CellsColor lowPointColor) {
    this.lowPointColor = lowPointColor;
  }

  public SparklineGroup markersColor(CellsColor markersColor) {
    this.markersColor = markersColor;
    return this;
  }

   /**
   * Get markersColor
   * @return markersColor
  **/
  @ApiModelProperty(value = "")
  public CellsColor getMarkersColor() {
    return markersColor;
  }

  public void setMarkersColor(CellsColor markersColor) {
    this.markersColor = markersColor;
  }

  public SparklineGroup negativePointsColor(CellsColor negativePointsColor) {
    this.negativePointsColor = negativePointsColor;
    return this;
  }

   /**
   * Get negativePointsColor
   * @return negativePointsColor
  **/
  @ApiModelProperty(value = "")
  public CellsColor getNegativePointsColor() {
    return negativePointsColor;
  }

  public void setNegativePointsColor(CellsColor negativePointsColor) {
    this.negativePointsColor = negativePointsColor;
  }

  public SparklineGroup plotEmptyCellsType(String plotEmptyCellsType) {
    this.plotEmptyCellsType = plotEmptyCellsType;
    return this;
  }

   /**
   * Get plotEmptyCellsType
   * @return plotEmptyCellsType
  **/
  @ApiModelProperty(value = "")
  public String getPlotEmptyCellsType() {
    return plotEmptyCellsType;
  }

  public void setPlotEmptyCellsType(String plotEmptyCellsType) {
    this.plotEmptyCellsType = plotEmptyCellsType;
  }

  public SparklineGroup plotRightToLeft(Boolean plotRightToLeft) {
    this.plotRightToLeft = plotRightToLeft;
    return this;
  }

   /**
   * Get plotRightToLeft
   * @return plotRightToLeft
  **/
  @ApiModelProperty(value = "")
  public Boolean PlotRightToLeft() {
    return plotRightToLeft;
  }

  public void setPlotRightToLeft(Boolean plotRightToLeft) {
    this.plotRightToLeft = plotRightToLeft;
  }

  public SparklineGroup presetStyle(String presetStyle) {
    this.presetStyle = presetStyle;
    return this;
  }

   /**
   * Get presetStyle
   * @return presetStyle
  **/
  @ApiModelProperty(value = "")
  public String getPresetStyle() {
    return presetStyle;
  }

  public void setPresetStyle(String presetStyle) {
    this.presetStyle = presetStyle;
  }

  public SparklineGroup seriesColor(CellsColor seriesColor) {
    this.seriesColor = seriesColor;
    return this;
  }

   /**
   * Get seriesColor
   * @return seriesColor
  **/
  @ApiModelProperty(value = "")
  public CellsColor getSeriesColor() {
    return seriesColor;
  }

  public void setSeriesColor(CellsColor seriesColor) {
    this.seriesColor = seriesColor;
  }

  public SparklineGroup showFirstPoint(Boolean showFirstPoint) {
    this.showFirstPoint = showFirstPoint;
    return this;
  }

   /**
   * Get showFirstPoint
   * @return showFirstPoint
  **/
  @ApiModelProperty(value = "")
  public Boolean ShowFirstPoint() {
    return showFirstPoint;
  }

  public void setShowFirstPoint(Boolean showFirstPoint) {
    this.showFirstPoint = showFirstPoint;
  }

  public SparklineGroup showHighPoint(Boolean showHighPoint) {
    this.showHighPoint = showHighPoint;
    return this;
  }

   /**
   * Get showHighPoint
   * @return showHighPoint
  **/
  @ApiModelProperty(value = "")
  public Boolean ShowHighPoint() {
    return showHighPoint;
  }

  public void setShowHighPoint(Boolean showHighPoint) {
    this.showHighPoint = showHighPoint;
  }

  public SparklineGroup showHorizontalAxis(Boolean showHorizontalAxis) {
    this.showHorizontalAxis = showHorizontalAxis;
    return this;
  }

   /**
   * Get showHorizontalAxis
   * @return showHorizontalAxis
  **/
  @ApiModelProperty(value = "")
  public Boolean ShowHorizontalAxis() {
    return showHorizontalAxis;
  }

  public void setShowHorizontalAxis(Boolean showHorizontalAxis) {
    this.showHorizontalAxis = showHorizontalAxis;
  }

  public SparklineGroup showLastPoint(Boolean showLastPoint) {
    this.showLastPoint = showLastPoint;
    return this;
  }

   /**
   * Get showLastPoint
   * @return showLastPoint
  **/
  @ApiModelProperty(value = "")
  public Boolean ShowLastPoint() {
    return showLastPoint;
  }

  public void setShowLastPoint(Boolean showLastPoint) {
    this.showLastPoint = showLastPoint;
  }

  public SparklineGroup showLowPoint(Boolean showLowPoint) {
    this.showLowPoint = showLowPoint;
    return this;
  }

   /**
   * Get showLowPoint
   * @return showLowPoint
  **/
  @ApiModelProperty(value = "")
  public Boolean ShowLowPoint() {
    return showLowPoint;
  }

  public void setShowLowPoint(Boolean showLowPoint) {
    this.showLowPoint = showLowPoint;
  }

  public SparklineGroup showMarkers(Boolean showMarkers) {
    this.showMarkers = showMarkers;
    return this;
  }

   /**
   * Get showMarkers
   * @return showMarkers
  **/
  @ApiModelProperty(value = "")
  public Boolean ShowMarkers() {
    return showMarkers;
  }

  public void setShowMarkers(Boolean showMarkers) {
    this.showMarkers = showMarkers;
  }

  public SparklineGroup showNegativePoints(Boolean showNegativePoints) {
    this.showNegativePoints = showNegativePoints;
    return this;
  }

   /**
   * Get showNegativePoints
   * @return showNegativePoints
  **/
  @ApiModelProperty(value = "")
  public Boolean ShowNegativePoints() {
    return showNegativePoints;
  }

  public void setShowNegativePoints(Boolean showNegativePoints) {
    this.showNegativePoints = showNegativePoints;
  }

  public SparklineGroup sparklineCollection(List<Sparkline> sparklineCollection) {
    this.sparklineCollection = sparklineCollection;
    return this;
  }

  public SparklineGroup addSparklineCollectionItem(Sparkline sparklineCollectionItem) {
    if (this.sparklineCollection == null) {
      this.sparklineCollection = new ArrayList<>();
    }
    this.sparklineCollection.add(sparklineCollectionItem);
    return this;
  }

   /**
   * Get sparklineCollection
   * @return sparklineCollection
  **/
  @ApiModelProperty(value = "")
  public List<Sparkline> getSparklineCollection() {
    return sparklineCollection;
  }

  public void setSparklineCollection(List<Sparkline> sparklineCollection) {
    this.sparklineCollection = sparklineCollection;
  }

  public SparklineGroup type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public SparklineGroup verticalAxisMaxValue(Double verticalAxisMaxValue) {
    this.verticalAxisMaxValue = verticalAxisMaxValue;
    return this;
  }

   /**
   * Get verticalAxisMaxValue
   * @return verticalAxisMaxValue
  **/
  @ApiModelProperty(value = "")
  public Double getVerticalAxisMaxValue() {
    return verticalAxisMaxValue;
  }

  public void setVerticalAxisMaxValue(Double verticalAxisMaxValue) {
    this.verticalAxisMaxValue = verticalAxisMaxValue;
  }

  public SparklineGroup verticalAxisMaxValueType(String verticalAxisMaxValueType) {
    this.verticalAxisMaxValueType = verticalAxisMaxValueType;
    return this;
  }

   /**
   * Get verticalAxisMaxValueType
   * @return verticalAxisMaxValueType
  **/
  @ApiModelProperty(value = "")
  public String getVerticalAxisMaxValueType() {
    return verticalAxisMaxValueType;
  }

  public void setVerticalAxisMaxValueType(String verticalAxisMaxValueType) {
    this.verticalAxisMaxValueType = verticalAxisMaxValueType;
  }

  public SparklineGroup verticalAxisMinValue(Double verticalAxisMinValue) {
    this.verticalAxisMinValue = verticalAxisMinValue;
    return this;
  }

   /**
   * Get verticalAxisMinValue
   * @return verticalAxisMinValue
  **/
  @ApiModelProperty(value = "")
  public Double getVerticalAxisMinValue() {
    return verticalAxisMinValue;
  }

  public void setVerticalAxisMinValue(Double verticalAxisMinValue) {
    this.verticalAxisMinValue = verticalAxisMinValue;
  }

  public SparklineGroup verticalAxisMinValueType(String verticalAxisMinValueType) {
    this.verticalAxisMinValueType = verticalAxisMinValueType;
    return this;
  }

   /**
   * Get verticalAxisMinValueType
   * @return verticalAxisMinValueType
  **/
  @ApiModelProperty(value = "")
  public String getVerticalAxisMinValueType() {
    return verticalAxisMinValueType;
  }

  public void setVerticalAxisMinValueType(String verticalAxisMinValueType) {
    this.verticalAxisMinValueType = verticalAxisMinValueType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SparklineGroup sparklineGroup = (SparklineGroup) o;
    return Objects.equals(this.displayHidden, sparklineGroup.displayHidden) &&
        Objects.equals(this.firstPointColor, sparklineGroup.firstPointColor) &&
        Objects.equals(this.highPointColor, sparklineGroup.highPointColor) &&
        Objects.equals(this.horizontalAxisColor, sparklineGroup.horizontalAxisColor) &&
        Objects.equals(this.horizontalAxisDateRange, sparklineGroup.horizontalAxisDateRange) &&
        Objects.equals(this.lastPointColor, sparklineGroup.lastPointColor) &&
        Objects.equals(this.lineWeight, sparklineGroup.lineWeight) &&
        Objects.equals(this.lowPointColor, sparklineGroup.lowPointColor) &&
        Objects.equals(this.markersColor, sparklineGroup.markersColor) &&
        Objects.equals(this.negativePointsColor, sparklineGroup.negativePointsColor) &&
        Objects.equals(this.plotEmptyCellsType, sparklineGroup.plotEmptyCellsType) &&
        Objects.equals(this.plotRightToLeft, sparklineGroup.plotRightToLeft) &&
        Objects.equals(this.presetStyle, sparklineGroup.presetStyle) &&
        Objects.equals(this.seriesColor, sparklineGroup.seriesColor) &&
        Objects.equals(this.showFirstPoint, sparklineGroup.showFirstPoint) &&
        Objects.equals(this.showHighPoint, sparklineGroup.showHighPoint) &&
        Objects.equals(this.showHorizontalAxis, sparklineGroup.showHorizontalAxis) &&
        Objects.equals(this.showLastPoint, sparklineGroup.showLastPoint) &&
        Objects.equals(this.showLowPoint, sparklineGroup.showLowPoint) &&
        Objects.equals(this.showMarkers, sparklineGroup.showMarkers) &&
        Objects.equals(this.showNegativePoints, sparklineGroup.showNegativePoints) &&
        Objects.equals(this.sparklineCollection, sparklineGroup.sparklineCollection) &&
        Objects.equals(this.type, sparklineGroup.type) &&
        Objects.equals(this.verticalAxisMaxValue, sparklineGroup.verticalAxisMaxValue) &&
        Objects.equals(this.verticalAxisMaxValueType, sparklineGroup.verticalAxisMaxValueType) &&
        Objects.equals(this.verticalAxisMinValue, sparklineGroup.verticalAxisMinValue) &&
        Objects.equals(this.verticalAxisMinValueType, sparklineGroup.verticalAxisMinValueType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayHidden, firstPointColor, highPointColor, horizontalAxisColor, horizontalAxisDateRange, lastPointColor, lineWeight, lowPointColor, markersColor, negativePointsColor, plotEmptyCellsType, plotRightToLeft, presetStyle, seriesColor, showFirstPoint, showHighPoint, showHorizontalAxis, showLastPoint, showLowPoint, showMarkers, showNegativePoints, sparklineCollection, type, verticalAxisMaxValue, verticalAxisMaxValueType, verticalAxisMinValue, verticalAxisMinValueType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SparklineGroup {\n");
    
    sb.append("    displayHidden: ").append(toIndentedString(displayHidden)).append("\n");
    sb.append("    firstPointColor: ").append(toIndentedString(firstPointColor)).append("\n");
    sb.append("    highPointColor: ").append(toIndentedString(highPointColor)).append("\n");
    sb.append("    horizontalAxisColor: ").append(toIndentedString(horizontalAxisColor)).append("\n");
    sb.append("    horizontalAxisDateRange: ").append(toIndentedString(horizontalAxisDateRange)).append("\n");
    sb.append("    lastPointColor: ").append(toIndentedString(lastPointColor)).append("\n");
    sb.append("    lineWeight: ").append(toIndentedString(lineWeight)).append("\n");
    sb.append("    lowPointColor: ").append(toIndentedString(lowPointColor)).append("\n");
    sb.append("    markersColor: ").append(toIndentedString(markersColor)).append("\n");
    sb.append("    negativePointsColor: ").append(toIndentedString(negativePointsColor)).append("\n");
    sb.append("    plotEmptyCellsType: ").append(toIndentedString(plotEmptyCellsType)).append("\n");
    sb.append("    plotRightToLeft: ").append(toIndentedString(plotRightToLeft)).append("\n");
    sb.append("    presetStyle: ").append(toIndentedString(presetStyle)).append("\n");
    sb.append("    seriesColor: ").append(toIndentedString(seriesColor)).append("\n");
    sb.append("    showFirstPoint: ").append(toIndentedString(showFirstPoint)).append("\n");
    sb.append("    showHighPoint: ").append(toIndentedString(showHighPoint)).append("\n");
    sb.append("    showHorizontalAxis: ").append(toIndentedString(showHorizontalAxis)).append("\n");
    sb.append("    showLastPoint: ").append(toIndentedString(showLastPoint)).append("\n");
    sb.append("    showLowPoint: ").append(toIndentedString(showLowPoint)).append("\n");
    sb.append("    showMarkers: ").append(toIndentedString(showMarkers)).append("\n");
    sb.append("    showNegativePoints: ").append(toIndentedString(showNegativePoints)).append("\n");
    sb.append("    sparklineCollection: ").append(toIndentedString(sparklineCollection)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    verticalAxisMaxValue: ").append(toIndentedString(verticalAxisMaxValue)).append("\n");
    sb.append("    verticalAxisMaxValueType: ").append(toIndentedString(verticalAxisMaxValueType)).append("\n");
    sb.append("    verticalAxisMinValue: ").append(toIndentedString(verticalAxisMinValue)).append("\n");
    sb.append("    verticalAxisMinValueType: ").append(toIndentedString(verticalAxisMinValueType)).append("\n");
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

