package typings.reactDashDraggable.reactDashDraggableMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraggableData extends js.Object {
  var deltaX: Double
  var deltaY: Double
  var lastX: Double
  var lastY: Double
  var node: HTMLElement
  var x: Double
  var y: Double
}

object DraggableData {
  @scala.inline
  def apply(
    deltaX: Double,
    deltaY: Double,
    lastX: Double,
    lastY: Double,
    node: HTMLElement,
    x: Double,
    y: Double
  ): DraggableData = {
    val __obj = js.Dynamic.literal(deltaX = deltaX.asInstanceOf[js.Any], deltaY = deltaY.asInstanceOf[js.Any], lastX = lastX.asInstanceOf[js.Any], lastY = lastY.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DraggableData]
  }
}

