package typings.fhirDashKitDashClient

import typings.fhir.fhir.Composition
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyComposition extends js.Object {
  var body: Composition
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.Composition
}

object Anon_BodyComposition {
  @scala.inline
  def apply(
    body: Composition,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.Composition,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyComposition = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyComposition]
  }
}

