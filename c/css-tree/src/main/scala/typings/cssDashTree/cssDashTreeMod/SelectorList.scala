package typings.cssDashTree.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectorList
  extends CssNodeCommon
     with CssNode {
  var children: List[CssNode]
  @JSName("type")
  var type_SelectorList: typings.cssDashTree.cssDashTreeStrings.SelectorList
}

object SelectorList {
  @scala.inline
  def apply(
    children: List[CssNode],
    `type`: typings.cssDashTree.cssDashTreeStrings.SelectorList,
    loc: CssLocation = null
  ): SelectorList = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectorList]
  }
}

