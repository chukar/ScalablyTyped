package typings.awsDashSdk.clientsPersonalizeeventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutEventsRequest extends js.Object {
  /**
    * A list of event data from the session.
    */
  var eventList: EventList = js.native
  /**
    * The session ID associated with the user's visit.
    */
  var sessionId: StringType = js.native
  /**
    * The tracking ID for the event. The ID is generated by a call to the CreateEventTracker API.
    */
  var trackingId: StringType = js.native
  /**
    * The user associated with the event.
    */
  var userId: js.UndefOr[UserId] = js.native
}

object PutEventsRequest {
  @scala.inline
  def apply(eventList: EventList, sessionId: StringType, trackingId: StringType, userId: UserId = null): PutEventsRequest = {
    val __obj = js.Dynamic.literal(eventList = eventList.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any], trackingId = trackingId.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutEventsRequest]
  }
}

