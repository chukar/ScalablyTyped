package typings.openlayers.openlayersMod.olx.animation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoomOptions extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
  var easing: js.UndefOr[js.Function1[/* t */ Double, Double]] = js.undefined
  var resolution: Double
  var start: js.UndefOr[Double] = js.undefined
}

object ZoomOptions {
  @scala.inline
  def apply(
    resolution: Double,
    duration: Int | Double = null,
    easing: /* t */ Double => Double = null,
    start: Int | Double = null
  ): ZoomOptions = {
    val __obj = js.Dynamic.literal(resolution = resolution.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(js.Any.fromFunction1(easing))
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoomOptions]
  }
}

