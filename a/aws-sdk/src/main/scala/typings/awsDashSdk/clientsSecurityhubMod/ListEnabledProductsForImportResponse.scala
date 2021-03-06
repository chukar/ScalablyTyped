package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEnabledProductsForImportResponse extends js.Object {
  /**
    * The token that is required for pagination.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSecurityhubMod.NextToken] = js.native
  /**
    * A list of ARNs for the resources that represent your subscriptions to products. 
    */
  var ProductSubscriptions: js.UndefOr[ProductSubscriptionArnList] = js.native
}

object ListEnabledProductsForImportResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, ProductSubscriptions: ProductSubscriptionArnList = null): ListEnabledProductsForImportResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ProductSubscriptions != null) __obj.updateDynamic("ProductSubscriptions")(ProductSubscriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEnabledProductsForImportResponse]
  }
}

