package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifierDefinition
  extends BaseASTNode
     with ASTNode {
  var name: String
  @JSName("type")
  var type_ModifierDefinition: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.ModifierDefinition
}

object ModifierDefinition {
  @scala.inline
  def apply(
    name: String,
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.ModifierDefinition,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ModifierDefinition = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifierDefinition]
  }
}

