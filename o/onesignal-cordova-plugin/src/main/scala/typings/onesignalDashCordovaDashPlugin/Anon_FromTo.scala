package typings.onesignalDashCordovaDashPlugin

import typings.onesignalDashCordovaDashPlugin.OneSignalCordovaPlugin.OSPermissionState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FromTo extends js.Object {
  var from: OSPermissionState
  var to: OSPermissionState
}

object Anon_FromTo {
  @scala.inline
  def apply(from: OSPermissionState, to: OSPermissionState): Anon_FromTo = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_FromTo]
  }
}

