package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/adexchangebuyer2/v2beta1", "adexchangebuyer2_v2beta1.Resource$Bidders$Accounts$Filtersets$Impressionmetrics")
@js.native
class ResourceDollarBiddersDollarAccountsDollarFiltersetsDollarImpressionmetrics protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * adexchangebuyer2.bidders.accounts.filterSets.impressionMetrics.list
    * @desc Lists all metrics that are measured in terms of number of
    * impressions.
    * @alias
    * adexchangebuyer2.bidders.accounts.filterSets.impressionMetrics.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.filterSetName Name of the filter set that should be applied to the requested metrics. For example:  - For a bidder-level filter set for bidder 123:   `bidders/123/filterSets/abc`  - For an account-level filter set for the buyer account representing bidder   123: `bidders/123/accounts/123/filterSets/abc`  - For an account-level filter set for the child seat buyer account 456   whose bidder is 123: `bidders/123/accounts/456/filterSets/abc`
    * @param {integer=} params.pageSize Requested page size. The server may return fewer results than requested. If unspecified, the server will pick an appropriate default.
    * @param {string=} params.pageToken A token identifying a page of results the server should return. Typically, this is the value of ListImpressionMetricsResponse.nextPageToken returned from the previous call to the impressionMetrics.list method.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListImpressionMetricsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListImpressionMetricsResponse]): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarBiddersDollarAccountsDollarFiltersetsDollarImpressionmetricsDollarList
  ): GaxiosPromise[Schema$ListImpressionMetricsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarBiddersDollarAccountsDollarFiltersetsDollarImpressionmetricsDollarList,
    callback: BodyResponseCallback[Schema$ListImpressionMetricsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarBiddersDollarAccountsDollarFiltersetsDollarImpressionmetricsDollarList,
    options: BodyResponseCallback[Schema$ListImpressionMetricsResponse],
    callback: BodyResponseCallback[Schema$ListImpressionMetricsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarBiddersDollarAccountsDollarFiltersetsDollarImpressionmetricsDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListImpressionMetricsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarBiddersDollarAccountsDollarFiltersetsDollarImpressionmetricsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListImpressionMetricsResponse]
  ): Unit = js.native
}

