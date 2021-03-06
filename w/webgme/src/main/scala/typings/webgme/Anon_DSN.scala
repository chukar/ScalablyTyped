package typings.webgme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DSN extends js.Object {
  var DSN: String
  var enable: Boolean
  var ravenOptions: Null | String
}

object Anon_DSN {
  @scala.inline
  def apply(DSN: String, enable: Boolean, ravenOptions: String = null): Anon_DSN = {
    val __obj = js.Dynamic.literal(DSN = DSN.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any])
    if (ravenOptions != null) __obj.updateDynamic("ravenOptions")(ravenOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DSN]
  }
}

