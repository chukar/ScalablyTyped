package typings.atAntDashDesignProDashLayout

import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassName extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var isChildrenLayout: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object Anon_ClassName {
  @scala.inline
  def apply(
    className: String = null,
    isChildrenLayout: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null
  ): Anon_ClassName = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(isChildrenLayout)) __obj.updateDynamic("isChildrenLayout")(isChildrenLayout.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ClassName]
  }
}

