package typings.azure

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ALERT extends js.Object {
  var ALERT: String
  var CRITICAL: String
  var DEBUG: String
  var EMERGENCY: String
  var ERROR: String
  var INFO: String
  var NOTICE: String
  var WARNING: String
}

object Anon_ALERT {
  @scala.inline
  def apply(
    ALERT: String,
    CRITICAL: String,
    DEBUG: String,
    EMERGENCY: String,
    ERROR: String,
    INFO: String,
    NOTICE: String,
    WARNING: String
  ): Anon_ALERT = {
    val __obj = js.Dynamic.literal(ALERT = ALERT.asInstanceOf[js.Any], CRITICAL = CRITICAL.asInstanceOf[js.Any], DEBUG = DEBUG.asInstanceOf[js.Any], EMERGENCY = EMERGENCY.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], INFO = INFO.asInstanceOf[js.Any], NOTICE = NOTICE.asInstanceOf[js.Any], WARNING = WARNING.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ALERT]
  }
}

