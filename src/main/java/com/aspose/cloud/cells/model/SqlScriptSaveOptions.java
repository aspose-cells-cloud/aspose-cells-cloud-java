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
import com.aspose.cloud.cells.model.SaveOptions;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SqlScriptSaveOptions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-25T00:46:02.627-05:00")
public class SqlScriptSaveOptions extends SaveOptions {
  @SerializedName("CheckIfTableExists")
  private Boolean checkIfTableExists = null;

  @SerializedName("ColumnTypeMap")
  private String columnTypeMap = null;

  @SerializedName("CheckAllDataForColumnType")
  private Boolean checkAllDataForColumnType = null;

  @SerializedName("AddBlankLineBetweenRows")
  private Boolean addBlankLineBetweenRows = null;

  @SerializedName("OperatorType")
  private String operatorType = null;

  @SerializedName("CreateTable")
  private Boolean createTable = null;

  @SerializedName("IdName")
  private String idName = null;

  @SerializedName("StartId")
  private Integer startId = null;

  @SerializedName("TableName")
  private String tableName = null;

  @SerializedName("ExportAsString")
  private Boolean exportAsString = null;

  @SerializedName("ExportArea")
  private CellArea exportArea = null;

  @SerializedName("HasHeaderRow")
  private Boolean hasHeaderRow = null;

  public SqlScriptSaveOptions checkIfTableExists(Boolean checkIfTableExists) {
    this.checkIfTableExists = checkIfTableExists;
    return this;
  }

   /**
   * Get checkIfTableExists
   * @return checkIfTableExists
  **/
  @ApiModelProperty(value = "")
  public Boolean CheckIfTableExists() {
    return checkIfTableExists;
  }

  public void setCheckIfTableExists(Boolean checkIfTableExists) {
    this.checkIfTableExists = checkIfTableExists;
  }

  public SqlScriptSaveOptions columnTypeMap(String columnTypeMap) {
    this.columnTypeMap = columnTypeMap;
    return this;
  }

   /**
   * Get columnTypeMap
   * @return columnTypeMap
  **/
  @ApiModelProperty(value = "")
  public String getColumnTypeMap() {
    return columnTypeMap;
  }

  public void setColumnTypeMap(String columnTypeMap) {
    this.columnTypeMap = columnTypeMap;
  }

  public SqlScriptSaveOptions checkAllDataForColumnType(Boolean checkAllDataForColumnType) {
    this.checkAllDataForColumnType = checkAllDataForColumnType;
    return this;
  }

   /**
   * Get checkAllDataForColumnType
   * @return checkAllDataForColumnType
  **/
  @ApiModelProperty(value = "")
  public Boolean CheckAllDataForColumnType() {
    return checkAllDataForColumnType;
  }

  public void setCheckAllDataForColumnType(Boolean checkAllDataForColumnType) {
    this.checkAllDataForColumnType = checkAllDataForColumnType;
  }

  public SqlScriptSaveOptions addBlankLineBetweenRows(Boolean addBlankLineBetweenRows) {
    this.addBlankLineBetweenRows = addBlankLineBetweenRows;
    return this;
  }

   /**
   * Get addBlankLineBetweenRows
   * @return addBlankLineBetweenRows
  **/
  @ApiModelProperty(value = "")
  public Boolean AddBlankLineBetweenRows() {
    return addBlankLineBetweenRows;
  }

  public void setAddBlankLineBetweenRows(Boolean addBlankLineBetweenRows) {
    this.addBlankLineBetweenRows = addBlankLineBetweenRows;
  }

  public SqlScriptSaveOptions operatorType(String operatorType) {
    this.operatorType = operatorType;
    return this;
  }

   /**
   * Get operatorType
   * @return operatorType
  **/
  @ApiModelProperty(value = "")
  public String getOperatorType() {
    return operatorType;
  }

  public void setOperatorType(String operatorType) {
    this.operatorType = operatorType;
  }

  public SqlScriptSaveOptions createTable(Boolean createTable) {
    this.createTable = createTable;
    return this;
  }

   /**
   * Get createTable
   * @return createTable
  **/
  @ApiModelProperty(value = "")
  public Boolean CreateTable() {
    return createTable;
  }

  public void setCreateTable(Boolean createTable) {
    this.createTable = createTable;
  }

  public SqlScriptSaveOptions idName(String idName) {
    this.idName = idName;
    return this;
  }

   /**
   * Get idName
   * @return idName
  **/
  @ApiModelProperty(value = "")
  public String getIdName() {
    return idName;
  }

  public void setIdName(String idName) {
    this.idName = idName;
  }

  public SqlScriptSaveOptions startId(Integer startId) {
    this.startId = startId;
    return this;
  }

   /**
   * Get startId
   * @return startId
  **/
  @ApiModelProperty(value = "")
  public Integer getStartId() {
    return startId;
  }

  public void setStartId(Integer startId) {
    this.startId = startId;
  }

  public SqlScriptSaveOptions tableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

   /**
   * Get tableName
   * @return tableName
  **/
  @ApiModelProperty(value = "")
  public String getTableName() {
    return tableName;
  }

  public void setTableName(String tableName) {
    this.tableName = tableName;
  }

  public SqlScriptSaveOptions exportAsString(Boolean exportAsString) {
    this.exportAsString = exportAsString;
    return this;
  }

   /**
   * Get exportAsString
   * @return exportAsString
  **/
  @ApiModelProperty(value = "")
  public Boolean ExportAsString() {
    return exportAsString;
  }

  public void setExportAsString(Boolean exportAsString) {
    this.exportAsString = exportAsString;
  }

  public SqlScriptSaveOptions exportArea(CellArea exportArea) {
    this.exportArea = exportArea;
    return this;
  }

   /**
   * Get exportArea
   * @return exportArea
  **/
  @ApiModelProperty(value = "")
  public CellArea getExportArea() {
    return exportArea;
  }

  public void setExportArea(CellArea exportArea) {
    this.exportArea = exportArea;
  }

  public SqlScriptSaveOptions hasHeaderRow(Boolean hasHeaderRow) {
    this.hasHeaderRow = hasHeaderRow;
    return this;
  }

   /**
   * Get hasHeaderRow
   * @return hasHeaderRow
  **/
  @ApiModelProperty(value = "")
  public Boolean HasHeaderRow() {
    return hasHeaderRow;
  }

  public void setHasHeaderRow(Boolean hasHeaderRow) {
    this.hasHeaderRow = hasHeaderRow;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SqlScriptSaveOptions sqlScriptSaveOptions = (SqlScriptSaveOptions) o;
    return Objects.equals(this.checkIfTableExists, sqlScriptSaveOptions.checkIfTableExists) &&
        Objects.equals(this.columnTypeMap, sqlScriptSaveOptions.columnTypeMap) &&
        Objects.equals(this.checkAllDataForColumnType, sqlScriptSaveOptions.checkAllDataForColumnType) &&
        Objects.equals(this.addBlankLineBetweenRows, sqlScriptSaveOptions.addBlankLineBetweenRows) &&
        Objects.equals(this.operatorType, sqlScriptSaveOptions.operatorType) &&
        Objects.equals(this.createTable, sqlScriptSaveOptions.createTable) &&
        Objects.equals(this.idName, sqlScriptSaveOptions.idName) &&
        Objects.equals(this.startId, sqlScriptSaveOptions.startId) &&
        Objects.equals(this.tableName, sqlScriptSaveOptions.tableName) &&
        Objects.equals(this.exportAsString, sqlScriptSaveOptions.exportAsString) &&
        Objects.equals(this.exportArea, sqlScriptSaveOptions.exportArea) &&
        Objects.equals(this.hasHeaderRow, sqlScriptSaveOptions.hasHeaderRow) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkIfTableExists, columnTypeMap, checkAllDataForColumnType, addBlankLineBetweenRows, operatorType, createTable, idName, startId, tableName, exportAsString, exportArea, hasHeaderRow, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SqlScriptSaveOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    checkIfTableExists: ").append(toIndentedString(checkIfTableExists)).append("\n");
    sb.append("    columnTypeMap: ").append(toIndentedString(columnTypeMap)).append("\n");
    sb.append("    checkAllDataForColumnType: ").append(toIndentedString(checkAllDataForColumnType)).append("\n");
    sb.append("    addBlankLineBetweenRows: ").append(toIndentedString(addBlankLineBetweenRows)).append("\n");
    sb.append("    operatorType: ").append(toIndentedString(operatorType)).append("\n");
    sb.append("    createTable: ").append(toIndentedString(createTable)).append("\n");
    sb.append("    idName: ").append(toIndentedString(idName)).append("\n");
    sb.append("    startId: ").append(toIndentedString(startId)).append("\n");
    sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
    sb.append("    exportAsString: ").append(toIndentedString(exportAsString)).append("\n");
    sb.append("    exportArea: ").append(toIndentedString(exportArea)).append("\n");
    sb.append("    hasHeaderRow: ").append(toIndentedString(hasHeaderRow)).append("\n");
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

