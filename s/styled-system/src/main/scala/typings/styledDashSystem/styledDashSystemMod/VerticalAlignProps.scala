package typings.styledDashSystem.styledDashSystemMod

import typings.csstype.csstypeMod.VerticalAlignProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerticalAlignProps[TLength] extends js.Object {
  /**
    * The vertical-align CSS property specifies sets vertical alignment of an inline or table-cell box.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/vertical-align)
    */
  var verticalAlign: js.UndefOr[ResponsiveValue[VerticalAlignProperty[TLength]]] = js.undefined
}

object VerticalAlignProps {
  @scala.inline
  def apply[TLength](verticalAlign: ResponsiveValue[VerticalAlignProperty[TLength]] = null): VerticalAlignProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerticalAlignProps[TLength]]
  }
}

