package typings.awsDashSdk.clientsServicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePrivateDnsNamespaceResponse extends js.Object {
  /**
    * A value that you can use to determine whether the request completed successfully. To get the status of the operation, see GetOperation.
    */
  var OperationId: js.UndefOr[typings.awsDashSdk.clientsServicediscoveryMod.OperationId] = js.native
}

object CreatePrivateDnsNamespaceResponse {
  @scala.inline
  def apply(OperationId: OperationId = null): CreatePrivateDnsNamespaceResponse = {
    val __obj = js.Dynamic.literal()
    if (OperationId != null) __obj.updateDynamic("OperationId")(OperationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePrivateDnsNamespaceResponse]
  }
}

