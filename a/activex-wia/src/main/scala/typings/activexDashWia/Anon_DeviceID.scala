package typings.activexDashWia

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeviceID extends js.Object {
  val DeviceID: String
  val EventID: String
  val ItemID: String
}

object Anon_DeviceID {
  @scala.inline
  def apply(DeviceID: String, EventID: String, ItemID: String): Anon_DeviceID = {
    val __obj = js.Dynamic.literal(DeviceID = DeviceID.asInstanceOf[js.Any], EventID = EventID.asInstanceOf[js.Any], ItemID = ItemID.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DeviceID]
  }
}

