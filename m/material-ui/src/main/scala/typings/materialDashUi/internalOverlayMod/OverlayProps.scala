package typings.materialDashUi.internalOverlayMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.MouseEventHandler
import typings.react.reactMod.NativeMouseEvent
import typings.react.reactMod.Props
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverlayProps extends Props[Overlay] {
  var autoLockScrolling: js.UndefOr[Boolean] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
  var show: Boolean
  var style: js.UndefOr[CSSProperties] = js.undefined
  var transitionEnabled: js.UndefOr[Boolean] = js.undefined
}

object OverlayProps {
  @scala.inline
  def apply(
    show: Boolean,
    autoLockScrolling: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    key: Key = null,
    onClick: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    ref: LegacyRef[Overlay] = null,
    style: CSSProperties = null,
    transitionEnabled: js.UndefOr[Boolean] = js.undefined
  ): OverlayProps = {
    val __obj = js.Dynamic.literal(show = show.asInstanceOf[js.Any])
    if (!js.isUndefined(autoLockScrolling)) __obj.updateDynamic("autoLockScrolling")(autoLockScrolling.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(transitionEnabled)) __obj.updateDynamic("transitionEnabled")(transitionEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayProps]
  }
}

