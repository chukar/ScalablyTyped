package typings.googleapis.buildSrcApisStoragetransferV1Mod.storagetransfer_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Transfers can be scheduled to recur or to run just once.
  */
@js.native
trait Schema$Schedule extends js.Object {
  /**
    * The last day the recurring transfer will be run. If `scheduleEndDate` is
    * the same as `scheduleStartDate`, the transfer will be executed only once.
    */
  var scheduleEndDate: js.UndefOr[Schema$Date] = js.native
  /**
    * The first day the recurring transfer is scheduled to run. If
    * `scheduleStartDate` is in the past, the transfer will run for the first
    * time on the following day. Required.
    */
  var scheduleStartDate: js.UndefOr[Schema$Date] = js.native
  /**
    * The time in UTC at which the transfer will be scheduled to start in a
    * day. Transfers may start later than this time. If not specified,
    * recurring and one-time transfers that are scheduled to run today will run
    * immediately; recurring transfers that are scheduled to run on a future
    * date will start at approximately midnight UTC on that date. Note that
    * when configuring a transfer with the Cloud Platform Console, the
    * transfer&#39;s start time in a day is specified in your local timezone.
    */
  var startTimeOfDay: js.UndefOr[Schema$TimeOfDay] = js.native
}

object Schema$Schedule {
  @scala.inline
  def apply(
    scheduleEndDate: Schema$Date = null,
    scheduleStartDate: Schema$Date = null,
    startTimeOfDay: Schema$TimeOfDay = null
  ): Schema$Schedule = {
    val __obj = js.Dynamic.literal()
    if (scheduleEndDate != null) __obj.updateDynamic("scheduleEndDate")(scheduleEndDate.asInstanceOf[js.Any])
    if (scheduleStartDate != null) __obj.updateDynamic("scheduleStartDate")(scheduleStartDate.asInstanceOf[js.Any])
    if (startTimeOfDay != null) __obj.updateDynamic("startTimeOfDay")(startTimeOfDay.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Schedule]
  }
}

