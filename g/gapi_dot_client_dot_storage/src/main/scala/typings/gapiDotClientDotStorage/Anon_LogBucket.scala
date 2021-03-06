package typings.gapiDotClientDotStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LogBucket extends js.Object {
  /** The destination bucket where the current bucket's logs should be placed. */
  var logBucket: js.UndefOr[String] = js.undefined
  /** A prefix for log object names. */
  var logObjectPrefix: js.UndefOr[String] = js.undefined
}

object Anon_LogBucket {
  @scala.inline
  def apply(logBucket: String = null, logObjectPrefix: String = null): Anon_LogBucket = {
    val __obj = js.Dynamic.literal()
    if (logBucket != null) __obj.updateDynamic("logBucket")(logBucket.asInstanceOf[js.Any])
    if (logObjectPrefix != null) __obj.updateDynamic("logObjectPrefix")(logObjectPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_LogBucket]
  }
}

