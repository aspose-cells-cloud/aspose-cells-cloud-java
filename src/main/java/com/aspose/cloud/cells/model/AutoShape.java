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
import com.aspose.cloud.cells.model.Link;
import com.aspose.cloud.cells.model.Shape;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * AutoShape
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-01-21T01:47:19.323-06:00")
public class AutoShape {
  @SerializedName("AlternativeText")
  private String alternativeText = null;

  @SerializedName("Bottom")
  private Integer bottom = null;

  @SerializedName("Top")
  private Integer top = null;

  @SerializedName("Width")
  private Integer width = null;

  @SerializedName("HtmlText")
  private String htmlText = null;

  @SerializedName("TextVerticalAlignment")
  private String textVerticalAlignment = null;

  @SerializedName("AutoShapeType")
  private String autoShapeType = null;

  @SerializedName("IsPrintable")
  private Boolean isPrintable = null;

  @SerializedName("UpperLeftColumn")
  private Integer upperLeftColumn = null;

  @SerializedName("IsLockAspectRatio")
  private Boolean isLockAspectRatio = null;

  @SerializedName("IsGroup")
  private Boolean isGroup = null;

  @SerializedName("RotationAngle")
  private Double rotationAngle = null;

  @SerializedName("ZOrderPosition")
  private Integer zorderPosition = null;

  @SerializedName("TextHorizontalOverflow")
  private String textHorizontalOverflow = null;

  @SerializedName("MsoDrawingType")
  private String msoDrawingType = null;

  @SerializedName("TextOrientationType")
  private String textOrientationType = null;

  @SerializedName("Placement")
  private String placement = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("IsWordArt")
  private Boolean isWordArt = null;

  @SerializedName("LinkedCell")
  private String linkedCell = null;

  @SerializedName("UpperLeftRow")
  private Integer upperLeftRow = null;

  @SerializedName("IsLocked")
  private Boolean isLocked = null;

  @SerializedName("LowerRightRow")
  private Integer lowerRightRow = null;

  @SerializedName("IsTextWrapped")
  private Boolean isTextWrapped = null;

  @SerializedName("Y")
  private Integer Y = null;

  @SerializedName("X")
  private Integer X = null;

  @SerializedName("IsHidden")
  private Boolean isHidden = null;

  @SerializedName("Left")
  private Integer left = null;

  @SerializedName("Right")
  private Integer right = null;

  @SerializedName("Text")
  private String text = null;

  @SerializedName("LowerRightColumn")
  private Integer lowerRightColumn = null;

  @SerializedName("Height")
  private Integer height = null;

  @SerializedName("TextHorizontalAlignment")
  private String textHorizontalAlignment = null;

  @SerializedName("TextVerticalOverflow")
  private String textVerticalOverflow = null;

  @SerializedName("link")
  private Link link = null;

  public AutoShape alternativeText(String alternativeText) {
    this.alternativeText = alternativeText;
    return this;
  }

   /**
   * Get alternativeText
   * @return alternativeText
  **/
  @ApiModelProperty(value = "")
  public String getAlternativeText() {
    return alternativeText;
  }

  public void setAlternativeText(String alternativeText) {
    this.alternativeText = alternativeText;
  }

  public AutoShape bottom(Integer bottom) {
    this.bottom = bottom;
    return this;
  }

   /**
   * Get bottom
   * @return bottom
  **/
  @ApiModelProperty(value = "")
  public Integer getBottom() {
    return bottom;
  }

  public void setBottom(Integer bottom) {
    this.bottom = bottom;
  }

  public AutoShape top(Integer top) {
    this.top = top;
    return this;
  }

   /**
   * Get top
   * @return top
  **/
  @ApiModelProperty(value = "")
  public Integer getTop() {
    return top;
  }

  public void setTop(Integer top) {
    this.top = top;
  }

  public AutoShape width(Integer width) {
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

  public AutoShape htmlText(String htmlText) {
    this.htmlText = htmlText;
    return this;
  }

   /**
   * Get htmlText
   * @return htmlText
  **/
  @ApiModelProperty(value = "")
  public String getHtmlText() {
    return htmlText;
  }

  public void setHtmlText(String htmlText) {
    this.htmlText = htmlText;
  }

  public AutoShape textVerticalAlignment(String textVerticalAlignment) {
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

  public AutoShape autoShapeType(String autoShapeType) {
    this.autoShapeType = autoShapeType;
    return this;
  }

   /**
   * Get autoShapeType
   * @return autoShapeType
  **/
  @ApiModelProperty(value = "")
  public String getAutoShapeType() {
    return autoShapeType;
  }

  public void setAutoShapeType(String autoShapeType) {
    this.autoShapeType = autoShapeType;
  }

  public AutoShape isPrintable(Boolean isPrintable) {
    this.isPrintable = isPrintable;
    return this;
  }

   /**
   * Get isPrintable
   * @return isPrintable
  **/
  @ApiModelProperty(value = "")
  public Boolean IsPrintable() {
    return isPrintable;
  }

  public void setIsPrintable(Boolean isPrintable) {
    this.isPrintable = isPrintable;
  }

  public AutoShape upperLeftColumn(Integer upperLeftColumn) {
    this.upperLeftColumn = upperLeftColumn;
    return this;
  }

   /**
   * Get upperLeftColumn
   * @return upperLeftColumn
  **/
  @ApiModelProperty(value = "")
  public Integer getUpperLeftColumn() {
    return upperLeftColumn;
  }

  public void setUpperLeftColumn(Integer upperLeftColumn) {
    this.upperLeftColumn = upperLeftColumn;
  }

  public AutoShape isLockAspectRatio(Boolean isLockAspectRatio) {
    this.isLockAspectRatio = isLockAspectRatio;
    return this;
  }

   /**
   * Get isLockAspectRatio
   * @return isLockAspectRatio
  **/
  @ApiModelProperty(value = "")
  public Boolean IsLockAspectRatio() {
    return isLockAspectRatio;
  }

  public void setIsLockAspectRatio(Boolean isLockAspectRatio) {
    this.isLockAspectRatio = isLockAspectRatio;
  }

  public AutoShape isGroup(Boolean isGroup) {
    this.isGroup = isGroup;
    return this;
  }

   /**
   * Get isGroup
   * @return isGroup
  **/
  @ApiModelProperty(value = "")
  public Boolean IsGroup() {
    return isGroup;
  }

  public void setIsGroup(Boolean isGroup) {
    this.isGroup = isGroup;
  }

  public AutoShape rotationAngle(Double rotationAngle) {
    this.rotationAngle = rotationAngle;
    return this;
  }

   /**
   * Get rotationAngle
   * @return rotationAngle
  **/
  @ApiModelProperty(value = "")
  public Double getRotationAngle() {
    return rotationAngle;
  }

  public void setRotationAngle(Double rotationAngle) {
    this.rotationAngle = rotationAngle;
  }

  public AutoShape zorderPosition(Integer zorderPosition) {
    this.zorderPosition = zorderPosition;
    return this;
  }

   /**
   * Get zorderPosition
   * @return zorderPosition
  **/
  @ApiModelProperty(value = "")
  public Integer getZorderPosition() {
    return zorderPosition;
  }

  public void setZorderPosition(Integer zorderPosition) {
    this.zorderPosition = zorderPosition;
  }

  public AutoShape textHorizontalOverflow(String textHorizontalOverflow) {
    this.textHorizontalOverflow = textHorizontalOverflow;
    return this;
  }

   /**
   * Get textHorizontalOverflow
   * @return textHorizontalOverflow
  **/
  @ApiModelProperty(value = "")
  public String getTextHorizontalOverflow() {
    return textHorizontalOverflow;
  }

  public void setTextHorizontalOverflow(String textHorizontalOverflow) {
    this.textHorizontalOverflow = textHorizontalOverflow;
  }

  public AutoShape msoDrawingType(String msoDrawingType) {
    this.msoDrawingType = msoDrawingType;
    return this;
  }

   /**
   * Get msoDrawingType
   * @return msoDrawingType
  **/
  @ApiModelProperty(value = "")
  public String getMsoDrawingType() {
    return msoDrawingType;
  }

  public void setMsoDrawingType(String msoDrawingType) {
    this.msoDrawingType = msoDrawingType;
  }

  public AutoShape textOrientationType(String textOrientationType) {
    this.textOrientationType = textOrientationType;
    return this;
  }

   /**
   * Get textOrientationType
   * @return textOrientationType
  **/
  @ApiModelProperty(value = "")
  public String getTextOrientationType() {
    return textOrientationType;
  }

  public void setTextOrientationType(String textOrientationType) {
    this.textOrientationType = textOrientationType;
  }

  public AutoShape placement(String placement) {
    this.placement = placement;
    return this;
  }

   /**
   * Get placement
   * @return placement
  **/
  @ApiModelProperty(value = "")
  public String getPlacement() {
    return placement;
  }

  public void setPlacement(String placement) {
    this.placement = placement;
  }

  public AutoShape name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AutoShape isWordArt(Boolean isWordArt) {
    this.isWordArt = isWordArt;
    return this;
  }

   /**
   * Get isWordArt
   * @return isWordArt
  **/
  @ApiModelProperty(value = "")
  public Boolean IsWordArt() {
    return isWordArt;
  }

  public void setIsWordArt(Boolean isWordArt) {
    this.isWordArt = isWordArt;
  }

  public AutoShape linkedCell(String linkedCell) {
    this.linkedCell = linkedCell;
    return this;
  }

   /**
   * Get linkedCell
   * @return linkedCell
  **/
  @ApiModelProperty(value = "")
  public String getLinkedCell() {
    return linkedCell;
  }

  public void setLinkedCell(String linkedCell) {
    this.linkedCell = linkedCell;
  }

  public AutoShape upperLeftRow(Integer upperLeftRow) {
    this.upperLeftRow = upperLeftRow;
    return this;
  }

   /**
   * Get upperLeftRow
   * @return upperLeftRow
  **/
  @ApiModelProperty(value = "")
  public Integer getUpperLeftRow() {
    return upperLeftRow;
  }

  public void setUpperLeftRow(Integer upperLeftRow) {
    this.upperLeftRow = upperLeftRow;
  }

  public AutoShape isLocked(Boolean isLocked) {
    this.isLocked = isLocked;
    return this;
  }

   /**
   * Get isLocked
   * @return isLocked
  **/
  @ApiModelProperty(value = "")
  public Boolean IsLocked() {
    return isLocked;
  }

  public void setIsLocked(Boolean isLocked) {
    this.isLocked = isLocked;
  }

  public AutoShape lowerRightRow(Integer lowerRightRow) {
    this.lowerRightRow = lowerRightRow;
    return this;
  }

   /**
   * Get lowerRightRow
   * @return lowerRightRow
  **/
  @ApiModelProperty(value = "")
  public Integer getLowerRightRow() {
    return lowerRightRow;
  }

  public void setLowerRightRow(Integer lowerRightRow) {
    this.lowerRightRow = lowerRightRow;
  }

  public AutoShape isTextWrapped(Boolean isTextWrapped) {
    this.isTextWrapped = isTextWrapped;
    return this;
  }

   /**
   * Get isTextWrapped
   * @return isTextWrapped
  **/
  @ApiModelProperty(value = "")
  public Boolean IsTextWrapped() {
    return isTextWrapped;
  }

  public void setIsTextWrapped(Boolean isTextWrapped) {
    this.isTextWrapped = isTextWrapped;
  }

  public AutoShape Y(Integer Y) {
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

  public AutoShape X(Integer X) {
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

  public AutoShape isHidden(Boolean isHidden) {
    this.isHidden = isHidden;
    return this;
  }

   /**
   * Get isHidden
   * @return isHidden
  **/
  @ApiModelProperty(value = "")
  public Boolean IsHidden() {
    return isHidden;
  }

  public void setIsHidden(Boolean isHidden) {
    this.isHidden = isHidden;
  }

  public AutoShape left(Integer left) {
    this.left = left;
    return this;
  }

   /**
   * Get left
   * @return left
  **/
  @ApiModelProperty(value = "")
  public Integer getLeft() {
    return left;
  }

  public void setLeft(Integer left) {
    this.left = left;
  }

  public AutoShape right(Integer right) {
    this.right = right;
    return this;
  }

   /**
   * Get right
   * @return right
  **/
  @ApiModelProperty(value = "")
  public Integer getRight() {
    return right;
  }

  public void setRight(Integer right) {
    this.right = right;
  }

  public AutoShape text(String text) {
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

  public AutoShape lowerRightColumn(Integer lowerRightColumn) {
    this.lowerRightColumn = lowerRightColumn;
    return this;
  }

   /**
   * Get lowerRightColumn
   * @return lowerRightColumn
  **/
  @ApiModelProperty(value = "")
  public Integer getLowerRightColumn() {
    return lowerRightColumn;
  }

  public void setLowerRightColumn(Integer lowerRightColumn) {
    this.lowerRightColumn = lowerRightColumn;
  }

  public AutoShape height(Integer height) {
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

  public AutoShape textHorizontalAlignment(String textHorizontalAlignment) {
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

  public AutoShape textVerticalOverflow(String textVerticalOverflow) {
    this.textVerticalOverflow = textVerticalOverflow;
    return this;
  }

   /**
   * Get textVerticalOverflow
   * @return textVerticalOverflow
  **/
  @ApiModelProperty(value = "")
  public String getTextVerticalOverflow() {
    return textVerticalOverflow;
  }

  public void setTextVerticalOverflow(String textVerticalOverflow) {
    this.textVerticalOverflow = textVerticalOverflow;
  }

  public AutoShape link(Link link) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoShape autoShape = (AutoShape) o;
    return Objects.equals(this.alternativeText, autoShape.alternativeText) &&
        Objects.equals(this.bottom, autoShape.bottom) &&
        Objects.equals(this.top, autoShape.top) &&
        Objects.equals(this.width, autoShape.width) &&
        Objects.equals(this.htmlText, autoShape.htmlText) &&
        Objects.equals(this.textVerticalAlignment, autoShape.textVerticalAlignment) &&
        Objects.equals(this.autoShapeType, autoShape.autoShapeType) &&
        Objects.equals(this.isPrintable, autoShape.isPrintable) &&
        Objects.equals(this.upperLeftColumn, autoShape.upperLeftColumn) &&
        Objects.equals(this.isLockAspectRatio, autoShape.isLockAspectRatio) &&
        Objects.equals(this.isGroup, autoShape.isGroup) &&
        Objects.equals(this.rotationAngle, autoShape.rotationAngle) &&
        Objects.equals(this.zorderPosition, autoShape.zorderPosition) &&
        Objects.equals(this.textHorizontalOverflow, autoShape.textHorizontalOverflow) &&
        Objects.equals(this.msoDrawingType, autoShape.msoDrawingType) &&
        Objects.equals(this.textOrientationType, autoShape.textOrientationType) &&
        Objects.equals(this.placement, autoShape.placement) &&
        Objects.equals(this.name, autoShape.name) &&
        Objects.equals(this.isWordArt, autoShape.isWordArt) &&
        Objects.equals(this.linkedCell, autoShape.linkedCell) &&
        Objects.equals(this.upperLeftRow, autoShape.upperLeftRow) &&
        Objects.equals(this.isLocked, autoShape.isLocked) &&
        Objects.equals(this.lowerRightRow, autoShape.lowerRightRow) &&
        Objects.equals(this.isTextWrapped, autoShape.isTextWrapped) &&
        Objects.equals(this.Y, autoShape.Y) &&
        Objects.equals(this.X, autoShape.X) &&
        Objects.equals(this.isHidden, autoShape.isHidden) &&
        Objects.equals(this.left, autoShape.left) &&
        Objects.equals(this.right, autoShape.right) &&
        Objects.equals(this.text, autoShape.text) &&
        Objects.equals(this.lowerRightColumn, autoShape.lowerRightColumn) &&
        Objects.equals(this.height, autoShape.height) &&
        Objects.equals(this.textHorizontalAlignment, autoShape.textHorizontalAlignment) &&
        Objects.equals(this.textVerticalOverflow, autoShape.textVerticalOverflow) &&
        Objects.equals(this.link, autoShape.link);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alternativeText, bottom, top, width, htmlText, textVerticalAlignment, autoShapeType, isPrintable, upperLeftColumn, isLockAspectRatio, isGroup, rotationAngle, zorderPosition, textHorizontalOverflow, msoDrawingType, textOrientationType, placement, name, isWordArt, linkedCell, upperLeftRow, isLocked, lowerRightRow, isTextWrapped, Y, X, isHidden, left, right, text, lowerRightColumn, height, textHorizontalAlignment, textVerticalOverflow, link);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutoShape {\n");
    
    sb.append("    alternativeText: ").append(toIndentedString(alternativeText)).append("\n");
    sb.append("    bottom: ").append(toIndentedString(bottom)).append("\n");
    sb.append("    top: ").append(toIndentedString(top)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    htmlText: ").append(toIndentedString(htmlText)).append("\n");
    sb.append("    textVerticalAlignment: ").append(toIndentedString(textVerticalAlignment)).append("\n");
    sb.append("    autoShapeType: ").append(toIndentedString(autoShapeType)).append("\n");
    sb.append("    isPrintable: ").append(toIndentedString(isPrintable)).append("\n");
    sb.append("    upperLeftColumn: ").append(toIndentedString(upperLeftColumn)).append("\n");
    sb.append("    isLockAspectRatio: ").append(toIndentedString(isLockAspectRatio)).append("\n");
    sb.append("    isGroup: ").append(toIndentedString(isGroup)).append("\n");
    sb.append("    rotationAngle: ").append(toIndentedString(rotationAngle)).append("\n");
    sb.append("    zorderPosition: ").append(toIndentedString(zorderPosition)).append("\n");
    sb.append("    textHorizontalOverflow: ").append(toIndentedString(textHorizontalOverflow)).append("\n");
    sb.append("    msoDrawingType: ").append(toIndentedString(msoDrawingType)).append("\n");
    sb.append("    textOrientationType: ").append(toIndentedString(textOrientationType)).append("\n");
    sb.append("    placement: ").append(toIndentedString(placement)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isWordArt: ").append(toIndentedString(isWordArt)).append("\n");
    sb.append("    linkedCell: ").append(toIndentedString(linkedCell)).append("\n");
    sb.append("    upperLeftRow: ").append(toIndentedString(upperLeftRow)).append("\n");
    sb.append("    isLocked: ").append(toIndentedString(isLocked)).append("\n");
    sb.append("    lowerRightRow: ").append(toIndentedString(lowerRightRow)).append("\n");
    sb.append("    isTextWrapped: ").append(toIndentedString(isTextWrapped)).append("\n");
    sb.append("    Y: ").append(toIndentedString(Y)).append("\n");
    sb.append("    X: ").append(toIndentedString(X)).append("\n");
    sb.append("    isHidden: ").append(toIndentedString(isHidden)).append("\n");
    sb.append("    left: ").append(toIndentedString(left)).append("\n");
    sb.append("    right: ").append(toIndentedString(right)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    lowerRightColumn: ").append(toIndentedString(lowerRightColumn)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    textHorizontalAlignment: ").append(toIndentedString(textHorizontalAlignment)).append("\n");
    sb.append("    textVerticalOverflow: ").append(toIndentedString(textVerticalOverflow)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
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

