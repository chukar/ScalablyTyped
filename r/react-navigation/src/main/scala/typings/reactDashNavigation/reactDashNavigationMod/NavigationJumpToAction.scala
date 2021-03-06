package typings.reactDashNavigation.reactDashNavigationMod

import typings.reactDashNavigation.reactDashNavigationStrings.NavigationSlashJUMP_TO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationJumpToAction extends js.Object {
  var key: String
  var params: js.UndefOr[NavigationParams] = js.undefined
  var preserveFocus: Boolean
  var routeName: String
  var `type`: NavigationSlashJUMP_TO
}

object NavigationJumpToAction {
  @scala.inline
  def apply(
    key: String,
    preserveFocus: Boolean,
    routeName: String,
    `type`: NavigationSlashJUMP_TO,
    params: NavigationParams = null
  ): NavigationJumpToAction = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], preserveFocus = preserveFocus.asInstanceOf[js.Any], routeName = routeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationJumpToAction]
  }
}

