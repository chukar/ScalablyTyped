package typings.ssh2DashStreams.ssh2DashStreamsMod

import typings.ssh2DashStreams.ssh2DashStreamsStrings.session
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionChannelInfo extends ChannelOpenInfo {
  var packetSize: Double
  var sender: Double
  var `type`: session
  var window: Double
}

object SessionChannelInfo {
  @scala.inline
  def apply(packetSize: Double, sender: Double, `type`: session, window: Double): SessionChannelInfo = {
    val __obj = js.Dynamic.literal(packetSize = packetSize.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionChannelInfo]
  }
}

