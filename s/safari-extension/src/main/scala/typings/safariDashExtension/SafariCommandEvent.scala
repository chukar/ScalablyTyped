package typings.safariDashExtension

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SafariCommandEvent extends SafariEvent {
  /**
  		* The command identifier of the target being dispatched.
  		*/
  var command: String
}

object SafariCommandEvent {
  @scala.inline
  def apply(
    bubbles: Boolean,
    cancelable: Boolean,
    command: String,
    currentTarget: SafariEventTarget,
    defaultPrevented: Boolean,
    eventPhase: Double,
    preventDefault: () => Unit,
    stopPropagation: () => Unit,
    target: SafariEventTarget,
    timestamp: Double,
    `type`: String
  ): SafariCommandEvent = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SafariCommandEvent]
  }
}

