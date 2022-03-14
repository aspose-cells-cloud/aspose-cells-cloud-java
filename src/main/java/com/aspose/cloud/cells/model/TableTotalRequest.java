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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TableTotalRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-13T18:09:02.334-05:00")
public class TableTotalRequest {
  @SerializedName("ListColumnIndex")
  private Integer listColumnIndex = null;

  @SerializedName("TotalsCalculation")
  private String totalsCalculation = null;

  @SerializedName("CustomFormula")
  private String customFormula = null;

  public TableTotalRequest listColumnIndex(Integer listColumnIndex) {
    this.listColumnIndex = listColumnIndex;
    return this;
  }

   /**
   * Get listColumnIndex
   * @return listColumnIndex
  **/
  @ApiModelProperty(value = "")
  public Integer getListColumnIndex() {
    return listColumnIndex;
  }

  public void setListColumnIndex(Integer listColumnIndex) {
    this.listColumnIndex = listColumnIndex;
  }

  public TableTotalRequest totalsCalculation(String totalsCalculation) {
    this.totalsCalculation = totalsCalculation;
    return this;
  }

   /**
   * Get totalsCalculation
   * @return totalsCalculation
  **/
  @ApiModelProperty(value = "")
  public String getTotalsCalculation() {
    return totalsCalculation;
  }

  public void setTotalsCalculation(String totalsCalculation) {
    this.totalsCalculation = totalsCalculation;
  }

  public TableTotalRequest customFormula(String customFormula) {
    this.customFormula = customFormula;
    return this;
  }

   /**
   * Get customFormula
   * @return customFormula
  **/
  @ApiModelProperty(value = "")
  public String getCustomFormula() {
    return customFormula;
  }

  public void setCustomFormula(String customFormula) {
    this.customFormula = customFormula;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableTotalRequest tableTotalRequest = (TableTotalRequest) o;
    return Objects.equals(this.listColumnIndex, tableTotalRequest.listColumnIndex) &&
        Objects.equals(this.totalsCalculation, tableTotalRequest.totalsCalculation) &&
        Objects.equals(this.customFormula, tableTotalRequest.customFormula);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listColumnIndex, totalsCalculation, customFormula);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableTotalRequest {\n");
    
    sb.append("    listColumnIndex: ").append(toIndentedString(listColumnIndex)).append("\n");
    sb.append("    totalsCalculation: ").append(toIndentedString(totalsCalculation)).append("\n");
    sb.append("    customFormula: ").append(toIndentedString(customFormula)).append("\n");
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

