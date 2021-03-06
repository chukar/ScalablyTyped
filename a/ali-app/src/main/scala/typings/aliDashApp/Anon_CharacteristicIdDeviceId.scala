package typings.aliDashApp

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CharacteristicIdDeviceId extends js.Object {
  /**
  			 * 蓝牙特征值的 uuid
  			 */
  var characteristicId: String
  /**
  			 * 蓝牙设备 id，参考 device 对象
  			 */
  var deviceId: String
  /**
  			 * 蓝牙特征值对应 service 的 uuid
  			 */
  var serviceId: String
  /**
  			 * 特征值最新的16进制值
  			 */
  var value: ArrayBuffer
}

object Anon_CharacteristicIdDeviceId {
  @scala.inline
  def apply(characteristicId: String, deviceId: String, serviceId: String, value: ArrayBuffer): Anon_CharacteristicIdDeviceId = {
    val __obj = js.Dynamic.literal(characteristicId = characteristicId.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CharacteristicIdDeviceId]
  }
}

