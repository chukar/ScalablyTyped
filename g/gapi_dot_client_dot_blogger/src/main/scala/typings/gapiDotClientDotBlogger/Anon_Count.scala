package typings.gapiDotClientDotBlogger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Count extends js.Object {
  /** Count of page views for the given time range */
  var count: js.UndefOr[String] = js.undefined
  /** Time range the given count applies to */
  var timeRange: js.UndefOr[String] = js.undefined
}

object Anon_Count {
  @scala.inline
  def apply(count: String = null, timeRange: String = null): Anon_Count = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (timeRange != null) __obj.updateDynamic("timeRange")(timeRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Count]
  }
}

