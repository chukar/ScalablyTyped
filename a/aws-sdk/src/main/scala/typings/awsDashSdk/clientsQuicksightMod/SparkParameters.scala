package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SparkParameters extends js.Object {
  /**
    * Host.
    */
  var Host: typings.awsDashSdk.clientsQuicksightMod.Host = js.native
  /**
    * Port.
    */
  var Port: typings.awsDashSdk.clientsQuicksightMod.Port = js.native
}

object SparkParameters {
  @scala.inline
  def apply(Host: Host, Port: Port): SparkParameters = {
    val __obj = js.Dynamic.literal(Host = Host.asInstanceOf[js.Any], Port = Port.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SparkParameters]
  }
}

