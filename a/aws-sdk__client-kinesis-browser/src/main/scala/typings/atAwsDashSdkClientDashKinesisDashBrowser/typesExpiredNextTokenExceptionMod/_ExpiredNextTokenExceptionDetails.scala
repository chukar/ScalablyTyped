package typings.atAwsDashSdkClientDashKinesisDashBrowser.typesExpiredNextTokenExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ExpiredNextTokenExceptionDetails extends js.Object {
  /**
    * _ErrorMessage shape
    */
  var message: js.UndefOr[String] = js.undefined
}

object _ExpiredNextTokenExceptionDetails {
  @scala.inline
  def apply(message: String = null): _ExpiredNextTokenExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ExpiredNextTokenExceptionDetails]
  }
}

