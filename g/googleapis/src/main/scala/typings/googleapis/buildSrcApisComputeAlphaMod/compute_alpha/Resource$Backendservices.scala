package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/compute/alpha", "compute_alpha.Resource$Backendservices")
@js.native
class Resource$Backendservices protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * compute.backendServices.addSignedUrlKey
    * @desc Adds a key for validating requests with signed URLs for this
    * backend service.
    * @alias compute.backendServices.addSignedUrlKey
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.backendService Name of the BackendService resource to which the Signed URL Key should be added. The name should conform to RFC1035.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().SignedUrlKey} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def addSignedUrlKey(): GaxiosPromise[Schema$Operation] = js.native
  def addSignedUrlKey(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def addSignedUrlKey(params: ParamsDollarResourceDollarBackendservicesDollarAddsignedurlkey): GaxiosPromise[Schema$Operation] = js.native
  def addSignedUrlKey(
    params: ParamsDollarResourceDollarBackendservicesDollarAddsignedurlkey,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def addSignedUrlKey(
    params: ParamsDollarResourceDollarBackendservicesDollarAddsignedurlkey,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def addSignedUrlKey(params: ParamsDollarResourceDollarBackendservicesDollarAddsignedurlkey, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def addSignedUrlKey(
    params: ParamsDollarResourceDollarBackendservicesDollarAddsignedurlkey,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.backendServices.aggregatedList
    * @desc Retrieves the list of all BackendService resources, regional and
    * global, available to the specified project.
    * @alias compute.backendServices.aggregatedList
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter A filter expression that filters resources listed in the response. The expression must specify the field name, a comparison operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The comparison operator must be either =, !=, >, or <.  For example, if you are filtering Compute Engine instances, you can exclude instances named example-instance by specifying name != example-instance.  You can also filter nested fields. For example, you could specify scheduling.automaticRestart = false to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels.  To filter on multiple expressions, provide each separate expression within parentheses. For example, (scheduling.automaticRestart = true) (cpuPlatform = "Intel Skylake"). By default, each expression is an AND expression. However, you can include AND and OR expressions explicitly. For example, (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel Broadwell") AND (scheduling.automaticRestart = true).
    * @param {integer=} params.maxResults The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, Compute Engine returns a nextPageToken that can be used to get the next page of results in subsequent list requests. Acceptable values are 0 to 500, inclusive. (Default: 500)
    * @param {string=} params.orderBy Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name.  You can also sort results in descending order based on the creation timestamp using orderBy="creationTimestamp desc". This sorts results based on the creationTimestamp field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first.  Currently, only sorting by name or creationTimestamp desc is supported.
    * @param {string=} params.pageToken Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results.
    * @param {string} params.project Name of the project scoping this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def aggregatedList(): GaxiosPromise[Schema$BackendServiceAggregatedList] = js.native
  def aggregatedList(callback: BodyResponseCallback[Schema$BackendServiceAggregatedList]): Unit = js.native
  def aggregatedList(params: ParamsDollarResourceDollarBackendservicesDollarAggregatedlist): GaxiosPromise[Schema$BackendServiceAggregatedList] = js.native
  def aggregatedList(
    params: ParamsDollarResourceDollarBackendservicesDollarAggregatedlist,
    callback: BodyResponseCallback[Schema$BackendServiceAggregatedList]
  ): Unit = js.native
  def aggregatedList(
    params: ParamsDollarResourceDollarBackendservicesDollarAggregatedlist,
    options: BodyResponseCallback[Schema$BackendServiceAggregatedList],
    callback: BodyResponseCallback[Schema$BackendServiceAggregatedList]
  ): Unit = js.native
  def aggregatedList(params: ParamsDollarResourceDollarBackendservicesDollarAggregatedlist, options: MethodOptions): GaxiosPromise[Schema$BackendServiceAggregatedList] = js.native
  def aggregatedList(
    params: ParamsDollarResourceDollarBackendservicesDollarAggregatedlist,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$BackendServiceAggregatedList]
  ): Unit = js.native
  /**
    * compute.backendServices.delete
    * @desc Deletes the specified BackendService resource.
    * @alias compute.backendServices.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.backendService Name of the BackendService resource to delete.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Operation] = js.native
  def delete(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarBackendservicesDollarDelete): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarBackendservicesDollarDelete,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarBackendservicesDollarDelete,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarBackendservicesDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarBackendservicesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.backendServices.deleteSignedUrlKey
    * @desc Deletes a key for validating requests with signed URLs for this
    * backend service.
    * @alias compute.backendServices.deleteSignedUrlKey
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.backendService Name of the BackendService resource to which the Signed URL Key should be added. The name should conform to RFC1035.
    * @param {string} params.keyName The name of the Signed URL Key to delete.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def deleteSignedUrlKey(): GaxiosPromise[Schema$Operation] = js.native
  def deleteSignedUrlKey(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def deleteSignedUrlKey(params: ParamsDollarResourceDollarBackendservicesDollarDeletesignedurlkey): GaxiosPromise[Schema$Operation] = js.native
  def deleteSignedUrlKey(
    params: ParamsDollarResourceDollarBackendservicesDollarDeletesignedurlkey,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def deleteSignedUrlKey(
    params: ParamsDollarResourceDollarBackendservicesDollarDeletesignedurlkey,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def deleteSignedUrlKey(params: ParamsDollarResourceDollarBackendservicesDollarDeletesignedurlkey, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def deleteSignedUrlKey(
    params: ParamsDollarResourceDollarBackendservicesDollarDeletesignedurlkey,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.backendServices.get
    * @desc Returns the specified BackendService resource. Gets a list of
    * available backend services.
    * @alias compute.backendServices.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.backendService Name of the BackendService resource to return.
    * @param {string} params.project Project ID for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$BackendService] = js.native
  def get(callback: BodyResponseCallback[Schema$BackendService]): Unit = js.native
  def get(params: ParamsDollarResourceDollarBackendservicesDollarGet): GaxiosPromise[Schema$BackendService] = js.native
  def get(
    params: ParamsDollarResourceDollarBackendservicesDollarGet,
    callback: BodyResponseCallback[Schema$BackendService]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarBackendservicesDollarGet,
    options: BodyResponseCallback[Schema$BackendService],
    callback: BodyResponseCallback[Schema$BackendService]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarBackendservicesDollarGet, options: MethodOptions): GaxiosPromise[Schema$BackendService] = js.native
  def get(
    params: ParamsDollarResourceDollarBackendservicesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$BackendService]
  ): Unit = js.native
  /**
    * compute.backendServices.getHealth
    * @desc Gets the most recent health check results for this BackendService.
    * @alias compute.backendServices.getHealth
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.backendService Name of the BackendService resource to which the queried instance belongs.
    * @param {string} params.project
    * @param {().ResourceGroupReference} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getHealth(): GaxiosPromise[Schema$BackendServiceGroupHealth] = js.native
  def getHealth(callback: BodyResponseCallback[Schema$BackendServiceGroupHealth]): Unit = js.native
  def getHealth(params: ParamsDollarResourceDollarBackendservicesDollarGethealth): GaxiosPromise[Schema$BackendServiceGroupHealth] = js.native
  def getHealth(
    params: ParamsDollarResourceDollarBackendservicesDollarGethealth,
    callback: BodyResponseCallback[Schema$BackendServiceGroupHealth]
  ): Unit = js.native
  def getHealth(
    params: ParamsDollarResourceDollarBackendservicesDollarGethealth,
    options: BodyResponseCallback[Schema$BackendServiceGroupHealth],
    callback: BodyResponseCallback[Schema$BackendServiceGroupHealth]
  ): Unit = js.native
  def getHealth(params: ParamsDollarResourceDollarBackendservicesDollarGethealth, options: MethodOptions): GaxiosPromise[Schema$BackendServiceGroupHealth] = js.native
  def getHealth(
    params: ParamsDollarResourceDollarBackendservicesDollarGethealth,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$BackendServiceGroupHealth]
  ): Unit = js.native
  /**
    * compute.backendServices.insert
    * @desc Creates a BackendService resource in the specified project using
    * the data included in the request. There are several restrictions and
    * guidelines to keep in mind when creating a backend service. Read
    * Restrictions and Guidelines for more information.
    * @alias compute.backendServices.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().BackendService} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Operation] = js.native
  def insert(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarBackendservicesDollarInsert): GaxiosPromise[Schema$Operation] = js.native
  def insert(
    params: ParamsDollarResourceDollarBackendservicesDollarInsert,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarBackendservicesDollarInsert,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarBackendservicesDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def insert(
    params: ParamsDollarResourceDollarBackendservicesDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.backendServices.list
    * @desc Retrieves the list of BackendService resources available to the
    * specified project.
    * @alias compute.backendServices.list
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
  def list(): GaxiosPromise[Schema$BackendServiceList] = js.native
  def list(callback: BodyResponseCallback[Schema$BackendServiceList]): Unit = js.native
  def list(params: ParamsDollarResourceDollarBackendservicesDollarList): GaxiosPromise[Schema$BackendServiceList] = js.native
  def list(
    params: ParamsDollarResourceDollarBackendservicesDollarList,
    callback: BodyResponseCallback[Schema$BackendServiceList]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarBackendservicesDollarList,
    options: BodyResponseCallback[Schema$BackendServiceList],
    callback: BodyResponseCallback[Schema$BackendServiceList]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarBackendservicesDollarList, options: MethodOptions): GaxiosPromise[Schema$BackendServiceList] = js.native
  def list(
    params: ParamsDollarResourceDollarBackendservicesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$BackendServiceList]
  ): Unit = js.native
  /**
    * compute.backendServices.patch
    * @desc Patches the specified BackendService resource with the data
    * included in the request. There are several restrictions and guidelines to
    * keep in mind when updating a backend service. Read  Restrictions and
    * Guidelines for more information. This method supports PATCH semantics and
    * uses the JSON merge patch format and processing rules.
    * @alias compute.backendServices.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.backendService Name of the BackendService resource to patch.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().BackendService} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Operation] = js.native
  def patch(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarBackendservicesDollarPatch): GaxiosPromise[Schema$Operation] = js.native
  def patch(
    params: ParamsDollarResourceDollarBackendservicesDollarPatch,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarBackendservicesDollarPatch,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarBackendservicesDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def patch(
    params: ParamsDollarResourceDollarBackendservicesDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.backendServices.setSecurityPolicy
    * @desc Sets the security policy for the specified backend service.
    * @alias compute.backendServices.setSecurityPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.backendService Name of the BackendService resource to which the security policy should be set. The name should conform to RFC1035.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().SecurityPolicyReference} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setSecurityPolicy(): GaxiosPromise[Schema$Operation] = js.native
  def setSecurityPolicy(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def setSecurityPolicy(params: ParamsDollarResourceDollarBackendservicesDollarSetsecuritypolicy): GaxiosPromise[Schema$Operation] = js.native
  def setSecurityPolicy(
    params: ParamsDollarResourceDollarBackendservicesDollarSetsecuritypolicy,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setSecurityPolicy(
    params: ParamsDollarResourceDollarBackendservicesDollarSetsecuritypolicy,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setSecurityPolicy(params: ParamsDollarResourceDollarBackendservicesDollarSetsecuritypolicy, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def setSecurityPolicy(
    params: ParamsDollarResourceDollarBackendservicesDollarSetsecuritypolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.backendServices.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource.
    * @alias compute.backendServices.testIamPermissions
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
  def testIamPermissions(params: ParamsDollarResourceDollarBackendservicesDollarTestiampermissions): GaxiosPromise[Schema$TestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarBackendservicesDollarTestiampermissions,
    callback: BodyResponseCallback[Schema$TestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarBackendservicesDollarTestiampermissions,
    options: BodyResponseCallback[Schema$TestPermissionsResponse],
    callback: BodyResponseCallback[Schema$TestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsDollarResourceDollarBackendservicesDollarTestiampermissions, options: MethodOptions): GaxiosPromise[Schema$TestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarBackendservicesDollarTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TestPermissionsResponse]
  ): Unit = js.native
  /**
    * compute.backendServices.update
    * @desc Updates the specified BackendService resource with the data
    * included in the request. There are several restrictions and guidelines to
    * keep in mind when updating a backend service. Read  Restrictions and
    * Guidelines for more information.
    * @alias compute.backendServices.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.backendService Name of the BackendService resource to update.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().BackendService} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Operation] = js.native
  def update(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def update(params: ParamsDollarResourceDollarBackendservicesDollarUpdate): GaxiosPromise[Schema$Operation] = js.native
  def update(
    params: ParamsDollarResourceDollarBackendservicesDollarUpdate,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarBackendservicesDollarUpdate,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarBackendservicesDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def update(
    params: ParamsDollarResourceDollarBackendservicesDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
}

