package typings.atAntDashDesignReactDashNative.libNoticeDashBarMod

import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.closable
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.link
import typings.atAntDashDesignReactDashNative.libNoticeDashBarMarqueeMod.MarqueeProps
import typings.atAntDashDesignReactDashNative.libNoticeDashBarPropsTypeMod.NoticeBarPropsType
import typings.atAntDashDesignReactDashNative.libNoticeDashBarStyleMod.NoticeBarStyle
import typings.atAntDashDesignReactDashNative.libStyleMod.WithThemeStyles
import typings.react.reactMod.ReactElement
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoticeNativeProps
  extends NoticeBarPropsType
     with WithThemeStyles[NoticeBarStyle] {
  var marqueeProps: js.UndefOr[MarqueeProps] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object NoticeNativeProps {
  @scala.inline
  def apply(
    action: ReactElement = null,
    icon: ReactElement = null,
    marqueeProps: MarqueeProps = null,
    mode: closable | link = null,
    onPress: () => Unit = null,
    style: StyleProp[ViewStyle] = null,
    styles: Partial[NoticeBarStyle] = null
  ): NoticeNativeProps = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (marqueeProps != null) __obj.updateDynamic("marqueeProps")(marqueeProps.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoticeNativeProps]
  }
}

