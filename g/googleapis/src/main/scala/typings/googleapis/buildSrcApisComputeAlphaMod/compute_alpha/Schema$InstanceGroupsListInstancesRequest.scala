package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$InstanceGroupsListInstancesRequest extends js.Object {
  /**
    * A filter for the state of the instances in the instance group. Valid
    * options are ALL or RUNNING. If you do not specify this parameter the list
    * includes all instances regardless of their state.
    */
  var instanceState: js.UndefOr[String] = js.native
}

object Schema$InstanceGroupsListInstancesRequest {
  @scala.inline
  def apply(instanceState: String = null): Schema$InstanceGroupsListInstancesRequest = {
    val __obj = js.Dynamic.literal()
    if (instanceState != null) __obj.updateDynamic("instanceState")(instanceState.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InstanceGroupsListInstancesRequest]
  }
}

