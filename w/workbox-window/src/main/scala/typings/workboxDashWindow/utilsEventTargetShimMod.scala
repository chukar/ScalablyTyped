package typings.workboxDashWindow

import typings.workboxDashWindow.typesWorkboxEventMod.WorkboxEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-window/utils/EventTargetShim", JSImport.Namespace)
@js.native
object utilsEventTargetShimMod extends js.Object {
  @js.native
  class EventTargetShim () extends js.Object {
    def addEventListener(`type`: String, listener: EventListenerShim): Unit = js.native
    def dispatchEvent(evt: WorkboxEvent): Unit = js.native
    def removeEventListener(`type`: String, listener: EventListenerShim): Unit = js.native
  }
  
  type EventListenerShim = js.Function1[/* evt */ WorkboxEvent, Unit]
}

