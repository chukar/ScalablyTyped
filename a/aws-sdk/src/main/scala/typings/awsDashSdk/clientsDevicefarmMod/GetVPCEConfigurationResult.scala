package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVPCEConfigurationResult extends js.Object {
  /**
    * An object that contains information about your VPC endpoint configuration.
    */
  var vpceConfiguration: js.UndefOr[VPCEConfiguration] = js.native
}

object GetVPCEConfigurationResult {
  @scala.inline
  def apply(vpceConfiguration: VPCEConfiguration = null): GetVPCEConfigurationResult = {
    val __obj = js.Dynamic.literal()
    if (vpceConfiguration != null) __obj.updateDynamic("vpceConfiguration")(vpceConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVPCEConfigurationResult]
  }
}

