package typings.ckeditor

import typings.ckeditor.CKEDITOR.dom.node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndNode extends js.Object {
  var endNode: node
  var startNode: node
}

object Anon_EndNode {
  @scala.inline
  def apply(endNode: node, startNode: node): Anon_EndNode = {
    val __obj = js.Dynamic.literal(endNode = endNode.asInstanceOf[js.Any], startNode = startNode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_EndNode]
  }
}

