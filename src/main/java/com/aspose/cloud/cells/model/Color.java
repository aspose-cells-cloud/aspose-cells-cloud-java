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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Color
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-09-17T23:42:04.472-05:00")
public class Color {
  @SerializedName("A")
  private Integer A = null;

  @SerializedName("B")
  private Integer B = null;

  @SerializedName("R")
  private Integer R = null;

  @SerializedName("G")
  private Integer G = null;

  public Color A(Integer A) {
    this.A = A;
    return this;
  }

   /**
   * Get A
   * @return A
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getA() {
    return A;
  }

  public void setA(Integer A) {
    this.A = A;
  }

  public Color B(Integer B) {
    this.B = B;
    return this;
  }

   /**
   * Get B
   * @return B
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getB() {
    return B;
  }

  public void setB(Integer B) {
    this.B = B;
  }

  public Color R(Integer R) {
    this.R = R;
    return this;
  }

   /**
   * Get R
   * @return R
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getR() {
    return R;
  }

  public void setR(Integer R) {
    this.R = R;
  }

  public Color G(Integer G) {
    this.G = G;
    return this;
  }

   /**
   * Get G
   * @return G
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getG() {
    return G;
  }

  public void setG(Integer G) {
    this.G = G;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Color color = (Color) o;
    return Objects.equals(this.A, color.A) &&
        Objects.equals(this.B, color.B) &&
        Objects.equals(this.R, color.R) &&
        Objects.equals(this.G, color.G);
  }

  @Override
  public int hashCode() {
    return Objects.hash(A, B, R, G);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Color {\n");
    
    sb.append("    A: ").append(toIndentedString(A)).append("\n");
    sb.append("    B: ").append(toIndentedString(B)).append("\n");
    sb.append("    R: ").append(toIndentedString(R)).append("\n");
    sb.append("    G: ").append(toIndentedString(G)).append("\n");
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

