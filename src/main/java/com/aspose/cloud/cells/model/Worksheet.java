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
import com.aspose.cloud.cells.model.Color;
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
import java.util.ArrayList;
import java.util.List;

/**
 * Worksheet
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-19T16:36:54.237-06:00")
public class Worksheet {
  @SerializedName("Index")
  private Integer index = null;

  @SerializedName("Pictures")
  private LinkElement pictures = null;

  @SerializedName("Charts")
  private LinkElement charts = null;

  @SerializedName("Comments")
  private LinkElement comments = null;

  @SerializedName("Hyperlinks")
  private LinkElement hyperlinks = null;

  @SerializedName("IsVisible")
  private Boolean isVisible = null;

  @SerializedName("ViewType")
  private String viewType = null;

  @SerializedName("Type")
  private String type = null;

  @SerializedName("IsGridlinesVisible")
  private Boolean isGridlinesVisible = null;

  @SerializedName("IsRowColumnHeadersVisible")
  private Boolean isRowColumnHeadersVisible = null;

  @SerializedName("IsPageBreakPreview")
  private Boolean isPageBreakPreview = null;

  @SerializedName("DisplayZeros")
  private Boolean displayZeros = null;

  @SerializedName("TransitionEvaluation")
  private Boolean transitionEvaluation = null;

  @SerializedName("DisplayRightToLeft")
  private Boolean displayRightToLeft = null;

  @SerializedName("FirstVisibleColumn")
  private Integer firstVisibleColumn = null;

  @SerializedName("OleObjects")
  private LinkElement oleObjects = null;

  @SerializedName("IsOutlineShown")
  private Boolean isOutlineShown = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("AutoShapes")
  private LinkElement autoShapes = null;

  @SerializedName("Cells")
  private LinkElement cells = null;

  @SerializedName("Validations")
  private LinkElement validations = null;

  @SerializedName("Zoom")
  private Integer zoom = null;

  @SerializedName("ConditionalFormattings")
  private LinkElement conditionalFormattings = null;

  @SerializedName("IsSelected")
  private Boolean isSelected = null;

  @SerializedName("TabColor")
  private Color tabColor = null;

  @SerializedName("FirstVisibleRow")
  private Integer firstVisibleRow = null;

  @SerializedName("TransitionEntry")
  private Boolean transitionEntry = null;

  @SerializedName("VisibilityType")
  private String visibilityType = null;

  @SerializedName("IsRulerVisible")
  private Boolean isRulerVisible = null;

  @SerializedName("Links")
  private List<Link> links = null;

  @SerializedName("IsProtected")
  private Boolean isProtected = null;

  @SerializedName("MergedCells")
  private LinkElement mergedCells = null;

  public Worksheet index(Integer index) {
    this.index = index;
    return this;
  }

   /**
   * Gets the index of sheet in the worksheets collection.             
   * @return index
  **/
  @ApiModelProperty(required = true, value = "Gets the index of sheet in the worksheets collection.             ")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public Worksheet pictures(LinkElement pictures) {
    this.pictures = pictures;
    return this;
  }

   /**
   * Get pictures
   * @return pictures
  **/
  @ApiModelProperty(value = "")
  public LinkElement getPictures() {
    return pictures;
  }

  public void setPictures(LinkElement pictures) {
    this.pictures = pictures;
  }

  public Worksheet charts(LinkElement charts) {
    this.charts = charts;
    return this;
  }

   /**
   * Get charts
   * @return charts
  **/
  @ApiModelProperty(value = "")
  public LinkElement getCharts() {
    return charts;
  }

  public void setCharts(LinkElement charts) {
    this.charts = charts;
  }

  public Worksheet comments(LinkElement comments) {
    this.comments = comments;
    return this;
  }

   /**
   * Get comments
   * @return comments
  **/
  @ApiModelProperty(value = "")
  public LinkElement getComments() {
    return comments;
  }

  public void setComments(LinkElement comments) {
    this.comments = comments;
  }

  public Worksheet hyperlinks(LinkElement hyperlinks) {
    this.hyperlinks = hyperlinks;
    return this;
  }

   /**
   * Get hyperlinks
   * @return hyperlinks
  **/
  @ApiModelProperty(value = "")
  public LinkElement getHyperlinks() {
    return hyperlinks;
  }

  public void setHyperlinks(LinkElement hyperlinks) {
    this.hyperlinks = hyperlinks;
  }

  public Worksheet isVisible(Boolean isVisible) {
    this.isVisible = isVisible;
    return this;
  }

   /**
   * Represents if the worksheet is visible.             
   * @return isVisible
  **/
  @ApiModelProperty(value = "Represents if the worksheet is visible.             ")
  public Boolean IsVisible() {
    return isVisible;
  }

  public void setIsVisible(Boolean isVisible) {
    this.isVisible = isVisible;
  }

  public Worksheet viewType(String viewType) {
    this.viewType = viewType;
    return this;
  }

   /**
   * Gets and sets the view type.
   * @return viewType
  **/
  @ApiModelProperty(value = "Gets and sets the view type.")
  public String getViewType() {
    return viewType;
  }

  public void setViewType(String viewType) {
    this.viewType = viewType;
  }

  public Worksheet type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Represents worksheet type
   * @return type
  **/
  @ApiModelProperty(value = "Represents worksheet type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Worksheet isGridlinesVisible(Boolean isGridlinesVisible) {
    this.isGridlinesVisible = isGridlinesVisible;
    return this;
  }

   /**
   * Gets or sets a value indicating whether the gridelines are visible.Default     is true.
   * @return isGridlinesVisible
  **/
  @ApiModelProperty(value = "Gets or sets a value indicating whether the gridelines are visible.Default     is true.")
  public Boolean IsGridlinesVisible() {
    return isGridlinesVisible;
  }

  public void setIsGridlinesVisible(Boolean isGridlinesVisible) {
    this.isGridlinesVisible = isGridlinesVisible;
  }

  public Worksheet isRowColumnHeadersVisible(Boolean isRowColumnHeadersVisible) {
    this.isRowColumnHeadersVisible = isRowColumnHeadersVisible;
    return this;
  }

   /**
   * Gets or sets a value indicating whether the worksheet will display row and column headers.Default is true.             
   * @return isRowColumnHeadersVisible
  **/
  @ApiModelProperty(value = "Gets or sets a value indicating whether the worksheet will display row and column headers.Default is true.             ")
  public Boolean IsRowColumnHeadersVisible() {
    return isRowColumnHeadersVisible;
  }

  public void setIsRowColumnHeadersVisible(Boolean isRowColumnHeadersVisible) {
    this.isRowColumnHeadersVisible = isRowColumnHeadersVisible;
  }

  public Worksheet isPageBreakPreview(Boolean isPageBreakPreview) {
    this.isPageBreakPreview = isPageBreakPreview;
    return this;
  }

   /**
   * Indications the specified worksheet is shown in normal view or page break preview.
   * @return isPageBreakPreview
  **/
  @ApiModelProperty(value = "Indications the specified worksheet is shown in normal view or page break preview.")
  public Boolean IsPageBreakPreview() {
    return isPageBreakPreview;
  }

  public void setIsPageBreakPreview(Boolean isPageBreakPreview) {
    this.isPageBreakPreview = isPageBreakPreview;
  }

  public Worksheet displayZeros(Boolean displayZeros) {
    this.displayZeros = displayZeros;
    return this;
  }

   /**
   * True if zero values are displayed.
   * @return displayZeros
  **/
  @ApiModelProperty(value = "True if zero values are displayed.")
  public Boolean DisplayZeros() {
    return displayZeros;
  }

  public void setDisplayZeros(Boolean displayZeros) {
    this.displayZeros = displayZeros;
  }

  public Worksheet transitionEvaluation(Boolean transitionEvaluation) {
    this.transitionEvaluation = transitionEvaluation;
    return this;
  }

   /**
   * Flag indicating whether the Transition Formula Evaluation (Lotus compatibility) option is enabled.             
   * @return transitionEvaluation
  **/
  @ApiModelProperty(value = "Flag indicating whether the Transition Formula Evaluation (Lotus compatibility) option is enabled.             ")
  public Boolean TransitionEvaluation() {
    return transitionEvaluation;
  }

  public void setTransitionEvaluation(Boolean transitionEvaluation) {
    this.transitionEvaluation = transitionEvaluation;
  }

  public Worksheet displayRightToLeft(Boolean displayRightToLeft) {
    this.displayRightToLeft = displayRightToLeft;
    return this;
  }

   /**
   * Indicates if the specified worksheet is displayed from right to left instead    of from left to right.  Default is false.             
   * @return displayRightToLeft
  **/
  @ApiModelProperty(value = "Indicates if the specified worksheet is displayed from right to left instead    of from left to right.  Default is false.             ")
  public Boolean DisplayRightToLeft() {
    return displayRightToLeft;
  }

  public void setDisplayRightToLeft(Boolean displayRightToLeft) {
    this.displayRightToLeft = displayRightToLeft;
  }

  public Worksheet firstVisibleColumn(Integer firstVisibleColumn) {
    this.firstVisibleColumn = firstVisibleColumn;
    return this;
  }

   /**
   * Represents first visible column index.
   * @return firstVisibleColumn
  **/
  @ApiModelProperty(value = "Represents first visible column index.")
  public Integer getFirstVisibleColumn() {
    return firstVisibleColumn;
  }

  public void setFirstVisibleColumn(Integer firstVisibleColumn) {
    this.firstVisibleColumn = firstVisibleColumn;
  }

  public Worksheet oleObjects(LinkElement oleObjects) {
    this.oleObjects = oleObjects;
    return this;
  }

   /**
   * Get oleObjects
   * @return oleObjects
  **/
  @ApiModelProperty(value = "")
  public LinkElement getOleObjects() {
    return oleObjects;
  }

  public void setOleObjects(LinkElement oleObjects) {
    this.oleObjects = oleObjects;
  }

  public Worksheet isOutlineShown(Boolean isOutlineShown) {
    this.isOutlineShown = isOutlineShown;
    return this;
  }

   /**
   * Indicates whether show outline.             
   * @return isOutlineShown
  **/
  @ApiModelProperty(value = "Indicates whether show outline.             ")
  public Boolean IsOutlineShown() {
    return isOutlineShown;
  }

  public void setIsOutlineShown(Boolean isOutlineShown) {
    this.isOutlineShown = isOutlineShown;
  }

  public Worksheet name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Gets or sets the name of the worksheet.             
   * @return name
  **/
  @ApiModelProperty(value = "Gets or sets the name of the worksheet.             ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Worksheet autoShapes(LinkElement autoShapes) {
    this.autoShapes = autoShapes;
    return this;
  }

   /**
   * Get autoShapes
   * @return autoShapes
  **/
  @ApiModelProperty(value = "")
  public LinkElement getAutoShapes() {
    return autoShapes;
  }

  public void setAutoShapes(LinkElement autoShapes) {
    this.autoShapes = autoShapes;
  }

  public Worksheet cells(LinkElement cells) {
    this.cells = cells;
    return this;
  }

   /**
   * Get cells
   * @return cells
  **/
  @ApiModelProperty(value = "")
  public LinkElement getCells() {
    return cells;
  }

  public void setCells(LinkElement cells) {
    this.cells = cells;
  }

  public Worksheet validations(LinkElement validations) {
    this.validations = validations;
    return this;
  }

   /**
   * Get validations
   * @return validations
  **/
  @ApiModelProperty(value = "")
  public LinkElement getValidations() {
    return validations;
  }

  public void setValidations(LinkElement validations) {
    this.validations = validations;
  }

  public Worksheet zoom(Integer zoom) {
    this.zoom = zoom;
    return this;
  }

   /**
   * Represents the scaling factor in percent. It should be btween 10 and 400.             
   * @return zoom
  **/
  @ApiModelProperty(value = "Represents the scaling factor in percent. It should be btween 10 and 400.             ")
  public Integer getZoom() {
    return zoom;
  }

  public void setZoom(Integer zoom) {
    this.zoom = zoom;
  }

  public Worksheet conditionalFormattings(LinkElement conditionalFormattings) {
    this.conditionalFormattings = conditionalFormattings;
    return this;
  }

   /**
   * Get conditionalFormattings
   * @return conditionalFormattings
  **/
  @ApiModelProperty(value = "")
  public LinkElement getConditionalFormattings() {
    return conditionalFormattings;
  }

  public void setConditionalFormattings(LinkElement conditionalFormattings) {
    this.conditionalFormattings = conditionalFormattings;
  }

  public Worksheet isSelected(Boolean isSelected) {
    this.isSelected = isSelected;
    return this;
  }

   /**
   * Indicates whether this worksheet is selected when the workbook is opened.
   * @return isSelected
  **/
  @ApiModelProperty(value = "Indicates whether this worksheet is selected when the workbook is opened.")
  public Boolean IsSelected() {
    return isSelected;
  }

  public void setIsSelected(Boolean isSelected) {
    this.isSelected = isSelected;
  }

  public Worksheet tabColor(Color tabColor) {
    this.tabColor = tabColor;
    return this;
  }

   /**
   * Represents worksheet tab color.
   * @return tabColor
  **/
  @ApiModelProperty(value = "Represents worksheet tab color.")
  public Color getTabColor() {
    return tabColor;
  }

  public void setTabColor(Color tabColor) {
    this.tabColor = tabColor;
  }

  public Worksheet firstVisibleRow(Integer firstVisibleRow) {
    this.firstVisibleRow = firstVisibleRow;
    return this;
  }

   /**
   * Represents first visible row index.             
   * @return firstVisibleRow
  **/
  @ApiModelProperty(value = "Represents first visible row index.             ")
  public Integer getFirstVisibleRow() {
    return firstVisibleRow;
  }

  public void setFirstVisibleRow(Integer firstVisibleRow) {
    this.firstVisibleRow = firstVisibleRow;
  }

  public Worksheet transitionEntry(Boolean transitionEntry) {
    this.transitionEntry = transitionEntry;
    return this;
  }

   /**
   * Flag indicating whether the Transition Formula Entry (Lotus compatibility) option is enabled.
   * @return transitionEntry
  **/
  @ApiModelProperty(value = "Flag indicating whether the Transition Formula Entry (Lotus compatibility) option is enabled.")
  public Boolean TransitionEntry() {
    return transitionEntry;
  }

  public void setTransitionEntry(Boolean transitionEntry) {
    this.transitionEntry = transitionEntry;
  }

  public Worksheet visibilityType(String visibilityType) {
    this.visibilityType = visibilityType;
    return this;
  }

   /**
   * Indicates the state for this sheet visibility             
   * @return visibilityType
  **/
  @ApiModelProperty(value = "Indicates the state for this sheet visibility             ")
  public String getVisibilityType() {
    return visibilityType;
  }

  public void setVisibilityType(String visibilityType) {
    this.visibilityType = visibilityType;
  }

  public Worksheet isRulerVisible(Boolean isRulerVisible) {
    this.isRulerVisible = isRulerVisible;
    return this;
  }

   /**
   * Indicates whether the ruler is visible. Only apply for page break preview.
   * @return isRulerVisible
  **/
  @ApiModelProperty(value = "Indicates whether the ruler is visible. Only apply for page break preview.")
  public Boolean IsRulerVisible() {
    return isRulerVisible;
  }

  public void setIsRulerVisible(Boolean isRulerVisible) {
    this.isRulerVisible = isRulerVisible;
  }

  public Worksheet links(List<Link> links) {
    this.links = links;
    return this;
  }

  public Worksheet addLinksItem(Link linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public List<Link> getLinks() {
    return links;
  }

  public void setLinks(List<Link> links) {
    this.links = links;
  }

  public Worksheet isProtected(Boolean isProtected) {
    this.isProtected = isProtected;
    return this;
  }

   /**
   * Indicates if the worksheet is protected.
   * @return isProtected
  **/
  @ApiModelProperty(required = true, value = "Indicates if the worksheet is protected.")
  public Boolean IsProtected() {
    return isProtected;
  }

  public void setIsProtected(Boolean isProtected) {
    this.isProtected = isProtected;
  }

  public Worksheet mergedCells(LinkElement mergedCells) {
    this.mergedCells = mergedCells;
    return this;
  }

   /**
   * Get mergedCells
   * @return mergedCells
  **/
  @ApiModelProperty(value = "")
  public LinkElement getMergedCells() {
    return mergedCells;
  }

  public void setMergedCells(LinkElement mergedCells) {
    this.mergedCells = mergedCells;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Worksheet worksheet = (Worksheet) o;
    return Objects.equals(this.index, worksheet.index) &&
        Objects.equals(this.pictures, worksheet.pictures) &&
        Objects.equals(this.charts, worksheet.charts) &&
        Objects.equals(this.comments, worksheet.comments) &&
        Objects.equals(this.hyperlinks, worksheet.hyperlinks) &&
        Objects.equals(this.isVisible, worksheet.isVisible) &&
        Objects.equals(this.viewType, worksheet.viewType) &&
        Objects.equals(this.type, worksheet.type) &&
        Objects.equals(this.isGridlinesVisible, worksheet.isGridlinesVisible) &&
        Objects.equals(this.isRowColumnHeadersVisible, worksheet.isRowColumnHeadersVisible) &&
        Objects.equals(this.isPageBreakPreview, worksheet.isPageBreakPreview) &&
        Objects.equals(this.displayZeros, worksheet.displayZeros) &&
        Objects.equals(this.transitionEvaluation, worksheet.transitionEvaluation) &&
        Objects.equals(this.displayRightToLeft, worksheet.displayRightToLeft) &&
        Objects.equals(this.firstVisibleColumn, worksheet.firstVisibleColumn) &&
        Objects.equals(this.oleObjects, worksheet.oleObjects) &&
        Objects.equals(this.isOutlineShown, worksheet.isOutlineShown) &&
        Objects.equals(this.name, worksheet.name) &&
        Objects.equals(this.autoShapes, worksheet.autoShapes) &&
        Objects.equals(this.cells, worksheet.cells) &&
        Objects.equals(this.validations, worksheet.validations) &&
        Objects.equals(this.zoom, worksheet.zoom) &&
        Objects.equals(this.conditionalFormattings, worksheet.conditionalFormattings) &&
        Objects.equals(this.isSelected, worksheet.isSelected) &&
        Objects.equals(this.tabColor, worksheet.tabColor) &&
        Objects.equals(this.firstVisibleRow, worksheet.firstVisibleRow) &&
        Objects.equals(this.transitionEntry, worksheet.transitionEntry) &&
        Objects.equals(this.visibilityType, worksheet.visibilityType) &&
        Objects.equals(this.isRulerVisible, worksheet.isRulerVisible) &&
        Objects.equals(this.links, worksheet.links) &&
        Objects.equals(this.isProtected, worksheet.isProtected) &&
        Objects.equals(this.mergedCells, worksheet.mergedCells);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, pictures, charts, comments, hyperlinks, isVisible, viewType, type, isGridlinesVisible, isRowColumnHeadersVisible, isPageBreakPreview, displayZeros, transitionEvaluation, displayRightToLeft, firstVisibleColumn, oleObjects, isOutlineShown, name, autoShapes, cells, validations, zoom, conditionalFormattings, isSelected, tabColor, firstVisibleRow, transitionEntry, visibilityType, isRulerVisible, links, isProtected, mergedCells);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Worksheet {\n");
    
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    pictures: ").append(toIndentedString(pictures)).append("\n");
    sb.append("    charts: ").append(toIndentedString(charts)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    hyperlinks: ").append(toIndentedString(hyperlinks)).append("\n");
    sb.append("    isVisible: ").append(toIndentedString(isVisible)).append("\n");
    sb.append("    viewType: ").append(toIndentedString(viewType)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    isGridlinesVisible: ").append(toIndentedString(isGridlinesVisible)).append("\n");
    sb.append("    isRowColumnHeadersVisible: ").append(toIndentedString(isRowColumnHeadersVisible)).append("\n");
    sb.append("    isPageBreakPreview: ").append(toIndentedString(isPageBreakPreview)).append("\n");
    sb.append("    displayZeros: ").append(toIndentedString(displayZeros)).append("\n");
    sb.append("    transitionEvaluation: ").append(toIndentedString(transitionEvaluation)).append("\n");
    sb.append("    displayRightToLeft: ").append(toIndentedString(displayRightToLeft)).append("\n");
    sb.append("    firstVisibleColumn: ").append(toIndentedString(firstVisibleColumn)).append("\n");
    sb.append("    oleObjects: ").append(toIndentedString(oleObjects)).append("\n");
    sb.append("    isOutlineShown: ").append(toIndentedString(isOutlineShown)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    autoShapes: ").append(toIndentedString(autoShapes)).append("\n");
    sb.append("    cells: ").append(toIndentedString(cells)).append("\n");
    sb.append("    validations: ").append(toIndentedString(validations)).append("\n");
    sb.append("    zoom: ").append(toIndentedString(zoom)).append("\n");
    sb.append("    conditionalFormattings: ").append(toIndentedString(conditionalFormattings)).append("\n");
    sb.append("    isSelected: ").append(toIndentedString(isSelected)).append("\n");
    sb.append("    tabColor: ").append(toIndentedString(tabColor)).append("\n");
    sb.append("    firstVisibleRow: ").append(toIndentedString(firstVisibleRow)).append("\n");
    sb.append("    transitionEntry: ").append(toIndentedString(transitionEntry)).append("\n");
    sb.append("    visibilityType: ").append(toIndentedString(visibilityType)).append("\n");
    sb.append("    isRulerVisible: ").append(toIndentedString(isRulerVisible)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    isProtected: ").append(toIndentedString(isProtected)).append("\n");
    sb.append("    mergedCells: ").append(toIndentedString(mergedCells)).append("\n");
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

