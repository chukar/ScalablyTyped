package typings.karma

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Layout extends js.Object {
  var layout: Anon_Pattern
  var `type`: String
}

object Anon_Layout {
  @scala.inline
  def apply(layout: Anon_Pattern, `type`: String): Anon_Layout = {
    val __obj = js.Dynamic.literal(layout = layout.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Layout]
  }
}

