package typings.vis.visMod

import typings.vis.Anon_Canvas
import typings.vis.Anon_EdgesNodes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Properties extends js.Object {
  var edges: js.Array[String]
  var event: js.Array[String]
  var nodes: js.Array[String]
  var pointer: Anon_Canvas
  var previousSelection: js.UndefOr[Anon_EdgesNodes] = js.undefined
}

object Properties {
  @scala.inline
  def apply(
    edges: js.Array[String],
    event: js.Array[String],
    nodes: js.Array[String],
    pointer: Anon_Canvas,
    previousSelection: Anon_EdgesNodes = null
  ): Properties = {
    val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], pointer = pointer.asInstanceOf[js.Any])
    if (previousSelection != null) __obj.updateDynamic("previousSelection")(previousSelection.asInstanceOf[js.Any])
    __obj.asInstanceOf[Properties]
  }
}

