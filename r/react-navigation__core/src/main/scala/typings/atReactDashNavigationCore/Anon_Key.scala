package typings.atReactDashNavigationCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key extends js.Object {
  var key: String
  var params: js.UndefOr[js.Object] = js.undefined
  var routeName: String
}

object Anon_Key {
  @scala.inline
  def apply(key: String, routeName: String, params: js.Object = null): Anon_Key = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], routeName = routeName.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Key]
  }
}

