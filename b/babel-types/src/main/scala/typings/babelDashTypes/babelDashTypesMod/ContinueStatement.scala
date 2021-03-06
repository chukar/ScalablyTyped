package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContinueStatement
  extends Node
     with CompletionStatement
     with Statement
     with Terminatorless {
  var label: Identifier
  @JSName("type")
  var type_ContinueStatement: typings.babelDashTypes.babelDashTypesStrings.ContinueStatement
}

object ContinueStatement {
  @scala.inline
  def apply(
    end: Double,
    label: Identifier,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.ContinueStatement,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): ContinueStatement = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinueStatement]
  }
}

@JSImport("babel-types", "continueStatement")
@js.native
object continueStatement extends js.Object {
  def apply(): ContinueStatement = js.native
  def apply(label: Identifier): ContinueStatement = js.native
}

