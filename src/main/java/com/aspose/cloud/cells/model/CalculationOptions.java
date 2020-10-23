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
 * CalculationOptions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-19T23:40:54.225-05:00")
public class CalculationOptions {
  @SerializedName("PrecisionStrategy")
  private String precisionStrategy = null;

  @SerializedName("IgnoreError")
  private Boolean ignoreError = null;

  @SerializedName("Recursive")
  private Boolean recursive = null;

  @SerializedName("CalcStackSize")
  private Integer calcStackSize = null;

  public CalculationOptions precisionStrategy(String precisionStrategy) {
    this.precisionStrategy = precisionStrategy;
    return this;
  }

   /**
   * Get precisionStrategy
   * @return precisionStrategy
  **/
  @ApiModelProperty(value = "")
  public String getPrecisionStrategy() {
    return precisionStrategy;
  }

  public void setPrecisionStrategy(String precisionStrategy) {
    this.precisionStrategy = precisionStrategy;
  }

  public CalculationOptions ignoreError(Boolean ignoreError) {
    this.ignoreError = ignoreError;
    return this;
  }

   /**
   * Get ignoreError
   * @return ignoreError
  **/
  @ApiModelProperty(value = "")
  public Boolean IgnoreError() {
    return ignoreError;
  }

  public void setIgnoreError(Boolean ignoreError) {
    this.ignoreError = ignoreError;
  }

  public CalculationOptions recursive(Boolean recursive) {
    this.recursive = recursive;
    return this;
  }

   /**
   * Get recursive
   * @return recursive
  **/
  @ApiModelProperty(value = "")
  public Boolean Recursive() {
    return recursive;
  }

  public void setRecursive(Boolean recursive) {
    this.recursive = recursive;
  }

  public CalculationOptions calcStackSize(Integer calcStackSize) {
    this.calcStackSize = calcStackSize;
    return this;
  }

   /**
   * Get calcStackSize
   * @return calcStackSize
  **/
  @ApiModelProperty(value = "")
  public Integer getCalcStackSize() {
    return calcStackSize;
  }

  public void setCalcStackSize(Integer calcStackSize) {
    this.calcStackSize = calcStackSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalculationOptions calculationOptions = (CalculationOptions) o;
    return Objects.equals(this.precisionStrategy, calculationOptions.precisionStrategy) &&
        Objects.equals(this.ignoreError, calculationOptions.ignoreError) &&
        Objects.equals(this.recursive, calculationOptions.recursive) &&
        Objects.equals(this.calcStackSize, calculationOptions.calcStackSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(precisionStrategy, ignoreError, recursive, calcStackSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalculationOptions {\n");
    
    sb.append("    precisionStrategy: ").append(toIndentedString(precisionStrategy)).append("\n");
    sb.append("    ignoreError: ").append(toIndentedString(ignoreError)).append("\n");
    sb.append("    recursive: ").append(toIndentedString(recursive)).append("\n");
    sb.append("    calcStackSize: ").append(toIndentedString(calcStackSize)).append("\n");
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

