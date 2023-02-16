/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ListColumn.java">
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


public class ListColumn {
        @SerializedName("Name")
        private String name ;

        public  ListColumn  name(String  name) {
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

        @SerializedName("Range")
        private Range range ;

        public  ListColumn  range(Range  range) {
            this.range =  range;
            return this;
        }

        @ApiModelProperty(value = "")
        public Range getRange() {
            return range;
        }

        public void setRange(Range range) {
            this.range = range;
        }

        @SerializedName("TotalsCalculation")
        private String totalsCalculation ;

        public  ListColumn  totalsCalculation(String  totalsCalculation) {
            this.totalsCalculation =  totalsCalculation;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getTotalsCalculation() {
            return totalsCalculation;
        }

        public void setTotalsCalculation(String totalsCalculation) {
            this.totalsCalculation = totalsCalculation;
        }

        @SerializedName("Formula")
        private String formula ;

        public  ListColumn  formula(String  formula) {
            this.formula =  formula;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getFormula() {
            return formula;
        }

        public void setFormula(String formula) {
            this.formula = formula;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            ListColumn listColumn = (ListColumn) o;
            return
                Objects.equals(this.name, listColumn.name) &&
                Objects.equals(this.range, listColumn.range) &&
                Objects.equals(this.totalsCalculation, listColumn.totalsCalculation) &&
                Objects.equals(this.formula, listColumn.formula);
      }

      @Override
      public int hashCode() {
        return Objects.hash(name, range, totalsCalculation, formula);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ListColumn {\n");
            sb.append("    name: ").append(toIndentedString(getName())).append("\n");
            sb.append("    range: ").append(toIndentedString(getRange())).append("\n");
            sb.append("    totalsCalculation: ").append(toIndentedString(getTotalsCalculation())).append("\n");
            sb.append("    formula: ").append(toIndentedString(getFormula())).append("\n");
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

