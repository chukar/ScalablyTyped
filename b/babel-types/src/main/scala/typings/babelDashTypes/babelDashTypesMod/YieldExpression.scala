package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YieldExpression
  extends Node
     with Expression
     with Terminatorless {
  var argument: Expression
  var delegate: Boolean
  @JSName("type")
  var type_YieldExpression: typings.babelDashTypes.babelDashTypesStrings.YieldExpression
}

object YieldExpression {
  @scala.inline
  def apply(
    argument: Expression,
    delegate: Boolean,
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.YieldExpression,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): YieldExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], delegate = delegate.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[YieldExpression]
  }
}

@JSImport("babel-types", "yieldExpression")
@js.native
object yieldExpression extends js.Object {
  def apply(): YieldExpression = js.native
  def apply(argument: Expression): YieldExpression = js.native
  def apply(argument: Expression, delegate: Boolean): YieldExpression = js.native
}

