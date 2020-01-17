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
import com.aspose.cloud.cells.model.CellsColor;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ShadowEffect
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-02T17:30:33.766+08:00")
public class ShadowEffect {
  @SerializedName("Distance")
  private Double distance = null;

  @SerializedName("Angle")
  private Double angle = null;

  @SerializedName("PresetType")
  private String presetType = null;

  @SerializedName("Color")
  private CellsColor color = null;

  @SerializedName("Transparency")
  private Double transparency = null;

  @SerializedName("Blur")
  private Double blur = null;

  @SerializedName("Size")
  private Double size = null;

  public ShadowEffect distance(Double distance) {
    this.distance = distance;
    return this;
  }

   /**
   * Get distance
   * @return distance
  **/
  @ApiModelProperty(value = "")
  public Double getDistance() {
    return distance;
  }

  public void setDistance(Double distance) {
    this.distance = distance;
  }

  public ShadowEffect angle(Double angle) {
    this.angle = angle;
    return this;
  }

   /**
   * Get angle
   * @return angle
  **/
  @ApiModelProperty(value = "")
  public Double getAngle() {
    return angle;
  }

  public void setAngle(Double angle) {
    this.angle = angle;
  }

  public ShadowEffect presetType(String presetType) {
    this.presetType = presetType;
    return this;
  }

   /**
   * Get presetType
   * @return presetType
  **/
  @ApiModelProperty(value = "")
  public String getPresetType() {
    return presetType;
  }

  public void setPresetType(String presetType) {
    this.presetType = presetType;
  }

  public ShadowEffect color(CellsColor color) {
    this.color = color;
    return this;
  }

   /**
   * Get color
   * @return color
  **/
  @ApiModelProperty(value = "")
  public CellsColor getColor() {
    return color;
  }

  public void setColor(CellsColor color) {
    this.color = color;
  }

  public ShadowEffect transparency(Double transparency) {
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

  public ShadowEffect blur(Double blur) {
    this.blur = blur;
    return this;
  }

   /**
   * Get blur
   * @return blur
  **/
  @ApiModelProperty(value = "")
  public Double getBlur() {
    return blur;
  }

  public void setBlur(Double blur) {
    this.blur = blur;
  }

  public ShadowEffect size(Double size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(value = "")
  public Double getSize() {
    return size;
  }

  public void setSize(Double size) {
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
    ShadowEffect shadowEffect = (ShadowEffect) o;
    return Objects.equals(this.distance, shadowEffect.distance) &&
        Objects.equals(this.angle, shadowEffect.angle) &&
        Objects.equals(this.presetType, shadowEffect.presetType) &&
        Objects.equals(this.color, shadowEffect.color) &&
        Objects.equals(this.transparency, shadowEffect.transparency) &&
        Objects.equals(this.blur, shadowEffect.blur) &&
        Objects.equals(this.size, shadowEffect.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(distance, angle, presetType, color, transparency, blur, size);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShadowEffect {\n");
    
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    angle: ").append(toIndentedString(angle)).append("\n");
    sb.append("    presetType: ").append(toIndentedString(presetType)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    transparency: ").append(toIndentedString(transparency)).append("\n");
    sb.append("    blur: ").append(toIndentedString(blur)).append("\n");
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

