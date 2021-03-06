package typings.aliDashApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("my.stopBluetoothDevicesDiscovery")
@js.native
object stopBluetoothDevicesDiscovery extends js.Object {
  /**
  	 * 停止搜寻附近的蓝牙外围设备。请在确保找到需要连接的设备后调用该方法停止搜索。
  	 */
  def apply(options: StopBluetoothDevicesDiscoveryOptions): Unit = js.native
}

