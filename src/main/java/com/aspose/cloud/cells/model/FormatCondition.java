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
import com.aspose.cloud.cells.model.AboveAverage;
import com.aspose.cloud.cells.model.ColorScale;
import com.aspose.cloud.cells.model.DataBar;
import com.aspose.cloud.cells.model.IconSet;
import com.aspose.cloud.cells.model.Link;
import com.aspose.cloud.cells.model.LinkElement;
import com.aspose.cloud.cells.model.Style;
import com.aspose.cloud.cells.model.Top10;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * FormatCondition
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-10-10T23:25:01.778-05:00")
public class FormatCondition {
  @SerializedName("link")
  private Link link = null;

  @SerializedName("AboveAverage")
  private AboveAverage aboveAverage = null;

  @SerializedName("Formula2")
  private String formula2 = null;

  @SerializedName("Style")
  private Style style = null;

  @SerializedName("Formula1")
  private String formula1 = null;

  @SerializedName("ColorScale")
  private ColorScale colorScale = null;

  @SerializedName("DataBar")
  private DataBar dataBar = null;

  @SerializedName("Text")
  private String text = null;

  @SerializedName("StopIfTrue")
  private Boolean stopIfTrue = null;

  @SerializedName("Priority")
  private Integer priority = null;

  @SerializedName("Top10")
  private Top10 top10 = null;

  @SerializedName("Operator")
  private String operator = null;

  @SerializedName("IconSet")
  private IconSet iconSet = null;

  @SerializedName("Type")
  private String type = null;

  @SerializedName("TimePeriod")
  private String timePeriod = null;

  public FormatCondition link(Link link) {
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

  public FormatCondition aboveAverage(AboveAverage aboveAverage) {
    this.aboveAverage = aboveAverage;
    return this;
  }

   /**
   * Get aboveAverage
   * @return aboveAverage
  **/
  @ApiModelProperty(value = "")
  public AboveAverage getAboveAverage() {
    return aboveAverage;
  }

  public void setAboveAverage(AboveAverage aboveAverage) {
    this.aboveAverage = aboveAverage;
  }

  public FormatCondition formula2(String formula2) {
    this.formula2 = formula2;
    return this;
  }

   /**
   * Get formula2
   * @return formula2
  **/
  @ApiModelProperty(value = "")
  public String getFormula2() {
    return formula2;
  }

  public void setFormula2(String formula2) {
    this.formula2 = formula2;
  }

  public FormatCondition style(Style style) {
    this.style = style;
    return this;
  }

   /**
   * Get style
   * @return style
  **/
  @ApiModelProperty(value = "")
  public Style getStyle() {
    return style;
  }

  public void setStyle(Style style) {
    this.style = style;
  }

  public FormatCondition formula1(String formula1) {
    this.formula1 = formula1;
    return this;
  }

   /**
   * Get formula1
   * @return formula1
  **/
  @ApiModelProperty(value = "")
  public String getFormula1() {
    return formula1;
  }

  public void setFormula1(String formula1) {
    this.formula1 = formula1;
  }

  public FormatCondition colorScale(ColorScale colorScale) {
    this.colorScale = colorScale;
    return this;
  }

   /**
   * Get colorScale
   * @return colorScale
  **/
  @ApiModelProperty(value = "")
  public ColorScale getColorScale() {
    return colorScale;
  }

  public void setColorScale(ColorScale colorScale) {
    this.colorScale = colorScale;
  }

  public FormatCondition dataBar(DataBar dataBar) {
    this.dataBar = dataBar;
    return this;
  }

   /**
   * Get dataBar
   * @return dataBar
  **/
  @ApiModelProperty(value = "")
  public DataBar getDataBar() {
    return dataBar;
  }

  public void setDataBar(DataBar dataBar) {
    this.dataBar = dataBar;
  }

  public FormatCondition text(String text) {
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

  public FormatCondition stopIfTrue(Boolean stopIfTrue) {
    this.stopIfTrue = stopIfTrue;
    return this;
  }

   /**
   * True, no rules with lower priority may be applied over this rule, when this     rule evaluates to true.  Only applies for Excel 2007;
   * @return stopIfTrue
  **/
  @ApiModelProperty(value = "True, no rules with lower priority may be applied over this rule, when this     rule evaluates to true.  Only applies for Excel 2007;")
  public Boolean StopIfTrue() {
    return stopIfTrue;
  }

  public void setStopIfTrue(Boolean stopIfTrue) {
    this.stopIfTrue = stopIfTrue;
  }

  public FormatCondition priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * The priority of this conditional formatting rule. This value is used to determine     which format should be evaluated and rendered. Lower numeric values are higher     priority than higher numeric values, where &#39;1&#39; is the highest priority.
   * @return priority
  **/
  @ApiModelProperty(value = "The priority of this conditional formatting rule. This value is used to determine     which format should be evaluated and rendered. Lower numeric values are higher     priority than higher numeric values, where '1' is the highest priority.")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public FormatCondition top10(Top10 top10) {
    this.top10 = top10;
    return this;
  }

   /**
   * Get top10
   * @return top10
  **/
  @ApiModelProperty(value = "")
  public Top10 getTop10() {
    return top10;
  }

  public void setTop10(Top10 top10) {
    this.top10 = top10;
  }

  public FormatCondition operator(String operator) {
    this.operator = operator;
    return this;
  }

   /**
   * Get operator
   * @return operator
  **/
  @ApiModelProperty(value = "")
  public String getOperator() {
    return operator;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }

  public FormatCondition iconSet(IconSet iconSet) {
    this.iconSet = iconSet;
    return this;
  }

   /**
   * Get iconSet
   * @return iconSet
  **/
  @ApiModelProperty(value = "")
  public IconSet getIconSet() {
    return iconSet;
  }

  public void setIconSet(IconSet iconSet) {
    this.iconSet = iconSet;
  }

  public FormatCondition type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Gets and sets whether the conditional format Type.             
   * @return type
  **/
  @ApiModelProperty(value = "Gets and sets whether the conditional format Type.             ")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public FormatCondition timePeriod(String timePeriod) {
    this.timePeriod = timePeriod;
    return this;
  }

   /**
   * Get timePeriod
   * @return timePeriod
  **/
  @ApiModelProperty(value = "")
  public String getTimePeriod() {
    return timePeriod;
  }

  public void setTimePeriod(String timePeriod) {
    this.timePeriod = timePeriod;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormatCondition formatCondition = (FormatCondition) o;
    return Objects.equals(this.link, formatCondition.link) &&
        Objects.equals(this.aboveAverage, formatCondition.aboveAverage) &&
        Objects.equals(this.formula2, formatCondition.formula2) &&
        Objects.equals(this.style, formatCondition.style) &&
        Objects.equals(this.formula1, formatCondition.formula1) &&
        Objects.equals(this.colorScale, formatCondition.colorScale) &&
        Objects.equals(this.dataBar, formatCondition.dataBar) &&
        Objects.equals(this.text, formatCondition.text) &&
        Objects.equals(this.stopIfTrue, formatCondition.stopIfTrue) &&
        Objects.equals(this.priority, formatCondition.priority) &&
        Objects.equals(this.top10, formatCondition.top10) &&
        Objects.equals(this.operator, formatCondition.operator) &&
        Objects.equals(this.iconSet, formatCondition.iconSet) &&
        Objects.equals(this.type, formatCondition.type) &&
        Objects.equals(this.timePeriod, formatCondition.timePeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, aboveAverage, formula2, style, formula1, colorScale, dataBar, text, stopIfTrue, priority, top10, operator, iconSet, type, timePeriod);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormatCondition {\n");
    
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    aboveAverage: ").append(toIndentedString(aboveAverage)).append("\n");
    sb.append("    formula2: ").append(toIndentedString(formula2)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
    sb.append("    formula1: ").append(toIndentedString(formula1)).append("\n");
    sb.append("    colorScale: ").append(toIndentedString(colorScale)).append("\n");
    sb.append("    dataBar: ").append(toIndentedString(dataBar)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    stopIfTrue: ").append(toIndentedString(stopIfTrue)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    top10: ").append(toIndentedString(top10)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    iconSet: ").append(toIndentedString(iconSet)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    timePeriod: ").append(toIndentedString(timePeriod)).append("\n");
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

