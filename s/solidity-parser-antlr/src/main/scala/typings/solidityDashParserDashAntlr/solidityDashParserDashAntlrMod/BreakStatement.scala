package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreakStatement
  extends BaseASTNode
     with ASTNode
     with Statement {
  @JSName("type")
  var type_BreakStatement: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.BreakStatement
}

object BreakStatement {
  @scala.inline
  def apply(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.BreakStatement,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): BreakStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreakStatement]
  }
}

