package typings.awsDashSdk.clientsMediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCorsPolicyInput extends js.Object {
  /**
    * The name of the container that the policy is assigned to.
    */
  var ContainerName: typings.awsDashSdk.clientsMediastoreMod.ContainerName = js.native
}

object GetCorsPolicyInput {
  @scala.inline
  def apply(ContainerName: ContainerName): GetCorsPolicyInput = {
    val __obj = js.Dynamic.literal(ContainerName = ContainerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetCorsPolicyInput]
  }
}

