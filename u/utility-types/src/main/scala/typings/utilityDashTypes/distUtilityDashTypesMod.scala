package typings.utilityDashTypes

import typings.std.Pick
import typings.utilityDashTypes.distMappedDashTypesMod.DeepReadonly
import typings.utilityDashTypes.distMappedDashTypesMod.SetComplement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("utility-types/dist/utility-types", JSImport.Namespace)
@js.native
object distUtilityDashTypesMod extends js.Object {
  type $Call[Fn /* <: js.Function1[/* repeated */ js.Any, _] */] = js.Any
  type $Diff[T /* <: U */, U /* <: js.Object */] = Pick[T, SetComplement[String, String]]
  type $ElementType[T /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in K & any ]: any}
    */ typings.utilityDashTypes.utilityDashTypesStrings.$ElementType with js.Any */, K /* <: String | Double */] = /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  type $Keys[T /* <: js.Object */] = String
  type $PropertyType[T /* <: js.Object */, K /* <: String */] = /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  type $ReadOnly[T /* <: js.Object */] = DeepReadonly[T]
  type $Values[T /* <: js.Object */] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
}

