/* 
 * <summary>
 *  Copyright (c) 2020 Aspose.Cells Cloud
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
 * Encapsulates the object that represents a single Workbook cell.
 */
@ApiModel(description = "Encapsulates the object that represents a single Workbook cell.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-18T15:44:17.049+08:00")
public class Cell {
  @SerializedName("link")
  private Link link = null;

  @SerializedName("Style")
  private LinkElement style = null;

  @SerializedName("HtmlString")
  private String htmlString = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Column")
  private Integer column = null;

  @SerializedName("Worksheet")
  private String worksheet = null;

  @SerializedName("IsInTable")
  private Boolean isInTable = null;

  @SerializedName("IsArrayHeader")
  private Boolean isArrayHeader = null;

  @SerializedName("Value")
  private String value = null;

  @SerializedName("IsFormula")
  private Boolean isFormula = null;

  @SerializedName("IsStyleSet")
  private Boolean isStyleSet = null;

  @SerializedName("IsInArray")
  private Boolean isInArray = null;

  @SerializedName("IsErrorValue")
  private Boolean isErrorValue = null;

  @SerializedName("IsMerged")
  private Boolean isMerged = null;

  @SerializedName("Formula")
  private String formula = null;

  @SerializedName("Type")
  private String type = null;

  @SerializedName("Row")
  private Integer row = null;

  public Cell link(Link link) {
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

  public Cell style(LinkElement style) {
    this.style = style;
    return this;
  }

   /**
   * Get style
   * @return style
  **/
  @ApiModelProperty(value = "")
  public LinkElement getStyle() {
    return style;
  }

  public void setStyle(LinkElement style) {
    this.style = style;
  }

  public Cell htmlString(String htmlString) {
    this.htmlString = htmlString;
    return this;
  }

   /**
   * Gets and sets the html string which contains data and some formattings in this cell.             
   * @return htmlString
  **/
  @ApiModelProperty(value = "Gets and sets the html string which contains data and some formattings in this cell.             ")
  public String getHtmlString() {
    return htmlString;
  }

  public void setHtmlString(String htmlString) {
    this.htmlString = htmlString;
  }

  public Cell name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Gets the name of the cell.             
   * @return name
  **/
  @ApiModelProperty(value = "Gets the name of the cell.             ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Cell column(Integer column) {
    this.column = column;
    return this;
  }

   /**
   * Gets column number (zero based) of the cell.             
   * @return column
  **/
  @ApiModelProperty(required = true, value = "Gets column number (zero based) of the cell.             ")
  public Integer getColumn() {
    return column;
  }

  public void setColumn(Integer column) {
    this.column = column;
  }

  public Cell worksheet(String worksheet) {
    this.worksheet = worksheet;
    return this;
  }

   /**
   * Gets the parent worksheet.
   * @return worksheet
  **/
  @ApiModelProperty(value = "Gets the parent worksheet.")
  public String getWorksheet() {
    return worksheet;
  }

  public void setWorksheet(String worksheet) {
    this.worksheet = worksheet;
  }

  public Cell isInTable(Boolean isInTable) {
    this.isInTable = isInTable;
    return this;
  }

   /**
   * Indicates whethe this cell is part of table formula.             
   * @return isInTable
  **/
  @ApiModelProperty(required = true, value = "Indicates whethe this cell is part of table formula.             ")
  public Boolean IsInTable() {
    return isInTable;
  }

  public void setIsInTable(Boolean isInTable) {
    this.isInTable = isInTable;
  }

  public Cell isArrayHeader(Boolean isArrayHeader) {
    this.isArrayHeader = isArrayHeader;
    return this;
  }

   /**
   * Inidicates the cell&#39;s formula is and array formula and it is the first cell of the array.
   * @return isArrayHeader
  **/
  @ApiModelProperty(required = true, value = "Inidicates the cell's formula is and array formula and it is the first cell of the array.")
  public Boolean IsArrayHeader() {
    return isArrayHeader;
  }

  public void setIsArrayHeader(Boolean isArrayHeader) {
    this.isArrayHeader = isArrayHeader;
  }

  public Cell value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public Cell isFormula(Boolean isFormula) {
    this.isFormula = isFormula;
    return this;
  }

   /**
   * Represents if the specified cell contains formula.             
   * @return isFormula
  **/
  @ApiModelProperty(required = true, value = "Represents if the specified cell contains formula.             ")
  public Boolean IsFormula() {
    return isFormula;
  }

  public void setIsFormula(Boolean isFormula) {
    this.isFormula = isFormula;
  }

  public Cell isStyleSet(Boolean isStyleSet) {
    this.isStyleSet = isStyleSet;
    return this;
  }

   /**
   * Indicates if the cell&#39;s style is set. If return false, it means this cell has a default cell format.             
   * @return isStyleSet
  **/
  @ApiModelProperty(required = true, value = "Indicates if the cell's style is set. If return false, it means this cell has a default cell format.             ")
  public Boolean IsStyleSet() {
    return isStyleSet;
  }

  public void setIsStyleSet(Boolean isStyleSet) {
    this.isStyleSet = isStyleSet;
  }

  public Cell isInArray(Boolean isInArray) {
    this.isInArray = isInArray;
    return this;
  }

   /**
   * Indicates whether the cell formula is an array formula.
   * @return isInArray
  **/
  @ApiModelProperty(required = true, value = "Indicates whether the cell formula is an array formula.")
  public Boolean IsInArray() {
    return isInArray;
  }

  public void setIsInArray(Boolean isInArray) {
    this.isInArray = isInArray;
  }

  public Cell isErrorValue(Boolean isErrorValue) {
    this.isErrorValue = isErrorValue;
    return this;
  }

   /**
   * Checks if a formula can properly evaluate a result.             
   * @return isErrorValue
  **/
  @ApiModelProperty(required = true, value = "Checks if a formula can properly evaluate a result.             ")
  public Boolean IsErrorValue() {
    return isErrorValue;
  }

  public void setIsErrorValue(Boolean isErrorValue) {
    this.isErrorValue = isErrorValue;
  }

  public Cell isMerged(Boolean isMerged) {
    this.isMerged = isMerged;
    return this;
  }

   /**
   * Checks if a cell is part of a merged range or not.             
   * @return isMerged
  **/
  @ApiModelProperty(required = true, value = "Checks if a cell is part of a merged range or not.             ")
  public Boolean IsMerged() {
    return isMerged;
  }

  public void setIsMerged(Boolean isMerged) {
    this.isMerged = isMerged;
  }

  public Cell formula(String formula) {
    this.formula = formula;
    return this;
  }

   /**
   * Gets or sets a formula of the Aspose.Cells.Cell.
   * @return formula
  **/
  @ApiModelProperty(value = "Gets or sets a formula of the Aspose.Cells.Cell.")
  public String getFormula() {
    return formula;
  }

  public void setFormula(String formula) {
    this.formula = formula;
  }

  public Cell type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Specifies a cell value type.
   * @return type
  **/
  @ApiModelProperty(value = "Specifies a cell value type.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Cell row(Integer row) {
    this.row = row;
    return this;
  }

   /**
   * Gets row number (zero based) of the cell.             
   * @return row
  **/
  @ApiModelProperty(required = true, value = "Gets row number (zero based) of the cell.             ")
  public Integer getRow() {
    return row;
  }

  public void setRow(Integer row) {
    this.row = row;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cell cell = (Cell) o;
    return Objects.equals(this.link, cell.link) &&
        Objects.equals(this.style, cell.style) &&
        Objects.equals(this.htmlString, cell.htmlString) &&
        Objects.equals(this.name, cell.name) &&
        Objects.equals(this.column, cell.column) &&
        Objects.equals(this.worksheet, cell.worksheet) &&
        Objects.equals(this.isInTable, cell.isInTable) &&
        Objects.equals(this.isArrayHeader, cell.isArrayHeader) &&
        Objects.equals(this.value, cell.value) &&
        Objects.equals(this.isFormula, cell.isFormula) &&
        Objects.equals(this.isStyleSet, cell.isStyleSet) &&
        Objects.equals(this.isInArray, cell.isInArray) &&
        Objects.equals(this.isErrorValue, cell.isErrorValue) &&
        Objects.equals(this.isMerged, cell.isMerged) &&
        Objects.equals(this.formula, cell.formula) &&
        Objects.equals(this.type, cell.type) &&
        Objects.equals(this.row, cell.row);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, style, htmlString, name, column, worksheet, isInTable, isArrayHeader, value, isFormula, isStyleSet, isInArray, isErrorValue, isMerged, formula, type, row);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cell {\n");
    
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
    sb.append("    htmlString: ").append(toIndentedString(htmlString)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    column: ").append(toIndentedString(column)).append("\n");
    sb.append("    worksheet: ").append(toIndentedString(worksheet)).append("\n");
    sb.append("    isInTable: ").append(toIndentedString(isInTable)).append("\n");
    sb.append("    isArrayHeader: ").append(toIndentedString(isArrayHeader)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    isFormula: ").append(toIndentedString(isFormula)).append("\n");
    sb.append("    isStyleSet: ").append(toIndentedString(isStyleSet)).append("\n");
    sb.append("    isInArray: ").append(toIndentedString(isInArray)).append("\n");
    sb.append("    isErrorValue: ").append(toIndentedString(isErrorValue)).append("\n");
    sb.append("    isMerged: ").append(toIndentedString(isMerged)).append("\n");
    sb.append("    formula: ").append(toIndentedString(formula)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    row: ").append(toIndentedString(row)).append("\n");
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

