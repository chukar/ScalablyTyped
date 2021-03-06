package typings.sharepoint.SP.JsGrid.EventArgs

import typings.microsoftDashAjax.Sys.UI.DomEvent
import typings.sharepoint.SP.JsGrid.ClickContext
import typings.sharepoint.SP.JsGrid.IEventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.EventArgs.Click")
@js.native
class Click protected () extends IEventArgs {
  def this(eventInfo: DomEvent, context: ClickContext, recordKey: Double, fieldKey: String) = this()
  var context: ClickContext = js.native
  var eventInfo: DomEvent = js.native
  var fieldKey: String = js.native
  var recordKey: Double = js.native
}

