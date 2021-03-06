package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreApplicationsResponseMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreApplicationResponseMod._ApplicationResponse
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ApplicationsResponse extends js.Object {
  /**
    * List of applications returned in this page.
    */
  var Item: js.UndefOr[js.Array[_ApplicationResponse] | Iterable[_ApplicationResponse]] = js.undefined
  /**
    * The string that you use in a subsequent request to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object _ApplicationsResponse {
  @scala.inline
  def apply(
    Item: js.Array[_ApplicationResponse] | Iterable[_ApplicationResponse] = null,
    NextToken: String = null
  ): _ApplicationsResponse = {
    val __obj = js.Dynamic.literal()
    if (Item != null) __obj.updateDynamic("Item")(Item.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ApplicationsResponse]
  }
}

