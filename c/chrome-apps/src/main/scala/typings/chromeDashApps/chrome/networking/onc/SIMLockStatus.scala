package typings.chromeDashApps.chrome.networking.onc

import typings.chromeDashApps.chrome.integer
import typings.chromeDashApps.chromeDashAppsStrings._empty
import typings.chromeDashApps.chromeDashAppsStrings.`sim-pin`
import typings.chromeDashApps.chromeDashAppsStrings.`sim-puk`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SIMLockStatus extends js.Object {
  /** Whether SIM lock is enabled. */
  var LockEnabled: Boolean
  /** The status of SIM lock - possible values are 'sim-pin', 'sim-puk' and ''. */
  var LockType: `sim-pin` | `sim-puk` | _empty
  /** Number of PIN lock tries allowed before PUK is required to unlock the SIM. */
  var RetriesLeft: js.UndefOr[integer] = js.undefined
}

object SIMLockStatus {
  @scala.inline
  def apply(LockEnabled: Boolean, LockType: `sim-pin` | `sim-puk` | _empty, RetriesLeft: Int | Double = null): SIMLockStatus = {
    val __obj = js.Dynamic.literal(LockEnabled = LockEnabled.asInstanceOf[js.Any], LockType = LockType.asInstanceOf[js.Any])
    if (RetriesLeft != null) __obj.updateDynamic("RetriesLeft")(RetriesLeft.asInstanceOf[js.Any])
    __obj.asInstanceOf[SIMLockStatus]
  }
}

