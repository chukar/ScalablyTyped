package typings.chromeDashApps.chrome.displaySource

import typings.chromeDashApps.Anon_CONNECTED
import typings.chromeDashApps.chrome.ToStringLiteral
import typings.chromeDashApps.chrome.integer
import typings.chromeDashApps.chromeDashAppsStrings.Connected
import typings.chromeDashApps.chromeDashAppsStrings.Connecting
import typings.chromeDashApps.chromeDashAppsStrings.Disconnected
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SinkInfo extends js.Object {
  /** Id of the sink. It is guaranteed to be unique during the browser session. */
  var id: integer
  /** Human readable name of the sink. */
  var name: String
  /**
    * State of the sink.
    * @see SinkState
    */
  var state: ToStringLiteral[Anon_CONNECTED, String, Exclude[String, Connected | Connecting | Disconnected]]
}

object SinkInfo {
  @scala.inline
  def apply(
    id: integer,
    name: String,
    state: ToStringLiteral[Anon_CONNECTED, String, Exclude[String, Connected | Connecting | Disconnected]]
  ): SinkInfo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SinkInfo]
  }
}

