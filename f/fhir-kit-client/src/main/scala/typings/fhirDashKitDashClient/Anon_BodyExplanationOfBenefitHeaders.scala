package typings.fhirDashKitDashClient

import typings.fhir.fhir.ExplanationOfBenefit
import typings.request.requestMod.Headers
import typings.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyExplanationOfBenefitHeaders extends js.Object {
  var body: ExplanationOfBenefit
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.ExplanationOfBenefit
}

object Anon_BodyExplanationOfBenefitHeaders {
  @scala.inline
  def apply(
    body: ExplanationOfBenefit,
    id: String,
    resourceType: typings.fhirDashKitDashClient.fhirDashKitDashClientStrings.ExplanationOfBenefit,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyExplanationOfBenefitHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyExplanationOfBenefitHeaders]
  }
}

