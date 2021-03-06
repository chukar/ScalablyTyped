package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAssociatedRoleResponse extends js.Object {
  /**
    * The time when the role was associated with the group.
    */
  var AssociatedAt: js.UndefOr[__string] = js.native
  /**
    * The ARN of the role that is associated with the group.
    */
  var RoleArn: js.UndefOr[__string] = js.native
}

object GetAssociatedRoleResponse {
  @scala.inline
  def apply(AssociatedAt: __string = null, RoleArn: __string = null): GetAssociatedRoleResponse = {
    val __obj = js.Dynamic.literal()
    if (AssociatedAt != null) __obj.updateDynamic("AssociatedAt")(AssociatedAt.asInstanceOf[js.Any])
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAssociatedRoleResponse]
  }
}

