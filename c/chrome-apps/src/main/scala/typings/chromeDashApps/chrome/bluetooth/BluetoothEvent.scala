package typings.chromeDashApps.chrome.bluetooth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BluetoothEvent[T] extends js.Object {
  def addListener(callback: js.Function1[/* event */ T, Unit]): Unit
}

object BluetoothEvent {
  @scala.inline
  def apply[T](addListener: js.Function1[/* event */ T, Unit] => Unit): BluetoothEvent[T] = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1(addListener))
  
    __obj.asInstanceOf[BluetoothEvent[T]]
  }
}

