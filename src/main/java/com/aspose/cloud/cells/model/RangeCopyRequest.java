/* 
 * <summary>
 *  Copyright (c) 2019 Aspose.Cells Cloud
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
import com.aspose.cloud.cells.model.PasteOptions;
import com.aspose.cloud.cells.model.Range;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * RangeCopyRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-24T14:56:32.974+08:00")
public class RangeCopyRequest {
  @SerializedName("Source")
  private Range source = null;

  @SerializedName("Operate")
  private String operate = null;

  @SerializedName("Target")
  private Range target = null;

  @SerializedName("PasteOptions")
  private PasteOptions pasteOptions = null;

  public RangeCopyRequest source(Range source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @ApiModelProperty(value = "")
  public Range getSource() {
    return source;
  }

  public void setSource(Range source) {
    this.source = source;
  }

  public RangeCopyRequest operate(String operate) {
    this.operate = operate;
    return this;
  }

   /**
   * Get operate
   * @return operate
  **/
  @ApiModelProperty(value = "")
  public String getOperate() {
    return operate;
  }

  public void setOperate(String operate) {
    this.operate = operate;
  }

  public RangeCopyRequest target(Range target) {
    this.target = target;
    return this;
  }

   /**
   * Get target
   * @return target
  **/
  @ApiModelProperty(value = "")
  public Range getTarget() {
    return target;
  }

  public void setTarget(Range target) {
    this.target = target;
  }

  public RangeCopyRequest pasteOptions(PasteOptions pasteOptions) {
    this.pasteOptions = pasteOptions;
    return this;
  }

   /**
   * Get pasteOptions
   * @return pasteOptions
  **/
  @ApiModelProperty(value = "")
  public PasteOptions getPasteOptions() {
    return pasteOptions;
  }

  public void setPasteOptions(PasteOptions pasteOptions) {
    this.pasteOptions = pasteOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RangeCopyRequest rangeCopyRequest = (RangeCopyRequest) o;
    return Objects.equals(this.source, rangeCopyRequest.source) &&
        Objects.equals(this.operate, rangeCopyRequest.operate) &&
        Objects.equals(this.target, rangeCopyRequest.target) &&
        Objects.equals(this.pasteOptions, rangeCopyRequest.pasteOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, operate, target, pasteOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RangeCopyRequest {\n");
    
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    operate: ").append(toIndentedString(operate)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    pasteOptions: ").append(toIndentedString(pasteOptions)).append("\n");
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

