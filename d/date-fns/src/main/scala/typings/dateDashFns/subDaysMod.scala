package typings.dateDashFns

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/subDays", JSImport.Namespace)
@js.native
object subDaysMod extends js.Object {
  @js.native
  object default extends js.Object {
    def apply(date: Double, amount: Double): Date = js.native
    def apply(date: Date, amount: Double): Date = js.native
  }
  
}

