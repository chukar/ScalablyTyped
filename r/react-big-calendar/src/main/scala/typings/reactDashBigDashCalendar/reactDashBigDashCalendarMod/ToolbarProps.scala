package typings.reactDashBigDashCalendar.reactDashBigDashCalendarMod

import typings.react.reactMod.ReactNode
import typings.reactDashBigDashCalendar.Anon_Messages
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToolbarProps extends js.Object {
  var children: js.UndefOr[ReactNode] = js.native
  var date: Date = js.native
  var label: String = js.native
  var localizer: Anon_Messages = js.native
  var view: View = js.native
  var views: ViewsProps = js.native
  def onNavigate(navigate: NavigateAction): Unit = js.native
  def onNavigate(navigate: NavigateAction, date: Date): Unit = js.native
  def onView(view: View): Unit = js.native
}

