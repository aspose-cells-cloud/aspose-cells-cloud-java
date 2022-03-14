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

/**
 * ImportPictureOption
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-13T18:09:02.334-05:00")
public class ImportPictureOption extends ImportOption {
  @SerializedName("UpperLeftRow")
  private Integer upperLeftRow = null;

  @SerializedName("UpperLeftColumn")
  private Integer upperLeftColumn = null;

  @SerializedName("LowerRightRow")
  private Integer lowerRightRow = null;

  @SerializedName("LowerRightColumn")
  private Integer lowerRightColumn = null;

  @SerializedName("Filename")
  private String filename = null;

  @SerializedName("Data")
  private String data = null;

  public ImportPictureOption upperLeftRow(Integer upperLeftRow) {
    this.upperLeftRow = upperLeftRow;
    return this;
  }

   /**
   * Upper Left Row.
   * @return upperLeftRow
  **/
  @ApiModelProperty(value = "Upper Left Row.")
  public Integer getUpperLeftRow() {
    return upperLeftRow;
  }

  public void setUpperLeftRow(Integer upperLeftRow) {
    this.upperLeftRow = upperLeftRow;
  }

  public ImportPictureOption upperLeftColumn(Integer upperLeftColumn) {
    this.upperLeftColumn = upperLeftColumn;
    return this;
  }

   /**
   * Upper Left Column.
   * @return upperLeftColumn
  **/
  @ApiModelProperty(value = "Upper Left Column.")
  public Integer getUpperLeftColumn() {
    return upperLeftColumn;
  }

  public void setUpperLeftColumn(Integer upperLeftColumn) {
    this.upperLeftColumn = upperLeftColumn;
  }

  public ImportPictureOption lowerRightRow(Integer lowerRightRow) {
    this.lowerRightRow = lowerRightRow;
    return this;
  }

   /**
   * Lower Right Row.
   * @return lowerRightRow
  **/
  @ApiModelProperty(value = "Lower Right Row.")
  public Integer getLowerRightRow() {
    return lowerRightRow;
  }

  public void setLowerRightRow(Integer lowerRightRow) {
    this.lowerRightRow = lowerRightRow;
  }

  public ImportPictureOption lowerRightColumn(Integer lowerRightColumn) {
    this.lowerRightColumn = lowerRightColumn;
    return this;
  }

   /**
   * Lower Right Column.
   * @return lowerRightColumn
  **/
  @ApiModelProperty(value = "Lower Right Column.")
  public Integer getLowerRightColumn() {
    return lowerRightColumn;
  }

  public void setLowerRightColumn(Integer lowerRightColumn) {
    this.lowerRightColumn = lowerRightColumn;
  }

  public ImportPictureOption filename(String filename) {
    this.filename = filename;
    return this;
  }

   /**
   * Filename.
   * @return filename
  **/
  @ApiModelProperty(value = "Filename.")
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public ImportPictureOption data(String data) {
    this.data = data;
    return this;
  }

   /**
   * data : base64  string.
   * @return data
  **/
  @ApiModelProperty(value = "data : base64  string.")
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportPictureOption importPictureOption = (ImportPictureOption) o;
    return Objects.equals(this.upperLeftRow, importPictureOption.upperLeftRow) &&
        Objects.equals(this.upperLeftColumn, importPictureOption.upperLeftColumn) &&
        Objects.equals(this.lowerRightRow, importPictureOption.lowerRightRow) &&
        Objects.equals(this.lowerRightColumn, importPictureOption.lowerRightColumn) &&
        Objects.equals(this.filename, importPictureOption.filename) &&
        Objects.equals(this.data, importPictureOption.data) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(upperLeftRow, upperLeftColumn, lowerRightRow, lowerRightColumn, filename, data, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportPictureOption {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    upperLeftRow: ").append(toIndentedString(upperLeftRow)).append("\n");
    sb.append("    upperLeftColumn: ").append(toIndentedString(upperLeftColumn)).append("\n");
    sb.append("    lowerRightRow: ").append(toIndentedString(lowerRightRow)).append("\n");
    sb.append("    lowerRightColumn: ").append(toIndentedString(lowerRightColumn)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

