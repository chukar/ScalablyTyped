package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InterpreterDirective
  extends BaseNode
     with _Node {
  @JSName("type")
  var type_InterpreterDirective: typings.atBabelTypes.atBabelTypesStrings.InterpreterDirective
  var value: String
}

object InterpreterDirective {
  @scala.inline
  def apply(
    `type`: typings.atBabelTypes.atBabelTypesStrings.InterpreterDirective,
    value: String,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): InterpreterDirective = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterpreterDirective]
  }
}

@JSImport("@babel/types", "interpreterDirective")
@js.native
object interpreterDirective extends js.Object {
  def apply(value: String): InterpreterDirective = js.native
}

