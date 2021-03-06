package typings.googleapis.buildSrcApisCloudresourcemanagerV1Mod.cloudresourcemanager_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudresourcemanager/v1", "cloudresourcemanager_v1.Resource$Liens")
@js.native
class Resource$Liens protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * cloudresourcemanager.liens.create
    * @desc Create a Lien which applies to the resource denoted by the `parent`
    * field.  Callers of this method will require permission on the `parent`
    * resource. For example, applying to `projects/1234` requires permission
    * `resourcemanager.projects.updateLiens`.  NOTE: Some resources may limit
    * the number of Liens which may be applied.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Cloud Resource Manager API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/cloudresourcemanager
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var cloudResourceManager = google.cloudresourcemanager('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   cloudResourceManager.liens.create(request, function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias cloudresourcemanager.liens.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().Lien} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Lien] = js.native
  def create(callback: BodyResponseCallback[Schema$Lien]): Unit = js.native
  def create(params: ParamsDollarResourceDollarLiensDollarCreate): GaxiosPromise[Schema$Lien] = js.native
  def create(params: ParamsDollarResourceDollarLiensDollarCreate, callback: BodyResponseCallback[Schema$Lien]): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarLiensDollarCreate,
    options: BodyResponseCallback[Schema$Lien],
    callback: BodyResponseCallback[Schema$Lien]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarLiensDollarCreate, options: MethodOptions): GaxiosPromise[Schema$Lien] = js.native
  def create(
    params: ParamsDollarResourceDollarLiensDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Lien]
  ): Unit = js.native
  /**
    * cloudresourcemanager.liens.delete
    * @desc Delete a Lien by `name`.  Callers of this method will require
    * permission on the `parent` resource. For example, a Lien with a `parent`
    * of `projects/1234` requires permission
    * `resourcemanager.projects.updateLiens`.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Cloud Resource Manager API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/cloudresourcemanager
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var cloudResourceManager = google.cloudresourcemanager('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // The name/identifier of the Lien to delete.
    *     name: 'liens/my-lien',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   cloudResourceManager.liens.delete(request, function(err) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias cloudresourcemanager.liens.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name/identifier of the Lien to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarLiensDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(params: ParamsDollarResourceDollarLiensDollarDelete, callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarLiensDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarLiensDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarLiensDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * cloudresourcemanager.liens.get
    * @desc Retrieve a Lien by `name`.  Callers of this method will require
    * permission on the `parent` resource. For example, a Lien with a `parent`
    * of `projects/1234` requires permission requires permission
    * `resourcemanager.projects.get` or `resourcemanager.projects.updateLiens`.
    * @alias cloudresourcemanager.liens.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name/identifier of the Lien.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Lien] = js.native
  def get(callback: BodyResponseCallback[Schema$Lien]): Unit = js.native
  def get(params: ParamsDollarResourceDollarLiensDollarGet): GaxiosPromise[Schema$Lien] = js.native
  def get(params: ParamsDollarResourceDollarLiensDollarGet, callback: BodyResponseCallback[Schema$Lien]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarLiensDollarGet,
    options: BodyResponseCallback[Schema$Lien],
    callback: BodyResponseCallback[Schema$Lien]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarLiensDollarGet, options: MethodOptions): GaxiosPromise[Schema$Lien] = js.native
  def get(
    params: ParamsDollarResourceDollarLiensDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Lien]
  ): Unit = js.native
  /**
    * cloudresourcemanager.liens.list
    * @desc List all Liens applied to the `parent` resource.  Callers of this
    * method will require permission on the `parent` resource. For example, a
    * Lien with a `parent` of `projects/1234` requires permission
    * `resourcemanager.projects.get`.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Cloud Resource Manager API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/cloudresourcemanager
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var cloudResourceManager = google.cloudresourcemanager('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     auth: authClient,
    *   };
    *
    *   var handlePage = function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     var liensPage = response['liens'];
    *     if (!liensPage) {
    *       return;
    *     }
    *     for (var i = 0; i < liensPage.length; i++) {
    *       // TODO: Change code below to process each resource in `liensPage`:
    *       console.log(JSON.stringify(liensPage[i], null, 2));
    *     }
    *
    *     if (response.nextPageToken) {
    *       request.pageToken = response.nextPageToken;
    *       cloudResourceManager.liens.list(request, handlePage);
    *     }
    *   };
    *
    *   cloudResourceManager.liens.list(request, handlePage);
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias cloudresourcemanager.liens.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize The maximum number of items to return. This is a suggestion for the server.
    * @param {string=} params.pageToken The `next_page_token` value returned from a previous List request, if any.
    * @param {string=} params.parent The name of the resource to list all attached Liens. For example, `projects/1234`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListLiensResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListLiensResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarLiensDollarList): GaxiosPromise[Schema$ListLiensResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarLiensDollarList,
    callback: BodyResponseCallback[Schema$ListLiensResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarLiensDollarList,
    options: BodyResponseCallback[Schema$ListLiensResponse],
    callback: BodyResponseCallback[Schema$ListLiensResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarLiensDollarList, options: MethodOptions): GaxiosPromise[Schema$ListLiensResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarLiensDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListLiensResponse]
  ): Unit = js.native
}

