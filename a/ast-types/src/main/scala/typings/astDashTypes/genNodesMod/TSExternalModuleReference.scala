package typings.astDashTypes.genNodesMod

import typings.astDashTypes.genKindsMod.StringLiteralKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Declaration, 'type'> ]: ast-types.ast-types/gen/nodes.Declaration[P]} */ trait TSExternalModuleReference extends ASTNode {
  var expression: StringLiteralKind
  var `type`: typings.astDashTypes.astDashTypesStrings.TSExternalModuleReference
}

object TSExternalModuleReference {
  @scala.inline
  def apply(
    expression: StringLiteralKind,
    `type`: typings.astDashTypes.astDashTypesStrings.TSExternalModuleReference
  ): TSExternalModuleReference = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSExternalModuleReference]
  }
}

