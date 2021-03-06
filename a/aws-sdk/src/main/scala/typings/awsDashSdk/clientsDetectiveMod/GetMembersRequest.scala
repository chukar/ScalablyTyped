package typings.awsDashSdk.clientsDetectiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMembersRequest extends js.Object {
  /**
    * The list of AWS account identifiers for the member account for which to return member details. You cannot use GetMembers to retrieve information about member accounts that were removed from the behavior graph.
    */
  var AccountIds: AccountIdList = js.native
  /**
    * The ARN of the behavior graph for which to request the member details.
    */
  var GraphArn: typings.awsDashSdk.clientsDetectiveMod.GraphArn = js.native
}

object GetMembersRequest {
  @scala.inline
  def apply(AccountIds: AccountIdList, GraphArn: GraphArn): GetMembersRequest = {
    val __obj = js.Dynamic.literal(AccountIds = AccountIds.asInstanceOf[js.Any], GraphArn = GraphArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetMembersRequest]
  }
}

