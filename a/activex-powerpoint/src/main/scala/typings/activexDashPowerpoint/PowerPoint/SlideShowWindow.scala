package typings.activexDashPowerpoint.PowerPoint

import typings.activexDashOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.SlideShowWindow")
@js.native
class SlideShowWindow protected () extends js.Object {
  val Active: MsoTriState = js.native
  val Application: typings.activexDashPowerpoint.PowerPoint.Application = js.native
  var Height: Double = js.native
  val IsFullScreen: MsoTriState = js.native
  var Left: Double = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.SlideShowWindow_typekey")
  var PowerPointDotSlideShowWindow_typekey: SlideShowWindow = js.native
  val Presentation: typings.activexDashPowerpoint.PowerPoint.Presentation = js.native
  var Top: Double = js.native
  val View: SlideShowView = js.native
  var Width: Double = js.native
  def Activate(): Unit = js.native
}

