package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropDownListFilteringEvent extends DropDownListEvent {
  var filter: js.UndefOr[js.Any] = js.undefined
}

object DropDownListFilteringEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: DropDownList,
    filter: js.Any = null
  ): DropDownListFilteringEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropDownListFilteringEvent]
  }
}

