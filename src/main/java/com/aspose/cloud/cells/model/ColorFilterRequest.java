/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ColorFilterRequest.java">
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


public class ColorFilterRequest {
        @SerializedName("Pattern")
        private String pattern ;

        public  ColorFilterRequest  pattern(String  pattern) {
            this.pattern =  pattern;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getPattern() {
            return pattern;
        }

        public void setPattern(String pattern) {
            this.pattern = pattern;
        }

        @SerializedName("ForegroundColor")
        private CellsColor foregroundColor ;

        public  ColorFilterRequest  foregroundColor(CellsColor  foregroundColor) {
            this.foregroundColor =  foregroundColor;
            return this;
        }

        @ApiModelProperty(value = "")
        public CellsColor getForegroundColor() {
            return foregroundColor;
        }

        public void setForegroundColor(CellsColor foregroundColor) {
            this.foregroundColor = foregroundColor;
        }

        @SerializedName("BackgroundColor")
        private CellsColor backgroundColor ;

        public  ColorFilterRequest  backgroundColor(CellsColor  backgroundColor) {
            this.backgroundColor =  backgroundColor;
            return this;
        }

        @ApiModelProperty(value = "")
        public CellsColor getBackgroundColor() {
            return backgroundColor;
        }

        public void setBackgroundColor(CellsColor backgroundColor) {
            this.backgroundColor = backgroundColor;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            ColorFilterRequest colorFilterRequest = (ColorFilterRequest) o;
            return
                Objects.equals(this.pattern, colorFilterRequest.pattern) &&
                Objects.equals(this.foregroundColor, colorFilterRequest.foregroundColor) &&
                Objects.equals(this.backgroundColor, colorFilterRequest.backgroundColor);
      }

      @Override
      public int hashCode() {
        return Objects.hash(pattern, foregroundColor, backgroundColor);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ColorFilterRequest {\n");
            sb.append("    pattern: ").append(toIndentedString(getPattern())).append("\n");
            sb.append("    foregroundColor: ").append(toIndentedString(getForegroundColor())).append("\n");
            sb.append("    backgroundColor: ").append(toIndentedString(getBackgroundColor())).append("\n");
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

