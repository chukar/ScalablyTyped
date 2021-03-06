package typings.officeDashJsDashPreview.Excel.Interfaces

import typings.officeDashJsDashPreview.Excel.ChartMarkerStyle
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Automatic
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Circle
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Dash
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Diamond
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Dot
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Invalid
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.None
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Picture
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Plus
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Square
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Star
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Triangle
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ChartPoint object, for use in `chartPoint.set({ ... })`. */
trait ChartPointUpdateData extends js.Object {
  /**
    *
    * Returns the data label of a chart point.
    *
    * [Api set: ExcelApi 1.7]
    */
  var dataLabel: js.UndefOr[ChartDataLabelUpdateData] = js.undefined
  /**
    *
    * Encapsulates the format properties chart point.
    *
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[ChartPointFormatUpdateData] = js.undefined
  /**
    *
    * Represents whether a data point has a data label. Not applicable for surface charts.
    *
    * [Api set: ExcelApi 1.7]
    */
  var hasDataLabel: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * HTML color code representation of the marker background color of data point. E.g. #FF0000 represents Red.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerBackgroundColor: js.UndefOr[String] = js.undefined
  /**
    *
    * HTML color code representation of the marker foreground color of data point. E.g. #FF0000 represents Red.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerForegroundColor: js.UndefOr[String] = js.undefined
  /**
    *
    * Represents marker size of data point.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerSize: js.UndefOr[Double] = js.undefined
  /**
    *
    * Represents marker style of a chart data point. See Excel.ChartMarkerStyle for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerStyle: js.UndefOr[
    ChartMarkerStyle | Invalid | Automatic | None | Square | Diamond | Triangle | X | Star | Dot | Dash | Circle | Plus | Picture
  ] = js.undefined
}

object ChartPointUpdateData {
  @scala.inline
  def apply(
    dataLabel: ChartDataLabelUpdateData = null,
    format: ChartPointFormatUpdateData = null,
    hasDataLabel: js.UndefOr[Boolean] = js.undefined,
    markerBackgroundColor: String = null,
    markerForegroundColor: String = null,
    markerSize: Int | Double = null,
    markerStyle: ChartMarkerStyle | Invalid | Automatic | None | Square | Diamond | Triangle | X | Star | Dot | Dash | Circle | Plus | Picture = null
  ): ChartPointUpdateData = {
    val __obj = js.Dynamic.literal()
    if (dataLabel != null) __obj.updateDynamic("dataLabel")(dataLabel.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(hasDataLabel)) __obj.updateDynamic("hasDataLabel")(hasDataLabel.asInstanceOf[js.Any])
    if (markerBackgroundColor != null) __obj.updateDynamic("markerBackgroundColor")(markerBackgroundColor.asInstanceOf[js.Any])
    if (markerForegroundColor != null) __obj.updateDynamic("markerForegroundColor")(markerForegroundColor.asInstanceOf[js.Any])
    if (markerSize != null) __obj.updateDynamic("markerSize")(markerSize.asInstanceOf[js.Any])
    if (markerStyle != null) __obj.updateDynamic("markerStyle")(markerStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartPointUpdateData]
  }
}

