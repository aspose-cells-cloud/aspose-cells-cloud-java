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
import com.aspose.cloud.cells.model.ResultDestination;
import com.aspose.cloud.cells.model.TaskParameter;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SaveResultTaskParameter
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-19T16:36:54.237-06:00")
public class SaveResultTaskParameter extends TaskParameter {
  @SerializedName("ResultSource")
  private String resultSource = null;

  @SerializedName("ResultDestination")
  private ResultDestination resultDestination = null;

  public SaveResultTaskParameter resultSource(String resultSource) {
    this.resultSource = resultSource;
    return this;
  }

   /**
   * Get resultSource
   * @return resultSource
  **/
  @ApiModelProperty(value = "")
  public String getResultSource() {
    return resultSource;
  }

  public void setResultSource(String resultSource) {
    this.resultSource = resultSource;
  }

  public SaveResultTaskParameter resultDestination(ResultDestination resultDestination) {
    this.resultDestination = resultDestination;
    return this;
  }

   /**
   * Get resultDestination
   * @return resultDestination
  **/
  @ApiModelProperty(value = "")
  public ResultDestination getResultDestination() {
    return resultDestination;
  }

  public void setResultDestination(ResultDestination resultDestination) {
    this.resultDestination = resultDestination;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SaveResultTaskParameter saveResultTaskParameter = (SaveResultTaskParameter) o;
    return Objects.equals(this.resultSource, saveResultTaskParameter.resultSource) &&
        Objects.equals(this.resultDestination, saveResultTaskParameter.resultDestination) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultSource, resultDestination, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaveResultTaskParameter {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    resultSource: ").append(toIndentedString(resultSource)).append("\n");
    sb.append("    resultDestination: ").append(toIndentedString(resultDestination)).append("\n");
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

