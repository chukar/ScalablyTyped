package typings.cssDashTree.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Raw
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  @JSName("type")
  var type_Raw: typings.cssDashTree.cssDashTreeStrings.Raw
  var value: String
}

object Raw {
  @scala.inline
  def apply(`type`: typings.cssDashTree.cssDashTreeStrings.Raw, value: String, loc: CssLocation = null): Raw = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Raw]
  }
}

