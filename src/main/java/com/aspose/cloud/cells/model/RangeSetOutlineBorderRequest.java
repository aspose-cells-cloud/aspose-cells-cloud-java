/* 
 * <summary>
 *  Copyright (c) 2021 Aspose.Cells Cloud
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
import com.aspose.cloud.cells.model.Range;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * RangeSetOutlineBorderRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-09-17T23:42:04.472-05:00")
public class RangeSetOutlineBorderRequest {
  @SerializedName("BorderColor")
  private Color borderColor = null;

  @SerializedName("Range")
  private Range range = null;

  @SerializedName("BorderStyle")
  private String borderStyle = null;

  @SerializedName("BorderEdge")
  private String borderEdge = null;

  public RangeSetOutlineBorderRequest borderColor(Color borderColor) {
    this.borderColor = borderColor;
    return this;
  }

   /**
   * Get borderColor
   * @return borderColor
  **/
  @ApiModelProperty(value = "")
  public Color getBorderColor() {
    return borderColor;
  }

  public void setBorderColor(Color borderColor) {
    this.borderColor = borderColor;
  }

  public RangeSetOutlineBorderRequest range(Range range) {
    this.range = range;
    return this;
  }

   /**
   * Get range
   * @return range
  **/
  @ApiModelProperty(value = "")
  public Range getRange() {
    return range;
  }

  public void setRange(Range range) {
    this.range = range;
  }

  public RangeSetOutlineBorderRequest borderStyle(String borderStyle) {
    this.borderStyle = borderStyle;
    return this;
  }

   /**
   * Get borderStyle
   * @return borderStyle
  **/
  @ApiModelProperty(value = "")
  public String getBorderStyle() {
    return borderStyle;
  }

  public void setBorderStyle(String borderStyle) {
    this.borderStyle = borderStyle;
  }

  public RangeSetOutlineBorderRequest borderEdge(String borderEdge) {
    this.borderEdge = borderEdge;
    return this;
  }

   /**
   * Get borderEdge
   * @return borderEdge
  **/
  @ApiModelProperty(value = "")
  public String getBorderEdge() {
    return borderEdge;
  }

  public void setBorderEdge(String borderEdge) {
    this.borderEdge = borderEdge;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RangeSetOutlineBorderRequest rangeSetOutlineBorderRequest = (RangeSetOutlineBorderRequest) o;
    return Objects.equals(this.borderColor, rangeSetOutlineBorderRequest.borderColor) &&
        Objects.equals(this.range, rangeSetOutlineBorderRequest.range) &&
        Objects.equals(this.borderStyle, rangeSetOutlineBorderRequest.borderStyle) &&
        Objects.equals(this.borderEdge, rangeSetOutlineBorderRequest.borderEdge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(borderColor, range, borderStyle, borderEdge);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RangeSetOutlineBorderRequest {\n");
    
    sb.append("    borderColor: ").append(toIndentedString(borderColor)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    borderStyle: ").append(toIndentedString(borderStyle)).append("\n");
    sb.append("    borderEdge: ").append(toIndentedString(borderEdge)).append("\n");
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

