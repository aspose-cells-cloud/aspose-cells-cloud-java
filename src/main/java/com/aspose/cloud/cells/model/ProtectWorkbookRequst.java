/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ProtectWorkbookRequst.java">
 *   Copyright (c) 2023 Aspose.Cells Cloud
 * </copyright>
 * <summary>
 *   Permission is hereby granted, free of charge, to any person obtaining a copy
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
 * --------------------------------------------------------------------------------
 */

package com.aspose.cloud.cells.model;

import java.util.Objects;
import io.swagger.annotations.ApiModelProperty;
import com.aspose.cloud.cells.model.*;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import java.time.OffsetDateTime;


public class ProtectWorkbookRequst {
        @SerializedName("AwaysOpenOnlyReady")
        private Boolean awaysOpenOnlyReady ;

        public  ProtectWorkbookRequst  awaysOpenOnlyReady(Boolean  awaysOpenOnlyReady) {
            this.awaysOpenOnlyReady =  awaysOpenOnlyReady;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getAwaysOpenOnlyReady() {
            return awaysOpenOnlyReady;
        }

        public void setAwaysOpenOnlyReady(Boolean awaysOpenOnlyReady) {
            this.awaysOpenOnlyReady = awaysOpenOnlyReady;
        }

        @SerializedName("EncryptWithPassword")
        private String encryptWithPassword ;

        public  ProtectWorkbookRequst  encryptWithPassword(String  encryptWithPassword) {
            this.encryptWithPassword =  encryptWithPassword;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getEncryptWithPassword() {
            return encryptWithPassword;
        }

        public void setEncryptWithPassword(String encryptWithPassword) {
            this.encryptWithPassword = encryptWithPassword;
        }

        @SerializedName("ProtectCurrentSheet")
        private Protection protectCurrentSheet ;

        public  ProtectWorkbookRequst  protectCurrentSheet(Protection  protectCurrentSheet) {
            this.protectCurrentSheet =  protectCurrentSheet;
            return this;
        }

        @ApiModelProperty(value = "")
        public Protection getProtectCurrentSheet() {
            return protectCurrentSheet;
        }

        public void setProtectCurrentSheet(Protection protectCurrentSheet) {
            this.protectCurrentSheet = protectCurrentSheet;
        }

        @SerializedName("ProtectWorkbookStructure")
        private String protectWorkbookStructure ;

        public  ProtectWorkbookRequst  protectWorkbookStructure(String  protectWorkbookStructure) {
            this.protectWorkbookStructure =  protectWorkbookStructure;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getProtectWorkbookStructure() {
            return protectWorkbookStructure;
        }

        public void setProtectWorkbookStructure(String protectWorkbookStructure) {
            this.protectWorkbookStructure = protectWorkbookStructure;
        }

        @SerializedName("DigitalSignature")
        private DigitalSignature digitalSignature ;

        public  ProtectWorkbookRequst  digitalSignature(DigitalSignature  digitalSignature) {
            this.digitalSignature =  digitalSignature;
            return this;
        }

        @ApiModelProperty(value = "")
        public DigitalSignature getDigitalSignature() {
            return digitalSignature;
        }

        public void setDigitalSignature(DigitalSignature digitalSignature) {
            this.digitalSignature = digitalSignature;
        }

        @SerializedName("MarkAsFinal")
        private Boolean markAsFinal ;

        public  ProtectWorkbookRequst  markAsFinal(Boolean  markAsFinal) {
            this.markAsFinal =  markAsFinal;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getMarkAsFinal() {
            return markAsFinal;
        }

        public void setMarkAsFinal(Boolean markAsFinal) {
            this.markAsFinal = markAsFinal;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            ProtectWorkbookRequst protectWorkbookRequst = (ProtectWorkbookRequst) o;
            return
                Objects.equals(this.awaysOpenOnlyReady, protectWorkbookRequst.awaysOpenOnlyReady) &&
                Objects.equals(this.encryptWithPassword, protectWorkbookRequst.encryptWithPassword) &&
                Objects.equals(this.protectCurrentSheet, protectWorkbookRequst.protectCurrentSheet) &&
                Objects.equals(this.protectWorkbookStructure, protectWorkbookRequst.protectWorkbookStructure) &&
                Objects.equals(this.digitalSignature, protectWorkbookRequst.digitalSignature) &&
                Objects.equals(this.markAsFinal, protectWorkbookRequst.markAsFinal);
      }

      @Override
      public int hashCode() {
        return Objects.hash(awaysOpenOnlyReady, encryptWithPassword, protectCurrentSheet, protectWorkbookStructure, digitalSignature, markAsFinal);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ProtectWorkbookRequst {\n");
            sb.append("    awaysOpenOnlyReady: ").append(toIndentedString(getAwaysOpenOnlyReady())).append("\n");
            sb.append("    encryptWithPassword: ").append(toIndentedString(getEncryptWithPassword())).append("\n");
            sb.append("    protectCurrentSheet: ").append(toIndentedString(getProtectCurrentSheet())).append("\n");
            sb.append("    protectWorkbookStructure: ").append(toIndentedString(getProtectWorkbookStructure())).append("\n");
            sb.append("    digitalSignature: ").append(toIndentedString(getDigitalSignature())).append("\n");
            sb.append("    markAsFinal: ").append(toIndentedString(getMarkAsFinal())).append("\n");
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

