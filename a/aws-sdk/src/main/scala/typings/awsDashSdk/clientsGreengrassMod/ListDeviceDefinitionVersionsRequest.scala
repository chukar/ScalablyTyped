package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDeviceDefinitionVersionsRequest extends js.Object {
  /**
    * The ID of the device definition.
    */
  var DeviceDefinitionId: __string = js.native
  /**
    * The maximum number of results to be returned per request.
    */
  var MaxResults: js.UndefOr[__string] = js.native
  /**
    * The token for the next set of results, or ''null'' if there are no additional results.
    */
  var NextToken: js.UndefOr[__string] = js.native
}

object ListDeviceDefinitionVersionsRequest {
  @scala.inline
  def apply(DeviceDefinitionId: __string, MaxResults: __string = null, NextToken: __string = null): ListDeviceDefinitionVersionsRequest = {
    val __obj = js.Dynamic.literal(DeviceDefinitionId = DeviceDefinitionId.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDeviceDefinitionVersionsRequest]
  }
}

