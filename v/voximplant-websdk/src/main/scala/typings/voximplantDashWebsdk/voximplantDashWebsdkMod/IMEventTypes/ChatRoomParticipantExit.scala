package typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEventTypes

import typings.voximplantDashWebsdk.voximplantDashWebsdkMod.VoxImplantIMEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when participant left the chat room
		*/
trait ChatRoomParticipantExit extends VoxImplantIMEvent {
  /**
  			* User id
  			*/
  var participant: String
  /**
  			* Room id
  			*/
  var room: String
}

object ChatRoomParticipantExit {
  @scala.inline
  def apply(participant: String, room: String): ChatRoomParticipantExit = {
    val __obj = js.Dynamic.literal(participant = participant.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChatRoomParticipantExit]
  }
}

