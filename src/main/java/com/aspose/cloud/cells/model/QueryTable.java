/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="QueryTable.java">
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


public class QueryTable {
        @SerializedName("ConnectionId")
        private Integer connectionId ;

        public  QueryTable  connectionId(Integer  connectionId) {
            this.connectionId =  connectionId;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getConnectionId() {
            return connectionId;
        }

        public void setConnectionId(Integer connectionId) {
            this.connectionId = connectionId;
        }

        @SerializedName("Name")
        private String name ;

        public  QueryTable  name(String  name) {
            this.name =  name;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @SerializedName("ResultRange")
        private Range resultRange ;

        public  QueryTable  resultRange(Range  resultRange) {
            this.resultRange =  resultRange;
            return this;
        }

        @ApiModelProperty(value = "")
        public Range getResultRange() {
            return resultRange;
        }

        public void setResultRange(Range resultRange) {
            this.resultRange = resultRange;
        }

        @SerializedName("PreserveFormatting")
        private Boolean preserveFormatting ;

        public  QueryTable  preserveFormatting(Boolean  preserveFormatting) {
            this.preserveFormatting =  preserveFormatting;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getPreserveFormatting() {
            return preserveFormatting;
        }

        public void setPreserveFormatting(Boolean preserveFormatting) {
            this.preserveFormatting = preserveFormatting;
        }

        @SerializedName("AdjustColumnWidth")
        private Boolean adjustColumnWidth ;

        public  QueryTable  adjustColumnWidth(Boolean  adjustColumnWidth) {
            this.adjustColumnWidth =  adjustColumnWidth;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getAdjustColumnWidth() {
            return adjustColumnWidth;
        }

        public void setAdjustColumnWidth(Boolean adjustColumnWidth) {
            this.adjustColumnWidth = adjustColumnWidth;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            QueryTable queryTable = (QueryTable) o;
            return
                Objects.equals(this.connectionId, queryTable.connectionId) &&
                Objects.equals(this.name, queryTable.name) &&
                Objects.equals(this.resultRange, queryTable.resultRange) &&
                Objects.equals(this.preserveFormatting, queryTable.preserveFormatting) &&
                Objects.equals(this.adjustColumnWidth, queryTable.adjustColumnWidth);
      }

      @Override
      public int hashCode() {
        return Objects.hash(connectionId, name, resultRange, preserveFormatting, adjustColumnWidth);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class QueryTable {\n");
            sb.append("    connectionId: ").append(toIndentedString(getConnectionId())).append("\n");
            sb.append("    name: ").append(toIndentedString(getName())).append("\n");
            sb.append("    resultRange: ").append(toIndentedString(getResultRange())).append("\n");
            sb.append("    preserveFormatting: ").append(toIndentedString(getPreserveFormatting())).append("\n");
            sb.append("    adjustColumnWidth: ").append(toIndentedString(getAdjustColumnWidth())).append("\n");
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

