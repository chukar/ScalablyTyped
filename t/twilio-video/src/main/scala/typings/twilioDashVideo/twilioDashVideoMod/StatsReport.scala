package typings.twilioDashVideo.twilioDashVideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-video", "StatsReport")
@js.native
class StatsReport () extends js.Object {
  var localAudioTrackStats: js.Array[LocalAudioTrackStats] = js.native
  var localVideoTrackStats: js.Array[LocalVideoTrackStats] = js.native
  var peerConnectionId: String = js.native
  var remoteAudioTrackStats: js.Array[RemoteAudioTrackStats] = js.native
  var remoteVideoTrackStats: js.Array[RemoteVideoTrackStats] = js.native
}

