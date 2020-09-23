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
import com.aspose.cloud.cells.model.FileSource;
import com.aspose.cloud.cells.model.SaveOptions;
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
 * ConvertTaskParameter
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-18T15:44:17.049+08:00")
public class ConvertTaskParameter extends TaskParameter {
  @SerializedName("Workbook")
  private FileSource workbook = null;

  @SerializedName("SaveOptions")
  private SaveOptions saveOptions = null;

  @SerializedName("DestinationFile")
  private String destinationFile = null;

  public ConvertTaskParameter workbook(FileSource workbook) {
    this.workbook = workbook;
    return this;
  }

   /**
   * Get workbook
   * @return workbook
  **/
  @ApiModelProperty(value = "")
  public FileSource getWorkbook() {
    return workbook;
  }

  public void setWorkbook(FileSource workbook) {
    this.workbook = workbook;
  }

  public ConvertTaskParameter saveOptions(SaveOptions saveOptions) {
    this.saveOptions = saveOptions;
    return this;
  }

   /**
   * Get saveOptions
   * @return saveOptions
  **/
  @ApiModelProperty(value = "")
  public SaveOptions getSaveOptions() {
    return saveOptions;
  }

  public void setSaveOptions(SaveOptions saveOptions) {
    this.saveOptions = saveOptions;
  }

  public ConvertTaskParameter destinationFile(String destinationFile) {
    this.destinationFile = destinationFile;
    return this;
  }

   /**
   * Get destinationFile
   * @return destinationFile
  **/
  @ApiModelProperty(value = "")
  public String getDestinationFile() {
    return destinationFile;
  }

  public void setDestinationFile(String destinationFile) {
    this.destinationFile = destinationFile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConvertTaskParameter convertTaskParameter = (ConvertTaskParameter) o;
    return Objects.equals(this.workbook, convertTaskParameter.workbook) &&
        Objects.equals(this.saveOptions, convertTaskParameter.saveOptions) &&
        Objects.equals(this.destinationFile, convertTaskParameter.destinationFile) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workbook, saveOptions, destinationFile, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConvertTaskParameter {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    workbook: ").append(toIndentedString(workbook)).append("\n");
    sb.append("    saveOptions: ").append(toIndentedString(saveOptions)).append("\n");
    sb.append("    destinationFile: ").append(toIndentedString(destinationFile)).append("\n");
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

