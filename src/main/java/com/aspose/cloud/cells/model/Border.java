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
import com.aspose.cloud.cells.model.Color;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Border
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-12-23T20:05:07.092-06:00")
public class Border {
  @SerializedName("Color")
  private Color color = null;

  @SerializedName("BorderType")
  private String borderType = null;

  @SerializedName("LineStyle")
  private String lineStyle = null;

  public Border color(Color color) {
    this.color = color;
    return this;
  }

   /**
   * Get color
   * @return color
  **/
  @ApiModelProperty(value = "")
  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public Border borderType(String borderType) {
    this.borderType = borderType;
    return this;
  }

   /**
   * Get borderType
   * @return borderType
  **/
  @ApiModelProperty(value = "")
  public String getBorderType() {
    return borderType;
  }

  public void setBorderType(String borderType) {
    this.borderType = borderType;
  }

  public Border lineStyle(String lineStyle) {
    this.lineStyle = lineStyle;
    return this;
  }

   /**
   * Get lineStyle
   * @return lineStyle
  **/
  @ApiModelProperty(value = "")
  public String getLineStyle() {
    return lineStyle;
  }

  public void setLineStyle(String lineStyle) {
    this.lineStyle = lineStyle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Border border = (Border) o;
    return Objects.equals(this.color, border.color) &&
        Objects.equals(this.borderType, border.borderType) &&
        Objects.equals(this.lineStyle, border.lineStyle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, borderType, lineStyle);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Border {\n");
    
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    borderType: ").append(toIndentedString(borderType)).append("\n");
    sb.append("    lineStyle: ").append(toIndentedString(lineStyle)).append("\n");
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

