package typings.reactDashStripeDashElements.reactDashStripeDashElementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ReactStripeElements {
  import typings.reactDashStripeDashElements.Anon_ApiKey
  import typings.reactDashStripeDashElements.Anon_Error
  import typings.reactDashStripeDashElements.Anon_Stripe
  import typings.reactDashStripeDashElements.Anon_Type
  import typings.stripeDashV3.stripe.elements.Element

  type ElementChangeResponse = typings.stripeDashV3.stripe.elements.ElementChangeResponse
  type ElementsOptions = typings.stripeDashV3.stripe.elements.ElementsOptions
  type HTMLStripeElement = Element
  /**
    * There's a bug in @types/stripe which defines the property as
    * `declined_code` (with a 'd') but it's in fact `decline_code`
    */
  type PatchedTokenResponse = TokenResponse with Anon_Error
  type SourceOptions = typings.stripeDashV3.stripe.SourceOptions
  type SourceResponse = typings.stripeDashV3.stripe.SourceResponse
  type StripeProviderProps = (Anon_ApiKey with StripeProviderOptions) | (Anon_Stripe with StripeProviderOptions)
  type TokenOptions = typings.stripeDashV3.stripe.TokenOptions with Anon_Type
  type TokenResponse = typings.stripeDashV3.stripe.TokenResponse
}
