package typings.ws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: js.Any
  var target: this.type
  var `type`: String
}

object Anon_Data {
  @scala.inline
  def apply(data: js.Any, target: Anon_Data, `type`: String): Anon_Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Data]
  }
}

