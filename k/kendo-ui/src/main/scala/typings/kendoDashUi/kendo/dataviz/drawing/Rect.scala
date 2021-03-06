package typings.kendoDashUi.kendo.dataviz.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.drawing.Rect")
@js.native
class Rect protected ()
  extends typings.kendoDashUi.kendo.drawing.Element {
  def this(geometry: typings.kendoDashUi.kendo.geometry.Rect) = this()
  def this(geometry: typings.kendoDashUi.kendo.geometry.Rect, options: RectOptions) = this()
  @JSName("options")
  var options_Rect: RectOptions = js.native
  def fill(color: String): typings.kendoDashUi.kendo.drawing.Rect = js.native
  def fill(color: String, opacity: Double): typings.kendoDashUi.kendo.drawing.Rect = js.native
  def geometry(): typings.kendoDashUi.kendo.geometry.Rect = js.native
  def geometry(value: typings.kendoDashUi.kendo.geometry.Rect): Unit = js.native
  def stroke(color: String): typings.kendoDashUi.kendo.drawing.Rect = js.native
  def stroke(color: String, width: Double): typings.kendoDashUi.kendo.drawing.Rect = js.native
  def stroke(color: String, width: Double, opacity: Double): typings.kendoDashUi.kendo.drawing.Rect = js.native
}

