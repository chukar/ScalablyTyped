package typings.jasmine.jasmine

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Clock extends js.Object {
  def install(): Unit = js.native
  def mockDate(): Unit = js.native
  def mockDate(date: Date): Unit = js.native
  /** Calls to any registered callback are triggered when the clock is ticked forward via the jasmine.clock().tick function, which takes a number of milliseconds. */
  def tick(ms: Double): Unit = js.native
  def uninstall(): Unit = js.native
  def withMock(func: js.Function0[Unit]): Unit = js.native
}

@JSGlobal("jasmine.clock")
@js.native
object clock extends js.Object {
  def apply(): Clock = js.native
}

