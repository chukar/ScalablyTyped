package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllQueued extends js.Object {
  var all: Double
  var queued: Double
  var running: Double
}

object Anon_AllQueued {
  @scala.inline
  def apply(all: Double, queued: Double, running: Double): Anon_AllQueued = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], queued = queued.asInstanceOf[js.Any], running = running.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AllQueued]
  }
}

