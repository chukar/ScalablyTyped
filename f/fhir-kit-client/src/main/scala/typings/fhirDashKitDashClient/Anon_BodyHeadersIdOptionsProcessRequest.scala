package typings.fhirDashKitDashClient

import typings.fhir.fhir.ProcessRequest
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyHeadersIdOptionsProcessRequest extends js.Object {
  var body: ProcessRequest
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.ProcessRequest
}

object Anon_BodyHeadersIdOptionsProcessRequest {
  @scala.inline
  def apply(
    body: ProcessRequest,
    id: String,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.ProcessRequest,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyHeadersIdOptionsProcessRequest = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyHeadersIdOptionsProcessRequest]
  }
}

