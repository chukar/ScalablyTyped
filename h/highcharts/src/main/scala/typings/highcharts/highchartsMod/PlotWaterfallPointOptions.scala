package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotWaterfallPointOptions extends js.Object {
  /**
    * (Highcharts) Events for each single point.
    */
  var events: js.UndefOr[PlotWaterfallPointEventsOptions] = js.undefined
}

object PlotWaterfallPointOptions {
  @scala.inline
  def apply(events: PlotWaterfallPointEventsOptions = null): PlotWaterfallPointOptions = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotWaterfallPointOptions]
  }
}

