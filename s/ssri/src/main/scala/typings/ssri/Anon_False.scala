package typings.ssri

import typings.ssri.ssriBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_False extends js.Object {
  var single: js.UndefOr[`false`] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
}

object Anon_False {
  @scala.inline
  def apply(single: `false` = null, strict: js.UndefOr[Boolean] = js.undefined): Anon_False = {
    val __obj = js.Dynamic.literal()
    if (single != null) __obj.updateDynamic("single")(single.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_False]
  }
}

