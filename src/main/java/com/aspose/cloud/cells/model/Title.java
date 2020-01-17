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
import com.aspose.cloud.cells.model.Area;
import com.aspose.cloud.cells.model.ChartFrame;
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
 * Title
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-02T17:30:33.766+08:00")
public class Title {
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

  @SerializedName("link")
  private Link link = null;

  @SerializedName("LinkedSource")
  private String linkedSource = null;

  @SerializedName("Text")
  private String text = null;

  @SerializedName("IsVisible")
  private Boolean isVisible = null;

  @SerializedName("TextDirection")
  private String textDirection = null;

  @SerializedName("RotationAngle")
  private Integer rotationAngle = null;

  @SerializedName("TextVerticalAlignment")
  private String textVerticalAlignment = null;

  @SerializedName("TextHorizontalAlignment")
  private String textHorizontalAlignment = null;

  public Title isInnerMode(Boolean isInnerMode) {
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

  public Title shapeProperties(List<LinkElement> shapeProperties) {
    this.shapeProperties = shapeProperties;
    return this;
  }

  public Title addShapePropertiesItem(LinkElement shapePropertiesItem) {
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

  public Title autoScaleFont(Boolean autoScaleFont) {
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

  public Title area(Area area) {
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

  public Title height(Integer height) {
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

  public Title width(Integer width) {
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

  public Title backgroundMode(String backgroundMode) {
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

  public Title isAutomaticSize(Boolean isAutomaticSize) {
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

  public Title Y(Integer Y) {
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

  public Title X(Integer X) {
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

  public Title shadow(Boolean shadow) {
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

  public Title font(Font font) {
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

  public Title border(Line border) {
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

  public Title link(Link link) {
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

  public Title linkedSource(String linkedSource) {
    this.linkedSource = linkedSource;
    return this;
  }

   /**
   * Get linkedSource
   * @return linkedSource
  **/
  @ApiModelProperty(value = "")
  public String getLinkedSource() {
    return linkedSource;
  }

  public void setLinkedSource(String linkedSource) {
    this.linkedSource = linkedSource;
  }

  public Title text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @ApiModelProperty(value = "")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Title isVisible(Boolean isVisible) {
    this.isVisible = isVisible;
    return this;
  }

   /**
   * Get isVisible
   * @return isVisible
  **/
  @ApiModelProperty(value = "")
  public Boolean IsVisible() {
    return isVisible;
  }

  public void setIsVisible(Boolean isVisible) {
    this.isVisible = isVisible;
  }

  public Title textDirection(String textDirection) {
    this.textDirection = textDirection;
    return this;
  }

   /**
   * Get textDirection
   * @return textDirection
  **/
  @ApiModelProperty(value = "")
  public String getTextDirection() {
    return textDirection;
  }

  public void setTextDirection(String textDirection) {
    this.textDirection = textDirection;
  }

  public Title rotationAngle(Integer rotationAngle) {
    this.rotationAngle = rotationAngle;
    return this;
  }

   /**
   * Get rotationAngle
   * @return rotationAngle
  **/
  @ApiModelProperty(value = "")
  public Integer getRotationAngle() {
    return rotationAngle;
  }

  public void setRotationAngle(Integer rotationAngle) {
    this.rotationAngle = rotationAngle;
  }

  public Title textVerticalAlignment(String textVerticalAlignment) {
    this.textVerticalAlignment = textVerticalAlignment;
    return this;
  }

   /**
   * Get textVerticalAlignment
   * @return textVerticalAlignment
  **/
  @ApiModelProperty(value = "")
  public String getTextVerticalAlignment() {
    return textVerticalAlignment;
  }

  public void setTextVerticalAlignment(String textVerticalAlignment) {
    this.textVerticalAlignment = textVerticalAlignment;
  }

  public Title textHorizontalAlignment(String textHorizontalAlignment) {
    this.textHorizontalAlignment = textHorizontalAlignment;
    return this;
  }

   /**
   * Get textHorizontalAlignment
   * @return textHorizontalAlignment
  **/
  @ApiModelProperty(value = "")
  public String getTextHorizontalAlignment() {
    return textHorizontalAlignment;
  }

  public void setTextHorizontalAlignment(String textHorizontalAlignment) {
    this.textHorizontalAlignment = textHorizontalAlignment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Title title = (Title) o;
    return Objects.equals(this.isInnerMode, title.isInnerMode) &&
        Objects.equals(this.shapeProperties, title.shapeProperties) &&
        Objects.equals(this.autoScaleFont, title.autoScaleFont) &&
        Objects.equals(this.area, title.area) &&
        Objects.equals(this.height, title.height) &&
        Objects.equals(this.width, title.width) &&
        Objects.equals(this.backgroundMode, title.backgroundMode) &&
        Objects.equals(this.isAutomaticSize, title.isAutomaticSize) &&
        Objects.equals(this.Y, title.Y) &&
        Objects.equals(this.X, title.X) &&
        Objects.equals(this.shadow, title.shadow) &&
        Objects.equals(this.font, title.font) &&
        Objects.equals(this.border, title.border) &&
        Objects.equals(this.link, title.link) &&
        Objects.equals(this.linkedSource, title.linkedSource) &&
        Objects.equals(this.text, title.text) &&
        Objects.equals(this.isVisible, title.isVisible) &&
        Objects.equals(this.textDirection, title.textDirection) &&
        Objects.equals(this.rotationAngle, title.rotationAngle) &&
        Objects.equals(this.textVerticalAlignment, title.textVerticalAlignment) &&
        Objects.equals(this.textHorizontalAlignment, title.textHorizontalAlignment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isInnerMode, shapeProperties, autoScaleFont, area, height, width, backgroundMode, isAutomaticSize, Y, X, shadow, font, border, link, linkedSource, text, isVisible, textDirection, rotationAngle, textVerticalAlignment, textHorizontalAlignment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Title {\n");
    
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
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    linkedSource: ").append(toIndentedString(linkedSource)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    isVisible: ").append(toIndentedString(isVisible)).append("\n");
    sb.append("    textDirection: ").append(toIndentedString(textDirection)).append("\n");
    sb.append("    rotationAngle: ").append(toIndentedString(rotationAngle)).append("\n");
    sb.append("    textVerticalAlignment: ").append(toIndentedString(textVerticalAlignment)).append("\n");
    sb.append("    textHorizontalAlignment: ").append(toIndentedString(textHorizontalAlignment)).append("\n");
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

