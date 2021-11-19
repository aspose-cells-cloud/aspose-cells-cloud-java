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

/**
 * ListColumn
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-19T16:36:54.237-06:00")
public class ListColumn {
  @SerializedName("TotalsCalculation")
  private String totalsCalculation = null;

  @SerializedName("Name")
  private String name = null;

  public ListColumn totalsCalculation(String totalsCalculation) {
    this.totalsCalculation = totalsCalculation;
    return this;
  }

   /**
   * Gets and sets the type of calculation in the Totals row of the list column.
   * @return totalsCalculation
  **/
  @ApiModelProperty(value = "Gets and sets the type of calculation in the Totals row of the list column.")
  public String getTotalsCalculation() {
    return totalsCalculation;
  }

  public void setTotalsCalculation(String totalsCalculation) {
    this.totalsCalculation = totalsCalculation;
  }

  public ListColumn name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Gets and sets the name of the column.
   * @return name
  **/
  @ApiModelProperty(value = "Gets and sets the name of the column.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListColumn listColumn = (ListColumn) o;
    return Objects.equals(this.totalsCalculation, listColumn.totalsCalculation) &&
        Objects.equals(this.name, listColumn.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalsCalculation, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListColumn {\n");
    
    sb.append("    totalsCalculation: ").append(toIndentedString(totalsCalculation)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

