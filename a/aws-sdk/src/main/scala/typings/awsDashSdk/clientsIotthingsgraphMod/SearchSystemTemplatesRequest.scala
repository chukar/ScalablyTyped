package typings.awsDashSdk.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchSystemTemplatesRequest extends js.Object {
  /**
    * An array of filters that limit the result set. The only valid filter is FLOW_TEMPLATE_ID.
    */
  var filters: js.UndefOr[SystemTemplateFilters] = js.native
  /**
    * The maximum number of results to return in the response.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * The string that specifies the next page of results. Use this when you're paginating results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object SearchSystemTemplatesRequest {
  @scala.inline
  def apply(
    filters: SystemTemplateFilters = null,
    maxResults: Int | Double = null,
    nextToken: NextToken = null
  ): SearchSystemTemplatesRequest = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchSystemTemplatesRequest]
  }
}

