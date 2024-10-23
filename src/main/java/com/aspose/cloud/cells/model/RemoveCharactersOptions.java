/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="RemoveCharactersOptions.java">
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


public class RemoveCharactersOptions  extends  BaseOperateOptions {
        @SerializedName("DataSource")
        private DataSource dataSource ;

        public  RemoveCharactersOptions  dataSource(DataSource  dataSource) {
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

        public  RemoveCharactersOptions  fileInfo(FileInfo  fileInfo) {
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

        public  RemoveCharactersOptions  worksheet(String  worksheet) {
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

        public  RemoveCharactersOptions  range(String  range) {
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

        @SerializedName("RemoveCharactersByCharacter")
        private RemoveCharactersByCharacter removeCharactersByCharacter ;

        public  RemoveCharactersOptions  removeCharactersByCharacter(RemoveCharactersByCharacter  removeCharactersByCharacter) {
            this.removeCharactersByCharacter =  removeCharactersByCharacter;
            return this;
        }

        @ApiModelProperty(value = "")
        public RemoveCharactersByCharacter getRemoveCharactersByCharacter() {
            return removeCharactersByCharacter;
        }

        public void setRemoveCharactersByCharacter(RemoveCharactersByCharacter removeCharactersByCharacter) {
            this.removeCharactersByCharacter = removeCharactersByCharacter;
        }

        @SerializedName("RemoveCharactersByPosition")
        private RemoveCharactersByPosition removeCharactersByPosition ;

        public  RemoveCharactersOptions  removeCharactersByPosition(RemoveCharactersByPosition  removeCharactersByPosition) {
            this.removeCharactersByPosition =  removeCharactersByPosition;
            return this;
        }

        @ApiModelProperty(value = "")
        public RemoveCharactersByPosition getRemoveCharactersByPosition() {
            return removeCharactersByPosition;
        }

        public void setRemoveCharactersByPosition(RemoveCharactersByPosition removeCharactersByPosition) {
            this.removeCharactersByPosition = removeCharactersByPosition;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            RemoveCharactersOptions removeCharactersOptions = (RemoveCharactersOptions) o;
            return
                Objects.equals(this.dataSource, removeCharactersOptions.dataSource) &&
                Objects.equals(this.fileInfo, removeCharactersOptions.fileInfo) &&
                Objects.equals(this.worksheet, removeCharactersOptions.worksheet) &&
                Objects.equals(this.range, removeCharactersOptions.range) &&
                Objects.equals(this.removeCharactersByCharacter, removeCharactersOptions.removeCharactersByCharacter) &&
                Objects.equals(this.removeCharactersByPosition, removeCharactersOptions.removeCharactersByPosition) &&
                super.equals(o);
      }

      @Override
      public int hashCode() {
        return Objects.hash(dataSource, fileInfo, worksheet, range, removeCharactersByCharacter, removeCharactersByPosition, super.hashCode());
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class RemoveCharactersOptions {\n");
            sb.append("    name: ").append(toIndentedString(getName())).append("\n");
            sb.append("    dataSource: ").append(toIndentedString(getDataSource())).append("\n");
            sb.append("    fileInfo: ").append(toIndentedString(getFileInfo())).append("\n");
            sb.append("    worksheet: ").append(toIndentedString(getWorksheet())).append("\n");
            sb.append("    range: ").append(toIndentedString(getRange())).append("\n");
            sb.append("    removeCharactersByCharacter: ").append(toIndentedString(getRemoveCharactersByCharacter())).append("\n");
            sb.append("    removeCharactersByPosition: ").append(toIndentedString(getRemoveCharactersByPosition())).append("\n");
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

