package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemStyleLabelAnonBackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceFontFamilyFontSize extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-themeRiver.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[Anon_BorderColorBorderType] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-themeRiver.emphasis.label
    */
  var label: js.UndefOr[
    Anon_BackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceFontFamilyFontSize
  ] = js.undefined
}

object Anon_ItemStyleLabelAnonBackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceFontFamilyFontSize {
  @scala.inline
  def apply(
    itemStyle: Anon_BorderColorBorderType = null,
    label: Anon_BackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceFontFamilyFontSize = null
  ): Anon_ItemStyleLabelAnonBackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceFontFamilyFontSize = {
    val __obj = js.Dynamic.literal()
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ItemStyleLabelAnonBackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceFontFamilyFontSize]
  }
}

