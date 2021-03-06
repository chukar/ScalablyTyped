package typings.antdDashMobileDashRn.libCardPropsTypeMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardHeaderPropsType extends js.Object {
  var extra: js.UndefOr[ReactNode] = js.undefined
  /** need url of img, if this is string. */
  var thumb: js.UndefOr[ReactNode] = js.undefined
  var title: js.UndefOr[ReactNode] = js.undefined
}

object CardHeaderPropsType {
  @scala.inline
  def apply(extra: ReactNode = null, thumb: ReactNode = null, title: ReactNode = null): CardHeaderPropsType = {
    val __obj = js.Dynamic.literal()
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (thumb != null) __obj.updateDynamic("thumb")(thumb.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardHeaderPropsType]
  }
}

