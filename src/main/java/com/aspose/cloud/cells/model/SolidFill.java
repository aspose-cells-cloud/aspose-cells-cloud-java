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
 * SolidFill
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-01-21T01:47:19.323-06:00")
public class SolidFill {
  @SerializedName("Color")
  private Color color = null;

  @SerializedName("CellsColor")
  private CellsColor cellsColor = null;

  @SerializedName("Transparency")
  private Double transparency = null;

  public SolidFill color(Color color) {
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

  public SolidFill cellsColor(CellsColor cellsColor) {
    this.cellsColor = cellsColor;
    return this;
  }

   /**
   * Get cellsColor
   * @return cellsColor
  **/
  @ApiModelProperty(value = "")
  public CellsColor getCellsColor() {
    return cellsColor;
  }

  public void setCellsColor(CellsColor cellsColor) {
    this.cellsColor = cellsColor;
  }

  public SolidFill transparency(Double transparency) {
    this.transparency = transparency;
    return this;
  }

   /**
   * Get transparency
   * @return transparency
  **/
  @ApiModelProperty(value = "")
  public Double getTransparency() {
    return transparency;
  }

  public void setTransparency(Double transparency) {
    this.transparency = transparency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SolidFill solidFill = (SolidFill) o;
    return Objects.equals(this.color, solidFill.color) &&
        Objects.equals(this.cellsColor, solidFill.cellsColor) &&
        Objects.equals(this.transparency, solidFill.transparency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, cellsColor, transparency);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SolidFill {\n");
    
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    cellsColor: ").append(toIndentedString(cellsColor)).append("\n");
    sb.append("    transparency: ").append(toIndentedString(transparency)).append("\n");
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

