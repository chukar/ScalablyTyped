package typings.superstruct

import typings.superstruct.libStructMod.Struct
import typings.superstruct.libSuperstructMod.Superstruct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("superstruct/lib/structs/tuple", JSImport.Namespace)
@js.native
object libStructsTupleMod extends js.Object {
  def createTuple(schema: js.Array[_], defaults: js.Any, struct: Superstruct): Struct = js.native
}

