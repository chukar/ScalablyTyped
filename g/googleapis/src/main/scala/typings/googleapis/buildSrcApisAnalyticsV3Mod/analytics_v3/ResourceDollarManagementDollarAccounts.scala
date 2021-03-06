package typings.googleapis.buildSrcApisAnalyticsV3Mod.analytics_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Resource$Management$Accounts")
@js.native
class ResourceDollarManagementDollarAccounts protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * analytics.management.accounts.list
    * @desc Lists all accounts to which the user has access.
    * @alias analytics.management.accounts.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {integer=} params.max-results The maximum number of accounts to include in this response.
    * @param {integer=} params.start-index An index of the first account to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$Accounts] = js.native
  def list(callback: BodyResponseCallback[Schema$Accounts]): Unit = js.native
  def list(params: ParamsDollarResourceDollarManagementDollarAccountsDollarList): GaxiosPromise[Schema$Accounts] = js.native
  def list(
    params: ParamsDollarResourceDollarManagementDollarAccountsDollarList,
    callback: BodyResponseCallback[Schema$Accounts]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarManagementDollarAccountsDollarList,
    options: BodyResponseCallback[Schema$Accounts],
    callback: BodyResponseCallback[Schema$Accounts]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarManagementDollarAccountsDollarList, options: MethodOptions): GaxiosPromise[Schema$Accounts] = js.native
  def list(
    params: ParamsDollarResourceDollarManagementDollarAccountsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Accounts]
  ): Unit = js.native
}

