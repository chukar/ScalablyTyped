package typings.typedoc

import typings.typedoc.distLibModelsMod.Type
import typings.typedoc.distLibSerializationComponentsMod.TypeSerializerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/serializers/types/abstract", JSImport.Namespace)
@js.native
object distLibSerializationSerializersTypesAbstractMod extends js.Object {
  @js.native
  class TypeSerializer () extends TypeSerializerComponent[Type]
  
  /* static members */
  @js.native
  object TypeSerializer extends js.Object {
    var PRIORITY: Double = js.native
  }
  
}

