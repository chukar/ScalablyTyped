package typings.materialDashUi.__MaterialUI.Card

import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardExpandableProps extends js.Object {
  var expanded: js.UndefOr[Boolean] = js.undefined
  var onExpanding: js.UndefOr[js.Function1[/* isExpanded */ Boolean, Unit]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object CardExpandableProps {
  @scala.inline
  def apply(
    expanded: js.UndefOr[Boolean] = js.undefined,
    onExpanding: /* isExpanded */ Boolean => Unit = null,
    style: CSSProperties = null
  ): CardExpandableProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded.asInstanceOf[js.Any])
    if (onExpanding != null) __obj.updateDynamic("onExpanding")(js.Any.fromFunction1(onExpanding))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardExpandableProps]
  }
}

