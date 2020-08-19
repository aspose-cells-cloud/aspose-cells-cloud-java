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
import com.aspose.cloud.cells.model.AutoFilter;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Represents a PivotFilter in PivotFilter Collection.
 */
@ApiModel(description = "Represents a PivotFilter in PivotFilter Collection.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-19T15:56:27.996+08:00")
public class PivotFilter {
  @SerializedName("EvaluationOrder")
  private Integer evaluationOrder = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("FilterType")
  private String filterType = null;

  @SerializedName("AutoFilter")
  private AutoFilter autoFilter = null;

  @SerializedName("FieldIndex")
  private Integer fieldIndex = null;

  @SerializedName("MeasureFldIndex")
  private Integer measureFldIndex = null;

  @SerializedName("Value1")
  private String value1 = null;

  @SerializedName("MemberPropertyFieldIndex")
  private Integer memberPropertyFieldIndex = null;

  @SerializedName("Value2")
  private String value2 = null;

  public PivotFilter evaluationOrder(Integer evaluationOrder) {
    this.evaluationOrder = evaluationOrder;
    return this;
  }

   /**
   * Gets the Evaluation Order of the pivot filter.
   * @return evaluationOrder
  **/
  @ApiModelProperty(value = "Gets the Evaluation Order of the pivot filter.")
  public Integer getEvaluationOrder() {
    return evaluationOrder;
  }

  public void setEvaluationOrder(Integer evaluationOrder) {
    this.evaluationOrder = evaluationOrder;
  }

  public PivotFilter name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Gets the name of the pivot filter.
   * @return name
  **/
  @ApiModelProperty(value = "Gets the name of the pivot filter.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PivotFilter filterType(String filterType) {
    this.filterType = filterType;
    return this;
  }

   /**
   * Gets the autofilter type of the pivot filter.
   * @return filterType
  **/
  @ApiModelProperty(value = "Gets the autofilter type of the pivot filter.")
  public String getFilterType() {
    return filterType;
  }

  public void setFilterType(String filterType) {
    this.filterType = filterType;
  }

  public PivotFilter autoFilter(AutoFilter autoFilter) {
    this.autoFilter = autoFilter;
    return this;
  }

   /**
   * Gets the autofilter of the pivot filter.
   * @return autoFilter
  **/
  @ApiModelProperty(value = "Gets the autofilter of the pivot filter.")
  public AutoFilter getAutoFilter() {
    return autoFilter;
  }

  public void setAutoFilter(AutoFilter autoFilter) {
    this.autoFilter = autoFilter;
  }

  public PivotFilter fieldIndex(Integer fieldIndex) {
    this.fieldIndex = fieldIndex;
    return this;
  }

   /**
   * Gets the field index of the pivot filter.
   * @return fieldIndex
  **/
  @ApiModelProperty(value = "Gets the field index of the pivot filter.")
  public Integer getFieldIndex() {
    return fieldIndex;
  }

  public void setFieldIndex(Integer fieldIndex) {
    this.fieldIndex = fieldIndex;
  }

  public PivotFilter measureFldIndex(Integer measureFldIndex) {
    this.measureFldIndex = measureFldIndex;
    return this;
  }

   /**
   * Gets the measure field index of the pivot filter.             
   * @return measureFldIndex
  **/
  @ApiModelProperty(value = "Gets the measure field index of the pivot filter.             ")
  public Integer getMeasureFldIndex() {
    return measureFldIndex;
  }

  public void setMeasureFldIndex(Integer measureFldIndex) {
    this.measureFldIndex = measureFldIndex;
  }

  public PivotFilter value1(String value1) {
    this.value1 = value1;
    return this;
  }

   /**
   * Gets the string value1 of the label pivot filter.             
   * @return value1
  **/
  @ApiModelProperty(value = "Gets the string value1 of the label pivot filter.             ")
  public String getValue1() {
    return value1;
  }

  public void setValue1(String value1) {
    this.value1 = value1;
  }

  public PivotFilter memberPropertyFieldIndex(Integer memberPropertyFieldIndex) {
    this.memberPropertyFieldIndex = memberPropertyFieldIndex;
    return this;
  }

   /**
   * Gets the member property field index of the pivot filter.             
   * @return memberPropertyFieldIndex
  **/
  @ApiModelProperty(value = "Gets the member property field index of the pivot filter.             ")
  public Integer getMemberPropertyFieldIndex() {
    return memberPropertyFieldIndex;
  }

  public void setMemberPropertyFieldIndex(Integer memberPropertyFieldIndex) {
    this.memberPropertyFieldIndex = memberPropertyFieldIndex;
  }

  public PivotFilter value2(String value2) {
    this.value2 = value2;
    return this;
  }

   /**
   * Gets the string value2 of the label pivot filter.             
   * @return value2
  **/
  @ApiModelProperty(value = "Gets the string value2 of the label pivot filter.             ")
  public String getValue2() {
    return value2;
  }

  public void setValue2(String value2) {
    this.value2 = value2;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PivotFilter pivotFilter = (PivotFilter) o;
    return Objects.equals(this.evaluationOrder, pivotFilter.evaluationOrder) &&
        Objects.equals(this.name, pivotFilter.name) &&
        Objects.equals(this.filterType, pivotFilter.filterType) &&
        Objects.equals(this.autoFilter, pivotFilter.autoFilter) &&
        Objects.equals(this.fieldIndex, pivotFilter.fieldIndex) &&
        Objects.equals(this.measureFldIndex, pivotFilter.measureFldIndex) &&
        Objects.equals(this.value1, pivotFilter.value1) &&
        Objects.equals(this.memberPropertyFieldIndex, pivotFilter.memberPropertyFieldIndex) &&
        Objects.equals(this.value2, pivotFilter.value2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evaluationOrder, name, filterType, autoFilter, fieldIndex, measureFldIndex, value1, memberPropertyFieldIndex, value2);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PivotFilter {\n");
    
    sb.append("    evaluationOrder: ").append(toIndentedString(evaluationOrder)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    filterType: ").append(toIndentedString(filterType)).append("\n");
    sb.append("    autoFilter: ").append(toIndentedString(autoFilter)).append("\n");
    sb.append("    fieldIndex: ").append(toIndentedString(fieldIndex)).append("\n");
    sb.append("    measureFldIndex: ").append(toIndentedString(measureFldIndex)).append("\n");
    sb.append("    value1: ").append(toIndentedString(value1)).append("\n");
    sb.append("    memberPropertyFieldIndex: ").append(toIndentedString(memberPropertyFieldIndex)).append("\n");
    sb.append("    value2: ").append(toIndentedString(value2)).append("\n");
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

