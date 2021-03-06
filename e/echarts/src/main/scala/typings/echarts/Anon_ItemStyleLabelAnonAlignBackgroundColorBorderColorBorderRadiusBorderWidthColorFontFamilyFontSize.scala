package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemStyleLabelAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthColorFontFamilyFontSize extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-pie.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[Anon_BorderColorBorderType] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-pie.emphasis.label
    */
  var label: js.UndefOr[
    Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidthColorFontFamilyFontSize
  ] = js.undefined
}

object Anon_ItemStyleLabelAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthColorFontFamilyFontSize {
  @scala.inline
  def apply(
    itemStyle: Anon_BorderColorBorderType = null,
    label: Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidthColorFontFamilyFontSize = null
  ): Anon_ItemStyleLabelAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthColorFontFamilyFontSize = {
    val __obj = js.Dynamic.literal()
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ItemStyleLabelAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthColorFontFamilyFontSize]
  }
}

