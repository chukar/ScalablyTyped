package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VerifyDomainIdentityRequest extends js.Object {
  /**
    * The domain to be verified.
    */
  var Domain: typings.awsDashSdk.clientsSesMod.Domain = js.native
}

object VerifyDomainIdentityRequest {
  @scala.inline
  def apply(Domain: Domain): VerifyDomainIdentityRequest = {
    val __obj = js.Dynamic.literal(Domain = Domain.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VerifyDomainIdentityRequest]
  }
}

