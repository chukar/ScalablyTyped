package typings.amcharts

import typings.amcharts.amChartMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChartDataItemType extends js.Object {
  var chart: default
   // Always "rollOverSlice".
  var dataItem: typings.amcharts.sliceMod.default
  var `type`: String
}

object Anon_ChartDataItemType {
  @scala.inline
  def apply(chart: default, dataItem: typings.amcharts.sliceMod.default, `type`: String): Anon_ChartDataItemType = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], dataItem = dataItem.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ChartDataItemType]
  }
}

