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
import com.aspose.cloud.cells.model.Color;
import com.aspose.cloud.cells.model.ConditionalFormattingValue;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Describe the ColorScale conditional formatting rule. This conditional formatting    rule creates a gradated color scale on the cells.             
 */
@ApiModel(description = "Describe the ColorScale conditional formatting rule. This conditional formatting    rule creates a gradated color scale on the cells.             ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-24T14:56:32.974+08:00")
public class ColorScale {
  @SerializedName("MaxCfvo")
  private ConditionalFormattingValue maxCfvo = null;

  @SerializedName("MidColor")
  private Color midColor = null;

  @SerializedName("MinColor")
  private Color minColor = null;

  @SerializedName("MidCfvo")
  private ConditionalFormattingValue midCfvo = null;

  @SerializedName("MinCfvo")
  private ConditionalFormattingValue minCfvo = null;

  @SerializedName("MaxColor")
  private Color maxColor = null;

  public ColorScale maxCfvo(ConditionalFormattingValue maxCfvo) {
    this.maxCfvo = maxCfvo;
    return this;
  }

   /**
   * Get or set this ColorScale&#39;s max value object.  Cannot set null or CFValueObject     with type FormatConditionValueType.Min to it.
   * @return maxCfvo
  **/
  @ApiModelProperty(value = "Get or set this ColorScale's max value object.  Cannot set null or CFValueObject     with type FormatConditionValueType.Min to it.")
  public ConditionalFormattingValue getMaxCfvo() {
    return maxCfvo;
  }

  public void setMaxCfvo(ConditionalFormattingValue maxCfvo) {
    this.maxCfvo = maxCfvo;
  }

  public ColorScale midColor(Color midColor) {
    this.midColor = midColor;
    return this;
  }

   /**
   * Get or set the mid value object&#39;s corresponding color.             
   * @return midColor
  **/
  @ApiModelProperty(value = "Get or set the mid value object's corresponding color.             ")
  public Color getMidColor() {
    return midColor;
  }

  public void setMidColor(Color midColor) {
    this.midColor = midColor;
  }

  public ColorScale minColor(Color minColor) {
    this.minColor = minColor;
    return this;
  }

   /**
   * Get or set the min value object&#39;s corresponding color.
   * @return minColor
  **/
  @ApiModelProperty(value = "Get or set the min value object's corresponding color.")
  public Color getMinColor() {
    return minColor;
  }

  public void setMinColor(Color minColor) {
    this.minColor = minColor;
  }

  public ColorScale midCfvo(ConditionalFormattingValue midCfvo) {
    this.midCfvo = midCfvo;
    return this;
  }

   /**
   * Get or set this ColorScale&#39;s mid value object.  Cannot set CFValueObject    with type FormatConditionValueType.Max or FormatConditionValueType.Min to    it.             
   * @return midCfvo
  **/
  @ApiModelProperty(value = "Get or set this ColorScale's mid value object.  Cannot set CFValueObject    with type FormatConditionValueType.Max or FormatConditionValueType.Min to    it.             ")
  public ConditionalFormattingValue getMidCfvo() {
    return midCfvo;
  }

  public void setMidCfvo(ConditionalFormattingValue midCfvo) {
    this.midCfvo = midCfvo;
  }

  public ColorScale minCfvo(ConditionalFormattingValue minCfvo) {
    this.minCfvo = minCfvo;
    return this;
  }

   /**
   * Get or set this ColorScale&#39;s min value object.  Cannot set null or CFValueObject    with type FormatConditionValueType.Max to it.             
   * @return minCfvo
  **/
  @ApiModelProperty(value = "Get or set this ColorScale's min value object.  Cannot set null or CFValueObject    with type FormatConditionValueType.Max to it.             ")
  public ConditionalFormattingValue getMinCfvo() {
    return minCfvo;
  }

  public void setMinCfvo(ConditionalFormattingValue minCfvo) {
    this.minCfvo = minCfvo;
  }

  public ColorScale maxColor(Color maxColor) {
    this.maxColor = maxColor;
    return this;
  }

   /**
   * Get or set the max value object&#39;s corresponding color.
   * @return maxColor
  **/
  @ApiModelProperty(value = "Get or set the max value object's corresponding color.")
  public Color getMaxColor() {
    return maxColor;
  }

  public void setMaxColor(Color maxColor) {
    this.maxColor = maxColor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ColorScale colorScale = (ColorScale) o;
    return Objects.equals(this.maxCfvo, colorScale.maxCfvo) &&
        Objects.equals(this.midColor, colorScale.midColor) &&
        Objects.equals(this.minColor, colorScale.minColor) &&
        Objects.equals(this.midCfvo, colorScale.midCfvo) &&
        Objects.equals(this.minCfvo, colorScale.minCfvo) &&
        Objects.equals(this.maxColor, colorScale.maxColor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxCfvo, midColor, minColor, midCfvo, minCfvo, maxColor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ColorScale {\n");
    
    sb.append("    maxCfvo: ").append(toIndentedString(maxCfvo)).append("\n");
    sb.append("    midColor: ").append(toIndentedString(midColor)).append("\n");
    sb.append("    minColor: ").append(toIndentedString(minColor)).append("\n");
    sb.append("    midCfvo: ").append(toIndentedString(midCfvo)).append("\n");
    sb.append("    minCfvo: ").append(toIndentedString(minCfvo)).append("\n");
    sb.append("    maxColor: ").append(toIndentedString(maxColor)).append("\n");
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

