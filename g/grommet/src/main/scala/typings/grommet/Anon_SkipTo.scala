package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SkipTo extends js.Object {
  var skipTo: js.UndefOr[String] = js.undefined
}

object Anon_SkipTo {
  @scala.inline
  def apply(skipTo: String = null): Anon_SkipTo = {
    val __obj = js.Dynamic.literal()
    if (skipTo != null) __obj.updateDynamic("skipTo")(skipTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_SkipTo]
  }
}

