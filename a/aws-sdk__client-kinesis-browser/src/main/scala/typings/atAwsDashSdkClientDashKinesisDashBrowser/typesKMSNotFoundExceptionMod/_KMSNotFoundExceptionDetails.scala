package typings.atAwsDashSdkClientDashKinesisDashBrowser.typesKMSNotFoundExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _KMSNotFoundExceptionDetails extends js.Object {
  /**
    * <p>A message that provides information about the error.</p>
    */
  var message: js.UndefOr[String] = js.undefined
}

object _KMSNotFoundExceptionDetails {
  @scala.inline
  def apply(message: String = null): _KMSNotFoundExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[_KMSNotFoundExceptionDetails]
  }
}

