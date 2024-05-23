/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="MergeQueries.java">
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


public class MergeQueries {
        @SerializedName("DataSourceA")
        private DataSource dataSourceA ;

        public  MergeQueries  dataSourceA(DataSource  dataSourceA) {
            this.dataSourceA =  dataSourceA;
            return this;
        }

        @ApiModelProperty(value = "")
        public DataSource getDataSourceA() {
            return dataSourceA;
        }

        public void setDataSourceA(DataSource dataSourceA) {
            this.dataSourceA = dataSourceA;
        }

        @SerializedName("FileInfoA")
        private FileInfo fileInfoA ;

        public  MergeQueries  fileInfoA(FileInfo  fileInfoA) {
            this.fileInfoA =  fileInfoA;
            return this;
        }

        @ApiModelProperty(value = "")
        public FileInfo getFileInfoA() {
            return fileInfoA;
        }

        public void setFileInfoA(FileInfo fileInfoA) {
            this.fileInfoA = fileInfoA;
        }

        @SerializedName("DataItemA")
        private DataItem dataItemA ;

        public  MergeQueries  dataItemA(DataItem  dataItemA) {
            this.dataItemA =  dataItemA;
            return this;
        }

        @ApiModelProperty(value = "")
        public DataItem getDataItemA() {
            return dataItemA;
        }

        public void setDataItemA(DataItem dataItemA) {
            this.dataItemA = dataItemA;
        }

        @SerializedName("DataAIndexField")
        private String dataAIndexField ;

        public  MergeQueries  dataAIndexField(String  dataAIndexField) {
            this.dataAIndexField =  dataAIndexField;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getDataAIndexField() {
            return dataAIndexField;
        }

        public void setDataAIndexField(String dataAIndexField) {
            this.dataAIndexField = dataAIndexField;
        }

        @SerializedName("DataSourceB")
        private DataSource dataSourceB ;

        public  MergeQueries  dataSourceB(DataSource  dataSourceB) {
            this.dataSourceB =  dataSourceB;
            return this;
        }

        @ApiModelProperty(value = "")
        public DataSource getDataSourceB() {
            return dataSourceB;
        }

        public void setDataSourceB(DataSource dataSourceB) {
            this.dataSourceB = dataSourceB;
        }

        @SerializedName("FileInfoB")
        private FileInfo fileInfoB ;

        public  MergeQueries  fileInfoB(FileInfo  fileInfoB) {
            this.fileInfoB =  fileInfoB;
            return this;
        }

        @ApiModelProperty(value = "")
        public FileInfo getFileInfoB() {
            return fileInfoB;
        }

        public void setFileInfoB(FileInfo fileInfoB) {
            this.fileInfoB = fileInfoB;
        }

        @SerializedName("DataItemB")
        private DataItem dataItemB ;

        public  MergeQueries  dataItemB(DataItem  dataItemB) {
            this.dataItemB =  dataItemB;
            return this;
        }

        @ApiModelProperty(value = "")
        public DataItem getDataItemB() {
            return dataItemB;
        }

        public void setDataItemB(DataItem dataItemB) {
            this.dataItemB = dataItemB;
        }

        @SerializedName("DataBIndexField")
        private String dataBIndexField ;

        public  MergeQueries  dataBIndexField(String  dataBIndexField) {
            this.dataBIndexField =  dataBIndexField;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getDataBIndexField() {
            return dataBIndexField;
        }

        public void setDataBIndexField(String dataBIndexField) {
            this.dataBIndexField = dataBIndexField;
        }

        @SerializedName("JoinType")
        private String joinType ;

        public  MergeQueries  joinType(String  joinType) {
            this.joinType =  joinType;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getJoinType() {
            return joinType;
        }

        public void setJoinType(String joinType) {
            this.joinType = joinType;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            MergeQueries mergeQueries = (MergeQueries) o;
            return
                Objects.equals(this.dataSourceA, mergeQueries.dataSourceA) &&
                Objects.equals(this.fileInfoA, mergeQueries.fileInfoA) &&
                Objects.equals(this.dataItemA, mergeQueries.dataItemA) &&
                Objects.equals(this.dataAIndexField, mergeQueries.dataAIndexField) &&
                Objects.equals(this.dataSourceB, mergeQueries.dataSourceB) &&
                Objects.equals(this.fileInfoB, mergeQueries.fileInfoB) &&
                Objects.equals(this.dataItemB, mergeQueries.dataItemB) &&
                Objects.equals(this.dataBIndexField, mergeQueries.dataBIndexField) &&
                Objects.equals(this.joinType, mergeQueries.joinType);
      }

      @Override
      public int hashCode() {
        return Objects.hash(dataSourceA, fileInfoA, dataItemA, dataAIndexField, dataSourceB, fileInfoB, dataItemB, dataBIndexField, joinType);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class MergeQueries {\n");
            sb.append("    dataSourceA: ").append(toIndentedString(getDataSourceA())).append("\n");
            sb.append("    fileInfoA: ").append(toIndentedString(getFileInfoA())).append("\n");
            sb.append("    dataItemA: ").append(toIndentedString(getDataItemA())).append("\n");
            sb.append("    dataAIndexField: ").append(toIndentedString(getDataAIndexField())).append("\n");
            sb.append("    dataSourceB: ").append(toIndentedString(getDataSourceB())).append("\n");
            sb.append("    fileInfoB: ").append(toIndentedString(getFileInfoB())).append("\n");
            sb.append("    dataItemB: ").append(toIndentedString(getDataItemB())).append("\n");
            sb.append("    dataBIndexField: ").append(toIndentedString(getDataBIndexField())).append("\n");
            sb.append("    joinType: ").append(toIndentedString(getJoinType())).append("\n");
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

