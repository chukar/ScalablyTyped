package typings.iobroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Channel extends js.Object {
  var channel: String
  var device: String
  var state: String
}

object Anon_Channel {
  @scala.inline
  def apply(channel: String, device: String, state: String): Anon_Channel = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Channel]
  }
}

