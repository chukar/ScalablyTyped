package typings.googleapis.buildSrcApisBigqueryV2Mod.bigquery_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/bigquery/v2", "bigquery_v2.Resource$Tables")
@js.native
class Resource$Tables protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * bigquery.tables.delete
    * @desc Deletes the table specified by tableId from the dataset. If the
    * table contains data, all the data will be deleted.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the BigQuery API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/bigquery
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
    * const {google} = require('googleapis');
    * var bigquery = google.bigquery('v2');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID of the table to delete
    *     projectId: 'my-project-id',  // TODO: Update placeholder value.
    *
    *     // Dataset ID of the table to delete
    *     datasetId: 'my-dataset-id',  // TODO: Update placeholder value.
    *
    *     // Table ID of the table to delete
    *     tableId: 'my-table-id',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   bigquery.tables.delete(request, function(err) {
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
    * @alias bigquery.tables.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.datasetId Dataset ID of the table to delete
    * @param {string} params.projectId Project ID of the table to delete
    * @param {string} params.tableId Table ID of the table to delete
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarTablesDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsDollarResourceDollarTablesDollarDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarTablesDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarTablesDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarTablesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * bigquery.tables.get
    * @desc Gets the specified table resource by table ID. This method does not
    * return the data in the table, it only returns the table resource, which
    * describes the structure of this table.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the BigQuery API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/bigquery
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
    * const {google} = require('googleapis');
    * var bigquery = google.bigquery('v2');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID of the requested table
    *     projectId: 'my-project-id',  // TODO: Update placeholder value.
    *
    *     // Dataset ID of the requested table
    *     datasetId: 'my-dataset-id',  // TODO: Update placeholder value.
    *
    *     // Table ID of the requested table
    *     tableId: 'my-table-id',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   bigquery.tables.get(request, function(err, response) {
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
    * @alias bigquery.tables.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.datasetId Dataset ID of the requested table
    * @param {string} params.projectId Project ID of the requested table
    * @param {string=} params.selectedFields List of fields to return (comma-separated). If unspecified, all fields are returned
    * @param {string} params.tableId Table ID of the requested table
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Table] = js.native
  def get(callback: BodyResponseCallback[Schema$Table]): Unit = js.native
  def get(params: ParamsDollarResourceDollarTablesDollarGet): GaxiosPromise[Schema$Table] = js.native
  def get(params: ParamsDollarResourceDollarTablesDollarGet, callback: BodyResponseCallback[Schema$Table]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarTablesDollarGet,
    options: BodyResponseCallback[Schema$Table],
    callback: BodyResponseCallback[Schema$Table]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarTablesDollarGet, options: MethodOptions): GaxiosPromise[Schema$Table] = js.native
  def get(
    params: ParamsDollarResourceDollarTablesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Table]
  ): Unit = js.native
  /**
    * bigquery.tables.insert
    * @desc Creates a new, empty table in the dataset.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the BigQuery API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/bigquery
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
    * const {google} = require('googleapis');
    * var bigquery = google.bigquery('v2');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID of the new table
    *     projectId: 'my-project-id',  // TODO: Update placeholder value.
    *
    *     // Dataset ID of the new table
    *     datasetId: 'my-dataset-id',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   bigquery.tables.insert(request, function(err, response) {
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
    * @alias bigquery.tables.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.datasetId Dataset ID of the new table
    * @param {string} params.projectId Project ID of the new table
    * @param {().Table} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Table] = js.native
  def insert(callback: BodyResponseCallback[Schema$Table]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarTablesDollarInsert): GaxiosPromise[Schema$Table] = js.native
  def insert(params: ParamsDollarResourceDollarTablesDollarInsert, callback: BodyResponseCallback[Schema$Table]): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarTablesDollarInsert,
    options: BodyResponseCallback[Schema$Table],
    callback: BodyResponseCallback[Schema$Table]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarTablesDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Table] = js.native
  def insert(
    params: ParamsDollarResourceDollarTablesDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Table]
  ): Unit = js.native
  /**
    * bigquery.tables.list
    * @desc Lists all tables in the specified dataset. Requires the READER
    * dataset role.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the BigQuery API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/bigquery
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
    * const {google} = require('googleapis');
    * var bigquery = google.bigquery('v2');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID of the tables to list
    *     projectId: 'my-project-id',  // TODO: Update placeholder value.
    *
    *     // Dataset ID of the tables to list
    *     datasetId: 'my-dataset-id',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   var handlePage = function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     var tablesPage = response['tables'];
    *     if (!tablesPage) {
    *       return;
    *     }
    *     for (var i = 0; i < tablesPage.length; i++) {
    *       // TODO: Change code below to process each resource in
    * `tablesPage`: console.log(JSON.stringify(tablesPage[i], null, 2));
    *     }
    *
    *     if (response.nextPageToken) {
    *       request.pageToken = response.nextPageToken;
    *       bigquery.tables.list(request, handlePage);
    *     }
    *   };
    *
    *   bigquery.tables.list(request, handlePage);
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
    * @alias bigquery.tables.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.datasetId Dataset ID of the tables to list
    * @param {integer=} params.maxResults Maximum number of results to return
    * @param {string=} params.pageToken Page token, returned by a previous call, to request the next page of results
    * @param {string} params.projectId Project ID of the tables to list
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$TableList] = js.native
  def list(callback: BodyResponseCallback[Schema$TableList]): Unit = js.native
  def list(params: ParamsDollarResourceDollarTablesDollarList): GaxiosPromise[Schema$TableList] = js.native
  def list(
    params: ParamsDollarResourceDollarTablesDollarList,
    callback: BodyResponseCallback[Schema$TableList]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarTablesDollarList,
    options: BodyResponseCallback[Schema$TableList],
    callback: BodyResponseCallback[Schema$TableList]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarTablesDollarList, options: MethodOptions): GaxiosPromise[Schema$TableList] = js.native
  def list(
    params: ParamsDollarResourceDollarTablesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TableList]
  ): Unit = js.native
  /**
    * bigquery.tables.patch
    * @desc Updates information in an existing table. The update method
    * replaces the entire table resource, whereas the patch method only
    * replaces fields that are provided in the submitted table resource. This
    * method supports patch semantics.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the BigQuery API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/bigquery
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
    * const {google} = require('googleapis');
    * var bigquery = google.bigquery('v2');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID of the table to update
    *     projectId: 'my-project-id',  // TODO: Update placeholder value.
    *
    *     // Dataset ID of the table to update
    *     datasetId: 'my-dataset-id',  // TODO: Update placeholder value.
    *
    *     // Table ID of the table to update
    *     tableId: 'my-table-id',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body. Only these
    * properties
    *       // will be changed.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   bigquery.tables.patch(request, function(err, response) {
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
    * @alias bigquery.tables.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.datasetId Dataset ID of the table to update
    * @param {string} params.projectId Project ID of the table to update
    * @param {string} params.tableId Table ID of the table to update
    * @param {().Table} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Table] = js.native
  def patch(callback: BodyResponseCallback[Schema$Table]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarTablesDollarPatch): GaxiosPromise[Schema$Table] = js.native
  def patch(params: ParamsDollarResourceDollarTablesDollarPatch, callback: BodyResponseCallback[Schema$Table]): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarTablesDollarPatch,
    options: BodyResponseCallback[Schema$Table],
    callback: BodyResponseCallback[Schema$Table]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarTablesDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Table] = js.native
  def patch(
    params: ParamsDollarResourceDollarTablesDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Table]
  ): Unit = js.native
  /**
    * bigquery.tables.update
    * @desc Updates information in an existing table. The update method
    * replaces the entire table resource, whereas the patch method only
    * replaces fields that are provided in the submitted table resource.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the BigQuery API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/bigquery
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
    * const {google} = require('googleapis');
    * var bigquery = google.bigquery('v2');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID of the table to update
    *     projectId: 'my-project-id',  // TODO: Update placeholder value.
    *
    *     // Dataset ID of the table to update
    *     datasetId: 'my-dataset-id',  // TODO: Update placeholder value.
    *
    *     // Table ID of the table to update
    *     tableId: 'my-table-id',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body. All existing
    * properties
    *       // will be replaced.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   bigquery.tables.update(request, function(err, response) {
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
    * @alias bigquery.tables.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.datasetId Dataset ID of the table to update
    * @param {string} params.projectId Project ID of the table to update
    * @param {string} params.tableId Table ID of the table to update
    * @param {().Table} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Table] = js.native
  def update(callback: BodyResponseCallback[Schema$Table]): Unit = js.native
  def update(params: ParamsDollarResourceDollarTablesDollarUpdate): GaxiosPromise[Schema$Table] = js.native
  def update(params: ParamsDollarResourceDollarTablesDollarUpdate, callback: BodyResponseCallback[Schema$Table]): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarTablesDollarUpdate,
    options: BodyResponseCallback[Schema$Table],
    callback: BodyResponseCallback[Schema$Table]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarTablesDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Table] = js.native
  def update(
    params: ParamsDollarResourceDollarTablesDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Table]
  ): Unit = js.native
}

