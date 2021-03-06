package typings.awsDashSdk.clientsRamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcceptResourceShareInvitationRequest extends js.Object {
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientToken: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the invitation.
    */
  var resourceShareInvitationArn: String = js.native
}

object AcceptResourceShareInvitationRequest {
  @scala.inline
  def apply(resourceShareInvitationArn: String, clientToken: String = null): AcceptResourceShareInvitationRequest = {
    val __obj = js.Dynamic.literal(resourceShareInvitationArn = resourceShareInvitationArn.asInstanceOf[js.Any])
    if (clientToken != null) __obj.updateDynamic("clientToken")(clientToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptResourceShareInvitationRequest]
  }
}

