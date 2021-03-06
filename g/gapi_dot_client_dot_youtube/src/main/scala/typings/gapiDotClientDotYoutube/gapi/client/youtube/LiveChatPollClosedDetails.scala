package typings.gapiDotClientDotYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveChatPollClosedDetails extends js.Object {
  /** The id of the poll that was closed. */
  var pollId: js.UndefOr[String] = js.undefined
}

object LiveChatPollClosedDetails {
  @scala.inline
  def apply(pollId: String = null): LiveChatPollClosedDetails = {
    val __obj = js.Dynamic.literal()
    if (pollId != null) __obj.updateDynamic("pollId")(pollId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveChatPollClosedDetails]
  }
}

