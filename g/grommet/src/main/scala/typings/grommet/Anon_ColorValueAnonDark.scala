package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorValueAnonDark extends js.Object {
  var color: js.UndefOr[String | Anon_Dark] = js.undefined
  var value: Double
}

object Anon_ColorValueAnonDark {
  @scala.inline
  def apply(value: Double, color: String | Anon_Dark = null): Anon_ColorValueAnonDark = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ColorValueAnonDark]
  }
}

