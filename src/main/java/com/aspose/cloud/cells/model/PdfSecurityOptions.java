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
 * PdfSecurityOptions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-07-08T01:54:35.499-05:00")
public class PdfSecurityOptions {
  @SerializedName("AnnotationsPermission")
  private Boolean annotationsPermission = null;

  @SerializedName("AssembleDocumentPermission")
  private Boolean assembleDocumentPermission = null;

  @SerializedName("ExtractContentPermission")
  private Boolean extractContentPermission = null;

  @SerializedName("ExtractContentPermissionObsolete")
  private Boolean extractContentPermissionObsolete = null;

  @SerializedName("FillFormsPermission")
  private Boolean fillFormsPermission = null;

  @SerializedName("FullQualityPrintPermission")
  private Boolean fullQualityPrintPermission = null;

  @SerializedName("ModifyDocumentPermission")
  private Boolean modifyDocumentPermission = null;

  @SerializedName("OwnerPassword")
  private String ownerPassword = null;

  @SerializedName("PrintPermission")
  private Boolean printPermission = null;

  @SerializedName("UserPassword")
  private String userPassword = null;

  public PdfSecurityOptions annotationsPermission(Boolean annotationsPermission) {
    this.annotationsPermission = annotationsPermission;
    return this;
  }

   /**
   * Get annotationsPermission
   * @return annotationsPermission
  **/
  @ApiModelProperty(value = "")
  public Boolean AnnotationsPermission() {
    return annotationsPermission;
  }

  public void setAnnotationsPermission(Boolean annotationsPermission) {
    this.annotationsPermission = annotationsPermission;
  }

  public PdfSecurityOptions assembleDocumentPermission(Boolean assembleDocumentPermission) {
    this.assembleDocumentPermission = assembleDocumentPermission;
    return this;
  }

   /**
   * Get assembleDocumentPermission
   * @return assembleDocumentPermission
  **/
  @ApiModelProperty(value = "")
  public Boolean AssembleDocumentPermission() {
    return assembleDocumentPermission;
  }

  public void setAssembleDocumentPermission(Boolean assembleDocumentPermission) {
    this.assembleDocumentPermission = assembleDocumentPermission;
  }

  public PdfSecurityOptions extractContentPermission(Boolean extractContentPermission) {
    this.extractContentPermission = extractContentPermission;
    return this;
  }

   /**
   * Make the workbook empty after saving the file.
   * @return extractContentPermission
  **/
  @ApiModelProperty(value = "Make the workbook empty after saving the file.")
  public Boolean ExtractContentPermission() {
    return extractContentPermission;
  }

  public void setExtractContentPermission(Boolean extractContentPermission) {
    this.extractContentPermission = extractContentPermission;
  }

  public PdfSecurityOptions extractContentPermissionObsolete(Boolean extractContentPermissionObsolete) {
    this.extractContentPermissionObsolete = extractContentPermissionObsolete;
    return this;
  }

   /**
   * The cached file folder is used to store some large data.
   * @return extractContentPermissionObsolete
  **/
  @ApiModelProperty(value = "The cached file folder is used to store some large data.")
  public Boolean ExtractContentPermissionObsolete() {
    return extractContentPermissionObsolete;
  }

  public void setExtractContentPermissionObsolete(Boolean extractContentPermissionObsolete) {
    this.extractContentPermissionObsolete = extractContentPermissionObsolete;
  }

  public PdfSecurityOptions fillFormsPermission(Boolean fillFormsPermission) {
    this.fillFormsPermission = fillFormsPermission;
    return this;
  }

   /**
   * Indicates whether validate merged areas before saving the file. The default value is false.             
   * @return fillFormsPermission
  **/
  @ApiModelProperty(value = "Indicates whether validate merged areas before saving the file. The default value is false.             ")
  public Boolean FillFormsPermission() {
    return fillFormsPermission;
  }

  public void setFillFormsPermission(Boolean fillFormsPermission) {
    this.fillFormsPermission = fillFormsPermission;
  }

  public PdfSecurityOptions fullQualityPrintPermission(Boolean fullQualityPrintPermission) {
    this.fullQualityPrintPermission = fullQualityPrintPermission;
    return this;
  }

   /**
   * Get fullQualityPrintPermission
   * @return fullQualityPrintPermission
  **/
  @ApiModelProperty(value = "")
  public Boolean FullQualityPrintPermission() {
    return fullQualityPrintPermission;
  }

  public void setFullQualityPrintPermission(Boolean fullQualityPrintPermission) {
    this.fullQualityPrintPermission = fullQualityPrintPermission;
  }

  public PdfSecurityOptions modifyDocumentPermission(Boolean modifyDocumentPermission) {
    this.modifyDocumentPermission = modifyDocumentPermission;
    return this;
  }

   /**
   * If true and the directory does not exist, the directory will be automatically created before saving the file.             
   * @return modifyDocumentPermission
  **/
  @ApiModelProperty(value = "If true and the directory does not exist, the directory will be automatically created before saving the file.             ")
  public Boolean ModifyDocumentPermission() {
    return modifyDocumentPermission;
  }

  public void setModifyDocumentPermission(Boolean modifyDocumentPermission) {
    this.modifyDocumentPermission = modifyDocumentPermission;
  }

  public PdfSecurityOptions ownerPassword(String ownerPassword) {
    this.ownerPassword = ownerPassword;
    return this;
  }

   /**
   * Get ownerPassword
   * @return ownerPassword
  **/
  @ApiModelProperty(value = "")
  public String getOwnerPassword() {
    return ownerPassword;
  }

  public void setOwnerPassword(String ownerPassword) {
    this.ownerPassword = ownerPassword;
  }

  public PdfSecurityOptions printPermission(Boolean printPermission) {
    this.printPermission = printPermission;
    return this;
  }

   /**
   * Get printPermission
   * @return printPermission
  **/
  @ApiModelProperty(value = "")
  public Boolean PrintPermission() {
    return printPermission;
  }

  public void setPrintPermission(Boolean printPermission) {
    this.printPermission = printPermission;
  }

  public PdfSecurityOptions userPassword(String userPassword) {
    this.userPassword = userPassword;
    return this;
  }

   /**
   * Get userPassword
   * @return userPassword
  **/
  @ApiModelProperty(value = "")
  public String getUserPassword() {
    return userPassword;
  }

  public void setUserPassword(String userPassword) {
    this.userPassword = userPassword;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfSecurityOptions pdfSecurityOptions = (PdfSecurityOptions) o;
    return Objects.equals(this.annotationsPermission, pdfSecurityOptions.annotationsPermission) &&
        Objects.equals(this.assembleDocumentPermission, pdfSecurityOptions.assembleDocumentPermission) &&
        Objects.equals(this.extractContentPermission, pdfSecurityOptions.extractContentPermission) &&
        Objects.equals(this.extractContentPermissionObsolete, pdfSecurityOptions.extractContentPermissionObsolete) &&
        Objects.equals(this.fillFormsPermission, pdfSecurityOptions.fillFormsPermission) &&
        Objects.equals(this.fullQualityPrintPermission, pdfSecurityOptions.fullQualityPrintPermission) &&
        Objects.equals(this.modifyDocumentPermission, pdfSecurityOptions.modifyDocumentPermission) &&
        Objects.equals(this.ownerPassword, pdfSecurityOptions.ownerPassword) &&
        Objects.equals(this.printPermission, pdfSecurityOptions.printPermission) &&
        Objects.equals(this.userPassword, pdfSecurityOptions.userPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotationsPermission, assembleDocumentPermission, extractContentPermission, extractContentPermissionObsolete, fillFormsPermission, fullQualityPrintPermission, modifyDocumentPermission, ownerPassword, printPermission, userPassword);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfSecurityOptions {\n");
    
    sb.append("    annotationsPermission: ").append(toIndentedString(annotationsPermission)).append("\n");
    sb.append("    assembleDocumentPermission: ").append(toIndentedString(assembleDocumentPermission)).append("\n");
    sb.append("    extractContentPermission: ").append(toIndentedString(extractContentPermission)).append("\n");
    sb.append("    extractContentPermissionObsolete: ").append(toIndentedString(extractContentPermissionObsolete)).append("\n");
    sb.append("    fillFormsPermission: ").append(toIndentedString(fillFormsPermission)).append("\n");
    sb.append("    fullQualityPrintPermission: ").append(toIndentedString(fullQualityPrintPermission)).append("\n");
    sb.append("    modifyDocumentPermission: ").append(toIndentedString(modifyDocumentPermission)).append("\n");
    sb.append("    ownerPassword: ").append(toIndentedString(ownerPassword)).append("\n");
    sb.append("    printPermission: ").append(toIndentedString(printPermission)).append("\n");
    sb.append("    userPassword: ").append(toIndentedString(userPassword)).append("\n");
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

