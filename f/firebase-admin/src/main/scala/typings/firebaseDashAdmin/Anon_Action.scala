package typings.firebaseDashAdmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Action extends js.Object {
  /**
    * An action available to the user when the notification is presented
    */
  var action: String
  /**
    * Optional icon for a notification action.
    */
  var icon: js.UndefOr[String] = js.undefined
  /**
    * Title of the notification action.
    */
  var title: String
}

object Anon_Action {
  @scala.inline
  def apply(action: String, title: String, icon: String = null): Anon_Action = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Action]
  }
}

