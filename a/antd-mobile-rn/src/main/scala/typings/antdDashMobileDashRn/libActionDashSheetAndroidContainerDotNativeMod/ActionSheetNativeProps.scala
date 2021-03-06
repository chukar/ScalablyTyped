package typings.antdDashMobileDashRn.libActionDashSheetAndroidContainerDotNativeMod

import typings.antdDashMobileDashRn.libActionDashSheetStyleIndexDotNativeMod.ActionSheetStyle
import typings.reactDashNative.reactDashNativeMod.ActionSheetIOSOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionSheetNativeProps extends js.Object {
  var callback: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
  var config: ActionSheetIOSOptions
  var onAnimationEnd: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
  var styles: js.UndefOr[ActionSheetStyle] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object ActionSheetNativeProps {
  @scala.inline
  def apply(
    config: ActionSheetIOSOptions,
    callback: /* index */ Double => Unit = null,
    onAnimationEnd: /* visible */ Boolean => Unit = null,
    styles: ActionSheetStyle = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): ActionSheetNativeProps = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1(callback))
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1(onAnimationEnd))
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionSheetNativeProps]
  }
}

