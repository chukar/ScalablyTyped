package typings.officeDashUiDashFabricDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyNumber extends js.Object {
  var key: js.UndefOr[String | Double] = js.undefined
}

object Anon_KeyNumber {
  @scala.inline
  def apply(key: String | Double = null): Anon_KeyNumber = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_KeyNumber]
  }
}

