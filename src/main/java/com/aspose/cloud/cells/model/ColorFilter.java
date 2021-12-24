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
import com.aspose.cloud.cells.model.CellsColor;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ColorFilter
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-12-23T20:05:07.092-06:00")
public class ColorFilter {
  @SerializedName("Color")
  private CellsColor color = null;

  @SerializedName("Pattern")
  private String pattern = null;

  @SerializedName("BackgroundColor")
  private CellsColor backgroundColor = null;

  @SerializedName("ForegroundColorColor")
  private CellsColor foregroundColorColor = null;

  @SerializedName("FilterByFillColor")
  private String filterByFillColor = null;

  public ColorFilter color(CellsColor color) {
    this.color = color;
    return this;
  }

   /**
   * Get color
   * @return color
  **/
  @ApiModelProperty(value = "")
  public CellsColor getColor() {
    return color;
  }

  public void setColor(CellsColor color) {
    this.color = color;
  }

  public ColorFilter pattern(String pattern) {
    this.pattern = pattern;
    return this;
  }

   /**
   * Get pattern
   * @return pattern
  **/
  @ApiModelProperty(value = "")
  public String getPattern() {
    return pattern;
  }

  public void setPattern(String pattern) {
    this.pattern = pattern;
  }

  public ColorFilter backgroundColor(CellsColor backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }

   /**
   * Get backgroundColor
   * @return backgroundColor
  **/
  @ApiModelProperty(value = "")
  public CellsColor getBackgroundColor() {
    return backgroundColor;
  }

  public void setBackgroundColor(CellsColor backgroundColor) {
    this.backgroundColor = backgroundColor;
  }

  public ColorFilter foregroundColorColor(CellsColor foregroundColorColor) {
    this.foregroundColorColor = foregroundColorColor;
    return this;
  }

   /**
   * Get foregroundColorColor
   * @return foregroundColorColor
  **/
  @ApiModelProperty(value = "")
  public CellsColor getForegroundColorColor() {
    return foregroundColorColor;
  }

  public void setForegroundColorColor(CellsColor foregroundColorColor) {
    this.foregroundColorColor = foregroundColorColor;
  }

  public ColorFilter filterByFillColor(String filterByFillColor) {
    this.filterByFillColor = filterByFillColor;
    return this;
  }

   /**
   * Get filterByFillColor
   * @return filterByFillColor
  **/
  @ApiModelProperty(value = "")
  public String getFilterByFillColor() {
    return filterByFillColor;
  }

  public void setFilterByFillColor(String filterByFillColor) {
    this.filterByFillColor = filterByFillColor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ColorFilter colorFilter = (ColorFilter) o;
    return Objects.equals(this.color, colorFilter.color) &&
        Objects.equals(this.pattern, colorFilter.pattern) &&
        Objects.equals(this.backgroundColor, colorFilter.backgroundColor) &&
        Objects.equals(this.foregroundColorColor, colorFilter.foregroundColorColor) &&
        Objects.equals(this.filterByFillColor, colorFilter.filterByFillColor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, pattern, backgroundColor, foregroundColorColor, filterByFillColor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ColorFilter {\n");
    
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
    sb.append("    foregroundColorColor: ").append(toIndentedString(foregroundColorColor)).append("\n");
    sb.append("    filterByFillColor: ").append(toIndentedString(filterByFillColor)).append("\n");
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

