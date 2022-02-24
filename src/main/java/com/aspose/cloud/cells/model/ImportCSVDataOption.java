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
import com.aspose.cloud.cells.model.CustomParserConfig;
import com.aspose.cloud.cells.model.FileSource;
import com.aspose.cloud.cells.model.ImportOption;
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
 * ImportCSVDataOption
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-21T07:23:23.400-06:00")
public class ImportCSVDataOption extends ImportOption {
  @SerializedName("ConvertNumericData")
  private Boolean convertNumericData = null;

  @SerializedName("FirstColumn")
  private Integer firstColumn = null;

  @SerializedName("SourceFile")
  private String sourceFile = null;

  @SerializedName("FirstRow")
  private Integer firstRow = null;

  @SerializedName("SeparatorString")
  private String separatorString = null;

  @SerializedName("CustomParsers")
  private List<CustomParserConfig> customParsers = null;

  public ImportCSVDataOption convertNumericData(Boolean convertNumericData) {
    this.convertNumericData = convertNumericData;
    return this;
  }

   /**
   * Get convertNumericData
   * @return convertNumericData
  **/
  @ApiModelProperty(value = "")
  public Boolean ConvertNumericData() {
    return convertNumericData;
  }

  public void setConvertNumericData(Boolean convertNumericData) {
    this.convertNumericData = convertNumericData;
  }

  public ImportCSVDataOption firstColumn(Integer firstColumn) {
    this.firstColumn = firstColumn;
    return this;
  }

   /**
   * Get firstColumn
   * @return firstColumn
  **/
  @ApiModelProperty(value = "")
  public Integer getFirstColumn() {
    return firstColumn;
  }

  public void setFirstColumn(Integer firstColumn) {
    this.firstColumn = firstColumn;
  }

  public ImportCSVDataOption sourceFile(String sourceFile) {
    this.sourceFile = sourceFile;
    return this;
  }

   /**
   * Get sourceFile
   * @return sourceFile
  **/
  @ApiModelProperty(value = "")
  public String getSourceFile() {
    return sourceFile;
  }

  public void setSourceFile(String sourceFile) {
    this.sourceFile = sourceFile;
  }

  public ImportCSVDataOption firstRow(Integer firstRow) {
    this.firstRow = firstRow;
    return this;
  }

   /**
   * Get firstRow
   * @return firstRow
  **/
  @ApiModelProperty(value = "")
  public Integer getFirstRow() {
    return firstRow;
  }

  public void setFirstRow(Integer firstRow) {
    this.firstRow = firstRow;
  }

  public ImportCSVDataOption separatorString(String separatorString) {
    this.separatorString = separatorString;
    return this;
  }

   /**
   * Get separatorString
   * @return separatorString
  **/
  @ApiModelProperty(value = "")
  public String getSeparatorString() {
    return separatorString;
  }

  public void setSeparatorString(String separatorString) {
    this.separatorString = separatorString;
  }

  public ImportCSVDataOption customParsers(List<CustomParserConfig> customParsers) {
    this.customParsers = customParsers;
    return this;
  }

  public ImportCSVDataOption addCustomParsersItem(CustomParserConfig customParsersItem) {
    if (this.customParsers == null) {
      this.customParsers = new ArrayList<>();
    }
    this.customParsers.add(customParsersItem);
    return this;
  }

   /**
   * Get customParsers
   * @return customParsers
  **/
  @ApiModelProperty(value = "")
  public List<CustomParserConfig> getCustomParsers() {
    return customParsers;
  }

  public void setCustomParsers(List<CustomParserConfig> customParsers) {
    this.customParsers = customParsers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportCSVDataOption importCSVDataOption = (ImportCSVDataOption) o;
    return Objects.equals(this.convertNumericData, importCSVDataOption.convertNumericData) &&
        Objects.equals(this.firstColumn, importCSVDataOption.firstColumn) &&
        Objects.equals(this.sourceFile, importCSVDataOption.sourceFile) &&
        Objects.equals(this.firstRow, importCSVDataOption.firstRow) &&
        Objects.equals(this.separatorString, importCSVDataOption.separatorString) &&
        Objects.equals(this.customParsers, importCSVDataOption.customParsers) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(convertNumericData, firstColumn, sourceFile, firstRow, separatorString, customParsers, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportCSVDataOption {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    convertNumericData: ").append(toIndentedString(convertNumericData)).append("\n");
    sb.append("    firstColumn: ").append(toIndentedString(firstColumn)).append("\n");
    sb.append("    sourceFile: ").append(toIndentedString(sourceFile)).append("\n");
    sb.append("    firstRow: ").append(toIndentedString(firstRow)).append("\n");
    sb.append("    separatorString: ").append(toIndentedString(separatorString)).append("\n");
    sb.append("    customParsers: ").append(toIndentedString(customParsers)).append("\n");
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

