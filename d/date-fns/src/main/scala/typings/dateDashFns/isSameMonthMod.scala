package typings.dateDashFns

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/isSameMonth", JSImport.Namespace)
@js.native
object isSameMonthMod extends js.Object {
  @js.native
  object default extends js.Object {
    def apply(dateLeft: Double, dateRight: Double): Boolean = js.native
    def apply(dateLeft: Double, dateRight: Date): Boolean = js.native
    def apply(dateLeft: Date, dateRight: Double): Boolean = js.native
    def apply(dateLeft: Date, dateRight: Date): Boolean = js.native
  }
  
}

