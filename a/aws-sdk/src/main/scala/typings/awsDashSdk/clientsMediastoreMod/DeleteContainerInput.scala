package typings.awsDashSdk.clientsMediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteContainerInput extends js.Object {
  /**
    * The name of the container to delete. 
    */
  var ContainerName: typings.awsDashSdk.clientsMediastoreMod.ContainerName = js.native
}

object DeleteContainerInput {
  @scala.inline
  def apply(ContainerName: ContainerName): DeleteContainerInput = {
    val __obj = js.Dynamic.literal(ContainerName = ContainerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteContainerInput]
  }
}

