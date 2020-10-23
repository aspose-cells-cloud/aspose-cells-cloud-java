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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Top10Filter
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-19T23:40:54.225-05:00")
public class Top10Filter {
  @SerializedName("Items")
  private Integer items = null;

  @SerializedName("IsPercent")
  private Boolean isPercent = null;

  @SerializedName("IsTop")
  private Boolean isTop = null;

  @SerializedName("Criteria")
  private String criteria = null;

  public Top10Filter items(Integer items) {
    this.items = items;
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getItems() {
    return items;
  }

  public void setItems(Integer items) {
    this.items = items;
  }

  public Top10Filter isPercent(Boolean isPercent) {
    this.isPercent = isPercent;
    return this;
  }

   /**
   * Get isPercent
   * @return isPercent
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean IsPercent() {
    return isPercent;
  }

  public void setIsPercent(Boolean isPercent) {
    this.isPercent = isPercent;
  }

  public Top10Filter isTop(Boolean isTop) {
    this.isTop = isTop;
    return this;
  }

   /**
   * Get isTop
   * @return isTop
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean IsTop() {
    return isTop;
  }

  public void setIsTop(Boolean isTop) {
    this.isTop = isTop;
  }

  public Top10Filter criteria(String criteria) {
    this.criteria = criteria;
    return this;
  }

   /**
   * Get criteria
   * @return criteria
  **/
  @ApiModelProperty(value = "")
  public String getCriteria() {
    return criteria;
  }

  public void setCriteria(String criteria) {
    this.criteria = criteria;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Top10Filter top10Filter = (Top10Filter) o;
    return Objects.equals(this.items, top10Filter.items) &&
        Objects.equals(this.isPercent, top10Filter.isPercent) &&
        Objects.equals(this.isTop, top10Filter.isTop) &&
        Objects.equals(this.criteria, top10Filter.criteria);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, isPercent, isTop, criteria);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Top10Filter {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    isPercent: ").append(toIndentedString(isPercent)).append("\n");
    sb.append("    isTop: ").append(toIndentedString(isTop)).append("\n");
    sb.append("    criteria: ").append(toIndentedString(criteria)).append("\n");
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

