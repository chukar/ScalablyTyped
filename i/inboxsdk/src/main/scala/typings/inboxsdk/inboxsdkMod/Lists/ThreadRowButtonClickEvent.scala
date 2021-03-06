package typings.inboxsdk.inboxsdkMod.Lists

import typings.inboxsdk.inboxsdkMod.Common.DropdownView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreadRowButtonClickEvent extends js.Object {
  var dropdown: js.UndefOr[DropdownView] = js.undefined
  var threadRowView: ThreadRowView
}

object ThreadRowButtonClickEvent {
  @scala.inline
  def apply(threadRowView: ThreadRowView, dropdown: DropdownView = null): ThreadRowButtonClickEvent = {
    val __obj = js.Dynamic.literal(threadRowView = threadRowView.asInstanceOf[js.Any])
    if (dropdown != null) __obj.updateDynamic("dropdown")(dropdown.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreadRowButtonClickEvent]
  }
}

