package typings.activexDashOffice

import typings.activexDashOffice.Office.CustomXMLNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InUndoRedo extends js.Object {
  val InUndoRedo: Boolean
  val OldNextSibling: CustomXMLNode
  val OldNode: CustomXMLNode
  val OldParentNode: CustomXMLNode
}

object Anon_InUndoRedo {
  @scala.inline
  def apply(
    InUndoRedo: Boolean,
    OldNextSibling: CustomXMLNode,
    OldNode: CustomXMLNode,
    OldParentNode: CustomXMLNode
  ): Anon_InUndoRedo = {
    val __obj = js.Dynamic.literal(InUndoRedo = InUndoRedo.asInstanceOf[js.Any], OldNextSibling = OldNextSibling.asInstanceOf[js.Any], OldNode = OldNode.asInstanceOf[js.Any], OldParentNode = OldParentNode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_InUndoRedo]
  }
}

