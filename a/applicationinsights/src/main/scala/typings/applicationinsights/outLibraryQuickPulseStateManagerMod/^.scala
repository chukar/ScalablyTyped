package typings.applicationinsights.outLibraryQuickPulseStateManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** State Container for sending to the QuickPulse Service */
@JSImport("applicationinsights/out/Library/QuickPulseStateManager", JSImport.Namespace)
@js.native
class ^ () extends QuickPulseStateManager {
  def this(iKey: String) = this()
  def this(iKey: String, context: typings.applicationinsights.outLibraryContextMod.^) = this()
}

@JSImport("applicationinsights/out/Library/QuickPulseStateManager", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var FALLBACK_INTERVAL: js.Any = js.native
  var MAX_PING_WAIT_TIME: js.Any = js.native
  var MAX_POST_WAIT_TIME: js.Any = js.native
  var PING_INTERVAL: js.Any = js.native
  var POST_INTERVAL: js.Any = js.native
}

