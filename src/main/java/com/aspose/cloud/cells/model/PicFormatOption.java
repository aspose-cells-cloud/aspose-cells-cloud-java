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
 * PicFormatOption
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-16T09:11:43.161+08:00")
public class PicFormatOption {
  @SerializedName("Right")
  private Double right = null;

  @SerializedName("Bottom")
  private Double bottom = null;

  @SerializedName("Top")
  private Double top = null;

  @SerializedName("Scale")
  private Double scale = null;

  @SerializedName("Type")
  private String type = null;

  @SerializedName("Left")
  private Double left = null;

  public PicFormatOption right(Double right) {
    this.right = right;
    return this;
  }

   /**
   * Get right
   * @return right
  **/
  @ApiModelProperty(value = "")
  public Double getRight() {
    return right;
  }

  public void setRight(Double right) {
    this.right = right;
  }

  public PicFormatOption bottom(Double bottom) {
    this.bottom = bottom;
    return this;
  }

   /**
   * Get bottom
   * @return bottom
  **/
  @ApiModelProperty(value = "")
  public Double getBottom() {
    return bottom;
  }

  public void setBottom(Double bottom) {
    this.bottom = bottom;
  }

  public PicFormatOption top(Double top) {
    this.top = top;
    return this;
  }

   /**
   * Get top
   * @return top
  **/
  @ApiModelProperty(value = "")
  public Double getTop() {
    return top;
  }

  public void setTop(Double top) {
    this.top = top;
  }

  public PicFormatOption scale(Double scale) {
    this.scale = scale;
    return this;
  }

   /**
   * Get scale
   * @return scale
  **/
  @ApiModelProperty(value = "")
  public Double getScale() {
    return scale;
  }

  public void setScale(Double scale) {
    this.scale = scale;
  }

  public PicFormatOption type(String type) {
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

  public PicFormatOption left(Double left) {
    this.left = left;
    return this;
  }

   /**
   * Get left
   * @return left
  **/
  @ApiModelProperty(value = "")
  public Double getLeft() {
    return left;
  }

  public void setLeft(Double left) {
    this.left = left;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PicFormatOption picFormatOption = (PicFormatOption) o;
    return Objects.equals(this.right, picFormatOption.right) &&
        Objects.equals(this.bottom, picFormatOption.bottom) &&
        Objects.equals(this.top, picFormatOption.top) &&
        Objects.equals(this.scale, picFormatOption.scale) &&
        Objects.equals(this.type, picFormatOption.type) &&
        Objects.equals(this.left, picFormatOption.left);
  }

  @Override
  public int hashCode() {
    return Objects.hash(right, bottom, top, scale, type, left);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PicFormatOption {\n");
    
    sb.append("    right: ").append(toIndentedString(right)).append("\n");
    sb.append("    bottom: ").append(toIndentedString(bottom)).append("\n");
    sb.append("    top: ").append(toIndentedString(top)).append("\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    left: ").append(toIndentedString(left)).append("\n");
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

