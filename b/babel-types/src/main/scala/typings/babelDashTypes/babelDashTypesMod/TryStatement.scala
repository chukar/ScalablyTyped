package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TryStatement
  extends Node
     with Statement {
  var block: BlockStatement
  var finalizer: BlockStatement
  var handler: CatchClause
  @JSName("type")
  var type_TryStatement: typings.babelDashTypes.babelDashTypesStrings.TryStatement
}

object TryStatement {
  @scala.inline
  def apply(
    block: BlockStatement,
    end: Double,
    finalizer: BlockStatement,
    handler: CatchClause,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.TryStatement,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TryStatement = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], finalizer = finalizer.asInstanceOf[js.Any], handler = handler.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[TryStatement]
  }
}

@JSImport("babel-types", "tryStatement")
@js.native
object tryStatement extends js.Object {
  def apply(): TryStatement = js.native
  def apply(block: BlockStatement): TryStatement = js.native
  def apply(block: BlockStatement, handler: CatchClause): TryStatement = js.native
  def apply(block: BlockStatement, handler: CatchClause, finalizer: BlockStatement): TryStatement = js.native
}

