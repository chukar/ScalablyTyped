package typings.historyDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HashChange extends js.Object {
  var hashChange: js.UndefOr[js.Any] = js.undefined
  var pushState: js.UndefOr[js.Any] = js.undefined
}

object Anon_HashChange {
  @scala.inline
  def apply(hashChange: js.Any = null, pushState: js.Any = null): Anon_HashChange = {
    val __obj = js.Dynamic.literal()
    if (hashChange != null) __obj.updateDynamic("hashChange")(hashChange.asInstanceOf[js.Any])
    if (pushState != null) __obj.updateDynamic("pushState")(pushState.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HashChange]
  }
}

