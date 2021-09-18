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
import com.aspose.cloud.cells.model.Link;
import com.aspose.cloud.cells.model.LinkElement;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Chart
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-09-17T23:42:04.472-05:00")
public class Chart {
  @SerializedName("link")
  private Link link = null;

  @SerializedName("FirstSliceAngle")
  private Integer firstSliceAngle = null;

  @SerializedName("Floor")
  private LinkElement floor = null;

  @SerializedName("PlotEmptyCellsType")
  private String plotEmptyCellsType = null;

  @SerializedName("AutoScaling")
  private Boolean autoScaling = null;

  @SerializedName("Style")
  private Integer style = null;

  @SerializedName("SeriesAxis")
  private LinkElement seriesAxis = null;

  @SerializedName("ValueAxis")
  private LinkElement valueAxis = null;

  @SerializedName("ShowDataTable")
  private Boolean showDataTable = null;

  @SerializedName("Is3D")
  private Boolean is3D = null;

  @SerializedName("ChartArea")
  private LinkElement chartArea = null;

  @SerializedName("Elevation")
  private Integer elevation = null;

  @SerializedName("SideWall")
  private LinkElement sideWall = null;

  @SerializedName("Type")
  private String type = null;

  @SerializedName("Title")
  private LinkElement title = null;

  @SerializedName("Walls")
  private LinkElement walls = null;

  @SerializedName("BackWall")
  private LinkElement backWall = null;

  @SerializedName("ChartDataTable")
  private LinkElement chartDataTable = null;

  @SerializedName("HeightPercent")
  private Integer heightPercent = null;

  @SerializedName("GapWidth")
  private Integer gapWidth = null;

  @SerializedName("Legend")
  private LinkElement legend = null;

  @SerializedName("ChartObject")
  private LinkElement chartObject = null;

  @SerializedName("IsRectangularCornered")
  private Boolean isRectangularCornered = null;

  @SerializedName("SecondCategoryAxis")
  private LinkElement secondCategoryAxis = null;

  @SerializedName("SecondValueAxis")
  private LinkElement secondValueAxis = null;

  @SerializedName("Placement")
  private String placement = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("SizeWithWindow")
  private Boolean sizeWithWindow = null;

  @SerializedName("RightAngleAxes")
  private Boolean rightAngleAxes = null;

  @SerializedName("PlotVisibleCells")
  private Boolean plotVisibleCells = null;

  @SerializedName("ShowLegend")
  private Boolean showLegend = null;

  @SerializedName("PivotSource")
  private String pivotSource = null;

  @SerializedName("DepthPercent")
  private Integer depthPercent = null;

  @SerializedName("PrintSize")
  private String printSize = null;

  @SerializedName("GapDepth")
  private Integer gapDepth = null;

  @SerializedName("Shapes")
  private LinkElement shapes = null;

  @SerializedName("WallsAndGridlines2D")
  private Boolean wallsAndGridlines2D = null;

  @SerializedName("NSeries")
  private LinkElement nseries = null;

  @SerializedName("RotationAngle")
  private Integer rotationAngle = null;

  @SerializedName("PlotArea")
  private LinkElement plotArea = null;

  @SerializedName("CategoryAxis")
  private LinkElement categoryAxis = null;

  @SerializedName("Perspective")
  private Integer perspective = null;

  @SerializedName("HidePivotFieldButtons")
  private Boolean hidePivotFieldButtons = null;

  @SerializedName("PageSetup")
  private LinkElement pageSetup = null;

  public Chart link(Link link) {
    this.link = link;
    return this;
  }

   /**
   * Get link
   * @return link
  **/
  @ApiModelProperty(value = "")
  public Link getLink() {
    return link;
  }

  public void setLink(Link link) {
    this.link = link;
  }

  public Chart firstSliceAngle(Integer firstSliceAngle) {
    this.firstSliceAngle = firstSliceAngle;
    return this;
  }

   /**
   * Gets or sets the angle of the first pie-chart or doughnut-chart slice, in degrees (clockwise from vertical). Applies only to pie, 3-D pie, and doughnut charts, 0 to 360.
   * @return firstSliceAngle
  **/
  @ApiModelProperty(value = "Gets or sets the angle of the first pie-chart or doughnut-chart slice, in degrees (clockwise from vertical). Applies only to pie, 3-D pie, and doughnut charts, 0 to 360.")
  public Integer getFirstSliceAngle() {
    return firstSliceAngle;
  }

  public void setFirstSliceAngle(Integer firstSliceAngle) {
    this.firstSliceAngle = firstSliceAngle;
  }

  public Chart floor(LinkElement floor) {
    this.floor = floor;
    return this;
  }

   /**
   * Returns a Floor object that represents the walls of a 3-D chart.             
   * @return floor
  **/
  @ApiModelProperty(value = "Returns a Floor object that represents the walls of a 3-D chart.             ")
  public LinkElement getFloor() {
    return floor;
  }

  public void setFloor(LinkElement floor) {
    this.floor = floor;
  }

  public Chart plotEmptyCellsType(String plotEmptyCellsType) {
    this.plotEmptyCellsType = plotEmptyCellsType;
    return this;
  }

   /**
   * Gets and sets how to plot the empty cells.
   * @return plotEmptyCellsType
  **/
  @ApiModelProperty(value = "Gets and sets how to plot the empty cells.")
  public String getPlotEmptyCellsType() {
    return plotEmptyCellsType;
  }

  public void setPlotEmptyCellsType(String plotEmptyCellsType) {
    this.plotEmptyCellsType = plotEmptyCellsType;
  }

  public Chart autoScaling(Boolean autoScaling) {
    this.autoScaling = autoScaling;
    return this;
  }

   /**
   * True if Microsoft Excel scales a 3-D chart so that it&#39;s closer in size to the equivalent 2-D chart. The RightAngleAxes property must be True.
   * @return autoScaling
  **/
  @ApiModelProperty(value = "True if Microsoft Excel scales a 3-D chart so that it's closer in size to the equivalent 2-D chart. The RightAngleAxes property must be True.")
  public Boolean AutoScaling() {
    return autoScaling;
  }

  public void setAutoScaling(Boolean autoScaling) {
    this.autoScaling = autoScaling;
  }

  public Chart style(Integer style) {
    this.style = style;
    return this;
  }

   /**
   * Gets and sets the builtin style.
   * @return style
  **/
  @ApiModelProperty(value = "Gets and sets the builtin style.")
  public Integer getStyle() {
    return style;
  }

  public void setStyle(Integer style) {
    this.style = style;
  }

  public Chart seriesAxis(LinkElement seriesAxis) {
    this.seriesAxis = seriesAxis;
    return this;
  }

   /**
   * Gets the chart&#39;s series axis.
   * @return seriesAxis
  **/
  @ApiModelProperty(value = "Gets the chart's series axis.")
  public LinkElement getSeriesAxis() {
    return seriesAxis;
  }

  public void setSeriesAxis(LinkElement seriesAxis) {
    this.seriesAxis = seriesAxis;
  }

  public Chart valueAxis(LinkElement valueAxis) {
    this.valueAxis = valueAxis;
    return this;
  }

   /**
   * Gets the chart&#39;s Y axis.
   * @return valueAxis
  **/
  @ApiModelProperty(value = "Gets the chart's Y axis.")
  public LinkElement getValueAxis() {
    return valueAxis;
  }

  public void setValueAxis(LinkElement valueAxis) {
    this.valueAxis = valueAxis;
  }

  public Chart showDataTable(Boolean showDataTable) {
    this.showDataTable = showDataTable;
    return this;
  }

   /**
   * Gets or sets a value indicating whether the chart displays a data table.
   * @return showDataTable
  **/
  @ApiModelProperty(value = "Gets or sets a value indicating whether the chart displays a data table.")
  public Boolean ShowDataTable() {
    return showDataTable;
  }

  public void setShowDataTable(Boolean showDataTable) {
    this.showDataTable = showDataTable;
  }

  public Chart is3D(Boolean is3D) {
    this.is3D = is3D;
    return this;
  }

   /**
   * Indicates whether the chart is a 3d chart.
   * @return is3D
  **/
  @ApiModelProperty(value = "Indicates whether the chart is a 3d chart.")
  public Boolean Is3D() {
    return is3D;
  }

  public void setIs3D(Boolean is3D) {
    this.is3D = is3D;
  }

  public Chart chartArea(LinkElement chartArea) {
    this.chartArea = chartArea;
    return this;
  }

   /**
   * Gets the chart area in the worksheet
   * @return chartArea
  **/
  @ApiModelProperty(value = "Gets the chart area in the worksheet")
  public LinkElement getChartArea() {
    return chartArea;
  }

  public void setChartArea(LinkElement chartArea) {
    this.chartArea = chartArea;
  }

  public Chart elevation(Integer elevation) {
    this.elevation = elevation;
    return this;
  }

   /**
   * Represents the elevation of the 3-D chart view, in degrees.
   * @return elevation
  **/
  @ApiModelProperty(value = "Represents the elevation of the 3-D chart view, in degrees.")
  public Integer getElevation() {
    return elevation;
  }

  public void setElevation(Integer elevation) {
    this.elevation = elevation;
  }

  public Chart sideWall(LinkElement sideWall) {
    this.sideWall = sideWall;
    return this;
  }

   /**
   * Get sideWall
   * @return sideWall
  **/
  @ApiModelProperty(value = "")
  public LinkElement getSideWall() {
    return sideWall;
  }

  public void setSideWall(LinkElement sideWall) {
    this.sideWall = sideWall;
  }

  public Chart type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Gets or sets a chart&#39;s type.
   * @return type
  **/
  @ApiModelProperty(value = "Gets or sets a chart's type.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Chart title(LinkElement title) {
    this.title = title;
    return this;
  }

   /**
   * Gets the chart&#39;s title.
   * @return title
  **/
  @ApiModelProperty(value = "Gets the chart's title.")
  public LinkElement getTitle() {
    return title;
  }

  public void setTitle(LinkElement title) {
    this.title = title;
  }

  public Chart walls(LinkElement walls) {
    this.walls = walls;
    return this;
  }

   /**
   * Returns a Walls object that represents the walls of a 3-D chart.
   * @return walls
  **/
  @ApiModelProperty(value = "Returns a Walls object that represents the walls of a 3-D chart.")
  public LinkElement getWalls() {
    return walls;
  }

  public void setWalls(LinkElement walls) {
    this.walls = walls;
  }

  public Chart backWall(LinkElement backWall) {
    this.backWall = backWall;
    return this;
  }

   /**
   * Get backWall
   * @return backWall
  **/
  @ApiModelProperty(value = "")
  public LinkElement getBackWall() {
    return backWall;
  }

  public void setBackWall(LinkElement backWall) {
    this.backWall = backWall;
  }

  public Chart chartDataTable(LinkElement chartDataTable) {
    this.chartDataTable = chartDataTable;
    return this;
  }

   /**
   * Represents the chart data table.
   * @return chartDataTable
  **/
  @ApiModelProperty(value = "Represents the chart data table.")
  public LinkElement getChartDataTable() {
    return chartDataTable;
  }

  public void setChartDataTable(LinkElement chartDataTable) {
    this.chartDataTable = chartDataTable;
  }

  public Chart heightPercent(Integer heightPercent) {
    this.heightPercent = heightPercent;
    return this;
  }

   /**
   * Returns or sets the height of a 3-D chart as a percentage of the chart width (between 5 and 500 percent).
   * @return heightPercent
  **/
  @ApiModelProperty(value = "Returns or sets the height of a 3-D chart as a percentage of the chart width (between 5 and 500 percent).")
  public Integer getHeightPercent() {
    return heightPercent;
  }

  public void setHeightPercent(Integer heightPercent) {
    this.heightPercent = heightPercent;
  }

  public Chart gapWidth(Integer gapWidth) {
    this.gapWidth = gapWidth;
    return this;
  }

   /**
   * Returns or sets the space between bar or column clusters, as a percentage of the bar or column width. The value of this property must be between 0 and 500.             
   * @return gapWidth
  **/
  @ApiModelProperty(value = "Returns or sets the space between bar or column clusters, as a percentage of the bar or column width. The value of this property must be between 0 and 500.             ")
  public Integer getGapWidth() {
    return gapWidth;
  }

  public void setGapWidth(Integer gapWidth) {
    this.gapWidth = gapWidth;
  }

  public Chart legend(LinkElement legend) {
    this.legend = legend;
    return this;
  }

   /**
   * Gets the chart legend.
   * @return legend
  **/
  @ApiModelProperty(value = "Gets the chart legend.")
  public LinkElement getLegend() {
    return legend;
  }

  public void setLegend(LinkElement legend) {
    this.legend = legend;
  }

  public Chart chartObject(LinkElement chartObject) {
    this.chartObject = chartObject;
    return this;
  }

   /**
   * Represents the chartShape;
   * @return chartObject
  **/
  @ApiModelProperty(value = "Represents the chartShape;")
  public LinkElement getChartObject() {
    return chartObject;
  }

  public void setChartObject(LinkElement chartObject) {
    this.chartObject = chartObject;
  }

  public Chart isRectangularCornered(Boolean isRectangularCornered) {
    this.isRectangularCornered = isRectangularCornered;
    return this;
  }

   /**
   * Gets or sets a value indicating whether the chart displays a data table.
   * @return isRectangularCornered
  **/
  @ApiModelProperty(value = "Gets or sets a value indicating whether the chart displays a data table.")
  public Boolean IsRectangularCornered() {
    return isRectangularCornered;
  }

  public void setIsRectangularCornered(Boolean isRectangularCornered) {
    this.isRectangularCornered = isRectangularCornered;
  }

  public Chart secondCategoryAxis(LinkElement secondCategoryAxis) {
    this.secondCategoryAxis = secondCategoryAxis;
    return this;
  }

   /**
   * Gets the chart&#39;s second X axis.
   * @return secondCategoryAxis
  **/
  @ApiModelProperty(value = "Gets the chart's second X axis.")
  public LinkElement getSecondCategoryAxis() {
    return secondCategoryAxis;
  }

  public void setSecondCategoryAxis(LinkElement secondCategoryAxis) {
    this.secondCategoryAxis = secondCategoryAxis;
  }

  public Chart secondValueAxis(LinkElement secondValueAxis) {
    this.secondValueAxis = secondValueAxis;
    return this;
  }

   /**
   * Gets the chart&#39;s second Y axis.
   * @return secondValueAxis
  **/
  @ApiModelProperty(value = "Gets the chart's second Y axis.")
  public LinkElement getSecondValueAxis() {
    return secondValueAxis;
  }

  public void setSecondValueAxis(LinkElement secondValueAxis) {
    this.secondValueAxis = secondValueAxis;
  }

  public Chart placement(String placement) {
    this.placement = placement;
    return this;
  }

   /**
   * Represents the way the chart is attached to the cells below it.
   * @return placement
  **/
  @ApiModelProperty(value = "Represents the way the chart is attached to the cells below it.")
  public String getPlacement() {
    return placement;
  }

  public void setPlacement(String placement) {
    this.placement = placement;
  }

  public Chart name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Gets and sets the name of the chart.
   * @return name
  **/
  @ApiModelProperty(value = "Gets and sets the name of the chart.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Chart sizeWithWindow(Boolean sizeWithWindow) {
    this.sizeWithWindow = sizeWithWindow;
    return this;
  }

   /**
   * True if Microsoft Excel resizes the chart to match the size of the chart sheet window.
   * @return sizeWithWindow
  **/
  @ApiModelProperty(value = "True if Microsoft Excel resizes the chart to match the size of the chart sheet window.")
  public Boolean SizeWithWindow() {
    return sizeWithWindow;
  }

  public void setSizeWithWindow(Boolean sizeWithWindow) {
    this.sizeWithWindow = sizeWithWindow;
  }

  public Chart rightAngleAxes(Boolean rightAngleAxes) {
    this.rightAngleAxes = rightAngleAxes;
    return this;
  }

   /**
   * True if the chart axes are at right angles.Applies only for 3-D charts(except Column3D and 3-D Pie Charts).
   * @return rightAngleAxes
  **/
  @ApiModelProperty(value = "True if the chart axes are at right angles.Applies only for 3-D charts(except Column3D and 3-D Pie Charts).")
  public Boolean RightAngleAxes() {
    return rightAngleAxes;
  }

  public void setRightAngleAxes(Boolean rightAngleAxes) {
    this.rightAngleAxes = rightAngleAxes;
  }

  public Chart plotVisibleCells(Boolean plotVisibleCells) {
    this.plotVisibleCells = plotVisibleCells;
    return this;
  }

   /**
   * Indicates whether only plot visible cells.
   * @return plotVisibleCells
  **/
  @ApiModelProperty(value = "Indicates whether only plot visible cells.")
  public Boolean PlotVisibleCells() {
    return plotVisibleCells;
  }

  public void setPlotVisibleCells(Boolean plotVisibleCells) {
    this.plotVisibleCells = plotVisibleCells;
  }

  public Chart showLegend(Boolean showLegend) {
    this.showLegend = showLegend;
    return this;
  }

   /**
   * Gets or sets a value indicating whether the chart legend will be displayed. Default is true.
   * @return showLegend
  **/
  @ApiModelProperty(value = "Gets or sets a value indicating whether the chart legend will be displayed. Default is true.")
  public Boolean ShowLegend() {
    return showLegend;
  }

  public void setShowLegend(Boolean showLegend) {
    this.showLegend = showLegend;
  }

  public Chart pivotSource(String pivotSource) {
    this.pivotSource = pivotSource;
    return this;
  }

   /**
   * The source is the data of the pivotTable.If PivotSource is not empty ,the chart is PivotChart.
   * @return pivotSource
  **/
  @ApiModelProperty(value = "The source is the data of the pivotTable.If PivotSource is not empty ,the chart is PivotChart.")
  public String getPivotSource() {
    return pivotSource;
  }

  public void setPivotSource(String pivotSource) {
    this.pivotSource = pivotSource;
  }

  public Chart depthPercent(Integer depthPercent) {
    this.depthPercent = depthPercent;
    return this;
  }

   /**
   * Represents the depth of a 3-D chart as a percentage of the chart width (between 20 and 2000 percent).
   * @return depthPercent
  **/
  @ApiModelProperty(value = "Represents the depth of a 3-D chart as a percentage of the chart width (between 20 and 2000 percent).")
  public Integer getDepthPercent() {
    return depthPercent;
  }

  public void setDepthPercent(Integer depthPercent) {
    this.depthPercent = depthPercent;
  }

  public Chart printSize(String printSize) {
    this.printSize = printSize;
    return this;
  }

   /**
   * Gets and sets the printed chart size.
   * @return printSize
  **/
  @ApiModelProperty(value = "Gets and sets the printed chart size.")
  public String getPrintSize() {
    return printSize;
  }

  public void setPrintSize(String printSize) {
    this.printSize = printSize;
  }

  public Chart gapDepth(Integer gapDepth) {
    this.gapDepth = gapDepth;
    return this;
  }

   /**
   * Gets or sets the distance between the data series in a 3-D chart, as a percentage of the marker width.The value of this property must be between 0 and 500.
   * @return gapDepth
  **/
  @ApiModelProperty(value = "Gets or sets the distance between the data series in a 3-D chart, as a percentage of the marker width.The value of this property must be between 0 and 500.")
  public Integer getGapDepth() {
    return gapDepth;
  }

  public void setGapDepth(Integer gapDepth) {
    this.gapDepth = gapDepth;
  }

  public Chart shapes(LinkElement shapes) {
    this.shapes = shapes;
    return this;
  }

   /**
   * Returns all drawing shapes in this chart.
   * @return shapes
  **/
  @ApiModelProperty(value = "Returns all drawing shapes in this chart.")
  public LinkElement getShapes() {
    return shapes;
  }

  public void setShapes(LinkElement shapes) {
    this.shapes = shapes;
  }

  public Chart wallsAndGridlines2D(Boolean wallsAndGridlines2D) {
    this.wallsAndGridlines2D = wallsAndGridlines2D;
    return this;
  }

   /**
   * True if gridlines are drawn two-dimensionally on a 3-D chart.
   * @return wallsAndGridlines2D
  **/
  @ApiModelProperty(value = "True if gridlines are drawn two-dimensionally on a 3-D chart.")
  public Boolean WallsAndGridlines2D() {
    return wallsAndGridlines2D;
  }

  public void setWallsAndGridlines2D(Boolean wallsAndGridlines2D) {
    this.wallsAndGridlines2D = wallsAndGridlines2D;
  }

  public Chart nseries(LinkElement nseries) {
    this.nseries = nseries;
    return this;
  }

   /**
   * Gets a SeriesCollection collection representing the data series in the chart.
   * @return nseries
  **/
  @ApiModelProperty(value = "Gets a SeriesCollection collection representing the data series in the chart.")
  public LinkElement getNseries() {
    return nseries;
  }

  public void setNseries(LinkElement nseries) {
    this.nseries = nseries;
  }

  public Chart rotationAngle(Integer rotationAngle) {
    this.rotationAngle = rotationAngle;
    return this;
  }

   /**
   * Represents the rotation of the 3-D chart view (the rotation of the plot area around the z-axis, in degrees).
   * @return rotationAngle
  **/
  @ApiModelProperty(value = "Represents the rotation of the 3-D chart view (the rotation of the plot area around the z-axis, in degrees).")
  public Integer getRotationAngle() {
    return rotationAngle;
  }

  public void setRotationAngle(Integer rotationAngle) {
    this.rotationAngle = rotationAngle;
  }

  public Chart plotArea(LinkElement plotArea) {
    this.plotArea = plotArea;
    return this;
  }

   /**
   * Gets the chart&#39;s plot area which includes axis tick lables.
   * @return plotArea
  **/
  @ApiModelProperty(value = "Gets the chart's plot area which includes axis tick lables.")
  public LinkElement getPlotArea() {
    return plotArea;
  }

  public void setPlotArea(LinkElement plotArea) {
    this.plotArea = plotArea;
  }

  public Chart categoryAxis(LinkElement categoryAxis) {
    this.categoryAxis = categoryAxis;
    return this;
  }

   /**
   * Gets the chart&#39;s X axis. The property is read only
   * @return categoryAxis
  **/
  @ApiModelProperty(value = "Gets the chart's X axis. The property is read only")
  public LinkElement getCategoryAxis() {
    return categoryAxis;
  }

  public void setCategoryAxis(LinkElement categoryAxis) {
    this.categoryAxis = categoryAxis;
  }

  public Chart perspective(Integer perspective) {
    this.perspective = perspective;
    return this;
  }

   /**
   * Returns or sets the perspective for the 3-D chart view. Must be between 0 and 100.This property is ignored if the RightAngleAxes property is True.
   * @return perspective
  **/
  @ApiModelProperty(value = "Returns or sets the perspective for the 3-D chart view. Must be between 0 and 100.This property is ignored if the RightAngleAxes property is True.")
  public Integer getPerspective() {
    return perspective;
  }

  public void setPerspective(Integer perspective) {
    this.perspective = perspective;
  }

  public Chart hidePivotFieldButtons(Boolean hidePivotFieldButtons) {
    this.hidePivotFieldButtons = hidePivotFieldButtons;
    return this;
  }

   /**
   * Indicates whether hide the pivot chart field buttons only when the chart is PivotChart
   * @return hidePivotFieldButtons
  **/
  @ApiModelProperty(value = "Indicates whether hide the pivot chart field buttons only when the chart is PivotChart")
  public Boolean HidePivotFieldButtons() {
    return hidePivotFieldButtons;
  }

  public void setHidePivotFieldButtons(Boolean hidePivotFieldButtons) {
    this.hidePivotFieldButtons = hidePivotFieldButtons;
  }

  public Chart pageSetup(LinkElement pageSetup) {
    this.pageSetup = pageSetup;
    return this;
  }

   /**
   * Represents the page setup description in this chart.
   * @return pageSetup
  **/
  @ApiModelProperty(value = "Represents the page setup description in this chart.")
  public LinkElement getPageSetup() {
    return pageSetup;
  }

  public void setPageSetup(LinkElement pageSetup) {
    this.pageSetup = pageSetup;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Chart chart = (Chart) o;
    return Objects.equals(this.link, chart.link) &&
        Objects.equals(this.firstSliceAngle, chart.firstSliceAngle) &&
        Objects.equals(this.floor, chart.floor) &&
        Objects.equals(this.plotEmptyCellsType, chart.plotEmptyCellsType) &&
        Objects.equals(this.autoScaling, chart.autoScaling) &&
        Objects.equals(this.style, chart.style) &&
        Objects.equals(this.seriesAxis, chart.seriesAxis) &&
        Objects.equals(this.valueAxis, chart.valueAxis) &&
        Objects.equals(this.showDataTable, chart.showDataTable) &&
        Objects.equals(this.is3D, chart.is3D) &&
        Objects.equals(this.chartArea, chart.chartArea) &&
        Objects.equals(this.elevation, chart.elevation) &&
        Objects.equals(this.sideWall, chart.sideWall) &&
        Objects.equals(this.type, chart.type) &&
        Objects.equals(this.title, chart.title) &&
        Objects.equals(this.walls, chart.walls) &&
        Objects.equals(this.backWall, chart.backWall) &&
        Objects.equals(this.chartDataTable, chart.chartDataTable) &&
        Objects.equals(this.heightPercent, chart.heightPercent) &&
        Objects.equals(this.gapWidth, chart.gapWidth) &&
        Objects.equals(this.legend, chart.legend) &&
        Objects.equals(this.chartObject, chart.chartObject) &&
        Objects.equals(this.isRectangularCornered, chart.isRectangularCornered) &&
        Objects.equals(this.secondCategoryAxis, chart.secondCategoryAxis) &&
        Objects.equals(this.secondValueAxis, chart.secondValueAxis) &&
        Objects.equals(this.placement, chart.placement) &&
        Objects.equals(this.name, chart.name) &&
        Objects.equals(this.sizeWithWindow, chart.sizeWithWindow) &&
        Objects.equals(this.rightAngleAxes, chart.rightAngleAxes) &&
        Objects.equals(this.plotVisibleCells, chart.plotVisibleCells) &&
        Objects.equals(this.showLegend, chart.showLegend) &&
        Objects.equals(this.pivotSource, chart.pivotSource) &&
        Objects.equals(this.depthPercent, chart.depthPercent) &&
        Objects.equals(this.printSize, chart.printSize) &&
        Objects.equals(this.gapDepth, chart.gapDepth) &&
        Objects.equals(this.shapes, chart.shapes) &&
        Objects.equals(this.wallsAndGridlines2D, chart.wallsAndGridlines2D) &&
        Objects.equals(this.nseries, chart.nseries) &&
        Objects.equals(this.rotationAngle, chart.rotationAngle) &&
        Objects.equals(this.plotArea, chart.plotArea) &&
        Objects.equals(this.categoryAxis, chart.categoryAxis) &&
        Objects.equals(this.perspective, chart.perspective) &&
        Objects.equals(this.hidePivotFieldButtons, chart.hidePivotFieldButtons) &&
        Objects.equals(this.pageSetup, chart.pageSetup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, firstSliceAngle, floor, plotEmptyCellsType, autoScaling, style, seriesAxis, valueAxis, showDataTable, is3D, chartArea, elevation, sideWall, type, title, walls, backWall, chartDataTable, heightPercent, gapWidth, legend, chartObject, isRectangularCornered, secondCategoryAxis, secondValueAxis, placement, name, sizeWithWindow, rightAngleAxes, plotVisibleCells, showLegend, pivotSource, depthPercent, printSize, gapDepth, shapes, wallsAndGridlines2D, nseries, rotationAngle, plotArea, categoryAxis, perspective, hidePivotFieldButtons, pageSetup);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Chart {\n");
    
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    firstSliceAngle: ").append(toIndentedString(firstSliceAngle)).append("\n");
    sb.append("    floor: ").append(toIndentedString(floor)).append("\n");
    sb.append("    plotEmptyCellsType: ").append(toIndentedString(plotEmptyCellsType)).append("\n");
    sb.append("    autoScaling: ").append(toIndentedString(autoScaling)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
    sb.append("    seriesAxis: ").append(toIndentedString(seriesAxis)).append("\n");
    sb.append("    valueAxis: ").append(toIndentedString(valueAxis)).append("\n");
    sb.append("    showDataTable: ").append(toIndentedString(showDataTable)).append("\n");
    sb.append("    is3D: ").append(toIndentedString(is3D)).append("\n");
    sb.append("    chartArea: ").append(toIndentedString(chartArea)).append("\n");
    sb.append("    elevation: ").append(toIndentedString(elevation)).append("\n");
    sb.append("    sideWall: ").append(toIndentedString(sideWall)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    walls: ").append(toIndentedString(walls)).append("\n");
    sb.append("    backWall: ").append(toIndentedString(backWall)).append("\n");
    sb.append("    chartDataTable: ").append(toIndentedString(chartDataTable)).append("\n");
    sb.append("    heightPercent: ").append(toIndentedString(heightPercent)).append("\n");
    sb.append("    gapWidth: ").append(toIndentedString(gapWidth)).append("\n");
    sb.append("    legend: ").append(toIndentedString(legend)).append("\n");
    sb.append("    chartObject: ").append(toIndentedString(chartObject)).append("\n");
    sb.append("    isRectangularCornered: ").append(toIndentedString(isRectangularCornered)).append("\n");
    sb.append("    secondCategoryAxis: ").append(toIndentedString(secondCategoryAxis)).append("\n");
    sb.append("    secondValueAxis: ").append(toIndentedString(secondValueAxis)).append("\n");
    sb.append("    placement: ").append(toIndentedString(placement)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sizeWithWindow: ").append(toIndentedString(sizeWithWindow)).append("\n");
    sb.append("    rightAngleAxes: ").append(toIndentedString(rightAngleAxes)).append("\n");
    sb.append("    plotVisibleCells: ").append(toIndentedString(plotVisibleCells)).append("\n");
    sb.append("    showLegend: ").append(toIndentedString(showLegend)).append("\n");
    sb.append("    pivotSource: ").append(toIndentedString(pivotSource)).append("\n");
    sb.append("    depthPercent: ").append(toIndentedString(depthPercent)).append("\n");
    sb.append("    printSize: ").append(toIndentedString(printSize)).append("\n");
    sb.append("    gapDepth: ").append(toIndentedString(gapDepth)).append("\n");
    sb.append("    shapes: ").append(toIndentedString(shapes)).append("\n");
    sb.append("    wallsAndGridlines2D: ").append(toIndentedString(wallsAndGridlines2D)).append("\n");
    sb.append("    nseries: ").append(toIndentedString(nseries)).append("\n");
    sb.append("    rotationAngle: ").append(toIndentedString(rotationAngle)).append("\n");
    sb.append("    plotArea: ").append(toIndentedString(plotArea)).append("\n");
    sb.append("    categoryAxis: ").append(toIndentedString(categoryAxis)).append("\n");
    sb.append("    perspective: ").append(toIndentedString(perspective)).append("\n");
    sb.append("    hidePivotFieldButtons: ").append(toIndentedString(hidePivotFieldButtons)).append("\n");
    sb.append("    pageSetup: ").append(toIndentedString(pageSetup)).append("\n");
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

