package typings.std

import typings.std.stdStrings.cuechange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_cuechange extends js.Object {
  def apply(`type`: cuechange, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]): Unit = js.native
  def apply(
    `type`: cuechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: cuechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
}

