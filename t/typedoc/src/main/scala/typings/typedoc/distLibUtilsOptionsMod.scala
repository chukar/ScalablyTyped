package typings.typedoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/utils/options", JSImport.Namespace)
@js.native
object distLibUtilsOptionsMod extends js.Object {
  @js.native
  class Options ()
    extends typings.typedoc.distLibUtilsOptionsOptionsMod.Options
  
  @js.native
  object OptionsReadMode extends js.Object {
    /* 1 */ val Fetch: typings.typedoc.distLibUtilsOptionsOptionsMod.OptionsReadMode.Fetch with Double = js.native
    /* 0 */ val Prefetch: typings.typedoc.distLibUtilsOptionsOptionsMod.OptionsReadMode.Prefetch with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.typedoc.distLibUtilsOptionsOptionsMod.OptionsReadMode with Double] = js.native
  }
  
}

