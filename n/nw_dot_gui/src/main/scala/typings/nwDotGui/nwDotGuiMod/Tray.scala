package typings.nwDotGui.nwDotGuiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nw.gui", "Tray")
@js.native
class Tray protected ()
  extends EventEmitter
     with TrayOption {
  def this(option: TrayOption) = this()
  @JSName("alticon")
  var alticon_Tray: String = js.native
  @JSName("icon")
  var icon_Tray: String = js.native
  @JSName("menu")
  var menu_Tray: Menu = js.native
  @JSName("title")
  var title_Tray: String = js.native
  @JSName("tooltip")
  var tooltip_Tray: String = js.native
  def remove(): Unit = js.native
}

