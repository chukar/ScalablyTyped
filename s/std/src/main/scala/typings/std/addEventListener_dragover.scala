package typings.std

import typings.std.stdStrings.dragover
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_dragover extends js.Object {
  def apply(`type`: dragover, listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _]): Unit = js.native
  def apply(
    `type`: dragover,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: dragover,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
}

