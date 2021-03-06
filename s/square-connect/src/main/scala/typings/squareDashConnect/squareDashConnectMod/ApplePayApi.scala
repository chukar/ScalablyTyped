package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "ApplePayApi")
@js.native
/**
  * Constructs a new ApplePayApi.
  * @param apiClient Optional API client implementation to use, default to ApiClient.instance if unspecified.
  */
class ApplePayApi () extends js.Object {
  def this(apiClient: ApiClient) = this()
  /**
    * Activates a domain for use with Web Apple Pay and Square.
    * A validation will be performed on this domain by Apple to ensure is it properly set up as an Apple Pay enabled domain.
    * This endpoint provides an easy way for platform developers to bulk activate Web Apple Pay with Square for merchants using
    * their platform. To learn more about Apple Pay on Web see the Apple Pay section in
    * the [Embedding the Square Payment Form](/payment-form/add-digital-wallets/apple-pay) guide.
    */
  def registerDomain(args: js.Any*): js.Promise[RegisterDomainResponse] = js.native
}

