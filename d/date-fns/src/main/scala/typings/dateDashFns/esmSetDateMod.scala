package typings.dateDashFns

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/esm/setDate", JSImport.Namespace)
@js.native
object esmSetDateMod extends js.Object {
  @js.native
  object default extends js.Object {
    def apply(date: Double, dayOfMonth: Double): Date = js.native
    def apply(date: Date, dayOfMonth: Double): Date = js.native
  }
  
}

