package typings.activexDashWord

import typings.activexDashWord.Word.ProtectedViewWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelPvWindow extends js.Object {
  var Cancel: Boolean
  val PvWindow: ProtectedViewWindow
}

object Anon_CancelPvWindow {
  @scala.inline
  def apply(Cancel: Boolean, PvWindow: ProtectedViewWindow): Anon_CancelPvWindow = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], PvWindow = PvWindow.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CancelPvWindow]
  }
}

