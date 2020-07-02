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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Represents the copy options.
 */
@ApiModel(description = "Represents the copy options.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-02T09:41:11.020+08:00")
public class CopyOptions {
  @SerializedName("ReferToDestinationSheet")
  private Boolean referToDestinationSheet = null;

  @SerializedName("CopyNames")
  private Boolean copyNames = null;

  @SerializedName("ReferToSheetWithSameName")
  private Boolean referToSheetWithSameName = null;

  @SerializedName("ColumnCharacterWidth")
  private Boolean columnCharacterWidth = null;

  @SerializedName("CopyInvalidFormulasAsValues")
  private Boolean copyInvalidFormulasAsValues = null;

  @SerializedName("ExtendToAdjacentRange")
  private Boolean extendToAdjacentRange = null;

  public CopyOptions referToDestinationSheet(Boolean referToDestinationSheet) {
    this.referToDestinationSheet = referToDestinationSheet;
    return this;
  }

   /**
   * When copying the range in the same file and the chart refers to the source sheet,   False means the copied chart&#39;s data source will not be changed. True means the   copied chart&#39;s data source refers to the destination sheet.             
   * @return referToDestinationSheet
  **/
  @ApiModelProperty(value = "When copying the range in the same file and the chart refers to the source sheet,   False means the copied chart's data source will not be changed. True means the   copied chart's data source refers to the destination sheet.             ")
  public Boolean ReferToDestinationSheet() {
    return referToDestinationSheet;
  }

  public void setReferToDestinationSheet(Boolean referToDestinationSheet) {
    this.referToDestinationSheet = referToDestinationSheet;
  }

  public CopyOptions copyNames(Boolean copyNames) {
    this.copyNames = copyNames;
    return this;
  }

   /**
   * Indicates whether copying the names.
   * @return copyNames
  **/
  @ApiModelProperty(value = "Indicates whether copying the names.")
  public Boolean CopyNames() {
    return copyNames;
  }

  public void setCopyNames(Boolean copyNames) {
    this.copyNames = copyNames;
  }

  public CopyOptions referToSheetWithSameName(Boolean referToSheetWithSameName) {
    this.referToSheetWithSameName = referToSheetWithSameName;
    return this;
  }

   /**
   * Get referToSheetWithSameName
   * @return referToSheetWithSameName
  **/
  @ApiModelProperty(value = "")
  public Boolean ReferToSheetWithSameName() {
    return referToSheetWithSameName;
  }

  public void setReferToSheetWithSameName(Boolean referToSheetWithSameName) {
    this.referToSheetWithSameName = referToSheetWithSameName;
  }

  public CopyOptions columnCharacterWidth(Boolean columnCharacterWidth) {
    this.columnCharacterWidth = columnCharacterWidth;
    return this;
  }

   /**
   * Indicates whether copying column width in unit of characters.
   * @return columnCharacterWidth
  **/
  @ApiModelProperty(value = "Indicates whether copying column width in unit of characters.")
  public Boolean ColumnCharacterWidth() {
    return columnCharacterWidth;
  }

  public void setColumnCharacterWidth(Boolean columnCharacterWidth) {
    this.columnCharacterWidth = columnCharacterWidth;
  }

  public CopyOptions copyInvalidFormulasAsValues(Boolean copyInvalidFormulasAsValues) {
    this.copyInvalidFormulasAsValues = copyInvalidFormulasAsValues;
    return this;
  }

   /**
   * If the formula is not valid for the dest destination, only copy values.
   * @return copyInvalidFormulasAsValues
  **/
  @ApiModelProperty(value = "If the formula is not valid for the dest destination, only copy values.")
  public Boolean CopyInvalidFormulasAsValues() {
    return copyInvalidFormulasAsValues;
  }

  public void setCopyInvalidFormulasAsValues(Boolean copyInvalidFormulasAsValues) {
    this.copyInvalidFormulasAsValues = copyInvalidFormulasAsValues;
  }

  public CopyOptions extendToAdjacentRange(Boolean extendToAdjacentRange) {
    this.extendToAdjacentRange = extendToAdjacentRange;
    return this;
  }

   /**
   * Indicates whether extend ranges when copying the range to adjacent range.
   * @return extendToAdjacentRange
  **/
  @ApiModelProperty(value = "Indicates whether extend ranges when copying the range to adjacent range.")
  public Boolean ExtendToAdjacentRange() {
    return extendToAdjacentRange;
  }

  public void setExtendToAdjacentRange(Boolean extendToAdjacentRange) {
    this.extendToAdjacentRange = extendToAdjacentRange;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CopyOptions copyOptions = (CopyOptions) o;
    return Objects.equals(this.referToDestinationSheet, copyOptions.referToDestinationSheet) &&
        Objects.equals(this.copyNames, copyOptions.copyNames) &&
        Objects.equals(this.referToSheetWithSameName, copyOptions.referToSheetWithSameName) &&
        Objects.equals(this.columnCharacterWidth, copyOptions.columnCharacterWidth) &&
        Objects.equals(this.copyInvalidFormulasAsValues, copyOptions.copyInvalidFormulasAsValues) &&
        Objects.equals(this.extendToAdjacentRange, copyOptions.extendToAdjacentRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referToDestinationSheet, copyNames, referToSheetWithSameName, columnCharacterWidth, copyInvalidFormulasAsValues, extendToAdjacentRange);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CopyOptions {\n");
    
    sb.append("    referToDestinationSheet: ").append(toIndentedString(referToDestinationSheet)).append("\n");
    sb.append("    copyNames: ").append(toIndentedString(copyNames)).append("\n");
    sb.append("    referToSheetWithSameName: ").append(toIndentedString(referToSheetWithSameName)).append("\n");
    sb.append("    columnCharacterWidth: ").append(toIndentedString(columnCharacterWidth)).append("\n");
    sb.append("    copyInvalidFormulasAsValues: ").append(toIndentedString(copyInvalidFormulasAsValues)).append("\n");
    sb.append("    extendToAdjacentRange: ").append(toIndentedString(extendToAdjacentRange)).append("\n");
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

