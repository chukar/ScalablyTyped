package typings.atAwsDashSdkClientDashKinesisDashBrowser.typesKMSOptInRequiredMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _KMSOptInRequiredDetails extends js.Object {
  /**
    * <p>A message that provides information about the error.</p>
    */
  var message: js.UndefOr[String] = js.undefined
}

object _KMSOptInRequiredDetails {
  @scala.inline
  def apply(message: String = null): _KMSOptInRequiredDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[_KMSOptInRequiredDetails]
  }
}

