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
import com.aspose.cloud.cells.model.Color;
import com.aspose.cloud.cells.model.ThemeColor;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CellsColor
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-19T15:56:27.996+08:00")
public class CellsColor {
  @SerializedName("Color")
  private Color color = null;

  @SerializedName("Type")
  private String type = null;

  @SerializedName("ThemeColor")
  private ThemeColor themeColor = null;

  @SerializedName("IsShapeColor")
  private Boolean isShapeColor = null;

  @SerializedName("ColorIndex")
  private Integer colorIndex = null;

  public CellsColor color(Color color) {
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

  public CellsColor type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public CellsColor themeColor(ThemeColor themeColor) {
    this.themeColor = themeColor;
    return this;
  }

   /**
   * Get themeColor
   * @return themeColor
  **/
  @ApiModelProperty(value = "")
  public ThemeColor getThemeColor() {
    return themeColor;
  }

  public void setThemeColor(ThemeColor themeColor) {
    this.themeColor = themeColor;
  }

  public CellsColor isShapeColor(Boolean isShapeColor) {
    this.isShapeColor = isShapeColor;
    return this;
  }

   /**
   * Get isShapeColor
   * @return isShapeColor
  **/
  @ApiModelProperty(value = "")
  public Boolean IsShapeColor() {
    return isShapeColor;
  }

  public void setIsShapeColor(Boolean isShapeColor) {
    this.isShapeColor = isShapeColor;
  }

  public CellsColor colorIndex(Integer colorIndex) {
    this.colorIndex = colorIndex;
    return this;
  }

   /**
   * Get colorIndex
   * @return colorIndex
  **/
  @ApiModelProperty(value = "")
  public Integer getColorIndex() {
    return colorIndex;
  }

  public void setColorIndex(Integer colorIndex) {
    this.colorIndex = colorIndex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CellsColor cellsColor = (CellsColor) o;
    return Objects.equals(this.color, cellsColor.color) &&
        Objects.equals(this.type, cellsColor.type) &&
        Objects.equals(this.themeColor, cellsColor.themeColor) &&
        Objects.equals(this.isShapeColor, cellsColor.isShapeColor) &&
        Objects.equals(this.colorIndex, cellsColor.colorIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, type, themeColor, isShapeColor, colorIndex);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CellsColor {\n");
    
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    themeColor: ").append(toIndentedString(themeColor)).append("\n");
    sb.append("    isShapeColor: ").append(toIndentedString(isShapeColor)).append("\n");
    sb.append("    colorIndex: ").append(toIndentedString(colorIndex)).append("\n");
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

