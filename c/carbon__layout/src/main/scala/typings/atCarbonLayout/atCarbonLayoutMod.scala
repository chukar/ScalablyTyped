package typings.atCarbonLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@carbon/layout", JSImport.Namespace)
@js.native
object atCarbonLayoutMod extends js.Object {
  val baseFontSize: Double = js.native
  val miniUnit: Double = js.native
  val spacing: js.Array[Double] = js.native
  @js.native
  object breakpoint extends js.Object {
    def apply(args: js.Any*): String = js.native
  }
  
  @js.native
  object breakpointDown extends js.Object {
    def apply(name: String): String = js.native
  }
  
  @js.native
  object breakpointUp extends js.Object {
    def apply(name: String): String = js.native
  }
  
  @js.native
  object breakpoints extends js.Object {
    var lg: Anon_Columns = js.native
    var max: Anon_Columns = js.native
    var md: Anon_Columns = js.native
    var sm: Anon_Columns = js.native
    var xlg: Anon_Columns = js.native
  }
  
  @js.native
  object em extends js.Object {
    def apply(px: Double): String = js.native
  }
  
  @js.native
  object miniUnits extends js.Object {
    def apply(count: Double): String = js.native
  }
  
  @js.native
  object px extends js.Object {
    def apply(value: Double): String = js.native
  }
  
  @js.native
  object rem extends js.Object {
    def apply(px: Double): String = js.native
  }
  
}

