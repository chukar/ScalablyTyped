package typings.rmcDashCalendar.libDateSingleMonthMod

import typings.react.reactMod.Component
import typings.rmcDashCalendar.Anon_WeekComponents
import typings.rmcDashCalendar.libDateDataTypesMod.Models.CellData
import typings.rmcDashCalendar.libDateDataTypesMod.Models.MonthData
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SingleMonth
  extends Component[PropsType, Anon_WeekComponents, js.Any] {
  var wrapperDivDOM: HTMLDivElement | Null = js.native
  @JSName("componentWillMount")
  def componentWillMount_MSingleMonth(): Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MSingleMonth(nextProps: PropsType): Unit = js.native
  def genWeek(weeksData: js.Array[CellData], index: Double): Unit = js.native
  def setWarpper(dom: HTMLDivElement): Unit = js.native
  def updateWeeks(): Unit = js.native
  def updateWeeks(monthData: MonthData): Unit = js.native
}

