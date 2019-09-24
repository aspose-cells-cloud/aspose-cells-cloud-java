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
import com.aspose.cloud.cells.model.CellArea;
import com.aspose.cloud.cells.model.Link;
import com.aspose.cloud.cells.model.LinkElement;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Hyperlink
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-17T15:02:23.029+08:00")
public class Hyperlink {
  @SerializedName("link")
  private Link link = null;

  @SerializedName("ScreenTip")
  private String screenTip = null;

  @SerializedName("Area")
  private CellArea area = null;

  @SerializedName("TextToDisplay")
  private String textToDisplay = null;

  @SerializedName("Address")
  private String address = null;

  public Hyperlink link(Link link) {
    this.link = link;
    return this;
  }

   /**
   * Get link
   * @return link
  **/
  @ApiModelProperty(value = "")
  public Link getLink() {
    return link;
  }

  public void setLink(Link link) {
    this.link = link;
  }

  public Hyperlink screenTip(String screenTip) {
    this.screenTip = screenTip;
    return this;
  }

   /**
   * Get screenTip
   * @return screenTip
  **/
  @ApiModelProperty(value = "")
  public String getScreenTip() {
    return screenTip;
  }

  public void setScreenTip(String screenTip) {
    this.screenTip = screenTip;
  }

  public Hyperlink area(CellArea area) {
    this.area = area;
    return this;
  }

   /**
   * Get area
   * @return area
  **/
  @ApiModelProperty(value = "")
  public CellArea getArea() {
    return area;
  }

  public void setArea(CellArea area) {
    this.area = area;
  }

  public Hyperlink textToDisplay(String textToDisplay) {
    this.textToDisplay = textToDisplay;
    return this;
  }

   /**
   * Get textToDisplay
   * @return textToDisplay
  **/
  @ApiModelProperty(value = "")
  public String getTextToDisplay() {
    return textToDisplay;
  }

  public void setTextToDisplay(String textToDisplay) {
    this.textToDisplay = textToDisplay;
  }

  public Hyperlink address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Hyperlink hyperlink = (Hyperlink) o;
    return Objects.equals(this.link, hyperlink.link) &&
        Objects.equals(this.screenTip, hyperlink.screenTip) &&
        Objects.equals(this.area, hyperlink.area) &&
        Objects.equals(this.textToDisplay, hyperlink.textToDisplay) &&
        Objects.equals(this.address, hyperlink.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, screenTip, area, textToDisplay, address);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Hyperlink {\n");
    
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    screenTip: ").append(toIndentedString(screenTip)).append("\n");
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    textToDisplay: ").append(toIndentedString(textToDisplay)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

