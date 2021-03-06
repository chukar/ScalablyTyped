package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityVerificationAttributes extends js.Object {
  /**
    * The verification status of the identity: "Pending", "Success", "Failed", or "TemporaryFailure".
    */
  var VerificationStatus: typings.awsDashSdk.clientsSesMod.VerificationStatus = js.native
  /**
    * The verification token for a domain identity. Null for email address identities.
    */
  var VerificationToken: js.UndefOr[typings.awsDashSdk.clientsSesMod.VerificationToken] = js.native
}

object IdentityVerificationAttributes {
  @scala.inline
  def apply(VerificationStatus: VerificationStatus, VerificationToken: VerificationToken = null): IdentityVerificationAttributes = {
    val __obj = js.Dynamic.literal(VerificationStatus = VerificationStatus.asInstanceOf[js.Any])
    if (VerificationToken != null) __obj.updateDynamic("VerificationToken")(VerificationToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityVerificationAttributes]
  }
}

