package typings.braintreeDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BankDetails extends js.Object {
  var bankDetails: js.Any
  var bankLogin: js.Any
  var mandateText: String
}

object Anon_BankDetails {
  @scala.inline
  def apply(bankDetails: js.Any, bankLogin: js.Any, mandateText: String): Anon_BankDetails = {
    val __obj = js.Dynamic.literal(bankDetails = bankDetails.asInstanceOf[js.Any], bankLogin = bankLogin.asInstanceOf[js.Any], mandateText = mandateText.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BankDetails]
  }
}

