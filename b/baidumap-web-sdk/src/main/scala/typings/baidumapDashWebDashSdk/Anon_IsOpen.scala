package typings.baidumapDashWebDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsOpen extends js.Object {
  var isOpen: Boolean
  var target: js.Any
  var `type`: String
}

object Anon_IsOpen {
  @scala.inline
  def apply(isOpen: Boolean, target: js.Any, `type`: String): Anon_IsOpen = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IsOpen]
  }
}

