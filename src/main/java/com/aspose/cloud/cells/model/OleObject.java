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
 * OleObject
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-19T15:56:27.996+08:00")
public class OleObject {
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

  @SerializedName("DisplayAsIcon")
  private Boolean displayAsIcon = null;

  @SerializedName("FileFormatType")
  private String fileFormatType = null;

  @SerializedName("SourceFullName")
  private String sourceFullName = null;

  @SerializedName("IsAutoSize")
  private Boolean isAutoSize = null;

  @SerializedName("ImageSourceFullName")
  private String imageSourceFullName = null;

  @SerializedName("ProgID")
  private String progID = null;

  @SerializedName("IsLink")
  private Boolean isLink = null;

  public OleObject alternativeText(String alternativeText) {
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

  public OleObject bottom(Integer bottom) {
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

  public OleObject top(Integer top) {
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

  public OleObject width(Integer width) {
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

  public OleObject htmlText(String htmlText) {
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

  public OleObject textVerticalAlignment(String textVerticalAlignment) {
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

  public OleObject autoShapeType(String autoShapeType) {
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

  public OleObject isPrintable(Boolean isPrintable) {
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

  public OleObject upperLeftColumn(Integer upperLeftColumn) {
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

  public OleObject isLockAspectRatio(Boolean isLockAspectRatio) {
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

  public OleObject isGroup(Boolean isGroup) {
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

  public OleObject rotationAngle(Double rotationAngle) {
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

  public OleObject zorderPosition(Integer zorderPosition) {
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

  public OleObject textHorizontalOverflow(String textHorizontalOverflow) {
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

  public OleObject msoDrawingType(String msoDrawingType) {
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

  public OleObject textOrientationType(String textOrientationType) {
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

  public OleObject placement(String placement) {
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

  public OleObject name(String name) {
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

  public OleObject isWordArt(Boolean isWordArt) {
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

  public OleObject linkedCell(String linkedCell) {
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

  public OleObject upperLeftRow(Integer upperLeftRow) {
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

  public OleObject isLocked(Boolean isLocked) {
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

  public OleObject lowerRightRow(Integer lowerRightRow) {
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

  public OleObject isTextWrapped(Boolean isTextWrapped) {
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

  public OleObject Y(Integer Y) {
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

  public OleObject X(Integer X) {
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

  public OleObject isHidden(Boolean isHidden) {
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

  public OleObject left(Integer left) {
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

  public OleObject right(Integer right) {
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

  public OleObject text(String text) {
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

  public OleObject lowerRightColumn(Integer lowerRightColumn) {
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

  public OleObject height(Integer height) {
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

  public OleObject textHorizontalAlignment(String textHorizontalAlignment) {
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

  public OleObject textVerticalOverflow(String textVerticalOverflow) {
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

  public OleObject link(Link link) {
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

  public OleObject displayAsIcon(Boolean displayAsIcon) {
    this.displayAsIcon = displayAsIcon;
    return this;
  }

   /**
   * Get displayAsIcon
   * @return displayAsIcon
  **/
  @ApiModelProperty(value = "")
  public Boolean DisplayAsIcon() {
    return displayAsIcon;
  }

  public void setDisplayAsIcon(Boolean displayAsIcon) {
    this.displayAsIcon = displayAsIcon;
  }

  public OleObject fileFormatType(String fileFormatType) {
    this.fileFormatType = fileFormatType;
    return this;
  }

   /**
   * Get fileFormatType
   * @return fileFormatType
  **/
  @ApiModelProperty(value = "")
  public String getFileFormatType() {
    return fileFormatType;
  }

  public void setFileFormatType(String fileFormatType) {
    this.fileFormatType = fileFormatType;
  }

  public OleObject sourceFullName(String sourceFullName) {
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

  public OleObject isAutoSize(Boolean isAutoSize) {
    this.isAutoSize = isAutoSize;
    return this;
  }

   /**
   * Get isAutoSize
   * @return isAutoSize
  **/
  @ApiModelProperty(value = "")
  public Boolean IsAutoSize() {
    return isAutoSize;
  }

  public void setIsAutoSize(Boolean isAutoSize) {
    this.isAutoSize = isAutoSize;
  }

  public OleObject imageSourceFullName(String imageSourceFullName) {
    this.imageSourceFullName = imageSourceFullName;
    return this;
  }

   /**
   * Get imageSourceFullName
   * @return imageSourceFullName
  **/
  @ApiModelProperty(value = "")
  public String getImageSourceFullName() {
    return imageSourceFullName;
  }

  public void setImageSourceFullName(String imageSourceFullName) {
    this.imageSourceFullName = imageSourceFullName;
  }

  public OleObject progID(String progID) {
    this.progID = progID;
    return this;
  }

   /**
   * Get progID
   * @return progID
  **/
  @ApiModelProperty(value = "")
  public String getProgID() {
    return progID;
  }

  public void setProgID(String progID) {
    this.progID = progID;
  }

  public OleObject isLink(Boolean isLink) {
    this.isLink = isLink;
    return this;
  }

   /**
   * Get isLink
   * @return isLink
  **/
  @ApiModelProperty(value = "")
  public Boolean IsLink() {
    return isLink;
  }

  public void setIsLink(Boolean isLink) {
    this.isLink = isLink;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OleObject oleObject = (OleObject) o;
    return Objects.equals(this.alternativeText, oleObject.alternativeText) &&
        Objects.equals(this.bottom, oleObject.bottom) &&
        Objects.equals(this.top, oleObject.top) &&
        Objects.equals(this.width, oleObject.width) &&
        Objects.equals(this.htmlText, oleObject.htmlText) &&
        Objects.equals(this.textVerticalAlignment, oleObject.textVerticalAlignment) &&
        Objects.equals(this.autoShapeType, oleObject.autoShapeType) &&
        Objects.equals(this.isPrintable, oleObject.isPrintable) &&
        Objects.equals(this.upperLeftColumn, oleObject.upperLeftColumn) &&
        Objects.equals(this.isLockAspectRatio, oleObject.isLockAspectRatio) &&
        Objects.equals(this.isGroup, oleObject.isGroup) &&
        Objects.equals(this.rotationAngle, oleObject.rotationAngle) &&
        Objects.equals(this.zorderPosition, oleObject.zorderPosition) &&
        Objects.equals(this.textHorizontalOverflow, oleObject.textHorizontalOverflow) &&
        Objects.equals(this.msoDrawingType, oleObject.msoDrawingType) &&
        Objects.equals(this.textOrientationType, oleObject.textOrientationType) &&
        Objects.equals(this.placement, oleObject.placement) &&
        Objects.equals(this.name, oleObject.name) &&
        Objects.equals(this.isWordArt, oleObject.isWordArt) &&
        Objects.equals(this.linkedCell, oleObject.linkedCell) &&
        Objects.equals(this.upperLeftRow, oleObject.upperLeftRow) &&
        Objects.equals(this.isLocked, oleObject.isLocked) &&
        Objects.equals(this.lowerRightRow, oleObject.lowerRightRow) &&
        Objects.equals(this.isTextWrapped, oleObject.isTextWrapped) &&
        Objects.equals(this.Y, oleObject.Y) &&
        Objects.equals(this.X, oleObject.X) &&
        Objects.equals(this.isHidden, oleObject.isHidden) &&
        Objects.equals(this.left, oleObject.left) &&
        Objects.equals(this.right, oleObject.right) &&
        Objects.equals(this.text, oleObject.text) &&
        Objects.equals(this.lowerRightColumn, oleObject.lowerRightColumn) &&
        Objects.equals(this.height, oleObject.height) &&
        Objects.equals(this.textHorizontalAlignment, oleObject.textHorizontalAlignment) &&
        Objects.equals(this.textVerticalOverflow, oleObject.textVerticalOverflow) &&
        Objects.equals(this.link, oleObject.link) &&
        Objects.equals(this.displayAsIcon, oleObject.displayAsIcon) &&
        Objects.equals(this.fileFormatType, oleObject.fileFormatType) &&
        Objects.equals(this.sourceFullName, oleObject.sourceFullName) &&
        Objects.equals(this.isAutoSize, oleObject.isAutoSize) &&
        Objects.equals(this.imageSourceFullName, oleObject.imageSourceFullName) &&
        Objects.equals(this.progID, oleObject.progID) &&
        Objects.equals(this.isLink, oleObject.isLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alternativeText, bottom, top, width, htmlText, textVerticalAlignment, autoShapeType, isPrintable, upperLeftColumn, isLockAspectRatio, isGroup, rotationAngle, zorderPosition, textHorizontalOverflow, msoDrawingType, textOrientationType, placement, name, isWordArt, linkedCell, upperLeftRow, isLocked, lowerRightRow, isTextWrapped, Y, X, isHidden, left, right, text, lowerRightColumn, height, textHorizontalAlignment, textVerticalOverflow, link, displayAsIcon, fileFormatType, sourceFullName, isAutoSize, imageSourceFullName, progID, isLink);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OleObject {\n");
    
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
    sb.append("    displayAsIcon: ").append(toIndentedString(displayAsIcon)).append("\n");
    sb.append("    fileFormatType: ").append(toIndentedString(fileFormatType)).append("\n");
    sb.append("    sourceFullName: ").append(toIndentedString(sourceFullName)).append("\n");
    sb.append("    isAutoSize: ").append(toIndentedString(isAutoSize)).append("\n");
    sb.append("    imageSourceFullName: ").append(toIndentedString(imageSourceFullName)).append("\n");
    sb.append("    progID: ").append(toIndentedString(progID)).append("\n");
    sb.append("    isLink: ").append(toIndentedString(isLink)).append("\n");
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

