package typings.antdDashMobile.libListListItemMod

import typings.antdDashMobile.antdDashMobileStrings._empty
import typings.antdDashMobile.antdDashMobileStrings.android
import typings.antdDashMobile.antdDashMobileStrings.bottom
import typings.antdDashMobile.antdDashMobileStrings.down
import typings.antdDashMobile.antdDashMobileStrings.empty
import typings.antdDashMobile.antdDashMobileStrings.horizontal
import typings.antdDashMobile.antdDashMobileStrings.ios
import typings.antdDashMobile.antdDashMobileStrings.middle
import typings.antdDashMobile.antdDashMobileStrings.top
import typings.antdDashMobile.antdDashMobileStrings.up
import typings.antdDashMobile.libListPropsTypeMod.ListItemPropsType
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.MouseEventHandler
import typings.react.reactMod.NativeMouseEvent
import typings.react.reactMod.ReactNode
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemProps extends ListItemPropsType {
  var className: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var role: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object ListItemProps {
  @scala.inline
  def apply(
    activeStyle: CSSProperties = null,
    align: top | middle | bottom = null,
    arrow: horizontal | down | up | empty | _empty = null,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    extra: ReactNode = null,
    multipleLine: js.UndefOr[Boolean] = js.undefined,
    onClick: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit = null,
    platform: android | ios = null,
    prefixCls: String = null,
    role: String = null,
    style: CSSProperties = null,
    thumb: ReactNode = null,
    wrap: js.UndefOr[Boolean] = js.undefined
  ): ListItemProps = {
    val __obj = js.Dynamic.literal()
    if (activeStyle != null) __obj.updateDynamic("activeStyle")(activeStyle.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (arrow != null) __obj.updateDynamic("arrow")(arrow.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (!js.isUndefined(multipleLine)) __obj.updateDynamic("multipleLine")(multipleLine.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (thumb != null) __obj.updateDynamic("thumb")(thumb.asInstanceOf[js.Any])
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItemProps]
  }
}

