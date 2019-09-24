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
import com.aspose.cloud.cells.model.Area;
import com.aspose.cloud.cells.model.Font;
import com.aspose.cloud.cells.model.Line;
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
import java.util.ArrayList;
import java.util.List;

/**
 * ChartFrame
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-17T15:02:23.029+08:00")
public class ChartFrame {
  @SerializedName("link")
  private Link link = null;

  @SerializedName("IsInnerMode")
  private Boolean isInnerMode = null;

  @SerializedName("ShapeProperties")
  private List<LinkElement> shapeProperties = null;

  @SerializedName("AutoScaleFont")
  private Boolean autoScaleFont = null;

  @SerializedName("Area")
  private Area area = null;

  @SerializedName("Height")
  private Integer height = null;

  @SerializedName("Width")
  private Integer width = null;

  @SerializedName("BackgroundMode")
  private String backgroundMode = null;

  @SerializedName("IsAutomaticSize")
  private Boolean isAutomaticSize = null;

  @SerializedName("Y")
  private Integer Y = null;

  @SerializedName("X")
  private Integer X = null;

  @SerializedName("Shadow")
  private Boolean shadow = null;

  @SerializedName("Font")
  private Font font = null;

  @SerializedName("Border")
  private Line border = null;

  public ChartFrame link(Link link) {
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

  public ChartFrame isInnerMode(Boolean isInnerMode) {
    this.isInnerMode = isInnerMode;
    return this;
  }

   /**
   * Get isInnerMode
   * @return isInnerMode
  **/
  @ApiModelProperty(value = "")
  public Boolean IsInnerMode() {
    return isInnerMode;
  }

  public void setIsInnerMode(Boolean isInnerMode) {
    this.isInnerMode = isInnerMode;
  }

  public ChartFrame shapeProperties(List<LinkElement> shapeProperties) {
    this.shapeProperties = shapeProperties;
    return this;
  }

  public ChartFrame addShapePropertiesItem(LinkElement shapePropertiesItem) {
    if (this.shapeProperties == null) {
      this.shapeProperties = new ArrayList<>();
    }
    this.shapeProperties.add(shapePropertiesItem);
    return this;
  }

   /**
   * Get shapeProperties
   * @return shapeProperties
  **/
  @ApiModelProperty(value = "")
  public List<LinkElement> getShapeProperties() {
    return shapeProperties;
  }

  public void setShapeProperties(List<LinkElement> shapeProperties) {
    this.shapeProperties = shapeProperties;
  }

  public ChartFrame autoScaleFont(Boolean autoScaleFont) {
    this.autoScaleFont = autoScaleFont;
    return this;
  }

   /**
   * Get autoScaleFont
   * @return autoScaleFont
  **/
  @ApiModelProperty(value = "")
  public Boolean AutoScaleFont() {
    return autoScaleFont;
  }

  public void setAutoScaleFont(Boolean autoScaleFont) {
    this.autoScaleFont = autoScaleFont;
  }

  public ChartFrame area(Area area) {
    this.area = area;
    return this;
  }

   /**
   * Get area
   * @return area
  **/
  @ApiModelProperty(value = "")
  public Area getArea() {
    return area;
  }

  public void setArea(Area area) {
    this.area = area;
  }

  public ChartFrame height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @ApiModelProperty(value = "")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public ChartFrame width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  @ApiModelProperty(value = "")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public ChartFrame backgroundMode(String backgroundMode) {
    this.backgroundMode = backgroundMode;
    return this;
  }

   /**
   * Get backgroundMode
   * @return backgroundMode
  **/
  @ApiModelProperty(value = "")
  public String getBackgroundMode() {
    return backgroundMode;
  }

  public void setBackgroundMode(String backgroundMode) {
    this.backgroundMode = backgroundMode;
  }

  public ChartFrame isAutomaticSize(Boolean isAutomaticSize) {
    this.isAutomaticSize = isAutomaticSize;
    return this;
  }

   /**
   * Get isAutomaticSize
   * @return isAutomaticSize
  **/
  @ApiModelProperty(value = "")
  public Boolean IsAutomaticSize() {
    return isAutomaticSize;
  }

  public void setIsAutomaticSize(Boolean isAutomaticSize) {
    this.isAutomaticSize = isAutomaticSize;
  }

  public ChartFrame Y(Integer Y) {
    this.Y = Y;
    return this;
  }

   /**
   * Get Y
   * @return Y
  **/
  @ApiModelProperty(value = "")
  public Integer getY() {
    return Y;
  }

  public void setY(Integer Y) {
    this.Y = Y;
  }

  public ChartFrame X(Integer X) {
    this.X = X;
    return this;
  }

   /**
   * Get X
   * @return X
  **/
  @ApiModelProperty(value = "")
  public Integer getX() {
    return X;
  }

  public void setX(Integer X) {
    this.X = X;
  }

  public ChartFrame shadow(Boolean shadow) {
    this.shadow = shadow;
    return this;
  }

   /**
   * Get shadow
   * @return shadow
  **/
  @ApiModelProperty(value = "")
  public Boolean Shadow() {
    return shadow;
  }

  public void setShadow(Boolean shadow) {
    this.shadow = shadow;
  }

  public ChartFrame font(Font font) {
    this.font = font;
    return this;
  }

   /**
   * Get font
   * @return font
  **/
  @ApiModelProperty(value = "")
  public Font getFont() {
    return font;
  }

  public void setFont(Font font) {
    this.font = font;
  }

  public ChartFrame border(Line border) {
    this.border = border;
    return this;
  }

   /**
   * Get border
   * @return border
  **/
  @ApiModelProperty(value = "")
  public Line getBorder() {
    return border;
  }

  public void setBorder(Line border) {
    this.border = border;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChartFrame chartFrame = (ChartFrame) o;
    return Objects.equals(this.link, chartFrame.link) &&
        Objects.equals(this.isInnerMode, chartFrame.isInnerMode) &&
        Objects.equals(this.shapeProperties, chartFrame.shapeProperties) &&
        Objects.equals(this.autoScaleFont, chartFrame.autoScaleFont) &&
        Objects.equals(this.area, chartFrame.area) &&
        Objects.equals(this.height, chartFrame.height) &&
        Objects.equals(this.width, chartFrame.width) &&
        Objects.equals(this.backgroundMode, chartFrame.backgroundMode) &&
        Objects.equals(this.isAutomaticSize, chartFrame.isAutomaticSize) &&
        Objects.equals(this.Y, chartFrame.Y) &&
        Objects.equals(this.X, chartFrame.X) &&
        Objects.equals(this.shadow, chartFrame.shadow) &&
        Objects.equals(this.font, chartFrame.font) &&
        Objects.equals(this.border, chartFrame.border);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, isInnerMode, shapeProperties, autoScaleFont, area, height, width, backgroundMode, isAutomaticSize, Y, X, shadow, font, border);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChartFrame {\n");
    
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    isInnerMode: ").append(toIndentedString(isInnerMode)).append("\n");
    sb.append("    shapeProperties: ").append(toIndentedString(shapeProperties)).append("\n");
    sb.append("    autoScaleFont: ").append(toIndentedString(autoScaleFont)).append("\n");
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    backgroundMode: ").append(toIndentedString(backgroundMode)).append("\n");
    sb.append("    isAutomaticSize: ").append(toIndentedString(isAutomaticSize)).append("\n");
    sb.append("    Y: ").append(toIndentedString(Y)).append("\n");
    sb.append("    X: ").append(toIndentedString(X)).append("\n");
    sb.append("    shadow: ").append(toIndentedString(shadow)).append("\n");
    sb.append("    font: ").append(toIndentedString(font)).append("\n");
    sb.append("    border: ").append(toIndentedString(border)).append("\n");
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

