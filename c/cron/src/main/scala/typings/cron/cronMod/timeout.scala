package typings.cron.cronMod

import typings.moment.momentMod.Moment
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cron", "timeout")
@js.native
object timeout extends js.Object {
  def apply(cronTime: String): Double = js.native
  def apply(cronTime: Moment): Double = js.native
  def apply(cronTime: Date): Double = js.native
}

