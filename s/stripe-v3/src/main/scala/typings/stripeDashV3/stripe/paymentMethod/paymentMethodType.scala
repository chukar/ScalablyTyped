package typings.stripeDashV3.stripe.paymentMethod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stripeDashV3.stripeDashV3Strings.card
  - typings.stripeDashV3.stripeDashV3Strings.card_present
*/
trait paymentMethodType extends js.Object

object paymentMethodType {
  @scala.inline
  def card: typings.stripeDashV3.stripeDashV3Strings.card = this.cast("card")
  @scala.inline
  def card_present: typings.stripeDashV3.stripeDashV3Strings.card_present = this.cast("card_present")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

