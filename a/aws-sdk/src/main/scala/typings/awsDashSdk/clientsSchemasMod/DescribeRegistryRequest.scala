package typings.awsDashSdk.clientsSchemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRegistryRequest extends js.Object {
  var RegistryName: __string = js.native
}

object DescribeRegistryRequest {
  @scala.inline
  def apply(RegistryName: __string): DescribeRegistryRequest = {
    val __obj = js.Dynamic.literal(RegistryName = RegistryName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeRegistryRequest]
  }
}

