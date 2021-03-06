package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AreaColorEmphasis extends js.Object {
  /**
    * Area filling color.
    *
    *
    * @default
    * "#eee"
    * @see https://echarts.apache.org/en/option.html#series-map.itemStyle.areaColor
    */
  var areaColor: js.UndefOr[Anon_BorderColorBorderType] = js.undefined
  /**
    * Map area style in highlighted state.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.itemStyle.emphasis
    */
  var emphasis: js.UndefOr[Anon_AreaColor] = js.undefined
}

object Anon_AreaColorEmphasis {
  @scala.inline
  def apply(areaColor: Anon_BorderColorBorderType = null, emphasis: Anon_AreaColor = null): Anon_AreaColorEmphasis = {
    val __obj = js.Dynamic.literal()
    if (areaColor != null) __obj.updateDynamic("areaColor")(areaColor.asInstanceOf[js.Any])
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AreaColorEmphasis]
  }
}

