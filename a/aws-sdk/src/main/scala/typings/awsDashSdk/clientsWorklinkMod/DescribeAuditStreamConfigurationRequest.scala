package typings.awsDashSdk.clientsWorklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAuditStreamConfigurationRequest extends js.Object {
  /**
    * The ARN of the fleet.
    */
  var FleetArn: typings.awsDashSdk.clientsWorklinkMod.FleetArn = js.native
}

object DescribeAuditStreamConfigurationRequest {
  @scala.inline
  def apply(FleetArn: FleetArn): DescribeAuditStreamConfigurationRequest = {
    val __obj = js.Dynamic.literal(FleetArn = FleetArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeAuditStreamConfigurationRequest]
  }
}

