package typings.tinymce.tinymceMod.dom

import typings.std.HTMLElement
import typings.tinymce.tinymceMod.Editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tinymce", "dom.Serializer")
@js.native
class Serializer protected () extends js.Object {
  def this(settings: js.Object) = this()
  def this(settings: js.Object, editor: Editor) = this()
  def addAttributeFilter(callback: js.Function0[Unit]): Unit = js.native
  def addNodeFilter(callback: js.Function0[Unit]): Unit = js.native
  def addRules(rules: String): Unit = js.native
  def addTempAttr(name: String): Unit = js.native
  def serialize(node: HTMLElement, args: js.Object): Unit = js.native
  def setRules(rules: String): Unit = js.native
}

