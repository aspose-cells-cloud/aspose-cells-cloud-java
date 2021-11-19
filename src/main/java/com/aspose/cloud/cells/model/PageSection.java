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
 * PageSection
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-19T16:36:54.237-06:00")
public class PageSection {
  @SerializedName("Picture")
  private byte[] picture = null;

  @SerializedName("Section")
  private Integer section = null;

  @SerializedName("FisrtPageContext")
  private String fisrtPageContext = null;

  @SerializedName("Context")
  private String context = null;

  @SerializedName("EvenPageContext")
  private String evenPageContext = null;

  public PageSection picture(byte[] picture) {
    this.picture = picture;
    return this;
  }

   /**
   * Get picture
   * @return picture
  **/
  @ApiModelProperty(value = "")
  public byte[] getPicture() {
    return picture;
  }

  public void setPicture(byte[] picture) {
    this.picture = picture;
  }

  public PageSection section(Integer section) {
    this.section = section;
    return this;
  }

   /**
   * 0,1,2  left , middle ,right
   * @return section
  **/
  @ApiModelProperty(required = true, value = "0,1,2  left , middle ,right")
  public Integer getSection() {
    return section;
  }

  public void setSection(Integer section) {
    this.section = section;
  }

  public PageSection fisrtPageContext(String fisrtPageContext) {
    this.fisrtPageContext = fisrtPageContext;
    return this;
  }

   /**
   * fisrt page context script
   * @return fisrtPageContext
  **/
  @ApiModelProperty(value = "fisrt page context script")
  public String getFisrtPageContext() {
    return fisrtPageContext;
  }

  public void setFisrtPageContext(String fisrtPageContext) {
    this.fisrtPageContext = fisrtPageContext;
  }

  public PageSection context(String context) {
    this.context = context;
    return this;
  }

   /**
   * page context script             
   * @return context
  **/
  @ApiModelProperty(value = "page context script             ")
  public String getContext() {
    return context;
  }

  public void setContext(String context) {
    this.context = context;
  }

  public PageSection evenPageContext(String evenPageContext) {
    this.evenPageContext = evenPageContext;
    return this;
  }

   /**
   * Even page context script
   * @return evenPageContext
  **/
  @ApiModelProperty(value = "Even page context script")
  public String getEvenPageContext() {
    return evenPageContext;
  }

  public void setEvenPageContext(String evenPageContext) {
    this.evenPageContext = evenPageContext;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageSection pageSection = (PageSection) o;
    return Objects.equals(this.picture, pageSection.picture) &&
        Objects.equals(this.section, pageSection.section) &&
        Objects.equals(this.fisrtPageContext, pageSection.fisrtPageContext) &&
        Objects.equals(this.context, pageSection.context) &&
        Objects.equals(this.evenPageContext, pageSection.evenPageContext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(picture, section, fisrtPageContext, context, evenPageContext);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageSection {\n");
    
    sb.append("    picture: ").append(toIndentedString(picture)).append("\n");
    sb.append("    section: ").append(toIndentedString(section)).append("\n");
    sb.append("    fisrtPageContext: ").append(toIndentedString(fisrtPageContext)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    evenPageContext: ").append(toIndentedString(evenPageContext)).append("\n");
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

