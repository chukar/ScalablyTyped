package typings.pubnub.pubnubMod

import typings.pubnub.Anon_DataEventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MembershipEvent extends js.Object {
  var channel: String
  var message: Anon_DataEventType
  var publisher: String
  var subscription: String
  var timetoken: String
}

object MembershipEvent {
  @scala.inline
  def apply(
    channel: String,
    message: Anon_DataEventType,
    publisher: String,
    subscription: String,
    timetoken: String
  ): MembershipEvent = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MembershipEvent]
  }
}

