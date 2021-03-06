package typings.reactDashInfiniteDashCalendar.reactDashInfiniteDashCalendarMod

import typings.reactDashInfiniteDashCalendar.Anon_0
import typings.reactDashInfiniteDashCalendar.Anon_AccentColor
import typings.reactDashInfiniteDashCalendar.Anon_End
import typings.reactDashInfiniteDashCalendar.Anon_HideYearsOnSelect
import typings.reactDashInfiniteDashCalendar.reactDashInfiniteDashCalendarBooleans.`false`
import typings.reactDashInfiniteDashCalendar.reactDashInfiniteDashCalendarNumbers.`0`
import typings.reactDashInfiniteDashCalendar.reactDashInfiniteDashCalendarNumbers.`1`
import typings.reactDashInfiniteDashCalendar.reactDashInfiniteDashCalendarNumbers.`2`
import typings.reactDashInfiniteDashCalendar.reactDashInfiniteDashCalendarNumbers.`3`
import typings.reactDashInfiniteDashCalendar.reactDashInfiniteDashCalendarNumbers.`4`
import typings.reactDashInfiniteDashCalendar.reactDashInfiniteDashCalendarNumbers.`5`
import typings.reactDashInfiniteDashCalendar.reactDashInfiniteDashCalendarNumbers.`6`
import typings.reactDashInfiniteDashCalendar.reactDashInfiniteDashCalendarStrings.`100Percentsign`
import typings.reactDashInfiniteDashCalendar.reactDashInfiniteDashCalendarStrings.auto
import typings.reactDashInfiniteDashCalendar.reactDashInfiniteDashCalendarStrings.days
import typings.reactDashInfiniteDashCalendar.reactDashInfiniteDashCalendarStrings.years
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactInfiniteCalendarProps extends js.Object {
  var Component: js.UndefOr[CalendarClass] = js.undefined
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var disabledDates: js.UndefOr[js.Array[DateType]] = js.undefined
  var disabledDays: js.UndefOr[js.Array[`0` | `1` | `2` | `3` | `4` | `5` | `6`]] = js.undefined
  var display: js.UndefOr[days | years] = js.undefined
  var displayOptions: js.UndefOr[Anon_HideYearsOnSelect] = js.undefined
  var height: js.UndefOr[Double | auto] = js.undefined
  var interpolateSelection: js.UndefOr[js.Function2[/* date */ Date, /* selected */ js.Array[Date], js.Array[Date]]] = js.undefined
  var locale: js.UndefOr[Anon_0] = js.undefined
  var max: js.UndefOr[DateType] = js.undefined
  var maxDate: js.UndefOr[DateType] = js.undefined
  var min: js.UndefOr[DateType] = js.undefined
  var minDate: js.UndefOr[DateType] = js.undefined
  var onScroll: js.UndefOr[js.Function1[/* scrollTop */ Double, Unit]] = js.undefined
  var onScrollEnd: js.UndefOr[js.Function1[/* scrollTop */ Double, Unit]] = js.undefined
  var onSelect: js.UndefOr[DateSelectFunction | RangedSelectFunction] = js.undefined
  var rowHeight: js.UndefOr[Double] = js.undefined
  var selected: js.UndefOr[DateType | `false` | Anon_End] = js.undefined
  var tabIndex: js.UndefOr[Double] = js.undefined
  var theme: js.UndefOr[Anon_AccentColor] = js.undefined
  var width: js.UndefOr[Double | auto | `100Percentsign`] = js.undefined
}

object ReactInfiniteCalendarProps {
  @scala.inline
  def apply(
    Component: CalendarClass = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    disabledDates: js.Array[DateType] = null,
    disabledDays: js.Array[`0` | `1` | `2` | `3` | `4` | `5` | `6`] = null,
    display: days | years = null,
    displayOptions: Anon_HideYearsOnSelect = null,
    height: Double | auto = null,
    interpolateSelection: (/* date */ Date, /* selected */ js.Array[Date]) => js.Array[Date] = null,
    locale: Anon_0 = null,
    max: DateType = null,
    maxDate: DateType = null,
    min: DateType = null,
    minDate: DateType = null,
    onScroll: /* scrollTop */ Double => Unit = null,
    onScrollEnd: /* scrollTop */ Double => Unit = null,
    onSelect: (/* date */ Date) | (/* rangedDate */ RangedSelection) => Unit = null,
    rowHeight: Int | Double = null,
    selected: DateType | `false` | Anon_End = null,
    tabIndex: Int | Double = null,
    theme: Anon_AccentColor = null,
    width: Double | auto | `100Percentsign` = null
  ): ReactInfiniteCalendarProps = {
    val __obj = js.Dynamic.literal()
    if (Component != null) __obj.updateDynamic("Component")(Component.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (disabledDates != null) __obj.updateDynamic("disabledDates")(disabledDates.asInstanceOf[js.Any])
    if (disabledDays != null) __obj.updateDynamic("disabledDays")(disabledDays.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (displayOptions != null) __obj.updateDynamic("displayOptions")(displayOptions.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (interpolateSelection != null) __obj.updateDynamic("interpolateSelection")(js.Any.fromFunction2(interpolateSelection))
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (onScrollEnd != null) __obj.updateDynamic("onScrollEnd")(js.Any.fromFunction1(onScrollEnd))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactInfiniteCalendarProps]
  }
}

