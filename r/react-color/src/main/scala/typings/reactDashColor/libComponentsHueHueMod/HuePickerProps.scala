package typings.reactDashColor.libComponentsHueHueMod

import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
import typings.reactDashColor.reactDashColorMod.Color
import typings.reactDashColor.reactDashColorMod.ColorPickerProps
import typings.reactDashColor.reactDashColorMod.ColorResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HuePickerProps extends ColorPickerProps[HuePicker] {
  var height: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[String] = js.undefined
}

object HuePickerProps {
  @scala.inline
  def apply(
    color: Color = null,
    height: String = null,
    key: Key = null,
    onChange: /* color */ ColorResult => Unit = null,
    onChangeComplete: /* color */ ColorResult => Unit = null,
    ref: LegacyRef[HuePicker] = null,
    width: String = null
  ): HuePickerProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onChangeComplete != null) __obj.updateDynamic("onChangeComplete")(js.Any.fromFunction1(onChangeComplete))
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[HuePickerProps]
  }
}

