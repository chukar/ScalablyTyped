package typings.awsDashSdk.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateMailboxQuotaRequest extends js.Object {
  /**
    * The updated mailbox quota, in MB, for the specified user.
    */
  var MailboxQuota: typings.awsDashSdk.clientsWorkmailMod.MailboxQuota = js.native
  /**
    * The identifier for the organization that contains the user for whom to update the mailbox quota.
    */
  var OrganizationId: typings.awsDashSdk.clientsWorkmailMod.OrganizationId = js.native
  /**
    * The identifer for the user for whom to update the mailbox quota.
    */
  var UserId: WorkMailIdentifier = js.native
}

object UpdateMailboxQuotaRequest {
  @scala.inline
  def apply(MailboxQuota: MailboxQuota, OrganizationId: OrganizationId, UserId: WorkMailIdentifier): UpdateMailboxQuotaRequest = {
    val __obj = js.Dynamic.literal(MailboxQuota = MailboxQuota.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateMailboxQuotaRequest]
  }
}

