package typings.winrt.Windows.Networking.NetworkOperators

import typings.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMobileBroadbandAccountStatics extends js.Object {
  var availableNetworkAccountIds: IVectorView[String]
  def createFromNetworkAccountId(networkAccountId: String): MobileBroadbandAccount
}

object IMobileBroadbandAccountStatics {
  @scala.inline
  def apply(
    availableNetworkAccountIds: IVectorView[String],
    createFromNetworkAccountId: String => MobileBroadbandAccount
  ): IMobileBroadbandAccountStatics = {
    val __obj = js.Dynamic.literal(availableNetworkAccountIds = availableNetworkAccountIds.asInstanceOf[js.Any], createFromNetworkAccountId = js.Any.fromFunction1(createFromNetworkAccountId))
  
    __obj.asInstanceOf[IMobileBroadbandAccountStatics]
  }
}

