package typings.tslint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Items extends js.Object {
  var items: Anon_Type
  var `type`: String
}

object Anon_Items {
  @scala.inline
  def apply(items: Anon_Type, `type`: String): Anon_Items = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Items]
  }
}

