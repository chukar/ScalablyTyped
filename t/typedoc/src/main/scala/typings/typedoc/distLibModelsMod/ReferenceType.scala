package typings.typedoc.distLibModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models", "ReferenceType")
@js.native
class ReferenceType protected ()
  extends typings.typedoc.distLibModelsTypesMod.ReferenceType {
  def this(name: String, symbolID: Double) = this()
  def this(
    name: String,
    symbolID: Double,
    reflection: typings.typedoc.distLibModelsReflectionsAbstractMod.Reflection
  ) = this()
}

/* static members */
@JSImport("typedoc/dist/lib/models", "ReferenceType")
@js.native
object ReferenceType extends js.Object {
  var SYMBOL_ID_RESOLVED: Double = js.native
  var SYMBOL_ID_RESOLVE_BY_NAME: Double = js.native
}

