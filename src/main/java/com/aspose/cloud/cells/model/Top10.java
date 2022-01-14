/* 
 * <summary>
 *  Copyright (c) 2022 Aspose.Cells Cloud
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
 * Describe the Top10 conditional formatting rule. This conditional formatting     rule highlights cells whose values fall in the top N or bottom N bracket,     as specified.
 */
@ApiModel(description = "Describe the Top10 conditional formatting rule. This conditional formatting     rule highlights cells whose values fall in the top N or bottom N bracket,     as specified.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-08T17:58:31.285-06:00")
public class Top10 {
  @SerializedName("IsBottom")
  private Boolean isBottom = null;

  @SerializedName("IsPercent")
  private Boolean isPercent = null;

  @SerializedName("Rank")
  private Integer rank = null;

  public Top10 isBottom(Boolean isBottom) {
    this.isBottom = isBottom;
    return this;
  }

   /**
   * Get or set the flag indicating whether a \&quot;top/bottom n\&quot; rule is a \&quot;bottom    n\&quot; rule. &#39;1&#39; indicates &#39;bottom&#39;.  Default value is false.             
   * @return isBottom
  **/
  @ApiModelProperty(value = "Get or set the flag indicating whether a \"top/bottom n\" rule is a \"bottom    n\" rule. '1' indicates 'bottom'.  Default value is false.             ")
  public Boolean IsBottom() {
    return isBottom;
  }

  public void setIsBottom(Boolean isBottom) {
    this.isBottom = isBottom;
  }

  public Top10 isPercent(Boolean isPercent) {
    this.isPercent = isPercent;
    return this;
  }

   /**
   * Get or set the flag indicating whether a \&quot;top/bottom n\&quot; rule is a \&quot;top/bottom     n percent\&quot; rule.  Default value is false.
   * @return isPercent
  **/
  @ApiModelProperty(value = "Get or set the flag indicating whether a \"top/bottom n\" rule is a \"top/bottom     n percent\" rule.  Default value is false.")
  public Boolean IsPercent() {
    return isPercent;
  }

  public void setIsPercent(Boolean isPercent) {
    this.isPercent = isPercent;
  }

  public Top10 rank(Integer rank) {
    this.rank = rank;
    return this;
  }

   /**
   * Get or set the value of \&quot;n\&quot; in a \&quot;top/bottom n\&quot; conditional formatting rule.      If IsPercent is true, the value must between 0 and 100.  Otherwise it must     between 0 and 1000.  Default value is 10.
   * @return rank
  **/
  @ApiModelProperty(value = "Get or set the value of \"n\" in a \"top/bottom n\" conditional formatting rule.      If IsPercent is true, the value must between 0 and 100.  Otherwise it must     between 0 and 1000.  Default value is 10.")
  public Integer getRank() {
    return rank;
  }

  public void setRank(Integer rank) {
    this.rank = rank;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Top10 top10 = (Top10) o;
    return Objects.equals(this.isBottom, top10.isBottom) &&
        Objects.equals(this.isPercent, top10.isPercent) &&
        Objects.equals(this.rank, top10.rank);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isBottom, isPercent, rank);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Top10 {\n");
    
    sb.append("    isBottom: ").append(toIndentedString(isBottom)).append("\n");
    sb.append("    isPercent: ").append(toIndentedString(isPercent)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
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

