package typings.googleDashAdwordsDashScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Address extends js.Object {
  var address: AddressObject
  var bidModifier: Double
}

object Anon_Address {
  @scala.inline
  def apply(address: AddressObject, bidModifier: Double): Anon_Address = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], bidModifier = bidModifier.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Address]
  }
}

