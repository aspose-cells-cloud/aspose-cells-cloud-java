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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Used by text water marker requests.
 */
@ApiModel(description = "Used by text water marker requests.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-05-25T04:35:47.926-05:00")
public class TextWaterMarkerRequest {
  @SerializedName("Text")
  private String text = null;

  @SerializedName("FontName")
  private String fontName = null;

  @SerializedName("FontSize")
  private Integer fontSize = null;

  @SerializedName("Height")
  private Integer height = null;

  @SerializedName("Width")
  private Integer width = null;

  public TextWaterMarkerRequest text(String text) {
    this.text = text;
    return this;
  }

   /**
   * water marker.
   * @return text
  **/
  @ApiModelProperty(value = "water marker.")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public TextWaterMarkerRequest fontName(String fontName) {
    this.fontName = fontName;
    return this;
  }

   /**
   * font name.
   * @return fontName
  **/
  @ApiModelProperty(value = "font name.")
  public String getFontName() {
    return fontName;
  }

  public void setFontName(String fontName) {
    this.fontName = fontName;
  }

  public TextWaterMarkerRequest fontSize(Integer fontSize) {
    this.fontSize = fontSize;
    return this;
  }

   /**
   * font size.
   * @return fontSize
  **/
  @ApiModelProperty(value = "font size.")
  public Integer getFontSize() {
    return fontSize;
  }

  public void setFontSize(Integer fontSize) {
    this.fontSize = fontSize;
  }

  public TextWaterMarkerRequest height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * height.
   * @return height
  **/
  @ApiModelProperty(value = "height.")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public TextWaterMarkerRequest width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * width.
   * @return width
  **/
  @ApiModelProperty(value = "width.")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextWaterMarkerRequest textWaterMarkerRequest = (TextWaterMarkerRequest) o;
    return Objects.equals(this.text, textWaterMarkerRequest.text) &&
        Objects.equals(this.fontName, textWaterMarkerRequest.fontName) &&
        Objects.equals(this.fontSize, textWaterMarkerRequest.fontSize) &&
        Objects.equals(this.height, textWaterMarkerRequest.height) &&
        Objects.equals(this.width, textWaterMarkerRequest.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, fontName, fontSize, height, width);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextWaterMarkerRequest {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    fontName: ").append(toIndentedString(fontName)).append("\n");
    sb.append("    fontSize: ").append(toIndentedString(fontSize)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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

