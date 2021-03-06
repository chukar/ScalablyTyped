package typings.awsDashSdk.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDomainsRequest extends js.Object {
  /**
    * The names of the domains you want to include in the response.
    */
  var DomainNames: js.UndefOr[DomainNameList] = js.native
}

object DescribeDomainsRequest {
  @scala.inline
  def apply(DomainNames: DomainNameList = null): DescribeDomainsRequest = {
    val __obj = js.Dynamic.literal()
    if (DomainNames != null) __obj.updateDynamic("DomainNames")(DomainNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDomainsRequest]
  }
}

