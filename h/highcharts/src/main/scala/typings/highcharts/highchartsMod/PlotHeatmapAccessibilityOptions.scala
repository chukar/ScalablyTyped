package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotHeatmapAccessibilityOptions extends js.Object {
  /**
    * (Highcharts, Highmaps) Provide a description of the series, announced to
    * screen readers.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highmaps) Enable/disable accessibility functionality for a
    * specific series.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highmaps) Expose only the series element to screen readers,
    * not its points.
    */
  var exposeAsGroupOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highmaps) Keyboard navigation for a series
    */
  var keyboardNavigation: js.UndefOr[js.Object | PlotHeatmapAccessibilityKeyboardNavigationOptions] = js.undefined
  /**
    * (Highcharts, Highmaps) Formatter function to use instead of the default
    * for point descriptions. Same as
    * `accessibility.pointDescriptionFormatter`, but for a single series.
    */
  var pointDescriptionFormatter: js.UndefOr[js.Function] = js.undefined
}

object PlotHeatmapAccessibilityOptions {
  @scala.inline
  def apply(
    description: String = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    exposeAsGroupOnly: js.UndefOr[Boolean] = js.undefined,
    keyboardNavigation: js.Object | PlotHeatmapAccessibilityKeyboardNavigationOptions = null,
    pointDescriptionFormatter: js.Function = null
  ): PlotHeatmapAccessibilityOptions = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (!js.isUndefined(exposeAsGroupOnly)) __obj.updateDynamic("exposeAsGroupOnly")(exposeAsGroupOnly.asInstanceOf[js.Any])
    if (keyboardNavigation != null) __obj.updateDynamic("keyboardNavigation")(keyboardNavigation.asInstanceOf[js.Any])
    if (pointDescriptionFormatter != null) __obj.updateDynamic("pointDescriptionFormatter")(pointDescriptionFormatter.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotHeatmapAccessibilityOptions]
  }
}

