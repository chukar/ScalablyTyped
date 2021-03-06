package typings.atFeathersjsErrors.atFeathersjsErrorsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Errors extends js.Object {
  var BadGateway: typings.atFeathersjsErrors.atFeathersjsErrorsMod.BadGateway
  var BadRequest: typings.atFeathersjsErrors.atFeathersjsErrorsMod.BadRequest
  var Conflict: typings.atFeathersjsErrors.atFeathersjsErrorsMod.Conflict
  var FeathersError: typings.atFeathersjsErrors.atFeathersjsErrorsMod.FeathersError
  var Forbidden: typings.atFeathersjsErrors.atFeathersjsErrorsMod.Forbidden
  var GeneralError: typings.atFeathersjsErrors.atFeathersjsErrorsMod.GeneralError
  var LengthRequired: typings.atFeathersjsErrors.atFeathersjsErrorsMod.LengthRequired
  var MethodNotAllowed: typings.atFeathersjsErrors.atFeathersjsErrorsMod.MethodNotAllowed
  var NotAcceptable: typings.atFeathersjsErrors.atFeathersjsErrorsMod.NotAcceptable
  var NotAuthenticated: typings.atFeathersjsErrors.atFeathersjsErrorsMod.NotAuthenticated
  var NotFound: typings.atFeathersjsErrors.atFeathersjsErrorsMod.NotFound
  var NotImplemented: typings.atFeathersjsErrors.atFeathersjsErrorsMod.NotImplemented
  var PaymentError: typings.atFeathersjsErrors.atFeathersjsErrorsMod.PaymentError
  var Timeout: typings.atFeathersjsErrors.atFeathersjsErrorsMod.Timeout
  var TooManyRequests: typings.atFeathersjsErrors.atFeathersjsErrorsMod.TooManyRequests
  var Unavailable: typings.atFeathersjsErrors.atFeathersjsErrorsMod.Unavailable
  var Unprocessable: typings.atFeathersjsErrors.atFeathersjsErrorsMod.Unprocessable
}

object Errors {
  @scala.inline
  def apply(
    BadGateway: BadGateway,
    BadRequest: BadRequest,
    Conflict: Conflict,
    FeathersError: FeathersError,
    Forbidden: Forbidden,
    GeneralError: GeneralError,
    LengthRequired: LengthRequired,
    MethodNotAllowed: MethodNotAllowed,
    NotAcceptable: NotAcceptable,
    NotAuthenticated: NotAuthenticated,
    NotFound: NotFound,
    NotImplemented: NotImplemented,
    PaymentError: PaymentError,
    Timeout: Timeout,
    TooManyRequests: TooManyRequests,
    Unavailable: Unavailable,
    Unprocessable: Unprocessable
  ): Errors = {
    val __obj = js.Dynamic.literal(BadGateway = BadGateway.asInstanceOf[js.Any], BadRequest = BadRequest.asInstanceOf[js.Any], Conflict = Conflict.asInstanceOf[js.Any], FeathersError = FeathersError.asInstanceOf[js.Any], Forbidden = Forbidden.asInstanceOf[js.Any], GeneralError = GeneralError.asInstanceOf[js.Any], LengthRequired = LengthRequired.asInstanceOf[js.Any], MethodNotAllowed = MethodNotAllowed.asInstanceOf[js.Any], NotAcceptable = NotAcceptable.asInstanceOf[js.Any], NotAuthenticated = NotAuthenticated.asInstanceOf[js.Any], NotFound = NotFound.asInstanceOf[js.Any], NotImplemented = NotImplemented.asInstanceOf[js.Any], PaymentError = PaymentError.asInstanceOf[js.Any], Timeout = Timeout.asInstanceOf[js.Any], TooManyRequests = TooManyRequests.asInstanceOf[js.Any], Unavailable = Unavailable.asInstanceOf[js.Any], Unprocessable = Unprocessable.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Errors]
  }
}

@JSImport("@feathersjs/errors", "errors")
@js.native
object errors extends TopLevel[Errors]

