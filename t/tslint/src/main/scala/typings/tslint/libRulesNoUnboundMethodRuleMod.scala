package typings.tslint

import typings.tslint.libLanguageRuleRuleMod.IRuleMetadata
import typings.tslint.libLanguageRuleTypedRuleMod.TypedRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/noUnboundMethodRule", JSImport.Namespace)
@js.native
object libRulesNoUnboundMethodRuleMod extends js.Object {
  @js.native
  class Rule () extends TypedRule
  
  /* static members */
  @js.native
  object Rule extends js.Object {
    var FAILURE_STRING: String = js.native
    var metadata: IRuleMetadata = js.native
  }
  
}

