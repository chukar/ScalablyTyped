package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.DeclarationKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.genKindsMod.StatementKind
import typings.astDashTypes.genKindsMod.TypeAliasKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.TypeAlias, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.TypeAlias[P]} */ trait DeclareTypeAlias
  extends ASTNode
     with DeclarationKind
     with NodeKind
     with PrintableKind
     with StatementKind
     with TypeAliasKind {
  var `type`: typings.astDashTypes.astDashTypesStrings.DeclareTypeAlias
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.DeclareTypeAlias")
@js.native
object DeclareTypeAlias extends TopLevel[Type[DeclareTypeAlias]]

