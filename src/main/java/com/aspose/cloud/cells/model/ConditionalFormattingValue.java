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
 * ConditionalFormattingValue
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-19T15:56:27.996+08:00")
public class ConditionalFormattingValue {
  @SerializedName("IsGTE")
  private Boolean isGTE = null;

  @SerializedName("Type")
  private String type = null;

  @SerializedName("Value")
  private Object value = null;

  public ConditionalFormattingValue isGTE(Boolean isGTE) {
    this.isGTE = isGTE;
    return this;
  }

   /**
   * Get or set the Greater Than Or Equal flag. Use only for icon sets, determines    whether this threshold value uses the greater than or equal to operator.    &#39;false&#39; indicates &#39;greater than&#39; is used instead of &#39;greater than or equal    to&#39;.  Default value is true.             
   * @return isGTE
  **/
  @ApiModelProperty(value = "Get or set the Greater Than Or Equal flag. Use only for icon sets, determines    whether this threshold value uses the greater than or equal to operator.    'false' indicates 'greater than' is used instead of 'greater than or equal    to'.  Default value is true.             ")
  public Boolean IsGTE() {
    return isGTE;
  }

  public void setIsGTE(Boolean isGTE) {
    this.isGTE = isGTE;
  }

  public ConditionalFormattingValue type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get or set the type of this conditional formatting value object.  Setting      the type to FormatConditionValueType.Min or FormatConditionValueType.Max      will auto set \&quot;Value\&quot; to null.  
   * @return type
  **/
  @ApiModelProperty(value = "Get or set the type of this conditional formatting value object.  Setting      the type to FormatConditionValueType.Min or FormatConditionValueType.Max      will auto set \"Value\" to null.  ")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ConditionalFormattingValue value(Object value) {
    this.value = value;
    return this;
  }

   /**
   * Get or set the value of this conditional formatting value object.  It should     be used in conjunction with Type.
   * @return value
  **/
  @ApiModelProperty(value = "Get or set the value of this conditional formatting value object.  It should     be used in conjunction with Type.")
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
    ConditionalFormattingValue conditionalFormattingValue = (ConditionalFormattingValue) o;
    return Objects.equals(this.isGTE, conditionalFormattingValue.isGTE) &&
        Objects.equals(this.type, conditionalFormattingValue.type) &&
        Objects.equals(this.value, conditionalFormattingValue.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isGTE, type, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConditionalFormattingValue {\n");
    
    sb.append("    isGTE: ").append(toIndentedString(isGTE)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

