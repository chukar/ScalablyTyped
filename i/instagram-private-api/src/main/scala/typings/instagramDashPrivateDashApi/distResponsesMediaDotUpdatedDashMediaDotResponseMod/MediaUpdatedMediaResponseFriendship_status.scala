package typings.instagramDashPrivateDashApi.distResponsesMediaDotUpdatedDashMediaDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaUpdatedMediaResponseFriendship_status extends js.Object {
  var following: Boolean
  var is_bestie: Boolean
  var is_restricted: Boolean
  var outgoing_request: Boolean
}

object MediaUpdatedMediaResponseFriendship_status {
  @scala.inline
  def apply(following: Boolean, is_bestie: Boolean, is_restricted: Boolean, outgoing_request: Boolean): MediaUpdatedMediaResponseFriendship_status = {
    val __obj = js.Dynamic.literal(following = following.asInstanceOf[js.Any], is_bestie = is_bestie.asInstanceOf[js.Any], is_restricted = is_restricted.asInstanceOf[js.Any], outgoing_request = outgoing_request.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MediaUpdatedMediaResponseFriendship_status]
  }
}

