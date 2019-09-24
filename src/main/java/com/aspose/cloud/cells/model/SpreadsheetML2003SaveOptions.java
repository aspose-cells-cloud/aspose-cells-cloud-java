/* 
 * <summary>
 *  Copyright (c) 2019 Aspose.Cells Cloud
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
 * SpreadsheetML2003SaveOptions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-17T15:02:23.029+08:00")
public class SpreadsheetML2003SaveOptions extends SaveOptions {
  @SerializedName("ExportColumnIndexOfCell")
  private Boolean exportColumnIndexOfCell = null;

  @SerializedName("IsIndentedFormatting")
  private Boolean isIndentedFormatting = null;

  @SerializedName("LimitAsXls")
  private Boolean limitAsXls = null;

  public SpreadsheetML2003SaveOptions exportColumnIndexOfCell(Boolean exportColumnIndexOfCell) {
    this.exportColumnIndexOfCell = exportColumnIndexOfCell;
    return this;
  }

   /**
   * Get exportColumnIndexOfCell
   * @return exportColumnIndexOfCell
  **/
  @ApiModelProperty(value = "")
  public Boolean ExportColumnIndexOfCell() {
    return exportColumnIndexOfCell;
  }

  public void setExportColumnIndexOfCell(Boolean exportColumnIndexOfCell) {
    this.exportColumnIndexOfCell = exportColumnIndexOfCell;
  }

  public SpreadsheetML2003SaveOptions isIndentedFormatting(Boolean isIndentedFormatting) {
    this.isIndentedFormatting = isIndentedFormatting;
    return this;
  }

   /**
   * Get isIndentedFormatting
   * @return isIndentedFormatting
  **/
  @ApiModelProperty(value = "")
  public Boolean IsIndentedFormatting() {
    return isIndentedFormatting;
  }

  public void setIsIndentedFormatting(Boolean isIndentedFormatting) {
    this.isIndentedFormatting = isIndentedFormatting;
  }

  public SpreadsheetML2003SaveOptions limitAsXls(Boolean limitAsXls) {
    this.limitAsXls = limitAsXls;
    return this;
  }

   /**
   * Get limitAsXls
   * @return limitAsXls
  **/
  @ApiModelProperty(value = "")
  public Boolean LimitAsXls() {
    return limitAsXls;
  }

  public void setLimitAsXls(Boolean limitAsXls) {
    this.limitAsXls = limitAsXls;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpreadsheetML2003SaveOptions spreadsheetML2003SaveOptions = (SpreadsheetML2003SaveOptions) o;
    return Objects.equals(this.exportColumnIndexOfCell, spreadsheetML2003SaveOptions.exportColumnIndexOfCell) &&
        Objects.equals(this.isIndentedFormatting, spreadsheetML2003SaveOptions.isIndentedFormatting) &&
        Objects.equals(this.limitAsXls, spreadsheetML2003SaveOptions.limitAsXls) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exportColumnIndexOfCell, isIndentedFormatting, limitAsXls, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpreadsheetML2003SaveOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    exportColumnIndexOfCell: ").append(toIndentedString(exportColumnIndexOfCell)).append("\n");
    sb.append("    isIndentedFormatting: ").append(toIndentedString(isIndentedFormatting)).append("\n");
    sb.append("    limitAsXls: ").append(toIndentedString(limitAsXls)).append("\n");
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

