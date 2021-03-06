package typings.astDashTypes.genNodesMod

import typings.astDashTypes.genKindsMod.DeclarationKind
import typings.astDashTypes.genKindsMod.ExpressionKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Declaration, 'type'> ]: ast-types.ast-types/gen/nodes.Declaration[P]} */ trait ExportDefaultDeclaration extends ASTNode {
  var declaration: DeclarationKind | ExpressionKind
  var `type`: typings.astDashTypes.astDashTypesStrings.ExportDefaultDeclaration
}

object ExportDefaultDeclaration {
  @scala.inline
  def apply(
    declaration: DeclarationKind | ExpressionKind,
    `type`: typings.astDashTypes.astDashTypesStrings.ExportDefaultDeclaration
  ): ExportDefaultDeclaration = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportDefaultDeclaration]
  }
}

