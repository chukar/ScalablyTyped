package typings.atAngularCompiler.publicUnderscoreApiMod

import typings.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileDirectiveSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "DirectiveAst")
@js.native
class DirectiveAst protected ()
  extends typings.atAngularCompiler.srcCompilerMod.DirectiveAst {
  def this(
    directive: CompileDirectiveSummary,
    inputs: js.Array[
        typings.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.BoundDirectivePropertyAst
      ],
    hostProperties: js.Array[
        typings.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.BoundElementPropertyAst
      ],
    hostEvents: js.Array[
        typings.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.BoundEventAst
      ],
    contentQueryStartId: Double,
    sourceSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
  ) = this()
}

