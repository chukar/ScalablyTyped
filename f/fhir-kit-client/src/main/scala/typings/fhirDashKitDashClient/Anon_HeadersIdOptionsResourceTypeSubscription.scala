package typings.fhirDashKitDashClient

import typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.Subscription
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HeadersIdOptionsResourceTypeSubscription extends js.Object {
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: Subscription
  var version: String
}

object Anon_HeadersIdOptionsResourceTypeSubscription {
  @scala.inline
  def apply(
    id: String,
    resourceType: Subscription,
    version: String,
    headers: Headers = null,
    options: Options = null
  ): Anon_HeadersIdOptionsResourceTypeSubscription = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HeadersIdOptionsResourceTypeSubscription]
  }
}

