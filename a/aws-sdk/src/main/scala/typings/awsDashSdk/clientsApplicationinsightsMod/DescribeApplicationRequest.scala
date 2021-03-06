package typings.awsDashSdk.clientsApplicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeApplicationRequest extends js.Object {
  /**
    * The name of the resource group.
    */
  var ResourceGroupName: typings.awsDashSdk.clientsApplicationinsightsMod.ResourceGroupName = js.native
}

object DescribeApplicationRequest {
  @scala.inline
  def apply(ResourceGroupName: ResourceGroupName): DescribeApplicationRequest = {
    val __obj = js.Dynamic.literal(ResourceGroupName = ResourceGroupName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeApplicationRequest]
  }
}

