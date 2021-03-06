package typings.atPulumiAws.typesOutputMod.route53

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecordWeightedRoutingPolicy extends js.Object {
  /**
    * A numeric value indicating the relative weight of the record. See http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-policy.html#routing-policy-weighted.
    */
  var weight: Double = js.native
}

object RecordWeightedRoutingPolicy {
  @scala.inline
  def apply(weight: Double): RecordWeightedRoutingPolicy = {
    val __obj = js.Dynamic.literal(weight = weight.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RecordWeightedRoutingPolicy]
  }
}

