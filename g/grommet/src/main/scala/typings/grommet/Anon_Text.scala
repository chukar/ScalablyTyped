package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Text extends js.Object {
  var text: js.UndefOr[Anon_LargeMediumSmallXlarge] = js.undefined
}

object Anon_Text {
  @scala.inline
  def apply(text: Anon_LargeMediumSmallXlarge = null): Anon_Text = {
    val __obj = js.Dynamic.literal()
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Text]
  }
}

