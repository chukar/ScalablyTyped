package typings.atFeathersjsErrors.atFeathersjsErrorsMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@feathersjs/errors", "NotFound")
@js.native
class NotFound () extends FeathersError {
  def this(msg: String) = this()
  def this(msg: Error) = this()
  def this(msg: String, data: js.Any) = this()
  def this(msg: Error, data: js.Any) = this()
}

