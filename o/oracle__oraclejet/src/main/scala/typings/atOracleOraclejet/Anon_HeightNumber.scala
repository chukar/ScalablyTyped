package typings.atOracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HeightNumber extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
}

object Anon_HeightNumber {
  @scala.inline
  def apply(height: Int | Double = null): Anon_HeightNumber = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HeightNumber]
  }
}

