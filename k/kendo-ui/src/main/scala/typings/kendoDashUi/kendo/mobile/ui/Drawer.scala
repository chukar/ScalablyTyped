package typings.kendoDashUi.kendo.mobile.ui

import typings.kendoDashUi.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.mobile.ui.Drawer")
@js.native
class Drawer protected ()
  extends typings.kendoDashUi.kendo.ui.Widget {
  def this(element: Element) = this()
  def this(element: Element, options: DrawerOptions) = this()
  @JSName("options")
  var options_Drawer: DrawerOptions = js.native
  var wrapper: JQuery = js.native
  def hide(): Unit = js.native
  def show(): Unit = js.native
}

/* static members */
@JSGlobal("kendo.mobile.ui.Drawer")
@js.native
object Drawer extends js.Object {
  var fn: Drawer = js.native
  def extend(proto: js.Object): Drawer = js.native
}

