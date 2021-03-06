package typings.std

import typings.std.stdStrings.touchmove
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_touchmove extends js.Object {
  def apply(`type`: touchmove, listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _]): Unit = js.native
  def apply(
    `type`: touchmove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: touchmove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
}

