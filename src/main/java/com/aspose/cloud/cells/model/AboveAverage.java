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
 * Describe the AboveAverage conditional formatting rule. This conditional formatting     rule highlights cells that are above or below the average for all values     in the range.
 */
@ApiModel(description = "Describe the AboveAverage conditional formatting rule. This conditional formatting     rule highlights cells that are above or below the average for all values     in the range.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-09-17T23:42:04.472-05:00")
public class AboveAverage {
  @SerializedName("IsAboveAverage")
  private Boolean isAboveAverage = null;

  @SerializedName("IsEqualAverage")
  private Boolean isEqualAverage = null;

  @SerializedName("StdDev")
  private Integer stdDev = null;

  public AboveAverage isAboveAverage(Boolean isAboveAverage) {
    this.isAboveAverage = isAboveAverage;
    return this;
  }

   /**
   * Get or set the flag indicating whether the rule is an \&quot;above average\&quot; rule.    &#39;true&#39; indicates &#39;above average&#39;.  Default value is true.             
   * @return isAboveAverage
  **/
  @ApiModelProperty(required = true, value = "Get or set the flag indicating whether the rule is an \"above average\" rule.    'true' indicates 'above average'.  Default value is true.             ")
  public Boolean IsAboveAverage() {
    return isAboveAverage;
  }

  public void setIsAboveAverage(Boolean isAboveAverage) {
    this.isAboveAverage = isAboveAverage;
  }

  public AboveAverage isEqualAverage(Boolean isEqualAverage) {
    this.isEqualAverage = isEqualAverage;
    return this;
  }

   /**
   * Get or set the flag indicating whether the &#39;aboveAverage&#39; and &#39;belowAverage&#39;    criteria is inclusive of the average itself, or exclusive of that value.    &#39;true&#39; indicates to include the average value in the criteria.  Default value    is false.             
   * @return isEqualAverage
  **/
  @ApiModelProperty(required = true, value = "Get or set the flag indicating whether the 'aboveAverage' and 'belowAverage'    criteria is inclusive of the average itself, or exclusive of that value.    'true' indicates to include the average value in the criteria.  Default value    is false.             ")
  public Boolean IsEqualAverage() {
    return isEqualAverage;
  }

  public void setIsEqualAverage(Boolean isEqualAverage) {
    this.isEqualAverage = isEqualAverage;
  }

  public AboveAverage stdDev(Integer stdDev) {
    this.stdDev = stdDev;
    return this;
  }

   /**
   * Get or set the number of standard deviations to include above or below the   average in the conditional formatting rule. The input value must between   0 and 3 (include 0 and 3). Setting this value to 0 means stdDev is not set.    The default value is 0.             
   * @return stdDev
  **/
  @ApiModelProperty(required = true, value = "Get or set the number of standard deviations to include above or below the   average in the conditional formatting rule. The input value must between   0 and 3 (include 0 and 3). Setting this value to 0 means stdDev is not set.    The default value is 0.             ")
  public Integer getStdDev() {
    return stdDev;
  }

  public void setStdDev(Integer stdDev) {
    this.stdDev = stdDev;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AboveAverage aboveAverage = (AboveAverage) o;
    return Objects.equals(this.isAboveAverage, aboveAverage.isAboveAverage) &&
        Objects.equals(this.isEqualAverage, aboveAverage.isEqualAverage) &&
        Objects.equals(this.stdDev, aboveAverage.stdDev);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isAboveAverage, isEqualAverage, stdDev);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AboveAverage {\n");
    
    sb.append("    isAboveAverage: ").append(toIndentedString(isAboveAverage)).append("\n");
    sb.append("    isEqualAverage: ").append(toIndentedString(isEqualAverage)).append("\n");
    sb.append("    stdDev: ").append(toIndentedString(stdDev)).append("\n");
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

