package typings.nodal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: js.Any
  var meta: Anon_Count
}

object Anon_Data {
  @scala.inline
  def apply(data: js.Any, meta: Anon_Count): Anon_Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Data]
  }
}

