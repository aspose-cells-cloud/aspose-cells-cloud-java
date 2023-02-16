/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="AutoFitterOptions.java">
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


public class AutoFitterOptions {
        @SerializedName("AutoFitMergedCellsType")
        private String autoFitMergedCellsType ;

        public  AutoFitterOptions  autoFitMergedCellsType(String  autoFitMergedCellsType) {
            this.autoFitMergedCellsType =  autoFitMergedCellsType;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getAutoFitMergedCellsType() {
            return autoFitMergedCellsType;
        }

        public void setAutoFitMergedCellsType(String autoFitMergedCellsType) {
            this.autoFitMergedCellsType = autoFitMergedCellsType;
        }

        @SerializedName("AutoFitMergedCells")
        private Boolean autoFitMergedCells ;

        public  AutoFitterOptions  autoFitMergedCells(Boolean  autoFitMergedCells) {
            this.autoFitMergedCells =  autoFitMergedCells;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getAutoFitMergedCells() {
            return autoFitMergedCells;
        }

        public void setAutoFitMergedCells(Boolean autoFitMergedCells) {
            this.autoFitMergedCells = autoFitMergedCells;
        }

        @SerializedName("IgnoreHidden")
        private Boolean ignoreHidden ;

        public  AutoFitterOptions  ignoreHidden(Boolean  ignoreHidden) {
            this.ignoreHidden =  ignoreHidden;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getIgnoreHidden() {
            return ignoreHidden;
        }

        public void setIgnoreHidden(Boolean ignoreHidden) {
            this.ignoreHidden = ignoreHidden;
        }

        @SerializedName("OnlyAuto")
        private Boolean onlyAuto ;

        public  AutoFitterOptions  onlyAuto(Boolean  onlyAuto) {
            this.onlyAuto =  onlyAuto;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getOnlyAuto() {
            return onlyAuto;
        }

        public void setOnlyAuto(Boolean onlyAuto) {
            this.onlyAuto = onlyAuto;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            AutoFitterOptions autoFitterOptions = (AutoFitterOptions) o;
            return
                Objects.equals(this.autoFitMergedCellsType, autoFitterOptions.autoFitMergedCellsType) &&
                Objects.equals(this.autoFitMergedCells, autoFitterOptions.autoFitMergedCells) &&
                Objects.equals(this.ignoreHidden, autoFitterOptions.ignoreHidden) &&
                Objects.equals(this.onlyAuto, autoFitterOptions.onlyAuto);
      }

      @Override
      public int hashCode() {
        return Objects.hash(autoFitMergedCellsType, autoFitMergedCells, ignoreHidden, onlyAuto);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class AutoFitterOptions {\n");
            sb.append("    autoFitMergedCellsType: ").append(toIndentedString(getAutoFitMergedCellsType())).append("\n");
            sb.append("    autoFitMergedCells: ").append(toIndentedString(getAutoFitMergedCells())).append("\n");
            sb.append("    ignoreHidden: ").append(toIndentedString(getIgnoreHidden())).append("\n");
            sb.append("    onlyAuto: ").append(toIndentedString(getOnlyAuto())).append("\n");
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

