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
 * Used by workbook encryption/decryption requests.
 */
@ApiModel(description = "Used by workbook encryption/decryption requests.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-01T17:19:06.500-05:00")
public class WorkbookEncryptionRequest {
  @SerializedName("Password")
  private String password = null;

  @SerializedName("KeyLength")
  private Integer keyLength = null;

  @SerializedName("EncryptionType")
  private String encryptionType = null;

  public WorkbookEncryptionRequest password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Encription password.
   * @return password
  **/
  @ApiModelProperty(value = "Encription password.")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public WorkbookEncryptionRequest keyLength(Integer keyLength) {
    this.keyLength = keyLength;
    return this;
  }

   /**
   * Encription key length.
   * @return keyLength
  **/
  @ApiModelProperty(required = true, value = "Encription key length.")
  public Integer getKeyLength() {
    return keyLength;
  }

  public void setKeyLength(Integer keyLength) {
    this.keyLength = keyLength;
  }

  public WorkbookEncryptionRequest encryptionType(String encryptionType) {
    this.encryptionType = encryptionType;
    return this;
  }

   /**
   * Workbook encription type.
   * @return encryptionType
  **/
  @ApiModelProperty(value = "Workbook encription type.")
  public String getEncryptionType() {
    return encryptionType;
  }

  public void setEncryptionType(String encryptionType) {
    this.encryptionType = encryptionType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkbookEncryptionRequest workbookEncryptionRequest = (WorkbookEncryptionRequest) o;
    return Objects.equals(this.password, workbookEncryptionRequest.password) &&
        Objects.equals(this.keyLength, workbookEncryptionRequest.keyLength) &&
        Objects.equals(this.encryptionType, workbookEncryptionRequest.encryptionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, keyLength, encryptionType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkbookEncryptionRequest {\n");
    
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    keyLength: ").append(toIndentedString(keyLength)).append("\n");
    sb.append("    encryptionType: ").append(toIndentedString(encryptionType)).append("\n");
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

