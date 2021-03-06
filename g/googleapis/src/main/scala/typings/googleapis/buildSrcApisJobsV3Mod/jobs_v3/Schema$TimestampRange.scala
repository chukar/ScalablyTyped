package typings.googleapis.buildSrcApisJobsV3Mod.jobs_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message representing a period of time between two timestamps.
  */
@js.native
trait Schema$TimestampRange extends js.Object {
  /**
    * End of the period.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * Begin of the period.
    */
  var startTime: js.UndefOr[String] = js.native
}

object Schema$TimestampRange {
  @scala.inline
  def apply(endTime: String = null, startTime: String = null): Schema$TimestampRange = {
    val __obj = js.Dynamic.literal()
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TimestampRange]
  }
}

