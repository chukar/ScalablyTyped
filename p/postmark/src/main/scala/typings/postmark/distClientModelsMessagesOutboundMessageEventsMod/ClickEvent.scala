package typings.postmark.distClientModelsMessagesOutboundMessageEventsMod

import typings.postmark.Anon_ClickLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClickEvent extends MessageEvent {
  @JSName("Details")
  var Details_ClickEvent: Anon_ClickLocation
}

object ClickEvent {
  @scala.inline
  def apply(Details: Anon_ClickLocation, ReceivedAt: String, Recipient: String, Type: String): ClickEvent = {
    val __obj = js.Dynamic.literal(Details = Details.asInstanceOf[js.Any], ReceivedAt = ReceivedAt.asInstanceOf[js.Any], Recipient = Recipient.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClickEvent]
  }
}

