package typings.styledDashSystem.styledDashSystemMod

import typings.csstype.csstypeMod.HeightProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeProps[TLength] extends js.Object {
  var size: js.UndefOr[ResponsiveValue[HeightProperty[TLength]]] = js.undefined
}

object SizeProps {
  @scala.inline
  def apply[TLength](size: ResponsiveValue[HeightProperty[TLength]] = null): SizeProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeProps[TLength]]
  }
}

