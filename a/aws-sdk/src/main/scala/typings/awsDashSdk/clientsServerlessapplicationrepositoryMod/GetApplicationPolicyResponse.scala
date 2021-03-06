package typings.awsDashSdk.clientsServerlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetApplicationPolicyResponse extends js.Object {
  /**
    * An array of policy statements applied to the application.
    */
  var Statements: js.UndefOr[__listOfApplicationPolicyStatement] = js.native
}

object GetApplicationPolicyResponse {
  @scala.inline
  def apply(Statements: __listOfApplicationPolicyStatement = null): GetApplicationPolicyResponse = {
    val __obj = js.Dynamic.literal()
    if (Statements != null) __obj.updateDynamic("Statements")(Statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetApplicationPolicyResponse]
  }
}

