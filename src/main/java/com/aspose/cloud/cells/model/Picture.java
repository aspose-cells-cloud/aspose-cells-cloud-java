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
import com.aspose.cloud.cells.model.Color;
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
 * Picture
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-19T23:40:54.225-05:00")
public class Picture {
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

  @SerializedName("SourceFullName")
  private String sourceFullName = null;

  @SerializedName("BorderLineColor")
  private Color borderLineColor = null;

  @SerializedName("OriginalHeight")
  private Integer originalHeight = null;

  @SerializedName("ImageFormat")
  private String imageFormat = null;

  @SerializedName("OriginalWidth")
  private Integer originalWidth = null;

  @SerializedName("BorderWeight")
  private Double borderWeight = null;

  public Picture alternativeText(String alternativeText) {
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

  public Picture bottom(Integer bottom) {
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

  public Picture top(Integer top) {
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

  public Picture width(Integer width) {
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

  public Picture htmlText(String htmlText) {
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

  public Picture textVerticalAlignment(String textVerticalAlignment) {
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

  public Picture autoShapeType(String autoShapeType) {
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

  public Picture isPrintable(Boolean isPrintable) {
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

  public Picture upperLeftColumn(Integer upperLeftColumn) {
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

  public Picture isLockAspectRatio(Boolean isLockAspectRatio) {
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

  public Picture isGroup(Boolean isGroup) {
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

  public Picture rotationAngle(Double rotationAngle) {
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

  public Picture zorderPosition(Integer zorderPosition) {
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

  public Picture textHorizontalOverflow(String textHorizontalOverflow) {
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

  public Picture msoDrawingType(String msoDrawingType) {
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

  public Picture textOrientationType(String textOrientationType) {
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

  public Picture placement(String placement) {
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

  public Picture name(String name) {
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

  public Picture isWordArt(Boolean isWordArt) {
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

  public Picture linkedCell(String linkedCell) {
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

  public Picture upperLeftRow(Integer upperLeftRow) {
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

  public Picture isLocked(Boolean isLocked) {
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

  public Picture lowerRightRow(Integer lowerRightRow) {
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

  public Picture isTextWrapped(Boolean isTextWrapped) {
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

  public Picture Y(Integer Y) {
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

  public Picture X(Integer X) {
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

  public Picture isHidden(Boolean isHidden) {
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

  public Picture left(Integer left) {
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

  public Picture right(Integer right) {
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

  public Picture text(String text) {
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

  public Picture lowerRightColumn(Integer lowerRightColumn) {
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

  public Picture height(Integer height) {
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

  public Picture textHorizontalAlignment(String textHorizontalAlignment) {
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

  public Picture textVerticalOverflow(String textVerticalOverflow) {
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

  public Picture link(Link link) {
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

  public Picture sourceFullName(String sourceFullName) {
    this.sourceFullName = sourceFullName;
    return this;
  }

   /**
   * Get sourceFullName
   * @return sourceFullName
  **/
  @ApiModelProperty(value = "")
  public String getSourceFullName() {
    return sourceFullName;
  }

  public void setSourceFullName(String sourceFullName) {
    this.sourceFullName = sourceFullName;
  }

  public Picture borderLineColor(Color borderLineColor) {
    this.borderLineColor = borderLineColor;
    return this;
  }

   /**
   * Get borderLineColor
   * @return borderLineColor
  **/
  @ApiModelProperty(value = "")
  public Color getBorderLineColor() {
    return borderLineColor;
  }

  public void setBorderLineColor(Color borderLineColor) {
    this.borderLineColor = borderLineColor;
  }

  public Picture originalHeight(Integer originalHeight) {
    this.originalHeight = originalHeight;
    return this;
  }

   /**
   * Get originalHeight
   * @return originalHeight
  **/
  @ApiModelProperty(value = "")
  public Integer getOriginalHeight() {
    return originalHeight;
  }

  public void setOriginalHeight(Integer originalHeight) {
    this.originalHeight = originalHeight;
  }

  public Picture imageFormat(String imageFormat) {
    this.imageFormat = imageFormat;
    return this;
  }

   /**
   * Get imageFormat
   * @return imageFormat
  **/
  @ApiModelProperty(value = "")
  public String getImageFormat() {
    return imageFormat;
  }

  public void setImageFormat(String imageFormat) {
    this.imageFormat = imageFormat;
  }

  public Picture originalWidth(Integer originalWidth) {
    this.originalWidth = originalWidth;
    return this;
  }

   /**
   * Get originalWidth
   * @return originalWidth
  **/
  @ApiModelProperty(value = "")
  public Integer getOriginalWidth() {
    return originalWidth;
  }

  public void setOriginalWidth(Integer originalWidth) {
    this.originalWidth = originalWidth;
  }

  public Picture borderWeight(Double borderWeight) {
    this.borderWeight = borderWeight;
    return this;
  }

   /**
   * Get borderWeight
   * @return borderWeight
  **/
  @ApiModelProperty(value = "")
  public Double getBorderWeight() {
    return borderWeight;
  }

  public void setBorderWeight(Double borderWeight) {
    this.borderWeight = borderWeight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Picture picture = (Picture) o;
    return Objects.equals(this.alternativeText, picture.alternativeText) &&
        Objects.equals(this.bottom, picture.bottom) &&
        Objects.equals(this.top, picture.top) &&
        Objects.equals(this.width, picture.width) &&
        Objects.equals(this.htmlText, picture.htmlText) &&
        Objects.equals(this.textVerticalAlignment, picture.textVerticalAlignment) &&
        Objects.equals(this.autoShapeType, picture.autoShapeType) &&
        Objects.equals(this.isPrintable, picture.isPrintable) &&
        Objects.equals(this.upperLeftColumn, picture.upperLeftColumn) &&
        Objects.equals(this.isLockAspectRatio, picture.isLockAspectRatio) &&
        Objects.equals(this.isGroup, picture.isGroup) &&
        Objects.equals(this.rotationAngle, picture.rotationAngle) &&
        Objects.equals(this.zorderPosition, picture.zorderPosition) &&
        Objects.equals(this.textHorizontalOverflow, picture.textHorizontalOverflow) &&
        Objects.equals(this.msoDrawingType, picture.msoDrawingType) &&
        Objects.equals(this.textOrientationType, picture.textOrientationType) &&
        Objects.equals(this.placement, picture.placement) &&
        Objects.equals(this.name, picture.name) &&
        Objects.equals(this.isWordArt, picture.isWordArt) &&
        Objects.equals(this.linkedCell, picture.linkedCell) &&
        Objects.equals(this.upperLeftRow, picture.upperLeftRow) &&
        Objects.equals(this.isLocked, picture.isLocked) &&
        Objects.equals(this.lowerRightRow, picture.lowerRightRow) &&
        Objects.equals(this.isTextWrapped, picture.isTextWrapped) &&
        Objects.equals(this.Y, picture.Y) &&
        Objects.equals(this.X, picture.X) &&
        Objects.equals(this.isHidden, picture.isHidden) &&
        Objects.equals(this.left, picture.left) &&
        Objects.equals(this.right, picture.right) &&
        Objects.equals(this.text, picture.text) &&
        Objects.equals(this.lowerRightColumn, picture.lowerRightColumn) &&
        Objects.equals(this.height, picture.height) &&
        Objects.equals(this.textHorizontalAlignment, picture.textHorizontalAlignment) &&
        Objects.equals(this.textVerticalOverflow, picture.textVerticalOverflow) &&
        Objects.equals(this.link, picture.link) &&
        Objects.equals(this.sourceFullName, picture.sourceFullName) &&
        Objects.equals(this.borderLineColor, picture.borderLineColor) &&
        Objects.equals(this.originalHeight, picture.originalHeight) &&
        Objects.equals(this.imageFormat, picture.imageFormat) &&
        Objects.equals(this.originalWidth, picture.originalWidth) &&
        Objects.equals(this.borderWeight, picture.borderWeight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alternativeText, bottom, top, width, htmlText, textVerticalAlignment, autoShapeType, isPrintable, upperLeftColumn, isLockAspectRatio, isGroup, rotationAngle, zorderPosition, textHorizontalOverflow, msoDrawingType, textOrientationType, placement, name, isWordArt, linkedCell, upperLeftRow, isLocked, lowerRightRow, isTextWrapped, Y, X, isHidden, left, right, text, lowerRightColumn, height, textHorizontalAlignment, textVerticalOverflow, link, sourceFullName, borderLineColor, originalHeight, imageFormat, originalWidth, borderWeight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Picture {\n");
    
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
    sb.append("    sourceFullName: ").append(toIndentedString(sourceFullName)).append("\n");
    sb.append("    borderLineColor: ").append(toIndentedString(borderLineColor)).append("\n");
    sb.append("    originalHeight: ").append(toIndentedString(originalHeight)).append("\n");
    sb.append("    imageFormat: ").append(toIndentedString(imageFormat)).append("\n");
    sb.append("    originalWidth: ").append(toIndentedString(originalWidth)).append("\n");
    sb.append("    borderWeight: ").append(toIndentedString(borderWeight)).append("\n");
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

