package typings.zchatDashBrowser

import typings.zchatDashBrowser.zchatDashBrowserMod._EventData
import typings.zchatDashBrowser.zchatDashBrowserStrings.chatDotqueue_position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Chatqueueposition extends _EventData {
  var nick: String
  var queue_position: Double
  var `type`: chatDotqueue_position
}

object Anon_Chatqueueposition {
  @scala.inline
  def apply(nick: String, queue_position: Double, `type`: chatDotqueue_position): Anon_Chatqueueposition = {
    val __obj = js.Dynamic.literal(nick = nick.asInstanceOf[js.Any], queue_position = queue_position.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Chatqueueposition]
  }
}

