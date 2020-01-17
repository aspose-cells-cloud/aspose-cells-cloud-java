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
import com.aspose.cloud.cells.model.GradientFillStop;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * GradientFill
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-02T17:30:33.766+08:00")
public class GradientFill {
  @SerializedName("FillType")
  private String fillType = null;

  @SerializedName("Angle")
  private Double angle = null;

  @SerializedName("GradientStops")
  private List<GradientFillStop> gradientStops = null;

  @SerializedName("DirectionType")
  private String directionType = null;

  public GradientFill fillType(String fillType) {
    this.fillType = fillType;
    return this;
  }

   /**
   * Get fillType
   * @return fillType
  **/
  @ApiModelProperty(value = "")
  public String getFillType() {
    return fillType;
  }

  public void setFillType(String fillType) {
    this.fillType = fillType;
  }

  public GradientFill angle(Double angle) {
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

  public GradientFill gradientStops(List<GradientFillStop> gradientStops) {
    this.gradientStops = gradientStops;
    return this;
  }

  public GradientFill addGradientStopsItem(GradientFillStop gradientStopsItem) {
    if (this.gradientStops == null) {
      this.gradientStops = new ArrayList<>();
    }
    this.gradientStops.add(gradientStopsItem);
    return this;
  }

   /**
   * Get gradientStops
   * @return gradientStops
  **/
  @ApiModelProperty(value = "")
  public List<GradientFillStop> getGradientStops() {
    return gradientStops;
  }

  public void setGradientStops(List<GradientFillStop> gradientStops) {
    this.gradientStops = gradientStops;
  }

  public GradientFill directionType(String directionType) {
    this.directionType = directionType;
    return this;
  }

   /**
   * Get directionType
   * @return directionType
  **/
  @ApiModelProperty(value = "")
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
    GradientFill gradientFill = (GradientFill) o;
    return Objects.equals(this.fillType, gradientFill.fillType) &&
        Objects.equals(this.angle, gradientFill.angle) &&
        Objects.equals(this.gradientStops, gradientFill.gradientStops) &&
        Objects.equals(this.directionType, gradientFill.directionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fillType, angle, gradientStops, directionType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GradientFill {\n");
    
    sb.append("    fillType: ").append(toIndentedString(fillType)).append("\n");
    sb.append("    angle: ").append(toIndentedString(angle)).append("\n");
    sb.append("    gradientStops: ").append(toIndentedString(gradientStops)).append("\n");
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

