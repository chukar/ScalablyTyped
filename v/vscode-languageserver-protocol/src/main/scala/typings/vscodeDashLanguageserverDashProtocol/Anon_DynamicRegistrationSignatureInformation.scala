package typings.vscodeDashLanguageserverDashProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DynamicRegistrationSignatureInformation extends js.Object {
  /**
    * Whether signature help supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
  /**
    * The client supports the following `SignatureInformation`
    * specific properties.
    */
  var signatureInformation: js.UndefOr[Anon_DocumentationFormat] = js.undefined
}

object Anon_DynamicRegistrationSignatureInformation {
  @scala.inline
  def apply(
    dynamicRegistration: js.UndefOr[Boolean] = js.undefined,
    signatureInformation: Anon_DocumentationFormat = null
  ): Anon_DynamicRegistrationSignatureInformation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dynamicRegistration)) __obj.updateDynamic("dynamicRegistration")(dynamicRegistration.asInstanceOf[js.Any])
    if (signatureInformation != null) __obj.updateDynamic("signatureInformation")(signatureInformation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DynamicRegistrationSignatureInformation]
  }
}

