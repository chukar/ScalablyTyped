package typings.reactDashDnd.libInterfacesMonitorsMod

import typings.dndDashCore.libInterfacesMod.Unsubscribe
import typings.reactDashDnd.Anon_HandlerIdsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonitorEventEmitter extends js.Object {
  def subscribeToStateChange(fn: js.Function0[Unit]): Unsubscribe = js.native
  def subscribeToStateChange(fn: js.Function0[Unit], options: Anon_HandlerIdsArray): Unsubscribe = js.native
}

