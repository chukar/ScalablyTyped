package typings.std

import typings.std.stdStrings.message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_message extends js.Object {
  def apply(`type`: message, listener: js.ThisFunction1[/* this */ Window, /* ev */ MessageEvent, _]): Unit = js.native
  def apply(
    `type`: message,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MessageEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: message,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MessageEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
}

