package typings.stripeDashV3.stripe.paymentIntents

import typings.stripeDashV3.Anon_ReturnurlUrl
import typings.stripeDashV3.stripeDashV3Strings.redirect_to_url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentIntentNextActionRedirectToUrl extends js.Object {
  /**
    * Contains instructions for authenticating a payment by
    * redirecting your customer to another page or application.
    */
  var redirect_to_url: Anon_ReturnurlUrl
  /**
    * Type of the next action to perform
    */
  var `type`: redirect_to_url
}

object PaymentIntentNextActionRedirectToUrl {
  @scala.inline
  def apply(redirect_to_url: Anon_ReturnurlUrl, `type`: redirect_to_url): PaymentIntentNextActionRedirectToUrl = {
    val __obj = js.Dynamic.literal(redirect_to_url = redirect_to_url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentIntentNextActionRedirectToUrl]
  }
}

