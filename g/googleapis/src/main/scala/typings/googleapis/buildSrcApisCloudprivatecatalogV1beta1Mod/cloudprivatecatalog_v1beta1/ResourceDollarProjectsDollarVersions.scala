package typings.googleapis.buildSrcApisCloudprivatecatalogV1beta1Mod.cloudprivatecatalog_v1beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudprivatecatalog/v1beta1", "cloudprivatecatalog_v1beta1.Resource$Projects$Versions")
@js.native
class ResourceDollarProjectsDollarVersions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * cloudprivatecatalog.projects.versions.search
    * @desc Search Version resources that consumers have access to, within the
    * scope of the consumer cloud resource hierarchy context.
    * @alias cloudprivatecatalog.projects.versions.search
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize The maximum number of entries that are requested.
    * @param {string=} params.pageToken A pagination token returned from a previous call to SearchVersions that indicates where this listing should continue from. This field is optional.
    * @param {string=} params.query The query to filter the versions. Required.  The supported queries are: * List versions under a product: `parent=catalogs/{catalog_id}/products/{product_id}` * Get a version by name: `name=catalogs/{catalog_id}/products/{product_id}/versions/{version_id}`
    * @param {string} params.resource_ Required. The name of the resource context. See SearchCatalogsRequest.resource for details.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def search(): GaxiosPromise[Schema$GoogleCloudPrivatecatalogV1beta1SearchVersionsResponse] = js.native
  def search(callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogV1beta1SearchVersionsResponse]): Unit = js.native
  def search(params: ParamsDollarResourceDollarProjectsDollarVersionsDollarSearch): GaxiosPromise[Schema$GoogleCloudPrivatecatalogV1beta1SearchVersionsResponse] = js.native
  def search(
    params: ParamsDollarResourceDollarProjectsDollarVersionsDollarSearch,
    callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogV1beta1SearchVersionsResponse]
  ): Unit = js.native
  def search(
    params: ParamsDollarResourceDollarProjectsDollarVersionsDollarSearch,
    options: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogV1beta1SearchVersionsResponse],
    callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogV1beta1SearchVersionsResponse]
  ): Unit = js.native
  def search(params: ParamsDollarResourceDollarProjectsDollarVersionsDollarSearch, options: MethodOptions): GaxiosPromise[Schema$GoogleCloudPrivatecatalogV1beta1SearchVersionsResponse] = js.native
  def search(
    params: ParamsDollarResourceDollarProjectsDollarVersionsDollarSearch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogV1beta1SearchVersionsResponse]
  ): Unit = js.native
}

