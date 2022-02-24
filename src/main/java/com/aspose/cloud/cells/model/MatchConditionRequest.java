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
import java.util.ArrayList;
import java.util.List;

/**
 * MatchConditionRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-21T07:23:23.400-06:00")
public class MatchConditionRequest {
  @SerializedName("RegexPattern")
  private String regexPattern = null;

  @SerializedName("FullMatchConditions")
  private List<String> fullMatchConditions = null;

  public MatchConditionRequest regexPattern(String regexPattern) {
    this.regexPattern = regexPattern;
    return this;
  }

   /**
   * Get regexPattern
   * @return regexPattern
  **/
  @ApiModelProperty(value = "")
  public String getRegexPattern() {
    return regexPattern;
  }

  public void setRegexPattern(String regexPattern) {
    this.regexPattern = regexPattern;
  }

  public MatchConditionRequest fullMatchConditions(List<String> fullMatchConditions) {
    this.fullMatchConditions = fullMatchConditions;
    return this;
  }

  public MatchConditionRequest addFullMatchConditionsItem(String fullMatchConditionsItem) {
    if (this.fullMatchConditions == null) {
      this.fullMatchConditions = new ArrayList<>();
    }
    this.fullMatchConditions.add(fullMatchConditionsItem);
    return this;
  }

   /**
   * Get fullMatchConditions
   * @return fullMatchConditions
  **/
  @ApiModelProperty(value = "")
  public List<String> getFullMatchConditions() {
    return fullMatchConditions;
  }

  public void setFullMatchConditions(List<String> fullMatchConditions) {
    this.fullMatchConditions = fullMatchConditions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchConditionRequest matchConditionRequest = (MatchConditionRequest) o;
    return Objects.equals(this.regexPattern, matchConditionRequest.regexPattern) &&
        Objects.equals(this.fullMatchConditions, matchConditionRequest.fullMatchConditions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regexPattern, fullMatchConditions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchConditionRequest {\n");
    
    sb.append("    regexPattern: ").append(toIndentedString(regexPattern)).append("\n");
    sb.append("    fullMatchConditions: ").append(toIndentedString(fullMatchConditions)).append("\n");
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

