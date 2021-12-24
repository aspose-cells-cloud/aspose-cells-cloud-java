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
import com.aspose.cloud.cells.model.SaveOptions;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * MarkdownSaveOptions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-12-23T20:05:07.092-06:00")
public class MarkdownSaveOptions extends SaveOptions {
  @SerializedName("Encoding")
  private String encoding = null;

  @SerializedName("FormatStrategy")
  private String formatStrategy = null;

  @SerializedName("LineSeparator")
  private String lineSeparator = null;

  public MarkdownSaveOptions encoding(String encoding) {
    this.encoding = encoding;
    return this;
  }

   /**
   * Get encoding
   * @return encoding
  **/
  @ApiModelProperty(value = "")
  public String getEncoding() {
    return encoding;
  }

  public void setEncoding(String encoding) {
    this.encoding = encoding;
  }

  public MarkdownSaveOptions formatStrategy(String formatStrategy) {
    this.formatStrategy = formatStrategy;
    return this;
  }

   /**
   * Get formatStrategy
   * @return formatStrategy
  **/
  @ApiModelProperty(value = "")
  public String getFormatStrategy() {
    return formatStrategy;
  }

  public void setFormatStrategy(String formatStrategy) {
    this.formatStrategy = formatStrategy;
  }

  public MarkdownSaveOptions lineSeparator(String lineSeparator) {
    this.lineSeparator = lineSeparator;
    return this;
  }

   /**
   * Get lineSeparator
   * @return lineSeparator
  **/
  @ApiModelProperty(value = "")
  public String getLineSeparator() {
    return lineSeparator;
  }

  public void setLineSeparator(String lineSeparator) {
    this.lineSeparator = lineSeparator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarkdownSaveOptions markdownSaveOptions = (MarkdownSaveOptions) o;
    return Objects.equals(this.encoding, markdownSaveOptions.encoding) &&
        Objects.equals(this.formatStrategy, markdownSaveOptions.formatStrategy) &&
        Objects.equals(this.lineSeparator, markdownSaveOptions.lineSeparator) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encoding, formatStrategy, lineSeparator, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarkdownSaveOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
    sb.append("    formatStrategy: ").append(toIndentedString(formatStrategy)).append("\n");
    sb.append("    lineSeparator: ").append(toIndentedString(lineSeparator)).append("\n");
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

