package typings.cytoscape

import typings.cytoscape.cytoscapeMod.CollectionReturnValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Both extends js.Object {
  var both: CollectionReturnValue
  var left: CollectionReturnValue
  var right: CollectionReturnValue
}

object Anon_Both {
  @scala.inline
  def apply(both: CollectionReturnValue, left: CollectionReturnValue, right: CollectionReturnValue): Anon_Both = {
    val __obj = js.Dynamic.literal(both = both.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Both]
  }
}

