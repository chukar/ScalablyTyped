package typings.fhirDashKitDashClient

import typings.fhir.fhir.Observation
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyHeadersObservation extends js.Object {
  var body: Observation
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.Observation
}

object Anon_BodyHeadersObservation {
  @scala.inline
  def apply(
    body: Observation,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.Observation,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyHeadersObservation = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyHeadersObservation]
  }
}

