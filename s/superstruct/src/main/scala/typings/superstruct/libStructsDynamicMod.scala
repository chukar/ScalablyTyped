package typings.superstruct

import typings.superstruct.libStructDashErrorMod.Branch
import typings.superstruct.libStructDashErrorMod.Path
import typings.superstruct.libStructMod.Struct
import typings.superstruct.libSuperstructMod.Superstruct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("superstruct/lib/structs/dynamic", JSImport.Namespace)
@js.native
object libStructsDynamicMod extends js.Object {
  def createDynamic(
    schema: js.Function3[/* value */ js.Any, /* branch */ Branch, /* path */ Path, Struct],
    defaults: js.Any,
    struct: Superstruct
  ): Struct = js.native
}

