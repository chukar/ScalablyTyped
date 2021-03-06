package typings.chromeDashApps.WebView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnShowEvent extends js.Object {
  /** Call this to prevent showing the context menu. */
  def preventDefault(): Unit
}

object OnShowEvent {
  @scala.inline
  def apply(preventDefault: () => Unit): OnShowEvent = {
    val __obj = js.Dynamic.literal(preventDefault = js.Any.fromFunction0(preventDefault))
  
    __obj.asInstanceOf[OnShowEvent]
  }
}

