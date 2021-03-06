package typings.chromeDashApps.chrome.bluetoothSocket

import typings.chromeDashApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.bluetoothSocket.close")
@js.native
object close extends js.Object {
  /**
    * Disconnects and destroys the socket.
    * Each socket created should be closed after use.
    * The socket id is no longer valid as soon at the
    * function is called. However, the socket is guaranteed
    * to be closed only when the callback is invoked.
    *
    * @param socketId The socket identifier.
    * @param callback Called when the `close` operation completes
    */
  def apply(socketId: integer, callback: js.Function0[Unit]): Unit = js.native
}

