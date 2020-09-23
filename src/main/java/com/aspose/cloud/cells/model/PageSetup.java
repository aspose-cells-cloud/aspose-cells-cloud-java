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
import com.aspose.cloud.cells.model.LinkElement;
import com.aspose.cloud.cells.model.PageSection;
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
 * excel print page setting
 */
@ApiModel(description = "excel print page setting")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-18T15:44:17.049+08:00")
public class PageSetup {
  @SerializedName("link")
  private Link link = null;

  @SerializedName("IsHFDiffFirst")
  private Boolean isHFDiffFirst = null;

  @SerializedName("FitToPagesWide")
  private Integer fitToPagesWide = null;

  @SerializedName("PrintQuality")
  private Integer printQuality = null;

  @SerializedName("PrintDraft")
  private Boolean printDraft = null;

  @SerializedName("FirstPageNumber")
  private Integer firstPageNumber = null;

  @SerializedName("PaperSize")
  private String paperSize = null;

  @SerializedName("PrintComments")
  private String printComments = null;

  @SerializedName("PrintErrors")
  private String printErrors = null;

  @SerializedName("CenterVertically")
  private Boolean centerVertically = null;

  @SerializedName("IsPercentScale")
  private Boolean isPercentScale = null;

  @SerializedName("BlackAndWhite")
  private Boolean blackAndWhite = null;

  @SerializedName("PrintTitleColumns")
  private String printTitleColumns = null;

  @SerializedName("IsHFAlignMargins")
  private Boolean isHFAlignMargins = null;

  @SerializedName("PrintArea")
  private String printArea = null;

  @SerializedName("FooterMargin")
  private Double footerMargin = null;

  @SerializedName("LeftMargin")
  private Double leftMargin = null;

  @SerializedName("CenterHorizontally")
  private Boolean centerHorizontally = null;

  @SerializedName("HeaderMargin")
  private Double headerMargin = null;

  @SerializedName("TopMargin")
  private Double topMargin = null;

  @SerializedName("Footer")
  private List<PageSection> footer = null;

  @SerializedName("FitToPagesTall")
  private Integer fitToPagesTall = null;

  @SerializedName("IsHFScaleWithDoc")
  private Boolean isHFScaleWithDoc = null;

  @SerializedName("PrintHeadings")
  private Boolean printHeadings = null;

  @SerializedName("Zoom")
  private Integer zoom = null;

  @SerializedName("PrintTitleRows")
  private String printTitleRows = null;

  @SerializedName("Order")
  private String order = null;

  @SerializedName("PrintCopies")
  private Integer printCopies = null;

  @SerializedName("Orientation")
  private String orientation = null;

  @SerializedName("RightMargin")
  private Double rightMargin = null;

  @SerializedName("PrintGridlines")
  private Boolean printGridlines = null;

  @SerializedName("IsAutoFirstPageNumber")
  private Boolean isAutoFirstPageNumber = null;

  @SerializedName("Header")
  private List<PageSection> header = null;

  @SerializedName("IsHFDiffOddEven")
  private Boolean isHFDiffOddEven = null;

  @SerializedName("BottomMargin")
  private Double bottomMargin = null;

  public PageSetup link(Link link) {
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

  public PageSetup isHFDiffFirst(Boolean isHFDiffFirst) {
    this.isHFDiffFirst = isHFDiffFirst;
    return this;
  }

   /**
   * True means that the header/footer of the first page is different with other pages.
   * @return isHFDiffFirst
  **/
  @ApiModelProperty(value = "True means that the header/footer of the first page is different with other pages.")
  public Boolean IsHFDiffFirst() {
    return isHFDiffFirst;
  }

  public void setIsHFDiffFirst(Boolean isHFDiffFirst) {
    this.isHFDiffFirst = isHFDiffFirst;
  }

  public PageSetup fitToPagesWide(Integer fitToPagesWide) {
    this.fitToPagesWide = fitToPagesWide;
    return this;
  }

   /**
   * Represents the number of pages wide the worksheet will be scaled to when it&#39;s printed.
   * @return fitToPagesWide
  **/
  @ApiModelProperty(value = "Represents the number of pages wide the worksheet will be scaled to when it's printed.")
  public Integer getFitToPagesWide() {
    return fitToPagesWide;
  }

  public void setFitToPagesWide(Integer fitToPagesWide) {
    this.fitToPagesWide = fitToPagesWide;
  }

  public PageSetup printQuality(Integer printQuality) {
    this.printQuality = printQuality;
    return this;
  }

   /**
   * Represents the print quality.
   * @return printQuality
  **/
  @ApiModelProperty(value = "Represents the print quality.")
  public Integer getPrintQuality() {
    return printQuality;
  }

  public void setPrintQuality(Integer printQuality) {
    this.printQuality = printQuality;
  }

  public PageSetup printDraft(Boolean printDraft) {
    this.printDraft = printDraft;
    return this;
  }

   /**
   * Represents if the sheet will be printed without graphics.
   * @return printDraft
  **/
  @ApiModelProperty(value = "Represents if the sheet will be printed without graphics.")
  public Boolean PrintDraft() {
    return printDraft;
  }

  public void setPrintDraft(Boolean printDraft) {
    this.printDraft = printDraft;
  }

  public PageSetup firstPageNumber(Integer firstPageNumber) {
    this.firstPageNumber = firstPageNumber;
    return this;
  }

   /**
   * Represents the first page number that will be used when this sheet is printed.
   * @return firstPageNumber
  **/
  @ApiModelProperty(value = "Represents the first page number that will be used when this sheet is printed.")
  public Integer getFirstPageNumber() {
    return firstPageNumber;
  }

  public void setFirstPageNumber(Integer firstPageNumber) {
    this.firstPageNumber = firstPageNumber;
  }

  public PageSetup paperSize(String paperSize) {
    this.paperSize = paperSize;
    return this;
  }

   /**
   * Represents the size of the paper.
   * @return paperSize
  **/
  @ApiModelProperty(value = "Represents the size of the paper.")
  public String getPaperSize() {
    return paperSize;
  }

  public void setPaperSize(String paperSize) {
    this.paperSize = paperSize;
  }

  public PageSetup printComments(String printComments) {
    this.printComments = printComments;
    return this;
  }

   /**
   * Represents the way comments are printed with the sheet.
   * @return printComments
  **/
  @ApiModelProperty(value = "Represents the way comments are printed with the sheet.")
  public String getPrintComments() {
    return printComments;
  }

  public void setPrintComments(String printComments) {
    this.printComments = printComments;
  }

  public PageSetup printErrors(String printErrors) {
    this.printErrors = printErrors;
    return this;
  }

   /**
   * Specifies the type of print error displayed.
   * @return printErrors
  **/
  @ApiModelProperty(value = "Specifies the type of print error displayed.")
  public String getPrintErrors() {
    return printErrors;
  }

  public void setPrintErrors(String printErrors) {
    this.printErrors = printErrors;
  }

  public PageSetup centerVertically(Boolean centerVertically) {
    this.centerVertically = centerVertically;
    return this;
  }

   /**
   * Represent if the sheet is printed centered vertically.
   * @return centerVertically
  **/
  @ApiModelProperty(value = "Represent if the sheet is printed centered vertically.")
  public Boolean CenterVertically() {
    return centerVertically;
  }

  public void setCenterVertically(Boolean centerVertically) {
    this.centerVertically = centerVertically;
  }

  public PageSetup isPercentScale(Boolean isPercentScale) {
    this.isPercentScale = isPercentScale;
    return this;
  }

   /**
   * If this property is False, the FitToPagesWide and FitToPagesTall properties control how the worksheet is scaled.
   * @return isPercentScale
  **/
  @ApiModelProperty(value = "If this property is False, the FitToPagesWide and FitToPagesTall properties control how the worksheet is scaled.")
  public Boolean IsPercentScale() {
    return isPercentScale;
  }

  public void setIsPercentScale(Boolean isPercentScale) {
    this.isPercentScale = isPercentScale;
  }

  public PageSetup blackAndWhite(Boolean blackAndWhite) {
    this.blackAndWhite = blackAndWhite;
    return this;
  }

   /**
   * Represents if elements of the document will be printed in black and white. True/False
   * @return blackAndWhite
  **/
  @ApiModelProperty(value = "Represents if elements of the document will be printed in black and white. True/False")
  public Boolean BlackAndWhite() {
    return blackAndWhite;
  }

  public void setBlackAndWhite(Boolean blackAndWhite) {
    this.blackAndWhite = blackAndWhite;
  }

  public PageSetup printTitleColumns(String printTitleColumns) {
    this.printTitleColumns = printTitleColumns;
    return this;
  }

   /**
   * Represents the columns that contain the cells to be repeated on the left side of each page.
   * @return printTitleColumns
  **/
  @ApiModelProperty(value = "Represents the columns that contain the cells to be repeated on the left side of each page.")
  public String getPrintTitleColumns() {
    return printTitleColumns;
  }

  public void setPrintTitleColumns(String printTitleColumns) {
    this.printTitleColumns = printTitleColumns;
  }

  public PageSetup isHFAlignMargins(Boolean isHFAlignMargins) {
    this.isHFAlignMargins = isHFAlignMargins;
    return this;
  }

   /**
   * Indicates whether header and footer margins are aligned with the page margins.Only applies for Excel 2007.
   * @return isHFAlignMargins
  **/
  @ApiModelProperty(value = "Indicates whether header and footer margins are aligned with the page margins.Only applies for Excel 2007.")
  public Boolean IsHFAlignMargins() {
    return isHFAlignMargins;
  }

  public void setIsHFAlignMargins(Boolean isHFAlignMargins) {
    this.isHFAlignMargins = isHFAlignMargins;
  }

  public PageSetup printArea(String printArea) {
    this.printArea = printArea;
    return this;
  }

   /**
   * Represents the range to be printed.
   * @return printArea
  **/
  @ApiModelProperty(value = "Represents the range to be printed.")
  public String getPrintArea() {
    return printArea;
  }

  public void setPrintArea(String printArea) {
    this.printArea = printArea;
  }

  public PageSetup footerMargin(Double footerMargin) {
    this.footerMargin = footerMargin;
    return this;
  }

   /**
   * Represents the distance from the bottom of the page to the footer, in unit of centimeters.
   * @return footerMargin
  **/
  @ApiModelProperty(value = "Represents the distance from the bottom of the page to the footer, in unit of centimeters.")
  public Double getFooterMargin() {
    return footerMargin;
  }

  public void setFooterMargin(Double footerMargin) {
    this.footerMargin = footerMargin;
  }

  public PageSetup leftMargin(Double leftMargin) {
    this.leftMargin = leftMargin;
    return this;
  }

   /**
   * Represents the size of the left margin, in unit of centimeters.
   * @return leftMargin
  **/
  @ApiModelProperty(value = "Represents the size of the left margin, in unit of centimeters.")
  public Double getLeftMargin() {
    return leftMargin;
  }

  public void setLeftMargin(Double leftMargin) {
    this.leftMargin = leftMargin;
  }

  public PageSetup centerHorizontally(Boolean centerHorizontally) {
    this.centerHorizontally = centerHorizontally;
    return this;
  }

   /**
   * Represent if the sheet is printed centered horizontally.
   * @return centerHorizontally
  **/
  @ApiModelProperty(value = "Represent if the sheet is printed centered horizontally.")
  public Boolean CenterHorizontally() {
    return centerHorizontally;
  }

  public void setCenterHorizontally(Boolean centerHorizontally) {
    this.centerHorizontally = centerHorizontally;
  }

  public PageSetup headerMargin(Double headerMargin) {
    this.headerMargin = headerMargin;
    return this;
  }

   /**
   * Represents the distance from the top of the page to the header, in unit of centimeters.
   * @return headerMargin
  **/
  @ApiModelProperty(value = "Represents the distance from the top of the page to the header, in unit of centimeters.")
  public Double getHeaderMargin() {
    return headerMargin;
  }

  public void setHeaderMargin(Double headerMargin) {
    this.headerMargin = headerMargin;
  }

  public PageSetup topMargin(Double topMargin) {
    this.topMargin = topMargin;
    return this;
  }

   /**
   * Represents the size of the top margin, in unit of centimeters.
   * @return topMargin
  **/
  @ApiModelProperty(value = "Represents the size of the top margin, in unit of centimeters.")
  public Double getTopMargin() {
    return topMargin;
  }

  public void setTopMargin(Double topMargin) {
    this.topMargin = topMargin;
  }

  public PageSetup footer(List<PageSection> footer) {
    this.footer = footer;
    return this;
  }

  public PageSetup addFooterItem(PageSection footerItem) {
    if (this.footer == null) {
      this.footer = new ArrayList<>();
    }
    this.footer.add(footerItem);
    return this;
  }

   /**
   * Represents the page footor.
   * @return footer
  **/
  @ApiModelProperty(value = "Represents the page footor.")
  public List<PageSection> getFooter() {
    return footer;
  }

  public void setFooter(List<PageSection> footer) {
    this.footer = footer;
  }

  public PageSetup fitToPagesTall(Integer fitToPagesTall) {
    this.fitToPagesTall = fitToPagesTall;
    return this;
  }

   /**
   * Represents the number of pages tall the worksheet will be scaled to when it&#39;s printed.
   * @return fitToPagesTall
  **/
  @ApiModelProperty(value = "Represents the number of pages tall the worksheet will be scaled to when it's printed.")
  public Integer getFitToPagesTall() {
    return fitToPagesTall;
  }

  public void setFitToPagesTall(Integer fitToPagesTall) {
    this.fitToPagesTall = fitToPagesTall;
  }

  public PageSetup isHFScaleWithDoc(Boolean isHFScaleWithDoc) {
    this.isHFScaleWithDoc = isHFScaleWithDoc;
    return this;
  }

   /**
   * Indicates whether header and footer are scaled with document scaling.Only applies for Excel 2007. 
   * @return isHFScaleWithDoc
  **/
  @ApiModelProperty(value = "Indicates whether header and footer are scaled with document scaling.Only applies for Excel 2007. ")
  public Boolean IsHFScaleWithDoc() {
    return isHFScaleWithDoc;
  }

  public void setIsHFScaleWithDoc(Boolean isHFScaleWithDoc) {
    this.isHFScaleWithDoc = isHFScaleWithDoc;
  }

  public PageSetup printHeadings(Boolean printHeadings) {
    this.printHeadings = printHeadings;
    return this;
  }

   /**
   * Represents if row and column headings are printed with this page.
   * @return printHeadings
  **/
  @ApiModelProperty(value = "Represents if row and column headings are printed with this page.")
  public Boolean PrintHeadings() {
    return printHeadings;
  }

  public void setPrintHeadings(Boolean printHeadings) {
    this.printHeadings = printHeadings;
  }

  public PageSetup zoom(Integer zoom) {
    this.zoom = zoom;
    return this;
  }

   /**
   * Represents the scaling factor in percent. It should be between 10 and 400.
   * @return zoom
  **/
  @ApiModelProperty(value = "Represents the scaling factor in percent. It should be between 10 and 400.")
  public Integer getZoom() {
    return zoom;
  }

  public void setZoom(Integer zoom) {
    this.zoom = zoom;
  }

  public PageSetup printTitleRows(String printTitleRows) {
    this.printTitleRows = printTitleRows;
    return this;
  }

   /**
   * Represents the rows that contain the cells to be repeated at the top of each page.
   * @return printTitleRows
  **/
  @ApiModelProperty(value = "Represents the rows that contain the cells to be repeated at the top of each page.")
  public String getPrintTitleRows() {
    return printTitleRows;
  }

  public void setPrintTitleRows(String printTitleRows) {
    this.printTitleRows = printTitleRows;
  }

  public PageSetup order(String order) {
    this.order = order;
    return this;
  }

   /**
   * Represents the order that Microsoft Excel uses to number pages when printing a large worksheet.
   * @return order
  **/
  @ApiModelProperty(value = "Represents the order that Microsoft Excel uses to number pages when printing a large worksheet.")
  public String getOrder() {
    return order;
  }

  public void setOrder(String order) {
    this.order = order;
  }

  public PageSetup printCopies(Integer printCopies) {
    this.printCopies = printCopies;
    return this;
  }

   /**
   * Get and sets number of copies to print.
   * @return printCopies
  **/
  @ApiModelProperty(value = "Get and sets number of copies to print.")
  public Integer getPrintCopies() {
    return printCopies;
  }

  public void setPrintCopies(Integer printCopies) {
    this.printCopies = printCopies;
  }

  public PageSetup orientation(String orientation) {
    this.orientation = orientation;
    return this;
  }

   /**
   * Represents page print orientation.
   * @return orientation
  **/
  @ApiModelProperty(value = "Represents page print orientation.")
  public String getOrientation() {
    return orientation;
  }

  public void setOrientation(String orientation) {
    this.orientation = orientation;
  }

  public PageSetup rightMargin(Double rightMargin) {
    this.rightMargin = rightMargin;
    return this;
  }

   /**
   * Represents the size of the right margin, in unit of centimeters.
   * @return rightMargin
  **/
  @ApiModelProperty(value = "Represents the size of the right margin, in unit of centimeters.")
  public Double getRightMargin() {
    return rightMargin;
  }

  public void setRightMargin(Double rightMargin) {
    this.rightMargin = rightMargin;
  }

  public PageSetup printGridlines(Boolean printGridlines) {
    this.printGridlines = printGridlines;
    return this;
  }

   /**
   * Represents if cell gridlines are printed on the page.
   * @return printGridlines
  **/
  @ApiModelProperty(value = "Represents if cell gridlines are printed on the page.")
  public Boolean PrintGridlines() {
    return printGridlines;
  }

  public void setPrintGridlines(Boolean printGridlines) {
    this.printGridlines = printGridlines;
  }

  public PageSetup isAutoFirstPageNumber(Boolean isAutoFirstPageNumber) {
    this.isAutoFirstPageNumber = isAutoFirstPageNumber;
    return this;
  }

   /**
   * Indicates whether the first the page number is automatically assigned.
   * @return isAutoFirstPageNumber
  **/
  @ApiModelProperty(value = "Indicates whether the first the page number is automatically assigned.")
  public Boolean IsAutoFirstPageNumber() {
    return isAutoFirstPageNumber;
  }

  public void setIsAutoFirstPageNumber(Boolean isAutoFirstPageNumber) {
    this.isAutoFirstPageNumber = isAutoFirstPageNumber;
  }

  public PageSetup header(List<PageSection> header) {
    this.header = header;
    return this;
  }

  public PageSetup addHeaderItem(PageSection headerItem) {
    if (this.header == null) {
      this.header = new ArrayList<>();
    }
    this.header.add(headerItem);
    return this;
  }

   /**
   * Represents the page header.
   * @return header
  **/
  @ApiModelProperty(value = "Represents the page header.")
  public List<PageSection> getHeader() {
    return header;
  }

  public void setHeader(List<PageSection> header) {
    this.header = header;
  }

  public PageSetup isHFDiffOddEven(Boolean isHFDiffOddEven) {
    this.isHFDiffOddEven = isHFDiffOddEven;
    return this;
  }

   /**
   * True means that the header/footer of the odd pages is different with odd pages.
   * @return isHFDiffOddEven
  **/
  @ApiModelProperty(value = "True means that the header/footer of the odd pages is different with odd pages.")
  public Boolean IsHFDiffOddEven() {
    return isHFDiffOddEven;
  }

  public void setIsHFDiffOddEven(Boolean isHFDiffOddEven) {
    this.isHFDiffOddEven = isHFDiffOddEven;
  }

  public PageSetup bottomMargin(Double bottomMargin) {
    this.bottomMargin = bottomMargin;
    return this;
  }

   /**
   * Represents the size of the bottom margin, in unit of centimeters.
   * @return bottomMargin
  **/
  @ApiModelProperty(value = "Represents the size of the bottom margin, in unit of centimeters.")
  public Double getBottomMargin() {
    return bottomMargin;
  }

  public void setBottomMargin(Double bottomMargin) {
    this.bottomMargin = bottomMargin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageSetup pageSetup = (PageSetup) o;
    return Objects.equals(this.link, pageSetup.link) &&
        Objects.equals(this.isHFDiffFirst, pageSetup.isHFDiffFirst) &&
        Objects.equals(this.fitToPagesWide, pageSetup.fitToPagesWide) &&
        Objects.equals(this.printQuality, pageSetup.printQuality) &&
        Objects.equals(this.printDraft, pageSetup.printDraft) &&
        Objects.equals(this.firstPageNumber, pageSetup.firstPageNumber) &&
        Objects.equals(this.paperSize, pageSetup.paperSize) &&
        Objects.equals(this.printComments, pageSetup.printComments) &&
        Objects.equals(this.printErrors, pageSetup.printErrors) &&
        Objects.equals(this.centerVertically, pageSetup.centerVertically) &&
        Objects.equals(this.isPercentScale, pageSetup.isPercentScale) &&
        Objects.equals(this.blackAndWhite, pageSetup.blackAndWhite) &&
        Objects.equals(this.printTitleColumns, pageSetup.printTitleColumns) &&
        Objects.equals(this.isHFAlignMargins, pageSetup.isHFAlignMargins) &&
        Objects.equals(this.printArea, pageSetup.printArea) &&
        Objects.equals(this.footerMargin, pageSetup.footerMargin) &&
        Objects.equals(this.leftMargin, pageSetup.leftMargin) &&
        Objects.equals(this.centerHorizontally, pageSetup.centerHorizontally) &&
        Objects.equals(this.headerMargin, pageSetup.headerMargin) &&
        Objects.equals(this.topMargin, pageSetup.topMargin) &&
        Objects.equals(this.footer, pageSetup.footer) &&
        Objects.equals(this.fitToPagesTall, pageSetup.fitToPagesTall) &&
        Objects.equals(this.isHFScaleWithDoc, pageSetup.isHFScaleWithDoc) &&
        Objects.equals(this.printHeadings, pageSetup.printHeadings) &&
        Objects.equals(this.zoom, pageSetup.zoom) &&
        Objects.equals(this.printTitleRows, pageSetup.printTitleRows) &&
        Objects.equals(this.order, pageSetup.order) &&
        Objects.equals(this.printCopies, pageSetup.printCopies) &&
        Objects.equals(this.orientation, pageSetup.orientation) &&
        Objects.equals(this.rightMargin, pageSetup.rightMargin) &&
        Objects.equals(this.printGridlines, pageSetup.printGridlines) &&
        Objects.equals(this.isAutoFirstPageNumber, pageSetup.isAutoFirstPageNumber) &&
        Objects.equals(this.header, pageSetup.header) &&
        Objects.equals(this.isHFDiffOddEven, pageSetup.isHFDiffOddEven) &&
        Objects.equals(this.bottomMargin, pageSetup.bottomMargin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, isHFDiffFirst, fitToPagesWide, printQuality, printDraft, firstPageNumber, paperSize, printComments, printErrors, centerVertically, isPercentScale, blackAndWhite, printTitleColumns, isHFAlignMargins, printArea, footerMargin, leftMargin, centerHorizontally, headerMargin, topMargin, footer, fitToPagesTall, isHFScaleWithDoc, printHeadings, zoom, printTitleRows, order, printCopies, orientation, rightMargin, printGridlines, isAutoFirstPageNumber, header, isHFDiffOddEven, bottomMargin);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageSetup {\n");
    
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    isHFDiffFirst: ").append(toIndentedString(isHFDiffFirst)).append("\n");
    sb.append("    fitToPagesWide: ").append(toIndentedString(fitToPagesWide)).append("\n");
    sb.append("    printQuality: ").append(toIndentedString(printQuality)).append("\n");
    sb.append("    printDraft: ").append(toIndentedString(printDraft)).append("\n");
    sb.append("    firstPageNumber: ").append(toIndentedString(firstPageNumber)).append("\n");
    sb.append("    paperSize: ").append(toIndentedString(paperSize)).append("\n");
    sb.append("    printComments: ").append(toIndentedString(printComments)).append("\n");
    sb.append("    printErrors: ").append(toIndentedString(printErrors)).append("\n");
    sb.append("    centerVertically: ").append(toIndentedString(centerVertically)).append("\n");
    sb.append("    isPercentScale: ").append(toIndentedString(isPercentScale)).append("\n");
    sb.append("    blackAndWhite: ").append(toIndentedString(blackAndWhite)).append("\n");
    sb.append("    printTitleColumns: ").append(toIndentedString(printTitleColumns)).append("\n");
    sb.append("    isHFAlignMargins: ").append(toIndentedString(isHFAlignMargins)).append("\n");
    sb.append("    printArea: ").append(toIndentedString(printArea)).append("\n");
    sb.append("    footerMargin: ").append(toIndentedString(footerMargin)).append("\n");
    sb.append("    leftMargin: ").append(toIndentedString(leftMargin)).append("\n");
    sb.append("    centerHorizontally: ").append(toIndentedString(centerHorizontally)).append("\n");
    sb.append("    headerMargin: ").append(toIndentedString(headerMargin)).append("\n");
    sb.append("    topMargin: ").append(toIndentedString(topMargin)).append("\n");
    sb.append("    footer: ").append(toIndentedString(footer)).append("\n");
    sb.append("    fitToPagesTall: ").append(toIndentedString(fitToPagesTall)).append("\n");
    sb.append("    isHFScaleWithDoc: ").append(toIndentedString(isHFScaleWithDoc)).append("\n");
    sb.append("    printHeadings: ").append(toIndentedString(printHeadings)).append("\n");
    sb.append("    zoom: ").append(toIndentedString(zoom)).append("\n");
    sb.append("    printTitleRows: ").append(toIndentedString(printTitleRows)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    printCopies: ").append(toIndentedString(printCopies)).append("\n");
    sb.append("    orientation: ").append(toIndentedString(orientation)).append("\n");
    sb.append("    rightMargin: ").append(toIndentedString(rightMargin)).append("\n");
    sb.append("    printGridlines: ").append(toIndentedString(printGridlines)).append("\n");
    sb.append("    isAutoFirstPageNumber: ").append(toIndentedString(isAutoFirstPageNumber)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    isHFDiffOddEven: ").append(toIndentedString(isHFDiffOddEven)).append("\n");
    sb.append("    bottomMargin: ").append(toIndentedString(bottomMargin)).append("\n");
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

