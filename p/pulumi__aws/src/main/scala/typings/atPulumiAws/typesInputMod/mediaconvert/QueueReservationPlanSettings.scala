package typings.atPulumiAws.typesInputMod.mediaconvert

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueReservationPlanSettings extends js.Object {
  /**
    * The length of the term of your reserved queue pricing plan commitment. Valid value is `ONE_YEAR`.
    */
  var commitment: Input[String] = js.native
  /**
    * Specifies whether the term of your reserved queue pricing plan. Valid values are `AUTO_RENEW` or `EXPIRE`.
    */
  var renewalType: Input[String] = js.native
  /**
    * Specifies the number of reserved transcode slots (RTS) for queue.
    */
  var reservedSlots: Input[Double] = js.native
}

object QueueReservationPlanSettings {
  @scala.inline
  def apply(commitment: Input[String], renewalType: Input[String], reservedSlots: Input[Double]): QueueReservationPlanSettings = {
    val __obj = js.Dynamic.literal(commitment = commitment.asInstanceOf[js.Any], renewalType = renewalType.asInstanceOf[js.Any], reservedSlots = reservedSlots.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[QueueReservationPlanSettings]
  }
}

