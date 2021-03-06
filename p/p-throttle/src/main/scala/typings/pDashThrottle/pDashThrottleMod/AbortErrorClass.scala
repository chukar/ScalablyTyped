package typings.pDashThrottle.pDashThrottleMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbortErrorClass extends Error {
  @JSName("name")
  val name_AbortErrorClass: typings.pDashThrottle.pDashThrottleStrings.AbortError
}

object AbortErrorClass {
  @scala.inline
  def apply(message: String, name: typings.pDashThrottle.pDashThrottleStrings.AbortError, stack: String = null): AbortErrorClass = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbortErrorClass]
  }
}

