package typings.weixinDashApp

import typings.weixinDashApp.wx.BluetoothDevice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Devices extends js.Object {
  var devices: js.Array[BluetoothDevice]
}

object Anon_Devices {
  @scala.inline
  def apply(devices: js.Array[BluetoothDevice]): Anon_Devices = {
    val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Devices]
  }
}

