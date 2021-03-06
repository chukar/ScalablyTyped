package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait TryStatement
  extends Statement
     with BaseNode {
  var block: BlockStatement
  var finalizer: BlockStatement | Null
  var handler: CatchClause | Null
  @JSName("type")
  var type_TryStatement: typings.atBabelTypes.atBabelTypesStrings.TryStatement
}

object TryStatement {
  @scala.inline
  def apply(
    block: BlockStatement,
    `type`: typings.atBabelTypes.atBabelTypesStrings.TryStatement,
    end: Int | Double = null,
    finalizer: BlockStatement = null,
    handler: CatchClause = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): TryStatement = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (finalizer != null) __obj.updateDynamic("finalizer")(finalizer.asInstanceOf[js.Any])
    if (handler != null) __obj.updateDynamic("handler")(handler.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[TryStatement]
  }
}

@JSImport("@babel/types", "tryStatement")
@js.native
object tryStatement extends js.Object {
  def apply(block: BlockStatement): TryStatement = js.native
  def apply(block: BlockStatement, handler: Null, finalizer: BlockStatement): TryStatement = js.native
  def apply(block: BlockStatement, handler: CatchClause): TryStatement = js.native
  def apply(block: BlockStatement, handler: CatchClause, finalizer: BlockStatement): TryStatement = js.native
}

