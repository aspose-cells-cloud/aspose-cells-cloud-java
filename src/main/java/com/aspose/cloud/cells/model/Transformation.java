/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Transformation.java">
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


public class Transformation {
        @SerializedName("PivotColumn")
        private PivotColumn pivotColumn ;

        public  Transformation  pivotColumn(PivotColumn  pivotColumn) {
            this.pivotColumn =  pivotColumn;
            return this;
        }

        @ApiModelProperty(value = "")
        public PivotColumn getPivotColumn() {
            return pivotColumn;
        }

        public void setPivotColumn(PivotColumn pivotColumn) {
            this.pivotColumn = pivotColumn;
        }

        @SerializedName("UnpivotColumn")
        private UnpivotColumn unpivotColumn ;

        public  Transformation  unpivotColumn(UnpivotColumn  unpivotColumn) {
            this.unpivotColumn =  unpivotColumn;
            return this;
        }

        @ApiModelProperty(value = "")
        public UnpivotColumn getUnpivotColumn() {
            return unpivotColumn;
        }

        public void setUnpivotColumn(UnpivotColumn unpivotColumn) {
            this.unpivotColumn = unpivotColumn;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            Transformation transformation = (Transformation) o;
            return
                Objects.equals(this.pivotColumn, transformation.pivotColumn) &&
                Objects.equals(this.unpivotColumn, transformation.unpivotColumn);
      }

      @Override
      public int hashCode() {
        return Objects.hash(pivotColumn, unpivotColumn);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class Transformation {\n");
            sb.append("    pivotColumn: ").append(toIndentedString(getPivotColumn())).append("\n");
            sb.append("    unpivotColumn: ").append(toIndentedString(getUnpivotColumn())).append("\n");
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

