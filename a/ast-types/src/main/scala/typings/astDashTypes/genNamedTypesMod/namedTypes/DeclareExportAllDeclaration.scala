package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.DeclarationKind
import typings.astDashTypes.genKindsMod.LiteralKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.genKindsMod.StatementKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Declaration[P]} */ trait DeclareExportAllDeclaration
  extends ASTNode
     with DeclarationKind
     with NodeKind
     with PrintableKind
     with StatementKind {
  var source: js.UndefOr[LiteralKind | Null] = js.undefined
  var `type`: typings.astDashTypes.astDashTypesStrings.DeclareExportAllDeclaration
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.DeclareExportAllDeclaration")
@js.native
object DeclareExportAllDeclaration extends TopLevel[Type[DeclareExportAllDeclaration]]

