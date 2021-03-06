package typings.kendoDashUi.kendo.mobile.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewTransitionEndEvent extends ViewEvent {
  var `type`: js.UndefOr[String] = js.undefined
}

object ViewTransitionEndEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: View,
    `type`: String = null
  ): ViewTransitionEndEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewTransitionEndEvent]
  }
}

