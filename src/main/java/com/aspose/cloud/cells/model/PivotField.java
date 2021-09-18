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
import com.aspose.cloud.cells.model.PivotItem;
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
 * PivotField
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-09-17T23:42:04.472-05:00")
public class PivotField {
  @SerializedName("PivotItems")
  private List<PivotItem> pivotItems = null;

  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("NumberFormat")
  private String numberFormat = null;

  @SerializedName("DragToColumn")
  private Boolean dragToColumn = null;

  @SerializedName("IsAutoShow")
  private Boolean isAutoShow = null;

  @SerializedName("IsRepeatItemLabels")
  private Boolean isRepeatItemLabels = null;

  @SerializedName("DragToRow")
  private Boolean dragToRow = null;

  @SerializedName("IsAutoSort")
  private Boolean isAutoSort = null;

  @SerializedName("InsertBlankRow")
  private Boolean insertBlankRow = null;

  @SerializedName("ShowSubtotalAtTop")
  private Boolean showSubtotalAtTop = null;

  @SerializedName("ShowCompact")
  private Boolean showCompact = null;

  @SerializedName("Function")
  private String function = null;

  @SerializedName("IsMultipleItemSelectionAllowed")
  private Boolean isMultipleItemSelectionAllowed = null;

  @SerializedName("DataDisplayFormat")
  private String dataDisplayFormat = null;

  @SerializedName("BaseItemPosition")
  private String baseItemPosition = null;

  @SerializedName("IsInsertPageBreaksBetweenItems")
  private Boolean isInsertPageBreaksBetweenItems = null;

  @SerializedName("ShowAllItems")
  private Boolean showAllItems = null;

  @SerializedName("BaseItem")
  private Integer baseItem = null;

  @SerializedName("ItemCount")
  private Integer itemCount = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("ShowInOutlineForm")
  private Boolean showInOutlineForm = null;

  @SerializedName("Items")
  private List<String> items = null;

  @SerializedName("AutoShowField")
  private Integer autoShowField = null;

  @SerializedName("IsAutoSubtotals")
  private Boolean isAutoSubtotals = null;

  @SerializedName("IsIncludeNewItemsInFilter")
  private Boolean isIncludeNewItemsInFilter = null;

  @SerializedName("CurrentPageItem")
  private Integer currentPageItem = null;

  @SerializedName("Position")
  private Integer position = null;

  @SerializedName("IsAscendSort")
  private Boolean isAscendSort = null;

  @SerializedName("IsAscendShow")
  private Boolean isAscendShow = null;

  @SerializedName("BaseField")
  private Integer baseField = null;

  @SerializedName("AutoSortField")
  private Integer autoSortField = null;

  @SerializedName("AutoShowCount")
  private Integer autoShowCount = null;

  @SerializedName("Number")
  private Integer number = null;

  @SerializedName("DragToPage")
  private Boolean dragToPage = null;

  @SerializedName("DragToData")
  private Boolean dragToData = null;

  @SerializedName("BaseIndex")
  private Integer baseIndex = null;

  @SerializedName("OriginalItems")
  private List<String> originalItems = null;

  @SerializedName("DragToHide")
  private Boolean dragToHide = null;

  @SerializedName("IsCalculatedField")
  private Boolean isCalculatedField = null;

  public PivotField pivotItems(List<PivotItem> pivotItems) {
    this.pivotItems = pivotItems;
    return this;
  }

  public PivotField addPivotItemsItem(PivotItem pivotItemsItem) {
    if (this.pivotItems == null) {
      this.pivotItems = new ArrayList<>();
    }
    this.pivotItems.add(pivotItemsItem);
    return this;
  }

   /**
   * Get pivotItems
   * @return pivotItems
  **/
  @ApiModelProperty(value = "")
  public List<PivotItem> getPivotItems() {
    return pivotItems;
  }

  public void setPivotItems(List<PivotItem> pivotItems) {
    this.pivotItems = pivotItems;
  }

  public PivotField displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @ApiModelProperty(value = "")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public PivotField numberFormat(String numberFormat) {
    this.numberFormat = numberFormat;
    return this;
  }

   /**
   * Get numberFormat
   * @return numberFormat
  **/
  @ApiModelProperty(value = "")
  public String getNumberFormat() {
    return numberFormat;
  }

  public void setNumberFormat(String numberFormat) {
    this.numberFormat = numberFormat;
  }

  public PivotField dragToColumn(Boolean dragToColumn) {
    this.dragToColumn = dragToColumn;
    return this;
  }

   /**
   * Get dragToColumn
   * @return dragToColumn
  **/
  @ApiModelProperty(value = "")
  public Boolean DragToColumn() {
    return dragToColumn;
  }

  public void setDragToColumn(Boolean dragToColumn) {
    this.dragToColumn = dragToColumn;
  }

  public PivotField isAutoShow(Boolean isAutoShow) {
    this.isAutoShow = isAutoShow;
    return this;
  }

   /**
   * Get isAutoShow
   * @return isAutoShow
  **/
  @ApiModelProperty(value = "")
  public Boolean IsAutoShow() {
    return isAutoShow;
  }

  public void setIsAutoShow(Boolean isAutoShow) {
    this.isAutoShow = isAutoShow;
  }

  public PivotField isRepeatItemLabels(Boolean isRepeatItemLabels) {
    this.isRepeatItemLabels = isRepeatItemLabels;
    return this;
  }

   /**
   * Get isRepeatItemLabels
   * @return isRepeatItemLabels
  **/
  @ApiModelProperty(value = "")
  public Boolean IsRepeatItemLabels() {
    return isRepeatItemLabels;
  }

  public void setIsRepeatItemLabels(Boolean isRepeatItemLabels) {
    this.isRepeatItemLabels = isRepeatItemLabels;
  }

  public PivotField dragToRow(Boolean dragToRow) {
    this.dragToRow = dragToRow;
    return this;
  }

   /**
   * Get dragToRow
   * @return dragToRow
  **/
  @ApiModelProperty(value = "")
  public Boolean DragToRow() {
    return dragToRow;
  }

  public void setDragToRow(Boolean dragToRow) {
    this.dragToRow = dragToRow;
  }

  public PivotField isAutoSort(Boolean isAutoSort) {
    this.isAutoSort = isAutoSort;
    return this;
  }

   /**
   * Get isAutoSort
   * @return isAutoSort
  **/
  @ApiModelProperty(value = "")
  public Boolean IsAutoSort() {
    return isAutoSort;
  }

  public void setIsAutoSort(Boolean isAutoSort) {
    this.isAutoSort = isAutoSort;
  }

  public PivotField insertBlankRow(Boolean insertBlankRow) {
    this.insertBlankRow = insertBlankRow;
    return this;
  }

   /**
   * Get insertBlankRow
   * @return insertBlankRow
  **/
  @ApiModelProperty(value = "")
  public Boolean InsertBlankRow() {
    return insertBlankRow;
  }

  public void setInsertBlankRow(Boolean insertBlankRow) {
    this.insertBlankRow = insertBlankRow;
  }

  public PivotField showSubtotalAtTop(Boolean showSubtotalAtTop) {
    this.showSubtotalAtTop = showSubtotalAtTop;
    return this;
  }

   /**
   * Get showSubtotalAtTop
   * @return showSubtotalAtTop
  **/
  @ApiModelProperty(value = "")
  public Boolean ShowSubtotalAtTop() {
    return showSubtotalAtTop;
  }

  public void setShowSubtotalAtTop(Boolean showSubtotalAtTop) {
    this.showSubtotalAtTop = showSubtotalAtTop;
  }

  public PivotField showCompact(Boolean showCompact) {
    this.showCompact = showCompact;
    return this;
  }

   /**
   * Get showCompact
   * @return showCompact
  **/
  @ApiModelProperty(value = "")
  public Boolean ShowCompact() {
    return showCompact;
  }

  public void setShowCompact(Boolean showCompact) {
    this.showCompact = showCompact;
  }

  public PivotField function(String function) {
    this.function = function;
    return this;
  }

   /**
   * Get function
   * @return function
  **/
  @ApiModelProperty(value = "")
  public String getFunction() {
    return function;
  }

  public void setFunction(String function) {
    this.function = function;
  }

  public PivotField isMultipleItemSelectionAllowed(Boolean isMultipleItemSelectionAllowed) {
    this.isMultipleItemSelectionAllowed = isMultipleItemSelectionAllowed;
    return this;
  }

   /**
   * Get isMultipleItemSelectionAllowed
   * @return isMultipleItemSelectionAllowed
  **/
  @ApiModelProperty(value = "")
  public Boolean IsMultipleItemSelectionAllowed() {
    return isMultipleItemSelectionAllowed;
  }

  public void setIsMultipleItemSelectionAllowed(Boolean isMultipleItemSelectionAllowed) {
    this.isMultipleItemSelectionAllowed = isMultipleItemSelectionAllowed;
  }

  public PivotField dataDisplayFormat(String dataDisplayFormat) {
    this.dataDisplayFormat = dataDisplayFormat;
    return this;
  }

   /**
   * Get dataDisplayFormat
   * @return dataDisplayFormat
  **/
  @ApiModelProperty(value = "")
  public String getDataDisplayFormat() {
    return dataDisplayFormat;
  }

  public void setDataDisplayFormat(String dataDisplayFormat) {
    this.dataDisplayFormat = dataDisplayFormat;
  }

  public PivotField baseItemPosition(String baseItemPosition) {
    this.baseItemPosition = baseItemPosition;
    return this;
  }

   /**
   * Get baseItemPosition
   * @return baseItemPosition
  **/
  @ApiModelProperty(value = "")
  public String getBaseItemPosition() {
    return baseItemPosition;
  }

  public void setBaseItemPosition(String baseItemPosition) {
    this.baseItemPosition = baseItemPosition;
  }

  public PivotField isInsertPageBreaksBetweenItems(Boolean isInsertPageBreaksBetweenItems) {
    this.isInsertPageBreaksBetweenItems = isInsertPageBreaksBetweenItems;
    return this;
  }

   /**
   * Get isInsertPageBreaksBetweenItems
   * @return isInsertPageBreaksBetweenItems
  **/
  @ApiModelProperty(value = "")
  public Boolean IsInsertPageBreaksBetweenItems() {
    return isInsertPageBreaksBetweenItems;
  }

  public void setIsInsertPageBreaksBetweenItems(Boolean isInsertPageBreaksBetweenItems) {
    this.isInsertPageBreaksBetweenItems = isInsertPageBreaksBetweenItems;
  }

  public PivotField showAllItems(Boolean showAllItems) {
    this.showAllItems = showAllItems;
    return this;
  }

   /**
   * Get showAllItems
   * @return showAllItems
  **/
  @ApiModelProperty(value = "")
  public Boolean ShowAllItems() {
    return showAllItems;
  }

  public void setShowAllItems(Boolean showAllItems) {
    this.showAllItems = showAllItems;
  }

  public PivotField baseItem(Integer baseItem) {
    this.baseItem = baseItem;
    return this;
  }

   /**
   * Get baseItem
   * @return baseItem
  **/
  @ApiModelProperty(value = "")
  public Integer getBaseItem() {
    return baseItem;
  }

  public void setBaseItem(Integer baseItem) {
    this.baseItem = baseItem;
  }

  public PivotField itemCount(Integer itemCount) {
    this.itemCount = itemCount;
    return this;
  }

   /**
   * Get itemCount
   * @return itemCount
  **/
  @ApiModelProperty(value = "")
  public Integer getItemCount() {
    return itemCount;
  }

  public void setItemCount(Integer itemCount) {
    this.itemCount = itemCount;
  }

  public PivotField name(String name) {
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

  public PivotField showInOutlineForm(Boolean showInOutlineForm) {
    this.showInOutlineForm = showInOutlineForm;
    return this;
  }

   /**
   * Get showInOutlineForm
   * @return showInOutlineForm
  **/
  @ApiModelProperty(value = "")
  public Boolean ShowInOutlineForm() {
    return showInOutlineForm;
  }

  public void setShowInOutlineForm(Boolean showInOutlineForm) {
    this.showInOutlineForm = showInOutlineForm;
  }

  public PivotField items(List<String> items) {
    this.items = items;
    return this;
  }

  public PivotField addItemsItem(String itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(value = "")
  public List<String> getItems() {
    return items;
  }

  public void setItems(List<String> items) {
    this.items = items;
  }

  public PivotField autoShowField(Integer autoShowField) {
    this.autoShowField = autoShowField;
    return this;
  }

   /**
   * Get autoShowField
   * @return autoShowField
  **/
  @ApiModelProperty(value = "")
  public Integer getAutoShowField() {
    return autoShowField;
  }

  public void setAutoShowField(Integer autoShowField) {
    this.autoShowField = autoShowField;
  }

  public PivotField isAutoSubtotals(Boolean isAutoSubtotals) {
    this.isAutoSubtotals = isAutoSubtotals;
    return this;
  }

   /**
   * Get isAutoSubtotals
   * @return isAutoSubtotals
  **/
  @ApiModelProperty(value = "")
  public Boolean IsAutoSubtotals() {
    return isAutoSubtotals;
  }

  public void setIsAutoSubtotals(Boolean isAutoSubtotals) {
    this.isAutoSubtotals = isAutoSubtotals;
  }

  public PivotField isIncludeNewItemsInFilter(Boolean isIncludeNewItemsInFilter) {
    this.isIncludeNewItemsInFilter = isIncludeNewItemsInFilter;
    return this;
  }

   /**
   * Get isIncludeNewItemsInFilter
   * @return isIncludeNewItemsInFilter
  **/
  @ApiModelProperty(value = "")
  public Boolean IsIncludeNewItemsInFilter() {
    return isIncludeNewItemsInFilter;
  }

  public void setIsIncludeNewItemsInFilter(Boolean isIncludeNewItemsInFilter) {
    this.isIncludeNewItemsInFilter = isIncludeNewItemsInFilter;
  }

  public PivotField currentPageItem(Integer currentPageItem) {
    this.currentPageItem = currentPageItem;
    return this;
  }

   /**
   * Get currentPageItem
   * @return currentPageItem
  **/
  @ApiModelProperty(value = "")
  public Integer getCurrentPageItem() {
    return currentPageItem;
  }

  public void setCurrentPageItem(Integer currentPageItem) {
    this.currentPageItem = currentPageItem;
  }

  public PivotField position(Integer position) {
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @ApiModelProperty(value = "")
  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }

  public PivotField isAscendSort(Boolean isAscendSort) {
    this.isAscendSort = isAscendSort;
    return this;
  }

   /**
   * Get isAscendSort
   * @return isAscendSort
  **/
  @ApiModelProperty(value = "")
  public Boolean IsAscendSort() {
    return isAscendSort;
  }

  public void setIsAscendSort(Boolean isAscendSort) {
    this.isAscendSort = isAscendSort;
  }

  public PivotField isAscendShow(Boolean isAscendShow) {
    this.isAscendShow = isAscendShow;
    return this;
  }

   /**
   * Get isAscendShow
   * @return isAscendShow
  **/
  @ApiModelProperty(value = "")
  public Boolean IsAscendShow() {
    return isAscendShow;
  }

  public void setIsAscendShow(Boolean isAscendShow) {
    this.isAscendShow = isAscendShow;
  }

  public PivotField baseField(Integer baseField) {
    this.baseField = baseField;
    return this;
  }

   /**
   * Get baseField
   * @return baseField
  **/
  @ApiModelProperty(value = "")
  public Integer getBaseField() {
    return baseField;
  }

  public void setBaseField(Integer baseField) {
    this.baseField = baseField;
  }

  public PivotField autoSortField(Integer autoSortField) {
    this.autoSortField = autoSortField;
    return this;
  }

   /**
   * Get autoSortField
   * @return autoSortField
  **/
  @ApiModelProperty(value = "")
  public Integer getAutoSortField() {
    return autoSortField;
  }

  public void setAutoSortField(Integer autoSortField) {
    this.autoSortField = autoSortField;
  }

  public PivotField autoShowCount(Integer autoShowCount) {
    this.autoShowCount = autoShowCount;
    return this;
  }

   /**
   * Get autoShowCount
   * @return autoShowCount
  **/
  @ApiModelProperty(value = "")
  public Integer getAutoShowCount() {
    return autoShowCount;
  }

  public void setAutoShowCount(Integer autoShowCount) {
    this.autoShowCount = autoShowCount;
  }

  public PivotField number(Integer number) {
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @ApiModelProperty(value = "")
  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public PivotField dragToPage(Boolean dragToPage) {
    this.dragToPage = dragToPage;
    return this;
  }

   /**
   * Get dragToPage
   * @return dragToPage
  **/
  @ApiModelProperty(value = "")
  public Boolean DragToPage() {
    return dragToPage;
  }

  public void setDragToPage(Boolean dragToPage) {
    this.dragToPage = dragToPage;
  }

  public PivotField dragToData(Boolean dragToData) {
    this.dragToData = dragToData;
    return this;
  }

   /**
   * Get dragToData
   * @return dragToData
  **/
  @ApiModelProperty(value = "")
  public Boolean DragToData() {
    return dragToData;
  }

  public void setDragToData(Boolean dragToData) {
    this.dragToData = dragToData;
  }

  public PivotField baseIndex(Integer baseIndex) {
    this.baseIndex = baseIndex;
    return this;
  }

   /**
   * Get baseIndex
   * @return baseIndex
  **/
  @ApiModelProperty(value = "")
  public Integer getBaseIndex() {
    return baseIndex;
  }

  public void setBaseIndex(Integer baseIndex) {
    this.baseIndex = baseIndex;
  }

  public PivotField originalItems(List<String> originalItems) {
    this.originalItems = originalItems;
    return this;
  }

  public PivotField addOriginalItemsItem(String originalItemsItem) {
    if (this.originalItems == null) {
      this.originalItems = new ArrayList<>();
    }
    this.originalItems.add(originalItemsItem);
    return this;
  }

   /**
   * Get originalItems
   * @return originalItems
  **/
  @ApiModelProperty(value = "")
  public List<String> getOriginalItems() {
    return originalItems;
  }

  public void setOriginalItems(List<String> originalItems) {
    this.originalItems = originalItems;
  }

  public PivotField dragToHide(Boolean dragToHide) {
    this.dragToHide = dragToHide;
    return this;
  }

   /**
   * Get dragToHide
   * @return dragToHide
  **/
  @ApiModelProperty(value = "")
  public Boolean DragToHide() {
    return dragToHide;
  }

  public void setDragToHide(Boolean dragToHide) {
    this.dragToHide = dragToHide;
  }

  public PivotField isCalculatedField(Boolean isCalculatedField) {
    this.isCalculatedField = isCalculatedField;
    return this;
  }

   /**
   * Get isCalculatedField
   * @return isCalculatedField
  **/
  @ApiModelProperty(value = "")
  public Boolean IsCalculatedField() {
    return isCalculatedField;
  }

  public void setIsCalculatedField(Boolean isCalculatedField) {
    this.isCalculatedField = isCalculatedField;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PivotField pivotField = (PivotField) o;
    return Objects.equals(this.pivotItems, pivotField.pivotItems) &&
        Objects.equals(this.displayName, pivotField.displayName) &&
        Objects.equals(this.numberFormat, pivotField.numberFormat) &&
        Objects.equals(this.dragToColumn, pivotField.dragToColumn) &&
        Objects.equals(this.isAutoShow, pivotField.isAutoShow) &&
        Objects.equals(this.isRepeatItemLabels, pivotField.isRepeatItemLabels) &&
        Objects.equals(this.dragToRow, pivotField.dragToRow) &&
        Objects.equals(this.isAutoSort, pivotField.isAutoSort) &&
        Objects.equals(this.insertBlankRow, pivotField.insertBlankRow) &&
        Objects.equals(this.showSubtotalAtTop, pivotField.showSubtotalAtTop) &&
        Objects.equals(this.showCompact, pivotField.showCompact) &&
        Objects.equals(this.function, pivotField.function) &&
        Objects.equals(this.isMultipleItemSelectionAllowed, pivotField.isMultipleItemSelectionAllowed) &&
        Objects.equals(this.dataDisplayFormat, pivotField.dataDisplayFormat) &&
        Objects.equals(this.baseItemPosition, pivotField.baseItemPosition) &&
        Objects.equals(this.isInsertPageBreaksBetweenItems, pivotField.isInsertPageBreaksBetweenItems) &&
        Objects.equals(this.showAllItems, pivotField.showAllItems) &&
        Objects.equals(this.baseItem, pivotField.baseItem) &&
        Objects.equals(this.itemCount, pivotField.itemCount) &&
        Objects.equals(this.name, pivotField.name) &&
        Objects.equals(this.showInOutlineForm, pivotField.showInOutlineForm) &&
        Objects.equals(this.items, pivotField.items) &&
        Objects.equals(this.autoShowField, pivotField.autoShowField) &&
        Objects.equals(this.isAutoSubtotals, pivotField.isAutoSubtotals) &&
        Objects.equals(this.isIncludeNewItemsInFilter, pivotField.isIncludeNewItemsInFilter) &&
        Objects.equals(this.currentPageItem, pivotField.currentPageItem) &&
        Objects.equals(this.position, pivotField.position) &&
        Objects.equals(this.isAscendSort, pivotField.isAscendSort) &&
        Objects.equals(this.isAscendShow, pivotField.isAscendShow) &&
        Objects.equals(this.baseField, pivotField.baseField) &&
        Objects.equals(this.autoSortField, pivotField.autoSortField) &&
        Objects.equals(this.autoShowCount, pivotField.autoShowCount) &&
        Objects.equals(this.number, pivotField.number) &&
        Objects.equals(this.dragToPage, pivotField.dragToPage) &&
        Objects.equals(this.dragToData, pivotField.dragToData) &&
        Objects.equals(this.baseIndex, pivotField.baseIndex) &&
        Objects.equals(this.originalItems, pivotField.originalItems) &&
        Objects.equals(this.dragToHide, pivotField.dragToHide) &&
        Objects.equals(this.isCalculatedField, pivotField.isCalculatedField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pivotItems, displayName, numberFormat, dragToColumn, isAutoShow, isRepeatItemLabels, dragToRow, isAutoSort, insertBlankRow, showSubtotalAtTop, showCompact, function, isMultipleItemSelectionAllowed, dataDisplayFormat, baseItemPosition, isInsertPageBreaksBetweenItems, showAllItems, baseItem, itemCount, name, showInOutlineForm, items, autoShowField, isAutoSubtotals, isIncludeNewItemsInFilter, currentPageItem, position, isAscendSort, isAscendShow, baseField, autoSortField, autoShowCount, number, dragToPage, dragToData, baseIndex, originalItems, dragToHide, isCalculatedField);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PivotField {\n");
    
    sb.append("    pivotItems: ").append(toIndentedString(pivotItems)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    numberFormat: ").append(toIndentedString(numberFormat)).append("\n");
    sb.append("    dragToColumn: ").append(toIndentedString(dragToColumn)).append("\n");
    sb.append("    isAutoShow: ").append(toIndentedString(isAutoShow)).append("\n");
    sb.append("    isRepeatItemLabels: ").append(toIndentedString(isRepeatItemLabels)).append("\n");
    sb.append("    dragToRow: ").append(toIndentedString(dragToRow)).append("\n");
    sb.append("    isAutoSort: ").append(toIndentedString(isAutoSort)).append("\n");
    sb.append("    insertBlankRow: ").append(toIndentedString(insertBlankRow)).append("\n");
    sb.append("    showSubtotalAtTop: ").append(toIndentedString(showSubtotalAtTop)).append("\n");
    sb.append("    showCompact: ").append(toIndentedString(showCompact)).append("\n");
    sb.append("    function: ").append(toIndentedString(function)).append("\n");
    sb.append("    isMultipleItemSelectionAllowed: ").append(toIndentedString(isMultipleItemSelectionAllowed)).append("\n");
    sb.append("    dataDisplayFormat: ").append(toIndentedString(dataDisplayFormat)).append("\n");
    sb.append("    baseItemPosition: ").append(toIndentedString(baseItemPosition)).append("\n");
    sb.append("    isInsertPageBreaksBetweenItems: ").append(toIndentedString(isInsertPageBreaksBetweenItems)).append("\n");
    sb.append("    showAllItems: ").append(toIndentedString(showAllItems)).append("\n");
    sb.append("    baseItem: ").append(toIndentedString(baseItem)).append("\n");
    sb.append("    itemCount: ").append(toIndentedString(itemCount)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    showInOutlineForm: ").append(toIndentedString(showInOutlineForm)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    autoShowField: ").append(toIndentedString(autoShowField)).append("\n");
    sb.append("    isAutoSubtotals: ").append(toIndentedString(isAutoSubtotals)).append("\n");
    sb.append("    isIncludeNewItemsInFilter: ").append(toIndentedString(isIncludeNewItemsInFilter)).append("\n");
    sb.append("    currentPageItem: ").append(toIndentedString(currentPageItem)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    isAscendSort: ").append(toIndentedString(isAscendSort)).append("\n");
    sb.append("    isAscendShow: ").append(toIndentedString(isAscendShow)).append("\n");
    sb.append("    baseField: ").append(toIndentedString(baseField)).append("\n");
    sb.append("    autoSortField: ").append(toIndentedString(autoSortField)).append("\n");
    sb.append("    autoShowCount: ").append(toIndentedString(autoShowCount)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    dragToPage: ").append(toIndentedString(dragToPage)).append("\n");
    sb.append("    dragToData: ").append(toIndentedString(dragToData)).append("\n");
    sb.append("    baseIndex: ").append(toIndentedString(baseIndex)).append("\n");
    sb.append("    originalItems: ").append(toIndentedString(originalItems)).append("\n");
    sb.append("    dragToHide: ").append(toIndentedString(dragToHide)).append("\n");
    sb.append("    isCalculatedField: ").append(toIndentedString(isCalculatedField)).append("\n");
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

