package typings.jestDashMatcherDashUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsDirectExpectCall extends js.Object {
  var isDirectExpectCall: js.UndefOr[Boolean] = js.undefined
  var secondArgument: js.UndefOr[String] = js.undefined
}

object Anon_IsDirectExpectCall {
  @scala.inline
  def apply(isDirectExpectCall: js.UndefOr[Boolean] = js.undefined, secondArgument: String = null): Anon_IsDirectExpectCall = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isDirectExpectCall)) __obj.updateDynamic("isDirectExpectCall")(isDirectExpectCall.asInstanceOf[js.Any])
    if (secondArgument != null) __obj.updateDynamic("secondArgument")(secondArgument.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IsDirectExpectCall]
  }
}

