package typings.apolloDashServerDashCaching

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ttl extends js.Object {
  var ttl: js.UndefOr[Double] = js.undefined
}

object Anon_Ttl {
  @scala.inline
  def apply(ttl: Int | Double = null): Anon_Ttl = {
    val __obj = js.Dynamic.literal()
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Ttl]
  }
}

