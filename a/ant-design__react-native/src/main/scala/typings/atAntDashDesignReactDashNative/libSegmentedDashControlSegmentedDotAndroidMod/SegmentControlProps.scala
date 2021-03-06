package typings.atAntDashDesignReactDashNative.libSegmentedDashControlSegmentedDotAndroidMod

import typings.atAntDashDesignReactDashNative.libSegmentedDashControlPropsTypeMod.SegmentedControlPropsType
import typings.atAntDashDesignReactDashNative.libSegmentedDashControlStyleMod.SegmentControlStyle
import typings.atAntDashDesignReactDashNative.libStyleMod.WithThemeStyles
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentControlProps
  extends SegmentedControlPropsType
     with WithThemeStyles[SegmentControlStyle] {
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object SegmentControlProps {
  @scala.inline
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    onChange: /* e */ js.Any => Unit = null,
    onValueChange: /* value */ String => Unit = null,
    selectedIndex: Int | Double = null,
    selectedTextColor: String = null,
    style: StyleProp[ViewStyle] = null,
    styles: Partial[SegmentControlStyle] = null,
    tintColor: String = null,
    values: js.Array[String] = null
  ): SegmentControlProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onValueChange != null) __obj.updateDynamic("onValueChange")(js.Any.fromFunction1(onValueChange))
    if (selectedIndex != null) __obj.updateDynamic("selectedIndex")(selectedIndex.asInstanceOf[js.Any])
    if (selectedTextColor != null) __obj.updateDynamic("selectedTextColor")(selectedTextColor.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentControlProps]
  }
}

