package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariableDeclarator
  extends BaseNode
     with _Node {
  var definite: Boolean | Null
  var id: LVal
  var init: Expression | Null
  @JSName("type")
  var type_VariableDeclarator: typings.atBabelTypes.atBabelTypesStrings.VariableDeclarator
}

object VariableDeclarator {
  @scala.inline
  def apply(
    id: LVal,
    `type`: typings.atBabelTypes.atBabelTypesStrings.VariableDeclarator,
    definite: js.UndefOr[Boolean] = js.undefined,
    end: Int | Double = null,
    init: Expression = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): VariableDeclarator = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(definite)) __obj.updateDynamic("definite")(definite.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(init.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableDeclarator]
  }
}

@JSImport("@babel/types", "variableDeclarator")
@js.native
object variableDeclarator extends js.Object {
  def apply(id: LVal): VariableDeclarator = js.native
  def apply(id: LVal, init: Null, definite: Boolean): VariableDeclarator = js.native
  def apply(id: LVal, init: Expression): VariableDeclarator = js.native
  def apply(id: LVal, init: Expression, definite: Boolean): VariableDeclarator = js.native
}

