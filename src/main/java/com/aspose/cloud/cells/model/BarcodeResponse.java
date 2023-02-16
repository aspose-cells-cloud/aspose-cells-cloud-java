/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="BarcodeResponse.java">
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


public class BarcodeResponse {
        @SerializedName("BarcodeValue")
        private String barcodeValue ;

        public  BarcodeResponse  barcodeValue(String  barcodeValue) {
            this.barcodeValue =  barcodeValue;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getBarcodeValue() {
            return barcodeValue;
        }

        public void setBarcodeValue(String barcodeValue) {
            this.barcodeValue = barcodeValue;
        }

        @SerializedName("BarcodeType")
        private String barcodeType ;

        public  BarcodeResponse  barcodeType(String  barcodeType) {
            this.barcodeType =  barcodeType;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getBarcodeType() {
            return barcodeType;
        }

        public void setBarcodeType(String barcodeType) {
            this.barcodeType = barcodeType;
        }

        @SerializedName("Region")
        private List<Point> region ;

        public  BarcodeResponse  region(List<Point>  region) {
            this.region =  region;
            return this;
        }

        @ApiModelProperty(value = "")
        public List<Point> getRegion() {
            return region;
        }

        public void setRegion(List<Point> region) {
            this.region = region;
        }

        @SerializedName("Checksum")
        private String checksum ;

        public  BarcodeResponse  checksum(String  checksum) {
            this.checksum =  checksum;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getChecksum() {
            return checksum;
        }

        public void setChecksum(String checksum) {
            this.checksum = checksum;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            BarcodeResponse barcodeResponse = (BarcodeResponse) o;
            return
                Objects.equals(this.barcodeValue, barcodeResponse.barcodeValue) &&
                Objects.equals(this.barcodeType, barcodeResponse.barcodeType) &&
                Objects.equals(this.region, barcodeResponse.region) &&
                Objects.equals(this.checksum, barcodeResponse.checksum);
      }

      @Override
      public int hashCode() {
        return Objects.hash(barcodeValue, barcodeType, region, checksum);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class BarcodeResponse {\n");
            sb.append("    barcodeValue: ").append(toIndentedString(getBarcodeValue())).append("\n");
            sb.append("    barcodeType: ").append(toIndentedString(getBarcodeType())).append("\n");
            sb.append("    region: ").append(toIndentedString(getRegion())).append("\n");
            sb.append("    checksum: ").append(toIndentedString(getChecksum())).append("\n");
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

