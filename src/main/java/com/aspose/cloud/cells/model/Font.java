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
 * Font
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-16T03:09:53.733-05:00")
public class Font {
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

  public Font isItalic(Boolean isItalic) {
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

  public Font name(String name) {
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

  public Font doubleSize(Double doubleSize) {
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

  public Font color(Color color) {
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

  public Font isBold(Boolean isBold) {
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

  public Font isSubscript(Boolean isSubscript) {
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

  public Font isSuperscript(Boolean isSuperscript) {
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

  public Font isStrikeout(Boolean isStrikeout) {
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

  public Font underline(String underline) {
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

  public Font size(Integer size) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Font font = (Font) o;
    return Objects.equals(this.isItalic, font.isItalic) &&
        Objects.equals(this.name, font.name) &&
        Objects.equals(this.doubleSize, font.doubleSize) &&
        Objects.equals(this.color, font.color) &&
        Objects.equals(this.isBold, font.isBold) &&
        Objects.equals(this.isSubscript, font.isSubscript) &&
        Objects.equals(this.isSuperscript, font.isSuperscript) &&
        Objects.equals(this.isStrikeout, font.isStrikeout) &&
        Objects.equals(this.underline, font.underline) &&
        Objects.equals(this.size, font.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isItalic, name, doubleSize, color, isBold, isSubscript, isSuperscript, isStrikeout, underline, size);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Font {\n");
    
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

