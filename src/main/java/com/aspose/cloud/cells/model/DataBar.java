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
import com.aspose.cloud.cells.model.ConditionalFormattingValue;
import com.aspose.cloud.cells.model.DataBarBorder;
import com.aspose.cloud.cells.model.NegativeBarFormat;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Describe the DataBar conditional formatting rule. This conditional formatting    rule displays a gradated data bar in the range of cells.
 */
@ApiModel(description = "Describe the DataBar conditional formatting rule. This conditional formatting    rule displays a gradated data bar in the range of cells.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-19T15:56:27.996+08:00")
public class DataBar {
  @SerializedName("Direction")
  private String direction = null;

  @SerializedName("MaxCfvo")
  private ConditionalFormattingValue maxCfvo = null;

  @SerializedName("Color")
  private Color color = null;

  @SerializedName("MinLength")
  private Integer minLength = null;

  @SerializedName("BarFillType")
  private String barFillType = null;

  @SerializedName("MinCfvo")
  private ConditionalFormattingValue minCfvo = null;

  @SerializedName("AxisPosition")
  private String axisPosition = null;

  @SerializedName("NegativeBarFormat")
  private NegativeBarFormat negativeBarFormat = null;

  @SerializedName("BarBorder")
  private DataBarBorder barBorder = null;

  @SerializedName("AxisColor")
  private Color axisColor = null;

  @SerializedName("MaxLength")
  private Integer maxLength = null;

  @SerializedName("ShowValue")
  private Boolean showValue = null;

  public DataBar direction(String direction) {
    this.direction = direction;
    return this;
  }

   /**
   * Gets or sets the direction the databar is displayed.
   * @return direction
  **/
  @ApiModelProperty(value = "Gets or sets the direction the databar is displayed.")
  public String getDirection() {
    return direction;
  }

  public void setDirection(String direction) {
    this.direction = direction;
  }

  public DataBar maxCfvo(ConditionalFormattingValue maxCfvo) {
    this.maxCfvo = maxCfvo;
    return this;
  }

   /**
   * Get or set this DataBar&#39;s max value object.  Cannot set null or CFValueObject    with type FormatConditionValueType.Min to it.             
   * @return maxCfvo
  **/
  @ApiModelProperty(value = "Get or set this DataBar's max value object.  Cannot set null or CFValueObject    with type FormatConditionValueType.Min to it.             ")
  public ConditionalFormattingValue getMaxCfvo() {
    return maxCfvo;
  }

  public void setMaxCfvo(ConditionalFormattingValue maxCfvo) {
    this.maxCfvo = maxCfvo;
  }

  public DataBar color(Color color) {
    this.color = color;
    return this;
  }

   /**
   * Get or set this DataBar&#39;s Color.             
   * @return color
  **/
  @ApiModelProperty(value = "Get or set this DataBar's Color.             ")
  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public DataBar minLength(Integer minLength) {
    this.minLength = minLength;
    return this;
  }

   /**
   * Represents the min length of data bar .             
   * @return minLength
  **/
  @ApiModelProperty(value = "Represents the min length of data bar .             ")
  public Integer getMinLength() {
    return minLength;
  }

  public void setMinLength(Integer minLength) {
    this.minLength = minLength;
  }

  public DataBar barFillType(String barFillType) {
    this.barFillType = barFillType;
    return this;
  }

   /**
   * Gets or sets how a data bar is filled with color.
   * @return barFillType
  **/
  @ApiModelProperty(value = "Gets or sets how a data bar is filled with color.")
  public String getBarFillType() {
    return barFillType;
  }

  public void setBarFillType(String barFillType) {
    this.barFillType = barFillType;
  }

  public DataBar minCfvo(ConditionalFormattingValue minCfvo) {
    this.minCfvo = minCfvo;
    return this;
  }

   /**
   * Get or set this DataBar&#39;s min value object.  Cannot set null or CFValueObject   with type FormatConditionValueType.Max to it.             
   * @return minCfvo
  **/
  @ApiModelProperty(value = "Get or set this DataBar's min value object.  Cannot set null or CFValueObject   with type FormatConditionValueType.Max to it.             ")
  public ConditionalFormattingValue getMinCfvo() {
    return minCfvo;
  }

  public void setMinCfvo(ConditionalFormattingValue minCfvo) {
    this.minCfvo = minCfvo;
  }

  public DataBar axisPosition(String axisPosition) {
    this.axisPosition = axisPosition;
    return this;
  }

   /**
   * Gets or sets the position of the axis of the data bars specified by a conditional    formatting rule.
   * @return axisPosition
  **/
  @ApiModelProperty(value = "Gets or sets the position of the axis of the data bars specified by a conditional    formatting rule.")
  public String getAxisPosition() {
    return axisPosition;
  }

  public void setAxisPosition(String axisPosition) {
    this.axisPosition = axisPosition;
  }

  public DataBar negativeBarFormat(NegativeBarFormat negativeBarFormat) {
    this.negativeBarFormat = negativeBarFormat;
    return this;
  }

   /**
   * Gets the NegativeBarFormat object associated with a data bar conditional     formatting rule.
   * @return negativeBarFormat
  **/
  @ApiModelProperty(value = "Gets the NegativeBarFormat object associated with a data bar conditional     formatting rule.")
  public NegativeBarFormat getNegativeBarFormat() {
    return negativeBarFormat;
  }

  public void setNegativeBarFormat(NegativeBarFormat negativeBarFormat) {
    this.negativeBarFormat = negativeBarFormat;
  }

  public DataBar barBorder(DataBarBorder barBorder) {
    this.barBorder = barBorder;
    return this;
  }

   /**
   * Gets an object that specifies the border of a data bar.
   * @return barBorder
  **/
  @ApiModelProperty(value = "Gets an object that specifies the border of a data bar.")
  public DataBarBorder getBarBorder() {
    return barBorder;
  }

  public void setBarBorder(DataBarBorder barBorder) {
    this.barBorder = barBorder;
  }

  public DataBar axisColor(Color axisColor) {
    this.axisColor = axisColor;
    return this;
  }

   /**
   * Gets the color of the axis for cells with conditional formatting as data bars.
   * @return axisColor
  **/
  @ApiModelProperty(value = "Gets the color of the axis for cells with conditional formatting as data bars.")
  public Color getAxisColor() {
    return axisColor;
  }

  public void setAxisColor(Color axisColor) {
    this.axisColor = axisColor;
  }

  public DataBar maxLength(Integer maxLength) {
    this.maxLength = maxLength;
    return this;
  }

   /**
   * Represents the max length of data bar .
   * @return maxLength
  **/
  @ApiModelProperty(value = "Represents the max length of data bar .")
  public Integer getMaxLength() {
    return maxLength;
  }

  public void setMaxLength(Integer maxLength) {
    this.maxLength = maxLength;
  }

  public DataBar showValue(Boolean showValue) {
    this.showValue = showValue;
    return this;
  }

   /**
   * Get or set the flag indicating whether to show the values of the cells on   which this data bar is applied.  Default value is true.             
   * @return showValue
  **/
  @ApiModelProperty(value = "Get or set the flag indicating whether to show the values of the cells on   which this data bar is applied.  Default value is true.             ")
  public Boolean ShowValue() {
    return showValue;
  }

  public void setShowValue(Boolean showValue) {
    this.showValue = showValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataBar dataBar = (DataBar) o;
    return Objects.equals(this.direction, dataBar.direction) &&
        Objects.equals(this.maxCfvo, dataBar.maxCfvo) &&
        Objects.equals(this.color, dataBar.color) &&
        Objects.equals(this.minLength, dataBar.minLength) &&
        Objects.equals(this.barFillType, dataBar.barFillType) &&
        Objects.equals(this.minCfvo, dataBar.minCfvo) &&
        Objects.equals(this.axisPosition, dataBar.axisPosition) &&
        Objects.equals(this.negativeBarFormat, dataBar.negativeBarFormat) &&
        Objects.equals(this.barBorder, dataBar.barBorder) &&
        Objects.equals(this.axisColor, dataBar.axisColor) &&
        Objects.equals(this.maxLength, dataBar.maxLength) &&
        Objects.equals(this.showValue, dataBar.showValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(direction, maxCfvo, color, minLength, barFillType, minCfvo, axisPosition, negativeBarFormat, barBorder, axisColor, maxLength, showValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataBar {\n");
    
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    maxCfvo: ").append(toIndentedString(maxCfvo)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    minLength: ").append(toIndentedString(minLength)).append("\n");
    sb.append("    barFillType: ").append(toIndentedString(barFillType)).append("\n");
    sb.append("    minCfvo: ").append(toIndentedString(minCfvo)).append("\n");
    sb.append("    axisPosition: ").append(toIndentedString(axisPosition)).append("\n");
    sb.append("    negativeBarFormat: ").append(toIndentedString(negativeBarFormat)).append("\n");
    sb.append("    barBorder: ").append(toIndentedString(barBorder)).append("\n");
    sb.append("    axisColor: ").append(toIndentedString(axisColor)).append("\n");
    sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
    sb.append("    showValue: ").append(toIndentedString(showValue)).append("\n");
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

