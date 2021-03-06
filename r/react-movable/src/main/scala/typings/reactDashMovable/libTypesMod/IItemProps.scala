package typings.reactDashMovable.libTypesMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.KeyboardEvent
import typings.react.reactMod.RefObject
import typings.react.reactMod.WheelEvent
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IItemProps extends js.Object {
  var `aria-roledescription`: js.UndefOr[String] = js.undefined
  var key: js.UndefOr[Double] = js.undefined
  var onKeyDown: js.UndefOr[js.Function1[/* e */ KeyboardEvent[Element], Unit]] = js.undefined
  var onWheel: js.UndefOr[js.Function1[/* e */ WheelEvent[Element], Unit]] = js.undefined
  var ref: js.UndefOr[RefObject[_]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var tabIndex: js.UndefOr[Double] = js.undefined
}

object IItemProps {
  @scala.inline
  def apply(
    `aria-roledescription`: String = null,
    key: Int | Double = null,
    onKeyDown: /* e */ KeyboardEvent[Element] => Unit = null,
    onWheel: /* e */ WheelEvent[Element] => Unit = null,
    ref: RefObject[_] = null,
    style: CSSProperties = null,
    tabIndex: Int | Double = null
  ): IItemProps = {
    val __obj = js.Dynamic.literal()
    if (`aria-roledescription` != null) __obj.updateDynamic("aria-roledescription")(`aria-roledescription`.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1(onWheel))
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IItemProps]
  }
}

