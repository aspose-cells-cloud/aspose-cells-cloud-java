/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="SmartMarkerTaskParameter.java">
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


public class SmartMarkerTaskParameter  extends  TaskParameter {
        @SerializedName("SourceWorkbook")
        private FileSource sourceWorkbook ;

        public  SmartMarkerTaskParameter  sourceWorkbook(FileSource  sourceWorkbook) {
            this.sourceWorkbook =  sourceWorkbook;
            return this;
        }

        @ApiModelProperty(value = "")
        public FileSource getSourceWorkbook() {
            return sourceWorkbook;
        }

        public void setSourceWorkbook(FileSource sourceWorkbook) {
            this.sourceWorkbook = sourceWorkbook;
        }

        @SerializedName("DestinationWorkbook")
        private FileSource destinationWorkbook ;

        public  SmartMarkerTaskParameter  destinationWorkbook(FileSource  destinationWorkbook) {
            this.destinationWorkbook =  destinationWorkbook;
            return this;
        }

        @ApiModelProperty(value = "")
        public FileSource getDestinationWorkbook() {
            return destinationWorkbook;
        }

        public void setDestinationWorkbook(FileSource destinationWorkbook) {
            this.destinationWorkbook = destinationWorkbook;
        }

        @SerializedName("XmlFile")
        private FileSource xmlFile ;

        public  SmartMarkerTaskParameter  xmlFile(FileSource  xmlFile) {
            this.xmlFile =  xmlFile;
            return this;
        }

        @ApiModelProperty(value = "")
        public FileSource getXmlFile() {
            return xmlFile;
        }

        public void setXmlFile(FileSource xmlFile) {
            this.xmlFile = xmlFile;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            SmartMarkerTaskParameter smartMarkerTaskParameter = (SmartMarkerTaskParameter) o;
            return
                Objects.equals(this.sourceWorkbook, smartMarkerTaskParameter.sourceWorkbook) &&
                Objects.equals(this.destinationWorkbook, smartMarkerTaskParameter.destinationWorkbook) &&
                Objects.equals(this.xmlFile, smartMarkerTaskParameter.xmlFile) &&
                super.equals(o);
      }

      @Override
      public int hashCode() {
        return Objects.hash(sourceWorkbook, destinationWorkbook, xmlFile, super.hashCode());
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class SmartMarkerTaskParameter {\n");
            sb.append("    sourceWorkbook: ").append(toIndentedString(getSourceWorkbook())).append("\n");
            sb.append("    destinationWorkbook: ").append(toIndentedString(getDestinationWorkbook())).append("\n");
            sb.append("    xmlFile: ").append(toIndentedString(getXmlFile())).append("\n");
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

