/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="DeleteIncompleteRowsRequest.java">
 *   Copyright (c) 2024 Aspose.Cells Cloud
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


public class DeleteIncompleteRowsRequest {
        @SerializedName("File")
        private FileInfo file ;

        public  DeleteIncompleteRowsRequest  file(FileInfo  file) {
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

        @SerializedName("OutFileFormat")
        private String outFileFormat ;

        public  DeleteIncompleteRowsRequest  outFileFormat(String  outFileFormat) {
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

        public  DeleteIncompleteRowsRequest  checkExcelRestriction(Boolean  checkExcelRestriction) {
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

        public  DeleteIncompleteRowsRequest  region(String  region) {
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

        @SerializedName("Ranges")
        private List<Range> ranges ;

        public  DeleteIncompleteRowsRequest  ranges(List<Range>  ranges) {
            this.ranges =  ranges;
            return this;
        }

        @ApiModelProperty(value = "")
        public List<Range> getRanges() {
            return ranges;
        }

        public void setRanges(List<Range> ranges) {
            this.ranges = ranges;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            DeleteIncompleteRowsRequest deleteIncompleteRowsRequest = (DeleteIncompleteRowsRequest) o;
            return
                Objects.equals(this.file, deleteIncompleteRowsRequest.file) &&
                Objects.equals(this.outFileFormat, deleteIncompleteRowsRequest.outFileFormat) &&
                Objects.equals(this.checkExcelRestriction, deleteIncompleteRowsRequest.checkExcelRestriction) &&
                Objects.equals(this.region, deleteIncompleteRowsRequest.region) &&
                Objects.equals(this.ranges, deleteIncompleteRowsRequest.ranges);
      }

      @Override
      public int hashCode() {
        return Objects.hash(file, outFileFormat, checkExcelRestriction, region, ranges);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class DeleteIncompleteRowsRequest {\n");
            sb.append("    file: ").append(toIndentedString(getFile())).append("\n");
            sb.append("    outFileFormat: ").append(toIndentedString(getOutFileFormat())).append("\n");
            sb.append("    checkExcelRestriction: ").append(toIndentedString(getCheckExcelRestriction())).append("\n");
            sb.append("    region: ").append(toIndentedString(getRegion())).append("\n");
            sb.append("    ranges: ").append(toIndentedString(getRanges())).append("\n");
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

