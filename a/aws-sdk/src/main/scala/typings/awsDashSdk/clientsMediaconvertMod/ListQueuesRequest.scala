package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListQueuesRequest extends js.Object {
  /**
    * Optional. When you request a list of queues, you can choose to list them alphabetically by NAME or chronologically by CREATION_DATE. If you don't specify, the service will list them by creation date.
    */
  var ListBy: js.UndefOr[QueueListBy] = js.native
  /**
    * Optional. Number of queues, up to twenty, that will be returned at one time.
    */
  var MaxResults: js.UndefOr[__integerMin1Max20] = js.native
  /**
    * Use this string, provided with the response to a previous request, to request the next batch of queues.
    */
  var NextToken: js.UndefOr[__string] = js.native
  /**
    * When you request lists of resources, you can optionally specify whether they are sorted in ASCENDING or DESCENDING order. Default varies by resource.
    */
  var Order: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.Order] = js.native
}

object ListQueuesRequest {
  @scala.inline
  def apply(
    ListBy: QueueListBy = null,
    MaxResults: Int | Double = null,
    NextToken: __string = null,
    Order: Order = null
  ): ListQueuesRequest = {
    val __obj = js.Dynamic.literal()
    if (ListBy != null) __obj.updateDynamic("ListBy")(ListBy.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Order != null) __obj.updateDynamic("Order")(Order.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListQueuesRequest]
  }
}

