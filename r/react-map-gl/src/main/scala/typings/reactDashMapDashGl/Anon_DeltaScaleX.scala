package typings.reactDashMapDashGl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeltaScaleX extends js.Object {
  var deltaScaleX: js.UndefOr[Double] = js.undefined
  var deltaScaleY: js.UndefOr[Double] = js.undefined
}

object Anon_DeltaScaleX {
  @scala.inline
  def apply(deltaScaleX: Int | Double = null, deltaScaleY: Int | Double = null): Anon_DeltaScaleX = {
    val __obj = js.Dynamic.literal()
    if (deltaScaleX != null) __obj.updateDynamic("deltaScaleX")(deltaScaleX.asInstanceOf[js.Any])
    if (deltaScaleY != null) __obj.updateDynamic("deltaScaleY")(deltaScaleY.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DeltaScaleX]
  }
}

