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
 * ConditionalFormattingIcon
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-21T07:23:23.400-06:00")
public class ConditionalFormattingIcon {
  @SerializedName("Index")
  private Integer index = null;

  @SerializedName("Type")
  private String type = null;

  @SerializedName("ImageData")
  private byte[] imageData = null;

  public ConditionalFormattingIcon index(Integer index) {
    this.index = index;
    return this;
  }

   /**
   * Gets and sets the icon&#39;s index in the icon set.             
   * @return index
  **/
  @ApiModelProperty(value = "Gets and sets the icon's index in the icon set.             ")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public ConditionalFormattingIcon type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Gets and sets the icon set type.             
   * @return type
  **/
  @ApiModelProperty(value = "Gets and sets the icon set type.             ")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ConditionalFormattingIcon imageData(byte[] imageData) {
    this.imageData = imageData;
    return this;
  }

   /**
   * Gets the icon set data.             
   * @return imageData
  **/
  @ApiModelProperty(value = "Gets the icon set data.             ")
  public byte[] getImageData() {
    return imageData;
  }

  public void setImageData(byte[] imageData) {
    this.imageData = imageData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConditionalFormattingIcon conditionalFormattingIcon = (ConditionalFormattingIcon) o;
    return Objects.equals(this.index, conditionalFormattingIcon.index) &&
        Objects.equals(this.type, conditionalFormattingIcon.type) &&
        Objects.equals(this.imageData, conditionalFormattingIcon.imageData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, type, imageData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConditionalFormattingIcon {\n");
    
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    imageData: ").append(toIndentedString(imageData)).append("\n");
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

