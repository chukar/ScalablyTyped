package typings.jsonwebtokenDashPromisified.jsonwebtokenDashPromisifiedMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonwebtoken-promisified", "NotBeforeError")
@js.native
class NotBeforeError protected () extends JsonWebTokenError {
  def this(message: String, date: Date) = this()
  var date: Date = js.native
}

