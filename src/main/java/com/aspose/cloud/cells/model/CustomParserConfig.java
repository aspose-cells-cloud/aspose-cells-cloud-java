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
 * CustomParserConfig
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-05-25T04:35:47.926-05:00")
public class CustomParserConfig {
  @SerializedName("ColumnIndex")
  private Integer columnIndex = null;

  @SerializedName("CustomStyle")
  private String customStyle = null;

  @SerializedName("ParseMethod")
  private String parseMethod = null;

  public CustomParserConfig columnIndex(Integer columnIndex) {
    this.columnIndex = columnIndex;
    return this;
  }

   /**
   * Get columnIndex
   * @return columnIndex
  **/
  @ApiModelProperty(value = "")
  public Integer getColumnIndex() {
    return columnIndex;
  }

  public void setColumnIndex(Integer columnIndex) {
    this.columnIndex = columnIndex;
  }

  public CustomParserConfig customStyle(String customStyle) {
    this.customStyle = customStyle;
    return this;
  }

   /**
   * Get customStyle
   * @return customStyle
  **/
  @ApiModelProperty(value = "")
  public String getCustomStyle() {
    return customStyle;
  }

  public void setCustomStyle(String customStyle) {
    this.customStyle = customStyle;
  }

  public CustomParserConfig parseMethod(String parseMethod) {
    this.parseMethod = parseMethod;
    return this;
  }

   /**
   * Get parseMethod
   * @return parseMethod
  **/
  @ApiModelProperty(value = "")
  public String getParseMethod() {
    return parseMethod;
  }

  public void setParseMethod(String parseMethod) {
    this.parseMethod = parseMethod;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomParserConfig customParserConfig = (CustomParserConfig) o;
    return Objects.equals(this.columnIndex, customParserConfig.columnIndex) &&
        Objects.equals(this.customStyle, customParserConfig.customStyle) &&
        Objects.equals(this.parseMethod, customParserConfig.parseMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnIndex, customStyle, parseMethod);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomParserConfig {\n");
    
    sb.append("    columnIndex: ").append(toIndentedString(columnIndex)).append("\n");
    sb.append("    customStyle: ").append(toIndentedString(customStyle)).append("\n");
    sb.append("    parseMethod: ").append(toIndentedString(parseMethod)).append("\n");
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

