/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TextItems.java">
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


public class TextItems  extends  LinkElement {
        @SerializedName("TextItemList")
        private List<TextItem> textItemList ;

        public  TextItems  textItemList(List<TextItem>  textItemList) {
            this.textItemList =  textItemList;
            return this;
        }

        @ApiModelProperty(value = "")
        public List<TextItem> getTextItemList() {
            return textItemList;
        }

        public void setTextItemList(List<TextItem> textItemList) {
            this.textItemList = textItemList;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            TextItems textItems = (TextItems) o;
            return
                Objects.equals(this.textItemList, textItems.textItemList) &&
                super.equals(o);
      }

      @Override
      public int hashCode() {
        return Objects.hash(textItemList, super.hashCode());
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class TextItems {\n");
            sb.append("    textItemList: ").append(toIndentedString(getTextItemList())).append("\n");
            sb.append("    link: ").append(toIndentedString(getLink())).append("\n");
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

