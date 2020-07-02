/* 
 * <summary>
 *  Copyright (c) 2020 Aspose.Cells Cloud
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
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
 */


package com.aspose.cloud.cells.model;

import java.util.Objects;
import com.aspose.cloud.cells.model.Link;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SaveResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-02T09:41:11.020+08:00")
public class SaveResult {
  @SerializedName("SourceDocument")
  private Link sourceDocument = null;

  @SerializedName("DestDocument")
  private Link destDocument = null;

  @SerializedName("AdditionalItems")
  private List<Link> additionalItems = null;

  public SaveResult sourceDocument(Link sourceDocument) {
    this.sourceDocument = sourceDocument;
    return this;
  }

   /**
   * Get sourceDocument
   * @return sourceDocument
  **/
  @ApiModelProperty(value = "")
  public Link getSourceDocument() {
    return sourceDocument;
  }

  public void setSourceDocument(Link sourceDocument) {
    this.sourceDocument = sourceDocument;
  }

  public SaveResult destDocument(Link destDocument) {
    this.destDocument = destDocument;
    return this;
  }

   /**
   * Get destDocument
   * @return destDocument
  **/
  @ApiModelProperty(value = "")
  public Link getDestDocument() {
    return destDocument;
  }

  public void setDestDocument(Link destDocument) {
    this.destDocument = destDocument;
  }

  public SaveResult additionalItems(List<Link> additionalItems) {
    this.additionalItems = additionalItems;
    return this;
  }

  public SaveResult addAdditionalItemsItem(Link additionalItemsItem) {
    if (this.additionalItems == null) {
      this.additionalItems = new ArrayList<>();
    }
    this.additionalItems.add(additionalItemsItem);
    return this;
  }

   /**
   * Get additionalItems
   * @return additionalItems
  **/
  @ApiModelProperty(value = "")
  public List<Link> getAdditionalItems() {
    return additionalItems;
  }

  public void setAdditionalItems(List<Link> additionalItems) {
    this.additionalItems = additionalItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SaveResult saveResult = (SaveResult) o;
    return Objects.equals(this.sourceDocument, saveResult.sourceDocument) &&
        Objects.equals(this.destDocument, saveResult.destDocument) &&
        Objects.equals(this.additionalItems, saveResult.additionalItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceDocument, destDocument, additionalItems);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaveResult {\n");
    
    sb.append("    sourceDocument: ").append(toIndentedString(sourceDocument)).append("\n");
    sb.append("    destDocument: ").append(toIndentedString(destDocument)).append("\n");
    sb.append("    additionalItems: ").append(toIndentedString(additionalItems)).append("\n");
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

