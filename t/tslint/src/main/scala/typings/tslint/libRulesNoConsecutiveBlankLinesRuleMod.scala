package typings.tslint

import typings.tslint.libLanguageRuleRuleMod.IRuleMetadata
import typings.tslint.tslintMod.Rules.AbstractRule
import typings.typescript.typescriptMod.SourceFile
import typings.typescript.typescriptMod.TextRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/noConsecutiveBlankLinesRule", JSImport.Namespace)
@js.native
object libRulesNoConsecutiveBlankLinesRuleMod extends js.Object {
  @js.native
  class Rule () extends AbstractRule
  
  def getTemplateRanges(sourceFile: SourceFile): js.Array[TextRange] = js.native
  /* static members */
  @js.native
  object Rule extends js.Object {
    var DEFAULT_ALLOWED_BLANKS: Double = js.native
    var metadata: IRuleMetadata = js.native
    def FAILURE_STRING_FACTORY(allowed: Double): String = js.native
  }
  
}

