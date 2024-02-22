/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="AnalyzeSuggestion.java">
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


public class AnalyzeSuggestion {
        @SerializedName("Name")
        private String name ;

        public  AnalyzeSuggestion  name(String  name) {
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

        @SerializedName("Filename")
        private String filename ;

        public  AnalyzeSuggestion  filename(String  filename) {
            this.filename =  filename;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getFilename() {
            return filename;
        }

        public void setFilename(String filename) {
            this.filename = filename;
        }

        @SerializedName("SheetName")
        private String sheetName ;

        public  AnalyzeSuggestion  sheetName(String  sheetName) {
            this.sheetName =  sheetName;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getSheetName() {
            return sheetName;
        }

        public void setSheetName(String sheetName) {
            this.sheetName = sheetName;
        }

        @SerializedName("DateSourceType")
        private String dateSourceType ;

        public  AnalyzeSuggestion  dateSourceType(String  dateSourceType) {
            this.dateSourceType =  dateSourceType;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getDateSourceType() {
            return dateSourceType;
        }

        public void setDateSourceType(String dateSourceType) {
            this.dateSourceType = dateSourceType;
        }

        @SerializedName("SuggestedOutputType")
        private String suggestedOutputType ;

        public  AnalyzeSuggestion  suggestedOutputType(String  suggestedOutputType) {
            this.suggestedOutputType =  suggestedOutputType;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getSuggestedOutputType() {
            return suggestedOutputType;
        }

        public void setSuggestedOutputType(String suggestedOutputType) {
            this.suggestedOutputType = suggestedOutputType;
        }

        @SerializedName("Description")
        private String description ;

        public  AnalyzeSuggestion  description(String  description) {
            this.description =  description;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        @SerializedName("DataSouceThumbnail")
        private String dataSouceThumbnail ;

        public  AnalyzeSuggestion  dataSouceThumbnail(String  dataSouceThumbnail) {
            this.dataSouceThumbnail =  dataSouceThumbnail;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getDataSouceThumbnail() {
            return dataSouceThumbnail;
        }

        public void setDataSouceThumbnail(String dataSouceThumbnail) {
            this.dataSouceThumbnail = dataSouceThumbnail;
        }

        @SerializedName("Thumbnail")
        private String thumbnail ;

        public  AnalyzeSuggestion  thumbnail(String  thumbnail) {
            this.thumbnail =  thumbnail;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getThumbnail() {
            return thumbnail;
        }

        public void setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            AnalyzeSuggestion analyzeSuggestion = (AnalyzeSuggestion) o;
            return
                Objects.equals(this.name, analyzeSuggestion.name) &&
                Objects.equals(this.filename, analyzeSuggestion.filename) &&
                Objects.equals(this.sheetName, analyzeSuggestion.sheetName) &&
                Objects.equals(this.dateSourceType, analyzeSuggestion.dateSourceType) &&
                Objects.equals(this.suggestedOutputType, analyzeSuggestion.suggestedOutputType) &&
                Objects.equals(this.description, analyzeSuggestion.description) &&
                Objects.equals(this.dataSouceThumbnail, analyzeSuggestion.dataSouceThumbnail) &&
                Objects.equals(this.thumbnail, analyzeSuggestion.thumbnail);
      }

      @Override
      public int hashCode() {
        return Objects.hash(name, filename, sheetName, dateSourceType, suggestedOutputType, description, dataSouceThumbnail, thumbnail);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class AnalyzeSuggestion {\n");
            sb.append("    name: ").append(toIndentedString(getName())).append("\n");
            sb.append("    filename: ").append(toIndentedString(getFilename())).append("\n");
            sb.append("    sheetName: ").append(toIndentedString(getSheetName())).append("\n");
            sb.append("    dateSourceType: ").append(toIndentedString(getDateSourceType())).append("\n");
            sb.append("    suggestedOutputType: ").append(toIndentedString(getSuggestedOutputType())).append("\n");
            sb.append("    description: ").append(toIndentedString(getDescription())).append("\n");
            sb.append("    dataSouceThumbnail: ").append(toIndentedString(getDataSouceThumbnail())).append("\n");
            sb.append("    thumbnail: ").append(toIndentedString(getThumbnail())).append("\n");
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

