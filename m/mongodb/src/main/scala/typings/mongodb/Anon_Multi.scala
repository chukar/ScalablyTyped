package typings.mongodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Multi extends js.Object {
  var multi: js.UndefOr[Boolean] = js.undefined
}

object Anon_Multi {
  @scala.inline
  def apply(multi: js.UndefOr[Boolean] = js.undefined): Anon_Multi = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(multi)) __obj.updateDynamic("multi")(multi.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Multi]
  }
}

