/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TxtSaveOptions.java">
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


public class TxtSaveOptions  extends  SaveOptions {
        @SerializedName("QuoteType")
        private String quoteType ;

        public  TxtSaveOptions  quoteType(String  quoteType) {
            this.quoteType =  quoteType;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getQuoteType() {
            return quoteType;
        }

        public void setQuoteType(String quoteType) {
            this.quoteType = quoteType;
        }

        @SerializedName("Separator")
        private String separator ;

        public  TxtSaveOptions  separator(String  separator) {
            this.separator =  separator;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getSeparator() {
            return separator;
        }

        public void setSeparator(String separator) {
            this.separator = separator;
        }

        @SerializedName("SeparatorString")
        private String separatorString ;

        public  TxtSaveOptions  separatorString(String  separatorString) {
            this.separatorString =  separatorString;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getSeparatorString() {
            return separatorString;
        }

        public void setSeparatorString(String separatorString) {
            this.separatorString = separatorString;
        }

        @SerializedName("AlwaysQuoted")
        private Boolean alwaysQuoted ;

        public  TxtSaveOptions  alwaysQuoted(Boolean  alwaysQuoted) {
            this.alwaysQuoted =  alwaysQuoted;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getAlwaysQuoted() {
            return alwaysQuoted;
        }

        public void setAlwaysQuoted(Boolean alwaysQuoted) {
            this.alwaysQuoted = alwaysQuoted;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            TxtSaveOptions txtSaveOptions = (TxtSaveOptions) o;
            return
                Objects.equals(this.quoteType, txtSaveOptions.quoteType) &&
                Objects.equals(this.separator, txtSaveOptions.separator) &&
                Objects.equals(this.separatorString, txtSaveOptions.separatorString) &&
                Objects.equals(this.alwaysQuoted, txtSaveOptions.alwaysQuoted) &&
                super.equals(o);
      }

      @Override
      public int hashCode() {
        return Objects.hash(quoteType, separator, separatorString, alwaysQuoted, super.hashCode());
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class TxtSaveOptions {\n");
            sb.append("    quoteType: ").append(toIndentedString(getQuoteType())).append("\n");
            sb.append("    separator: ").append(toIndentedString(getSeparator())).append("\n");
            sb.append("    separatorString: ").append(toIndentedString(getSeparatorString())).append("\n");
            sb.append("    alwaysQuoted: ").append(toIndentedString(getAlwaysQuoted())).append("\n");
            sb.append("    saveFormat: ").append(toIndentedString(getSaveFormat())).append("\n");
            sb.append("    cachedFileFolder: ").append(toIndentedString(getCachedFileFolder())).append("\n");
            sb.append("    clearData: ").append(toIndentedString(getClearData())).append("\n");
            sb.append("    createDirectory: ").append(toIndentedString(getCreateDirectory())).append("\n");
            sb.append("    enableHTTPCompression: ").append(toIndentedString(getEnableHTTPCompression())).append("\n");
            sb.append("    refreshChartCache: ").append(toIndentedString(getRefreshChartCache())).append("\n");
            sb.append("    sortNames: ").append(toIndentedString(getSortNames())).append("\n");
            sb.append("    validateMergedAreas: ").append(toIndentedString(getValidateMergedAreas())).append("\n");
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

