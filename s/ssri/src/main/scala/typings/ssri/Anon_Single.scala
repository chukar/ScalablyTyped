package typings.ssri

import typings.ssri.ssriBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Single extends js.Object {
  var single: `true`
  var strict: js.UndefOr[Boolean] = js.undefined
}

object Anon_Single {
  @scala.inline
  def apply(single: `true`, strict: js.UndefOr[Boolean] = js.undefined): Anon_Single = {
    val __obj = js.Dynamic.literal(single = single.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Single]
  }
}

