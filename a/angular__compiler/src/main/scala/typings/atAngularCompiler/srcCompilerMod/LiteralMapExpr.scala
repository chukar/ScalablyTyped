package typings.atAngularCompiler.srcCompilerMod

import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.LiteralMapEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "LiteralMapExpr")
@js.native
class LiteralMapExpr protected ()
  extends typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.LiteralMapExpr {
  def this(entries: js.Array[LiteralMapEntry]) = this()
  def this(
    entries: js.Array[LiteralMapEntry],
    `type`: typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.MapType
  ) = this()
  def this(
    entries: js.Array[LiteralMapEntry],
    `type`: Null,
    sourceSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
  ) = this()
  def this(
    entries: js.Array[LiteralMapEntry],
    `type`: typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.MapType,
    sourceSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
  ) = this()
}

