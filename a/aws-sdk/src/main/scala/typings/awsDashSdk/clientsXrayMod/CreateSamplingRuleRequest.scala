package typings.awsDashSdk.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSamplingRuleRequest extends js.Object {
  /**
    * The rule definition.
    */
  var SamplingRule: typings.awsDashSdk.clientsXrayMod.SamplingRule = js.native
}

object CreateSamplingRuleRequest {
  @scala.inline
  def apply(SamplingRule: SamplingRule): CreateSamplingRuleRequest = {
    val __obj = js.Dynamic.literal(SamplingRule = SamplingRule.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateSamplingRuleRequest]
  }
}

