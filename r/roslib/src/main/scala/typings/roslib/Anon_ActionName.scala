package typings.roslib

import typings.roslib.roslibMod.Ros
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionName extends js.Object {
  var actionName: String
  var ros: Ros
  var serverName: String
  var timeout: Double
}

object Anon_ActionName {
  @scala.inline
  def apply(actionName: String, ros: Ros, serverName: String, timeout: Double): Anon_ActionName = {
    val __obj = js.Dynamic.literal(actionName = actionName.asInstanceOf[js.Any], ros = ros.asInstanceOf[js.Any], serverName = serverName.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ActionName]
  }
}

