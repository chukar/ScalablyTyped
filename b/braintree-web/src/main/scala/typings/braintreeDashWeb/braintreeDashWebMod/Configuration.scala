package typings.braintreeDashWeb.braintreeDashWebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configuration extends js.Object {
  var analyticsMetadata: ClientAnalyticsMetadata
  var client: Client
  var gatewayConfiguration: js.Any
}

object Configuration {
  @scala.inline
  def apply(analyticsMetadata: ClientAnalyticsMetadata, client: Client, gatewayConfiguration: js.Any): Configuration = {
    val __obj = js.Dynamic.literal(analyticsMetadata = analyticsMetadata.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], gatewayConfiguration = gatewayConfiguration.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Configuration]
  }
}

