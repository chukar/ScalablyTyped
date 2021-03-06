package typings.awsDashSdk.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnableAlarmActionsInput extends js.Object {
  /**
    * The names of the alarms.
    */
  var AlarmNames: typings.awsDashSdk.clientsCloudwatchMod.AlarmNames = js.native
}

object EnableAlarmActionsInput {
  @scala.inline
  def apply(AlarmNames: AlarmNames): EnableAlarmActionsInput = {
    val __obj = js.Dynamic.literal(AlarmNames = AlarmNames.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EnableAlarmActionsInput]
  }
}

