package typings.reactDashDayDashPicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesCommonMod {
  import typings.std.Date

  type FunctionModifier = js.Function1[/* date */ Date, Boolean]
  /* Rewritten from type alias, can be one of: 
    - typings.std.Date
    - typings.reactDashDayDashPicker.typesCommonMod.RangeModifier
    - typings.reactDashDayDashPicker.typesCommonMod.BeforeModifier
    - typings.reactDashDayDashPicker.typesCommonMod.AfterModifier
    - typings.reactDashDayDashPicker.typesCommonMod.BeforeAfterModifier
    - typings.reactDashDayDashPicker.typesCommonMod.DaysOfWeekModifier
    - typings.reactDashDayDashPicker.typesCommonMod.FunctionModifier
    - `js.undefined`
  */
  type Modifier = js.UndefOr[_Modifier | Date | FunctionModifier]
}
