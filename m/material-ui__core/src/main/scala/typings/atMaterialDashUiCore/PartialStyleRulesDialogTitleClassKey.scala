package typings.atMaterialDashUiCore

import typings.atMaterialDashUiCore.stylesWithStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/DialogTitle.DialogTitleClassKey>> */
@js.native
trait PartialStyleRulesDialogTitleClassKey extends js.Object {
  var root: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesDialogTitleClassKey {
  @scala.inline
  def apply(root: CSSProperties = null): PartialStyleRulesDialogTitleClassKey = {
    val __obj = js.Dynamic.literal()
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStyleRulesDialogTitleClassKey]
  }
}

