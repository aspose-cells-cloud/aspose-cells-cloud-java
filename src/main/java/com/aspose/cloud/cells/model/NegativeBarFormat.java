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
 * Represents the color settings of the data bars for negative values that are    defined by a data bar conditional formating rule.             
 */
@ApiModel(description = "Represents the color settings of the data bars for negative values that are    defined by a data bar conditional formating rule.             ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-21T07:23:23.400-06:00")
public class NegativeBarFormat {
  @SerializedName("BorderColor")
  private Color borderColor = null;

  @SerializedName("Color")
  private Color color = null;

  @SerializedName("BorderColorType")
  private String borderColorType = null;

  @SerializedName("ColorType")
  private String colorType = null;

  public NegativeBarFormat borderColor(Color borderColor) {
    this.borderColor = borderColor;
    return this;
  }

   /**
   * Gets or sets a FormatColor object that you can use to specify the border    color for negative data bars.             
   * @return borderColor
  **/
  @ApiModelProperty(value = "Gets or sets a FormatColor object that you can use to specify the border    color for negative data bars.             ")
  public Color getBorderColor() {
    return borderColor;
  }

  public void setBorderColor(Color borderColor) {
    this.borderColor = borderColor;
  }

  public NegativeBarFormat color(Color color) {
    this.color = color;
    return this;
  }

   /**
   * Gets or sets a FormatColor object that you can use to specify the fill color    for negative data bars.             
   * @return color
  **/
  @ApiModelProperty(value = "Gets or sets a FormatColor object that you can use to specify the fill color    for negative data bars.             ")
  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public NegativeBarFormat borderColorType(String borderColorType) {
    this.borderColorType = borderColorType;
    return this;
  }

   /**
   * Gets whether to use the same border color as positive data bars.             
   * @return borderColorType
  **/
  @ApiModelProperty(value = "Gets whether to use the same border color as positive data bars.             ")
  public String getBorderColorType() {
    return borderColorType;
  }

  public void setBorderColorType(String borderColorType) {
    this.borderColorType = borderColorType;
  }

  public NegativeBarFormat colorType(String colorType) {
    this.colorType = colorType;
    return this;
  }

   /**
   * Gets or sets whether to use the same fill color as positive data bars.
   * @return colorType
  **/
  @ApiModelProperty(value = "Gets or sets whether to use the same fill color as positive data bars.")
  public String getColorType() {
    return colorType;
  }

  public void setColorType(String colorType) {
    this.colorType = colorType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NegativeBarFormat negativeBarFormat = (NegativeBarFormat) o;
    return Objects.equals(this.borderColor, negativeBarFormat.borderColor) &&
        Objects.equals(this.color, negativeBarFormat.color) &&
        Objects.equals(this.borderColorType, negativeBarFormat.borderColorType) &&
        Objects.equals(this.colorType, negativeBarFormat.colorType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(borderColor, color, borderColorType, colorType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NegativeBarFormat {\n");
    
    sb.append("    borderColor: ").append(toIndentedString(borderColor)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    borderColorType: ").append(toIndentedString(borderColorType)).append("\n");
    sb.append("    colorType: ").append(toIndentedString(colorType)).append("\n");
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

