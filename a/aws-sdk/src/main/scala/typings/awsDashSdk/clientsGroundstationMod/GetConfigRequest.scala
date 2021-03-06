package typings.awsDashSdk.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConfigRequest extends js.Object {
  /**
    * UUID of a Config.
    */
  var configId: String = js.native
  /**
    * Type of a Config.
    */
  var configType: ConfigCapabilityType = js.native
}

object GetConfigRequest {
  @scala.inline
  def apply(configId: String, configType: ConfigCapabilityType): GetConfigRequest = {
    val __obj = js.Dynamic.literal(configId = configId.asInstanceOf[js.Any], configType = configType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetConfigRequest]
  }
}

