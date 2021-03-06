package typings.astDashTypes.genNodesMod

import typings.astDashTypes.genKindsMod.IdentifierKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Specifier, 'type'> ]: ast-types.ast-types/gen/nodes.Specifier[P]} */ trait ExportDefaultSpecifier extends ASTNode {
  var exported: IdentifierKind
  var `type`: typings.astDashTypes.astDashTypesStrings.ExportDefaultSpecifier
}

object ExportDefaultSpecifier {
  @scala.inline
  def apply(exported: IdentifierKind, `type`: typings.astDashTypes.astDashTypesStrings.ExportDefaultSpecifier): ExportDefaultSpecifier = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportDefaultSpecifier]
  }
}

