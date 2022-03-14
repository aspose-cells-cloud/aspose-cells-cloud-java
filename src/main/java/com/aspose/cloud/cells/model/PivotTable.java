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
import com.aspose.cloud.cells.model.CellArea;
import com.aspose.cloud.cells.model.Link;
import com.aspose.cloud.cells.model.LinkElement;
import com.aspose.cloud.cells.model.PivotField;
import com.aspose.cloud.cells.model.PivotFilter;
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
 * PivotTable
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-13T18:09:02.334-05:00")
public class PivotTable {
  @SerializedName("link")
  private Link link = null;

  @SerializedName("ShowPivotStyleLastColumn")
  private Boolean showPivotStyleLastColumn = null;

  @SerializedName("RowHeaderCaption")
  private String rowHeaderCaption = null;

  @SerializedName("ColumnRange")
  private CellArea columnRange = null;

  @SerializedName("RefreshDataOnOpeningFile")
  private Boolean refreshDataOnOpeningFile = null;

  @SerializedName("PageFields")
  private List<PivotField> pageFields = null;

  @SerializedName("DataFields")
  private List<PivotField> dataFields = null;

  @SerializedName("DataBodyRange")
  private CellArea dataBodyRange = null;

  @SerializedName("ShowDrill")
  private Boolean showDrill = null;

  @SerializedName("RefreshDataFlag")
  private Boolean refreshDataFlag = null;

  @SerializedName("ColumnGrand")
  private Boolean columnGrand = null;

  @SerializedName("PivotTableStyleName")
  private String pivotTableStyleName = null;

  @SerializedName("PivotFilters")
  private List<PivotFilter> pivotFilters = null;

  @SerializedName("NullString")
  private String nullString = null;

  @SerializedName("ItemPrintTitles")
  private Boolean itemPrintTitles = null;

  @SerializedName("DisplayNullString")
  private Boolean displayNullString = null;

  @SerializedName("EnableFieldList")
  private Boolean enableFieldList = null;

  @SerializedName("TableRange2")
  private CellArea tableRange2 = null;

  @SerializedName("RowFields")
  private List<PivotField> rowFields = null;

  @SerializedName("PageFieldOrder")
  private String pageFieldOrder = null;

  @SerializedName("AutoFormatType")
  private String autoFormatType = null;

  @SerializedName("EnableDataValueEditing")
  private Boolean enableDataValueEditing = null;

  @SerializedName("ShowPivotStyleRowHeader")
  private Boolean showPivotStyleRowHeader = null;

  @SerializedName("IsGridDropZones")
  private Boolean isGridDropZones = null;

  @SerializedName("EnableWizard")
  private Boolean enableWizard = null;

  @SerializedName("ShowMemberPropertyTips")
  private Boolean showMemberPropertyTips = null;

  @SerializedName("AltTextDescription")
  private String altTextDescription = null;

  @SerializedName("ShowDataTips")
  private Boolean showDataTips = null;

  @SerializedName("PrintTitles")
  private Boolean printTitles = null;

  @SerializedName("TableRange1")
  private CellArea tableRange1 = null;

  @SerializedName("ShowEmptyRow")
  private Boolean showEmptyRow = null;

  @SerializedName("IsMultipleFieldFilters")
  private Boolean isMultipleFieldFilters = null;

  @SerializedName("ShowEmptyCol")
  private Boolean showEmptyCol = null;

  @SerializedName("ShowRowHeaderCaption")
  private Boolean showRowHeaderCaption = null;

  @SerializedName("HasBlankRows")
  private Boolean hasBlankRows = null;

  @SerializedName("DataSource")
  private List<String> dataSource = null;

  @SerializedName("Tag")
  private String tag = null;

  @SerializedName("EnableDrilldown")
  private Boolean enableDrilldown = null;

  @SerializedName("Indent")
  private Integer indent = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("RowGrand")
  private Boolean rowGrand = null;

  @SerializedName("GrandTotalName")
  private String grandTotalName = null;

  @SerializedName("DisplayErrorString")
  private Boolean displayErrorString = null;

  @SerializedName("RowRange")
  private CellArea rowRange = null;

  @SerializedName("IsSelected")
  private Boolean isSelected = null;

  @SerializedName("ColumnFields")
  private List<PivotField> columnFields = null;

  @SerializedName("ColumnHeaderCaption")
  private String columnHeaderCaption = null;

  @SerializedName("ShowValuesRow")
  private Boolean showValuesRow = null;

  @SerializedName("EnableFieldDialog")
  private Boolean enableFieldDialog = null;

  @SerializedName("MissingItemsLimit")
  private String missingItemsLimit = null;

  @SerializedName("ShowPivotStyleRowStripes")
  private Boolean showPivotStyleRowStripes = null;

  @SerializedName("ManualUpdate")
  private Boolean manualUpdate = null;

  @SerializedName("IsAutoFormat")
  private Boolean isAutoFormat = null;

  @SerializedName("DisplayImmediateItems")
  private Boolean displayImmediateItems = null;

  @SerializedName("ErrorString")
  private String errorString = null;

  @SerializedName("CustomListSort")
  private Boolean customListSort = null;

  @SerializedName("MergeLabels")
  private Boolean mergeLabels = null;

  @SerializedName("PageFieldWrapCount")
  private Integer pageFieldWrapCount = null;

  @SerializedName("ShowPivotStyleColumnStripes")
  private Boolean showPivotStyleColumnStripes = null;

  @SerializedName("FieldListSortAscending")
  private Boolean fieldListSortAscending = null;

  @SerializedName("AltTextTitle")
  private String altTextTitle = null;

  @SerializedName("PreserveFormatting")
  private Boolean preserveFormatting = null;

  @SerializedName("PivotTableStyleType")
  private String pivotTableStyleType = null;

  @SerializedName("DataField")
  private PivotField dataField = null;

  @SerializedName("SaveData")
  private Boolean saveData = null;

  @SerializedName("SubtotalHiddenPageItems")
  private Boolean subtotalHiddenPageItems = null;

  @SerializedName("PrintDrill")
  private Boolean printDrill = null;

  @SerializedName("ShowPivotStyleColumnHeader")
  private Boolean showPivotStyleColumnHeader = null;

  @SerializedName("BaseFields")
  private List<PivotField> baseFields = null;

  public PivotTable link(Link link) {
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

  public PivotTable showPivotStyleLastColumn(Boolean showPivotStyleLastColumn) {
    this.showPivotStyleLastColumn = showPivotStyleLastColumn;
    return this;
  }

   /**
   * Get showPivotStyleLastColumn
   * @return showPivotStyleLastColumn
  **/
  @ApiModelProperty(value = "")
  public Boolean ShowPivotStyleLastColumn() {
    return showPivotStyleLastColumn;
  }

  public void setShowPivotStyleLastColumn(Boolean showPivotStyleLastColumn) {
    this.showPivotStyleLastColumn = showPivotStyleLastColumn;
  }

  public PivotTable rowHeaderCaption(String rowHeaderCaption) {
    this.rowHeaderCaption = rowHeaderCaption;
    return this;
  }

   /**
   * Get rowHeaderCaption
   * @return rowHeaderCaption
  **/
  @ApiModelProperty(value = "")
  public String getRowHeaderCaption() {
    return rowHeaderCaption;
  }

  public void setRowHeaderCaption(String rowHeaderCaption) {
    this.rowHeaderCaption = rowHeaderCaption;
  }

  public PivotTable columnRange(CellArea columnRange) {
    this.columnRange = columnRange;
    return this;
  }

   /**
   * Get columnRange
   * @return columnRange
  **/
  @ApiModelProperty(value = "")
  public CellArea getColumnRange() {
    return columnRange;
  }

  public void setColumnRange(CellArea columnRange) {
    this.columnRange = columnRange;
  }

  public PivotTable refreshDataOnOpeningFile(Boolean refreshDataOnOpeningFile) {
    this.refreshDataOnOpeningFile = refreshDataOnOpeningFile;
    return this;
  }

   /**
   * Get refreshDataOnOpeningFile
   * @return refreshDataOnOpeningFile
  **/
  @ApiModelProperty(value = "")
  public Boolean RefreshDataOnOpeningFile() {
    return refreshDataOnOpeningFile;
  }

  public void setRefreshDataOnOpeningFile(Boolean refreshDataOnOpeningFile) {
    this.refreshDataOnOpeningFile = refreshDataOnOpeningFile;
  }

  public PivotTable pageFields(List<PivotField> pageFields) {
    this.pageFields = pageFields;
    return this;
  }

  public PivotTable addPageFieldsItem(PivotField pageFieldsItem) {
    if (this.pageFields == null) {
      this.pageFields = new ArrayList<>();
    }
    this.pageFields.add(pageFieldsItem);
    return this;
  }

   /**
   * Get pageFields
   * @return pageFields
  **/
  @ApiModelProperty(value = "")
  public List<PivotField> getPageFields() {
    return pageFields;
  }

  public void setPageFields(List<PivotField> pageFields) {
    this.pageFields = pageFields;
  }

  public PivotTable dataFields(List<PivotField> dataFields) {
    this.dataFields = dataFields;
    return this;
  }

  public PivotTable addDataFieldsItem(PivotField dataFieldsItem) {
    if (this.dataFields == null) {
      this.dataFields = new ArrayList<>();
    }
    this.dataFields.add(dataFieldsItem);
    return this;
  }

   /**
   * Get dataFields
   * @return dataFields
  **/
  @ApiModelProperty(value = "")
  public List<PivotField> getDataFields() {
    return dataFields;
  }

  public void setDataFields(List<PivotField> dataFields) {
    this.dataFields = dataFields;
  }

  public PivotTable dataBodyRange(CellArea dataBodyRange) {
    this.dataBodyRange = dataBodyRange;
    return this;
  }

   /**
   * Get dataBodyRange
   * @return dataBodyRange
  **/
  @ApiModelProperty(value = "")
  public CellArea getDataBodyRange() {
    return dataBodyRange;
  }

  public void setDataBodyRange(CellArea dataBodyRange) {
    this.dataBodyRange = dataBodyRange;
  }

  public PivotTable showDrill(Boolean showDrill) {
    this.showDrill = showDrill;
    return this;
  }

   /**
   * Get showDrill
   * @return showDrill
  **/
  @ApiModelProperty(value = "")
  public Boolean ShowDrill() {
    return showDrill;
  }

  public void setShowDrill(Boolean showDrill) {
    this.showDrill = showDrill;
  }

  public PivotTable refreshDataFlag(Boolean refreshDataFlag) {
    this.refreshDataFlag = refreshDataFlag;
    return this;
  }

   /**
   * Get refreshDataFlag
   * @return refreshDataFlag
  **/
  @ApiModelProperty(value = "")
  public Boolean RefreshDataFlag() {
    return refreshDataFlag;
  }

  public void setRefreshDataFlag(Boolean refreshDataFlag) {
    this.refreshDataFlag = refreshDataFlag;
  }

  public PivotTable columnGrand(Boolean columnGrand) {
    this.columnGrand = columnGrand;
    return this;
  }

   /**
   * Get columnGrand
   * @return columnGrand
  **/
  @ApiModelProperty(value = "")
  public Boolean ColumnGrand() {
    return columnGrand;
  }

  public void setColumnGrand(Boolean columnGrand) {
    this.columnGrand = columnGrand;
  }

  public PivotTable pivotTableStyleName(String pivotTableStyleName) {
    this.pivotTableStyleName = pivotTableStyleName;
    return this;
  }

   /**
   * Get pivotTableStyleName
   * @return pivotTableStyleName
  **/
  @ApiModelProperty(value = "")
  public String getPivotTableStyleName() {
    return pivotTableStyleName;
  }

  public void setPivotTableStyleName(String pivotTableStyleName) {
    this.pivotTableStyleName = pivotTableStyleName;
  }

  public PivotTable pivotFilters(List<PivotFilter> pivotFilters) {
    this.pivotFilters = pivotFilters;
    return this;
  }

  public PivotTable addPivotFiltersItem(PivotFilter pivotFiltersItem) {
    if (this.pivotFilters == null) {
      this.pivotFilters = new ArrayList<>();
    }
    this.pivotFilters.add(pivotFiltersItem);
    return this;
  }

   /**
   * Get pivotFilters
   * @return pivotFilters
  **/
  @ApiModelProperty(value = "")
  public List<PivotFilter> getPivotFilters() {
    return pivotFilters;
  }

  public void setPivotFilters(List<PivotFilter> pivotFilters) {
    this.pivotFilters = pivotFilters;
  }

  public PivotTable nullString(String nullString) {
    this.nullString = nullString;
    return this;
  }

   /**
   * Get nullString
   * @return nullString
  **/
  @ApiModelProperty(value = "")
  public String getNullString() {
    return nullString;
  }

  public void setNullString(String nullString) {
    this.nullString = nullString;
  }

  public PivotTable itemPrintTitles(Boolean itemPrintTitles) {
    this.itemPrintTitles = itemPrintTitles;
    return this;
  }

   /**
   * Get itemPrintTitles
   * @return itemPrintTitles
  **/
  @ApiModelProperty(value = "")
  public Boolean ItemPrintTitles() {
    return itemPrintTitles;
  }

  public void setItemPrintTitles(Boolean itemPrintTitles) {
    this.itemPrintTitles = itemPrintTitles;
  }

  public PivotTable displayNullString(Boolean displayNullString) {
    this.displayNullString = displayNullString;
    return this;
  }

   /**
   * Get displayNullString
   * @return displayNullString
  **/
  @ApiModelProperty(value = "")
  public Boolean DisplayNullString() {
    return displayNullString;
  }

  public void setDisplayNullString(Boolean displayNullString) {
    this.displayNullString = displayNullString;
  }

  public PivotTable enableFieldList(Boolean enableFieldList) {
    this.enableFieldList = enableFieldList;
    return this;
  }

   /**
   * Get enableFieldList
   * @return enableFieldList
  **/
  @ApiModelProperty(value = "")
  public Boolean EnableFieldList() {
    return enableFieldList;
  }

  public void setEnableFieldList(Boolean enableFieldList) {
    this.enableFieldList = enableFieldList;
  }

  public PivotTable tableRange2(CellArea tableRange2) {
    this.tableRange2 = tableRange2;
    return this;
  }

   /**
   * Get tableRange2
   * @return tableRange2
  **/
  @ApiModelProperty(value = "")
  public CellArea getTableRange2() {
    return tableRange2;
  }

  public void setTableRange2(CellArea tableRange2) {
    this.tableRange2 = tableRange2;
  }

  public PivotTable rowFields(List<PivotField> rowFields) {
    this.rowFields = rowFields;
    return this;
  }

  public PivotTable addRowFieldsItem(PivotField rowFieldsItem) {
    if (this.rowFields == null) {
      this.rowFields = new ArrayList<>();
    }
    this.rowFields.add(rowFieldsItem);
    return this;
  }

   /**
   * Get rowFields
   * @return rowFields
  **/
  @ApiModelProperty(value = "")
  public List<PivotField> getRowFields() {
    return rowFields;
  }

  public void setRowFields(List<PivotField> rowFields) {
    this.rowFields = rowFields;
  }

  public PivotTable pageFieldOrder(String pageFieldOrder) {
    this.pageFieldOrder = pageFieldOrder;
    return this;
  }

   /**
   * Get pageFieldOrder
   * @return pageFieldOrder
  **/
  @ApiModelProperty(value = "")
  public String getPageFieldOrder() {
    return pageFieldOrder;
  }

  public void setPageFieldOrder(String pageFieldOrder) {
    this.pageFieldOrder = pageFieldOrder;
  }

  public PivotTable autoFormatType(String autoFormatType) {
    this.autoFormatType = autoFormatType;
    return this;
  }

   /**
   * Get autoFormatType
   * @return autoFormatType
  **/
  @ApiModelProperty(value = "")
  public String getAutoFormatType() {
    return autoFormatType;
  }

  public void setAutoFormatType(String autoFormatType) {
    this.autoFormatType = autoFormatType;
  }

  public PivotTable enableDataValueEditing(Boolean enableDataValueEditing) {
    this.enableDataValueEditing = enableDataValueEditing;
    return this;
  }

   /**
   * Get enableDataValueEditing
   * @return enableDataValueEditing
  **/
  @ApiModelProperty(value = "")
  public Boolean EnableDataValueEditing() {
    return enableDataValueEditing;
  }

  public void setEnableDataValueEditing(Boolean enableDataValueEditing) {
    this.enableDataValueEditing = enableDataValueEditing;
  }

  public PivotTable showPivotStyleRowHeader(Boolean showPivotStyleRowHeader) {
    this.showPivotStyleRowHeader = showPivotStyleRowHeader;
    return this;
  }

   /**
   * Get showPivotStyleRowHeader
   * @return showPivotStyleRowHeader
  **/
  @ApiModelProperty(value = "")
  public Boolean ShowPivotStyleRowHeader() {
    return showPivotStyleRowHeader;
  }

  public void setShowPivotStyleRowHeader(Boolean showPivotStyleRowHeader) {
    this.showPivotStyleRowHeader = showPivotStyleRowHeader;
  }

  public PivotTable isGridDropZones(Boolean isGridDropZones) {
    this.isGridDropZones = isGridDropZones;
    return this;
  }

   /**
   * Get isGridDropZones
   * @return isGridDropZones
  **/
  @ApiModelProperty(value = "")
  public Boolean IsGridDropZones() {
    return isGridDropZones;
  }

  public void setIsGridDropZones(Boolean isGridDropZones) {
    this.isGridDropZones = isGridDropZones;
  }

  public PivotTable enableWizard(Boolean enableWizard) {
    this.enableWizard = enableWizard;
    return this;
  }

   /**
   * Get enableWizard
   * @return enableWizard
  **/
  @ApiModelProperty(value = "")
  public Boolean EnableWizard() {
    return enableWizard;
  }

  public void setEnableWizard(Boolean enableWizard) {
    this.enableWizard = enableWizard;
  }

  public PivotTable showMemberPropertyTips(Boolean showMemberPropertyTips) {
    this.showMemberPropertyTips = showMemberPropertyTips;
    return this;
  }

   /**
   * Get showMemberPropertyTips
   * @return showMemberPropertyTips
  **/
  @ApiModelProperty(value = "")
  public Boolean ShowMemberPropertyTips() {
    return showMemberPropertyTips;
  }

  public void setShowMemberPropertyTips(Boolean showMemberPropertyTips) {
    this.showMemberPropertyTips = showMemberPropertyTips;
  }

  public PivotTable altTextDescription(String altTextDescription) {
    this.altTextDescription = altTextDescription;
    return this;
  }

   /**
   * Get altTextDescription
   * @return altTextDescription
  **/
  @ApiModelProperty(value = "")
  public String getAltTextDescription() {
    return altTextDescription;
  }

  public void setAltTextDescription(String altTextDescription) {
    this.altTextDescription = altTextDescription;
  }

  public PivotTable showDataTips(Boolean showDataTips) {
    this.showDataTips = showDataTips;
    return this;
  }

   /**
   * Get showDataTips
   * @return showDataTips
  **/
  @ApiModelProperty(value = "")
  public Boolean ShowDataTips() {
    return showDataTips;
  }

  public void setShowDataTips(Boolean showDataTips) {
    this.showDataTips = showDataTips;
  }

  public PivotTable printTitles(Boolean printTitles) {
    this.printTitles = printTitles;
    return this;
  }

   /**
   * Get printTitles
   * @return printTitles
  **/
  @ApiModelProperty(value = "")
  public Boolean PrintTitles() {
    return printTitles;
  }

  public void setPrintTitles(Boolean printTitles) {
    this.printTitles = printTitles;
  }

  public PivotTable tableRange1(CellArea tableRange1) {
    this.tableRange1 = tableRange1;
    return this;
  }

   /**
   * Get tableRange1
   * @return tableRange1
  **/
  @ApiModelProperty(value = "")
  public CellArea getTableRange1() {
    return tableRange1;
  }

  public void setTableRange1(CellArea tableRange1) {
    this.tableRange1 = tableRange1;
  }

  public PivotTable showEmptyRow(Boolean showEmptyRow) {
    this.showEmptyRow = showEmptyRow;
    return this;
  }

   /**
   * Get showEmptyRow
   * @return showEmptyRow
  **/
  @ApiModelProperty(value = "")
  public Boolean ShowEmptyRow() {
    return showEmptyRow;
  }

  public void setShowEmptyRow(Boolean showEmptyRow) {
    this.showEmptyRow = showEmptyRow;
  }

  public PivotTable isMultipleFieldFilters(Boolean isMultipleFieldFilters) {
    this.isMultipleFieldFilters = isMultipleFieldFilters;
    return this;
  }

   /**
   * Get isMultipleFieldFilters
   * @return isMultipleFieldFilters
  **/
  @ApiModelProperty(value = "")
  public Boolean IsMultipleFieldFilters() {
    return isMultipleFieldFilters;
  }

  public void setIsMultipleFieldFilters(Boolean isMultipleFieldFilters) {
    this.isMultipleFieldFilters = isMultipleFieldFilters;
  }

  public PivotTable showEmptyCol(Boolean showEmptyCol) {
    this.showEmptyCol = showEmptyCol;
    return this;
  }

   /**
   * Get showEmptyCol
   * @return showEmptyCol
  **/
  @ApiModelProperty(value = "")
  public Boolean ShowEmptyCol() {
    return showEmptyCol;
  }

  public void setShowEmptyCol(Boolean showEmptyCol) {
    this.showEmptyCol = showEmptyCol;
  }

  public PivotTable showRowHeaderCaption(Boolean showRowHeaderCaption) {
    this.showRowHeaderCaption = showRowHeaderCaption;
    return this;
  }

   /**
   * Get showRowHeaderCaption
   * @return showRowHeaderCaption
  **/
  @ApiModelProperty(value = "")
  public Boolean ShowRowHeaderCaption() {
    return showRowHeaderCaption;
  }

  public void setShowRowHeaderCaption(Boolean showRowHeaderCaption) {
    this.showRowHeaderCaption = showRowHeaderCaption;
  }

  public PivotTable hasBlankRows(Boolean hasBlankRows) {
    this.hasBlankRows = hasBlankRows;
    return this;
  }

   /**
   * Get hasBlankRows
   * @return hasBlankRows
  **/
  @ApiModelProperty(value = "")
  public Boolean HasBlankRows() {
    return hasBlankRows;
  }

  public void setHasBlankRows(Boolean hasBlankRows) {
    this.hasBlankRows = hasBlankRows;
  }

  public PivotTable dataSource(List<String> dataSource) {
    this.dataSource = dataSource;
    return this;
  }

  public PivotTable addDataSourceItem(String dataSourceItem) {
    if (this.dataSource == null) {
      this.dataSource = new ArrayList<>();
    }
    this.dataSource.add(dataSourceItem);
    return this;
  }

   /**
   * Get dataSource
   * @return dataSource
  **/
  @ApiModelProperty(value = "")
  public List<String> getDataSource() {
    return dataSource;
  }

  public void setDataSource(List<String> dataSource) {
    this.dataSource = dataSource;
  }

  public PivotTable tag(String tag) {
    this.tag = tag;
    return this;
  }

   /**
   * Get tag
   * @return tag
  **/
  @ApiModelProperty(value = "")
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public PivotTable enableDrilldown(Boolean enableDrilldown) {
    this.enableDrilldown = enableDrilldown;
    return this;
  }

   /**
   * Get enableDrilldown
   * @return enableDrilldown
  **/
  @ApiModelProperty(value = "")
  public Boolean EnableDrilldown() {
    return enableDrilldown;
  }

  public void setEnableDrilldown(Boolean enableDrilldown) {
    this.enableDrilldown = enableDrilldown;
  }

  public PivotTable indent(Integer indent) {
    this.indent = indent;
    return this;
  }

   /**
   * Get indent
   * @return indent
  **/
  @ApiModelProperty(value = "")
  public Integer getIndent() {
    return indent;
  }

  public void setIndent(Integer indent) {
    this.indent = indent;
  }

  public PivotTable name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PivotTable rowGrand(Boolean rowGrand) {
    this.rowGrand = rowGrand;
    return this;
  }

   /**
   * Get rowGrand
   * @return rowGrand
  **/
  @ApiModelProperty(value = "")
  public Boolean RowGrand() {
    return rowGrand;
  }

  public void setRowGrand(Boolean rowGrand) {
    this.rowGrand = rowGrand;
  }

  public PivotTable grandTotalName(String grandTotalName) {
    this.grandTotalName = grandTotalName;
    return this;
  }

   /**
   * Get grandTotalName
   * @return grandTotalName
  **/
  @ApiModelProperty(value = "")
  public String getGrandTotalName() {
    return grandTotalName;
  }

  public void setGrandTotalName(String grandTotalName) {
    this.grandTotalName = grandTotalName;
  }

  public PivotTable displayErrorString(Boolean displayErrorString) {
    this.displayErrorString = displayErrorString;
    return this;
  }

   /**
   * Get displayErrorString
   * @return displayErrorString
  **/
  @ApiModelProperty(value = "")
  public Boolean DisplayErrorString() {
    return displayErrorString;
  }

  public void setDisplayErrorString(Boolean displayErrorString) {
    this.displayErrorString = displayErrorString;
  }

  public PivotTable rowRange(CellArea rowRange) {
    this.rowRange = rowRange;
    return this;
  }

   /**
   * Get rowRange
   * @return rowRange
  **/
  @ApiModelProperty(value = "")
  public CellArea getRowRange() {
    return rowRange;
  }

  public void setRowRange(CellArea rowRange) {
    this.rowRange = rowRange;
  }

  public PivotTable isSelected(Boolean isSelected) {
    this.isSelected = isSelected;
    return this;
  }

   /**
   * Get isSelected
   * @return isSelected
  **/
  @ApiModelProperty(value = "")
  public Boolean IsSelected() {
    return isSelected;
  }

  public void setIsSelected(Boolean isSelected) {
    this.isSelected = isSelected;
  }

  public PivotTable columnFields(List<PivotField> columnFields) {
    this.columnFields = columnFields;
    return this;
  }

  public PivotTable addColumnFieldsItem(PivotField columnFieldsItem) {
    if (this.columnFields == null) {
      this.columnFields = new ArrayList<>();
    }
    this.columnFields.add(columnFieldsItem);
    return this;
  }

   /**
   * Get columnFields
   * @return columnFields
  **/
  @ApiModelProperty(value = "")
  public List<PivotField> getColumnFields() {
    return columnFields;
  }

  public void setColumnFields(List<PivotField> columnFields) {
    this.columnFields = columnFields;
  }

  public PivotTable columnHeaderCaption(String columnHeaderCaption) {
    this.columnHeaderCaption = columnHeaderCaption;
    return this;
  }

   /**
   * Get columnHeaderCaption
   * @return columnHeaderCaption
  **/
  @ApiModelProperty(value = "")
  public String getColumnHeaderCaption() {
    return columnHeaderCaption;
  }

  public void setColumnHeaderCaption(String columnHeaderCaption) {
    this.columnHeaderCaption = columnHeaderCaption;
  }

  public PivotTable showValuesRow(Boolean showValuesRow) {
    this.showValuesRow = showValuesRow;
    return this;
  }

   /**
   * Get showValuesRow
   * @return showValuesRow
  **/
  @ApiModelProperty(value = "")
  public Boolean ShowValuesRow() {
    return showValuesRow;
  }

  public void setShowValuesRow(Boolean showValuesRow) {
    this.showValuesRow = showValuesRow;
  }

  public PivotTable enableFieldDialog(Boolean enableFieldDialog) {
    this.enableFieldDialog = enableFieldDialog;
    return this;
  }

   /**
   * Get enableFieldDialog
   * @return enableFieldDialog
  **/
  @ApiModelProperty(value = "")
  public Boolean EnableFieldDialog() {
    return enableFieldDialog;
  }

  public void setEnableFieldDialog(Boolean enableFieldDialog) {
    this.enableFieldDialog = enableFieldDialog;
  }

  public PivotTable missingItemsLimit(String missingItemsLimit) {
    this.missingItemsLimit = missingItemsLimit;
    return this;
  }

   /**
   * Get missingItemsLimit
   * @return missingItemsLimit
  **/
  @ApiModelProperty(value = "")
  public String getMissingItemsLimit() {
    return missingItemsLimit;
  }

  public void setMissingItemsLimit(String missingItemsLimit) {
    this.missingItemsLimit = missingItemsLimit;
  }

  public PivotTable showPivotStyleRowStripes(Boolean showPivotStyleRowStripes) {
    this.showPivotStyleRowStripes = showPivotStyleRowStripes;
    return this;
  }

   /**
   * Get showPivotStyleRowStripes
   * @return showPivotStyleRowStripes
  **/
  @ApiModelProperty(value = "")
  public Boolean ShowPivotStyleRowStripes() {
    return showPivotStyleRowStripes;
  }

  public void setShowPivotStyleRowStripes(Boolean showPivotStyleRowStripes) {
    this.showPivotStyleRowStripes = showPivotStyleRowStripes;
  }

  public PivotTable manualUpdate(Boolean manualUpdate) {
    this.manualUpdate = manualUpdate;
    return this;
  }

   /**
   * Get manualUpdate
   * @return manualUpdate
  **/
  @ApiModelProperty(value = "")
  public Boolean ManualUpdate() {
    return manualUpdate;
  }

  public void setManualUpdate(Boolean manualUpdate) {
    this.manualUpdate = manualUpdate;
  }

  public PivotTable isAutoFormat(Boolean isAutoFormat) {
    this.isAutoFormat = isAutoFormat;
    return this;
  }

   /**
   * Get isAutoFormat
   * @return isAutoFormat
  **/
  @ApiModelProperty(value = "")
  public Boolean IsAutoFormat() {
    return isAutoFormat;
  }

  public void setIsAutoFormat(Boolean isAutoFormat) {
    this.isAutoFormat = isAutoFormat;
  }

  public PivotTable displayImmediateItems(Boolean displayImmediateItems) {
    this.displayImmediateItems = displayImmediateItems;
    return this;
  }

   /**
   * Get displayImmediateItems
   * @return displayImmediateItems
  **/
  @ApiModelProperty(value = "")
  public Boolean DisplayImmediateItems() {
    return displayImmediateItems;
  }

  public void setDisplayImmediateItems(Boolean displayImmediateItems) {
    this.displayImmediateItems = displayImmediateItems;
  }

  public PivotTable errorString(String errorString) {
    this.errorString = errorString;
    return this;
  }

   /**
   * Get errorString
   * @return errorString
  **/
  @ApiModelProperty(value = "")
  public String getErrorString() {
    return errorString;
  }

  public void setErrorString(String errorString) {
    this.errorString = errorString;
  }

  public PivotTable customListSort(Boolean customListSort) {
    this.customListSort = customListSort;
    return this;
  }

   /**
   * Get customListSort
   * @return customListSort
  **/
  @ApiModelProperty(value = "")
  public Boolean CustomListSort() {
    return customListSort;
  }

  public void setCustomListSort(Boolean customListSort) {
    this.customListSort = customListSort;
  }

  public PivotTable mergeLabels(Boolean mergeLabels) {
    this.mergeLabels = mergeLabels;
    return this;
  }

   /**
   * Get mergeLabels
   * @return mergeLabels
  **/
  @ApiModelProperty(value = "")
  public Boolean MergeLabels() {
    return mergeLabels;
  }

  public void setMergeLabels(Boolean mergeLabels) {
    this.mergeLabels = mergeLabels;
  }

  public PivotTable pageFieldWrapCount(Integer pageFieldWrapCount) {
    this.pageFieldWrapCount = pageFieldWrapCount;
    return this;
  }

   /**
   * Get pageFieldWrapCount
   * @return pageFieldWrapCount
  **/
  @ApiModelProperty(value = "")
  public Integer getPageFieldWrapCount() {
    return pageFieldWrapCount;
  }

  public void setPageFieldWrapCount(Integer pageFieldWrapCount) {
    this.pageFieldWrapCount = pageFieldWrapCount;
  }

  public PivotTable showPivotStyleColumnStripes(Boolean showPivotStyleColumnStripes) {
    this.showPivotStyleColumnStripes = showPivotStyleColumnStripes;
    return this;
  }

   /**
   * Get showPivotStyleColumnStripes
   * @return showPivotStyleColumnStripes
  **/
  @ApiModelProperty(value = "")
  public Boolean ShowPivotStyleColumnStripes() {
    return showPivotStyleColumnStripes;
  }

  public void setShowPivotStyleColumnStripes(Boolean showPivotStyleColumnStripes) {
    this.showPivotStyleColumnStripes = showPivotStyleColumnStripes;
  }

  public PivotTable fieldListSortAscending(Boolean fieldListSortAscending) {
    this.fieldListSortAscending = fieldListSortAscending;
    return this;
  }

   /**
   * Get fieldListSortAscending
   * @return fieldListSortAscending
  **/
  @ApiModelProperty(value = "")
  public Boolean FieldListSortAscending() {
    return fieldListSortAscending;
  }

  public void setFieldListSortAscending(Boolean fieldListSortAscending) {
    this.fieldListSortAscending = fieldListSortAscending;
  }

  public PivotTable altTextTitle(String altTextTitle) {
    this.altTextTitle = altTextTitle;
    return this;
  }

   /**
   * Get altTextTitle
   * @return altTextTitle
  **/
  @ApiModelProperty(value = "")
  public String getAltTextTitle() {
    return altTextTitle;
  }

  public void setAltTextTitle(String altTextTitle) {
    this.altTextTitle = altTextTitle;
  }

  public PivotTable preserveFormatting(Boolean preserveFormatting) {
    this.preserveFormatting = preserveFormatting;
    return this;
  }

   /**
   * Get preserveFormatting
   * @return preserveFormatting
  **/
  @ApiModelProperty(value = "")
  public Boolean PreserveFormatting() {
    return preserveFormatting;
  }

  public void setPreserveFormatting(Boolean preserveFormatting) {
    this.preserveFormatting = preserveFormatting;
  }

  public PivotTable pivotTableStyleType(String pivotTableStyleType) {
    this.pivotTableStyleType = pivotTableStyleType;
    return this;
  }

   /**
   * Get pivotTableStyleType
   * @return pivotTableStyleType
  **/
  @ApiModelProperty(value = "")
  public String getPivotTableStyleType() {
    return pivotTableStyleType;
  }

  public void setPivotTableStyleType(String pivotTableStyleType) {
    this.pivotTableStyleType = pivotTableStyleType;
  }

  public PivotTable dataField(PivotField dataField) {
    this.dataField = dataField;
    return this;
  }

   /**
   * Get dataField
   * @return dataField
  **/
  @ApiModelProperty(value = "")
  public PivotField getDataField() {
    return dataField;
  }

  public void setDataField(PivotField dataField) {
    this.dataField = dataField;
  }

  public PivotTable saveData(Boolean saveData) {
    this.saveData = saveData;
    return this;
  }

   /**
   * Get saveData
   * @return saveData
  **/
  @ApiModelProperty(value = "")
  public Boolean SaveData() {
    return saveData;
  }

  public void setSaveData(Boolean saveData) {
    this.saveData = saveData;
  }

  public PivotTable subtotalHiddenPageItems(Boolean subtotalHiddenPageItems) {
    this.subtotalHiddenPageItems = subtotalHiddenPageItems;
    return this;
  }

   /**
   * Get subtotalHiddenPageItems
   * @return subtotalHiddenPageItems
  **/
  @ApiModelProperty(value = "")
  public Boolean SubtotalHiddenPageItems() {
    return subtotalHiddenPageItems;
  }

  public void setSubtotalHiddenPageItems(Boolean subtotalHiddenPageItems) {
    this.subtotalHiddenPageItems = subtotalHiddenPageItems;
  }

  public PivotTable printDrill(Boolean printDrill) {
    this.printDrill = printDrill;
    return this;
  }

   /**
   * Get printDrill
   * @return printDrill
  **/
  @ApiModelProperty(value = "")
  public Boolean PrintDrill() {
    return printDrill;
  }

  public void setPrintDrill(Boolean printDrill) {
    this.printDrill = printDrill;
  }

  public PivotTable showPivotStyleColumnHeader(Boolean showPivotStyleColumnHeader) {
    this.showPivotStyleColumnHeader = showPivotStyleColumnHeader;
    return this;
  }

   /**
   * Get showPivotStyleColumnHeader
   * @return showPivotStyleColumnHeader
  **/
  @ApiModelProperty(value = "")
  public Boolean ShowPivotStyleColumnHeader() {
    return showPivotStyleColumnHeader;
  }

  public void setShowPivotStyleColumnHeader(Boolean showPivotStyleColumnHeader) {
    this.showPivotStyleColumnHeader = showPivotStyleColumnHeader;
  }

  public PivotTable baseFields(List<PivotField> baseFields) {
    this.baseFields = baseFields;
    return this;
  }

  public PivotTable addBaseFieldsItem(PivotField baseFieldsItem) {
    if (this.baseFields == null) {
      this.baseFields = new ArrayList<>();
    }
    this.baseFields.add(baseFieldsItem);
    return this;
  }

   /**
   * Get baseFields
   * @return baseFields
  **/
  @ApiModelProperty(value = "")
  public List<PivotField> getBaseFields() {
    return baseFields;
  }

  public void setBaseFields(List<PivotField> baseFields) {
    this.baseFields = baseFields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PivotTable pivotTable = (PivotTable) o;
    return Objects.equals(this.link, pivotTable.link) &&
        Objects.equals(this.showPivotStyleLastColumn, pivotTable.showPivotStyleLastColumn) &&
        Objects.equals(this.rowHeaderCaption, pivotTable.rowHeaderCaption) &&
        Objects.equals(this.columnRange, pivotTable.columnRange) &&
        Objects.equals(this.refreshDataOnOpeningFile, pivotTable.refreshDataOnOpeningFile) &&
        Objects.equals(this.pageFields, pivotTable.pageFields) &&
        Objects.equals(this.dataFields, pivotTable.dataFields) &&
        Objects.equals(this.dataBodyRange, pivotTable.dataBodyRange) &&
        Objects.equals(this.showDrill, pivotTable.showDrill) &&
        Objects.equals(this.refreshDataFlag, pivotTable.refreshDataFlag) &&
        Objects.equals(this.columnGrand, pivotTable.columnGrand) &&
        Objects.equals(this.pivotTableStyleName, pivotTable.pivotTableStyleName) &&
        Objects.equals(this.pivotFilters, pivotTable.pivotFilters) &&
        Objects.equals(this.nullString, pivotTable.nullString) &&
        Objects.equals(this.itemPrintTitles, pivotTable.itemPrintTitles) &&
        Objects.equals(this.displayNullString, pivotTable.displayNullString) &&
        Objects.equals(this.enableFieldList, pivotTable.enableFieldList) &&
        Objects.equals(this.tableRange2, pivotTable.tableRange2) &&
        Objects.equals(this.rowFields, pivotTable.rowFields) &&
        Objects.equals(this.pageFieldOrder, pivotTable.pageFieldOrder) &&
        Objects.equals(this.autoFormatType, pivotTable.autoFormatType) &&
        Objects.equals(this.enableDataValueEditing, pivotTable.enableDataValueEditing) &&
        Objects.equals(this.showPivotStyleRowHeader, pivotTable.showPivotStyleRowHeader) &&
        Objects.equals(this.isGridDropZones, pivotTable.isGridDropZones) &&
        Objects.equals(this.enableWizard, pivotTable.enableWizard) &&
        Objects.equals(this.showMemberPropertyTips, pivotTable.showMemberPropertyTips) &&
        Objects.equals(this.altTextDescription, pivotTable.altTextDescription) &&
        Objects.equals(this.showDataTips, pivotTable.showDataTips) &&
        Objects.equals(this.printTitles, pivotTable.printTitles) &&
        Objects.equals(this.tableRange1, pivotTable.tableRange1) &&
        Objects.equals(this.showEmptyRow, pivotTable.showEmptyRow) &&
        Objects.equals(this.isMultipleFieldFilters, pivotTable.isMultipleFieldFilters) &&
        Objects.equals(this.showEmptyCol, pivotTable.showEmptyCol) &&
        Objects.equals(this.showRowHeaderCaption, pivotTable.showRowHeaderCaption) &&
        Objects.equals(this.hasBlankRows, pivotTable.hasBlankRows) &&
        Objects.equals(this.dataSource, pivotTable.dataSource) &&
        Objects.equals(this.tag, pivotTable.tag) &&
        Objects.equals(this.enableDrilldown, pivotTable.enableDrilldown) &&
        Objects.equals(this.indent, pivotTable.indent) &&
        Objects.equals(this.name, pivotTable.name) &&
        Objects.equals(this.rowGrand, pivotTable.rowGrand) &&
        Objects.equals(this.grandTotalName, pivotTable.grandTotalName) &&
        Objects.equals(this.displayErrorString, pivotTable.displayErrorString) &&
        Objects.equals(this.rowRange, pivotTable.rowRange) &&
        Objects.equals(this.isSelected, pivotTable.isSelected) &&
        Objects.equals(this.columnFields, pivotTable.columnFields) &&
        Objects.equals(this.columnHeaderCaption, pivotTable.columnHeaderCaption) &&
        Objects.equals(this.showValuesRow, pivotTable.showValuesRow) &&
        Objects.equals(this.enableFieldDialog, pivotTable.enableFieldDialog) &&
        Objects.equals(this.missingItemsLimit, pivotTable.missingItemsLimit) &&
        Objects.equals(this.showPivotStyleRowStripes, pivotTable.showPivotStyleRowStripes) &&
        Objects.equals(this.manualUpdate, pivotTable.manualUpdate) &&
        Objects.equals(this.isAutoFormat, pivotTable.isAutoFormat) &&
        Objects.equals(this.displayImmediateItems, pivotTable.displayImmediateItems) &&
        Objects.equals(this.errorString, pivotTable.errorString) &&
        Objects.equals(this.customListSort, pivotTable.customListSort) &&
        Objects.equals(this.mergeLabels, pivotTable.mergeLabels) &&
        Objects.equals(this.pageFieldWrapCount, pivotTable.pageFieldWrapCount) &&
        Objects.equals(this.showPivotStyleColumnStripes, pivotTable.showPivotStyleColumnStripes) &&
        Objects.equals(this.fieldListSortAscending, pivotTable.fieldListSortAscending) &&
        Objects.equals(this.altTextTitle, pivotTable.altTextTitle) &&
        Objects.equals(this.preserveFormatting, pivotTable.preserveFormatting) &&
        Objects.equals(this.pivotTableStyleType, pivotTable.pivotTableStyleType) &&
        Objects.equals(this.dataField, pivotTable.dataField) &&
        Objects.equals(this.saveData, pivotTable.saveData) &&
        Objects.equals(this.subtotalHiddenPageItems, pivotTable.subtotalHiddenPageItems) &&
        Objects.equals(this.printDrill, pivotTable.printDrill) &&
        Objects.equals(this.showPivotStyleColumnHeader, pivotTable.showPivotStyleColumnHeader) &&
        Objects.equals(this.baseFields, pivotTable.baseFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, showPivotStyleLastColumn, rowHeaderCaption, columnRange, refreshDataOnOpeningFile, pageFields, dataFields, dataBodyRange, showDrill, refreshDataFlag, columnGrand, pivotTableStyleName, pivotFilters, nullString, itemPrintTitles, displayNullString, enableFieldList, tableRange2, rowFields, pageFieldOrder, autoFormatType, enableDataValueEditing, showPivotStyleRowHeader, isGridDropZones, enableWizard, showMemberPropertyTips, altTextDescription, showDataTips, printTitles, tableRange1, showEmptyRow, isMultipleFieldFilters, showEmptyCol, showRowHeaderCaption, hasBlankRows, dataSource, tag, enableDrilldown, indent, name, rowGrand, grandTotalName, displayErrorString, rowRange, isSelected, columnFields, columnHeaderCaption, showValuesRow, enableFieldDialog, missingItemsLimit, showPivotStyleRowStripes, manualUpdate, isAutoFormat, displayImmediateItems, errorString, customListSort, mergeLabels, pageFieldWrapCount, showPivotStyleColumnStripes, fieldListSortAscending, altTextTitle, preserveFormatting, pivotTableStyleType, dataField, saveData, subtotalHiddenPageItems, printDrill, showPivotStyleColumnHeader, baseFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PivotTable {\n");
    
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    showPivotStyleLastColumn: ").append(toIndentedString(showPivotStyleLastColumn)).append("\n");
    sb.append("    rowHeaderCaption: ").append(toIndentedString(rowHeaderCaption)).append("\n");
    sb.append("    columnRange: ").append(toIndentedString(columnRange)).append("\n");
    sb.append("    refreshDataOnOpeningFile: ").append(toIndentedString(refreshDataOnOpeningFile)).append("\n");
    sb.append("    pageFields: ").append(toIndentedString(pageFields)).append("\n");
    sb.append("    dataFields: ").append(toIndentedString(dataFields)).append("\n");
    sb.append("    dataBodyRange: ").append(toIndentedString(dataBodyRange)).append("\n");
    sb.append("    showDrill: ").append(toIndentedString(showDrill)).append("\n");
    sb.append("    refreshDataFlag: ").append(toIndentedString(refreshDataFlag)).append("\n");
    sb.append("    columnGrand: ").append(toIndentedString(columnGrand)).append("\n");
    sb.append("    pivotTableStyleName: ").append(toIndentedString(pivotTableStyleName)).append("\n");
    sb.append("    pivotFilters: ").append(toIndentedString(pivotFilters)).append("\n");
    sb.append("    nullString: ").append(toIndentedString(nullString)).append("\n");
    sb.append("    itemPrintTitles: ").append(toIndentedString(itemPrintTitles)).append("\n");
    sb.append("    displayNullString: ").append(toIndentedString(displayNullString)).append("\n");
    sb.append("    enableFieldList: ").append(toIndentedString(enableFieldList)).append("\n");
    sb.append("    tableRange2: ").append(toIndentedString(tableRange2)).append("\n");
    sb.append("    rowFields: ").append(toIndentedString(rowFields)).append("\n");
    sb.append("    pageFieldOrder: ").append(toIndentedString(pageFieldOrder)).append("\n");
    sb.append("    autoFormatType: ").append(toIndentedString(autoFormatType)).append("\n");
    sb.append("    enableDataValueEditing: ").append(toIndentedString(enableDataValueEditing)).append("\n");
    sb.append("    showPivotStyleRowHeader: ").append(toIndentedString(showPivotStyleRowHeader)).append("\n");
    sb.append("    isGridDropZones: ").append(toIndentedString(isGridDropZones)).append("\n");
    sb.append("    enableWizard: ").append(toIndentedString(enableWizard)).append("\n");
    sb.append("    showMemberPropertyTips: ").append(toIndentedString(showMemberPropertyTips)).append("\n");
    sb.append("    altTextDescription: ").append(toIndentedString(altTextDescription)).append("\n");
    sb.append("    showDataTips: ").append(toIndentedString(showDataTips)).append("\n");
    sb.append("    printTitles: ").append(toIndentedString(printTitles)).append("\n");
    sb.append("    tableRange1: ").append(toIndentedString(tableRange1)).append("\n");
    sb.append("    showEmptyRow: ").append(toIndentedString(showEmptyRow)).append("\n");
    sb.append("    isMultipleFieldFilters: ").append(toIndentedString(isMultipleFieldFilters)).append("\n");
    sb.append("    showEmptyCol: ").append(toIndentedString(showEmptyCol)).append("\n");
    sb.append("    showRowHeaderCaption: ").append(toIndentedString(showRowHeaderCaption)).append("\n");
    sb.append("    hasBlankRows: ").append(toIndentedString(hasBlankRows)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    enableDrilldown: ").append(toIndentedString(enableDrilldown)).append("\n");
    sb.append("    indent: ").append(toIndentedString(indent)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rowGrand: ").append(toIndentedString(rowGrand)).append("\n");
    sb.append("    grandTotalName: ").append(toIndentedString(grandTotalName)).append("\n");
    sb.append("    displayErrorString: ").append(toIndentedString(displayErrorString)).append("\n");
    sb.append("    rowRange: ").append(toIndentedString(rowRange)).append("\n");
    sb.append("    isSelected: ").append(toIndentedString(isSelected)).append("\n");
    sb.append("    columnFields: ").append(toIndentedString(columnFields)).append("\n");
    sb.append("    columnHeaderCaption: ").append(toIndentedString(columnHeaderCaption)).append("\n");
    sb.append("    showValuesRow: ").append(toIndentedString(showValuesRow)).append("\n");
    sb.append("    enableFieldDialog: ").append(toIndentedString(enableFieldDialog)).append("\n");
    sb.append("    missingItemsLimit: ").append(toIndentedString(missingItemsLimit)).append("\n");
    sb.append("    showPivotStyleRowStripes: ").append(toIndentedString(showPivotStyleRowStripes)).append("\n");
    sb.append("    manualUpdate: ").append(toIndentedString(manualUpdate)).append("\n");
    sb.append("    isAutoFormat: ").append(toIndentedString(isAutoFormat)).append("\n");
    sb.append("    displayImmediateItems: ").append(toIndentedString(displayImmediateItems)).append("\n");
    sb.append("    errorString: ").append(toIndentedString(errorString)).append("\n");
    sb.append("    customListSort: ").append(toIndentedString(customListSort)).append("\n");
    sb.append("    mergeLabels: ").append(toIndentedString(mergeLabels)).append("\n");
    sb.append("    pageFieldWrapCount: ").append(toIndentedString(pageFieldWrapCount)).append("\n");
    sb.append("    showPivotStyleColumnStripes: ").append(toIndentedString(showPivotStyleColumnStripes)).append("\n");
    sb.append("    fieldListSortAscending: ").append(toIndentedString(fieldListSortAscending)).append("\n");
    sb.append("    altTextTitle: ").append(toIndentedString(altTextTitle)).append("\n");
    sb.append("    preserveFormatting: ").append(toIndentedString(preserveFormatting)).append("\n");
    sb.append("    pivotTableStyleType: ").append(toIndentedString(pivotTableStyleType)).append("\n");
    sb.append("    dataField: ").append(toIndentedString(dataField)).append("\n");
    sb.append("    saveData: ").append(toIndentedString(saveData)).append("\n");
    sb.append("    subtotalHiddenPageItems: ").append(toIndentedString(subtotalHiddenPageItems)).append("\n");
    sb.append("    printDrill: ").append(toIndentedString(printDrill)).append("\n");
    sb.append("    showPivotStyleColumnHeader: ").append(toIndentedString(showPivotStyleColumnHeader)).append("\n");
    sb.append("    baseFields: ").append(toIndentedString(baseFields)).append("\n");
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

