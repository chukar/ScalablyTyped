package typings.weixinDashApp

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CharacteristicId extends js.Object {
  /**
  					 * 蓝牙设备特征值的 uuid
  					 */
  var characteristicId: String
  /**
  					 * 蓝牙设备特征值对应服务的 uuid
  					 */
  var serviceId: String
  /**
  					 * 蓝牙设备特征值对应的二进制值
  					 */
  var value: ArrayBuffer
}

object Anon_CharacteristicId {
  @scala.inline
  def apply(characteristicId: String, serviceId: String, value: ArrayBuffer): Anon_CharacteristicId = {
    val __obj = js.Dynamic.literal(characteristicId = characteristicId.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CharacteristicId]
  }
}

