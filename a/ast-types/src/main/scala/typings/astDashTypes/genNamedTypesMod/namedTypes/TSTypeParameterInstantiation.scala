package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.genKindsMod.TSTypeKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait TSTypeParameterInstantiation
  extends ASTNode
     with NodeKind
     with PrintableKind {
  var params: js.Array[TSTypeKind]
  var `type`: typings.astDashTypes.astDashTypesStrings.TSTypeParameterInstantiation
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TSTypeParameterInstantiation")
@js.native
object TSTypeParameterInstantiation extends TopLevel[Type[TSTypeParameterInstantiation]]

