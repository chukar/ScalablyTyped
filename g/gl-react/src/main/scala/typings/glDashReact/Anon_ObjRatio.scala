package typings.glDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ObjRatio extends js.Object {
  var obj: js.Any
  var ratio: Boolean
  var `type`: String
}

object Anon_ObjRatio {
  @scala.inline
  def apply(obj: js.Any, ratio: Boolean, `type`: String): Anon_ObjRatio = {
    val __obj = js.Dynamic.literal(obj = obj.asInstanceOf[js.Any], ratio = ratio.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ObjRatio]
  }
}

