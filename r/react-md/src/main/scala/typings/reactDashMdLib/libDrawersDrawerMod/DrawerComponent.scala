package typings
package reactDashMdLib.libDrawersDrawerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawerComponent
  extends reactLib.reactMod.ComponentClass[DrawerProps, reactLib.reactMod.ComponentState] {
  var DrawerTypes: reactDashMdLib.Anon_CLIPPED = js.native
  def getCurrentMedia(): reactDashMdLib.Anon_DesktopMobile = js.native
  def getCurrentMedia(props: reactDashMdLib.Anon_DesktopMinWidth): reactDashMdLib.Anon_DesktopMobile = js.native
  def matchesMedia(min: scala.Double): scala.Boolean = js.native
  def matchesMedia(min: scala.Double, max: scala.Double): scala.Boolean = js.native
}

