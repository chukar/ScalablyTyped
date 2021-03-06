package typings.astDashTypes.genNodesMod

import typings.astDashTypes.genKindsMod.ExpressionKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Expression, 'type'> ]: ast-types.ast-types/gen/nodes.Expression[P]} */ trait YieldExpression extends ASTNode {
  var argument: ExpressionKind | Null
  var delegate: Boolean
  var `type`: typings.astDashTypes.astDashTypesStrings.YieldExpression
}

object YieldExpression {
  @scala.inline
  def apply(
    delegate: Boolean,
    `type`: typings.astDashTypes.astDashTypesStrings.YieldExpression,
    argument: ExpressionKind = null
  ): YieldExpression = {
    val __obj = js.Dynamic.literal(delegate = delegate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (argument != null) __obj.updateDynamic("argument")(argument.asInstanceOf[js.Any])
    __obj.asInstanceOf[YieldExpression]
  }
}

