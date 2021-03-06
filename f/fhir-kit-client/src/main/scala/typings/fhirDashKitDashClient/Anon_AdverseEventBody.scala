package typings.fhirDashKitDashClient

import typings.fhir.fhir.AdverseEvent
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdverseEventBody extends js.Object {
  var body: AdverseEvent
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.AdverseEvent
}

object Anon_AdverseEventBody {
  @scala.inline
  def apply(
    body: AdverseEvent,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.AdverseEvent,
    headers: Headers = null,
    options: Options = null
  ): Anon_AdverseEventBody = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AdverseEventBody]
  }
}

