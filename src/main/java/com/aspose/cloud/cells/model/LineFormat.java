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
import com.aspose.cloud.cells.model.FillFormat;
import com.aspose.cloud.cells.model.GradientFill;
import com.aspose.cloud.cells.model.PatternFill;
import com.aspose.cloud.cells.model.SolidFill;
import com.aspose.cloud.cells.model.TextureFill;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * LineFormat
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-08T17:58:31.285-06:00")
public class LineFormat {
  @SerializedName("TextureFill")
  private TextureFill textureFill = null;

  @SerializedName("ImageData")
  private byte[] imageData = null;

  @SerializedName("PatternFill")
  private PatternFill patternFill = null;

  @SerializedName("SolidFill")
  private SolidFill solidFill = null;

  @SerializedName("GradientFill")
  private GradientFill gradientFill = null;

  @SerializedName("Type")
  private String type = null;

  @SerializedName("BeginArrowheadLength")
  private String beginArrowheadLength = null;

  @SerializedName("DashStyle")
  private String dashStyle = null;

  @SerializedName("EndArrowheadWidth")
  private String endArrowheadWidth = null;

  @SerializedName("EndArrowheadLength")
  private String endArrowheadLength = null;

  @SerializedName("BeginArrowheadWidth")
  private String beginArrowheadWidth = null;

  @SerializedName("CompoundType")
  private String compoundType = null;

  @SerializedName("JoinType")
  private String joinType = null;

  @SerializedName("Weight")
  private Double weight = null;

  @SerializedName("BeginArrowheadStyle")
  private String beginArrowheadStyle = null;

  @SerializedName("EndArrowheadStyle")
  private String endArrowheadStyle = null;

  @SerializedName("CapType")
  private String capType = null;

  public LineFormat textureFill(TextureFill textureFill) {
    this.textureFill = textureFill;
    return this;
  }

   /**
   * Get textureFill
   * @return textureFill
  **/
  @ApiModelProperty(value = "")
  public TextureFill getTextureFill() {
    return textureFill;
  }

  public void setTextureFill(TextureFill textureFill) {
    this.textureFill = textureFill;
  }

  public LineFormat imageData(byte[] imageData) {
    this.imageData = imageData;
    return this;
  }

   /**
   * Get imageData
   * @return imageData
  **/
  @ApiModelProperty(value = "")
  public byte[] getImageData() {
    return imageData;
  }

  public void setImageData(byte[] imageData) {
    this.imageData = imageData;
  }

  public LineFormat patternFill(PatternFill patternFill) {
    this.patternFill = patternFill;
    return this;
  }

   /**
   * Get patternFill
   * @return patternFill
  **/
  @ApiModelProperty(value = "")
  public PatternFill getPatternFill() {
    return patternFill;
  }

  public void setPatternFill(PatternFill patternFill) {
    this.patternFill = patternFill;
  }

  public LineFormat solidFill(SolidFill solidFill) {
    this.solidFill = solidFill;
    return this;
  }

   /**
   * Get solidFill
   * @return solidFill
  **/
  @ApiModelProperty(value = "")
  public SolidFill getSolidFill() {
    return solidFill;
  }

  public void setSolidFill(SolidFill solidFill) {
    this.solidFill = solidFill;
  }

  public LineFormat gradientFill(GradientFill gradientFill) {
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

  public LineFormat type(String type) {
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

  public LineFormat beginArrowheadLength(String beginArrowheadLength) {
    this.beginArrowheadLength = beginArrowheadLength;
    return this;
  }

   /**
   * Get beginArrowheadLength
   * @return beginArrowheadLength
  **/
  @ApiModelProperty(value = "")
  public String getBeginArrowheadLength() {
    return beginArrowheadLength;
  }

  public void setBeginArrowheadLength(String beginArrowheadLength) {
    this.beginArrowheadLength = beginArrowheadLength;
  }

  public LineFormat dashStyle(String dashStyle) {
    this.dashStyle = dashStyle;
    return this;
  }

   /**
   * Get dashStyle
   * @return dashStyle
  **/
  @ApiModelProperty(value = "")
  public String getDashStyle() {
    return dashStyle;
  }

  public void setDashStyle(String dashStyle) {
    this.dashStyle = dashStyle;
  }

  public LineFormat endArrowheadWidth(String endArrowheadWidth) {
    this.endArrowheadWidth = endArrowheadWidth;
    return this;
  }

   /**
   * Get endArrowheadWidth
   * @return endArrowheadWidth
  **/
  @ApiModelProperty(value = "")
  public String getEndArrowheadWidth() {
    return endArrowheadWidth;
  }

  public void setEndArrowheadWidth(String endArrowheadWidth) {
    this.endArrowheadWidth = endArrowheadWidth;
  }

  public LineFormat endArrowheadLength(String endArrowheadLength) {
    this.endArrowheadLength = endArrowheadLength;
    return this;
  }

   /**
   * Get endArrowheadLength
   * @return endArrowheadLength
  **/
  @ApiModelProperty(value = "")
  public String getEndArrowheadLength() {
    return endArrowheadLength;
  }

  public void setEndArrowheadLength(String endArrowheadLength) {
    this.endArrowheadLength = endArrowheadLength;
  }

  public LineFormat beginArrowheadWidth(String beginArrowheadWidth) {
    this.beginArrowheadWidth = beginArrowheadWidth;
    return this;
  }

   /**
   * Get beginArrowheadWidth
   * @return beginArrowheadWidth
  **/
  @ApiModelProperty(value = "")
  public String getBeginArrowheadWidth() {
    return beginArrowheadWidth;
  }

  public void setBeginArrowheadWidth(String beginArrowheadWidth) {
    this.beginArrowheadWidth = beginArrowheadWidth;
  }

  public LineFormat compoundType(String compoundType) {
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

  public LineFormat joinType(String joinType) {
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

  public LineFormat weight(Double weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Get weight
   * @return weight
  **/
  @ApiModelProperty(value = "")
  public Double getWeight() {
    return weight;
  }

  public void setWeight(Double weight) {
    this.weight = weight;
  }

  public LineFormat beginArrowheadStyle(String beginArrowheadStyle) {
    this.beginArrowheadStyle = beginArrowheadStyle;
    return this;
  }

   /**
   * Get beginArrowheadStyle
   * @return beginArrowheadStyle
  **/
  @ApiModelProperty(value = "")
  public String getBeginArrowheadStyle() {
    return beginArrowheadStyle;
  }

  public void setBeginArrowheadStyle(String beginArrowheadStyle) {
    this.beginArrowheadStyle = beginArrowheadStyle;
  }

  public LineFormat endArrowheadStyle(String endArrowheadStyle) {
    this.endArrowheadStyle = endArrowheadStyle;
    return this;
  }

   /**
   * Get endArrowheadStyle
   * @return endArrowheadStyle
  **/
  @ApiModelProperty(value = "")
  public String getEndArrowheadStyle() {
    return endArrowheadStyle;
  }

  public void setEndArrowheadStyle(String endArrowheadStyle) {
    this.endArrowheadStyle = endArrowheadStyle;
  }

  public LineFormat capType(String capType) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineFormat lineFormat = (LineFormat) o;
    return Objects.equals(this.textureFill, lineFormat.textureFill) &&
        Objects.equals(this.imageData, lineFormat.imageData) &&
        Objects.equals(this.patternFill, lineFormat.patternFill) &&
        Objects.equals(this.solidFill, lineFormat.solidFill) &&
        Objects.equals(this.gradientFill, lineFormat.gradientFill) &&
        Objects.equals(this.type, lineFormat.type) &&
        Objects.equals(this.beginArrowheadLength, lineFormat.beginArrowheadLength) &&
        Objects.equals(this.dashStyle, lineFormat.dashStyle) &&
        Objects.equals(this.endArrowheadWidth, lineFormat.endArrowheadWidth) &&
        Objects.equals(this.endArrowheadLength, lineFormat.endArrowheadLength) &&
        Objects.equals(this.beginArrowheadWidth, lineFormat.beginArrowheadWidth) &&
        Objects.equals(this.compoundType, lineFormat.compoundType) &&
        Objects.equals(this.joinType, lineFormat.joinType) &&
        Objects.equals(this.weight, lineFormat.weight) &&
        Objects.equals(this.beginArrowheadStyle, lineFormat.beginArrowheadStyle) &&
        Objects.equals(this.endArrowheadStyle, lineFormat.endArrowheadStyle) &&
        Objects.equals(this.capType, lineFormat.capType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textureFill, imageData, patternFill, solidFill, gradientFill, type, beginArrowheadLength, dashStyle, endArrowheadWidth, endArrowheadLength, beginArrowheadWidth, compoundType, joinType, weight, beginArrowheadStyle, endArrowheadStyle, capType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineFormat {\n");
    
    sb.append("    textureFill: ").append(toIndentedString(textureFill)).append("\n");
    sb.append("    imageData: ").append(toIndentedString(imageData)).append("\n");
    sb.append("    patternFill: ").append(toIndentedString(patternFill)).append("\n");
    sb.append("    solidFill: ").append(toIndentedString(solidFill)).append("\n");
    sb.append("    gradientFill: ").append(toIndentedString(gradientFill)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    beginArrowheadLength: ").append(toIndentedString(beginArrowheadLength)).append("\n");
    sb.append("    dashStyle: ").append(toIndentedString(dashStyle)).append("\n");
    sb.append("    endArrowheadWidth: ").append(toIndentedString(endArrowheadWidth)).append("\n");
    sb.append("    endArrowheadLength: ").append(toIndentedString(endArrowheadLength)).append("\n");
    sb.append("    beginArrowheadWidth: ").append(toIndentedString(beginArrowheadWidth)).append("\n");
    sb.append("    compoundType: ").append(toIndentedString(compoundType)).append("\n");
    sb.append("    joinType: ").append(toIndentedString(joinType)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    beginArrowheadStyle: ").append(toIndentedString(beginArrowheadStyle)).append("\n");
    sb.append("    endArrowheadStyle: ").append(toIndentedString(endArrowheadStyle)).append("\n");
    sb.append("    capType: ").append(toIndentedString(capType)).append("\n");
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

