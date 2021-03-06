package typings.atAngularCompiler.srcCompilerMod

import typings.atAngularCompiler.Anon_Key
import typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.LiteralMapKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "LiteralMap")
@js.native
class LiteralMap protected ()
  extends typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.LiteralMap {
  def this(
    span: typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.ParseSpan,
    keys: js.Array[LiteralMapKey],
    values: js.Array[_]
  ) = this()
}

@JSImport("@angular/compiler/src/compiler", "literalMap")
@js.native
object literalMap extends js.Object {
  def apply(values: js.Array[Anon_Key]): typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.LiteralMapExpr = js.native
  def apply(
    values: js.Array[Anon_Key],
    `type`: typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.MapType
  ): typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.LiteralMapExpr = js.native
}

