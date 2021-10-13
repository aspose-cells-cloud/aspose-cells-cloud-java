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
import com.aspose.cloud.cells.model.FileSource;
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
 * SmartMarkerTaskParameter
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-10-10T23:25:01.778-05:00")
public class SmartMarkerTaskParameter extends TaskParameter {
  @SerializedName("SourceWorkbook")
  private FileSource sourceWorkbook = null;

  @SerializedName("xmlFile")
  private FileSource xmlFile = null;

  @SerializedName("DestinationWorkbook")
  private FileSource destinationWorkbook = null;

  public SmartMarkerTaskParameter sourceWorkbook(FileSource sourceWorkbook) {
    this.sourceWorkbook = sourceWorkbook;
    return this;
  }

   /**
   * Get sourceWorkbook
   * @return sourceWorkbook
  **/
  @ApiModelProperty(value = "")
  public FileSource getSourceWorkbook() {
    return sourceWorkbook;
  }

  public void setSourceWorkbook(FileSource sourceWorkbook) {
    this.sourceWorkbook = sourceWorkbook;
  }

  public SmartMarkerTaskParameter xmlFile(FileSource xmlFile) {
    this.xmlFile = xmlFile;
    return this;
  }

   /**
   * Get xmlFile
   * @return xmlFile
  **/
  @ApiModelProperty(value = "")
  public FileSource getXmlFile() {
    return xmlFile;
  }

  public void setXmlFile(FileSource xmlFile) {
    this.xmlFile = xmlFile;
  }

  public SmartMarkerTaskParameter destinationWorkbook(FileSource destinationWorkbook) {
    this.destinationWorkbook = destinationWorkbook;
    return this;
  }

   /**
   * Get destinationWorkbook
   * @return destinationWorkbook
  **/
  @ApiModelProperty(value = "")
  public FileSource getDestinationWorkbook() {
    return destinationWorkbook;
  }

  public void setDestinationWorkbook(FileSource destinationWorkbook) {
    this.destinationWorkbook = destinationWorkbook;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartMarkerTaskParameter smartMarkerTaskParameter = (SmartMarkerTaskParameter) o;
    return Objects.equals(this.sourceWorkbook, smartMarkerTaskParameter.sourceWorkbook) &&
        Objects.equals(this.xmlFile, smartMarkerTaskParameter.xmlFile) &&
        Objects.equals(this.destinationWorkbook, smartMarkerTaskParameter.destinationWorkbook) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceWorkbook, xmlFile, destinationWorkbook, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartMarkerTaskParameter {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    sourceWorkbook: ").append(toIndentedString(sourceWorkbook)).append("\n");
    sb.append("    xmlFile: ").append(toIndentedString(xmlFile)).append("\n");
    sb.append("    destinationWorkbook: ").append(toIndentedString(destinationWorkbook)).append("\n");
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

