package typings.stripe.stripeMod.resources

import typings.stripe.stripeMod.StripeResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stripe", "resources.Issuing")
@js.native
class Issuing () extends StripeResource {
  var authorizations: Authorizations = js.native
  var cardholders: Cardholders = js.native
  var cards: IssuingCards = js.native
  var disputes: IssuingDisputes = js.native
  var transactions: Transactions = js.native
}

