package typings.jpm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ScriptBoolean extends js.Object {
  var script: js.UndefOr[Boolean] = js.undefined
}

object Anon_ScriptBoolean {
  @scala.inline
  def apply(script: js.UndefOr[Boolean] = js.undefined): Anon_ScriptBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(script)) __obj.updateDynamic("script")(script.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ScriptBoolean]
  }
}

