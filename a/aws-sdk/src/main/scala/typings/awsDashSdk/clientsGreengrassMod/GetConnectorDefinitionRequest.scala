package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConnectorDefinitionRequest extends js.Object {
  /**
    * The ID of the connector definition.
    */
  var ConnectorDefinitionId: __string = js.native
}

object GetConnectorDefinitionRequest {
  @scala.inline
  def apply(ConnectorDefinitionId: __string): GetConnectorDefinitionRequest = {
    val __obj = js.Dynamic.literal(ConnectorDefinitionId = ConnectorDefinitionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetConnectorDefinitionRequest]
  }
}

