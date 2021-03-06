package typings.cssDashTree.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Keyword extends js.Object {
  val basename: String
  val custom: Boolean
  val name: String
  val prefix: String
  val vendor: String
}

object Keyword {
  @scala.inline
  def apply(basename: String, custom: Boolean, name: String, prefix: String, vendor: String): Keyword = {
    val __obj = js.Dynamic.literal(basename = basename.asInstanceOf[js.Any], custom = custom.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Keyword]
  }
}

@JSImport("css-tree", "keyword")
@js.native
object keyword extends js.Object {
  def apply(value: String): Keyword = js.native
}

