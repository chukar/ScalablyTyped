package typings.atOracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Focused extends js.Object {
  var focused: Boolean
  var hovered: Boolean
  var selected: Boolean
}

object Anon_Focused {
  @scala.inline
  def apply(focused: Boolean, hovered: Boolean, selected: Boolean): Anon_Focused = {
    val __obj = js.Dynamic.literal(focused = focused.asInstanceOf[js.Any], hovered = hovered.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Focused]
  }
}

