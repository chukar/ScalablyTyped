package typings.atBabelCodeDashFrame

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Column extends js.Object {
  var column: js.UndefOr[Double] = js.undefined
  var line: Double
}

object Anon_Column {
  @scala.inline
  def apply(line: Double, column: Int | Double = null): Anon_Column = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any])
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Column]
  }
}

