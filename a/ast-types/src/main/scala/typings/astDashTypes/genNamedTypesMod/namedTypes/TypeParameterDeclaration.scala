package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.genKindsMod.TypeParameterKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait TypeParameterDeclaration
  extends ASTNode
     with NodeKind
     with PrintableKind {
  var params: js.Array[TypeParameterKind]
  var `type`: typings.astDashTypes.astDashTypesStrings.TypeParameterDeclaration
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TypeParameterDeclaration")
@js.native
object TypeParameterDeclaration extends TopLevel[Type[TypeParameterDeclaration]]

