/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ConvertTextOptions.java">
 *   Copyright (c) 2025 Aspose.Cells Cloud
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


public class ConvertTextOptions  extends  BaseOperateOptions {
        @SerializedName("DataSource")
        private DataSource dataSource ;

        public  ConvertTextOptions  dataSource(DataSource  dataSource) {
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

        public  ConvertTextOptions  fileInfo(FileInfo  fileInfo) {
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

        @SerializedName("Worksheet")
        private String worksheet ;

        public  ConvertTextOptions  worksheet(String  worksheet) {
            this.worksheet =  worksheet;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getWorksheet() {
            return worksheet;
        }

        public void setWorksheet(String worksheet) {
            this.worksheet = worksheet;
        }

        @SerializedName("Range")
        private String range ;

        public  ConvertTextOptions  range(String  range) {
            this.range =  range;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getRange() {
            return range;
        }

        public void setRange(String range) {
            this.range = range;
        }

        @SerializedName("ConvertTextType")
        private String convertTextType ;

        public  ConvertTextOptions  convertTextType(String  convertTextType) {
            this.convertTextType =  convertTextType;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getConvertTextType() {
            return convertTextType;
        }

        public void setConvertTextType(String convertTextType) {
            this.convertTextType = convertTextType;
        }

        @SerializedName("SourceCharacters")
        private String sourceCharacters ;

        public  ConvertTextOptions  sourceCharacters(String  sourceCharacters) {
            this.sourceCharacters =  sourceCharacters;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getSourceCharacters() {
            return sourceCharacters;
        }

        public void setSourceCharacters(String sourceCharacters) {
            this.sourceCharacters = sourceCharacters;
        }

        @SerializedName("TargetCharacters")
        private String targetCharacters ;

        public  ConvertTextOptions  targetCharacters(String  targetCharacters) {
            this.targetCharacters =  targetCharacters;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getTargetCharacters() {
            return targetCharacters;
        }

        public void setTargetCharacters(String targetCharacters) {
            this.targetCharacters = targetCharacters;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            ConvertTextOptions convertTextOptions = (ConvertTextOptions) o;
            return
                Objects.equals(this.dataSource, convertTextOptions.dataSource) &&
                Objects.equals(this.fileInfo, convertTextOptions.fileInfo) &&
                Objects.equals(this.worksheet, convertTextOptions.worksheet) &&
                Objects.equals(this.range, convertTextOptions.range) &&
                Objects.equals(this.convertTextType, convertTextOptions.convertTextType) &&
                Objects.equals(this.sourceCharacters, convertTextOptions.sourceCharacters) &&
                Objects.equals(this.targetCharacters, convertTextOptions.targetCharacters) &&
                super.equals(o);
      }

      @Override
      public int hashCode() {
        return Objects.hash(dataSource, fileInfo, worksheet, range, convertTextType, sourceCharacters, targetCharacters, super.hashCode());
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ConvertTextOptions {\n");
            sb.append("    name: ").append(toIndentedString(getName())).append("\n");
            sb.append("    dataSource: ").append(toIndentedString(getDataSource())).append("\n");
            sb.append("    fileInfo: ").append(toIndentedString(getFileInfo())).append("\n");
            sb.append("    worksheet: ").append(toIndentedString(getWorksheet())).append("\n");
            sb.append("    range: ").append(toIndentedString(getRange())).append("\n");
            sb.append("    convertTextType: ").append(toIndentedString(getConvertTextType())).append("\n");
            sb.append("    sourceCharacters: ").append(toIndentedString(getSourceCharacters())).append("\n");
            sb.append("    targetCharacters: ").append(toIndentedString(getTargetCharacters())).append("\n");
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

