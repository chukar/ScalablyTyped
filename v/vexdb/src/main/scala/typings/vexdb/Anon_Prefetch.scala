package typings.vexdb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Prefetch extends js.Object {
  var prefetch: js.UndefOr[Boolean] = js.undefined
}

object Anon_Prefetch {
  @scala.inline
  def apply(prefetch: js.UndefOr[Boolean] = js.undefined): Anon_Prefetch = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(prefetch)) __obj.updateDynamic("prefetch")(prefetch.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Prefetch]
  }
}

