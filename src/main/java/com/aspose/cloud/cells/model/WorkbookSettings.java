/* 
 * <summary>
 *  Copyright (c) 2019 Aspose.Cells Cloud
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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * WorkbookSettings
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-17T15:02:23.029+08:00")
public class WorkbookSettings {
  @SerializedName("NumberGroupSeparator")
  private String numberGroupSeparator = null;

  @SerializedName("HidePivotFieldList")
  private Boolean hidePivotFieldList = null;

  @SerializedName("IsMinimized")
  private Boolean isMinimized = null;

  @SerializedName("CalculationId")
  private String calculationId = null;

  @SerializedName("ReCalculateOnOpen")
  private Boolean reCalculateOnOpen = null;

  @SerializedName("CheckExcelRestriction")
  private Boolean checkExcelRestriction = null;

  @SerializedName("IsHScrollBarVisible")
  private Boolean isHScrollBarVisible = null;

  @SerializedName("WindowHeight")
  private Double windowHeight = null;

  @SerializedName("WindowLeft")
  private Double windowLeft = null;

  @SerializedName("CalcStackSize")
  private Integer calcStackSize = null;

  @SerializedName("Shared")
  private Boolean shared = null;

  @SerializedName("RemovePersonalInformation")
  private Boolean removePersonalInformation = null;

  @SerializedName("LanguageCode")
  private String languageCode = null;

  @SerializedName("EnableMacros")
  private Boolean enableMacros = null;

  @SerializedName("IsDefaultEncrypted")
  private Boolean isDefaultEncrypted = null;

  @SerializedName("RecalculateBeforeSave")
  private Boolean recalculateBeforeSave = null;

  @SerializedName("ParsingFormulaOnOpen")
  private Boolean parsingFormulaOnOpen = null;

  @SerializedName("WindowTop")
  private Double windowTop = null;

  @SerializedName("Region")
  private String region = null;

  @SerializedName("MemorySetting")
  private String memorySetting = null;

  @SerializedName("UpdateAdjacentCellsBorder")
  private Boolean updateAdjacentCellsBorder = null;

  @SerializedName("CrashSave")
  private Boolean crashSave = null;

  @SerializedName("ShowTabs")
  private Boolean showTabs = null;

  @SerializedName("PrecisionAsDisplayed")
  private Boolean precisionAsDisplayed = null;

  @SerializedName("CalcMode")
  private String calcMode = null;

  @SerializedName("AutoCompressPictures")
  private Boolean autoCompressPictures = null;

  @SerializedName("Date1904")
  private Boolean date1904 = null;

  @SerializedName("NumberDecimalSeparator")
  private String numberDecimalSeparator = null;

  @SerializedName("Iteration")
  private Boolean iteration = null;

  @SerializedName("CheckComptiliblity")
  private Boolean checkComptiliblity = null;

  @SerializedName("AutoRecover")
  private Boolean autoRecover = null;

  @SerializedName("MaxChange")
  private Double maxChange = null;

  @SerializedName("DataExtractLoad")
  private Boolean dataExtractLoad = null;

  @SerializedName("FirstVisibleTab")
  private Integer firstVisibleTab = null;

  @SerializedName("IsHidden")
  private Boolean isHidden = null;

  @SerializedName("RecommendReadOnly")
  private Boolean recommendReadOnly = null;

  @SerializedName("DisplayDrawingObjects")
  private String displayDrawingObjects = null;

  @SerializedName("BuildVersion")
  private String buildVersion = null;

  @SerializedName("IsVScrollBarVisible")
  private Boolean isVScrollBarVisible = null;

  @SerializedName("WindowWidth")
  private Double windowWidth = null;

  @SerializedName("CreateCalcChain")
  private Boolean createCalcChain = null;

  @SerializedName("MaxIteration")
  private Integer maxIteration = null;

  @SerializedName("RepairLoad")
  private Boolean repairLoad = null;

  @SerializedName("UpdateLinksType")
  private String updateLinksType = null;

  @SerializedName("SheetTabBarWidth")
  private Integer sheetTabBarWidth = null;

  public WorkbookSettings numberGroupSeparator(String numberGroupSeparator) {
    this.numberGroupSeparator = numberGroupSeparator;
    return this;
  }

   /**
   * Get numberGroupSeparator
   * @return numberGroupSeparator
  **/
  @ApiModelProperty(value = "")
  public String getNumberGroupSeparator() {
    return numberGroupSeparator;
  }

  public void setNumberGroupSeparator(String numberGroupSeparator) {
    this.numberGroupSeparator = numberGroupSeparator;
  }

  public WorkbookSettings hidePivotFieldList(Boolean hidePivotFieldList) {
    this.hidePivotFieldList = hidePivotFieldList;
    return this;
  }

   /**
   * Get hidePivotFieldList
   * @return hidePivotFieldList
  **/
  @ApiModelProperty(value = "")
  public Boolean HidePivotFieldList() {
    return hidePivotFieldList;
  }

  public void setHidePivotFieldList(Boolean hidePivotFieldList) {
    this.hidePivotFieldList = hidePivotFieldList;
  }

  public WorkbookSettings isMinimized(Boolean isMinimized) {
    this.isMinimized = isMinimized;
    return this;
  }

   /**
   * Represents whether the generated spreadsheet will be opened Minimized.             
   * @return isMinimized
  **/
  @ApiModelProperty(value = "Represents whether the generated spreadsheet will be opened Minimized.             ")
  public Boolean IsMinimized() {
    return isMinimized;
  }

  public void setIsMinimized(Boolean isMinimized) {
    this.isMinimized = isMinimized;
  }

  public WorkbookSettings calculationId(String calculationId) {
    this.calculationId = calculationId;
    return this;
  }

   /**
   * Specifies the version of the calculation engine used to calculate values in the workbook.             
   * @return calculationId
  **/
  @ApiModelProperty(value = "Specifies the version of the calculation engine used to calculate values in the workbook.             ")
  public String getCalculationId() {
    return calculationId;
  }

  public void setCalculationId(String calculationId) {
    this.calculationId = calculationId;
  }

  public WorkbookSettings reCalculateOnOpen(Boolean reCalculateOnOpen) {
    this.reCalculateOnOpen = reCalculateOnOpen;
    return this;
  }

   /**
   * Indicates whether re-calculate all formulas on opening file.             
   * @return reCalculateOnOpen
  **/
  @ApiModelProperty(value = "Indicates whether re-calculate all formulas on opening file.             ")
  public Boolean ReCalculateOnOpen() {
    return reCalculateOnOpen;
  }

  public void setReCalculateOnOpen(Boolean reCalculateOnOpen) {
    this.reCalculateOnOpen = reCalculateOnOpen;
  }

  public WorkbookSettings checkExcelRestriction(Boolean checkExcelRestriction) {
    this.checkExcelRestriction = checkExcelRestriction;
    return this;
  }

   /**
   * Whether check restriction of excel file when user modify cells related objects.  For example, excel does not allow inputting string value longer than 32K.  When you input a value longer than 32K such as by Cell.PutValue(string), if this property is true, you will get an Exception.  If this property is false, we will accept your input string value as the cell&#39;s value so that later you can output the complete string value for other file formats such as CSV.  However, if you have set such kind of value that is invalid for excel file format, you should not save the workbook as excel file format later. Otherwise there may be unexpected error for the generated excel file.             
   * @return checkExcelRestriction
  **/
  @ApiModelProperty(value = "Whether check restriction of excel file when user modify cells related objects.  For example, excel does not allow inputting string value longer than 32K.  When you input a value longer than 32K such as by Cell.PutValue(string), if this property is true, you will get an Exception.  If this property is false, we will accept your input string value as the cell's value so that later you can output the complete string value for other file formats such as CSV.  However, if you have set such kind of value that is invalid for excel file format, you should not save the workbook as excel file format later. Otherwise there may be unexpected error for the generated excel file.             ")
  public Boolean CheckExcelRestriction() {
    return checkExcelRestriction;
  }

  public void setCheckExcelRestriction(Boolean checkExcelRestriction) {
    this.checkExcelRestriction = checkExcelRestriction;
  }

  public WorkbookSettings isHScrollBarVisible(Boolean isHScrollBarVisible) {
    this.isHScrollBarVisible = isHScrollBarVisible;
    return this;
  }

   /**
   * Gets or sets a value indicating whether the generated spreadsheet will contain a horizontal scroll bar.                           Remarks: The default value is true.              
   * @return isHScrollBarVisible
  **/
  @ApiModelProperty(value = "Gets or sets a value indicating whether the generated spreadsheet will contain a horizontal scroll bar.                           Remarks: The default value is true.              ")
  public Boolean IsHScrollBarVisible() {
    return isHScrollBarVisible;
  }

  public void setIsHScrollBarVisible(Boolean isHScrollBarVisible) {
    this.isHScrollBarVisible = isHScrollBarVisible;
  }

  public WorkbookSettings windowHeight(Double windowHeight) {
    this.windowHeight = windowHeight;
    return this;
  }

   /**
   * The height of the window, in unit of point.             
   * @return windowHeight
  **/
  @ApiModelProperty(value = "The height of the window, in unit of point.             ")
  public Double getWindowHeight() {
    return windowHeight;
  }

  public void setWindowHeight(Double windowHeight) {
    this.windowHeight = windowHeight;
  }

  public WorkbookSettings windowLeft(Double windowLeft) {
    this.windowLeft = windowLeft;
    return this;
  }

   /**
   * The distance from the left edge of the client area to the left edge of the window, in unit of point.             
   * @return windowLeft
  **/
  @ApiModelProperty(value = "The distance from the left edge of the client area to the left edge of the window, in unit of point.             ")
  public Double getWindowLeft() {
    return windowLeft;
  }

  public void setWindowLeft(Double windowLeft) {
    this.windowLeft = windowLeft;
  }

  public WorkbookSettings calcStackSize(Integer calcStackSize) {
    this.calcStackSize = calcStackSize;
    return this;
  }

   /**
   * Specifies the stack size for calculating cells recursively.  The large value for this size will give better performance when there are lots of cells need to be calculated recursively.  On the other hand, larger value will raise the stakes of StackOverflowException.  If use gets StackOverflowException when calculating formulas, this value should be decreased.             
   * @return calcStackSize
  **/
  @ApiModelProperty(value = "Specifies the stack size for calculating cells recursively.  The large value for this size will give better performance when there are lots of cells need to be calculated recursively.  On the other hand, larger value will raise the stakes of StackOverflowException.  If use gets StackOverflowException when calculating formulas, this value should be decreased.             ")
  public Integer getCalcStackSize() {
    return calcStackSize;
  }

  public void setCalcStackSize(Integer calcStackSize) {
    this.calcStackSize = calcStackSize;
  }

  public WorkbookSettings shared(Boolean shared) {
    this.shared = shared;
    return this;
  }

   /**
   * Gets or sets a value that indicates whether the Workbook is shared.                           Remarks: The default value is false.              
   * @return shared
  **/
  @ApiModelProperty(value = "Gets or sets a value that indicates whether the Workbook is shared.                           Remarks: The default value is false.              ")
  public Boolean Shared() {
    return shared;
  }

  public void setShared(Boolean shared) {
    this.shared = shared;
  }

  public WorkbookSettings removePersonalInformation(Boolean removePersonalInformation) {
    this.removePersonalInformation = removePersonalInformation;
    return this;
  }

   /**
   * Get removePersonalInformation
   * @return removePersonalInformation
  **/
  @ApiModelProperty(value = "")
  public Boolean RemovePersonalInformation() {
    return removePersonalInformation;
  }

  public void setRemovePersonalInformation(Boolean removePersonalInformation) {
    this.removePersonalInformation = removePersonalInformation;
  }

  public WorkbookSettings languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

   /**
   * Gets or sets the user interface language of the Workbook version based on CountryCode that has saved the file.             
   * @return languageCode
  **/
  @ApiModelProperty(value = "Gets or sets the user interface language of the Workbook version based on CountryCode that has saved the file.             ")
  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }

  public WorkbookSettings enableMacros(Boolean enableMacros) {
    this.enableMacros = enableMacros;
    return this;
  }

   /**
   * Get enableMacros
   * @return enableMacros
  **/
  @ApiModelProperty(value = "")
  public Boolean EnableMacros() {
    return enableMacros;
  }

  public void setEnableMacros(Boolean enableMacros) {
    this.enableMacros = enableMacros;
  }

  public WorkbookSettings isDefaultEncrypted(Boolean isDefaultEncrypted) {
    this.isDefaultEncrypted = isDefaultEncrypted;
    return this;
  }

   /**
   * Get isDefaultEncrypted
   * @return isDefaultEncrypted
  **/
  @ApiModelProperty(value = "")
  public Boolean IsDefaultEncrypted() {
    return isDefaultEncrypted;
  }

  public void setIsDefaultEncrypted(Boolean isDefaultEncrypted) {
    this.isDefaultEncrypted = isDefaultEncrypted;
  }

  public WorkbookSettings recalculateBeforeSave(Boolean recalculateBeforeSave) {
    this.recalculateBeforeSave = recalculateBeforeSave;
    return this;
  }

   /**
   * Indicates whether to recalculate before saving the document.             
   * @return recalculateBeforeSave
  **/
  @ApiModelProperty(value = "Indicates whether to recalculate before saving the document.             ")
  public Boolean RecalculateBeforeSave() {
    return recalculateBeforeSave;
  }

  public void setRecalculateBeforeSave(Boolean recalculateBeforeSave) {
    this.recalculateBeforeSave = recalculateBeforeSave;
  }

  public WorkbookSettings parsingFormulaOnOpen(Boolean parsingFormulaOnOpen) {
    this.parsingFormulaOnOpen = parsingFormulaOnOpen;
    return this;
  }

   /**
   * Indicates whether parsing the formula when reading the file.                           Remarks: Only applies for Excel Xlsx,Xltx, Xltm,Xlsm file because the formulas in the files are stored with a string formula.              
   * @return parsingFormulaOnOpen
  **/
  @ApiModelProperty(value = "Indicates whether parsing the formula when reading the file.                           Remarks: Only applies for Excel Xlsx,Xltx, Xltm,Xlsm file because the formulas in the files are stored with a string formula.              ")
  public Boolean ParsingFormulaOnOpen() {
    return parsingFormulaOnOpen;
  }

  public void setParsingFormulaOnOpen(Boolean parsingFormulaOnOpen) {
    this.parsingFormulaOnOpen = parsingFormulaOnOpen;
  }

  public WorkbookSettings windowTop(Double windowTop) {
    this.windowTop = windowTop;
    return this;
  }

   /**
   * The distance from the top edge of the client area to the top edge of the window, in unit of point.             
   * @return windowTop
  **/
  @ApiModelProperty(value = "The distance from the top edge of the client area to the top edge of the window, in unit of point.             ")
  public Double getWindowTop() {
    return windowTop;
  }

  public void setWindowTop(Double windowTop) {
    this.windowTop = windowTop;
  }

  public WorkbookSettings region(String region) {
    this.region = region;
    return this;
  }

   /**
   * Gets or sets the system regional settings based on CountryCode at the time the file was saved.                           Remarks: If you do not want to use the region saved in the file, please reset it after reading the file.              
   * @return region
  **/
  @ApiModelProperty(value = "Gets or sets the system regional settings based on CountryCode at the time the file was saved.                           Remarks: If you do not want to use the region saved in the file, please reset it after reading the file.              ")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public WorkbookSettings memorySetting(String memorySetting) {
    this.memorySetting = memorySetting;
    return this;
  }

   /**
   * Get memorySetting
   * @return memorySetting
  **/
  @ApiModelProperty(value = "")
  public String getMemorySetting() {
    return memorySetting;
  }

  public void setMemorySetting(String memorySetting) {
    this.memorySetting = memorySetting;
  }

  public WorkbookSettings updateAdjacentCellsBorder(Boolean updateAdjacentCellsBorder) {
    this.updateAdjacentCellsBorder = updateAdjacentCellsBorder;
    return this;
  }

   /**
   * Indicates whether update adjacent cells&#39; border.                           Remarks: The default value is true.  For example: the bottom border of the cell A1 is update, the top border of the cell A2 should be changed too.              
   * @return updateAdjacentCellsBorder
  **/
  @ApiModelProperty(value = "Indicates whether update adjacent cells' border.                           Remarks: The default value is true.  For example: the bottom border of the cell A1 is update, the top border of the cell A2 should be changed too.              ")
  public Boolean UpdateAdjacentCellsBorder() {
    return updateAdjacentCellsBorder;
  }

  public void setUpdateAdjacentCellsBorder(Boolean updateAdjacentCellsBorder) {
    this.updateAdjacentCellsBorder = updateAdjacentCellsBorder;
  }

  public WorkbookSettings crashSave(Boolean crashSave) {
    this.crashSave = crashSave;
    return this;
  }

   /**
   * Get crashSave
   * @return crashSave
  **/
  @ApiModelProperty(value = "")
  public Boolean CrashSave() {
    return crashSave;
  }

  public void setCrashSave(Boolean crashSave) {
    this.crashSave = crashSave;
  }

  public WorkbookSettings showTabs(Boolean showTabs) {
    this.showTabs = showTabs;
    return this;
  }

   /**
   * Get or sets a value whether the Workbook tabs are displayed.                           Remarks: The default value is true.              
   * @return showTabs
  **/
  @ApiModelProperty(value = "Get or sets a value whether the Workbook tabs are displayed.                           Remarks: The default value is true.              ")
  public Boolean ShowTabs() {
    return showTabs;
  }

  public void setShowTabs(Boolean showTabs) {
    this.showTabs = showTabs;
  }

  public WorkbookSettings precisionAsDisplayed(Boolean precisionAsDisplayed) {
    this.precisionAsDisplayed = precisionAsDisplayed;
    return this;
  }

   /**
   * True if calculations in this workbook will be done using only the precision of the numbers as they&#39;re displayed             
   * @return precisionAsDisplayed
  **/
  @ApiModelProperty(value = "True if calculations in this workbook will be done using only the precision of the numbers as they're displayed             ")
  public Boolean PrecisionAsDisplayed() {
    return precisionAsDisplayed;
  }

  public void setPrecisionAsDisplayed(Boolean precisionAsDisplayed) {
    this.precisionAsDisplayed = precisionAsDisplayed;
  }

  public WorkbookSettings calcMode(String calcMode) {
    this.calcMode = calcMode;
    return this;
  }

   /**
   * It specifies whether to calculate formulas manually, automatically or automatically except for multiple table operations.             
   * @return calcMode
  **/
  @ApiModelProperty(value = "It specifies whether to calculate formulas manually, automatically or automatically except for multiple table operations.             ")
  public String getCalcMode() {
    return calcMode;
  }

  public void setCalcMode(String calcMode) {
    this.calcMode = calcMode;
  }

  public WorkbookSettings autoCompressPictures(Boolean autoCompressPictures) {
    this.autoCompressPictures = autoCompressPictures;
    return this;
  }

   /**
   * Get autoCompressPictures
   * @return autoCompressPictures
  **/
  @ApiModelProperty(value = "")
  public Boolean AutoCompressPictures() {
    return autoCompressPictures;
  }

  public void setAutoCompressPictures(Boolean autoCompressPictures) {
    this.autoCompressPictures = autoCompressPictures;
  }

  public WorkbookSettings date1904(Boolean date1904) {
    this.date1904 = date1904;
    return this;
  }

   /**
   * Gets or sets a value which represents if the workbook uses the 1904 date system.             
   * @return date1904
  **/
  @ApiModelProperty(value = "Gets or sets a value which represents if the workbook uses the 1904 date system.             ")
  public Boolean Date1904() {
    return date1904;
  }

  public void setDate1904(Boolean date1904) {
    this.date1904 = date1904;
  }

  public WorkbookSettings numberDecimalSeparator(String numberDecimalSeparator) {
    this.numberDecimalSeparator = numberDecimalSeparator;
    return this;
  }

   /**
   * Get numberDecimalSeparator
   * @return numberDecimalSeparator
  **/
  @ApiModelProperty(value = "")
  public String getNumberDecimalSeparator() {
    return numberDecimalSeparator;
  }

  public void setNumberDecimalSeparator(String numberDecimalSeparator) {
    this.numberDecimalSeparator = numberDecimalSeparator;
  }

  public WorkbookSettings iteration(Boolean iteration) {
    this.iteration = iteration;
    return this;
  }

   /**
   * Indicates if Aspose.Cells will use iteration to resolve circular references.             
   * @return iteration
  **/
  @ApiModelProperty(value = "Indicates if Aspose.Cells will use iteration to resolve circular references.             ")
  public Boolean Iteration() {
    return iteration;
  }

  public void setIteration(Boolean iteration) {
    this.iteration = iteration;
  }

  public WorkbookSettings checkComptiliblity(Boolean checkComptiliblity) {
    this.checkComptiliblity = checkComptiliblity;
    return this;
  }

   /**
   * Indicates whether check comptiliblity when saving workbook.                           Remarks:  The default value is true.              
   * @return checkComptiliblity
  **/
  @ApiModelProperty(value = "Indicates whether check comptiliblity when saving workbook.                           Remarks:  The default value is true.              ")
  public Boolean CheckComptiliblity() {
    return checkComptiliblity;
  }

  public void setCheckComptiliblity(Boolean checkComptiliblity) {
    this.checkComptiliblity = checkComptiliblity;
  }

  public WorkbookSettings autoRecover(Boolean autoRecover) {
    this.autoRecover = autoRecover;
    return this;
  }

   /**
   * Get autoRecover
   * @return autoRecover
  **/
  @ApiModelProperty(value = "")
  public Boolean AutoRecover() {
    return autoRecover;
  }

  public void setAutoRecover(Boolean autoRecover) {
    this.autoRecover = autoRecover;
  }

  public WorkbookSettings maxChange(Double maxChange) {
    this.maxChange = maxChange;
    return this;
  }

   /**
   * Returns or sets the maximum number of change that Microsoft Excel can use to resolve a circular reference.             
   * @return maxChange
  **/
  @ApiModelProperty(value = "Returns or sets the maximum number of change that Microsoft Excel can use to resolve a circular reference.             ")
  public Double getMaxChange() {
    return maxChange;
  }

  public void setMaxChange(Double maxChange) {
    this.maxChange = maxChange;
  }

  public WorkbookSettings dataExtractLoad(Boolean dataExtractLoad) {
    this.dataExtractLoad = dataExtractLoad;
    return this;
  }

   /**
   * Get dataExtractLoad
   * @return dataExtractLoad
  **/
  @ApiModelProperty(value = "")
  public Boolean DataExtractLoad() {
    return dataExtractLoad;
  }

  public void setDataExtractLoad(Boolean dataExtractLoad) {
    this.dataExtractLoad = dataExtractLoad;
  }

  public WorkbookSettings firstVisibleTab(Integer firstVisibleTab) {
    this.firstVisibleTab = firstVisibleTab;
    return this;
  }

   /**
   * Gets or sets the first visible worksheet tab.             
   * @return firstVisibleTab
  **/
  @ApiModelProperty(value = "Gets or sets the first visible worksheet tab.             ")
  public Integer getFirstVisibleTab() {
    return firstVisibleTab;
  }

  public void setFirstVisibleTab(Integer firstVisibleTab) {
    this.firstVisibleTab = firstVisibleTab;
  }

  public WorkbookSettings isHidden(Boolean isHidden) {
    this.isHidden = isHidden;
    return this;
  }

   /**
   * Indicates whether this workbook is hidden.             
   * @return isHidden
  **/
  @ApiModelProperty(value = "Indicates whether this workbook is hidden.             ")
  public Boolean IsHidden() {
    return isHidden;
  }

  public void setIsHidden(Boolean isHidden) {
    this.isHidden = isHidden;
  }

  public WorkbookSettings recommendReadOnly(Boolean recommendReadOnly) {
    this.recommendReadOnly = recommendReadOnly;
    return this;
  }

   /**
   * Indicates if the Read Only Recommended option is selected.             
   * @return recommendReadOnly
  **/
  @ApiModelProperty(value = "Indicates if the Read Only Recommended option is selected.             ")
  public Boolean RecommendReadOnly() {
    return recommendReadOnly;
  }

  public void setRecommendReadOnly(Boolean recommendReadOnly) {
    this.recommendReadOnly = recommendReadOnly;
  }

  public WorkbookSettings displayDrawingObjects(String displayDrawingObjects) {
    this.displayDrawingObjects = displayDrawingObjects;
    return this;
  }

   /**
   * Indicates whether and how to show objects in the workbook.             
   * @return displayDrawingObjects
  **/
  @ApiModelProperty(value = "Indicates whether and how to show objects in the workbook.             ")
  public String getDisplayDrawingObjects() {
    return displayDrawingObjects;
  }

  public void setDisplayDrawingObjects(String displayDrawingObjects) {
    this.displayDrawingObjects = displayDrawingObjects;
  }

  public WorkbookSettings buildVersion(String buildVersion) {
    this.buildVersion = buildVersion;
    return this;
  }

   /**
   * Specifies the incremental public release of the application.             
   * @return buildVersion
  **/
  @ApiModelProperty(value = "Specifies the incremental public release of the application.             ")
  public String getBuildVersion() {
    return buildVersion;
  }

  public void setBuildVersion(String buildVersion) {
    this.buildVersion = buildVersion;
  }

  public WorkbookSettings isVScrollBarVisible(Boolean isVScrollBarVisible) {
    this.isVScrollBarVisible = isVScrollBarVisible;
    return this;
  }

   /**
   * Gets or sets a value indicating whether the generated spreadsheet will contain a vertical scroll bar.                           Remarks: The default value is true.              
   * @return isVScrollBarVisible
  **/
  @ApiModelProperty(value = "Gets or sets a value indicating whether the generated spreadsheet will contain a vertical scroll bar.                           Remarks: The default value is true.              ")
  public Boolean IsVScrollBarVisible() {
    return isVScrollBarVisible;
  }

  public void setIsVScrollBarVisible(Boolean isVScrollBarVisible) {
    this.isVScrollBarVisible = isVScrollBarVisible;
  }

  public WorkbookSettings windowWidth(Double windowWidth) {
    this.windowWidth = windowWidth;
    return this;
  }

   /**
   * The width of the window, in unit of point.             
   * @return windowWidth
  **/
  @ApiModelProperty(value = "The width of the window, in unit of point.             ")
  public Double getWindowWidth() {
    return windowWidth;
  }

  public void setWindowWidth(Double windowWidth) {
    this.windowWidth = windowWidth;
  }

  public WorkbookSettings createCalcChain(Boolean createCalcChain) {
    this.createCalcChain = createCalcChain;
    return this;
  }

   /**
   * Indicates whether create calculated formulas chain.             
   * @return createCalcChain
  **/
  @ApiModelProperty(value = "Indicates whether create calculated formulas chain.             ")
  public Boolean CreateCalcChain() {
    return createCalcChain;
  }

  public void setCreateCalcChain(Boolean createCalcChain) {
    this.createCalcChain = createCalcChain;
  }

  public WorkbookSettings maxIteration(Integer maxIteration) {
    this.maxIteration = maxIteration;
    return this;
  }

   /**
   * Returns or sets the maximum number of iterations that Aspose.Cells can use to resolve a circular reference.             
   * @return maxIteration
  **/
  @ApiModelProperty(value = "Returns or sets the maximum number of iterations that Aspose.Cells can use to resolve a circular reference.             ")
  public Integer getMaxIteration() {
    return maxIteration;
  }

  public void setMaxIteration(Integer maxIteration) {
    this.maxIteration = maxIteration;
  }

  public WorkbookSettings repairLoad(Boolean repairLoad) {
    this.repairLoad = repairLoad;
    return this;
  }

   /**
   * Get repairLoad
   * @return repairLoad
  **/
  @ApiModelProperty(value = "")
  public Boolean RepairLoad() {
    return repairLoad;
  }

  public void setRepairLoad(Boolean repairLoad) {
    this.repairLoad = repairLoad;
  }

  public WorkbookSettings updateLinksType(String updateLinksType) {
    this.updateLinksType = updateLinksType;
    return this;
  }

   /**
   * Get updateLinksType
   * @return updateLinksType
  **/
  @ApiModelProperty(value = "")
  public String getUpdateLinksType() {
    return updateLinksType;
  }

  public void setUpdateLinksType(String updateLinksType) {
    this.updateLinksType = updateLinksType;
  }

  public WorkbookSettings sheetTabBarWidth(Integer sheetTabBarWidth) {
    this.sheetTabBarWidth = sheetTabBarWidth;
    return this;
  }

   /**
   * Width of worksheet tab bar (in 1/1000 of window width).             
   * @return sheetTabBarWidth
  **/
  @ApiModelProperty(value = "Width of worksheet tab bar (in 1/1000 of window width).             ")
  public Integer getSheetTabBarWidth() {
    return sheetTabBarWidth;
  }

  public void setSheetTabBarWidth(Integer sheetTabBarWidth) {
    this.sheetTabBarWidth = sheetTabBarWidth;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkbookSettings workbookSettings = (WorkbookSettings) o;
    return Objects.equals(this.numberGroupSeparator, workbookSettings.numberGroupSeparator) &&
        Objects.equals(this.hidePivotFieldList, workbookSettings.hidePivotFieldList) &&
        Objects.equals(this.isMinimized, workbookSettings.isMinimized) &&
        Objects.equals(this.calculationId, workbookSettings.calculationId) &&
        Objects.equals(this.reCalculateOnOpen, workbookSettings.reCalculateOnOpen) &&
        Objects.equals(this.checkExcelRestriction, workbookSettings.checkExcelRestriction) &&
        Objects.equals(this.isHScrollBarVisible, workbookSettings.isHScrollBarVisible) &&
        Objects.equals(this.windowHeight, workbookSettings.windowHeight) &&
        Objects.equals(this.windowLeft, workbookSettings.windowLeft) &&
        Objects.equals(this.calcStackSize, workbookSettings.calcStackSize) &&
        Objects.equals(this.shared, workbookSettings.shared) &&
        Objects.equals(this.removePersonalInformation, workbookSettings.removePersonalInformation) &&
        Objects.equals(this.languageCode, workbookSettings.languageCode) &&
        Objects.equals(this.enableMacros, workbookSettings.enableMacros) &&
        Objects.equals(this.isDefaultEncrypted, workbookSettings.isDefaultEncrypted) &&
        Objects.equals(this.recalculateBeforeSave, workbookSettings.recalculateBeforeSave) &&
        Objects.equals(this.parsingFormulaOnOpen, workbookSettings.parsingFormulaOnOpen) &&
        Objects.equals(this.windowTop, workbookSettings.windowTop) &&
        Objects.equals(this.region, workbookSettings.region) &&
        Objects.equals(this.memorySetting, workbookSettings.memorySetting) &&
        Objects.equals(this.updateAdjacentCellsBorder, workbookSettings.updateAdjacentCellsBorder) &&
        Objects.equals(this.crashSave, workbookSettings.crashSave) &&
        Objects.equals(this.showTabs, workbookSettings.showTabs) &&
        Objects.equals(this.precisionAsDisplayed, workbookSettings.precisionAsDisplayed) &&
        Objects.equals(this.calcMode, workbookSettings.calcMode) &&
        Objects.equals(this.autoCompressPictures, workbookSettings.autoCompressPictures) &&
        Objects.equals(this.date1904, workbookSettings.date1904) &&
        Objects.equals(this.numberDecimalSeparator, workbookSettings.numberDecimalSeparator) &&
        Objects.equals(this.iteration, workbookSettings.iteration) &&
        Objects.equals(this.checkComptiliblity, workbookSettings.checkComptiliblity) &&
        Objects.equals(this.autoRecover, workbookSettings.autoRecover) &&
        Objects.equals(this.maxChange, workbookSettings.maxChange) &&
        Objects.equals(this.dataExtractLoad, workbookSettings.dataExtractLoad) &&
        Objects.equals(this.firstVisibleTab, workbookSettings.firstVisibleTab) &&
        Objects.equals(this.isHidden, workbookSettings.isHidden) &&
        Objects.equals(this.recommendReadOnly, workbookSettings.recommendReadOnly) &&
        Objects.equals(this.displayDrawingObjects, workbookSettings.displayDrawingObjects) &&
        Objects.equals(this.buildVersion, workbookSettings.buildVersion) &&
        Objects.equals(this.isVScrollBarVisible, workbookSettings.isVScrollBarVisible) &&
        Objects.equals(this.windowWidth, workbookSettings.windowWidth) &&
        Objects.equals(this.createCalcChain, workbookSettings.createCalcChain) &&
        Objects.equals(this.maxIteration, workbookSettings.maxIteration) &&
        Objects.equals(this.repairLoad, workbookSettings.repairLoad) &&
        Objects.equals(this.updateLinksType, workbookSettings.updateLinksType) &&
        Objects.equals(this.sheetTabBarWidth, workbookSettings.sheetTabBarWidth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberGroupSeparator, hidePivotFieldList, isMinimized, calculationId, reCalculateOnOpen, checkExcelRestriction, isHScrollBarVisible, windowHeight, windowLeft, calcStackSize, shared, removePersonalInformation, languageCode, enableMacros, isDefaultEncrypted, recalculateBeforeSave, parsingFormulaOnOpen, windowTop, region, memorySetting, updateAdjacentCellsBorder, crashSave, showTabs, precisionAsDisplayed, calcMode, autoCompressPictures, date1904, numberDecimalSeparator, iteration, checkComptiliblity, autoRecover, maxChange, dataExtractLoad, firstVisibleTab, isHidden, recommendReadOnly, displayDrawingObjects, buildVersion, isVScrollBarVisible, windowWidth, createCalcChain, maxIteration, repairLoad, updateLinksType, sheetTabBarWidth);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkbookSettings {\n");
    
    sb.append("    numberGroupSeparator: ").append(toIndentedString(numberGroupSeparator)).append("\n");
    sb.append("    hidePivotFieldList: ").append(toIndentedString(hidePivotFieldList)).append("\n");
    sb.append("    isMinimized: ").append(toIndentedString(isMinimized)).append("\n");
    sb.append("    calculationId: ").append(toIndentedString(calculationId)).append("\n");
    sb.append("    reCalculateOnOpen: ").append(toIndentedString(reCalculateOnOpen)).append("\n");
    sb.append("    checkExcelRestriction: ").append(toIndentedString(checkExcelRestriction)).append("\n");
    sb.append("    isHScrollBarVisible: ").append(toIndentedString(isHScrollBarVisible)).append("\n");
    sb.append("    windowHeight: ").append(toIndentedString(windowHeight)).append("\n");
    sb.append("    windowLeft: ").append(toIndentedString(windowLeft)).append("\n");
    sb.append("    calcStackSize: ").append(toIndentedString(calcStackSize)).append("\n");
    sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
    sb.append("    removePersonalInformation: ").append(toIndentedString(removePersonalInformation)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    enableMacros: ").append(toIndentedString(enableMacros)).append("\n");
    sb.append("    isDefaultEncrypted: ").append(toIndentedString(isDefaultEncrypted)).append("\n");
    sb.append("    recalculateBeforeSave: ").append(toIndentedString(recalculateBeforeSave)).append("\n");
    sb.append("    parsingFormulaOnOpen: ").append(toIndentedString(parsingFormulaOnOpen)).append("\n");
    sb.append("    windowTop: ").append(toIndentedString(windowTop)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    memorySetting: ").append(toIndentedString(memorySetting)).append("\n");
    sb.append("    updateAdjacentCellsBorder: ").append(toIndentedString(updateAdjacentCellsBorder)).append("\n");
    sb.append("    crashSave: ").append(toIndentedString(crashSave)).append("\n");
    sb.append("    showTabs: ").append(toIndentedString(showTabs)).append("\n");
    sb.append("    precisionAsDisplayed: ").append(toIndentedString(precisionAsDisplayed)).append("\n");
    sb.append("    calcMode: ").append(toIndentedString(calcMode)).append("\n");
    sb.append("    autoCompressPictures: ").append(toIndentedString(autoCompressPictures)).append("\n");
    sb.append("    date1904: ").append(toIndentedString(date1904)).append("\n");
    sb.append("    numberDecimalSeparator: ").append(toIndentedString(numberDecimalSeparator)).append("\n");
    sb.append("    iteration: ").append(toIndentedString(iteration)).append("\n");
    sb.append("    checkComptiliblity: ").append(toIndentedString(checkComptiliblity)).append("\n");
    sb.append("    autoRecover: ").append(toIndentedString(autoRecover)).append("\n");
    sb.append("    maxChange: ").append(toIndentedString(maxChange)).append("\n");
    sb.append("    dataExtractLoad: ").append(toIndentedString(dataExtractLoad)).append("\n");
    sb.append("    firstVisibleTab: ").append(toIndentedString(firstVisibleTab)).append("\n");
    sb.append("    isHidden: ").append(toIndentedString(isHidden)).append("\n");
    sb.append("    recommendReadOnly: ").append(toIndentedString(recommendReadOnly)).append("\n");
    sb.append("    displayDrawingObjects: ").append(toIndentedString(displayDrawingObjects)).append("\n");
    sb.append("    buildVersion: ").append(toIndentedString(buildVersion)).append("\n");
    sb.append("    isVScrollBarVisible: ").append(toIndentedString(isVScrollBarVisible)).append("\n");
    sb.append("    windowWidth: ").append(toIndentedString(windowWidth)).append("\n");
    sb.append("    createCalcChain: ").append(toIndentedString(createCalcChain)).append("\n");
    sb.append("    maxIteration: ").append(toIndentedString(maxIteration)).append("\n");
    sb.append("    repairLoad: ").append(toIndentedString(repairLoad)).append("\n");
    sb.append("    updateLinksType: ").append(toIndentedString(updateLinksType)).append("\n");
    sb.append("    sheetTabBarWidth: ").append(toIndentedString(sheetTabBarWidth)).append("\n");
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

