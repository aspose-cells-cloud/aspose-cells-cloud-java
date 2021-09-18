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
 * ProtectSheetParameter
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-09-17T23:42:04.472-05:00")
public class ProtectSheetParameter {
  @SerializedName("AllowSelectingUnlockedCell")
  private String allowSelectingUnlockedCell = null;

  @SerializedName("AllowFiltering")
  private String allowFiltering = null;

  @SerializedName("AllowDeletingColumn")
  private String allowDeletingColumn = null;

  @SerializedName("AllowSelectingLockedCell")
  private String allowSelectingLockedCell = null;

  @SerializedName("AllowUsingPivotTable")
  private String allowUsingPivotTable = null;

  @SerializedName("AllowEditArea")
  private List<String> allowEditArea = null;

  @SerializedName("AllowInsertingHyperlink")
  private String allowInsertingHyperlink = null;

  @SerializedName("AllowFormattingCell")
  private String allowFormattingCell = null;

  @SerializedName("AllowFormattingRow")
  private String allowFormattingRow = null;

  @SerializedName("AllowInsertingRow")
  private String allowInsertingRow = null;

  @SerializedName("AllowFormattingColumn")
  private String allowFormattingColumn = null;

  @SerializedName("AllowSorting")
  private String allowSorting = null;

  @SerializedName("AllowInsertingColumn")
  private String allowInsertingColumn = null;

  @SerializedName("Password")
  private String password = null;

  @SerializedName("AllowDeletingRow")
  private String allowDeletingRow = null;

  @SerializedName("ProtectionType")
  private String protectionType = null;

  public ProtectSheetParameter allowSelectingUnlockedCell(String allowSelectingUnlockedCell) {
    this.allowSelectingUnlockedCell = allowSelectingUnlockedCell;
    return this;
  }

   /**
   * Get allowSelectingUnlockedCell
   * @return allowSelectingUnlockedCell
  **/
  @ApiModelProperty(value = "")
  public String getAllowSelectingUnlockedCell() {
    return allowSelectingUnlockedCell;
  }

  public void setAllowSelectingUnlockedCell(String allowSelectingUnlockedCell) {
    this.allowSelectingUnlockedCell = allowSelectingUnlockedCell;
  }

  public ProtectSheetParameter allowFiltering(String allowFiltering) {
    this.allowFiltering = allowFiltering;
    return this;
  }

   /**
   * Get allowFiltering
   * @return allowFiltering
  **/
  @ApiModelProperty(value = "")
  public String getAllowFiltering() {
    return allowFiltering;
  }

  public void setAllowFiltering(String allowFiltering) {
    this.allowFiltering = allowFiltering;
  }

  public ProtectSheetParameter allowDeletingColumn(String allowDeletingColumn) {
    this.allowDeletingColumn = allowDeletingColumn;
    return this;
  }

   /**
   * Get allowDeletingColumn
   * @return allowDeletingColumn
  **/
  @ApiModelProperty(value = "")
  public String getAllowDeletingColumn() {
    return allowDeletingColumn;
  }

  public void setAllowDeletingColumn(String allowDeletingColumn) {
    this.allowDeletingColumn = allowDeletingColumn;
  }

  public ProtectSheetParameter allowSelectingLockedCell(String allowSelectingLockedCell) {
    this.allowSelectingLockedCell = allowSelectingLockedCell;
    return this;
  }

   /**
   * Get allowSelectingLockedCell
   * @return allowSelectingLockedCell
  **/
  @ApiModelProperty(value = "")
  public String getAllowSelectingLockedCell() {
    return allowSelectingLockedCell;
  }

  public void setAllowSelectingLockedCell(String allowSelectingLockedCell) {
    this.allowSelectingLockedCell = allowSelectingLockedCell;
  }

  public ProtectSheetParameter allowUsingPivotTable(String allowUsingPivotTable) {
    this.allowUsingPivotTable = allowUsingPivotTable;
    return this;
  }

   /**
   * Get allowUsingPivotTable
   * @return allowUsingPivotTable
  **/
  @ApiModelProperty(value = "")
  public String getAllowUsingPivotTable() {
    return allowUsingPivotTable;
  }

  public void setAllowUsingPivotTable(String allowUsingPivotTable) {
    this.allowUsingPivotTable = allowUsingPivotTable;
  }

  public ProtectSheetParameter allowEditArea(List<String> allowEditArea) {
    this.allowEditArea = allowEditArea;
    return this;
  }

  public ProtectSheetParameter addAllowEditAreaItem(String allowEditAreaItem) {
    if (this.allowEditArea == null) {
      this.allowEditArea = new ArrayList<>();
    }
    this.allowEditArea.add(allowEditAreaItem);
    return this;
  }

   /**
   * Get allowEditArea
   * @return allowEditArea
  **/
  @ApiModelProperty(value = "")
  public List<String> getAllowEditArea() {
    return allowEditArea;
  }

  public void setAllowEditArea(List<String> allowEditArea) {
    this.allowEditArea = allowEditArea;
  }

  public ProtectSheetParameter allowInsertingHyperlink(String allowInsertingHyperlink) {
    this.allowInsertingHyperlink = allowInsertingHyperlink;
    return this;
  }

   /**
   * Get allowInsertingHyperlink
   * @return allowInsertingHyperlink
  **/
  @ApiModelProperty(value = "")
  public String getAllowInsertingHyperlink() {
    return allowInsertingHyperlink;
  }

  public void setAllowInsertingHyperlink(String allowInsertingHyperlink) {
    this.allowInsertingHyperlink = allowInsertingHyperlink;
  }

  public ProtectSheetParameter allowFormattingCell(String allowFormattingCell) {
    this.allowFormattingCell = allowFormattingCell;
    return this;
  }

   /**
   * Get allowFormattingCell
   * @return allowFormattingCell
  **/
  @ApiModelProperty(value = "")
  public String getAllowFormattingCell() {
    return allowFormattingCell;
  }

  public void setAllowFormattingCell(String allowFormattingCell) {
    this.allowFormattingCell = allowFormattingCell;
  }

  public ProtectSheetParameter allowFormattingRow(String allowFormattingRow) {
    this.allowFormattingRow = allowFormattingRow;
    return this;
  }

   /**
   * Get allowFormattingRow
   * @return allowFormattingRow
  **/
  @ApiModelProperty(value = "")
  public String getAllowFormattingRow() {
    return allowFormattingRow;
  }

  public void setAllowFormattingRow(String allowFormattingRow) {
    this.allowFormattingRow = allowFormattingRow;
  }

  public ProtectSheetParameter allowInsertingRow(String allowInsertingRow) {
    this.allowInsertingRow = allowInsertingRow;
    return this;
  }

   /**
   * Get allowInsertingRow
   * @return allowInsertingRow
  **/
  @ApiModelProperty(value = "")
  public String getAllowInsertingRow() {
    return allowInsertingRow;
  }

  public void setAllowInsertingRow(String allowInsertingRow) {
    this.allowInsertingRow = allowInsertingRow;
  }

  public ProtectSheetParameter allowFormattingColumn(String allowFormattingColumn) {
    this.allowFormattingColumn = allowFormattingColumn;
    return this;
  }

   /**
   * Get allowFormattingColumn
   * @return allowFormattingColumn
  **/
  @ApiModelProperty(value = "")
  public String getAllowFormattingColumn() {
    return allowFormattingColumn;
  }

  public void setAllowFormattingColumn(String allowFormattingColumn) {
    this.allowFormattingColumn = allowFormattingColumn;
  }

  public ProtectSheetParameter allowSorting(String allowSorting) {
    this.allowSorting = allowSorting;
    return this;
  }

   /**
   * Get allowSorting
   * @return allowSorting
  **/
  @ApiModelProperty(value = "")
  public String getAllowSorting() {
    return allowSorting;
  }

  public void setAllowSorting(String allowSorting) {
    this.allowSorting = allowSorting;
  }

  public ProtectSheetParameter allowInsertingColumn(String allowInsertingColumn) {
    this.allowInsertingColumn = allowInsertingColumn;
    return this;
  }

   /**
   * Get allowInsertingColumn
   * @return allowInsertingColumn
  **/
  @ApiModelProperty(value = "")
  public String getAllowInsertingColumn() {
    return allowInsertingColumn;
  }

  public void setAllowInsertingColumn(String allowInsertingColumn) {
    this.allowInsertingColumn = allowInsertingColumn;
  }

  public ProtectSheetParameter password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @ApiModelProperty(value = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public ProtectSheetParameter allowDeletingRow(String allowDeletingRow) {
    this.allowDeletingRow = allowDeletingRow;
    return this;
  }

   /**
   * Get allowDeletingRow
   * @return allowDeletingRow
  **/
  @ApiModelProperty(value = "")
  public String getAllowDeletingRow() {
    return allowDeletingRow;
  }

  public void setAllowDeletingRow(String allowDeletingRow) {
    this.allowDeletingRow = allowDeletingRow;
  }

  public ProtectSheetParameter protectionType(String protectionType) {
    this.protectionType = protectionType;
    return this;
  }

   /**
   * Get protectionType
   * @return protectionType
  **/
  @ApiModelProperty(value = "")
  public String getProtectionType() {
    return protectionType;
  }

  public void setProtectionType(String protectionType) {
    this.protectionType = protectionType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProtectSheetParameter protectSheetParameter = (ProtectSheetParameter) o;
    return Objects.equals(this.allowSelectingUnlockedCell, protectSheetParameter.allowSelectingUnlockedCell) &&
        Objects.equals(this.allowFiltering, protectSheetParameter.allowFiltering) &&
        Objects.equals(this.allowDeletingColumn, protectSheetParameter.allowDeletingColumn) &&
        Objects.equals(this.allowSelectingLockedCell, protectSheetParameter.allowSelectingLockedCell) &&
        Objects.equals(this.allowUsingPivotTable, protectSheetParameter.allowUsingPivotTable) &&
        Objects.equals(this.allowEditArea, protectSheetParameter.allowEditArea) &&
        Objects.equals(this.allowInsertingHyperlink, protectSheetParameter.allowInsertingHyperlink) &&
        Objects.equals(this.allowFormattingCell, protectSheetParameter.allowFormattingCell) &&
        Objects.equals(this.allowFormattingRow, protectSheetParameter.allowFormattingRow) &&
        Objects.equals(this.allowInsertingRow, protectSheetParameter.allowInsertingRow) &&
        Objects.equals(this.allowFormattingColumn, protectSheetParameter.allowFormattingColumn) &&
        Objects.equals(this.allowSorting, protectSheetParameter.allowSorting) &&
        Objects.equals(this.allowInsertingColumn, protectSheetParameter.allowInsertingColumn) &&
        Objects.equals(this.password, protectSheetParameter.password) &&
        Objects.equals(this.allowDeletingRow, protectSheetParameter.allowDeletingRow) &&
        Objects.equals(this.protectionType, protectSheetParameter.protectionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowSelectingUnlockedCell, allowFiltering, allowDeletingColumn, allowSelectingLockedCell, allowUsingPivotTable, allowEditArea, allowInsertingHyperlink, allowFormattingCell, allowFormattingRow, allowInsertingRow, allowFormattingColumn, allowSorting, allowInsertingColumn, password, allowDeletingRow, protectionType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProtectSheetParameter {\n");
    
    sb.append("    allowSelectingUnlockedCell: ").append(toIndentedString(allowSelectingUnlockedCell)).append("\n");
    sb.append("    allowFiltering: ").append(toIndentedString(allowFiltering)).append("\n");
    sb.append("    allowDeletingColumn: ").append(toIndentedString(allowDeletingColumn)).append("\n");
    sb.append("    allowSelectingLockedCell: ").append(toIndentedString(allowSelectingLockedCell)).append("\n");
    sb.append("    allowUsingPivotTable: ").append(toIndentedString(allowUsingPivotTable)).append("\n");
    sb.append("    allowEditArea: ").append(toIndentedString(allowEditArea)).append("\n");
    sb.append("    allowInsertingHyperlink: ").append(toIndentedString(allowInsertingHyperlink)).append("\n");
    sb.append("    allowFormattingCell: ").append(toIndentedString(allowFormattingCell)).append("\n");
    sb.append("    allowFormattingRow: ").append(toIndentedString(allowFormattingRow)).append("\n");
    sb.append("    allowInsertingRow: ").append(toIndentedString(allowInsertingRow)).append("\n");
    sb.append("    allowFormattingColumn: ").append(toIndentedString(allowFormattingColumn)).append("\n");
    sb.append("    allowSorting: ").append(toIndentedString(allowSorting)).append("\n");
    sb.append("    allowInsertingColumn: ").append(toIndentedString(allowInsertingColumn)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    allowDeletingRow: ").append(toIndentedString(allowDeletingRow)).append("\n");
    sb.append("    protectionType: ").append(toIndentedString(protectionType)).append("\n");
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

