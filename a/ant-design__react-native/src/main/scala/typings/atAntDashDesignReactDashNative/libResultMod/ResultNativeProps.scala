package typings.atAntDashDesignReactDashNative.libResultMod

import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.ghost
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.primary
import typings.atAntDashDesignReactDashNative.libResultPropsTypeMod.ResultPropsType
import typings.atAntDashDesignReactDashNative.libResultStyleMod.ResultStyle
import typings.atAntDashDesignReactDashNative.libStyleMod.WithThemeStyles
import typings.react.reactMod.ReactNode
import typings.reactDashNative.reactDashNativeMod.ImagePropertiesSourceOptions
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultNativeProps
  extends ResultPropsType
     with WithThemeStyles[ResultStyle] {
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object ResultNativeProps {
  @scala.inline
  def apply(
    buttonText: String = null,
    buttonType: primary | ghost = null,
    img: ReactNode = null,
    imgUrl: ImagePropertiesSourceOptions = null,
    message: ReactNode = null,
    onButtonClick: /* e */ js.Any => Unit = null,
    style: StyleProp[ViewStyle] = null,
    styles: Partial[ResultStyle] = null,
    title: ReactNode = null
  ): ResultNativeProps = {
    val __obj = js.Dynamic.literal()
    if (buttonText != null) __obj.updateDynamic("buttonText")(buttonText.asInstanceOf[js.Any])
    if (buttonType != null) __obj.updateDynamic("buttonType")(buttonType.asInstanceOf[js.Any])
    if (img != null) __obj.updateDynamic("img")(img.asInstanceOf[js.Any])
    if (imgUrl != null) __obj.updateDynamic("imgUrl")(imgUrl.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (onButtonClick != null) __obj.updateDynamic("onButtonClick")(js.Any.fromFunction1(onButtonClick))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultNativeProps]
  }
}

