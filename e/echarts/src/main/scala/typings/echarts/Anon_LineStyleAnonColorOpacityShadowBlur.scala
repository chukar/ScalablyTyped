package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LineStyleAnonColorOpacityShadowBlur extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-parallel.data.emphasis.lineStyle
    */
  var lineStyle: js.UndefOr[Anon_ColorOpacityShadowBlur] = js.undefined
}

object Anon_LineStyleAnonColorOpacityShadowBlur {
  @scala.inline
  def apply(lineStyle: Anon_ColorOpacityShadowBlur = null): Anon_LineStyleAnonColorOpacityShadowBlur = {
    val __obj = js.Dynamic.literal()
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_LineStyleAnonColorOpacityShadowBlur]
  }
}

