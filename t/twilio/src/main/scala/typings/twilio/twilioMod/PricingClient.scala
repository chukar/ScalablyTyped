package typings.twilio.twilioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio", "PricingClient")
@js.native
class PricingClient () extends Client {
  def this(sid: String) = this()
  def this(sid: String, tkn: String) = this()
  def this(sid: String, tkn: String, options: ClientOptions) = this()
  var messaging: PricingMessagingResource = js.native
  var phoneNumbers: PricingPhoneNumberResource = js.native
  var voice: PricingVoiceResource = js.native
}

