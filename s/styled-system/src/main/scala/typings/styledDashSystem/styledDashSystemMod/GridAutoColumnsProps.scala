package typings.styledDashSystem.styledDashSystemMod

import typings.csstype.csstypeMod.GridAutoColumnsProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridAutoColumnsProps[TLength] extends js.Object {
  /**
    * The grid-auto-columns CSS property specifies the size of an implicitly-created grid column track.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-auto-columns)
    */
  var gridAutoColumns: js.UndefOr[ResponsiveValue[GridAutoColumnsProperty[TLength]]] = js.undefined
}

object GridAutoColumnsProps {
  @scala.inline
  def apply[TLength](gridAutoColumns: ResponsiveValue[GridAutoColumnsProperty[TLength]] = null): GridAutoColumnsProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (gridAutoColumns != null) __obj.updateDynamic("gridAutoColumns")(gridAutoColumns.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridAutoColumnsProps[TLength]]
  }
}

