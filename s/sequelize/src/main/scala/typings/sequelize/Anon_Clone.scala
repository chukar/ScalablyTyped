package typings.sequelize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Clone extends js.Object {
  @JSName("clone")
  var clone_FAnon_Clone: js.UndefOr[Boolean] = js.undefined
  var plain: js.UndefOr[Boolean] = js.undefined
}

object Anon_Clone {
  @scala.inline
  def apply(clone: js.UndefOr[Boolean] = js.undefined, plain: js.UndefOr[Boolean] = js.undefined): Anon_Clone = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clone)) __obj.updateDynamic("clone")(clone.asInstanceOf[js.Any])
    if (!js.isUndefined(plain)) __obj.updateDynamic("plain")(plain.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Clone]
  }
}

