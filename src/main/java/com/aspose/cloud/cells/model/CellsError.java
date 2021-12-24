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
import com.aspose.cloud.cells.model.ErrorDetails;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Error
 */
@ApiModel(description = "Error")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-12-23T20:05:07.092-06:00")
public class CellsError {
  @SerializedName("Code")
  private String code = null;

  @SerializedName("Message")
  private String message = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("InnerError")
  private ErrorDetails innerError = null;

  public CellsError code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Code             
   * @return code
  **/
  @ApiModelProperty(value = "Code             ")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public CellsError message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Message             
   * @return message
  **/
  @ApiModelProperty(value = "Message             ")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public CellsError description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description             
   * @return description
  **/
  @ApiModelProperty(value = "Description             ")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CellsError innerError(ErrorDetails innerError) {
    this.innerError = innerError;
    return this;
  }

   /**
   * Inner Error             
   * @return innerError
  **/
  @ApiModelProperty(value = "Inner Error             ")
  public ErrorDetails getInnerError() {
    return innerError;
  }

  public void setInnerError(ErrorDetails innerError) {
    this.innerError = innerError;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CellsError cellsError = (CellsError) o;
    return Objects.equals(this.code, cellsError.code) &&
        Objects.equals(this.message, cellsError.message) &&
        Objects.equals(this.description, cellsError.description) &&
        Objects.equals(this.innerError, cellsError.innerError);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, description, innerError);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CellsError {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    innerError: ").append(toIndentedString(innerError)).append("\n");
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

