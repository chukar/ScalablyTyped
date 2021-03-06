package typings.atAngularCompiler.publicUnderscoreApiMod

import typings.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.QueryMatch
import typings.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.TemplateAst
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "EmbeddedTemplateAst")
@js.native
class EmbeddedTemplateAst protected ()
  extends typings.atAngularCompiler.srcCompilerMod.EmbeddedTemplateAst {
  def this(
    attrs: js.Array[
        typings.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.AttrAst
      ],
    outputs: js.Array[
        typings.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.BoundEventAst
      ],
    references: js.Array[
        typings.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.ReferenceAst
      ],
    variables: js.Array[
        typings.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.VariableAst
      ],
    directives: js.Array[
        typings.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.DirectiveAst
      ],
    providers: js.Array[
        typings.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.ProviderAst
      ],
    hasViewContainer: Boolean,
    queryMatches: js.Array[QueryMatch],
    children: js.Array[TemplateAst],
    ngContentIndex: Double,
    sourceSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
  ) = this()
}

