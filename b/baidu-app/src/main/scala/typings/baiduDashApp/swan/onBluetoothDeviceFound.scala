package typings.baiduDashApp.swan

import typings.baiduDashApp.Anon_Devices
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("swan.onBluetoothDeviceFound")
@js.native
object onBluetoothDeviceFound extends js.Object {
  /**
  	 * 监听寻找到新设备的事件
  	 * @version 1.1.0
  	 */
  def apply(callback: js.Function1[/* res */ Anon_Devices, Unit]): Unit = js.native
}

