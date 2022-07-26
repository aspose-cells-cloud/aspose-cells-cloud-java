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
 * JsonSaveOptions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-25T00:46:02.627-05:00")
public class JsonSaveOptions extends SaveOptions {
  @SerializedName("ExportArea")
  private CellArea exportArea = null;

  @SerializedName("HasHeaderRow")
  private Boolean hasHeaderRow = null;

  @SerializedName("ExportAsString")
  private Boolean exportAsString = null;

  @SerializedName("Indent")
  private String indent = null;

  public JsonSaveOptions exportArea(CellArea exportArea) {
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

  public JsonSaveOptions hasHeaderRow(Boolean hasHeaderRow) {
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

  public JsonSaveOptions exportAsString(Boolean exportAsString) {
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

  public JsonSaveOptions indent(String indent) {
    this.indent = indent;
    return this;
  }

   /**
   * Get indent
   * @return indent
  **/
  @ApiModelProperty(value = "")
  public String getIndent() {
    return indent;
  }

  public void setIndent(String indent) {
    this.indent = indent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonSaveOptions jsonSaveOptions = (JsonSaveOptions) o;
    return Objects.equals(this.exportArea, jsonSaveOptions.exportArea) &&
        Objects.equals(this.hasHeaderRow, jsonSaveOptions.hasHeaderRow) &&
        Objects.equals(this.exportAsString, jsonSaveOptions.exportAsString) &&
        Objects.equals(this.indent, jsonSaveOptions.indent) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exportArea, hasHeaderRow, exportAsString, indent, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonSaveOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    exportArea: ").append(toIndentedString(exportArea)).append("\n");
    sb.append("    hasHeaderRow: ").append(toIndentedString(hasHeaderRow)).append("\n");
    sb.append("    exportAsString: ").append(toIndentedString(exportAsString)).append("\n");
    sb.append("    indent: ").append(toIndentedString(indent)).append("\n");
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

