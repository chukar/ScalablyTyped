package typings.fhirDashKitDashClient

import typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.ProcessRequest
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HeadersIdOptionsProcessRequest extends js.Object {
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: ProcessRequest
  var version: String
}

object Anon_HeadersIdOptionsProcessRequest {
  @scala.inline
  def apply(
    id: String,
    resourceType: ProcessRequest,
    version: String,
    headers: Headers = null,
    options: Options = null
  ): Anon_HeadersIdOptionsProcessRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HeadersIdOptionsProcessRequest]
  }
}

