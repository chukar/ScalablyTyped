package typings.kendoDashUi.kendo.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GradientEvent extends js.Object {
  var preventDefault: js.Function
  var sender: Gradient
  def isDefaultPrevented(): Boolean
}

object GradientEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Gradient): GradientEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GradientEvent]
  }
}

