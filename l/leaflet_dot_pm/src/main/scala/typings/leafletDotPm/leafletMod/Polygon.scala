package typings.leafletDotPm.leafletMod

import typings.leafletDotPm.leafletMod.PM.Edit.Line
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Polygon extends js.Object {
  var pm: Line
}

object Polygon {
  @scala.inline
  def apply(pm: Line): Polygon = {
    val __obj = js.Dynamic.literal(pm = pm.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Polygon]
  }
}

