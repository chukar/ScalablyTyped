package typings.hastDashFormat.hastDashFormatMod

import typings.hastDashFormat.hastDashFormatStrings.root
import typings.unist.unistMod.Data
import typings.unist.unistMod.Node
import typings.unist.unistMod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Root extends Parent {
  /**
    * Represents this variant of a Node.
    */
  @JSName("type")
  var type_Root: root
}

object Root {
  @scala.inline
  def apply(children: js.Array[Node], `type`: root, data: Data = null, position: Position = null): Root = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Root]
  }
}

