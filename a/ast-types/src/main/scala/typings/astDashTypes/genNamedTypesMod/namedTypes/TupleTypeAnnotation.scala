package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.FlowKind
import typings.astDashTypes.genKindsMod.FlowTypeKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.FlowType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.FlowType[P]} */ trait TupleTypeAnnotation
  extends ASTNode
     with FlowKind
     with FlowTypeKind
     with NodeKind
     with PrintableKind {
  var `type`: typings.astDashTypes.astDashTypesStrings.TupleTypeAnnotation
  var types: js.Array[FlowTypeKind]
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TupleTypeAnnotation")
@js.native
object TupleTypeAnnotation extends TopLevel[Type[TupleTypeAnnotation]]

