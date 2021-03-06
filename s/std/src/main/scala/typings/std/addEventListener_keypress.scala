package typings.std

import typings.std.stdStrings.keypress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_keypress extends js.Object {
  def apply(`type`: keypress, listener: js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, _]): Unit = js.native
  def apply(
    `type`: keypress,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: keypress,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
}

