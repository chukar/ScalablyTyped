package typings.kendoDashUi.kendo.dataviz.ui

import typings.kendoDashUi.kendo.dataviz.diagram.Connection
import typings.kendoDashUi.kendo.dataviz.diagram.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramAddEvent extends DiagramEvent {
  var connection: js.UndefOr[Connection] = js.undefined
  var shape: js.UndefOr[Shape] = js.undefined
}

object DiagramAddEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Diagram,
    connection: Connection = null,
    shape: Shape = null
  ): DiagramAddEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    if (connection != null) __obj.updateDynamic("connection")(connection.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramAddEvent]
  }
}

