package typings.kendoDashUi.kendo.ui

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanelBarActivateEvent extends PanelBarEvent {
  var item: js.UndefOr[Element] = js.undefined
}

object PanelBarActivateEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: PanelBar,
    item: Element = null
  ): PanelBarActivateEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanelBarActivateEvent]
  }
}

