package typings.fhirDashKitDashClient

import typings.fhirDashKitDashClient.fhirDashKitDashClientMod.CustomResourceType
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HeadersIdOptionsResourceTypeVersionCustomResourceType extends js.Object {
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: CustomResourceType
  var version: String
}

object Anon_HeadersIdOptionsResourceTypeVersionCustomResourceType {
  @scala.inline
  def apply(
    id: String,
    resourceType: CustomResourceType,
    version: String,
    headers: Headers = null,
    options: Options = null
  ): Anon_HeadersIdOptionsResourceTypeVersionCustomResourceType = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HeadersIdOptionsResourceTypeVersionCustomResourceType]
  }
}

