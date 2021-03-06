package typings.styledDashSystem.styledDashSystemMod

import typings.csstype.csstypeMod.DisplayProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisplayProps extends js.Object {
  /**
    * The display CSS property defines the display type of an element, which consists of the two basic qualities
    * of how an element generates boxes — the outer display type defining how the box participates in flow layout,
    * and the inner display type defining how the children of the box are laid out.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/display)
    */
  var display: js.UndefOr[ResponsiveValue[DisplayProperty]] = js.undefined
}

object DisplayProps {
  @scala.inline
  def apply(display: ResponsiveValue[DisplayProperty] = null): DisplayProps = {
    val __obj = js.Dynamic.literal()
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayProps]
  }
}

