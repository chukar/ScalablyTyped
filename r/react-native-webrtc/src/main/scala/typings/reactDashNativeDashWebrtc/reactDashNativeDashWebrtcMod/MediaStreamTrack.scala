package typings.reactDashNativeDashWebrtc.reactDashNativeDashWebrtcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-webrtc", "MediaStreamTrack")
@js.native
class MediaStreamTrack () extends js.Object {
  var _enabled: Boolean = js.native
  var enabled: Boolean = js.native
  var id: String = js.native
  var kind: String = js.native
  var label: String = js.native
  var muted: Boolean = js.native
  var readonly: Boolean = js.native
  var readyState: MediaStreamTrackState = js.native
  var remote: Boolean = js.native
  /* private */ def _switchCamera(): Unit = js.native
  def applyConstraints(): Unit = js.native
  def getCapabilities(): Unit = js.native
  def getConstraints(): Unit = js.native
  def getSettings(): Unit = js.native
  def onended(): js.UndefOr[Unit] = js.native
  def onmute(): js.UndefOr[Unit] = js.native
  def onunmute(): js.UndefOr[Unit] = js.native
  def overconstrained(): js.UndefOr[Unit] = js.native
  def release(): Unit = js.native
  def stop(): Unit = js.native
}

