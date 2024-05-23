/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="LoadData.java">
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


public class LoadData {
        @SerializedName("LoadTo")
        private LoadTo loadTo ;

        public  LoadData  loadTo(LoadTo  loadTo) {
            this.loadTo =  loadTo;
            return this;
        }

        @ApiModelProperty(value = "")
        public LoadTo getLoadTo() {
            return loadTo;
        }

        public void setLoadTo(LoadTo loadTo) {
            this.loadTo = loadTo;
        }

        @SerializedName("DataSource")
        private DataSource dataSource ;

        public  LoadData  dataSource(DataSource  dataSource) {
            this.dataSource =  dataSource;
            return this;
        }

        @ApiModelProperty(value = "")
        public DataSource getDataSource() {
            return dataSource;
        }

        public void setDataSource(DataSource dataSource) {
            this.dataSource = dataSource;
        }

        @SerializedName("FileInfo")
        private FileInfo fileInfo ;

        public  LoadData  fileInfo(FileInfo  fileInfo) {
            this.fileInfo =  fileInfo;
            return this;
        }

        @ApiModelProperty(value = "")
        public FileInfo getFileInfo() {
            return fileInfo;
        }

        public void setFileInfo(FileInfo fileInfo) {
            this.fileInfo = fileInfo;
        }

        @SerializedName("DataItem")
        private DataItem dataItem ;

        public  LoadData  dataItem(DataItem  dataItem) {
            this.dataItem =  dataItem;
            return this;
        }

        @ApiModelProperty(value = "")
        public DataItem getDataItem() {
            return dataItem;
        }

        public void setDataItem(DataItem dataItem) {
            this.dataItem = dataItem;
        }

        @SerializedName("MergeQueries")
        private MergeQueries mergeQueries ;

        public  LoadData  mergeQueries(MergeQueries  mergeQueries) {
            this.mergeQueries =  mergeQueries;
            return this;
        }

        @ApiModelProperty(value = "")
        public MergeQueries getMergeQueries() {
            return mergeQueries;
        }

        public void setMergeQueries(MergeQueries mergeQueries) {
            this.mergeQueries = mergeQueries;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            LoadData loadData = (LoadData) o;
            return
                Objects.equals(this.loadTo, loadData.loadTo) &&
                Objects.equals(this.dataSource, loadData.dataSource) &&
                Objects.equals(this.fileInfo, loadData.fileInfo) &&
                Objects.equals(this.dataItem, loadData.dataItem) &&
                Objects.equals(this.mergeQueries, loadData.mergeQueries);
      }

      @Override
      public int hashCode() {
        return Objects.hash(loadTo, dataSource, fileInfo, dataItem, mergeQueries);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class LoadData {\n");
            sb.append("    loadTo: ").append(toIndentedString(getLoadTo())).append("\n");
            sb.append("    dataSource: ").append(toIndentedString(getDataSource())).append("\n");
            sb.append("    fileInfo: ").append(toIndentedString(getFileInfo())).append("\n");
            sb.append("    dataItem: ").append(toIndentedString(getDataItem())).append("\n");
            sb.append("    mergeQueries: ").append(toIndentedString(getMergeQueries())).append("\n");
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

