package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_blur extends js.Object {
  def apply(
    `type`: typings.std.stdStrings.blur,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ FocusEvent, _]
  ): Unit = js.native
  def apply(
    `type`: typings.std.stdStrings.blur,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ FocusEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: typings.std.stdStrings.blur,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ FocusEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
}

