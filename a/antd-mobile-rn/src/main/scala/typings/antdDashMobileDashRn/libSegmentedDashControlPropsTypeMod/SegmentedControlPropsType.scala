package typings.antdDashMobileDashRn.libSegmentedDashControlPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentedControlPropsType extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ js.Any, Unit]] = js.undefined
  var onValueChange: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
  var selectedIndex: js.UndefOr[Double] = js.undefined
  var tintColor: js.UndefOr[String] = js.undefined
  var values: js.UndefOr[js.Array[String]] = js.undefined
}

object SegmentedControlPropsType {
  @scala.inline
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    onChange: /* e */ js.Any => Unit = null,
    onValueChange: /* value */ String => Unit = null,
    selectedIndex: Int | Double = null,
    tintColor: String = null,
    values: js.Array[String] = null
  ): SegmentedControlPropsType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onValueChange != null) __obj.updateDynamic("onValueChange")(js.Any.fromFunction1(onValueChange))
    if (selectedIndex != null) __obj.updateDynamic("selectedIndex")(selectedIndex.asInstanceOf[js.Any])
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentedControlPropsType]
  }
}

