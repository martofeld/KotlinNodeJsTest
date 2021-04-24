@file:JsQualifier("sheets_v4")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package com.mfeldsztejn.kjs.googleapis.sheets

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import stream.internal.Readable
import com.mfeldsztejn.kjs.gaxios.*

external interface Options : GlobalOptions {
    var version: String /* "v4" */
}

external interface StandardParameters {
    var auth: dynamic /* String? | OAuth2Client? | JWT? | Compute? | UserRefreshClient? | BaseExternalAccountClient? | GoogleAuth? */
        get() = definedExternally
        set(value) = definedExternally
    /*var `$.xgafv`: String?
        get() = definedExternally
        set(value) = definedExternally*/
    var access_token: String?
        get() = definedExternally
        set(value) = definedExternally
    var alt: String?
        get() = definedExternally
        set(value) = definedExternally
    var callback: String?
        get() = definedExternally
        set(value) = definedExternally
    var fields: String?
        get() = definedExternally
        set(value) = definedExternally
    var key: String?
        get() = definedExternally
        set(value) = definedExternally
    var oauth_token: String?
        get() = definedExternally
        set(value) = definedExternally
    var prettyPrint: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var quotaUser: String?
        get() = definedExternally
        set(value) = definedExternally
    var uploadType: String?
        get() = definedExternally
        set(value) = definedExternally
    var upload_protocol: String?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Sheets(options: GlobalOptions, google: GoogleConfigurable = definedExternally) {
    open var context: APIRequestContext
    open var spreadsheets: `Resource$Spreadsheets`
}

external interface `Schema$AddBandingRequest` {
    var bandedRange: `Schema$BandedRange`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$AddBandingResponse` {
    var bandedRange: `Schema$BandedRange`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$AddChartRequest` {
    var chart: `Schema$EmbeddedChart`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$AddChartResponse` {
    var chart: `Schema$EmbeddedChart`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$AddConditionalFormatRuleRequest` {
    var index: Number?
        get() = definedExternally
        set(value) = definedExternally
    var rule: `Schema$ConditionalFormatRule`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$AddDataSourceRequest` {
    var dataSource: `Schema$DataSource`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$AddDataSourceResponse` {
    var dataExecutionStatus: `Schema$DataExecutionStatus`?
        get() = definedExternally
        set(value) = definedExternally
    var dataSource: `Schema$DataSource`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$AddDimensionGroupRequest` {
    var range: `Schema$DimensionRange`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$AddDimensionGroupResponse` {
    var dimensionGroups: Array<`Schema$DimensionGroup`>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$AddFilterViewRequest` {
    var filter: `Schema$FilterView`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$AddFilterViewResponse` {
    var filter: `Schema$FilterView`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$AddNamedRangeRequest` {
    var namedRange: `Schema$NamedRange`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$AddNamedRangeResponse` {
    var namedRange: `Schema$NamedRange`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$AddProtectedRangeRequest` {
    var protectedRange: `Schema$ProtectedRange`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$AddProtectedRangeResponse` {
    var protectedRange: `Schema$ProtectedRange`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$AddSheetRequest` {
    var properties: `Schema$SheetProperties`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$AddSheetResponse` {
    var properties: `Schema$SheetProperties`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$AddSlicerRequest` {
    var slicer: `Schema$Slicer`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$AddSlicerResponse` {
    var slicer: `Schema$Slicer`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$AppendCellsRequest` {
    var fields: String?
        get() = definedExternally
        set(value) = definedExternally
    var rows: Array<`Schema$RowData`>?
        get() = definedExternally
        set(value) = definedExternally
    var sheetId: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$AppendDimensionRequest` {
    var dimension: String?
        get() = definedExternally
        set(value) = definedExternally
    var length: Number?
        get() = definedExternally
        set(value) = definedExternally
    var sheetId: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$AppendValuesResponse` {
    var spreadsheetId: String?
        get() = definedExternally
        set(value) = definedExternally
    var tableRange: String?
        get() = definedExternally
        set(value) = definedExternally
    var updates: `Schema$UpdateValuesResponse`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$AutoFillRequest` {
    var range: `Schema$GridRange`?
        get() = definedExternally
        set(value) = definedExternally
    var sourceAndDestination: `Schema$SourceAndDestination`?
        get() = definedExternally
        set(value) = definedExternally
    var useAlternateSeries: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$AutoResizeDimensionsRequest` {
    var dataSourceSheetDimensions: `Schema$DataSourceSheetDimensionRange`?
        get() = definedExternally
        set(value) = definedExternally
    var dimensions: `Schema$DimensionRange`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$BandedRange` {
    var bandedRangeId: Number?
        get() = definedExternally
        set(value) = definedExternally
    var columnProperties: `Schema$BandingProperties`?
        get() = definedExternally
        set(value) = definedExternally
    var range: `Schema$GridRange`?
        get() = definedExternally
        set(value) = definedExternally
    var rowProperties: `Schema$BandingProperties`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$BandingProperties` {
    var firstBandColor: `Schema$Color`?
        get() = definedExternally
        set(value) = definedExternally
    var firstBandColorStyle: `Schema$ColorStyle`?
        get() = definedExternally
        set(value) = definedExternally
    var footerColor: `Schema$Color`?
        get() = definedExternally
        set(value) = definedExternally
    var footerColorStyle: `Schema$ColorStyle`?
        get() = definedExternally
        set(value) = definedExternally
    var headerColor: `Schema$Color`?
        get() = definedExternally
        set(value) = definedExternally
    var headerColorStyle: `Schema$ColorStyle`?
        get() = definedExternally
        set(value) = definedExternally
    var secondBandColor: `Schema$Color`?
        get() = definedExternally
        set(value) = definedExternally
    var secondBandColorStyle: `Schema$ColorStyle`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$BaselineValueFormat` {
    var comparisonType: String?
        get() = definedExternally
        set(value) = definedExternally
    var description: String?
        get() = definedExternally
        set(value) = definedExternally
    var negativeColor: `Schema$Color`?
        get() = definedExternally
        set(value) = definedExternally
    var negativeColorStyle: `Schema$ColorStyle`?
        get() = definedExternally
        set(value) = definedExternally
    var position: `Schema$TextPosition`?
        get() = definedExternally
        set(value) = definedExternally
    var positiveColor: `Schema$Color`?
        get() = definedExternally
        set(value) = definedExternally
    var positiveColorStyle: `Schema$ColorStyle`?
        get() = definedExternally
        set(value) = definedExternally
    var textFormat: `Schema$TextFormat`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$BasicChartAxis` {
    var format: `Schema$TextFormat`?
        get() = definedExternally
        set(value) = definedExternally
    var position: String?
        get() = definedExternally
        set(value) = definedExternally
    var title: String?
        get() = definedExternally
        set(value) = definedExternally
    var titleTextPosition: `Schema$TextPosition`?
        get() = definedExternally
        set(value) = definedExternally
    var viewWindowOptions: `Schema$ChartAxisViewWindowOptions`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$BasicChartDomain` {
    var domain: `Schema$ChartData`?
        get() = definedExternally
        set(value) = definedExternally
    var reversed: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$BasicChartSeries` {
    var color: `Schema$Color`?
        get() = definedExternally
        set(value) = definedExternally
    var colorStyle: `Schema$ColorStyle`?
        get() = definedExternally
        set(value) = definedExternally
    var dataLabel: `Schema$DataLabel`?
        get() = definedExternally
        set(value) = definedExternally
    var lineStyle: `Schema$LineStyle`?
        get() = definedExternally
        set(value) = definedExternally
    var pointStyle: `Schema$PointStyle`?
        get() = definedExternally
        set(value) = definedExternally
    var series: `Schema$ChartData`?
        get() = definedExternally
        set(value) = definedExternally
    var styleOverrides: Array<`Schema$BasicSeriesDataPointStyleOverride`>?
        get() = definedExternally
        set(value) = definedExternally
    var targetAxis: String?
        get() = definedExternally
        set(value) = definedExternally
    var type: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$BasicChartSpec` {
    var axis: Array<`Schema$BasicChartAxis`>?
        get() = definedExternally
        set(value) = definedExternally
    var chartType: String?
        get() = definedExternally
        set(value) = definedExternally
    var compareMode: String?
        get() = definedExternally
        set(value) = definedExternally
    var domains: Array<`Schema$BasicChartDomain`>?
        get() = definedExternally
        set(value) = definedExternally
    var headerCount: Number?
        get() = definedExternally
        set(value) = definedExternally
    var interpolateNulls: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var legendPosition: String?
        get() = definedExternally
        set(value) = definedExternally
    var lineSmoothing: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var series: Array<`Schema$BasicChartSeries`>?
        get() = definedExternally
        set(value) = definedExternally
    var stackedType: String?
        get() = definedExternally
        set(value) = definedExternally
    var threeDimensional: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var totalDataLabel: `Schema$DataLabel`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$10` {
    @nativeGetter
    operator fun get(key: String): `Schema$FilterCriteria`?
    @nativeSetter
    operator fun set(key: String, value: `Schema$FilterCriteria`)
}

external interface `Schema$BasicFilter` {
    var criteria: `T$10`?
        get() = definedExternally
        set(value) = definedExternally
    var filterSpecs: Array<`Schema$FilterSpec`>?
        get() = definedExternally
        set(value) = definedExternally
    var range: `Schema$GridRange`?
        get() = definedExternally
        set(value) = definedExternally
    var sortSpecs: Array<`Schema$SortSpec`>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$BasicSeriesDataPointStyleOverride` {
    var color: `Schema$Color`?
        get() = definedExternally
        set(value) = definedExternally
    var colorStyle: `Schema$ColorStyle`?
        get() = definedExternally
        set(value) = definedExternally
    var index: Number?
        get() = definedExternally
        set(value) = definedExternally
    var pointStyle: `Schema$PointStyle`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$BatchClearValuesByDataFilterRequest` {
    var dataFilters: Array<`Schema$DataFilter`>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$BatchClearValuesByDataFilterResponse` {
    var clearedRanges: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var spreadsheetId: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$BatchClearValuesRequest` {
    var ranges: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$BatchClearValuesResponse` {
    var clearedRanges: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var spreadsheetId: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$BatchGetValuesByDataFilterRequest` {
    var dataFilters: Array<`Schema$DataFilter`>?
        get() = definedExternally
        set(value) = definedExternally
    var dateTimeRenderOption: String?
        get() = definedExternally
        set(value) = definedExternally
    var majorDimension: String?
        get() = definedExternally
        set(value) = definedExternally
    var valueRenderOption: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$BatchGetValuesByDataFilterResponse` {
    var spreadsheetId: String?
        get() = definedExternally
        set(value) = definedExternally
    var valueRanges: Array<`Schema$MatchedValueRange`>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$BatchGetValuesResponse` {
    var spreadsheetId: String?
        get() = definedExternally
        set(value) = definedExternally
    var valueRanges: Array<`Schema$ValueRange`>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$BatchUpdateSpreadsheetRequest` {
    var includeSpreadsheetInResponse: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var requests: Array<`Schema$Request`>?
        get() = definedExternally
        set(value) = definedExternally
    var responseIncludeGridData: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var responseRanges: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$BatchUpdateSpreadsheetResponse` {
    var replies: Array<`Schema$Response`>?
        get() = definedExternally
        set(value) = definedExternally
    var spreadsheetId: String?
        get() = definedExternally
        set(value) = definedExternally
    var updatedSpreadsheet: `Schema$Spreadsheet`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$BatchUpdateValuesByDataFilterRequest` {
    var data: Array<`Schema$DataFilterValueRange`>?
        get() = definedExternally
        set(value) = definedExternally
    var includeValuesInResponse: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var responseDateTimeRenderOption: String?
        get() = definedExternally
        set(value) = definedExternally
    var responseValueRenderOption: String?
        get() = definedExternally
        set(value) = definedExternally
    var valueInputOption: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$BatchUpdateValuesByDataFilterResponse` {
    var responses: Array<`Schema$UpdateValuesByDataFilterResponse`>?
        get() = definedExternally
        set(value) = definedExternally
    var spreadsheetId: String?
        get() = definedExternally
        set(value) = definedExternally
    var totalUpdatedCells: Number?
        get() = definedExternally
        set(value) = definedExternally
    var totalUpdatedColumns: Number?
        get() = definedExternally
        set(value) = definedExternally
    var totalUpdatedRows: Number?
        get() = definedExternally
        set(value) = definedExternally
    var totalUpdatedSheets: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$BatchUpdateValuesRequest` {
    var data: Array<`Schema$ValueRange`>?
        get() = definedExternally
        set(value) = definedExternally
    var includeValuesInResponse: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var responseDateTimeRenderOption: String?
        get() = definedExternally
        set(value) = definedExternally
    var responseValueRenderOption: String?
        get() = definedExternally
        set(value) = definedExternally
    var valueInputOption: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$BatchUpdateValuesResponse` {
    var responses: Array<`Schema$UpdateValuesResponse`>?
        get() = definedExternally
        set(value) = definedExternally
    var spreadsheetId: String?
        get() = definedExternally
        set(value) = definedExternally
    var totalUpdatedCells: Number?
        get() = definedExternally
        set(value) = definedExternally
    var totalUpdatedColumns: Number?
        get() = definedExternally
        set(value) = definedExternally
    var totalUpdatedRows: Number?
        get() = definedExternally
        set(value) = definedExternally
    var totalUpdatedSheets: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$BigQueryDataSourceSpec` {
    var projectId: String?
        get() = definedExternally
        set(value) = definedExternally
    var querySpec: `Schema$BigQueryQuerySpec`?
        get() = definedExternally
        set(value) = definedExternally
    var tableSpec: `Schema$BigQueryTableSpec`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$BigQueryQuerySpec` {
    var rawQuery: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$BigQueryTableSpec` {
    var datasetId: String?
        get() = definedExternally
        set(value) = definedExternally
    var tableId: String?
        get() = definedExternally
        set(value) = definedExternally
    var tableProjectId: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$BooleanCondition` {
    var type: String?
        get() = definedExternally
        set(value) = definedExternally
    var values: Array<`Schema$ConditionValue`>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$BooleanRule` {
    var condition: `Schema$BooleanCondition`?
        get() = definedExternally
        set(value) = definedExternally
    var format: `Schema$CellFormat`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$Border` {
    var color: `Schema$Color`?
        get() = definedExternally
        set(value) = definedExternally
    var colorStyle: `Schema$ColorStyle`?
        get() = definedExternally
        set(value) = definedExternally
    var style: String?
        get() = definedExternally
        set(value) = definedExternally
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$Borders` {
    var bottom: `Schema$Border`?
        get() = definedExternally
        set(value) = definedExternally
    var left: `Schema$Border`?
        get() = definedExternally
        set(value) = definedExternally
    var right: `Schema$Border`?
        get() = definedExternally
        set(value) = definedExternally
    var top: `Schema$Border`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$BubbleChartSpec` {
    var bubbleBorderColor: `Schema$Color`?
        get() = definedExternally
        set(value) = definedExternally
    var bubbleBorderColorStyle: `Schema$ColorStyle`?
        get() = definedExternally
        set(value) = definedExternally
    var bubbleLabels: `Schema$ChartData`?
        get() = definedExternally
        set(value) = definedExternally
    var bubbleMaxRadiusSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var bubbleMinRadiusSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var bubbleOpacity: Number?
        get() = definedExternally
        set(value) = definedExternally
    var bubbleSizes: `Schema$ChartData`?
        get() = definedExternally
        set(value) = definedExternally
    var bubbleTextStyle: `Schema$TextFormat`?
        get() = definedExternally
        set(value) = definedExternally
    var domain: `Schema$ChartData`?
        get() = definedExternally
        set(value) = definedExternally
    var groupIds: `Schema$ChartData`?
        get() = definedExternally
        set(value) = definedExternally
    var legendPosition: String?
        get() = definedExternally
        set(value) = definedExternally
    var series: `Schema$ChartData`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$CandlestickChartSpec` {
    var data: Array<`Schema$CandlestickData`>?
        get() = definedExternally
        set(value) = definedExternally
    var domain: `Schema$CandlestickDomain`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$CandlestickData` {
    var closeSeries: `Schema$CandlestickSeries`?
        get() = definedExternally
        set(value) = definedExternally
    var highSeries: `Schema$CandlestickSeries`?
        get() = definedExternally
        set(value) = definedExternally
    var lowSeries: `Schema$CandlestickSeries`?
        get() = definedExternally
        set(value) = definedExternally
    var openSeries: `Schema$CandlestickSeries`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$CandlestickDomain` {
    var data: `Schema$ChartData`?
        get() = definedExternally
        set(value) = definedExternally
    var reversed: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$CandlestickSeries` {
    var data: `Schema$ChartData`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$CellData` {
    var dataSourceFormula: `Schema$DataSourceFormula`?
        get() = definedExternally
        set(value) = definedExternally
    var dataSourceTable: `Schema$DataSourceTable`?
        get() = definedExternally
        set(value) = definedExternally
    var dataValidation: `Schema$DataValidationRule`?
        get() = definedExternally
        set(value) = definedExternally
    var effectiveFormat: `Schema$CellFormat`?
        get() = definedExternally
        set(value) = definedExternally
    var effectiveValue: `Schema$ExtendedValue`?
        get() = definedExternally
        set(value) = definedExternally
    var formattedValue: String?
        get() = definedExternally
        set(value) = definedExternally
    var hyperlink: String?
        get() = definedExternally
        set(value) = definedExternally
    var note: String?
        get() = definedExternally
        set(value) = definedExternally
    var pivotTable: `Schema$PivotTable`?
        get() = definedExternally
        set(value) = definedExternally
    var textFormatRuns: Array<`Schema$TextFormatRun`>?
        get() = definedExternally
        set(value) = definedExternally
    var userEnteredFormat: `Schema$CellFormat`?
        get() = definedExternally
        set(value) = definedExternally
    var userEnteredValue: `Schema$ExtendedValue`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$CellFormat` {
    var backgroundColor: `Schema$Color`?
        get() = definedExternally
        set(value) = definedExternally
    var backgroundColorStyle: `Schema$ColorStyle`?
        get() = definedExternally
        set(value) = definedExternally
    var borders: `Schema$Borders`?
        get() = definedExternally
        set(value) = definedExternally
    var horizontalAlignment: String?
        get() = definedExternally
        set(value) = definedExternally
    var hyperlinkDisplayType: String?
        get() = definedExternally
        set(value) = definedExternally
    var numberFormat: `Schema$NumberFormat`?
        get() = definedExternally
        set(value) = definedExternally
    var padding: `Schema$Padding`?
        get() = definedExternally
        set(value) = definedExternally
    var textDirection: String?
        get() = definedExternally
        set(value) = definedExternally
    var textFormat: `Schema$TextFormat`?
        get() = definedExternally
        set(value) = definedExternally
    var textRotation: `Schema$TextRotation`?
        get() = definedExternally
        set(value) = definedExternally
    var verticalAlignment: String?
        get() = definedExternally
        set(value) = definedExternally
    var wrapStrategy: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$ChartAxisViewWindowOptions` {
    var viewWindowMax: Number?
        get() = definedExternally
        set(value) = definedExternally
    var viewWindowMin: Number?
        get() = definedExternally
        set(value) = definedExternally
    var viewWindowMode: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$ChartCustomNumberFormatOptions` {
    var prefix: String?
        get() = definedExternally
        set(value) = definedExternally
    var suffix: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$ChartData` {
    var aggregateType: String?
        get() = definedExternally
        set(value) = definedExternally
    var columnReference: `Schema$DataSourceColumnReference`?
        get() = definedExternally
        set(value) = definedExternally
    var groupRule: `Schema$ChartGroupRule`?
        get() = definedExternally
        set(value) = definedExternally
    var sourceRange: `Schema$ChartSourceRange`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$ChartDateTimeRule` {
    var type: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$ChartGroupRule` {
    var dateTimeRule: `Schema$ChartDateTimeRule`?
        get() = definedExternally
        set(value) = definedExternally
    var histogramRule: `Schema$ChartHistogramRule`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$ChartHistogramRule` {
    var intervalSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var maxValue: Number?
        get() = definedExternally
        set(value) = definedExternally
    var minValue: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$ChartSourceRange` {
    var sources: Array<`Schema$GridRange`>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$ChartSpec` {
    var altText: String?
        get() = definedExternally
        set(value) = definedExternally
    var backgroundColor: `Schema$Color`?
        get() = definedExternally
        set(value) = definedExternally
    var backgroundColorStyle: `Schema$ColorStyle`?
        get() = definedExternally
        set(value) = definedExternally
    var basicChart: `Schema$BasicChartSpec`?
        get() = definedExternally
        set(value) = definedExternally
    var bubbleChart: `Schema$BubbleChartSpec`?
        get() = definedExternally
        set(value) = definedExternally
    var candlestickChart: `Schema$CandlestickChartSpec`?
        get() = definedExternally
        set(value) = definedExternally
    var dataSourceChartProperties: `Schema$DataSourceChartProperties`?
        get() = definedExternally
        set(value) = definedExternally
    var filterSpecs: Array<`Schema$FilterSpec`>?
        get() = definedExternally
        set(value) = definedExternally
    var fontName: String?
        get() = definedExternally
        set(value) = definedExternally
    var hiddenDimensionStrategy: String?
        get() = definedExternally
        set(value) = definedExternally
    var histogramChart: `Schema$HistogramChartSpec`?
        get() = definedExternally
        set(value) = definedExternally
    var maximized: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var orgChart: `Schema$OrgChartSpec`?
        get() = definedExternally
        set(value) = definedExternally
    var pieChart: `Schema$PieChartSpec`?
        get() = definedExternally
        set(value) = definedExternally
    var scorecardChart: `Schema$ScorecardChartSpec`?
        get() = definedExternally
        set(value) = definedExternally
    var sortSpecs: Array<`Schema$SortSpec`>?
        get() = definedExternally
        set(value) = definedExternally
    var subtitle: String?
        get() = definedExternally
        set(value) = definedExternally
    var subtitleTextFormat: `Schema$TextFormat`?
        get() = definedExternally
        set(value) = definedExternally
    var subtitleTextPosition: `Schema$TextPosition`?
        get() = definedExternally
        set(value) = definedExternally
    var title: String?
        get() = definedExternally
        set(value) = definedExternally
    var titleTextFormat: `Schema$TextFormat`?
        get() = definedExternally
        set(value) = definedExternally
    var titleTextPosition: `Schema$TextPosition`?
        get() = definedExternally
        set(value) = definedExternally
    var treemapChart: `Schema$TreemapChartSpec`?
        get() = definedExternally
        set(value) = definedExternally
    var waterfallChart: `Schema$WaterfallChartSpec`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$ClearBasicFilterRequest` {
    var sheetId: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$ClearValuesRequest`

external interface `Schema$ClearValuesResponse` {
    var clearedRange: String?
        get() = definedExternally
        set(value) = definedExternally
    var spreadsheetId: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$Color` {
    var alpha: Number?
        get() = definedExternally
        set(value) = definedExternally
    var blue: Number?
        get() = definedExternally
        set(value) = definedExternally
    var green: Number?
        get() = definedExternally
        set(value) = definedExternally
    var red: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$ColorStyle` {
    var rgbColor: `Schema$Color`?
        get() = definedExternally
        set(value) = definedExternally
    var themeColor: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$ConditionalFormatRule` {
    var booleanRule: `Schema$BooleanRule`?
        get() = definedExternally
        set(value) = definedExternally
    var gradientRule: `Schema$GradientRule`?
        get() = definedExternally
        set(value) = definedExternally
    var ranges: Array<`Schema$GridRange`>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$ConditionValue` {
    var relativeDate: String?
        get() = definedExternally
        set(value) = definedExternally
    var userEnteredValue: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$CopyPasteRequest` {
    var destination: `Schema$GridRange`?
        get() = definedExternally
        set(value) = definedExternally
    var pasteOrientation: String?
        get() = definedExternally
        set(value) = definedExternally
    var pasteType: String?
        get() = definedExternally
        set(value) = definedExternally
    var source: `Schema$GridRange`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$CopySheetToAnotherSpreadsheetRequest` {
    var destinationSpreadsheetId: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$CreateDeveloperMetadataRequest` {
    var developerMetadata: `Schema$DeveloperMetadata`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$CreateDeveloperMetadataResponse` {
    var developerMetadata: `Schema$DeveloperMetadata`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$CutPasteRequest` {
    var destination: `Schema$GridCoordinate`?
        get() = definedExternally
        set(value) = definedExternally
    var pasteType: String?
        get() = definedExternally
        set(value) = definedExternally
    var source: `Schema$GridRange`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$DataExecutionStatus` {
    var errorCode: String?
        get() = definedExternally
        set(value) = definedExternally
    var errorMessage: String?
        get() = definedExternally
        set(value) = definedExternally
    var lastRefreshTime: String?
        get() = definedExternally
        set(value) = definedExternally
    var state: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$DataFilter` {
    var a1Range: String?
        get() = definedExternally
        set(value) = definedExternally
    var developerMetadataLookup: `Schema$DeveloperMetadataLookup`?
        get() = definedExternally
        set(value) = definedExternally
    var gridRange: `Schema$GridRange`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$DataFilterValueRange` {
    var dataFilter: `Schema$DataFilter`?
        get() = definedExternally
        set(value) = definedExternally
    var majorDimension: String?
        get() = definedExternally
        set(value) = definedExternally
    var values: Array<Array<Any>>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$DataLabel` {
    var customLabelData: `Schema$ChartData`?
        get() = definedExternally
        set(value) = definedExternally
    var placement: String?
        get() = definedExternally
        set(value) = definedExternally
    var textFormat: `Schema$TextFormat`?
        get() = definedExternally
        set(value) = definedExternally
    var type: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$DataSource` {
    var calculatedColumns: Array<`Schema$DataSourceColumn`>?
        get() = definedExternally
        set(value) = definedExternally
    var dataSourceId: String?
        get() = definedExternally
        set(value) = definedExternally
    var sheetId: Number?
        get() = definedExternally
        set(value) = definedExternally
    var spec: `Schema$DataSourceSpec`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$DataSourceChartProperties` {
    var dataExecutionStatus: `Schema$DataExecutionStatus`?
        get() = definedExternally
        set(value) = definedExternally
    var dataSourceId: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$DataSourceColumn` {
    var formula: String?
        get() = definedExternally
        set(value) = definedExternally
    var reference: `Schema$DataSourceColumnReference`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$DataSourceColumnReference` {
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$DataSourceFormula` {
    var dataExecutionStatus: `Schema$DataExecutionStatus`?
        get() = definedExternally
        set(value) = definedExternally
    var dataSourceId: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$DataSourceObjectReference` {
    var chartId: Number?
        get() = definedExternally
        set(value) = definedExternally
    var dataSourceFormulaCell: `Schema$GridCoordinate`?
        get() = definedExternally
        set(value) = definedExternally
    var dataSourcePivotTableAnchorCell: `Schema$GridCoordinate`?
        get() = definedExternally
        set(value) = definedExternally
    var dataSourceTableAnchorCell: `Schema$GridCoordinate`?
        get() = definedExternally
        set(value) = definedExternally
    var sheetId: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$DataSourceObjectReferences` {
    var references: Array<`Schema$DataSourceObjectReference`>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$DataSourceParameter` {
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var namedRangeId: String?
        get() = definedExternally
        set(value) = definedExternally
    var range: `Schema$GridRange`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$DataSourceRefreshDailySchedule` {
    var startTime: `Schema$TimeOfDay`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$DataSourceRefreshMonthlySchedule` {
    var daysOfMonth: Array<Number>?
        get() = definedExternally
        set(value) = definedExternally
    var startTime: `Schema$TimeOfDay`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$DataSourceRefreshSchedule` {
    var dailySchedule: `Schema$DataSourceRefreshDailySchedule`?
        get() = definedExternally
        set(value) = definedExternally
    var enabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var monthlySchedule: `Schema$DataSourceRefreshMonthlySchedule`?
        get() = definedExternally
        set(value) = definedExternally
    var nextRun: `Schema$Interval`?
        get() = definedExternally
        set(value) = definedExternally
    var refreshScope: String?
        get() = definedExternally
        set(value) = definedExternally
    var weeklySchedule: `Schema$DataSourceRefreshWeeklySchedule`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$DataSourceRefreshWeeklySchedule` {
    var daysOfWeek: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var startTime: `Schema$TimeOfDay`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$DataSourceSheetDimensionRange` {
    var columnReferences: Array<`Schema$DataSourceColumnReference`>?
        get() = definedExternally
        set(value) = definedExternally
    var sheetId: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$DataSourceSheetProperties` {
    var columns: Array<`Schema$DataSourceColumn`>?
        get() = definedExternally
        set(value) = definedExternally
    var dataExecutionStatus: `Schema$DataExecutionStatus`?
        get() = definedExternally
        set(value) = definedExternally
    var dataSourceId: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$DataSourceSpec` {
    var bigQuery: `Schema$BigQueryDataSourceSpec`?
        get() = definedExternally
        set(value) = definedExternally
    var parameters: Array<`Schema$DataSourceParameter`>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$DataSourceTable` {
    var columns: Array<`Schema$DataSourceColumnReference`>?
        get() = definedExternally
        set(value) = definedExternally
    var columnSelectionType: String?
        get() = definedExternally
        set(value) = definedExternally
    var dataExecutionStatus: `Schema$DataExecutionStatus`?
        get() = definedExternally
        set(value) = definedExternally
    var dataSourceId: String?
        get() = definedExternally
        set(value) = definedExternally
    var filterSpecs: Array<`Schema$FilterSpec`>?
        get() = definedExternally
        set(value) = definedExternally
    var rowLimit: Number?
        get() = definedExternally
        set(value) = definedExternally
    var sortSpecs: Array<`Schema$SortSpec`>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$DataValidationRule` {
    var condition: `Schema$BooleanCondition`?
        get() = definedExternally
        set(value) = definedExternally
    var inputMessage: String?
        get() = definedExternally
        set(value) = definedExternally
    var showCustomUi: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var strict: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$DateTimeRule` {
    var type: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$DeleteBandingRequest` {
    var bandedRangeId: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$DeleteConditionalFormatRuleRequest` {
    var index: Number?
        get() = definedExternally
        set(value) = definedExternally
    var sheetId: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$DeleteConditionalFormatRuleResponse` {
    var rule: `Schema$ConditionalFormatRule`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$DeleteDataSourceRequest` {
    var dataSourceId: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$DeleteDeveloperMetadataRequest` {
    var dataFilter: `Schema$DataFilter`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$DeleteDeveloperMetadataResponse` {
    var deletedDeveloperMetadata: Array<`Schema$DeveloperMetadata`>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$DeleteDimensionGroupRequest` {
    var range: `Schema$DimensionRange`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$DeleteDimensionGroupResponse` {
    var dimensionGroups: Array<`Schema$DimensionGroup`>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$DeleteDimensionRequest` {
    var range: `Schema$DimensionRange`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$DeleteDuplicatesRequest` {
    var comparisonColumns: Array<`Schema$DimensionRange`>?
        get() = definedExternally
        set(value) = definedExternally
    var range: `Schema$GridRange`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$DeleteDuplicatesResponse` {
    var duplicatesRemovedCount: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$DeleteEmbeddedObjectRequest` {
    var objectId: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$DeleteFilterViewRequest` {
    var filterId: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$DeleteNamedRangeRequest` {
    var namedRangeId: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$DeleteProtectedRangeRequest` {
    var protectedRangeId: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$DeleteRangeRequest` {
    var range: `Schema$GridRange`?
        get() = definedExternally
        set(value) = definedExternally
    var shiftDimension: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$DeleteSheetRequest` {
    var sheetId: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$DeveloperMetadata` {
    var location: `Schema$DeveloperMetadataLocation`?
        get() = definedExternally
        set(value) = definedExternally
    var metadataId: Number?
        get() = definedExternally
        set(value) = definedExternally
    var metadataKey: String?
        get() = definedExternally
        set(value) = definedExternally
    var metadataValue: String?
        get() = definedExternally
        set(value) = definedExternally
    var visibility: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$DeveloperMetadataLocation` {
    var dimensionRange: `Schema$DimensionRange`?
        get() = definedExternally
        set(value) = definedExternally
    var locationType: String?
        get() = definedExternally
        set(value) = definedExternally
    var sheetId: Number?
        get() = definedExternally
        set(value) = definedExternally
    var spreadsheet: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$DeveloperMetadataLookup` {
    var locationMatchingStrategy: String?
        get() = definedExternally
        set(value) = definedExternally
    var locationType: String?
        get() = definedExternally
        set(value) = definedExternally
    var metadataId: Number?
        get() = definedExternally
        set(value) = definedExternally
    var metadataKey: String?
        get() = definedExternally
        set(value) = definedExternally
    var metadataLocation: `Schema$DeveloperMetadataLocation`?
        get() = definedExternally
        set(value) = definedExternally
    var metadataValue: String?
        get() = definedExternally
        set(value) = definedExternally
    var visibility: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$DimensionGroup` {
    var collapsed: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var depth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var range: `Schema$DimensionRange`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$DimensionProperties` {
    var dataSourceColumnReference: `Schema$DataSourceColumnReference`?
        get() = definedExternally
        set(value) = definedExternally
    var developerMetadata: Array<`Schema$DeveloperMetadata`>?
        get() = definedExternally
        set(value) = definedExternally
    var hiddenByFilter: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var hiddenByUser: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var pixelSize: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$DimensionRange` {
    var dimension: String?
        get() = definedExternally
        set(value) = definedExternally
    var endIndex: Number?
        get() = definedExternally
        set(value) = definedExternally
    var sheetId: Number?
        get() = definedExternally
        set(value) = definedExternally
    var startIndex: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$DuplicateFilterViewRequest` {
    var filterId: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$DuplicateFilterViewResponse` {
    var filter: `Schema$FilterView`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$DuplicateSheetRequest` {
    var insertSheetIndex: Number?
        get() = definedExternally
        set(value) = definedExternally
    var newSheetId: Number?
        get() = definedExternally
        set(value) = definedExternally
    var newSheetName: String?
        get() = definedExternally
        set(value) = definedExternally
    var sourceSheetId: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$DuplicateSheetResponse` {
    var properties: `Schema$SheetProperties`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$Editors` {
    var domainUsersCanEdit: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var groups: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var users: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$EmbeddedChart` {
    var border: `Schema$EmbeddedObjectBorder`?
        get() = definedExternally
        set(value) = definedExternally
    var chartId: Number?
        get() = definedExternally
        set(value) = definedExternally
    var position: `Schema$EmbeddedObjectPosition`?
        get() = definedExternally
        set(value) = definedExternally
    var spec: `Schema$ChartSpec`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$EmbeddedObjectBorder` {
    var color: `Schema$Color`?
        get() = definedExternally
        set(value) = definedExternally
    var colorStyle: `Schema$ColorStyle`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$EmbeddedObjectPosition` {
    var newSheet: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var overlayPosition: `Schema$OverlayPosition`?
        get() = definedExternally
        set(value) = definedExternally
    var sheetId: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$ErrorValue` {
    var message: String?
        get() = definedExternally
        set(value) = definedExternally
    var type: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$ExtendedValue` {
    var boolValue: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var errorValue: `Schema$ErrorValue`?
        get() = definedExternally
        set(value) = definedExternally
    var formulaValue: String?
        get() = definedExternally
        set(value) = definedExternally
    var numberValue: Number?
        get() = definedExternally
        set(value) = definedExternally
    var stringValue: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$FilterCriteria` {
    var condition: `Schema$BooleanCondition`?
        get() = definedExternally
        set(value) = definedExternally
    var hiddenValues: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var visibleBackgroundColor: `Schema$Color`?
        get() = definedExternally
        set(value) = definedExternally
    var visibleBackgroundColorStyle: `Schema$ColorStyle`?
        get() = definedExternally
        set(value) = definedExternally
    var visibleForegroundColor: `Schema$Color`?
        get() = definedExternally
        set(value) = definedExternally
    var visibleForegroundColorStyle: `Schema$ColorStyle`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$FilterSpec` {
    var columnIndex: Number?
        get() = definedExternally
        set(value) = definedExternally
    var dataSourceColumnReference: `Schema$DataSourceColumnReference`?
        get() = definedExternally
        set(value) = definedExternally
    var filterCriteria: `Schema$FilterCriteria`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$FilterView` {
    var criteria: `T$10`?
        get() = definedExternally
        set(value) = definedExternally
    var filterSpecs: Array<`Schema$FilterSpec`>?
        get() = definedExternally
        set(value) = definedExternally
    var filterViewId: Number?
        get() = definedExternally
        set(value) = definedExternally
    var namedRangeId: String?
        get() = definedExternally
        set(value) = definedExternally
    var range: `Schema$GridRange`?
        get() = definedExternally
        set(value) = definedExternally
    var sortSpecs: Array<`Schema$SortSpec`>?
        get() = definedExternally
        set(value) = definedExternally
    var title: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$FindReplaceRequest` {
    var allSheets: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var find: String?
        get() = definedExternally
        set(value) = definedExternally
    var includeFormulas: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var matchCase: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var matchEntireCell: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var range: `Schema$GridRange`?
        get() = definedExternally
        set(value) = definedExternally
    var replacement: String?
        get() = definedExternally
        set(value) = definedExternally
    var searchByRegex: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var sheetId: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$FindReplaceResponse` {
    var formulasChanged: Number?
        get() = definedExternally
        set(value) = definedExternally
    var occurrencesChanged: Number?
        get() = definedExternally
        set(value) = definedExternally
    var rowsChanged: Number?
        get() = definedExternally
        set(value) = definedExternally
    var sheetsChanged: Number?
        get() = definedExternally
        set(value) = definedExternally
    var valuesChanged: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$GetSpreadsheetByDataFilterRequest` {
    var dataFilters: Array<`Schema$DataFilter`>?
        get() = definedExternally
        set(value) = definedExternally
    var includeGridData: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$GradientRule` {
    var maxpoint: `Schema$InterpolationPoint`?
        get() = definedExternally
        set(value) = definedExternally
    var midpoint: `Schema$InterpolationPoint`?
        get() = definedExternally
        set(value) = definedExternally
    var minpoint: `Schema$InterpolationPoint`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$GridCoordinate` {
    var columnIndex: Number?
        get() = definedExternally
        set(value) = definedExternally
    var rowIndex: Number?
        get() = definedExternally
        set(value) = definedExternally
    var sheetId: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$GridData` {
    var columnMetadata: Array<`Schema$DimensionProperties`>?
        get() = definedExternally
        set(value) = definedExternally
    var rowData: Array<`Schema$RowData`>?
        get() = definedExternally
        set(value) = definedExternally
    var rowMetadata: Array<`Schema$DimensionProperties`>?
        get() = definedExternally
        set(value) = definedExternally
    var startColumn: Number?
        get() = definedExternally
        set(value) = definedExternally
    var startRow: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$GridProperties` {
    var columnCount: Number?
        get() = definedExternally
        set(value) = definedExternally
    var columnGroupControlAfter: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var frozenColumnCount: Number?
        get() = definedExternally
        set(value) = definedExternally
    var frozenRowCount: Number?
        get() = definedExternally
        set(value) = definedExternally
    var hideGridlines: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var rowCount: Number?
        get() = definedExternally
        set(value) = definedExternally
    var rowGroupControlAfter: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$GridRange` {
    var endColumnIndex: Number?
        get() = definedExternally
        set(value) = definedExternally
    var endRowIndex: Number?
        get() = definedExternally
        set(value) = definedExternally
    var sheetId: Number?
        get() = definedExternally
        set(value) = definedExternally
    var startColumnIndex: Number?
        get() = definedExternally
        set(value) = definedExternally
    var startRowIndex: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$HistogramChartSpec` {
    var bucketSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var legendPosition: String?
        get() = definedExternally
        set(value) = definedExternally
    var outlierPercentile: Number?
        get() = definedExternally
        set(value) = definedExternally
    var series: Array<`Schema$HistogramSeries`>?
        get() = definedExternally
        set(value) = definedExternally
    var showItemDividers: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$HistogramRule` {
    var end: Number?
        get() = definedExternally
        set(value) = definedExternally
    var interval: Number?
        get() = definedExternally
        set(value) = definedExternally
    var start: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$HistogramSeries` {
    var barColor: `Schema$Color`?
        get() = definedExternally
        set(value) = definedExternally
    var barColorStyle: `Schema$ColorStyle`?
        get() = definedExternally
        set(value) = definedExternally
    var data: `Schema$ChartData`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$InsertDimensionRequest` {
    var inheritFromBefore: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var range: `Schema$DimensionRange`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$InsertRangeRequest` {
    var range: `Schema$GridRange`?
        get() = definedExternally
        set(value) = definedExternally
    var shiftDimension: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$InterpolationPoint` {
    var color: `Schema$Color`?
        get() = definedExternally
        set(value) = definedExternally
    var colorStyle: `Schema$ColorStyle`?
        get() = definedExternally
        set(value) = definedExternally
    var type: String?
        get() = definedExternally
        set(value) = definedExternally
    var value: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$Interval` {
    var endTime: String?
        get() = definedExternally
        set(value) = definedExternally
    var startTime: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$IterativeCalculationSettings` {
    var convergenceThreshold: Number?
        get() = definedExternally
        set(value) = definedExternally
    var maxIterations: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$KeyValueFormat` {
    var position: `Schema$TextPosition`?
        get() = definedExternally
        set(value) = definedExternally
    var textFormat: `Schema$TextFormat`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$LineStyle` {
    var type: String?
        get() = definedExternally
        set(value) = definedExternally
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$Link` {
    var uri: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$ManualRule` {
    var groups: Array<`Schema$ManualRuleGroup`>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$ManualRuleGroup` {
    var groupName: `Schema$ExtendedValue`?
        get() = definedExternally
        set(value) = definedExternally
    var items: Array<`Schema$ExtendedValue`>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$MatchedDeveloperMetadata` {
    var dataFilters: Array<`Schema$DataFilter`>?
        get() = definedExternally
        set(value) = definedExternally
    var developerMetadata: `Schema$DeveloperMetadata`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$MatchedValueRange` {
    var dataFilters: Array<`Schema$DataFilter`>?
        get() = definedExternally
        set(value) = definedExternally
    var valueRange: `Schema$ValueRange`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$MergeCellsRequest` {
    var mergeType: String?
        get() = definedExternally
        set(value) = definedExternally
    var range: `Schema$GridRange`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$MoveDimensionRequest` {
    var destinationIndex: Number?
        get() = definedExternally
        set(value) = definedExternally
    var source: `Schema$DimensionRange`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$NamedRange` {
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var namedRangeId: String?
        get() = definedExternally
        set(value) = definedExternally
    var range: `Schema$GridRange`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$NumberFormat` {
    var pattern: String?
        get() = definedExternally
        set(value) = definedExternally
    var type: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$OrgChartSpec` {
    var labels: `Schema$ChartData`?
        get() = definedExternally
        set(value) = definedExternally
    var nodeColor: `Schema$Color`?
        get() = definedExternally
        set(value) = definedExternally
    var nodeColorStyle: `Schema$ColorStyle`?
        get() = definedExternally
        set(value) = definedExternally
    var nodeSize: String?
        get() = definedExternally
        set(value) = definedExternally
    var parentLabels: `Schema$ChartData`?
        get() = definedExternally
        set(value) = definedExternally
    var selectedNodeColor: `Schema$Color`?
        get() = definedExternally
        set(value) = definedExternally
    var selectedNodeColorStyle: `Schema$ColorStyle`?
        get() = definedExternally
        set(value) = definedExternally
    var tooltips: `Schema$ChartData`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$OverlayPosition` {
    var anchorCell: `Schema$GridCoordinate`?
        get() = definedExternally
        set(value) = definedExternally
    var heightPixels: Number?
        get() = definedExternally
        set(value) = definedExternally
    var offsetXPixels: Number?
        get() = definedExternally
        set(value) = definedExternally
    var offsetYPixels: Number?
        get() = definedExternally
        set(value) = definedExternally
    var widthPixels: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$Padding` {
    var bottom: Number?
        get() = definedExternally
        set(value) = definedExternally
    var left: Number?
        get() = definedExternally
        set(value) = definedExternally
    var right: Number?
        get() = definedExternally
        set(value) = definedExternally
    var top: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$PasteDataRequest` {
    var coordinate: `Schema$GridCoordinate`?
        get() = definedExternally
        set(value) = definedExternally
    var data: String?
        get() = definedExternally
        set(value) = definedExternally
    var delimiter: String?
        get() = definedExternally
        set(value) = definedExternally
    var html: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var type: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$PieChartSpec` {
    var domain: `Schema$ChartData`?
        get() = definedExternally
        set(value) = definedExternally
    var legendPosition: String?
        get() = definedExternally
        set(value) = definedExternally
    var pieHole: Number?
        get() = definedExternally
        set(value) = definedExternally
    var series: `Schema$ChartData`?
        get() = definedExternally
        set(value) = definedExternally
    var threeDimensional: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$PivotFilterCriteria` {
    var condition: `Schema$BooleanCondition`?
        get() = definedExternally
        set(value) = definedExternally
    var visibleByDefault: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var visibleValues: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$PivotFilterSpec` {
    var columnOffsetIndex: Number?
        get() = definedExternally
        set(value) = definedExternally
    var dataSourceColumnReference: `Schema$DataSourceColumnReference`?
        get() = definedExternally
        set(value) = definedExternally
    var filterCriteria: `Schema$PivotFilterCriteria`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$PivotGroup` {
    var dataSourceColumnReference: `Schema$DataSourceColumnReference`?
        get() = definedExternally
        set(value) = definedExternally
    var groupLimit: `Schema$PivotGroupLimit`?
        get() = definedExternally
        set(value) = definedExternally
    var groupRule: `Schema$PivotGroupRule`?
        get() = definedExternally
        set(value) = definedExternally
    var label: String?
        get() = definedExternally
        set(value) = definedExternally
    var repeatHeadings: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var showTotals: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var sortOrder: String?
        get() = definedExternally
        set(value) = definedExternally
    var sourceColumnOffset: Number?
        get() = definedExternally
        set(value) = definedExternally
    var valueBucket: `Schema$PivotGroupSortValueBucket`?
        get() = definedExternally
        set(value) = definedExternally
    var valueMetadata: Array<`Schema$PivotGroupValueMetadata`>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$PivotGroupLimit` {
    var applyOrder: Number?
        get() = definedExternally
        set(value) = definedExternally
    var countLimit: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$PivotGroupRule` {
    var dateTimeRule: `Schema$DateTimeRule`?
        get() = definedExternally
        set(value) = definedExternally
    var histogramRule: `Schema$HistogramRule`?
        get() = definedExternally
        set(value) = definedExternally
    var manualRule: `Schema$ManualRule`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$PivotGroupSortValueBucket` {
    var buckets: Array<`Schema$ExtendedValue`>?
        get() = definedExternally
        set(value) = definedExternally
    var valuesIndex: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$PivotGroupValueMetadata` {
    var collapsed: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var value: `Schema$ExtendedValue`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$11` {
    @nativeGetter
    operator fun get(key: String): `Schema$PivotFilterCriteria`?
    @nativeSetter
    operator fun set(key: String, value: `Schema$PivotFilterCriteria`)
}

external interface `Schema$PivotTable` {
    var columns: Array<`Schema$PivotGroup`>?
        get() = definedExternally
        set(value) = definedExternally
    var criteria: `T$11`?
        get() = definedExternally
        set(value) = definedExternally
    var dataExecutionStatus: `Schema$DataExecutionStatus`?
        get() = definedExternally
        set(value) = definedExternally
    var dataSourceId: String?
        get() = definedExternally
        set(value) = definedExternally
    var filterSpecs: Array<`Schema$PivotFilterSpec`>?
        get() = definedExternally
        set(value) = definedExternally
    var rows: Array<`Schema$PivotGroup`>?
        get() = definedExternally
        set(value) = definedExternally
    var source: `Schema$GridRange`?
        get() = definedExternally
        set(value) = definedExternally
    var valueLayout: String?
        get() = definedExternally
        set(value) = definedExternally
    var values: Array<`Schema$PivotValue`>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$PivotValue` {
    var calculatedDisplayType: String?
        get() = definedExternally
        set(value) = definedExternally
    var dataSourceColumnReference: `Schema$DataSourceColumnReference`?
        get() = definedExternally
        set(value) = definedExternally
    var formula: String?
        get() = definedExternally
        set(value) = definedExternally
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var sourceColumnOffset: Number?
        get() = definedExternally
        set(value) = definedExternally
    var summarizeFunction: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$PointStyle` {
    var shape: String?
        get() = definedExternally
        set(value) = definedExternally
    var size: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$ProtectedRange` {
    var description: String?
        get() = definedExternally
        set(value) = definedExternally
    var editors: `Schema$Editors`?
        get() = definedExternally
        set(value) = definedExternally
    var namedRangeId: String?
        get() = definedExternally
        set(value) = definedExternally
    var protectedRangeId: Number?
        get() = definedExternally
        set(value) = definedExternally
    var range: `Schema$GridRange`?
        get() = definedExternally
        set(value) = definedExternally
    var requestingUserCanEdit: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var unprotectedRanges: Array<`Schema$GridRange`>?
        get() = definedExternally
        set(value) = definedExternally
    var warningOnly: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$RandomizeRangeRequest` {
    var range: `Schema$GridRange`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$RefreshDataSourceObjectExecutionStatus` {
    var dataExecutionStatus: `Schema$DataExecutionStatus`?
        get() = definedExternally
        set(value) = definedExternally
    var reference: `Schema$DataSourceObjectReference`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$RefreshDataSourceRequest` {
    var dataSourceId: String?
        get() = definedExternally
        set(value) = definedExternally
    var force: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var isAll: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var references: `Schema$DataSourceObjectReferences`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$RefreshDataSourceResponse` {
    var statuses: Array<`Schema$RefreshDataSourceObjectExecutionStatus`>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$RepeatCellRequest` {
    var cell: `Schema$CellData`?
        get() = definedExternally
        set(value) = definedExternally
    var fields: String?
        get() = definedExternally
        set(value) = definedExternally
    var range: `Schema$GridRange`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$Request` {
    var addBanding: `Schema$AddBandingRequest`?
        get() = definedExternally
        set(value) = definedExternally
    var addChart: `Schema$AddChartRequest`?
        get() = definedExternally
        set(value) = definedExternally
    var addConditionalFormatRule: `Schema$AddConditionalFormatRuleRequest`?
        get() = definedExternally
        set(value) = definedExternally
    var addDataSource: `Schema$AddDataSourceRequest`?
        get() = definedExternally
        set(value) = definedExternally
    var addDimensionGroup: `Schema$AddDimensionGroupRequest`?
        get() = definedExternally
        set(value) = definedExternally
    var addFilterView: `Schema$AddFilterViewRequest`?
        get() = definedExternally
        set(value) = definedExternally
    var addNamedRange: `Schema$AddNamedRangeRequest`?
        get() = definedExternally
        set(value) = definedExternally
    var addProtectedRange: `Schema$AddProtectedRangeRequest`?
        get() = definedExternally
        set(value) = definedExternally
    var addSheet: `Schema$AddSheetRequest`?
        get() = definedExternally
        set(value) = definedExternally
    var addSlicer: `Schema$AddSlicerRequest`?
        get() = definedExternally
        set(value) = definedExternally
    var appendCells: `Schema$AppendCellsRequest`?
        get() = definedExternally
        set(value) = definedExternally
    var appendDimension: `Schema$AppendDimensionRequest`?
        get() = definedExternally
        set(value) = definedExternally
    var autoFill: `Schema$AutoFillRequest`?
        get() = definedExternally
        set(value) = definedExternally
    var autoResizeDimensions: `Schema$AutoResizeDimensionsRequest`?
        get() = definedExternally
        set(value) = definedExternally
    var clearBasicFilter: `Schema$ClearBasicFilterRequest`?
        get() = definedExternally
        set(value) = definedExternally
    var copyPaste: `Schema$CopyPasteRequest`?
        get() = definedExternally
        set(value) = definedExternally
    var createDeveloperMetadata: `Schema$CreateDeveloperMetadataRequest`?
        get() = definedExternally
        set(value) = definedExternally
    var cutPaste: `Schema$CutPasteRequest`?
        get() = definedExternally
        set(value) = definedExternally
    var deleteBanding: `Schema$DeleteBandingRequest`?
        get() = definedExternally
        set(value) = definedExternally
    var deleteConditionalFormatRule: `Schema$DeleteConditionalFormatRuleRequest`?
        get() = definedExternally
        set(value) = definedExternally
    var deleteDataSource: `Schema$DeleteDataSourceRequest`?
        get() = definedExternally
        set(value) = definedExternally
    var deleteDeveloperMetadata: `Schema$DeleteDeveloperMetadataRequest`?
        get() = definedExternally
        set(value) = definedExternally
    var deleteDimension: `Schema$DeleteDimensionRequest`?
        get() = definedExternally
        set(value) = definedExternally
    var deleteDimensionGroup: `Schema$DeleteDimensionGroupRequest`?
        get() = definedExternally
        set(value) = definedExternally
    var deleteDuplicates: `Schema$DeleteDuplicatesRequest`?
        get() = definedExternally
        set(value) = definedExternally
    var deleteEmbeddedObject: `Schema$DeleteEmbeddedObjectRequest`?
        get() = definedExternally
        set(value) = definedExternally
    var deleteFilterView: `Schema$DeleteFilterViewRequest`?
        get() = definedExternally
        set(value) = definedExternally
    var deleteNamedRange: `Schema$DeleteNamedRangeRequest`?
        get() = definedExternally
        set(value) = definedExternally
    var deleteProtectedRange: `Schema$DeleteProtectedRangeRequest`?
        get() = definedExternally
        set(value) = definedExternally
    var deleteRange: `Schema$DeleteRangeRequest`?
        get() = definedExternally
        set(value) = definedExternally
    var deleteSheet: `Schema$DeleteSheetRequest`?
        get() = definedExternally
        set(value) = definedExternally
    var duplicateFilterView: `Schema$DuplicateFilterViewRequest`?
        get() = definedExternally
        set(value) = definedExternally
    var duplicateSheet: `Schema$DuplicateSheetRequest`?
        get() = definedExternally
        set(value) = definedExternally
    var findReplace: `Schema$FindReplaceRequest`?
        get() = definedExternally
        set(value) = definedExternally
    var insertDimension: `Schema$InsertDimensionRequest`?
        get() = definedExternally
        set(value) = definedExternally
    var insertRange: `Schema$InsertRangeRequest`?
        get() = definedExternally
        set(value) = definedExternally
    var mergeCells: `Schema$MergeCellsRequest`?
        get() = definedExternally
        set(value) = definedExternally
    var moveDimension: `Schema$MoveDimensionRequest`?
        get() = definedExternally
        set(value) = definedExternally
    var pasteData: `Schema$PasteDataRequest`?
        get() = definedExternally
        set(value) = definedExternally
    var randomizeRange: `Schema$RandomizeRangeRequest`?
        get() = definedExternally
        set(value) = definedExternally
    var refreshDataSource: `Schema$RefreshDataSourceRequest`?
        get() = definedExternally
        set(value) = definedExternally
    var repeatCell: `Schema$RepeatCellRequest`?
        get() = definedExternally
        set(value) = definedExternally
    var setBasicFilter: `Schema$SetBasicFilterRequest`?
        get() = definedExternally
        set(value) = definedExternally
    var setDataValidation: `Schema$SetDataValidationRequest`?
        get() = definedExternally
        set(value) = definedExternally
    var sortRange: `Schema$SortRangeRequest`?
        get() = definedExternally
        set(value) = definedExternally
    var textToColumns: `Schema$TextToColumnsRequest`?
        get() = definedExternally
        set(value) = definedExternally
    var trimWhitespace: `Schema$TrimWhitespaceRequest`?
        get() = definedExternally
        set(value) = definedExternally
    var unmergeCells: `Schema$UnmergeCellsRequest`?
        get() = definedExternally
        set(value) = definedExternally
    var updateBanding: `Schema$UpdateBandingRequest`?
        get() = definedExternally
        set(value) = definedExternally
    var updateBorders: `Schema$UpdateBordersRequest`?
        get() = definedExternally
        set(value) = definedExternally
    var updateCells: `Schema$UpdateCellsRequest`?
        get() = definedExternally
        set(value) = definedExternally
    var updateChartSpec: `Schema$UpdateChartSpecRequest`?
        get() = definedExternally
        set(value) = definedExternally
    var updateConditionalFormatRule: `Schema$UpdateConditionalFormatRuleRequest`?
        get() = definedExternally
        set(value) = definedExternally
    var updateDataSource: `Schema$UpdateDataSourceRequest`?
        get() = definedExternally
        set(value) = definedExternally
    var updateDeveloperMetadata: `Schema$UpdateDeveloperMetadataRequest`?
        get() = definedExternally
        set(value) = definedExternally
    var updateDimensionGroup: `Schema$UpdateDimensionGroupRequest`?
        get() = definedExternally
        set(value) = definedExternally
    var updateDimensionProperties: `Schema$UpdateDimensionPropertiesRequest`?
        get() = definedExternally
        set(value) = definedExternally
    var updateEmbeddedObjectBorder: `Schema$UpdateEmbeddedObjectBorderRequest`?
        get() = definedExternally
        set(value) = definedExternally
    var updateEmbeddedObjectPosition: `Schema$UpdateEmbeddedObjectPositionRequest`?
        get() = definedExternally
        set(value) = definedExternally
    var updateFilterView: `Schema$UpdateFilterViewRequest`?
        get() = definedExternally
        set(value) = definedExternally
    var updateNamedRange: `Schema$UpdateNamedRangeRequest`?
        get() = definedExternally
        set(value) = definedExternally
    var updateProtectedRange: `Schema$UpdateProtectedRangeRequest`?
        get() = definedExternally
        set(value) = definedExternally
    var updateSheetProperties: `Schema$UpdateSheetPropertiesRequest`?
        get() = definedExternally
        set(value) = definedExternally
    var updateSlicerSpec: `Schema$UpdateSlicerSpecRequest`?
        get() = definedExternally
        set(value) = definedExternally
    var updateSpreadsheetProperties: `Schema$UpdateSpreadsheetPropertiesRequest`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$Response` {
    var addBanding: `Schema$AddBandingResponse`?
        get() = definedExternally
        set(value) = definedExternally
    var addChart: `Schema$AddChartResponse`?
        get() = definedExternally
        set(value) = definedExternally
    var addDataSource: `Schema$AddDataSourceResponse`?
        get() = definedExternally
        set(value) = definedExternally
    var addDimensionGroup: `Schema$AddDimensionGroupResponse`?
        get() = definedExternally
        set(value) = definedExternally
    var addFilterView: `Schema$AddFilterViewResponse`?
        get() = definedExternally
        set(value) = definedExternally
    var addNamedRange: `Schema$AddNamedRangeResponse`?
        get() = definedExternally
        set(value) = definedExternally
    var addProtectedRange: `Schema$AddProtectedRangeResponse`?
        get() = definedExternally
        set(value) = definedExternally
    var addSheet: `Schema$AddSheetResponse`?
        get() = definedExternally
        set(value) = definedExternally
    var addSlicer: `Schema$AddSlicerResponse`?
        get() = definedExternally
        set(value) = definedExternally
    var createDeveloperMetadata: `Schema$CreateDeveloperMetadataResponse`?
        get() = definedExternally
        set(value) = definedExternally
    var deleteConditionalFormatRule: `Schema$DeleteConditionalFormatRuleResponse`?
        get() = definedExternally
        set(value) = definedExternally
    var deleteDeveloperMetadata: `Schema$DeleteDeveloperMetadataResponse`?
        get() = definedExternally
        set(value) = definedExternally
    var deleteDimensionGroup: `Schema$DeleteDimensionGroupResponse`?
        get() = definedExternally
        set(value) = definedExternally
    var deleteDuplicates: `Schema$DeleteDuplicatesResponse`?
        get() = definedExternally
        set(value) = definedExternally
    var duplicateFilterView: `Schema$DuplicateFilterViewResponse`?
        get() = definedExternally
        set(value) = definedExternally
    var duplicateSheet: `Schema$DuplicateSheetResponse`?
        get() = definedExternally
        set(value) = definedExternally
    var findReplace: `Schema$FindReplaceResponse`?
        get() = definedExternally
        set(value) = definedExternally
    var refreshDataSource: `Schema$RefreshDataSourceResponse`?
        get() = definedExternally
        set(value) = definedExternally
    var trimWhitespace: `Schema$TrimWhitespaceResponse`?
        get() = definedExternally
        set(value) = definedExternally
    var updateConditionalFormatRule: `Schema$UpdateConditionalFormatRuleResponse`?
        get() = definedExternally
        set(value) = definedExternally
    var updateDataSource: `Schema$UpdateDataSourceResponse`?
        get() = definedExternally
        set(value) = definedExternally
    var updateDeveloperMetadata: `Schema$UpdateDeveloperMetadataResponse`?
        get() = definedExternally
        set(value) = definedExternally
    var updateEmbeddedObjectPosition: `Schema$UpdateEmbeddedObjectPositionResponse`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$RowData` {
    var values: Array<`Schema$CellData`>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$ScorecardChartSpec` {
    var aggregateType: String?
        get() = definedExternally
        set(value) = definedExternally
    var baselineValueData: `Schema$ChartData`?
        get() = definedExternally
        set(value) = definedExternally
    var baselineValueFormat: `Schema$BaselineValueFormat`?
        get() = definedExternally
        set(value) = definedExternally
    var customFormatOptions: `Schema$ChartCustomNumberFormatOptions`?
        get() = definedExternally
        set(value) = definedExternally
    var keyValueData: `Schema$ChartData`?
        get() = definedExternally
        set(value) = definedExternally
    var keyValueFormat: `Schema$KeyValueFormat`?
        get() = definedExternally
        set(value) = definedExternally
    var numberFormatSource: String?
        get() = definedExternally
        set(value) = definedExternally
    var scaleFactor: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$SearchDeveloperMetadataRequest` {
    var dataFilters: Array<`Schema$DataFilter`>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$SearchDeveloperMetadataResponse` {
    var matchedDeveloperMetadata: Array<`Schema$MatchedDeveloperMetadata`>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$SetBasicFilterRequest` {
    var filter: `Schema$BasicFilter`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$SetDataValidationRequest` {
    var range: `Schema$GridRange`?
        get() = definedExternally
        set(value) = definedExternally
    var rule: `Schema$DataValidationRule`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$Sheet` {
    var bandedRanges: Array<`Schema$BandedRange`>?
        get() = definedExternally
        set(value) = definedExternally
    var basicFilter: `Schema$BasicFilter`?
        get() = definedExternally
        set(value) = definedExternally
    var charts: Array<`Schema$EmbeddedChart`>?
        get() = definedExternally
        set(value) = definedExternally
    var columnGroups: Array<`Schema$DimensionGroup`>?
        get() = definedExternally
        set(value) = definedExternally
    var conditionalFormats: Array<`Schema$ConditionalFormatRule`>?
        get() = definedExternally
        set(value) = definedExternally
    var data: Array<`Schema$GridData`>?
        get() = definedExternally
        set(value) = definedExternally
    var developerMetadata: Array<`Schema$DeveloperMetadata`>?
        get() = definedExternally
        set(value) = definedExternally
    var filterViews: Array<`Schema$FilterView`>?
        get() = definedExternally
        set(value) = definedExternally
    var merges: Array<`Schema$GridRange`>?
        get() = definedExternally
        set(value) = definedExternally
    var properties: `Schema$SheetProperties`?
        get() = definedExternally
        set(value) = definedExternally
    var protectedRanges: Array<`Schema$ProtectedRange`>?
        get() = definedExternally
        set(value) = definedExternally
    var rowGroups: Array<`Schema$DimensionGroup`>?
        get() = definedExternally
        set(value) = definedExternally
    var slicers: Array<`Schema$Slicer`>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$SheetProperties` {
    var dataSourceSheetProperties: `Schema$DataSourceSheetProperties`?
        get() = definedExternally
        set(value) = definedExternally
    var gridProperties: `Schema$GridProperties`?
        get() = definedExternally
        set(value) = definedExternally
    var hidden: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var index: Number?
        get() = definedExternally
        set(value) = definedExternally
    var rightToLeft: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var sheetId: Number?
        get() = definedExternally
        set(value) = definedExternally
    var sheetType: String?
        get() = definedExternally
        set(value) = definedExternally
    var tabColor: `Schema$Color`?
        get() = definedExternally
        set(value) = definedExternally
    var tabColorStyle: `Schema$ColorStyle`?
        get() = definedExternally
        set(value) = definedExternally
    var title: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$Slicer` {
    var position: `Schema$EmbeddedObjectPosition`?
        get() = definedExternally
        set(value) = definedExternally
    var slicerId: Number?
        get() = definedExternally
        set(value) = definedExternally
    var spec: `Schema$SlicerSpec`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$SlicerSpec` {
    var applyToPivotTables: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var backgroundColor: `Schema$Color`?
        get() = definedExternally
        set(value) = definedExternally
    var backgroundColorStyle: `Schema$ColorStyle`?
        get() = definedExternally
        set(value) = definedExternally
    var columnIndex: Number?
        get() = definedExternally
        set(value) = definedExternally
    var dataRange: `Schema$GridRange`?
        get() = definedExternally
        set(value) = definedExternally
    var filterCriteria: `Schema$FilterCriteria`?
        get() = definedExternally
        set(value) = definedExternally
    var horizontalAlignment: String?
        get() = definedExternally
        set(value) = definedExternally
    var textFormat: `Schema$TextFormat`?
        get() = definedExternally
        set(value) = definedExternally
    var title: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$SortRangeRequest` {
    var range: `Schema$GridRange`?
        get() = definedExternally
        set(value) = definedExternally
    var sortSpecs: Array<`Schema$SortSpec`>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$SortSpec` {
    var backgroundColor: `Schema$Color`?
        get() = definedExternally
        set(value) = definedExternally
    var backgroundColorStyle: `Schema$ColorStyle`?
        get() = definedExternally
        set(value) = definedExternally
    var dataSourceColumnReference: `Schema$DataSourceColumnReference`?
        get() = definedExternally
        set(value) = definedExternally
    var dimensionIndex: Number?
        get() = definedExternally
        set(value) = definedExternally
    var foregroundColor: `Schema$Color`?
        get() = definedExternally
        set(value) = definedExternally
    var foregroundColorStyle: `Schema$ColorStyle`?
        get() = definedExternally
        set(value) = definedExternally
    var sortOrder: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$SourceAndDestination` {
    var dimension: String?
        get() = definedExternally
        set(value) = definedExternally
    var fillLength: Number?
        get() = definedExternally
        set(value) = definedExternally
    var source: `Schema$GridRange`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$Spreadsheet` {
    var dataSources: Array<`Schema$DataSource`>?
        get() = definedExternally
        set(value) = definedExternally
    var dataSourceSchedules: Array<`Schema$DataSourceRefreshSchedule`>?
        get() = definedExternally
        set(value) = definedExternally
    var developerMetadata: Array<`Schema$DeveloperMetadata`>?
        get() = definedExternally
        set(value) = definedExternally
    var namedRanges: Array<`Schema$NamedRange`>?
        get() = definedExternally
        set(value) = definedExternally
    var properties: `Schema$SpreadsheetProperties`?
        get() = definedExternally
        set(value) = definedExternally
    var sheets: Array<`Schema$Sheet`>?
        get() = definedExternally
        set(value) = definedExternally
    var spreadsheetId: String?
        get() = definedExternally
        set(value) = definedExternally
    var spreadsheetUrl: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$SpreadsheetProperties` {
    var autoRecalc: String?
        get() = definedExternally
        set(value) = definedExternally
    var defaultFormat: `Schema$CellFormat`?
        get() = definedExternally
        set(value) = definedExternally
    var iterativeCalculationSettings: `Schema$IterativeCalculationSettings`?
        get() = definedExternally
        set(value) = definedExternally
    var locale: String?
        get() = definedExternally
        set(value) = definedExternally
    var spreadsheetTheme: `Schema$SpreadsheetTheme`?
        get() = definedExternally
        set(value) = definedExternally
    var timeZone: String?
        get() = definedExternally
        set(value) = definedExternally
    var title: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$SpreadsheetTheme` {
    var primaryFontFamily: String?
        get() = definedExternally
        set(value) = definedExternally
    var themeColors: Array<`Schema$ThemeColorPair`>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$TextFormat` {
    var bold: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var fontFamily: String?
        get() = definedExternally
        set(value) = definedExternally
    var fontSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var foregroundColor: `Schema$Color`?
        get() = definedExternally
        set(value) = definedExternally
    var foregroundColorStyle: `Schema$ColorStyle`?
        get() = definedExternally
        set(value) = definedExternally
    var italic: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var link: `Schema$Link`?
        get() = definedExternally
        set(value) = definedExternally
    var strikethrough: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var underline: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$TextFormatRun` {
    var format: `Schema$TextFormat`?
        get() = definedExternally
        set(value) = definedExternally
    var startIndex: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$TextPosition` {
    var horizontalAlignment: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$TextRotation` {
    var angle: Number?
        get() = definedExternally
        set(value) = definedExternally
    var vertical: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$TextToColumnsRequest` {
    var delimiter: String?
        get() = definedExternally
        set(value) = definedExternally
    var delimiterType: String?
        get() = definedExternally
        set(value) = definedExternally
    var source: `Schema$GridRange`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$ThemeColorPair` {
    var color: `Schema$ColorStyle`?
        get() = definedExternally
        set(value) = definedExternally
    var colorType: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$TimeOfDay` {
    var hours: Number?
        get() = definedExternally
        set(value) = definedExternally
    var minutes: Number?
        get() = definedExternally
        set(value) = definedExternally
    var nanos: Number?
        get() = definedExternally
        set(value) = definedExternally
    var seconds: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$TreemapChartColorScale` {
    var maxValueColor: `Schema$Color`?
        get() = definedExternally
        set(value) = definedExternally
    var maxValueColorStyle: `Schema$ColorStyle`?
        get() = definedExternally
        set(value) = definedExternally
    var midValueColor: `Schema$Color`?
        get() = definedExternally
        set(value) = definedExternally
    var midValueColorStyle: `Schema$ColorStyle`?
        get() = definedExternally
        set(value) = definedExternally
    var minValueColor: `Schema$Color`?
        get() = definedExternally
        set(value) = definedExternally
    var minValueColorStyle: `Schema$ColorStyle`?
        get() = definedExternally
        set(value) = definedExternally
    var noDataColor: `Schema$Color`?
        get() = definedExternally
        set(value) = definedExternally
    var noDataColorStyle: `Schema$ColorStyle`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$TreemapChartSpec` {
    var colorData: `Schema$ChartData`?
        get() = definedExternally
        set(value) = definedExternally
    var colorScale: `Schema$TreemapChartColorScale`?
        get() = definedExternally
        set(value) = definedExternally
    var headerColor: `Schema$Color`?
        get() = definedExternally
        set(value) = definedExternally
    var headerColorStyle: `Schema$ColorStyle`?
        get() = definedExternally
        set(value) = definedExternally
    var hideTooltips: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var hintedLevels: Number?
        get() = definedExternally
        set(value) = definedExternally
    var labels: `Schema$ChartData`?
        get() = definedExternally
        set(value) = definedExternally
    var levels: Number?
        get() = definedExternally
        set(value) = definedExternally
    var maxValue: Number?
        get() = definedExternally
        set(value) = definedExternally
    var minValue: Number?
        get() = definedExternally
        set(value) = definedExternally
    var parentLabels: `Schema$ChartData`?
        get() = definedExternally
        set(value) = definedExternally
    var sizeData: `Schema$ChartData`?
        get() = definedExternally
        set(value) = definedExternally
    var textFormat: `Schema$TextFormat`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$TrimWhitespaceRequest` {
    var range: `Schema$GridRange`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$TrimWhitespaceResponse` {
    var cellsChangedCount: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$UnmergeCellsRequest` {
    var range: `Schema$GridRange`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$UpdateBandingRequest` {
    var bandedRange: `Schema$BandedRange`?
        get() = definedExternally
        set(value) = definedExternally
    var fields: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$UpdateBordersRequest` {
    var bottom: `Schema$Border`?
        get() = definedExternally
        set(value) = definedExternally
    var innerHorizontal: `Schema$Border`?
        get() = definedExternally
        set(value) = definedExternally
    var innerVertical: `Schema$Border`?
        get() = definedExternally
        set(value) = definedExternally
    var left: `Schema$Border`?
        get() = definedExternally
        set(value) = definedExternally
    var range: `Schema$GridRange`?
        get() = definedExternally
        set(value) = definedExternally
    var right: `Schema$Border`?
        get() = definedExternally
        set(value) = definedExternally
    var top: `Schema$Border`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$UpdateCellsRequest` {
    var fields: String?
        get() = definedExternally
        set(value) = definedExternally
    var range: `Schema$GridRange`?
        get() = definedExternally
        set(value) = definedExternally
    var rows: Array<`Schema$RowData`>?
        get() = definedExternally
        set(value) = definedExternally
    var start: `Schema$GridCoordinate`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$UpdateChartSpecRequest` {
    var chartId: Number?
        get() = definedExternally
        set(value) = definedExternally
    var spec: `Schema$ChartSpec`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$UpdateConditionalFormatRuleRequest` {
    var index: Number?
        get() = definedExternally
        set(value) = definedExternally
    var newIndex: Number?
        get() = definedExternally
        set(value) = definedExternally
    var rule: `Schema$ConditionalFormatRule`?
        get() = definedExternally
        set(value) = definedExternally
    var sheetId: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$UpdateConditionalFormatRuleResponse` {
    var newIndex: Number?
        get() = definedExternally
        set(value) = definedExternally
    var newRule: `Schema$ConditionalFormatRule`?
        get() = definedExternally
        set(value) = definedExternally
    var oldIndex: Number?
        get() = definedExternally
        set(value) = definedExternally
    var oldRule: `Schema$ConditionalFormatRule`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$UpdateDataSourceRequest` {
    var dataSource: `Schema$DataSource`?
        get() = definedExternally
        set(value) = definedExternally
    var fields: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$UpdateDataSourceResponse` {
    var dataExecutionStatus: `Schema$DataExecutionStatus`?
        get() = definedExternally
        set(value) = definedExternally
    var dataSource: `Schema$DataSource`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$UpdateDeveloperMetadataRequest` {
    var dataFilters: Array<`Schema$DataFilter`>?
        get() = definedExternally
        set(value) = definedExternally
    var developerMetadata: `Schema$DeveloperMetadata`?
        get() = definedExternally
        set(value) = definedExternally
    var fields: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$UpdateDeveloperMetadataResponse` {
    var developerMetadata: Array<`Schema$DeveloperMetadata`>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$UpdateDimensionGroupRequest` {
    var dimensionGroup: `Schema$DimensionGroup`?
        get() = definedExternally
        set(value) = definedExternally
    var fields: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$UpdateDimensionPropertiesRequest` {
    var dataSourceSheetRange: `Schema$DataSourceSheetDimensionRange`?
        get() = definedExternally
        set(value) = definedExternally
    var fields: String?
        get() = definedExternally
        set(value) = definedExternally
    var properties: `Schema$DimensionProperties`?
        get() = definedExternally
        set(value) = definedExternally
    var range: `Schema$DimensionRange`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$UpdateEmbeddedObjectBorderRequest` {
    var border: `Schema$EmbeddedObjectBorder`?
        get() = definedExternally
        set(value) = definedExternally
    var fields: String?
        get() = definedExternally
        set(value) = definedExternally
    var objectId: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$UpdateEmbeddedObjectPositionRequest` {
    var fields: String?
        get() = definedExternally
        set(value) = definedExternally
    var newPosition: `Schema$EmbeddedObjectPosition`?
        get() = definedExternally
        set(value) = definedExternally
    var objectId: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$UpdateEmbeddedObjectPositionResponse` {
    var position: `Schema$EmbeddedObjectPosition`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$UpdateFilterViewRequest` {
    var fields: String?
        get() = definedExternally
        set(value) = definedExternally
    var filter: `Schema$FilterView`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$UpdateNamedRangeRequest` {
    var fields: String?
        get() = definedExternally
        set(value) = definedExternally
    var namedRange: `Schema$NamedRange`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$UpdateProtectedRangeRequest` {
    var fields: String?
        get() = definedExternally
        set(value) = definedExternally
    var protectedRange: `Schema$ProtectedRange`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$UpdateSheetPropertiesRequest` {
    var fields: String?
        get() = definedExternally
        set(value) = definedExternally
    var properties: `Schema$SheetProperties`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$UpdateSlicerSpecRequest` {
    var fields: String?
        get() = definedExternally
        set(value) = definedExternally
    var slicerId: Number?
        get() = definedExternally
        set(value) = definedExternally
    var spec: `Schema$SlicerSpec`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$UpdateSpreadsheetPropertiesRequest` {
    var fields: String?
        get() = definedExternally
        set(value) = definedExternally
    var properties: `Schema$SpreadsheetProperties`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$UpdateValuesByDataFilterResponse` {
    var dataFilter: `Schema$DataFilter`?
        get() = definedExternally
        set(value) = definedExternally
    var updatedCells: Number?
        get() = definedExternally
        set(value) = definedExternally
    var updatedColumns: Number?
        get() = definedExternally
        set(value) = definedExternally
    var updatedData: `Schema$ValueRange`?
        get() = definedExternally
        set(value) = definedExternally
    var updatedRange: String?
        get() = definedExternally
        set(value) = definedExternally
    var updatedRows: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$UpdateValuesResponse` {
    var spreadsheetId: String?
        get() = definedExternally
        set(value) = definedExternally
    var updatedCells: Number?
        get() = definedExternally
        set(value) = definedExternally
    var updatedColumns: Number?
        get() = definedExternally
        set(value) = definedExternally
    var updatedData: `Schema$ValueRange`?
        get() = definedExternally
        set(value) = definedExternally
    var updatedRange: String?
        get() = definedExternally
        set(value) = definedExternally
    var updatedRows: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$ValueRange` {
    var majorDimension: String?
        get() = definedExternally
        set(value) = definedExternally
    var range: String?
        get() = definedExternally
        set(value) = definedExternally
    var values: Array<Array<Any>>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$WaterfallChartColumnStyle` {
    var color: `Schema$Color`?
        get() = definedExternally
        set(value) = definedExternally
    var colorStyle: `Schema$ColorStyle`?
        get() = definedExternally
        set(value) = definedExternally
    var label: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$WaterfallChartCustomSubtotal` {
    var dataIsSubtotal: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var label: String?
        get() = definedExternally
        set(value) = definedExternally
    var subtotalIndex: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$WaterfallChartDomain` {
    var data: `Schema$ChartData`?
        get() = definedExternally
        set(value) = definedExternally
    var reversed: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$WaterfallChartSeries` {
    var customSubtotals: Array<`Schema$WaterfallChartCustomSubtotal`>?
        get() = definedExternally
        set(value) = definedExternally
    var data: `Schema$ChartData`?
        get() = definedExternally
        set(value) = definedExternally
    var dataLabel: `Schema$DataLabel`?
        get() = definedExternally
        set(value) = definedExternally
    var hideTrailingSubtotal: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var negativeColumnsStyle: `Schema$WaterfallChartColumnStyle`?
        get() = definedExternally
        set(value) = definedExternally
    var positiveColumnsStyle: `Schema$WaterfallChartColumnStyle`?
        get() = definedExternally
        set(value) = definedExternally
    var subtotalColumnsStyle: `Schema$WaterfallChartColumnStyle`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Schema$WaterfallChartSpec` {
    var connectorLineStyle: `Schema$LineStyle`?
        get() = definedExternally
        set(value) = definedExternally
    var domain: `Schema$WaterfallChartDomain`?
        get() = definedExternally
        set(value) = definedExternally
    var firstValueIsTotal: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var hideConnectorLines: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var series: Array<`Schema$WaterfallChartSeries`>?
        get() = definedExternally
        set(value) = definedExternally
    var stackedType: String?
        get() = definedExternally
        set(value) = definedExternally
    var totalDataLabel: `Schema$DataLabel`?
        get() = definedExternally
        set(value) = definedExternally
}

external open class `Resource$Spreadsheets`(context: APIRequestContext) {
    open var context: APIRequestContext
    open var developerMetadata: `Resource$Spreadsheets$Developermetadata`
    open var sheets: `Resource$Spreadsheets$Sheets`
    open var values: `Resource$Spreadsheets$Values`
    open fun batchUpdate(params: `Params$Resource$Spreadsheets$Batchupdate`, options: StreamMethodOptions): GaxiosPromise<Readable>
    open fun batchUpdate(params: `Params$Resource$Spreadsheets$Batchupdate` = definedExternally, options: MethodOptions = definedExternally): GaxiosPromise<`Schema$BatchUpdateSpreadsheetResponse`>
    open fun batchUpdate(): GaxiosPromise<`Schema$BatchUpdateSpreadsheetResponse`>
    open fun batchUpdate(params: `Params$Resource$Spreadsheets$Batchupdate` = definedExternally): GaxiosPromise<`Schema$BatchUpdateSpreadsheetResponse`>
    open fun batchUpdate(params: `Params$Resource$Spreadsheets$Batchupdate`, options: StreamMethodOptions, callback: BodyResponseCallback<Readable>)
    open fun batchUpdate(params: `Params$Resource$Spreadsheets$Batchupdate`, options: BodyResponseCallback<Readable>, callback: BodyResponseCallback<Readable>)
    open fun batchUpdate(params: `Params$Resource$Spreadsheets$Batchupdate`, options: MethodOptions, callback: BodyResponseCallback<`Schema$BatchUpdateSpreadsheetResponse`>)
    open fun batchUpdate(params: `Params$Resource$Spreadsheets$Batchupdate`, options: BodyResponseCallback<`Schema$BatchUpdateSpreadsheetResponse`>, callback: BodyResponseCallback<`Schema$BatchUpdateSpreadsheetResponse`>)
    open fun batchUpdate(params: `Params$Resource$Spreadsheets$Batchupdate`, callback: BodyResponseCallback<`Schema$BatchUpdateSpreadsheetResponse`>)
    open fun batchUpdate(callback: BodyResponseCallback<`Schema$BatchUpdateSpreadsheetResponse`>)
    open fun create(params: `Params$Resource$Spreadsheets$Create`, options: StreamMethodOptions): GaxiosPromise<Readable>
    open fun create(params: `Params$Resource$Spreadsheets$Create` = definedExternally, options: MethodOptions = definedExternally): GaxiosPromise<`Schema$Spreadsheet`>
    open fun create(): GaxiosPromise<`Schema$Spreadsheet`>
    open fun create(params: `Params$Resource$Spreadsheets$Create` = definedExternally): GaxiosPromise<`Schema$Spreadsheet`>
    open fun create(params: `Params$Resource$Spreadsheets$Create`, options: StreamMethodOptions, callback: BodyResponseCallback<Readable>)
    open fun create(params: `Params$Resource$Spreadsheets$Create`, options: BodyResponseCallback<Readable>, callback: BodyResponseCallback<Readable>)
    open fun create(params: `Params$Resource$Spreadsheets$Create`, options: MethodOptions, callback: BodyResponseCallback<`Schema$Spreadsheet`>)
    open fun create(params: `Params$Resource$Spreadsheets$Create`, options: BodyResponseCallback<`Schema$Spreadsheet`>, callback: BodyResponseCallback<`Schema$Spreadsheet`>)
    open fun create(params: `Params$Resource$Spreadsheets$Create`, callback: BodyResponseCallback<`Schema$Spreadsheet`>)
    open fun create(callback: BodyResponseCallback<`Schema$Spreadsheet`>)
    open fun get(params: `Params$Resource$Spreadsheets$Get`, options: StreamMethodOptions): GaxiosPromise<Readable>
    open fun get(params: `Params$Resource$Spreadsheets$Get` = definedExternally, options: MethodOptions = definedExternally): GaxiosPromise<`Schema$Spreadsheet`>
    open fun get(): GaxiosPromise<`Schema$Spreadsheet`>
    open fun get(params: `Params$Resource$Spreadsheets$Get` = definedExternally): GaxiosPromise<`Schema$Spreadsheet`>
    open fun get(params: `Params$Resource$Spreadsheets$Get`, options: StreamMethodOptions, callback: BodyResponseCallback<Readable>)
    open fun get(params: `Params$Resource$Spreadsheets$Get`, options: BodyResponseCallback<Readable>, callback: BodyResponseCallback<Readable>)
    open fun get(params: `Params$Resource$Spreadsheets$Get`, options: MethodOptions, callback: BodyResponseCallback<`Schema$Spreadsheet`>)
    open fun get(params: `Params$Resource$Spreadsheets$Get`, options: BodyResponseCallback<`Schema$Spreadsheet`>, callback: BodyResponseCallback<`Schema$Spreadsheet`>)
    open fun get(params: `Params$Resource$Spreadsheets$Get`, callback: BodyResponseCallback<`Schema$Spreadsheet`>)
    open fun get(callback: BodyResponseCallback<`Schema$Spreadsheet`>)
    open fun getByDataFilter(params: `Params$Resource$Spreadsheets$Getbydatafilter`, options: StreamMethodOptions): GaxiosPromise<Readable>
    open fun getByDataFilter(params: `Params$Resource$Spreadsheets$Getbydatafilter` = definedExternally, options: MethodOptions = definedExternally): GaxiosPromise<`Schema$Spreadsheet`>
    open fun getByDataFilter(): GaxiosPromise<`Schema$Spreadsheet`>
    open fun getByDataFilter(params: `Params$Resource$Spreadsheets$Getbydatafilter` = definedExternally): GaxiosPromise<`Schema$Spreadsheet`>
    open fun getByDataFilter(params: `Params$Resource$Spreadsheets$Getbydatafilter`, options: StreamMethodOptions, callback: BodyResponseCallback<Readable>)
    open fun getByDataFilter(params: `Params$Resource$Spreadsheets$Getbydatafilter`, options: BodyResponseCallback<Readable>, callback: BodyResponseCallback<Readable>)
    open fun getByDataFilter(params: `Params$Resource$Spreadsheets$Getbydatafilter`, options: MethodOptions, callback: BodyResponseCallback<`Schema$Spreadsheet`>)
    open fun getByDataFilter(params: `Params$Resource$Spreadsheets$Getbydatafilter`, options: BodyResponseCallback<`Schema$Spreadsheet`>, callback: BodyResponseCallback<`Schema$Spreadsheet`>)
    open fun getByDataFilter(params: `Params$Resource$Spreadsheets$Getbydatafilter`, callback: BodyResponseCallback<`Schema$Spreadsheet`>)
    open fun getByDataFilter(callback: BodyResponseCallback<`Schema$Spreadsheet`>)
}

external interface `Params$Resource$Spreadsheets$Batchupdate` : StandardParameters {
    var spreadsheetId: String?
        get() = definedExternally
        set(value) = definedExternally
    var requestBody: `Schema$BatchUpdateSpreadsheetRequest`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Params$Resource$Spreadsheets$Create` : StandardParameters {
    var requestBody: `Schema$Spreadsheet`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Params$Resource$Spreadsheets$Get` : StandardParameters {
    var includeGridData: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var ranges: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var spreadsheetId: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Params$Resource$Spreadsheets$Getbydatafilter` : StandardParameters {
    var spreadsheetId: String?
        get() = definedExternally
        set(value) = definedExternally
    var requestBody: `Schema$GetSpreadsheetByDataFilterRequest`?
        get() = definedExternally
        set(value) = definedExternally
}

external open class `Resource$Spreadsheets$Developermetadata`(context: APIRequestContext) {
    open var context: APIRequestContext
    open fun get(params: `Params$Resource$Spreadsheets$Developermetadata$Get`, options: StreamMethodOptions): GaxiosPromise<Readable>
    open fun get(params: `Params$Resource$Spreadsheets$Developermetadata$Get` = definedExternally, options: MethodOptions = definedExternally): GaxiosPromise<`Schema$DeveloperMetadata`>
    open fun get(): GaxiosPromise<`Schema$DeveloperMetadata`>
    open fun get(params: `Params$Resource$Spreadsheets$Developermetadata$Get` = definedExternally): GaxiosPromise<`Schema$DeveloperMetadata`>
    open fun get(params: `Params$Resource$Spreadsheets$Developermetadata$Get`, options: StreamMethodOptions, callback: BodyResponseCallback<Readable>)
    open fun get(params: `Params$Resource$Spreadsheets$Developermetadata$Get`, options: BodyResponseCallback<Readable>, callback: BodyResponseCallback<Readable>)
    open fun get(params: `Params$Resource$Spreadsheets$Developermetadata$Get`, options: MethodOptions, callback: BodyResponseCallback<`Schema$DeveloperMetadata`>)
    open fun get(params: `Params$Resource$Spreadsheets$Developermetadata$Get`, options: BodyResponseCallback<`Schema$DeveloperMetadata`>, callback: BodyResponseCallback<`Schema$DeveloperMetadata`>)
    open fun get(params: `Params$Resource$Spreadsheets$Developermetadata$Get`, callback: BodyResponseCallback<`Schema$DeveloperMetadata`>)
    open fun get(callback: BodyResponseCallback<`Schema$DeveloperMetadata`>)
    open fun search(params: `Params$Resource$Spreadsheets$Developermetadata$Search`, options: StreamMethodOptions): GaxiosPromise<Readable>
    open fun search(params: `Params$Resource$Spreadsheets$Developermetadata$Search` = definedExternally, options: MethodOptions = definedExternally): GaxiosPromise<`Schema$SearchDeveloperMetadataResponse`>
    open fun search(): GaxiosPromise<`Schema$SearchDeveloperMetadataResponse`>
    open fun search(params: `Params$Resource$Spreadsheets$Developermetadata$Search` = definedExternally): GaxiosPromise<`Schema$SearchDeveloperMetadataResponse`>
    open fun search(params: `Params$Resource$Spreadsheets$Developermetadata$Search`, options: StreamMethodOptions, callback: BodyResponseCallback<Readable>)
    open fun search(params: `Params$Resource$Spreadsheets$Developermetadata$Search`, options: BodyResponseCallback<Readable>, callback: BodyResponseCallback<Readable>)
    open fun search(params: `Params$Resource$Spreadsheets$Developermetadata$Search`, options: MethodOptions, callback: BodyResponseCallback<`Schema$SearchDeveloperMetadataResponse`>)
    open fun search(params: `Params$Resource$Spreadsheets$Developermetadata$Search`, options: BodyResponseCallback<`Schema$SearchDeveloperMetadataResponse`>, callback: BodyResponseCallback<`Schema$SearchDeveloperMetadataResponse`>)
    open fun search(params: `Params$Resource$Spreadsheets$Developermetadata$Search`, callback: BodyResponseCallback<`Schema$SearchDeveloperMetadataResponse`>)
    open fun search(callback: BodyResponseCallback<`Schema$SearchDeveloperMetadataResponse`>)
}

external interface `Params$Resource$Spreadsheets$Developermetadata$Get` : StandardParameters {
    var metadataId: Number?
        get() = definedExternally
        set(value) = definedExternally
    var spreadsheetId: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Params$Resource$Spreadsheets$Developermetadata$Search` : StandardParameters {
    var spreadsheetId: String?
        get() = definedExternally
        set(value) = definedExternally
    var requestBody: `Schema$SearchDeveloperMetadataRequest`?
        get() = definedExternally
        set(value) = definedExternally
}

external open class `Resource$Spreadsheets$Sheets`(context: APIRequestContext) {
    open var context: APIRequestContext
    open fun copyTo(params: `Params$Resource$Spreadsheets$Sheets$Copyto`, options: StreamMethodOptions): GaxiosPromise<Readable>
    open fun copyTo(params: `Params$Resource$Spreadsheets$Sheets$Copyto` = definedExternally, options: MethodOptions = definedExternally): GaxiosPromise<`Schema$SheetProperties`>
    open fun copyTo(): GaxiosPromise<`Schema$SheetProperties`>
    open fun copyTo(params: `Params$Resource$Spreadsheets$Sheets$Copyto` = definedExternally): GaxiosPromise<`Schema$SheetProperties`>
    open fun copyTo(params: `Params$Resource$Spreadsheets$Sheets$Copyto`, options: StreamMethodOptions, callback: BodyResponseCallback<Readable>)
    open fun copyTo(params: `Params$Resource$Spreadsheets$Sheets$Copyto`, options: BodyResponseCallback<Readable>, callback: BodyResponseCallback<Readable>)
    open fun copyTo(params: `Params$Resource$Spreadsheets$Sheets$Copyto`, options: MethodOptions, callback: BodyResponseCallback<`Schema$SheetProperties`>)
    open fun copyTo(params: `Params$Resource$Spreadsheets$Sheets$Copyto`, options: BodyResponseCallback<`Schema$SheetProperties`>, callback: BodyResponseCallback<`Schema$SheetProperties`>)
    open fun copyTo(params: `Params$Resource$Spreadsheets$Sheets$Copyto`, callback: BodyResponseCallback<`Schema$SheetProperties`>)
    open fun copyTo(callback: BodyResponseCallback<`Schema$SheetProperties`>)
}

external interface `Params$Resource$Spreadsheets$Sheets$Copyto` : StandardParameters {
    var sheetId: Number?
        get() = definedExternally
        set(value) = definedExternally
    var spreadsheetId: String?
        get() = definedExternally
        set(value) = definedExternally
    var requestBody: `Schema$CopySheetToAnotherSpreadsheetRequest`?
        get() = definedExternally
        set(value) = definedExternally
}

external open class `Resource$Spreadsheets$Values`(context: APIRequestContext) {
    open var context: APIRequestContext
    open fun append(params: `Params$Resource$Spreadsheets$Values$Append`, options: StreamMethodOptions): GaxiosPromise<Readable>
    open fun append(params: `Params$Resource$Spreadsheets$Values$Append` = definedExternally, options: MethodOptions = definedExternally): GaxiosPromise<`Schema$AppendValuesResponse`>
    open fun append(): GaxiosPromise<`Schema$AppendValuesResponse`>
    open fun append(params: `Params$Resource$Spreadsheets$Values$Append` = definedExternally): GaxiosPromise<`Schema$AppendValuesResponse`>
    open fun append(params: `Params$Resource$Spreadsheets$Values$Append`, options: StreamMethodOptions, callback: BodyResponseCallback<Readable>)
    open fun append(params: `Params$Resource$Spreadsheets$Values$Append`, options: BodyResponseCallback<Readable>, callback: BodyResponseCallback<Readable>)
    open fun append(params: `Params$Resource$Spreadsheets$Values$Append`, options: MethodOptions, callback: BodyResponseCallback<`Schema$AppendValuesResponse`>)
    open fun append(params: `Params$Resource$Spreadsheets$Values$Append`, options: BodyResponseCallback<`Schema$AppendValuesResponse`>, callback: BodyResponseCallback<`Schema$AppendValuesResponse`>)
    open fun append(params: `Params$Resource$Spreadsheets$Values$Append`, callback: BodyResponseCallback<`Schema$AppendValuesResponse`>)
    open fun append(callback: BodyResponseCallback<`Schema$AppendValuesResponse`>)
    open fun batchClear(params: `Params$Resource$Spreadsheets$Values$Batchclear`, options: StreamMethodOptions): GaxiosPromise<Readable>
    open fun batchClear(params: `Params$Resource$Spreadsheets$Values$Batchclear` = definedExternally, options: MethodOptions = definedExternally): GaxiosPromise<`Schema$BatchClearValuesResponse`>
    open fun batchClear(): GaxiosPromise<`Schema$BatchClearValuesResponse`>
    open fun batchClear(params: `Params$Resource$Spreadsheets$Values$Batchclear` = definedExternally): GaxiosPromise<`Schema$BatchClearValuesResponse`>
    open fun batchClear(params: `Params$Resource$Spreadsheets$Values$Batchclear`, options: StreamMethodOptions, callback: BodyResponseCallback<Readable>)
    open fun batchClear(params: `Params$Resource$Spreadsheets$Values$Batchclear`, options: BodyResponseCallback<Readable>, callback: BodyResponseCallback<Readable>)
    open fun batchClear(params: `Params$Resource$Spreadsheets$Values$Batchclear`, options: MethodOptions, callback: BodyResponseCallback<`Schema$BatchClearValuesResponse`>)
    open fun batchClear(params: `Params$Resource$Spreadsheets$Values$Batchclear`, options: BodyResponseCallback<`Schema$BatchClearValuesResponse`>, callback: BodyResponseCallback<`Schema$BatchClearValuesResponse`>)
    open fun batchClear(params: `Params$Resource$Spreadsheets$Values$Batchclear`, callback: BodyResponseCallback<`Schema$BatchClearValuesResponse`>)
    open fun batchClear(callback: BodyResponseCallback<`Schema$BatchClearValuesResponse`>)
    open fun batchClearByDataFilter(params: `Params$Resource$Spreadsheets$Values$Batchclearbydatafilter`, options: StreamMethodOptions): GaxiosPromise<Readable>
    open fun batchClearByDataFilter(params: `Params$Resource$Spreadsheets$Values$Batchclearbydatafilter` = definedExternally, options: MethodOptions = definedExternally): GaxiosPromise<`Schema$BatchClearValuesByDataFilterResponse`>
    open fun batchClearByDataFilter(): GaxiosPromise<`Schema$BatchClearValuesByDataFilterResponse`>
    open fun batchClearByDataFilter(params: `Params$Resource$Spreadsheets$Values$Batchclearbydatafilter` = definedExternally): GaxiosPromise<`Schema$BatchClearValuesByDataFilterResponse`>
    open fun batchClearByDataFilter(params: `Params$Resource$Spreadsheets$Values$Batchclearbydatafilter`, options: StreamMethodOptions, callback: BodyResponseCallback<Readable>)
    open fun batchClearByDataFilter(params: `Params$Resource$Spreadsheets$Values$Batchclearbydatafilter`, options: BodyResponseCallback<Readable>, callback: BodyResponseCallback<Readable>)
    open fun batchClearByDataFilter(params: `Params$Resource$Spreadsheets$Values$Batchclearbydatafilter`, options: MethodOptions, callback: BodyResponseCallback<`Schema$BatchClearValuesByDataFilterResponse`>)
    open fun batchClearByDataFilter(params: `Params$Resource$Spreadsheets$Values$Batchclearbydatafilter`, options: BodyResponseCallback<`Schema$BatchClearValuesByDataFilterResponse`>, callback: BodyResponseCallback<`Schema$BatchClearValuesByDataFilterResponse`>)
    open fun batchClearByDataFilter(params: `Params$Resource$Spreadsheets$Values$Batchclearbydatafilter`, callback: BodyResponseCallback<`Schema$BatchClearValuesByDataFilterResponse`>)
    open fun batchClearByDataFilter(callback: BodyResponseCallback<`Schema$BatchClearValuesByDataFilterResponse`>)
    open fun batchGet(params: `Params$Resource$Spreadsheets$Values$Batchget`, options: StreamMethodOptions): GaxiosPromise<Readable>
    open fun batchGet(params: `Params$Resource$Spreadsheets$Values$Batchget` = definedExternally, options: MethodOptions = definedExternally): GaxiosPromise<`Schema$BatchGetValuesResponse`>
    open fun batchGet(): GaxiosPromise<`Schema$BatchGetValuesResponse`>
    open fun batchGet(params: `Params$Resource$Spreadsheets$Values$Batchget` = definedExternally): GaxiosPromise<`Schema$BatchGetValuesResponse`>
    open fun batchGet(params: `Params$Resource$Spreadsheets$Values$Batchget`, options: StreamMethodOptions, callback: BodyResponseCallback<Readable>)
    open fun batchGet(params: `Params$Resource$Spreadsheets$Values$Batchget`, options: BodyResponseCallback<Readable>, callback: BodyResponseCallback<Readable>)
    open fun batchGet(params: `Params$Resource$Spreadsheets$Values$Batchget`, options: MethodOptions, callback: BodyResponseCallback<`Schema$BatchGetValuesResponse`>)
    open fun batchGet(params: `Params$Resource$Spreadsheets$Values$Batchget`, options: BodyResponseCallback<`Schema$BatchGetValuesResponse`>, callback: BodyResponseCallback<`Schema$BatchGetValuesResponse`>)
    open fun batchGet(params: `Params$Resource$Spreadsheets$Values$Batchget`, callback: BodyResponseCallback<`Schema$BatchGetValuesResponse`>)
    open fun batchGet(callback: BodyResponseCallback<`Schema$BatchGetValuesResponse`>)
    open fun batchGetByDataFilter(params: `Params$Resource$Spreadsheets$Values$Batchgetbydatafilter`, options: StreamMethodOptions): GaxiosPromise<Readable>
    open fun batchGetByDataFilter(params: `Params$Resource$Spreadsheets$Values$Batchgetbydatafilter` = definedExternally, options: MethodOptions = definedExternally): GaxiosPromise<`Schema$BatchGetValuesByDataFilterResponse`>
    open fun batchGetByDataFilter(): GaxiosPromise<`Schema$BatchGetValuesByDataFilterResponse`>
    open fun batchGetByDataFilter(params: `Params$Resource$Spreadsheets$Values$Batchgetbydatafilter` = definedExternally): GaxiosPromise<`Schema$BatchGetValuesByDataFilterResponse`>
    open fun batchGetByDataFilter(params: `Params$Resource$Spreadsheets$Values$Batchgetbydatafilter`, options: StreamMethodOptions, callback: BodyResponseCallback<Readable>)
    open fun batchGetByDataFilter(params: `Params$Resource$Spreadsheets$Values$Batchgetbydatafilter`, options: BodyResponseCallback<Readable>, callback: BodyResponseCallback<Readable>)
    open fun batchGetByDataFilter(params: `Params$Resource$Spreadsheets$Values$Batchgetbydatafilter`, options: MethodOptions, callback: BodyResponseCallback<`Schema$BatchGetValuesByDataFilterResponse`>)
    open fun batchGetByDataFilter(params: `Params$Resource$Spreadsheets$Values$Batchgetbydatafilter`, options: BodyResponseCallback<`Schema$BatchGetValuesByDataFilterResponse`>, callback: BodyResponseCallback<`Schema$BatchGetValuesByDataFilterResponse`>)
    open fun batchGetByDataFilter(params: `Params$Resource$Spreadsheets$Values$Batchgetbydatafilter`, callback: BodyResponseCallback<`Schema$BatchGetValuesByDataFilterResponse`>)
    open fun batchGetByDataFilter(callback: BodyResponseCallback<`Schema$BatchGetValuesByDataFilterResponse`>)
    open fun batchUpdate(params: `Params$Resource$Spreadsheets$Values$Batchupdate`, options: StreamMethodOptions): GaxiosPromise<Readable>
    open fun batchUpdate(params: `Params$Resource$Spreadsheets$Values$Batchupdate` = definedExternally, options: MethodOptions = definedExternally): GaxiosPromise<`Schema$BatchUpdateValuesResponse`>
    open fun batchUpdate(): GaxiosPromise<`Schema$BatchUpdateValuesResponse`>
    open fun batchUpdate(params: `Params$Resource$Spreadsheets$Values$Batchupdate` = definedExternally): GaxiosPromise<`Schema$BatchUpdateValuesResponse`>
    open fun batchUpdate(params: `Params$Resource$Spreadsheets$Values$Batchupdate`, options: StreamMethodOptions, callback: BodyResponseCallback<Readable>)
    open fun batchUpdate(params: `Params$Resource$Spreadsheets$Values$Batchupdate`, options: BodyResponseCallback<Readable>, callback: BodyResponseCallback<Readable>)
    open fun batchUpdate(params: `Params$Resource$Spreadsheets$Values$Batchupdate`, options: MethodOptions, callback: BodyResponseCallback<`Schema$BatchUpdateValuesResponse`>)
    open fun batchUpdate(params: `Params$Resource$Spreadsheets$Values$Batchupdate`, options: BodyResponseCallback<`Schema$BatchUpdateValuesResponse`>, callback: BodyResponseCallback<`Schema$BatchUpdateValuesResponse`>)
    open fun batchUpdate(params: `Params$Resource$Spreadsheets$Values$Batchupdate`, callback: BodyResponseCallback<`Schema$BatchUpdateValuesResponse`>)
    open fun batchUpdate(callback: BodyResponseCallback<`Schema$BatchUpdateValuesResponse`>)
    open fun batchUpdateByDataFilter(params: `Params$Resource$Spreadsheets$Values$Batchupdatebydatafilter`, options: StreamMethodOptions): GaxiosPromise<Readable>
    open fun batchUpdateByDataFilter(params: `Params$Resource$Spreadsheets$Values$Batchupdatebydatafilter` = definedExternally, options: MethodOptions = definedExternally): GaxiosPromise<`Schema$BatchUpdateValuesByDataFilterResponse`>
    open fun batchUpdateByDataFilter(): GaxiosPromise<`Schema$BatchUpdateValuesByDataFilterResponse`>
    open fun batchUpdateByDataFilter(params: `Params$Resource$Spreadsheets$Values$Batchupdatebydatafilter` = definedExternally): GaxiosPromise<`Schema$BatchUpdateValuesByDataFilterResponse`>
    open fun batchUpdateByDataFilter(params: `Params$Resource$Spreadsheets$Values$Batchupdatebydatafilter`, options: StreamMethodOptions, callback: BodyResponseCallback<Readable>)
    open fun batchUpdateByDataFilter(params: `Params$Resource$Spreadsheets$Values$Batchupdatebydatafilter`, options: BodyResponseCallback<Readable>, callback: BodyResponseCallback<Readable>)
    open fun batchUpdateByDataFilter(params: `Params$Resource$Spreadsheets$Values$Batchupdatebydatafilter`, options: MethodOptions, callback: BodyResponseCallback<`Schema$BatchUpdateValuesByDataFilterResponse`>)
    open fun batchUpdateByDataFilter(params: `Params$Resource$Spreadsheets$Values$Batchupdatebydatafilter`, options: BodyResponseCallback<`Schema$BatchUpdateValuesByDataFilterResponse`>, callback: BodyResponseCallback<`Schema$BatchUpdateValuesByDataFilterResponse`>)
    open fun batchUpdateByDataFilter(params: `Params$Resource$Spreadsheets$Values$Batchupdatebydatafilter`, callback: BodyResponseCallback<`Schema$BatchUpdateValuesByDataFilterResponse`>)
    open fun batchUpdateByDataFilter(callback: BodyResponseCallback<`Schema$BatchUpdateValuesByDataFilterResponse`>)
    open fun clear(params: `Params$Resource$Spreadsheets$Values$Clear`, options: StreamMethodOptions): GaxiosPromise<Readable>
    open fun clear(params: `Params$Resource$Spreadsheets$Values$Clear` = definedExternally, options: MethodOptions = definedExternally): GaxiosPromise<`Schema$ClearValuesResponse`>
    open fun clear(): GaxiosPromise<`Schema$ClearValuesResponse`>
    open fun clear(params: `Params$Resource$Spreadsheets$Values$Clear` = definedExternally): GaxiosPromise<`Schema$ClearValuesResponse`>
    open fun clear(params: `Params$Resource$Spreadsheets$Values$Clear`, options: StreamMethodOptions, callback: BodyResponseCallback<Readable>)
    open fun clear(params: `Params$Resource$Spreadsheets$Values$Clear`, options: BodyResponseCallback<Readable>, callback: BodyResponseCallback<Readable>)
    open fun clear(params: `Params$Resource$Spreadsheets$Values$Clear`, options: MethodOptions, callback: BodyResponseCallback<`Schema$ClearValuesResponse`>)
    open fun clear(params: `Params$Resource$Spreadsheets$Values$Clear`, options: BodyResponseCallback<`Schema$ClearValuesResponse`>, callback: BodyResponseCallback<`Schema$ClearValuesResponse`>)
    open fun clear(params: `Params$Resource$Spreadsheets$Values$Clear`, callback: BodyResponseCallback<`Schema$ClearValuesResponse`>)
    open fun clear(callback: BodyResponseCallback<`Schema$ClearValuesResponse`>)
    open fun get(params: `Params$Resource$Spreadsheets$Values$Get`, options: StreamMethodOptions): GaxiosPromise<Readable>
    open fun get(params: `Params$Resource$Spreadsheets$Values$Get` = definedExternally, options: MethodOptions = definedExternally): GaxiosPromise<`Schema$ValueRange`>
    open fun get(): GaxiosPromise<`Schema$ValueRange`>
    open fun get(params: `Params$Resource$Spreadsheets$Values$Get` = definedExternally): GaxiosPromise<`Schema$ValueRange`>
    open fun get(params: `Params$Resource$Spreadsheets$Values$Get`, options: StreamMethodOptions, callback: BodyResponseCallback<Readable>)
    open fun get(params: `Params$Resource$Spreadsheets$Values$Get`, options: BodyResponseCallback<Readable>, callback: BodyResponseCallback<Readable>)
    open fun get(params: `Params$Resource$Spreadsheets$Values$Get`, options: MethodOptions, callback: BodyResponseCallback<`Schema$ValueRange`>)
    open fun get(params: `Params$Resource$Spreadsheets$Values$Get`, options: BodyResponseCallback<`Schema$ValueRange`>, callback: BodyResponseCallback<`Schema$ValueRange`>)
    open fun get(params: `Params$Resource$Spreadsheets$Values$Get`, callback: BodyResponseCallback<`Schema$ValueRange`>)
    open fun get(callback: BodyResponseCallback<`Schema$ValueRange`>)
    open fun update(params: `Params$Resource$Spreadsheets$Values$Update`, options: StreamMethodOptions): GaxiosPromise<Readable>
    open fun update(params: `Params$Resource$Spreadsheets$Values$Update` = definedExternally, options: MethodOptions = definedExternally): GaxiosPromise<`Schema$UpdateValuesResponse`>
    open fun update(): GaxiosPromise<`Schema$UpdateValuesResponse`>
    open fun update(params: `Params$Resource$Spreadsheets$Values$Update` = definedExternally): GaxiosPromise<`Schema$UpdateValuesResponse`>
    open fun update(params: `Params$Resource$Spreadsheets$Values$Update`, options: StreamMethodOptions, callback: BodyResponseCallback<Readable>)
    open fun update(params: `Params$Resource$Spreadsheets$Values$Update`, options: BodyResponseCallback<Readable>, callback: BodyResponseCallback<Readable>)
    open fun update(params: `Params$Resource$Spreadsheets$Values$Update`, options: MethodOptions, callback: BodyResponseCallback<`Schema$UpdateValuesResponse`>)
    open fun update(params: `Params$Resource$Spreadsheets$Values$Update`, options: BodyResponseCallback<`Schema$UpdateValuesResponse`>, callback: BodyResponseCallback<`Schema$UpdateValuesResponse`>)
    open fun update(params: `Params$Resource$Spreadsheets$Values$Update`, callback: BodyResponseCallback<`Schema$UpdateValuesResponse`>)
    open fun update(callback: BodyResponseCallback<`Schema$UpdateValuesResponse`>)
}

external interface `Params$Resource$Spreadsheets$Values$Append` : StandardParameters {
    var includeValuesInResponse: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var insertDataOption: String?
        get() = definedExternally
        set(value) = definedExternally
    var range: String?
        get() = definedExternally
        set(value) = definedExternally
    var responseDateTimeRenderOption: String?
        get() = definedExternally
        set(value) = definedExternally
    var responseValueRenderOption: String?
        get() = definedExternally
        set(value) = definedExternally
    var spreadsheetId: String?
        get() = definedExternally
        set(value) = definedExternally
    var valueInputOption: String?
        get() = definedExternally
        set(value) = definedExternally
    var requestBody: `Schema$ValueRange`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Params$Resource$Spreadsheets$Values$Batchclear` : StandardParameters {
    var spreadsheetId: String?
        get() = definedExternally
        set(value) = definedExternally
    var requestBody: `Schema$BatchClearValuesRequest`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Params$Resource$Spreadsheets$Values$Batchclearbydatafilter` : StandardParameters {
    var spreadsheetId: String?
        get() = definedExternally
        set(value) = definedExternally
    var requestBody: `Schema$BatchClearValuesByDataFilterRequest`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Params$Resource$Spreadsheets$Values$Batchget` : StandardParameters {
    var dateTimeRenderOption: String?
        get() = definedExternally
        set(value) = definedExternally
    var majorDimension: String?
        get() = definedExternally
        set(value) = definedExternally
    var ranges: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var spreadsheetId: String?
        get() = definedExternally
        set(value) = definedExternally
    var valueRenderOption: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Params$Resource$Spreadsheets$Values$Batchgetbydatafilter` : StandardParameters {
    var spreadsheetId: String?
        get() = definedExternally
        set(value) = definedExternally
    var requestBody: `Schema$BatchGetValuesByDataFilterRequest`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Params$Resource$Spreadsheets$Values$Batchupdate` : StandardParameters {
    var spreadsheetId: String?
        get() = definedExternally
        set(value) = definedExternally
    var requestBody: `Schema$BatchUpdateValuesRequest`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Params$Resource$Spreadsheets$Values$Batchupdatebydatafilter` : StandardParameters {
    var spreadsheetId: String?
        get() = definedExternally
        set(value) = definedExternally
    var requestBody: `Schema$BatchUpdateValuesByDataFilterRequest`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Params$Resource$Spreadsheets$Values$Clear` : StandardParameters {
    var range: String?
        get() = definedExternally
        set(value) = definedExternally
    var spreadsheetId: String?
        get() = definedExternally
        set(value) = definedExternally
    var requestBody: `Schema$ClearValuesRequest`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Params$Resource$Spreadsheets$Values$Get` : StandardParameters {
    var dateTimeRenderOption: String?
        get() = definedExternally
        set(value) = definedExternally
    var majorDimension: String?
        get() = definedExternally
        set(value) = definedExternally
    var range: String?
        get() = definedExternally
        set(value) = definedExternally
    var spreadsheetId: String?
        get() = definedExternally
        set(value) = definedExternally
    var valueRenderOption: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `Params$Resource$Spreadsheets$Values$Update` : StandardParameters {
    var includeValuesInResponse: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var range: String?
        get() = definedExternally
        set(value) = definedExternally
    var responseDateTimeRenderOption: String?
        get() = definedExternally
        set(value) = definedExternally
    var responseValueRenderOption: String?
        get() = definedExternally
        set(value) = definedExternally
    var spreadsheetId: String?
        get() = definedExternally
        set(value) = definedExternally
    var valueInputOption: String?
        get() = definedExternally
        set(value) = definedExternally
    var requestBody: `Schema$ValueRange`?
        get() = definedExternally
        set(value) = definedExternally
}