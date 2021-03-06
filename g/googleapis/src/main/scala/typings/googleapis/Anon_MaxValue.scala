package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_MaxValue extends js.Object {
  var maxValue: js.UndefOr[Double] = js.native
  var minValue: js.UndefOr[Double] = js.native
}

object Anon_MaxValue {
  @scala.inline
  def apply(maxValue: Int | Double = null, minValue: Int | Double = null): Anon_MaxValue = {
    val __obj = js.Dynamic.literal()
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MaxValue]
  }
}

