package typings.awsDashSdk.clientsSesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteConfigurationSetEventDestinationRequest extends js.Object {
  /**
    * The name of the configuration set that contains the event destination that you want to delete.
    */
  var ConfigurationSetName: typings.awsDashSdk.clientsSesv2Mod.ConfigurationSetName = js.native
  /**
    * The name of the event destination that you want to delete.
    */
  var EventDestinationName: typings.awsDashSdk.clientsSesv2Mod.EventDestinationName = js.native
}

object DeleteConfigurationSetEventDestinationRequest {
  @scala.inline
  def apply(ConfigurationSetName: ConfigurationSetName, EventDestinationName: EventDestinationName): DeleteConfigurationSetEventDestinationRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any], EventDestinationName = EventDestinationName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteConfigurationSetEventDestinationRequest]
  }
}

