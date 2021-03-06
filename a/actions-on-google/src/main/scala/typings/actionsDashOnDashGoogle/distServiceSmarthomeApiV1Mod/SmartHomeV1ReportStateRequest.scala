package typings.actionsDashOnDashGoogle.distServiceSmarthomeApiV1Mod

import typings.actionsDashOnDashGoogle.Anon_Devices
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmartHomeV1ReportStateRequest extends js.Object {
  var agentUserId: String
  var payload: Anon_Devices
  var requestId: String
}

object SmartHomeV1ReportStateRequest {
  @scala.inline
  def apply(agentUserId: String, payload: Anon_Devices, requestId: String): SmartHomeV1ReportStateRequest = {
    val __obj = js.Dynamic.literal(agentUserId = agentUserId.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SmartHomeV1ReportStateRequest]
  }
}

