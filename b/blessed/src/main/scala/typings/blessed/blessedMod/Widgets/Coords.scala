package typings.blessed.blessedMod.Widgets

import typings.blessed.Anon_X
import typings.blessed.blessedMod.Widgets.Types.TPosition
import typings.blessed.blessedMod.Widgets.Types.TTopLeft
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Coords extends js.Object {
  var _contentEnd: Anon_X
  var base: Double
  var nobot: TPosition
  var noleft: TTopLeft
  var noright: TPosition
  var notop: TTopLeft
  var xi: Double
  var xl: Double
  var yi: Double
  var yl: Double
}

object Coords {
  @scala.inline
  def apply(
    _contentEnd: Anon_X,
    base: Double,
    nobot: TPosition,
    noleft: TTopLeft,
    noright: TPosition,
    notop: TTopLeft,
    xi: Double,
    xl: Double,
    yi: Double,
    yl: Double
  ): Coords = {
    val __obj = js.Dynamic.literal(_contentEnd = _contentEnd.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], nobot = nobot.asInstanceOf[js.Any], noleft = noleft.asInstanceOf[js.Any], noright = noright.asInstanceOf[js.Any], notop = notop.asInstanceOf[js.Any], xi = xi.asInstanceOf[js.Any], xl = xl.asInstanceOf[js.Any], yi = yi.asInstanceOf[js.Any], yl = yl.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Coords]
  }
}

