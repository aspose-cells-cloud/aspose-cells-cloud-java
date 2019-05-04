/*
 * Web API Swagger specification
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.aspose.cloud.cells.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ListColumn
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-02T16:48:31.575+08:00")
public class ListColumn {
  @SerializedName("TotalsCalculation")
  private String totalsCalculation = null;

  @SerializedName("Name")
  private String name = null;

  public ListColumn totalsCalculation(String totalsCalculation) {
    this.totalsCalculation = totalsCalculation;
    return this;
  }

   /**
   * Gets and sets the type of calculation in the Totals row of the list column.
   * @return totalsCalculation
  **/
  @ApiModelProperty(value = "Gets and sets the type of calculation in the Totals row of the list column.")
  public String getTotalsCalculation() {
    return totalsCalculation;
  }

  public void setTotalsCalculation(String totalsCalculation) {
    this.totalsCalculation = totalsCalculation;
  }

  public ListColumn name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Gets and sets the name of the column.
   * @return name
  **/
  @ApiModelProperty(value = "Gets and sets the name of the column.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListColumn listColumn = (ListColumn) o;
    return Objects.equals(this.totalsCalculation, listColumn.totalsCalculation) &&
        Objects.equals(this.name, listColumn.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalsCalculation, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListColumn {\n");
    
    sb.append("    totalsCalculation: ").append(toIndentedString(totalsCalculation)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

