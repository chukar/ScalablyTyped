package typings.twilioDashVideo.twilioDashVideoMod

import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.Blob
import typings.twilioDashVideo.twilioDashVideoMod.Track.ID
import typings.twilioDashVideo.twilioDashVideoStrings.data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-video", "LocalDataTrack")
@js.native
class LocalDataTrack ()
  extends Track
     with DataTrack
     with LocalTrack {
  def this(options: LocalDataTrackOptions) = this()
  var id: ID = js.native
  @JSName("kind")
  var kind_LocalDataTrack: data = js.native
  var maxPacketLifeTime: Double | Null = js.native
  var maxRetransmits: Double | Null = js.native
  var ordered: Boolean = js.native
  var reliable: Boolean = js.native
  def send(data: String): Unit = js.native
  def send(data: ArrayBuffer): Unit = js.native
  def send(data: ArrayBufferView): Unit = js.native
  def send(data: Blob): Unit = js.native
}

