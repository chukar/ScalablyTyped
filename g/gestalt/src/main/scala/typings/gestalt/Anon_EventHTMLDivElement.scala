package typings.gestalt

import typings.react.reactMod.MouseEvent
import typings.react.reactMod.NativeMouseEvent
import typings.react.reactMod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventHTMLDivElement extends js.Object {
  var event: SyntheticEvent[MouseEvent[HTMLDivElement, NativeMouseEvent], Event]
}

object Anon_EventHTMLDivElement {
  @scala.inline
  def apply(event: SyntheticEvent[MouseEvent[HTMLDivElement, NativeMouseEvent], Event]): Anon_EventHTMLDivElement = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_EventHTMLDivElement]
  }
}

