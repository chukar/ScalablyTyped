package typings.handsontable.handsontableMod.Handsontable._editors

import typings.pikaday.pikadayMod.PikadayOptions
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Date extends Text {
  def destroyElements(): Unit = js.native
  def getDatePickerConfig(): PikadayOptions = js.native
  def hideDatepicker(): Unit = js.native
  def showDatepicker(): Unit = js.native
  def showDatepicker(event: Event): Unit = js.native
}

