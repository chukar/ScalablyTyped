package typings.awsDashSdk.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDomainsResponse extends js.Object {
  var DomainStatusList: typings.awsDashSdk.clientsCloudsearchMod.DomainStatusList = js.native
}

object DescribeDomainsResponse {
  @scala.inline
  def apply(DomainStatusList: DomainStatusList): DescribeDomainsResponse = {
    val __obj = js.Dynamic.literal(DomainStatusList = DomainStatusList.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeDomainsResponse]
  }
}

