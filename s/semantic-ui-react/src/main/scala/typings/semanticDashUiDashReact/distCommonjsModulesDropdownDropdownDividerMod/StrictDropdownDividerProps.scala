package typings.semanticDashUiDashReact.distCommonjsModulesDropdownDropdownDividerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictDropdownDividerProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[String] = js.undefined
}

object StrictDropdownDividerProps {
  @scala.inline
  def apply(as: js.Any = null, className: String = null): StrictDropdownDividerProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictDropdownDividerProps]
  }
}

