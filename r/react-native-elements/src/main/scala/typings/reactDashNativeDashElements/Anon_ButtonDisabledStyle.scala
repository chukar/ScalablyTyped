package typings.reactDashNativeDashElements

import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ButtonDisabledStyle extends js.Object {
  var buttonDisabledStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var buttonDisabledTextStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var buttonStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var buttonTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var color: js.UndefOr[String] = js.undefined
}

object Anon_ButtonDisabledStyle {
  @scala.inline
  def apply(
    buttonDisabledStyle: StyleProp[ViewStyle] = null,
    buttonDisabledTextStyle: StyleProp[ViewStyle] = null,
    buttonStyle: StyleProp[ViewStyle] = null,
    buttonTextStyle: StyleProp[TextStyle] = null,
    color: String = null
  ): Anon_ButtonDisabledStyle = {
    val __obj = js.Dynamic.literal()
    if (buttonDisabledStyle != null) __obj.updateDynamic("buttonDisabledStyle")(buttonDisabledStyle.asInstanceOf[js.Any])
    if (buttonDisabledTextStyle != null) __obj.updateDynamic("buttonDisabledTextStyle")(buttonDisabledTextStyle.asInstanceOf[js.Any])
    if (buttonStyle != null) __obj.updateDynamic("buttonStyle")(buttonStyle.asInstanceOf[js.Any])
    if (buttonTextStyle != null) __obj.updateDynamic("buttonTextStyle")(buttonTextStyle.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ButtonDisabledStyle]
  }
}

