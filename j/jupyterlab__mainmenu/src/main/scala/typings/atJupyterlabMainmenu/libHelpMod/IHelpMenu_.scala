package typings.atJupyterlabMainmenu.libHelpMod

import typings.atJupyterlabMainmenu.libHelpMod.IHelpMenu.IKernelUser
import typings.atJupyterlabMainmenu.libLabmenuMod.IJupyterLabMenu
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("IHelpMenu")
@js.native
trait IHelpMenu_ extends IJupyterLabMenu {
  /**
    * A set of kernel users for the help menu.
    * This is used to populate additional help
    * links provided by the kernel of a widget.
    */
  val kernelUsers: Set[IKernelUser[Widget]] = js.native
}

