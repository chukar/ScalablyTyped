package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariableDeclarator extends Node {
  var id: LVal
  var init: Expression
  @JSName("type")
  var type_VariableDeclarator: typings.babelDashTypes.babelDashTypesStrings.VariableDeclarator
}

object VariableDeclarator {
  @scala.inline
  def apply(
    end: Double,
    id: LVal,
    init: Expression,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.VariableDeclarator,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): VariableDeclarator = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableDeclarator]
  }
}

@JSImport("babel-types", "variableDeclarator")
@js.native
object variableDeclarator extends js.Object {
  def apply(): VariableDeclarator = js.native
  def apply(id: LVal): VariableDeclarator = js.native
  def apply(id: LVal, init: Expression): VariableDeclarator = js.native
}

