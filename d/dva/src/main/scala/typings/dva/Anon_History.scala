package typings.dva

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_History extends js.Object {
  var history: js.UndefOr[js.Object] = js.undefined
  var initialState: js.UndefOr[js.Object] = js.undefined
}

object Anon_History {
  @scala.inline
  def apply(history: js.Object = null, initialState: js.Object = null): Anon_History = {
    val __obj = js.Dynamic.literal()
    if (history != null) __obj.updateDynamic("history")(history.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_History]
  }
}

