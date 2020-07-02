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
import com.aspose.cloud.cells.model.ColorFilter;
import com.aspose.cloud.cells.model.CustomFilter;
import com.aspose.cloud.cells.model.DynamicFilter;
import com.aspose.cloud.cells.model.IconFilter;
import com.aspose.cloud.cells.model.MultipleFilters;
import com.aspose.cloud.cells.model.Top10Filter;
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
 * FilterColumn
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-02T09:41:11.020+08:00")
public class FilterColumn {
  @SerializedName("FilterType")
  private String filterType = null;

  @SerializedName("MultipleFilters")
  private MultipleFilters multipleFilters = null;

  @SerializedName("CustomFilters")
  private List<CustomFilter> customFilters = null;

  @SerializedName("DynamicFilter")
  private DynamicFilter dynamicFilter = null;

  @SerializedName("ColorFilter")
  private ColorFilter colorFilter = null;

  @SerializedName("FieldIndex")
  private Integer fieldIndex = null;

  @SerializedName("Top10Filter")
  private Top10Filter top10Filter = null;

  @SerializedName("IconFilter")
  private IconFilter iconFilter = null;

  @SerializedName("Visibledropdown")
  private String visibledropdown = null;

  public FilterColumn filterType(String filterType) {
    this.filterType = filterType;
    return this;
  }

   /**
   * Get filterType
   * @return filterType
  **/
  @ApiModelProperty(value = "")
  public String getFilterType() {
    return filterType;
  }

  public void setFilterType(String filterType) {
    this.filterType = filterType;
  }

  public FilterColumn multipleFilters(MultipleFilters multipleFilters) {
    this.multipleFilters = multipleFilters;
    return this;
  }

   /**
   * Get multipleFilters
   * @return multipleFilters
  **/
  @ApiModelProperty(value = "")
  public MultipleFilters getMultipleFilters() {
    return multipleFilters;
  }

  public void setMultipleFilters(MultipleFilters multipleFilters) {
    this.multipleFilters = multipleFilters;
  }

  public FilterColumn customFilters(List<CustomFilter> customFilters) {
    this.customFilters = customFilters;
    return this;
  }

  public FilterColumn addCustomFiltersItem(CustomFilter customFiltersItem) {
    if (this.customFilters == null) {
      this.customFilters = new ArrayList<>();
    }
    this.customFilters.add(customFiltersItem);
    return this;
  }

   /**
   * Get customFilters
   * @return customFilters
  **/
  @ApiModelProperty(value = "")
  public List<CustomFilter> getCustomFilters() {
    return customFilters;
  }

  public void setCustomFilters(List<CustomFilter> customFilters) {
    this.customFilters = customFilters;
  }

  public FilterColumn dynamicFilter(DynamicFilter dynamicFilter) {
    this.dynamicFilter = dynamicFilter;
    return this;
  }

   /**
   * Get dynamicFilter
   * @return dynamicFilter
  **/
  @ApiModelProperty(value = "")
  public DynamicFilter getDynamicFilter() {
    return dynamicFilter;
  }

  public void setDynamicFilter(DynamicFilter dynamicFilter) {
    this.dynamicFilter = dynamicFilter;
  }

  public FilterColumn colorFilter(ColorFilter colorFilter) {
    this.colorFilter = colorFilter;
    return this;
  }

   /**
   * Get colorFilter
   * @return colorFilter
  **/
  @ApiModelProperty(value = "")
  public ColorFilter getColorFilter() {
    return colorFilter;
  }

  public void setColorFilter(ColorFilter colorFilter) {
    this.colorFilter = colorFilter;
  }

  public FilterColumn fieldIndex(Integer fieldIndex) {
    this.fieldIndex = fieldIndex;
    return this;
  }

   /**
   * Get fieldIndex
   * @return fieldIndex
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getFieldIndex() {
    return fieldIndex;
  }

  public void setFieldIndex(Integer fieldIndex) {
    this.fieldIndex = fieldIndex;
  }

  public FilterColumn top10Filter(Top10Filter top10Filter) {
    this.top10Filter = top10Filter;
    return this;
  }

   /**
   * Get top10Filter
   * @return top10Filter
  **/
  @ApiModelProperty(value = "")
  public Top10Filter getTop10Filter() {
    return top10Filter;
  }

  public void setTop10Filter(Top10Filter top10Filter) {
    this.top10Filter = top10Filter;
  }

  public FilterColumn iconFilter(IconFilter iconFilter) {
    this.iconFilter = iconFilter;
    return this;
  }

   /**
   * Get iconFilter
   * @return iconFilter
  **/
  @ApiModelProperty(value = "")
  public IconFilter getIconFilter() {
    return iconFilter;
  }

  public void setIconFilter(IconFilter iconFilter) {
    this.iconFilter = iconFilter;
  }

  public FilterColumn visibledropdown(String visibledropdown) {
    this.visibledropdown = visibledropdown;
    return this;
  }

   /**
   * Get visibledropdown
   * @return visibledropdown
  **/
  @ApiModelProperty(value = "")
  public String getVisibledropdown() {
    return visibledropdown;
  }

  public void setVisibledropdown(String visibledropdown) {
    this.visibledropdown = visibledropdown;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilterColumn filterColumn = (FilterColumn) o;
    return Objects.equals(this.filterType, filterColumn.filterType) &&
        Objects.equals(this.multipleFilters, filterColumn.multipleFilters) &&
        Objects.equals(this.customFilters, filterColumn.customFilters) &&
        Objects.equals(this.dynamicFilter, filterColumn.dynamicFilter) &&
        Objects.equals(this.colorFilter, filterColumn.colorFilter) &&
        Objects.equals(this.fieldIndex, filterColumn.fieldIndex) &&
        Objects.equals(this.top10Filter, filterColumn.top10Filter) &&
        Objects.equals(this.iconFilter, filterColumn.iconFilter) &&
        Objects.equals(this.visibledropdown, filterColumn.visibledropdown);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filterType, multipleFilters, customFilters, dynamicFilter, colorFilter, fieldIndex, top10Filter, iconFilter, visibledropdown);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilterColumn {\n");
    
    sb.append("    filterType: ").append(toIndentedString(filterType)).append("\n");
    sb.append("    multipleFilters: ").append(toIndentedString(multipleFilters)).append("\n");
    sb.append("    customFilters: ").append(toIndentedString(customFilters)).append("\n");
    sb.append("    dynamicFilter: ").append(toIndentedString(dynamicFilter)).append("\n");
    sb.append("    colorFilter: ").append(toIndentedString(colorFilter)).append("\n");
    sb.append("    fieldIndex: ").append(toIndentedString(fieldIndex)).append("\n");
    sb.append("    top10Filter: ").append(toIndentedString(top10Filter)).append("\n");
    sb.append("    iconFilter: ").append(toIndentedString(iconFilter)).append("\n");
    sb.append("    visibledropdown: ").append(toIndentedString(visibledropdown)).append("\n");
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

