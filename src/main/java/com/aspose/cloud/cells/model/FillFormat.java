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
 * FillFormat
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-02T09:41:11.020+08:00")
public class FillFormat {
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

  public FillFormat textureFill(TextureFill textureFill) {
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

  public FillFormat imageData(byte[] imageData) {
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

  public FillFormat patternFill(PatternFill patternFill) {
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

  public FillFormat solidFill(SolidFill solidFill) {
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

  public FillFormat gradientFill(GradientFill gradientFill) {
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

  public FillFormat type(String type) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FillFormat fillFormat = (FillFormat) o;
    return Objects.equals(this.textureFill, fillFormat.textureFill) &&
        Objects.equals(this.imageData, fillFormat.imageData) &&
        Objects.equals(this.patternFill, fillFormat.patternFill) &&
        Objects.equals(this.solidFill, fillFormat.solidFill) &&
        Objects.equals(this.gradientFill, fillFormat.gradientFill) &&
        Objects.equals(this.type, fillFormat.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textureFill, imageData, patternFill, solidFill, gradientFill, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FillFormat {\n");
    
    sb.append("    textureFill: ").append(toIndentedString(textureFill)).append("\n");
    sb.append("    imageData: ").append(toIndentedString(imageData)).append("\n");
    sb.append("    patternFill: ").append(toIndentedString(patternFill)).append("\n");
    sb.append("    solidFill: ").append(toIndentedString(solidFill)).append("\n");
    sb.append("    gradientFill: ").append(toIndentedString(gradientFill)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

