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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TilePicOption
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-02T17:30:33.766+08:00")
public class TilePicOption {
  @SerializedName("AlignmentType")
  private String alignmentType = null;

  @SerializedName("OffsetX")
  private Double offsetX = null;

  @SerializedName("ScaleX")
  private Double scaleX = null;

  @SerializedName("OffsetY")
  private Double offsetY = null;

  @SerializedName("ScaleY")
  private Double scaleY = null;

  @SerializedName("MirrorType")
  private String mirrorType = null;

  public TilePicOption alignmentType(String alignmentType) {
    this.alignmentType = alignmentType;
    return this;
  }

   /**
   * Get alignmentType
   * @return alignmentType
  **/
  @ApiModelProperty(value = "")
  public String getAlignmentType() {
    return alignmentType;
  }

  public void setAlignmentType(String alignmentType) {
    this.alignmentType = alignmentType;
  }

  public TilePicOption offsetX(Double offsetX) {
    this.offsetX = offsetX;
    return this;
  }

   /**
   * Get offsetX
   * @return offsetX
  **/
  @ApiModelProperty(required = true, value = "")
  public Double getOffsetX() {
    return offsetX;
  }

  public void setOffsetX(Double offsetX) {
    this.offsetX = offsetX;
  }

  public TilePicOption scaleX(Double scaleX) {
    this.scaleX = scaleX;
    return this;
  }

   /**
   * Get scaleX
   * @return scaleX
  **/
  @ApiModelProperty(required = true, value = "")
  public Double getScaleX() {
    return scaleX;
  }

  public void setScaleX(Double scaleX) {
    this.scaleX = scaleX;
  }

  public TilePicOption offsetY(Double offsetY) {
    this.offsetY = offsetY;
    return this;
  }

   /**
   * Get offsetY
   * @return offsetY
  **/
  @ApiModelProperty(required = true, value = "")
  public Double getOffsetY() {
    return offsetY;
  }

  public void setOffsetY(Double offsetY) {
    this.offsetY = offsetY;
  }

  public TilePicOption scaleY(Double scaleY) {
    this.scaleY = scaleY;
    return this;
  }

   /**
   * Get scaleY
   * @return scaleY
  **/
  @ApiModelProperty(required = true, value = "")
  public Double getScaleY() {
    return scaleY;
  }

  public void setScaleY(Double scaleY) {
    this.scaleY = scaleY;
  }

  public TilePicOption mirrorType(String mirrorType) {
    this.mirrorType = mirrorType;
    return this;
  }

   /**
   * Get mirrorType
   * @return mirrorType
  **/
  @ApiModelProperty(value = "")
  public String getMirrorType() {
    return mirrorType;
  }

  public void setMirrorType(String mirrorType) {
    this.mirrorType = mirrorType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TilePicOption tilePicOption = (TilePicOption) o;
    return Objects.equals(this.alignmentType, tilePicOption.alignmentType) &&
        Objects.equals(this.offsetX, tilePicOption.offsetX) &&
        Objects.equals(this.scaleX, tilePicOption.scaleX) &&
        Objects.equals(this.offsetY, tilePicOption.offsetY) &&
        Objects.equals(this.scaleY, tilePicOption.scaleY) &&
        Objects.equals(this.mirrorType, tilePicOption.mirrorType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alignmentType, offsetX, scaleX, offsetY, scaleY, mirrorType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TilePicOption {\n");
    
    sb.append("    alignmentType: ").append(toIndentedString(alignmentType)).append("\n");
    sb.append("    offsetX: ").append(toIndentedString(offsetX)).append("\n");
    sb.append("    scaleX: ").append(toIndentedString(scaleX)).append("\n");
    sb.append("    offsetY: ").append(toIndentedString(offsetY)).append("\n");
    sb.append("    scaleY: ").append(toIndentedString(scaleY)).append("\n");
    sb.append("    mirrorType: ").append(toIndentedString(mirrorType)).append("\n");
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

