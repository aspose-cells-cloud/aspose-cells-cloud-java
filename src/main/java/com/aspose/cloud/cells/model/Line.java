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
import com.aspose.cloud.cells.model.GradientFill;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Line
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-02T09:41:11.020+08:00")
public class Line {
  @SerializedName("Style")
  private String style = null;

  @SerializedName("IsAuto")
  private Boolean isAuto = null;

  @SerializedName("BeginArrowLength")
  private String beginArrowLength = null;

  @SerializedName("Weight")
  private String weight = null;

  @SerializedName("GradientFill")
  private GradientFill gradientFill = null;

  @SerializedName("Color")
  private Color color = null;

  @SerializedName("CompoundType")
  private String compoundType = null;

  @SerializedName("WeightPt")
  private Double weightPt = null;

  @SerializedName("IsVisible")
  private Boolean isVisible = null;

  @SerializedName("JoinType")
  private String joinType = null;

  @SerializedName("EndArrowLength")
  private String endArrowLength = null;

  @SerializedName("IsAutomaticColor")
  private Boolean isAutomaticColor = null;

  @SerializedName("DashType")
  private String dashType = null;

  @SerializedName("BeginType")
  private String beginType = null;

  @SerializedName("CapType")
  private String capType = null;

  @SerializedName("EndType")
  private String endType = null;

  @SerializedName("BeginArrowWidth")
  private String beginArrowWidth = null;

  @SerializedName("EndArrowWidth")
  private String endArrowWidth = null;

  @SerializedName("Transparency")
  private Double transparency = null;

  public Line style(String style) {
    this.style = style;
    return this;
  }

   /**
   * Get style
   * @return style
  **/
  @ApiModelProperty(value = "")
  public String getStyle() {
    return style;
  }

  public void setStyle(String style) {
    this.style = style;
  }

  public Line isAuto(Boolean isAuto) {
    this.isAuto = isAuto;
    return this;
  }

   /**
   * Get isAuto
   * @return isAuto
  **/
  @ApiModelProperty(value = "")
  public Boolean IsAuto() {
    return isAuto;
  }

  public void setIsAuto(Boolean isAuto) {
    this.isAuto = isAuto;
  }

  public Line beginArrowLength(String beginArrowLength) {
    this.beginArrowLength = beginArrowLength;
    return this;
  }

   /**
   * Get beginArrowLength
   * @return beginArrowLength
  **/
  @ApiModelProperty(value = "")
  public String getBeginArrowLength() {
    return beginArrowLength;
  }

  public void setBeginArrowLength(String beginArrowLength) {
    this.beginArrowLength = beginArrowLength;
  }

  public Line weight(String weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Get weight
   * @return weight
  **/
  @ApiModelProperty(value = "")
  public String getWeight() {
    return weight;
  }

  public void setWeight(String weight) {
    this.weight = weight;
  }

  public Line gradientFill(GradientFill gradientFill) {
    this.gradientFill = gradientFill;
    return this;
  }

   /**
   * Get gradientFill
   * @return gradientFill
  **/
  @ApiModelProperty(value = "")
  public GradientFill getGradientFill() {
    return gradientFill;
  }

  public void setGradientFill(GradientFill gradientFill) {
    this.gradientFill = gradientFill;
  }

  public Line color(Color color) {
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

  public Line compoundType(String compoundType) {
    this.compoundType = compoundType;
    return this;
  }

   /**
   * Get compoundType
   * @return compoundType
  **/
  @ApiModelProperty(value = "")
  public String getCompoundType() {
    return compoundType;
  }

  public void setCompoundType(String compoundType) {
    this.compoundType = compoundType;
  }

  public Line weightPt(Double weightPt) {
    this.weightPt = weightPt;
    return this;
  }

   /**
   * Get weightPt
   * @return weightPt
  **/
  @ApiModelProperty(value = "")
  public Double getWeightPt() {
    return weightPt;
  }

  public void setWeightPt(Double weightPt) {
    this.weightPt = weightPt;
  }

  public Line isVisible(Boolean isVisible) {
    this.isVisible = isVisible;
    return this;
  }

   /**
   * Get isVisible
   * @return isVisible
  **/
  @ApiModelProperty(value = "")
  public Boolean IsVisible() {
    return isVisible;
  }

  public void setIsVisible(Boolean isVisible) {
    this.isVisible = isVisible;
  }

  public Line joinType(String joinType) {
    this.joinType = joinType;
    return this;
  }

   /**
   * Get joinType
   * @return joinType
  **/
  @ApiModelProperty(value = "")
  public String getJoinType() {
    return joinType;
  }

  public void setJoinType(String joinType) {
    this.joinType = joinType;
  }

  public Line endArrowLength(String endArrowLength) {
    this.endArrowLength = endArrowLength;
    return this;
  }

   /**
   * Get endArrowLength
   * @return endArrowLength
  **/
  @ApiModelProperty(value = "")
  public String getEndArrowLength() {
    return endArrowLength;
  }

  public void setEndArrowLength(String endArrowLength) {
    this.endArrowLength = endArrowLength;
  }

  public Line isAutomaticColor(Boolean isAutomaticColor) {
    this.isAutomaticColor = isAutomaticColor;
    return this;
  }

   /**
   * Get isAutomaticColor
   * @return isAutomaticColor
  **/
  @ApiModelProperty(value = "")
  public Boolean IsAutomaticColor() {
    return isAutomaticColor;
  }

  public void setIsAutomaticColor(Boolean isAutomaticColor) {
    this.isAutomaticColor = isAutomaticColor;
  }

  public Line dashType(String dashType) {
    this.dashType = dashType;
    return this;
  }

   /**
   * Get dashType
   * @return dashType
  **/
  @ApiModelProperty(value = "")
  public String getDashType() {
    return dashType;
  }

  public void setDashType(String dashType) {
    this.dashType = dashType;
  }

  public Line beginType(String beginType) {
    this.beginType = beginType;
    return this;
  }

   /**
   * Get beginType
   * @return beginType
  **/
  @ApiModelProperty(value = "")
  public String getBeginType() {
    return beginType;
  }

  public void setBeginType(String beginType) {
    this.beginType = beginType;
  }

  public Line capType(String capType) {
    this.capType = capType;
    return this;
  }

   /**
   * Get capType
   * @return capType
  **/
  @ApiModelProperty(value = "")
  public String getCapType() {
    return capType;
  }

  public void setCapType(String capType) {
    this.capType = capType;
  }

  public Line endType(String endType) {
    this.endType = endType;
    return this;
  }

   /**
   * Get endType
   * @return endType
  **/
  @ApiModelProperty(value = "")
  public String getEndType() {
    return endType;
  }

  public void setEndType(String endType) {
    this.endType = endType;
  }

  public Line beginArrowWidth(String beginArrowWidth) {
    this.beginArrowWidth = beginArrowWidth;
    return this;
  }

   /**
   * Get beginArrowWidth
   * @return beginArrowWidth
  **/
  @ApiModelProperty(value = "")
  public String getBeginArrowWidth() {
    return beginArrowWidth;
  }

  public void setBeginArrowWidth(String beginArrowWidth) {
    this.beginArrowWidth = beginArrowWidth;
  }

  public Line endArrowWidth(String endArrowWidth) {
    this.endArrowWidth = endArrowWidth;
    return this;
  }

   /**
   * Get endArrowWidth
   * @return endArrowWidth
  **/
  @ApiModelProperty(value = "")
  public String getEndArrowWidth() {
    return endArrowWidth;
  }

  public void setEndArrowWidth(String endArrowWidth) {
    this.endArrowWidth = endArrowWidth;
  }

  public Line transparency(Double transparency) {
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
    Line line = (Line) o;
    return Objects.equals(this.style, line.style) &&
        Objects.equals(this.isAuto, line.isAuto) &&
        Objects.equals(this.beginArrowLength, line.beginArrowLength) &&
        Objects.equals(this.weight, line.weight) &&
        Objects.equals(this.gradientFill, line.gradientFill) &&
        Objects.equals(this.color, line.color) &&
        Objects.equals(this.compoundType, line.compoundType) &&
        Objects.equals(this.weightPt, line.weightPt) &&
        Objects.equals(this.isVisible, line.isVisible) &&
        Objects.equals(this.joinType, line.joinType) &&
        Objects.equals(this.endArrowLength, line.endArrowLength) &&
        Objects.equals(this.isAutomaticColor, line.isAutomaticColor) &&
        Objects.equals(this.dashType, line.dashType) &&
        Objects.equals(this.beginType, line.beginType) &&
        Objects.equals(this.capType, line.capType) &&
        Objects.equals(this.endType, line.endType) &&
        Objects.equals(this.beginArrowWidth, line.beginArrowWidth) &&
        Objects.equals(this.endArrowWidth, line.endArrowWidth) &&
        Objects.equals(this.transparency, line.transparency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(style, isAuto, beginArrowLength, weight, gradientFill, color, compoundType, weightPt, isVisible, joinType, endArrowLength, isAutomaticColor, dashType, beginType, capType, endType, beginArrowWidth, endArrowWidth, transparency);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Line {\n");
    
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
    sb.append("    isAuto: ").append(toIndentedString(isAuto)).append("\n");
    sb.append("    beginArrowLength: ").append(toIndentedString(beginArrowLength)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    gradientFill: ").append(toIndentedString(gradientFill)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    compoundType: ").append(toIndentedString(compoundType)).append("\n");
    sb.append("    weightPt: ").append(toIndentedString(weightPt)).append("\n");
    sb.append("    isVisible: ").append(toIndentedString(isVisible)).append("\n");
    sb.append("    joinType: ").append(toIndentedString(joinType)).append("\n");
    sb.append("    endArrowLength: ").append(toIndentedString(endArrowLength)).append("\n");
    sb.append("    isAutomaticColor: ").append(toIndentedString(isAutomaticColor)).append("\n");
    sb.append("    dashType: ").append(toIndentedString(dashType)).append("\n");
    sb.append("    beginType: ").append(toIndentedString(beginType)).append("\n");
    sb.append("    capType: ").append(toIndentedString(capType)).append("\n");
    sb.append("    endType: ").append(toIndentedString(endType)).append("\n");
    sb.append("    beginArrowWidth: ").append(toIndentedString(beginArrowWidth)).append("\n");
    sb.append("    endArrowWidth: ").append(toIndentedString(endArrowWidth)).append("\n");
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

