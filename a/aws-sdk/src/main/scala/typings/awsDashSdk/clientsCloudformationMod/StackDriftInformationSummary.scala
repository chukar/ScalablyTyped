package typings.awsDashSdk.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackDriftInformationSummary extends js.Object {
  /**
    * Most recent time when a drift detection operation was initiated on the stack, or any of its individual resources that support drift detection.
    */
  var LastCheckTimestamp: js.UndefOr[Timestamp] = js.native
  /**
    * Status of the stack's actual configuration compared to its expected template configuration.     DRIFTED: The stack differs from its expected template configuration. A stack is considered to have drifted if one or more of its resources have drifted.    NOT_CHECKED: AWS CloudFormation has not checked if the stack differs from its expected template configuration.    IN_SYNC: The stack's actual configuration matches its expected template configuration.    UNKNOWN: This value is reserved for future use.  
    */
  var StackDriftStatus: typings.awsDashSdk.clientsCloudformationMod.StackDriftStatus = js.native
}

object StackDriftInformationSummary {
  @scala.inline
  def apply(StackDriftStatus: StackDriftStatus, LastCheckTimestamp: Timestamp = null): StackDriftInformationSummary = {
    val __obj = js.Dynamic.literal(StackDriftStatus = StackDriftStatus.asInstanceOf[js.Any])
    if (LastCheckTimestamp != null) __obj.updateDynamic("LastCheckTimestamp")(LastCheckTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackDriftInformationSummary]
  }
}

