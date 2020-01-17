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
import com.aspose.cloud.cells.model.ConditionalFormattingIcon;
import com.aspose.cloud.cells.model.ConditionalFormattingValue;
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
 * Describe the IconSet conditional formatting rule. This conditional formatting     rule applies icons to cells according to their values.
 */
@ApiModel(description = "Describe the IconSet conditional formatting rule. This conditional formatting     rule applies icons to cells according to their values.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-02T17:30:33.766+08:00")
public class IconSet {
  @SerializedName("Reverse")
  private Boolean reverse = null;

  @SerializedName("CfIcons")
  private List<ConditionalFormattingIcon> cfIcons = null;

  @SerializedName("Cfvos")
  private List<ConditionalFormattingValue> cfvos = null;

  @SerializedName("IconSetType")
  private String iconSetType = null;

  @SerializedName("IsCustom")
  private Boolean isCustom = null;

  @SerializedName("ShowValue")
  private Boolean showValue = null;

  public IconSet reverse(Boolean reverse) {
    this.reverse = reverse;
    return this;
  }

   /**
   * Get or set the flag indicating whether to reverses the default order of the   icons in this icon set.  Default value is false.             
   * @return reverse
  **/
  @ApiModelProperty(value = "Get or set the flag indicating whether to reverses the default order of the   icons in this icon set.  Default value is false.             ")
  public Boolean Reverse() {
    return reverse;
  }

  public void setReverse(Boolean reverse) {
    this.reverse = reverse;
  }

  public IconSet cfIcons(List<ConditionalFormattingIcon> cfIcons) {
    this.cfIcons = cfIcons;
    return this;
  }

  public IconSet addCfIconsItem(ConditionalFormattingIcon cfIconsItem) {
    if (this.cfIcons == null) {
      this.cfIcons = new ArrayList<>();
    }
    this.cfIcons.add(cfIconsItem);
    return this;
  }

   /**
   * Get theAspose.Cells.ConditionalFormattingIcon from the collection
   * @return cfIcons
  **/
  @ApiModelProperty(value = "Get theAspose.Cells.ConditionalFormattingIcon from the collection")
  public List<ConditionalFormattingIcon> getCfIcons() {
    return cfIcons;
  }

  public void setCfIcons(List<ConditionalFormattingIcon> cfIcons) {
    this.cfIcons = cfIcons;
  }

  public IconSet cfvos(List<ConditionalFormattingValue> cfvos) {
    this.cfvos = cfvos;
    return this;
  }

  public IconSet addCfvosItem(ConditionalFormattingValue cfvosItem) {
    if (this.cfvos == null) {
      this.cfvos = new ArrayList<>();
    }
    this.cfvos.add(cfvosItem);
    return this;
  }

   /**
   * Get the CFValueObjects instance.
   * @return cfvos
  **/
  @ApiModelProperty(value = "Get the CFValueObjects instance.")
  public List<ConditionalFormattingValue> getCfvos() {
    return cfvos;
  }

  public void setCfvos(List<ConditionalFormattingValue> cfvos) {
    this.cfvos = cfvos;
  }

  public IconSet iconSetType(String iconSetType) {
    this.iconSetType = iconSetType;
    return this;
  }

   /**
   * Get or Set the icon set type to display.  Setting the type will auto check    if the current Cfvos&#39;s count is accord with the new type. If not accord,    old Cfvos will be cleaned and default Cfvos will be added.             
   * @return iconSetType
  **/
  @ApiModelProperty(value = "Get or Set the icon set type to display.  Setting the type will auto check    if the current Cfvos's count is accord with the new type. If not accord,    old Cfvos will be cleaned and default Cfvos will be added.             ")
  public String getIconSetType() {
    return iconSetType;
  }

  public void setIconSetType(String iconSetType) {
    this.iconSetType = iconSetType;
  }

  public IconSet isCustom(Boolean isCustom) {
    this.isCustom = isCustom;
    return this;
  }

   /**
   * Indicates whether the icon set is custom.  Default value is false.
   * @return isCustom
  **/
  @ApiModelProperty(value = "Indicates whether the icon set is custom.  Default value is false.")
  public Boolean IsCustom() {
    return isCustom;
  }

  public void setIsCustom(Boolean isCustom) {
    this.isCustom = isCustom;
  }

  public IconSet showValue(Boolean showValue) {
    this.showValue = showValue;
    return this;
  }

   /**
   * Get or set the flag indicating whether to show the values of the cells on    which this icon set is applied.  Default value is true.             
   * @return showValue
  **/
  @ApiModelProperty(value = "Get or set the flag indicating whether to show the values of the cells on    which this icon set is applied.  Default value is true.             ")
  public Boolean ShowValue() {
    return showValue;
  }

  public void setShowValue(Boolean showValue) {
    this.showValue = showValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IconSet iconSet = (IconSet) o;
    return Objects.equals(this.reverse, iconSet.reverse) &&
        Objects.equals(this.cfIcons, iconSet.cfIcons) &&
        Objects.equals(this.cfvos, iconSet.cfvos) &&
        Objects.equals(this.iconSetType, iconSet.iconSetType) &&
        Objects.equals(this.isCustom, iconSet.isCustom) &&
        Objects.equals(this.showValue, iconSet.showValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reverse, cfIcons, cfvos, iconSetType, isCustom, showValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IconSet {\n");
    
    sb.append("    reverse: ").append(toIndentedString(reverse)).append("\n");
    sb.append("    cfIcons: ").append(toIndentedString(cfIcons)).append("\n");
    sb.append("    cfvos: ").append(toIndentedString(cfvos)).append("\n");
    sb.append("    iconSetType: ").append(toIndentedString(iconSetType)).append("\n");
    sb.append("    isCustom: ").append(toIndentedString(isCustom)).append("\n");
    sb.append("    showValue: ").append(toIndentedString(showValue)).append("\n");
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

