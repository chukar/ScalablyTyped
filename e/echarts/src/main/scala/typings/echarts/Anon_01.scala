package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_01 extends js.Object {
  /**
    * Specify the left-top point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.0
    */
  var `0`: js.UndefOr[Anon_CoordItemStyle] = js.undefined
  /**
    * Specify the right-bottom point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.1
    */
  var `1`: js.UndefOr[Anon_CoordItemStyle] = js.undefined
}

object Anon_01 {
  @scala.inline
  def apply(`0`: Anon_CoordItemStyle = null, `1`: Anon_CoordItemStyle = null): Anon_01 = {
    val __obj = js.Dynamic.literal()
    if (`0` != null) __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    if (`1` != null) __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_01]
  }
}

