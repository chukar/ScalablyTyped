package typings.rrc.rrcMod

import typings.history.historyMod.Location
import typings.history.historyMod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnUpdateProps extends js.Object {
  var call: OnUpdateCall
  var immediate: js.UndefOr[Boolean] = js.undefined
}

object OnUpdateProps {
  @scala.inline
  def apply(
    call: /* location */ Location[LocationState] => Unit,
    immediate: js.UndefOr[Boolean] = js.undefined
  ): OnUpdateProps = {
    val __obj = js.Dynamic.literal(call = js.Any.fromFunction1(call))
    if (!js.isUndefined(immediate)) __obj.updateDynamic("immediate")(immediate.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnUpdateProps]
  }
}

