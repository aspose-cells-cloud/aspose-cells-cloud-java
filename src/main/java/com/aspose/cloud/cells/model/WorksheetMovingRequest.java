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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Used by workbook moving requests.
 */
@ApiModel(description = "Used by workbook moving requests.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-01T17:19:06.500-05:00")
public class WorksheetMovingRequest {
  @SerializedName("Position")
  private String position = null;

  @SerializedName("DestinationWorksheet")
  private String destinationWorksheet = null;

  public WorksheetMovingRequest position(String position) {
    this.position = position;
    return this;
  }

   /**
   * Position to move. Can be BEFORE or AFTER.
   * @return position
  **/
  @ApiModelProperty(value = "Position to move. Can be BEFORE or AFTER.")
  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public WorksheetMovingRequest destinationWorksheet(String destinationWorksheet) {
    this.destinationWorksheet = destinationWorksheet;
    return this;
  }

   /**
   * Destination worksheet name.  
   * @return destinationWorksheet
  **/
  @ApiModelProperty(value = "Destination worksheet name.  ")
  public String getDestinationWorksheet() {
    return destinationWorksheet;
  }

  public void setDestinationWorksheet(String destinationWorksheet) {
    this.destinationWorksheet = destinationWorksheet;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorksheetMovingRequest worksheetMovingRequest = (WorksheetMovingRequest) o;
    return Objects.equals(this.position, worksheetMovingRequest.position) &&
        Objects.equals(this.destinationWorksheet, worksheetMovingRequest.destinationWorksheet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(position, destinationWorksheet);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorksheetMovingRequest {\n");
    
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    destinationWorksheet: ").append(toIndentedString(destinationWorksheet)).append("\n");
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

