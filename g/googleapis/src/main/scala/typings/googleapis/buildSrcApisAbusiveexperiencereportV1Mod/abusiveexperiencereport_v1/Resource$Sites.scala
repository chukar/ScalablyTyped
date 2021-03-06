package typings.googleapis.buildSrcApisAbusiveexperiencereportV1Mod.abusiveexperiencereport_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/abusiveexperiencereport/v1", "abusiveexperiencereport_v1.Resource$Sites")
@js.native
class Resource$Sites protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * abusiveexperiencereport.sites.get
    * @desc Gets a summary of the abusive experience rating of a site.
    * @alias abusiveexperiencereport.sites.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The required site name. This is the site property whose abusive experiences have been reviewed, and it must be URL-encoded. For example, sites/https%3A%2F%2Fwww.google.com. The server will return an error of BAD_REQUEST if this field is not filled in. Note that if the site property is not yet verified in Search Console, the reportUrl field returned by the API will lead to the verification page, prompting the user to go through that process before they can gain access to the Abusive Experience Report.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$SiteSummaryResponse] = js.native
  def get(callback: BodyResponseCallback[Schema$SiteSummaryResponse]): Unit = js.native
  def get(params: ParamsDollarResourceDollarSitesDollarGet): GaxiosPromise[Schema$SiteSummaryResponse] = js.native
  def get(
    params: ParamsDollarResourceDollarSitesDollarGet,
    callback: BodyResponseCallback[Schema$SiteSummaryResponse]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarSitesDollarGet,
    options: BodyResponseCallback[Schema$SiteSummaryResponse],
    callback: BodyResponseCallback[Schema$SiteSummaryResponse]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarSitesDollarGet, options: MethodOptions): GaxiosPromise[Schema$SiteSummaryResponse] = js.native
  def get(
    params: ParamsDollarResourceDollarSitesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SiteSummaryResponse]
  ): Unit = js.native
}

