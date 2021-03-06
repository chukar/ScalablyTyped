package typings.tslint

import typings.tslint.libLanguageRuleRuleMod.IRuleMetadata
import typings.tslint.tslintMod.Rules.AbstractRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/importSpacingRule", JSImport.Namespace)
@js.native
object libRulesImportSpacingRuleMod extends js.Object {
  @js.native
  class Rule () extends AbstractRule
  
  /* static members */
  @js.native
  object Rule extends js.Object {
    var ADD_SPACE_AFTER_FROM: String = js.native
    var ADD_SPACE_AFTER_IMPORT: String = js.native
    var ADD_SPACE_AFTER_STAR: String = js.native
    var ADD_SPACE_BEFORE_FROM: String = js.native
    var NO_LINE_BREAKS: String = js.native
    var TOO_MANY_SPACES_AFTER_FROM: String = js.native
    var TOO_MANY_SPACES_AFTER_IMPORT: String = js.native
    var TOO_MANY_SPACES_AFTER_STAR: String = js.native
    var TOO_MANY_SPACES_BEFORE_FROM: String = js.native
    var metadata: IRuleMetadata = js.native
  }
  
}

