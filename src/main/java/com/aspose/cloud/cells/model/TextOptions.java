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
import com.aspose.cloud.cells.model.FillFormat;
import com.aspose.cloud.cells.model.Font;
import com.aspose.cloud.cells.model.LineFormat;
import com.aspose.cloud.cells.model.ShadowEffect;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TextOptions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-07-08T01:54:35.499-05:00")
public class TextOptions {
  @SerializedName("IsItalic")
  private Boolean isItalic = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("DoubleSize")
  private Double doubleSize = null;

  @SerializedName("Color")
  private Color color = null;

  @SerializedName("IsBold")
  private Boolean isBold = null;

  @SerializedName("IsSubscript")
  private Boolean isSubscript = null;

  @SerializedName("IsSuperscript")
  private Boolean isSuperscript = null;

  @SerializedName("IsStrikeout")
  private Boolean isStrikeout = null;

  @SerializedName("Underline")
  private String underline = null;

  @SerializedName("Size")
  private Integer size = null;

  @SerializedName("Outline")
  private LineFormat outline = null;

  @SerializedName("Spacing")
  private Double spacing = null;

  @SerializedName("Kerning")
  private Double kerning = null;

  @SerializedName("Shadow")
  private ShadowEffect shadow = null;

  @SerializedName("Fill")
  private FillFormat fill = null;

  @SerializedName("UnderlineColor")
  private CellsColor underlineColor = null;

  public TextOptions isItalic(Boolean isItalic) {
    this.isItalic = isItalic;
    return this;
  }

   /**
   * Get isItalic
   * @return isItalic
  **/
  @ApiModelProperty(value = "")
  public Boolean IsItalic() {
    return isItalic;
  }

  public void setIsItalic(Boolean isItalic) {
    this.isItalic = isItalic;
  }

  public TextOptions name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TextOptions doubleSize(Double doubleSize) {
    this.doubleSize = doubleSize;
    return this;
  }

   /**
   * Get doubleSize
   * @return doubleSize
  **/
  @ApiModelProperty(value = "")
  public Double getDoubleSize() {
    return doubleSize;
  }

  public void setDoubleSize(Double doubleSize) {
    this.doubleSize = doubleSize;
  }

  public TextOptions color(Color color) {
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

  public TextOptions isBold(Boolean isBold) {
    this.isBold = isBold;
    return this;
  }

   /**
   * Get isBold
   * @return isBold
  **/
  @ApiModelProperty(value = "")
  public Boolean IsBold() {
    return isBold;
  }

  public void setIsBold(Boolean isBold) {
    this.isBold = isBold;
  }

  public TextOptions isSubscript(Boolean isSubscript) {
    this.isSubscript = isSubscript;
    return this;
  }

   /**
   * Get isSubscript
   * @return isSubscript
  **/
  @ApiModelProperty(value = "")
  public Boolean IsSubscript() {
    return isSubscript;
  }

  public void setIsSubscript(Boolean isSubscript) {
    this.isSubscript = isSubscript;
  }

  public TextOptions isSuperscript(Boolean isSuperscript) {
    this.isSuperscript = isSuperscript;
    return this;
  }

   /**
   * Get isSuperscript
   * @return isSuperscript
  **/
  @ApiModelProperty(value = "")
  public Boolean IsSuperscript() {
    return isSuperscript;
  }

  public void setIsSuperscript(Boolean isSuperscript) {
    this.isSuperscript = isSuperscript;
  }

  public TextOptions isStrikeout(Boolean isStrikeout) {
    this.isStrikeout = isStrikeout;
    return this;
  }

   /**
   * Get isStrikeout
   * @return isStrikeout
  **/
  @ApiModelProperty(value = "")
  public Boolean IsStrikeout() {
    return isStrikeout;
  }

  public void setIsStrikeout(Boolean isStrikeout) {
    this.isStrikeout = isStrikeout;
  }

  public TextOptions underline(String underline) {
    this.underline = underline;
    return this;
  }

   /**
   * Get underline
   * @return underline
  **/
  @ApiModelProperty(value = "")
  public String getUnderline() {
    return underline;
  }

  public void setUnderline(String underline) {
    this.underline = underline;
  }

  public TextOptions size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(value = "")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public TextOptions outline(LineFormat outline) {
    this.outline = outline;
    return this;
  }

   /**
   * Get outline
   * @return outline
  **/
  @ApiModelProperty(value = "")
  public LineFormat getOutline() {
    return outline;
  }

  public void setOutline(LineFormat outline) {
    this.outline = outline;
  }

  public TextOptions spacing(Double spacing) {
    this.spacing = spacing;
    return this;
  }

   /**
   * Get spacing
   * @return spacing
  **/
  @ApiModelProperty(value = "")
  public Double getSpacing() {
    return spacing;
  }

  public void setSpacing(Double spacing) {
    this.spacing = spacing;
  }

  public TextOptions kerning(Double kerning) {
    this.kerning = kerning;
    return this;
  }

   /**
   * Get kerning
   * @return kerning
  **/
  @ApiModelProperty(value = "")
  public Double getKerning() {
    return kerning;
  }

  public void setKerning(Double kerning) {
    this.kerning = kerning;
  }

  public TextOptions shadow(ShadowEffect shadow) {
    this.shadow = shadow;
    return this;
  }

   /**
   * Get shadow
   * @return shadow
  **/
  @ApiModelProperty(value = "")
  public ShadowEffect getShadow() {
    return shadow;
  }

  public void setShadow(ShadowEffect shadow) {
    this.shadow = shadow;
  }

  public TextOptions fill(FillFormat fill) {
    this.fill = fill;
    return this;
  }

   /**
   * Get fill
   * @return fill
  **/
  @ApiModelProperty(value = "")
  public FillFormat getFill() {
    return fill;
  }

  public void setFill(FillFormat fill) {
    this.fill = fill;
  }

  public TextOptions underlineColor(CellsColor underlineColor) {
    this.underlineColor = underlineColor;
    return this;
  }

   /**
   * Get underlineColor
   * @return underlineColor
  **/
  @ApiModelProperty(value = "")
  public CellsColor getUnderlineColor() {
    return underlineColor;
  }

  public void setUnderlineColor(CellsColor underlineColor) {
    this.underlineColor = underlineColor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextOptions textOptions = (TextOptions) o;
    return Objects.equals(this.isItalic, textOptions.isItalic) &&
        Objects.equals(this.name, textOptions.name) &&
        Objects.equals(this.doubleSize, textOptions.doubleSize) &&
        Objects.equals(this.color, textOptions.color) &&
        Objects.equals(this.isBold, textOptions.isBold) &&
        Objects.equals(this.isSubscript, textOptions.isSubscript) &&
        Objects.equals(this.isSuperscript, textOptions.isSuperscript) &&
        Objects.equals(this.isStrikeout, textOptions.isStrikeout) &&
        Objects.equals(this.underline, textOptions.underline) &&
        Objects.equals(this.size, textOptions.size) &&
        Objects.equals(this.outline, textOptions.outline) &&
        Objects.equals(this.spacing, textOptions.spacing) &&
        Objects.equals(this.kerning, textOptions.kerning) &&
        Objects.equals(this.shadow, textOptions.shadow) &&
        Objects.equals(this.fill, textOptions.fill) &&
        Objects.equals(this.underlineColor, textOptions.underlineColor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isItalic, name, doubleSize, color, isBold, isSubscript, isSuperscript, isStrikeout, underline, size, outline, spacing, kerning, shadow, fill, underlineColor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextOptions {\n");
    
    sb.append("    isItalic: ").append(toIndentedString(isItalic)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    doubleSize: ").append(toIndentedString(doubleSize)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    isBold: ").append(toIndentedString(isBold)).append("\n");
    sb.append("    isSubscript: ").append(toIndentedString(isSubscript)).append("\n");
    sb.append("    isSuperscript: ").append(toIndentedString(isSuperscript)).append("\n");
    sb.append("    isStrikeout: ").append(toIndentedString(isStrikeout)).append("\n");
    sb.append("    underline: ").append(toIndentedString(underline)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    outline: ").append(toIndentedString(outline)).append("\n");
    sb.append("    spacing: ").append(toIndentedString(spacing)).append("\n");
    sb.append("    kerning: ").append(toIndentedString(kerning)).append("\n");
    sb.append("    shadow: ").append(toIndentedString(shadow)).append("\n");
    sb.append("    fill: ").append(toIndentedString(fill)).append("\n");
    sb.append("    underlineColor: ").append(toIndentedString(underlineColor)).append("\n");
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

