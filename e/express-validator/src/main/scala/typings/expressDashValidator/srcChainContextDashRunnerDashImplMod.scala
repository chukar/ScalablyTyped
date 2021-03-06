package typings.expressDashValidator

import typings.expressDashValidator.srcChainContextDashRunnerMod.ContextRunner
import typings.expressDashValidator.srcContextDashBuilderMod.ContextBuilder
import typings.expressDashValidator.srcSelectDashFieldsMod.SelectFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/chain/context-runner-impl", JSImport.Namespace)
@js.native
object srcChainContextDashRunnerDashImplMod extends js.Object {
  @js.native
  class ContextRunnerImpl protected () extends ContextRunner {
    def this(builder: ContextBuilder) = this()
    def this(builder: ContextBuilder, selectFields: SelectFields) = this()
    val builder: js.Any = js.native
    val selectFields: js.Any = js.native
  }
  
}

