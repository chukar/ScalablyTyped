package typings.inversifyDashExpressDashUtils.dtsResultsBadRequestErrorMessageResultMod

import typings.inversifyDashExpressDashUtils.dtsHttpResponseMessageMod.HttpResponseMessage
import typings.inversifyDashExpressDashUtils.dtsInterfacesMod.interfaces.IHttpActionResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BadRequestErrorMessageResult extends IHttpActionResult {
  var apiController: js.Any
  var message: js.Any
}

object BadRequestErrorMessageResult {
  @scala.inline
  def apply(apiController: js.Any, executeAsync: () => js.Promise[HttpResponseMessage], message: js.Any): BadRequestErrorMessageResult = {
    val __obj = js.Dynamic.literal(apiController = apiController.asInstanceOf[js.Any], executeAsync = js.Any.fromFunction0(executeAsync), message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BadRequestErrorMessageResult]
  }
}

