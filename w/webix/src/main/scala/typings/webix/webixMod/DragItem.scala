package typings.webix.webixMod

import org.scalablytyped.runtime.TopLevel
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragItem extends js.Object {
  @JSName("$dragHTML")
  var $dragHTML_Original: WebixCallback = js.native
  @JSName("$dropAllow")
  var $dropAllow_Original: WebixCallback = js.native
  @JSName("$dropHTML")
  var $dropHTML_Original: WebixCallback = js.native
  @JSName("$drag")
  def $drag(source: HTMLElement, ev: Event): String = js.native
  @JSName("$dragHTML")
  def $dragHTML(args: js.Any*): js.Any = js.native
  @JSName("$dragIn")
  def $dragIn(source: HTMLElement, target: HTMLElement, ev: Event): HTMLElement = js.native
  @JSName("$dragMark")
  def $dragMark(context: js.Any, ev: Event): Boolean = js.native
  @JSName("$dragOut")
  def $dragOut(source: HTMLElement, old_target: HTMLElement, new_target: HTMLElement, ev: Event): Unit = js.native
  @JSName("$drop")
  def $drop(source: HTMLElement, target: HTMLElement, ev: Event): Unit = js.native
  @JSName("$dropAllow")
  def $dropAllow(args: js.Any*): js.Any = js.native
  @JSName("$dropHTML")
  def $dropHTML(args: js.Any*): js.Any = js.native
}

@JSImport("webix", "DragItem")
@js.native
object DragItem extends TopLevel[DragItem]

