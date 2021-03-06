package typings.gestalt

import typings.react.reactMod.MouseEvent
import typings.react.reactMod.NativeMouseEvent
import typings.react.reactMod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActiveIndex extends js.Object {
  var activeIndex: Double
  var event: SyntheticEvent[MouseEvent[Element, NativeMouseEvent], Event]
}

object Anon_ActiveIndex {
  @scala.inline
  def apply(activeIndex: Double, event: SyntheticEvent[MouseEvent[Element, NativeMouseEvent], Event]): Anon_ActiveIndex = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ActiveIndex]
  }
}

