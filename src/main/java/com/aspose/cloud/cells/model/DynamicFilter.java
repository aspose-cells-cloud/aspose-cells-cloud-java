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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DynamicFilter
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-24T14:56:32.974+08:00")
public class DynamicFilter {
  @SerializedName("DynamicFilterType")
  private String dynamicFilterType = null;

  @SerializedName("MaxValue")
  private Object maxValue = null;

  @SerializedName("Value")
  private Object value = null;

  public DynamicFilter dynamicFilterType(String dynamicFilterType) {
    this.dynamicFilterType = dynamicFilterType;
    return this;
  }

   /**
   * Get dynamicFilterType
   * @return dynamicFilterType
  **/
  @ApiModelProperty(value = "")
  public String getDynamicFilterType() {
    return dynamicFilterType;
  }

  public void setDynamicFilterType(String dynamicFilterType) {
    this.dynamicFilterType = dynamicFilterType;
  }

  public DynamicFilter maxValue(Object maxValue) {
    this.maxValue = maxValue;
    return this;
  }

   /**
   * Get maxValue
   * @return maxValue
  **/
  @ApiModelProperty(value = "")
  public Object getMaxValue() {
    return maxValue;
  }

  public void setMaxValue(Object maxValue) {
    this.maxValue = maxValue;
  }

  public DynamicFilter value(Object value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")
  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicFilter dynamicFilter = (DynamicFilter) o;
    return Objects.equals(this.dynamicFilterType, dynamicFilter.dynamicFilterType) &&
        Objects.equals(this.maxValue, dynamicFilter.maxValue) &&
        Objects.equals(this.value, dynamicFilter.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dynamicFilterType, maxValue, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicFilter {\n");
    
    sb.append("    dynamicFilterType: ").append(toIndentedString(dynamicFilterType)).append("\n");
    sb.append("    maxValue: ").append(toIndentedString(maxValue)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

