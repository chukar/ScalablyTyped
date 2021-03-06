package typings.kendoDashUi.kendo.ooxml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookEvent extends js.Object {
  var preventDefault: js.Function
  var sender: Workbook
  def isDefaultPrevented(): Boolean
}

object WorkbookEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Workbook): WorkbookEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WorkbookEvent]
  }
}

