package typings.rxDashLite.rxDashLiteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Notifications
@JSImport("rx-lite", "Notification")
@js.native
class Notification[T] ()
  extends typings.rxDashLite.Rx.Notification[T]

/* static members */
@JSImport("rx-lite", "Notification")
@js.native
object Notification extends js.Object {
  def createOnCompleted[T](): typings.rxDashLite.Rx.Notification[T] = js.native
  def createOnError[T](exception: js.Any): typings.rxDashLite.Rx.Notification[T] = js.native
  def createOnNext[T](value: T): typings.rxDashLite.Rx.Notification[T] = js.native
}

