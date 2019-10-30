/* 
 * <summary>
 *  Copyright (c) 2019 Aspose.Cells Cloud
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
import com.aspose.cloud.cells.model.LinkElement;
import com.aspose.cloud.cells.model.PicFormatOption;
import com.aspose.cloud.cells.model.TilePicOption;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TextureFill
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-24T14:56:32.974+08:00")
public class TextureFill {
  @SerializedName("Scale")
  private Double scale = null;

  @SerializedName("Image")
  private LinkElement image = null;

  @SerializedName("PicFormatOption")
  private PicFormatOption picFormatOption = null;

  @SerializedName("TilePicOption")
  private TilePicOption tilePicOption = null;

  @SerializedName("Transparency")
  private Double transparency = null;

  @SerializedName("Type")
  private String type = null;

  public TextureFill scale(Double scale) {
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

  public TextureFill image(LinkElement image) {
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @ApiModelProperty(value = "")
  public LinkElement getImage() {
    return image;
  }

  public void setImage(LinkElement image) {
    this.image = image;
  }

  public TextureFill picFormatOption(PicFormatOption picFormatOption) {
    this.picFormatOption = picFormatOption;
    return this;
  }

   /**
   * Get picFormatOption
   * @return picFormatOption
  **/
  @ApiModelProperty(value = "")
  public PicFormatOption getPicFormatOption() {
    return picFormatOption;
  }

  public void setPicFormatOption(PicFormatOption picFormatOption) {
    this.picFormatOption = picFormatOption;
  }

  public TextureFill tilePicOption(TilePicOption tilePicOption) {
    this.tilePicOption = tilePicOption;
    return this;
  }

   /**
   * Get tilePicOption
   * @return tilePicOption
  **/
  @ApiModelProperty(value = "")
  public TilePicOption getTilePicOption() {
    return tilePicOption;
  }

  public void setTilePicOption(TilePicOption tilePicOption) {
    this.tilePicOption = tilePicOption;
  }

  public TextureFill transparency(Double transparency) {
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

  public TextureFill type(String type) {
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
    TextureFill textureFill = (TextureFill) o;
    return Objects.equals(this.scale, textureFill.scale) &&
        Objects.equals(this.image, textureFill.image) &&
        Objects.equals(this.picFormatOption, textureFill.picFormatOption) &&
        Objects.equals(this.tilePicOption, textureFill.tilePicOption) &&
        Objects.equals(this.transparency, textureFill.transparency) &&
        Objects.equals(this.type, textureFill.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scale, image, picFormatOption, tilePicOption, transparency, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextureFill {\n");
    
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    picFormatOption: ").append(toIndentedString(picFormatOption)).append("\n");
    sb.append("    tilePicOption: ").append(toIndentedString(tilePicOption)).append("\n");
    sb.append("    transparency: ").append(toIndentedString(transparency)).append("\n");
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

