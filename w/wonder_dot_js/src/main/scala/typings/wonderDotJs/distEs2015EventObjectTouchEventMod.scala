package typings.wonderDotJs

import typings.wonderDotJs.distEs2015EventInterfaceIEventDataMod.ITouchData
import typings.wonderDotJs.distEs2015EventInterfaceIEventDataMod.ITouchEventData
import typings.wonderDotJs.distEs2015EventObjectDomEventMod.DomEvent
import typings.wonderDotJs.distEs2015EventObjectEventNameHandlerMod.EEventName
import typings.wonderDotJs.distEs2015StructurePointMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/object/TouchEvent", JSImport.Namespace)
@js.native
object distEs2015EventObjectTouchEventMod extends js.Object {
  @js.native
  class TouchEvent () extends DomEvent {
    @JSName("event")
    var event_TouchEvent: ITouchEventData = js.native
    var lastX: Double = js.native
    var lastY: Double = js.native
    var location: Point = js.native
    var locationInView: Point = js.native
    val movementDelta: Anon_X = js.native
    val touchData: ITouchData = js.native
  }
  
  /* static members */
  @js.native
  object TouchEvent extends js.Object {
    def create(event: ITouchEventData, eventName: EEventName): TouchEvent = js.native
  }
  
}

