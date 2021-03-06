package typings.gapiDotClientDotAdexchangebuyer2.gapi.client.adexchangebuyer2

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAdexchangebuyer2.Anon_AccesstokenAccountIdAltBearertokenCallbackFields
import typings.gapiDotClientDotAdexchangebuyer2.Anon_AccesstokenAccountIdAltBearertokenCallbackFieldsFilterSetIdKey
import typings.gapiDotClientDotAdexchangebuyer2.Anon_AccesstokenAccountIdAltBearertokenCallbackFieldsIsTransient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterSetsResource extends js.Object {
  var bidMetrics: BidMetricsResource
  var bidResponseErrors: BidResponseErrorsResource
  var bidResponsesWithoutBids: BidResponsesWithoutBidsResource
  var filteredBidRequests: FilteredBidRequestsResource
  var filteredBids: FilteredBidsResource
  var impressionMetrics: ImpressionMetricsResource
  var losingBids: LosingBidsResource
  var nonBillableWinningBids: NonBillableWinningBidsResource
  /** Creates the specified filter set for the account with the given account ID. */
  def create(request: Anon_AccesstokenAccountIdAltBearertokenCallbackFieldsIsTransient): Request[FilterSet]
  /**
    * Deletes the requested filter set from the account with the given account
    * ID.
    */
  def delete(request: Anon_AccesstokenAccountIdAltBearertokenCallbackFieldsFilterSetIdKey): Request[js.Object]
  /**
    * Retrieves the requested filter set for the account with the given account
    * ID.
    */
  def get(request: Anon_AccesstokenAccountIdAltBearertokenCallbackFieldsFilterSetIdKey): Request[FilterSet]
  /** Lists all filter sets for the account with the given account ID. */
  def list(request: Anon_AccesstokenAccountIdAltBearertokenCallbackFields): Request[ListFilterSetsResponse]
}

object FilterSetsResource {
  @scala.inline
  def apply(
    bidMetrics: BidMetricsResource,
    bidResponseErrors: BidResponseErrorsResource,
    bidResponsesWithoutBids: BidResponsesWithoutBidsResource,
    create: Anon_AccesstokenAccountIdAltBearertokenCallbackFieldsIsTransient => Request[FilterSet],
    delete: Anon_AccesstokenAccountIdAltBearertokenCallbackFieldsFilterSetIdKey => Request[js.Object],
    filteredBidRequests: FilteredBidRequestsResource,
    filteredBids: FilteredBidsResource,
    get: Anon_AccesstokenAccountIdAltBearertokenCallbackFieldsFilterSetIdKey => Request[FilterSet],
    impressionMetrics: ImpressionMetricsResource,
    list: Anon_AccesstokenAccountIdAltBearertokenCallbackFields => Request[ListFilterSetsResponse],
    losingBids: LosingBidsResource,
    nonBillableWinningBids: NonBillableWinningBidsResource
  ): FilterSetsResource = {
    val __obj = js.Dynamic.literal(bidMetrics = bidMetrics.asInstanceOf[js.Any], bidResponseErrors = bidResponseErrors.asInstanceOf[js.Any], bidResponsesWithoutBids = bidResponsesWithoutBids.asInstanceOf[js.Any], create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), filteredBidRequests = filteredBidRequests.asInstanceOf[js.Any], filteredBids = filteredBids.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), impressionMetrics = impressionMetrics.asInstanceOf[js.Any], list = js.Any.fromFunction1(list), losingBids = losingBids.asInstanceOf[js.Any], nonBillableWinningBids = nonBillableWinningBids.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FilterSetsResource]
  }
}

