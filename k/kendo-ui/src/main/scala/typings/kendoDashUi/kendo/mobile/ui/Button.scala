package typings.kendoDashUi.kendo.mobile.ui

import typings.kendoDashUi.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.mobile.ui.Button")
@js.native
class Button protected ()
  extends typings.kendoDashUi.kendo.ui.Widget {
  def this(element: Element) = this()
  def this(element: Element, options: ButtonOptions) = this()
  @JSName("options")
  var options_Button: ButtonOptions = js.native
  var wrapper: JQuery = js.native
  def badge(value: String): String = js.native
  def badge(value: Boolean): String = js.native
  def enable(enable: Boolean): Unit = js.native
}

/* static members */
@JSGlobal("kendo.mobile.ui.Button")
@js.native
object Button extends js.Object {
  var fn: Button = js.native
  def extend(proto: js.Object): Button = js.native
}

