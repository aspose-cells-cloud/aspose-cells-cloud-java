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
import com.aspose.cloud.cells.model.Font;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TickLabels
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-05T06:46:52.811-06:00")
public class TickLabels {
  @SerializedName("AutoScaleFont")
  private Boolean autoScaleFont = null;

  @SerializedName("Font")
  private Font font = null;

  @SerializedName("BackgroundMode")
  private String backgroundMode = null;

  @SerializedName("Number")
  private Integer number = null;

  @SerializedName("NumberFormat")
  private String numberFormat = null;

  @SerializedName("NumberFormatLinked")
  private Boolean numberFormatLinked = null;

  @SerializedName("Offset")
  private Integer offset = null;

  @SerializedName("RotationAngle")
  private Integer rotationAngle = null;

  @SerializedName("TextDirection")
  private String textDirection = null;

  @SerializedName("ReadingOrder")
  private String readingOrder = null;

  @SerializedName("DirectionType")
  private String directionType = null;

  public TickLabels autoScaleFont(Boolean autoScaleFont) {
    this.autoScaleFont = autoScaleFont;
    return this;
  }

   /**
   *  
   * @return autoScaleFont
  **/
  @ApiModelProperty(value = " ")
  public Boolean AutoScaleFont() {
    return autoScaleFont;
  }

  public void setAutoScaleFont(Boolean autoScaleFont) {
    this.autoScaleFont = autoScaleFont;
  }

  public TickLabels font(Font font) {
    this.font = font;
    return this;
  }

   /**
   * 
   * @return font
  **/
  @ApiModelProperty(value = "")
  public Font getFont() {
    return font;
  }

  public void setFont(Font font) {
    this.font = font;
  }

  public TickLabels backgroundMode(String backgroundMode) {
    this.backgroundMode = backgroundMode;
    return this;
  }

   /**
   *  
   * @return backgroundMode
  **/
  @ApiModelProperty(value = " ")
  public String getBackgroundMode() {
    return backgroundMode;
  }

  public void setBackgroundMode(String backgroundMode) {
    this.backgroundMode = backgroundMode;
  }

  public TickLabels number(Integer number) {
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @ApiModelProperty(value = "")
  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public TickLabels numberFormat(String numberFormat) {
    this.numberFormat = numberFormat;
    return this;
  }

   /**
   *  
   * @return numberFormat
  **/
  @ApiModelProperty(value = " ")
  public String getNumberFormat() {
    return numberFormat;
  }

  public void setNumberFormat(String numberFormat) {
    this.numberFormat = numberFormat;
  }

  public TickLabels numberFormatLinked(Boolean numberFormatLinked) {
    this.numberFormatLinked = numberFormatLinked;
    return this;
  }

   /**
   *  
   * @return numberFormatLinked
  **/
  @ApiModelProperty(value = " ")
  public Boolean NumberFormatLinked() {
    return numberFormatLinked;
  }

  public void setNumberFormatLinked(Boolean numberFormatLinked) {
    this.numberFormatLinked = numberFormatLinked;
  }

  public TickLabels offset(Integer offset) {
    this.offset = offset;
    return this;
  }

   /**
   *  
   * @return offset
  **/
  @ApiModelProperty(value = " ")
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public TickLabels rotationAngle(Integer rotationAngle) {
    this.rotationAngle = rotationAngle;
    return this;
  }

   /**
   *  
   * @return rotationAngle
  **/
  @ApiModelProperty(value = " ")
  public Integer getRotationAngle() {
    return rotationAngle;
  }

  public void setRotationAngle(Integer rotationAngle) {
    this.rotationAngle = rotationAngle;
  }

  public TickLabels textDirection(String textDirection) {
    this.textDirection = textDirection;
    return this;
  }

   /**
   *  
   * @return textDirection
  **/
  @ApiModelProperty(value = " ")
  public String getTextDirection() {
    return textDirection;
  }

  public void setTextDirection(String textDirection) {
    this.textDirection = textDirection;
  }

  public TickLabels readingOrder(String readingOrder) {
    this.readingOrder = readingOrder;
    return this;
  }

   /**
   *  
   * @return readingOrder
  **/
  @ApiModelProperty(value = " ")
  public String getReadingOrder() {
    return readingOrder;
  }

  public void setReadingOrder(String readingOrder) {
    this.readingOrder = readingOrder;
  }

  public TickLabels directionType(String directionType) {
    this.directionType = directionType;
    return this;
  }

   /**
   *  
   * @return directionType
  **/
  @ApiModelProperty(value = " ")
  public String getDirectionType() {
    return directionType;
  }

  public void setDirectionType(String directionType) {
    this.directionType = directionType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TickLabels tickLabels = (TickLabels) o;
    return Objects.equals(this.autoScaleFont, tickLabels.autoScaleFont) &&
        Objects.equals(this.font, tickLabels.font) &&
        Objects.equals(this.backgroundMode, tickLabels.backgroundMode) &&
        Objects.equals(this.number, tickLabels.number) &&
        Objects.equals(this.numberFormat, tickLabels.numberFormat) &&
        Objects.equals(this.numberFormatLinked, tickLabels.numberFormatLinked) &&
        Objects.equals(this.offset, tickLabels.offset) &&
        Objects.equals(this.rotationAngle, tickLabels.rotationAngle) &&
        Objects.equals(this.textDirection, tickLabels.textDirection) &&
        Objects.equals(this.readingOrder, tickLabels.readingOrder) &&
        Objects.equals(this.directionType, tickLabels.directionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoScaleFont, font, backgroundMode, number, numberFormat, numberFormatLinked, offset, rotationAngle, textDirection, readingOrder, directionType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TickLabels {\n");
    
    sb.append("    autoScaleFont: ").append(toIndentedString(autoScaleFont)).append("\n");
    sb.append("    font: ").append(toIndentedString(font)).append("\n");
    sb.append("    backgroundMode: ").append(toIndentedString(backgroundMode)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    numberFormat: ").append(toIndentedString(numberFormat)).append("\n");
    sb.append("    numberFormatLinked: ").append(toIndentedString(numberFormatLinked)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    rotationAngle: ").append(toIndentedString(rotationAngle)).append("\n");
    sb.append("    textDirection: ").append(toIndentedString(textDirection)).append("\n");
    sb.append("    readingOrder: ").append(toIndentedString(readingOrder)).append("\n");
    sb.append("    directionType: ").append(toIndentedString(directionType)).append("\n");
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

