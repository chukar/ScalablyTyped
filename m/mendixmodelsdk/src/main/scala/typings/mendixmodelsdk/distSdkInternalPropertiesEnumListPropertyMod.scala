package typings.mendixmodelsdk

import org.scalablytyped.runtime.Instantiable2
import typings.mendixmodelsdk.distSdkInternalInstancesMod.AbstractEnum
import typings.mendixmodelsdk.distSdkInternalPropertiesPrimitiveListPropertyMod.PrimitiveListProperty
import typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructureClass
import typings.mendixmodelsdk.distSdkInternalStructuresMod.Structure
import typings.mendixmodelsdk.distSdkInternalVersionChecksMod.ILifeCycle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/properties/EnumListProperty", JSImport.Namespace)
@js.native
object distSdkInternalPropertiesEnumListPropertyMod extends js.Object {
  @js.native
  class EnumListProperty[T /* <: AbstractEnum */] protected () extends PrimitiveListProperty[T] {
    def this(
      declaredOn: IStructureClass,
      parent: Structure,
      name: String,
      initialValue: js.Array[T],
      enumType: Instantiable2[/* key */ String, /* lifeCycle */ ILifeCycle, AbstractEnum]
    ) = this()
    var enumType: Instantiable2[/* key */ String, /* lifeCycle */ ILifeCycle, AbstractEnum] = js.native
    var initialValue: js.Any = js.native
  }
  
}

