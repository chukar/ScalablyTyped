package typings.strftime.strftimeMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("strftime", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Format a local time/date according to locale settings
    * @param {string} format A format.
    * @return {string} Returns a string formatted.
    */
  def apply(format: String): String = js.native
  /**
    * Format a local time/date according to locale settings
    * @param {string} format A format.
    * @param {Date}   date   A date.
    * @return {string} Returns a string formatted according format using the given date or the current local time.
    */
  def apply(format: String, date: Date): String = js.native
}

