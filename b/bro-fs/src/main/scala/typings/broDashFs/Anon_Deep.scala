package typings.broDashFs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Deep extends js.Object {
  var deep: js.UndefOr[Boolean] = js.undefined
}

object Anon_Deep {
  @scala.inline
  def apply(deep: js.UndefOr[Boolean] = js.undefined): Anon_Deep = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deep)) __obj.updateDynamic("deep")(deep.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Deep]
  }
}

