package typings.googleapis.buildSrcApisComputeBetaMod.compute_beta

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/compute/beta", "compute_beta.Resource$Sslpolicies")
@js.native
class Resource$Sslpolicies protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * compute.sslPolicies.delete
    * @desc Deletes the specified SSL policy. The SSL policy resource can be
    * deleted only if it is not in use by any TargetHttpsProxy or
    * TargetSslProxy resources.
    * @alias compute.sslPolicies.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.sslPolicy Name of the SSL policy to delete. The name must be 1-63 characters long, and comply with RFC1035.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Operation] = js.native
  def delete(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarSslpoliciesDollarDelete): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarSslpoliciesDollarDelete,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarSslpoliciesDollarDelete,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarSslpoliciesDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarSslpoliciesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.sslPolicies.get
    * @desc Lists all of the ordered rules present in a single specified
    * policy.
    * @alias compute.sslPolicies.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.sslPolicy Name of the SSL policy to update. The name must be 1-63 characters long, and comply with RFC1035.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$SslPolicy] = js.native
  def get(callback: BodyResponseCallback[Schema$SslPolicy]): Unit = js.native
  def get(params: ParamsDollarResourceDollarSslpoliciesDollarGet): GaxiosPromise[Schema$SslPolicy] = js.native
  def get(
    params: ParamsDollarResourceDollarSslpoliciesDollarGet,
    callback: BodyResponseCallback[Schema$SslPolicy]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarSslpoliciesDollarGet,
    options: BodyResponseCallback[Schema$SslPolicy],
    callback: BodyResponseCallback[Schema$SslPolicy]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarSslpoliciesDollarGet, options: MethodOptions): GaxiosPromise[Schema$SslPolicy] = js.native
  def get(
    params: ParamsDollarResourceDollarSslpoliciesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SslPolicy]
  ): Unit = js.native
  /**
    * compute.sslPolicies.insert
    * @desc Returns the specified SSL policy resource. Gets a list of available
    * SSL policies by making a list() request.
    * @alias compute.sslPolicies.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().SslPolicy} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Operation] = js.native
  def insert(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarSslpoliciesDollarInsert): GaxiosPromise[Schema$Operation] = js.native
  def insert(
    params: ParamsDollarResourceDollarSslpoliciesDollarInsert,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarSslpoliciesDollarInsert,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarSslpoliciesDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def insert(
    params: ParamsDollarResourceDollarSslpoliciesDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.sslPolicies.list
    * @desc Lists all the SSL policies that have been configured for the
    * specified project.
    * @alias compute.sslPolicies.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter A filter expression that filters resources listed in the response. The expression must specify the field name, a comparison operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The comparison operator must be either =, !=, >, or <.  For example, if you are filtering Compute Engine instances, you can exclude instances named example-instance by specifying name != example-instance.  You can also filter nested fields. For example, you could specify scheduling.automaticRestart = false to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels.  To filter on multiple expressions, provide each separate expression within parentheses. For example, (scheduling.automaticRestart = true) (cpuPlatform = "Intel Skylake"). By default, each expression is an AND expression. However, you can include AND and OR expressions explicitly. For example, (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel Broadwell") AND (scheduling.automaticRestart = true).
    * @param {integer=} params.maxResults The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, Compute Engine returns a nextPageToken that can be used to get the next page of results in subsequent list requests. Acceptable values are 0 to 500, inclusive. (Default: 500)
    * @param {string=} params.orderBy Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name.  You can also sort results in descending order based on the creation timestamp using orderBy="creationTimestamp desc". This sorts results based on the creationTimestamp field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first.  Currently, only sorting by name or creationTimestamp desc is supported.
    * @param {string=} params.pageToken Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results.
    * @param {string} params.project Project ID for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$SslPoliciesList] = js.native
  def list(callback: BodyResponseCallback[Schema$SslPoliciesList]): Unit = js.native
  def list(params: ParamsDollarResourceDollarSslpoliciesDollarList): GaxiosPromise[Schema$SslPoliciesList] = js.native
  def list(
    params: ParamsDollarResourceDollarSslpoliciesDollarList,
    callback: BodyResponseCallback[Schema$SslPoliciesList]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarSslpoliciesDollarList,
    options: BodyResponseCallback[Schema$SslPoliciesList],
    callback: BodyResponseCallback[Schema$SslPoliciesList]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarSslpoliciesDollarList, options: MethodOptions): GaxiosPromise[Schema$SslPoliciesList] = js.native
  def list(
    params: ParamsDollarResourceDollarSslpoliciesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SslPoliciesList]
  ): Unit = js.native
  /**
    * compute.sslPolicies.listAvailableFeatures
    * @desc Lists all features that can be specified in the SSL policy when
    * using custom profile.
    * @alias compute.sslPolicies.listAvailableFeatures
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter A filter expression that filters resources listed in the response. The expression must specify the field name, a comparison operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The comparison operator must be either =, !=, >, or <.  For example, if you are filtering Compute Engine instances, you can exclude instances named example-instance by specifying name != example-instance.  You can also filter nested fields. For example, you could specify scheduling.automaticRestart = false to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels.  To filter on multiple expressions, provide each separate expression within parentheses. For example, (scheduling.automaticRestart = true) (cpuPlatform = "Intel Skylake"). By default, each expression is an AND expression. However, you can include AND and OR expressions explicitly. For example, (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel Broadwell") AND (scheduling.automaticRestart = true).
    * @param {integer=} params.maxResults The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, Compute Engine returns a nextPageToken that can be used to get the next page of results in subsequent list requests. Acceptable values are 0 to 500, inclusive. (Default: 500)
    * @param {string=} params.orderBy Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name.  You can also sort results in descending order based on the creation timestamp using orderBy="creationTimestamp desc". This sorts results based on the creationTimestamp field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first.  Currently, only sorting by name or creationTimestamp desc is supported.
    * @param {string=} params.pageToken Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results.
    * @param {string} params.project Project ID for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def listAvailableFeatures(): GaxiosPromise[Schema$SslPoliciesListAvailableFeaturesResponse] = js.native
  def listAvailableFeatures(callback: BodyResponseCallback[Schema$SslPoliciesListAvailableFeaturesResponse]): Unit = js.native
  def listAvailableFeatures(params: ParamsDollarResourceDollarSslpoliciesDollarListavailablefeatures): GaxiosPromise[Schema$SslPoliciesListAvailableFeaturesResponse] = js.native
  def listAvailableFeatures(
    params: ParamsDollarResourceDollarSslpoliciesDollarListavailablefeatures,
    callback: BodyResponseCallback[Schema$SslPoliciesListAvailableFeaturesResponse]
  ): Unit = js.native
  def listAvailableFeatures(
    params: ParamsDollarResourceDollarSslpoliciesDollarListavailablefeatures,
    options: BodyResponseCallback[Schema$SslPoliciesListAvailableFeaturesResponse],
    callback: BodyResponseCallback[Schema$SslPoliciesListAvailableFeaturesResponse]
  ): Unit = js.native
  def listAvailableFeatures(params: ParamsDollarResourceDollarSslpoliciesDollarListavailablefeatures, options: MethodOptions): GaxiosPromise[Schema$SslPoliciesListAvailableFeaturesResponse] = js.native
  def listAvailableFeatures(
    params: ParamsDollarResourceDollarSslpoliciesDollarListavailablefeatures,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SslPoliciesListAvailableFeaturesResponse]
  ): Unit = js.native
  /**
    * compute.sslPolicies.patch
    * @desc Patches the specified SSL policy with the data included in the
    * request.
    * @alias compute.sslPolicies.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.sslPolicy Name of the SSL policy to update. The name must be 1-63 characters long, and comply with RFC1035.
    * @param {().SslPolicy} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Operation] = js.native
  def patch(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarSslpoliciesDollarPatch): GaxiosPromise[Schema$Operation] = js.native
  def patch(
    params: ParamsDollarResourceDollarSslpoliciesDollarPatch,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarSslpoliciesDollarPatch,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarSslpoliciesDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def patch(
    params: ParamsDollarResourceDollarSslpoliciesDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.sslPolicies.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource.
    * @alias compute.sslPolicies.testIamPermissions
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.resource_ Name or id of the resource for this request.
    * @param {().TestPermissionsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def testIamPermissions(): GaxiosPromise[Schema$TestPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[Schema$TestPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: ParamsDollarResourceDollarSslpoliciesDollarTestiampermissions): GaxiosPromise[Schema$TestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarSslpoliciesDollarTestiampermissions,
    callback: BodyResponseCallback[Schema$TestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarSslpoliciesDollarTestiampermissions,
    options: BodyResponseCallback[Schema$TestPermissionsResponse],
    callback: BodyResponseCallback[Schema$TestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsDollarResourceDollarSslpoliciesDollarTestiampermissions, options: MethodOptions): GaxiosPromise[Schema$TestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarSslpoliciesDollarTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TestPermissionsResponse]
  ): Unit = js.native
}

