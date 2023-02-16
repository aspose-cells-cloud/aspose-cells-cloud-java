/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Import2DimensionStringArrayOption.java">
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


public class Import2DimensionStringArrayOption  extends  ImportOption {
        @SerializedName("FirstRow")
        private Integer firstRow ;

        public  Import2DimensionStringArrayOption  firstRow(Integer  firstRow) {
            this.firstRow =  firstRow;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getFirstRow() {
            return firstRow;
        }

        public void setFirstRow(Integer firstRow) {
            this.firstRow = firstRow;
        }

        @SerializedName("FirstColumn")
        private Integer firstColumn ;

        public  Import2DimensionStringArrayOption  firstColumn(Integer  firstColumn) {
            this.firstColumn =  firstColumn;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getFirstColumn() {
            return firstColumn;
        }

        public void setFirstColumn(Integer firstColumn) {
            this.firstColumn = firstColumn;
        }

        @SerializedName("Data")
        private List<String> data ;

        public  Import2DimensionStringArrayOption  data(List<String>  data) {
            this.data =  data;
            return this;
        }

        @ApiModelProperty(value = "")
        public List<String> getData() {
            return data;
        }

        public void setData(List<String> data) {
            this.data = data;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            Import2DimensionStringArrayOption import2DimensionStringArrayOption = (Import2DimensionStringArrayOption) o;
            return
                Objects.equals(this.firstRow, import2DimensionStringArrayOption.firstRow) &&
                Objects.equals(this.firstColumn, import2DimensionStringArrayOption.firstColumn) &&
                Objects.equals(this.data, import2DimensionStringArrayOption.data) &&
                super.equals(o);
      }

      @Override
      public int hashCode() {
        return Objects.hash(firstRow, firstColumn, data, super.hashCode());
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class Import2DimensionStringArrayOption {\n");
            sb.append("    firstRow: ").append(toIndentedString(getFirstRow())).append("\n");
            sb.append("    firstColumn: ").append(toIndentedString(getFirstColumn())).append("\n");
            sb.append("    data: ").append(toIndentedString(getData())).append("\n");
            sb.append("    destinationWorksheet: ").append(toIndentedString(getDestinationWorksheet())).append("\n");
            sb.append("    isInsert: ").append(toIndentedString(getIsInsert())).append("\n");
            sb.append("    importDataType: ").append(toIndentedString(getImportDataType())).append("\n");
            sb.append("    source: ").append(toIndentedString(getSource())).append("\n");
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

