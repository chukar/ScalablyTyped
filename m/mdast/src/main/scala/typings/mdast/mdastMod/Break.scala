package typings.mdast.mdastMod

import typings.mdast.mdastStrings.break
import typings.unist.unistMod.Data
import typings.unist.unistMod.Node
import typings.unist.unistMod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Break
  extends StaticPhrasingContent
     with Node {
  @JSName("type")
  var type_Break: break
}

object Break {
  @scala.inline
  def apply(`type`: break, data: Data = null, position: Position = null): Break = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Break]
  }
}

