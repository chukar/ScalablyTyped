package typings.jsonwebtoken.jsonwebtokenMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.jsonwebtoken.jsonwebtokenMod.VerifyErrors because Already inherited */ @JSImport("jsonwebtoken", "TokenExpiredError")
@js.native
class TokenExpiredError protected () extends JsonWebTokenError {
  def this(message: String, expiredAt: Date) = this()
  var expiredAt: Date = js.native
}

