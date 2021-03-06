package typings.expressDashValidator

import typings.expressDashValidator.srcChainValidatorsMod.Validators
import typings.expressDashValidator.srcContextDashBuilderMod.ContextBuilder
import typings.expressDashValidator.srcOptionsMod.MinMaxOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/chain/validators-impl", JSImport.Namespace)
@js.native
object srcChainValidatorsDashImplMod extends js.Object {
  @js.native
  class ValidatorsImpl[Chain] protected () extends Validators[Chain] {
    def this(builder: ContextBuilder, chain: Chain) = this()
    var addItem: js.Any = js.native
    var addStandardValidation: js.Any = js.native
    val builder: js.Any = js.native
    val chain: js.Any = js.native
    var lastValidator: js.Any = js.native
    var negateNext: js.Any = js.native
    def isByteLength(options: MinMaxOptions): Chain = js.native
  }
  
}

