package typings.baidumapDashWebDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fromitem extends js.Object {
  var fromitem: js.Any
  var target: js.Any
  var toitem: js.Any
  var `type`: String
}

object Anon_Fromitem {
  @scala.inline
  def apply(fromitem: js.Any, target: js.Any, toitem: js.Any, `type`: String): Anon_Fromitem = {
    val __obj = js.Dynamic.literal(fromitem = fromitem.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], toitem = toitem.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Fromitem]
  }
}

