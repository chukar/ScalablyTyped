package typings.chromeDashApps.chrome.notifications

import org.scalablytyped.runtime.TopLevel
import typings.chromeDashApps.chrome.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The user clicked in a non-button area of the notification. */
@JSGlobal("chrome.notifications.onClicked")
@js.native
object onClicked
  extends TopLevel[Event[js.Function1[/* notificationId */ String, Unit]]]

