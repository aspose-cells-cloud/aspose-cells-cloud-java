/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="DataDeduplicationRequest.java">
 *   Copyright (c) 2025 Aspose.Cells Cloud
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


public class DataDeduplicationRequest {
        @SerializedName("File")
        private FileInfo file ;

        public  DataDeduplicationRequest  file(FileInfo  file) {
            this.file =  file;
            return this;
        }

        @ApiModelProperty(value = "")
        public FileInfo getFile() {
            return file;
        }

        public void setFile(FileInfo file) {
            this.file = file;
        }

        @SerializedName("DeduplicationRegion")
        private DeduplicationRegion deduplicationRegion ;

        public  DataDeduplicationRequest  deduplicationRegion(DeduplicationRegion  deduplicationRegion) {
            this.deduplicationRegion =  deduplicationRegion;
            return this;
        }

        @ApiModelProperty(value = "")
        public DeduplicationRegion getDeduplicationRegion() {
            return deduplicationRegion;
        }

        public void setDeduplicationRegion(DeduplicationRegion deduplicationRegion) {
            this.deduplicationRegion = deduplicationRegion;
        }

        @SerializedName("OutFileFormat")
        private String outFileFormat ;

        public  DataDeduplicationRequest  outFileFormat(String  outFileFormat) {
            this.outFileFormat =  outFileFormat;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getOutFileFormat() {
            return outFileFormat;
        }

        public void setOutFileFormat(String outFileFormat) {
            this.outFileFormat = outFileFormat;
        }

        @SerializedName("CheckExcelRestriction")
        private Boolean checkExcelRestriction ;

        public  DataDeduplicationRequest  checkExcelRestriction(Boolean  checkExcelRestriction) {
            this.checkExcelRestriction =  checkExcelRestriction;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getCheckExcelRestriction() {
            return checkExcelRestriction;
        }

        public void setCheckExcelRestriction(Boolean checkExcelRestriction) {
            this.checkExcelRestriction = checkExcelRestriction;
        }

        @SerializedName("Region")
        private String region ;

        public  DataDeduplicationRequest  region(String  region) {
            this.region =  region;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            DataDeduplicationRequest dataDeduplicationRequest = (DataDeduplicationRequest) o;
            return
                Objects.equals(this.file, dataDeduplicationRequest.file) &&
                Objects.equals(this.deduplicationRegion, dataDeduplicationRequest.deduplicationRegion) &&
                Objects.equals(this.outFileFormat, dataDeduplicationRequest.outFileFormat) &&
                Objects.equals(this.checkExcelRestriction, dataDeduplicationRequest.checkExcelRestriction) &&
                Objects.equals(this.region, dataDeduplicationRequest.region);
      }

      @Override
      public int hashCode() {
        return Objects.hash(file, deduplicationRegion, outFileFormat, checkExcelRestriction, region);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class DataDeduplicationRequest {\n");
            sb.append("    file: ").append(toIndentedString(getFile())).append("\n");
            sb.append("    deduplicationRegion: ").append(toIndentedString(getDeduplicationRegion())).append("\n");
            sb.append("    outFileFormat: ").append(toIndentedString(getOutFileFormat())).append("\n");
            sb.append("    checkExcelRestriction: ").append(toIndentedString(getCheckExcelRestriction())).append("\n");
            sb.append("    region: ").append(toIndentedString(getRegion())).append("\n");
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

