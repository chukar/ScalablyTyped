package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemStyleLabelLineStyle extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-sankey.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[Anon_BorderColorBorderType] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-sankey.emphasis.label
    */
  var label: js.UndefOr[Anon_AlignBackgroundColorBorderColor] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-sankey.emphasis.lineStyle
    */
  var lineStyle: js.UndefOr[Anon_ColorCurvenessOpacityShadowBlur] = js.undefined
}

object Anon_ItemStyleLabelLineStyle {
  @scala.inline
  def apply(
    itemStyle: Anon_BorderColorBorderType = null,
    label: Anon_AlignBackgroundColorBorderColor = null,
    lineStyle: Anon_ColorCurvenessOpacityShadowBlur = null
  ): Anon_ItemStyleLabelLineStyle = {
    val __obj = js.Dynamic.literal()
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ItemStyleLabelLineStyle]
  }
}

