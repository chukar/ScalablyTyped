package typings.astDashTypes.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.FlowType, 'type'> ]: ast-types.ast-types/gen/nodes.FlowType[P]} */ trait StringTypeAnnotation extends ASTNode {
  var `type`: typings.astDashTypes.astDashTypesStrings.StringTypeAnnotation
}

object StringTypeAnnotation {
  @scala.inline
  def apply(`type`: typings.astDashTypes.astDashTypesStrings.StringTypeAnnotation): StringTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringTypeAnnotation]
  }
}

