package typings.baseui

import typings.baseui.baseuiStrings.backdrop
import typings.baseui.baseuiStrings.closeButton
import typings.baseui.baseuiStrings.escape_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Backdrop extends js.Object {
  var closeSource: js.UndefOr[closeButton | backdrop | escape_] = js.undefined
}

object Anon_Backdrop {
  @scala.inline
  def apply(closeSource: closeButton | backdrop | escape_ = null): Anon_Backdrop = {
    val __obj = js.Dynamic.literal()
    if (closeSource != null) __obj.updateDynamic("closeSource")(closeSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Backdrop]
  }
}

