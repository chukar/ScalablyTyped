package typings.awsDashSdk.clientsWorklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeFleetMetadataRequest extends js.Object {
  /**
    * The ARN of the fleet.
    */
  var FleetArn: typings.awsDashSdk.clientsWorklinkMod.FleetArn = js.native
}

object DescribeFleetMetadataRequest {
  @scala.inline
  def apply(FleetArn: FleetArn): DescribeFleetMetadataRequest = {
    val __obj = js.Dynamic.literal(FleetArn = FleetArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeFleetMetadataRequest]
  }
}

