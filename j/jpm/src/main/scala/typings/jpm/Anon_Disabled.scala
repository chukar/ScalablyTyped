package typings.jpm

import typings.jpm.FFAddonSDK.Icon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Disabled extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[Icon] = js.undefined
  var label: js.UndefOr[String] = js.undefined
}

object Anon_Disabled {
  @scala.inline
  def apply(disabled: js.UndefOr[Boolean] = js.undefined, icon: Icon = null, label: String = null): Anon_Disabled = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Disabled]
  }
}

