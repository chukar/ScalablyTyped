package typings.bootbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Group extends js.Object {
  var group: js.UndefOr[String] = js.undefined
  var text: String
  var value: String
}

object Anon_Group {
  @scala.inline
  def apply(text: String, value: String, group: String = null): Anon_Group = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Group]
  }
}

