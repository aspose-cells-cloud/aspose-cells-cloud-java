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
 * PasteOptions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-19T23:40:54.225-05:00")
public class PasteOptions {
  @SerializedName("PasteType")
  private String pasteType = null;

  @SerializedName("SkipBlanks")
  private Boolean skipBlanks = null;

  @SerializedName("OnlyVisibleCells")
  private Boolean onlyVisibleCells = null;

  @SerializedName("Transpose")
  private Boolean transpose = null;

  public PasteOptions pasteType(String pasteType) {
    this.pasteType = pasteType;
    return this;
  }

   /**
   * Get pasteType
   * @return pasteType
  **/
  @ApiModelProperty(value = "")
  public String getPasteType() {
    return pasteType;
  }

  public void setPasteType(String pasteType) {
    this.pasteType = pasteType;
  }

  public PasteOptions skipBlanks(Boolean skipBlanks) {
    this.skipBlanks = skipBlanks;
    return this;
  }

   /**
   * Get skipBlanks
   * @return skipBlanks
  **/
  @ApiModelProperty(value = "")
  public Boolean SkipBlanks() {
    return skipBlanks;
  }

  public void setSkipBlanks(Boolean skipBlanks) {
    this.skipBlanks = skipBlanks;
  }

  public PasteOptions onlyVisibleCells(Boolean onlyVisibleCells) {
    this.onlyVisibleCells = onlyVisibleCells;
    return this;
  }

   /**
   * Get onlyVisibleCells
   * @return onlyVisibleCells
  **/
  @ApiModelProperty(value = "")
  public Boolean OnlyVisibleCells() {
    return onlyVisibleCells;
  }

  public void setOnlyVisibleCells(Boolean onlyVisibleCells) {
    this.onlyVisibleCells = onlyVisibleCells;
  }

  public PasteOptions transpose(Boolean transpose) {
    this.transpose = transpose;
    return this;
  }

   /**
   * Get transpose
   * @return transpose
  **/
  @ApiModelProperty(value = "")
  public Boolean Transpose() {
    return transpose;
  }

  public void setTranspose(Boolean transpose) {
    this.transpose = transpose;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PasteOptions pasteOptions = (PasteOptions) o;
    return Objects.equals(this.pasteType, pasteOptions.pasteType) &&
        Objects.equals(this.skipBlanks, pasteOptions.skipBlanks) &&
        Objects.equals(this.onlyVisibleCells, pasteOptions.onlyVisibleCells) &&
        Objects.equals(this.transpose, pasteOptions.transpose);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pasteType, skipBlanks, onlyVisibleCells, transpose);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PasteOptions {\n");
    
    sb.append("    pasteType: ").append(toIndentedString(pasteType)).append("\n");
    sb.append("    skipBlanks: ").append(toIndentedString(skipBlanks)).append("\n");
    sb.append("    onlyVisibleCells: ").append(toIndentedString(onlyVisibleCells)).append("\n");
    sb.append("    transpose: ").append(toIndentedString(transpose)).append("\n");
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

