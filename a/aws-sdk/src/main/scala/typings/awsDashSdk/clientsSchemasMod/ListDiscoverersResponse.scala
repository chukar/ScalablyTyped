package typings.awsDashSdk.clientsSchemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDiscoverersResponse extends js.Object {
  /**
    * An array of DiscovererSummary information.
    */
  var Discoverers: js.UndefOr[__listOfDiscovererSummary] = js.native
  /**
    * The token that specifies the next page of results to return. To request the first page, leave NextToken empty. The token will expire in 24 hours, and cannot be shared with other accounts.
    */
  var NextToken: js.UndefOr[__string] = js.native
}

object ListDiscoverersResponse {
  @scala.inline
  def apply(Discoverers: __listOfDiscovererSummary = null, NextToken: __string = null): ListDiscoverersResponse = {
    val __obj = js.Dynamic.literal()
    if (Discoverers != null) __obj.updateDynamic("Discoverers")(Discoverers.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDiscoverersResponse]
  }
}

