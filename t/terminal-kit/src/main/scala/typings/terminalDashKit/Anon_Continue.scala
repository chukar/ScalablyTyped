package typings.terminalDashKit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Continue extends js.Object {
  var continue: js.UndefOr[Boolean] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var width: Null | Double
  var x: Double
}

object Anon_Continue {
  @scala.inline
  def apply(
    x: Double,
    continue: js.UndefOr[Boolean] = js.undefined,
    offset: Int | Double = null,
    width: Int | Double = null
  ): Anon_Continue = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any])
    if (!js.isUndefined(continue)) __obj.updateDynamic("continue")(continue.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Continue]
  }
}

