package typings.awsDashSdk.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBackupPlanInput extends js.Object {
  /**
    * Specifies the body of a backup plan. Includes a BackupPlanName and one or more sets of Rules.
    */
  var BackupPlan: BackupPlanInput = js.native
  /**
    * To help organize your resources, you can assign your own metadata to the resources that you create. Each tag is a key-value pair. The specified tags are assigned to all backups created with this plan.
    */
  var BackupPlanTags: js.UndefOr[Tags] = js.native
  /**
    * Identifies the request and allows failed requests to be retried without the risk of executing the operation twice. If the request includes a CreatorRequestId that matches an existing backup plan, that plan is returned. This parameter is optional.
    */
  var CreatorRequestId: js.UndefOr[String] = js.native
}

object CreateBackupPlanInput {
  @scala.inline
  def apply(BackupPlan: BackupPlanInput, BackupPlanTags: Tags = null, CreatorRequestId: String = null): CreateBackupPlanInput = {
    val __obj = js.Dynamic.literal(BackupPlan = BackupPlan.asInstanceOf[js.Any])
    if (BackupPlanTags != null) __obj.updateDynamic("BackupPlanTags")(BackupPlanTags.asInstanceOf[js.Any])
    if (CreatorRequestId != null) __obj.updateDynamic("CreatorRequestId")(CreatorRequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBackupPlanInput]
  }
}

