package typings.googleapis.buildSrcApisStorageV1Mod.storage_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/storage/v1", "storage_v1.Resource$Defaultobjectaccesscontrols")
@js.native
class Resource$Defaultobjectaccesscontrols protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * storage.defaultObjectAccessControls.delete
    * @desc Permanently deletes the default object ACL entry for the specified
    * entity on the specified bucket.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Cloud Storage JSON API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/storage
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
    * var storage = google.storage('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Name of a bucket.
    *     bucket: 'my-bucket',  // TODO: Update placeholder value.
    *
    *     // The entity holding the permission. Can be user-userId,
    * user-emailAddress, group-groupId,
    *     // group-emailAddress, allUsers, or allAuthenticatedUsers.
    *     entity: 'my-entity',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   storage.defaultObjectAccessControls.delete(request, function(err) {
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
    * @alias storage.defaultObjectAccessControls.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {string} params.entity The entity holding the permission. Can be user-userId, user-emailAddress, group-groupId, group-emailAddress, allUsers, or allAuthenticatedUsers.
    * @param {string=} params.userProject The project to be billed for this request. Required for Requester Pays buckets.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarDefaultobjectaccesscontrolsDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarDefaultobjectaccesscontrolsDollarDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarDefaultobjectaccesscontrolsDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarDefaultobjectaccesscontrolsDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarDefaultobjectaccesscontrolsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * storage.defaultObjectAccessControls.get
    * @desc Returns the default object ACL entry for the specified entity on
    * the specified bucket.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Cloud Storage JSON API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/storage
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
    * var storage = google.storage('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Name of a bucket.
    *     bucket: 'my-bucket',  // TODO: Update placeholder value.
    *
    *     // The entity holding the permission. Can be user-userId,
    * user-emailAddress, group-groupId,
    *     // group-emailAddress, allUsers, or allAuthenticatedUsers.
    *     entity: 'my-entity',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   storage.defaultObjectAccessControls.get(request, function(err,
    * response) { if (err) { console.error(err); return;
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
    * @alias storage.defaultObjectAccessControls.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {string} params.entity The entity holding the permission. Can be user-userId, user-emailAddress, group-groupId, group-emailAddress, allUsers, or allAuthenticatedUsers.
    * @param {string=} params.userProject The project to be billed for this request. Required for Requester Pays buckets.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$ObjectAccessControl] = js.native
  def get(callback: BodyResponseCallback[Schema$ObjectAccessControl]): Unit = js.native
  def get(params: ParamsDollarResourceDollarDefaultobjectaccesscontrolsDollarGet): GaxiosPromise[Schema$ObjectAccessControl] = js.native
  def get(
    params: ParamsDollarResourceDollarDefaultobjectaccesscontrolsDollarGet,
    callback: BodyResponseCallback[Schema$ObjectAccessControl]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarDefaultobjectaccesscontrolsDollarGet,
    options: BodyResponseCallback[Schema$ObjectAccessControl],
    callback: BodyResponseCallback[Schema$ObjectAccessControl]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarDefaultobjectaccesscontrolsDollarGet, options: MethodOptions): GaxiosPromise[Schema$ObjectAccessControl] = js.native
  def get(
    params: ParamsDollarResourceDollarDefaultobjectaccesscontrolsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ObjectAccessControl]
  ): Unit = js.native
  /**
    * storage.defaultObjectAccessControls.insert
    * @desc Creates a new default object ACL entry on the specified bucket.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Cloud Storage JSON API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/storage
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
    * var storage = google.storage('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Name of a bucket.
    *     bucket: 'my-bucket',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   storage.defaultObjectAccessControls.insert(request, function(err,
    * response) { if (err) { console.error(err); return;
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
    * @alias storage.defaultObjectAccessControls.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {string=} params.userProject The project to be billed for this request. Required for Requester Pays buckets.
    * @param {().ObjectAccessControl} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$ObjectAccessControl] = js.native
  def insert(callback: BodyResponseCallback[Schema$ObjectAccessControl]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarDefaultobjectaccesscontrolsDollarInsert): GaxiosPromise[Schema$ObjectAccessControl] = js.native
  def insert(
    params: ParamsDollarResourceDollarDefaultobjectaccesscontrolsDollarInsert,
    callback: BodyResponseCallback[Schema$ObjectAccessControl]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarDefaultobjectaccesscontrolsDollarInsert,
    options: BodyResponseCallback[Schema$ObjectAccessControl],
    callback: BodyResponseCallback[Schema$ObjectAccessControl]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarDefaultobjectaccesscontrolsDollarInsert, options: MethodOptions): GaxiosPromise[Schema$ObjectAccessControl] = js.native
  def insert(
    params: ParamsDollarResourceDollarDefaultobjectaccesscontrolsDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ObjectAccessControl]
  ): Unit = js.native
  /**
    * storage.defaultObjectAccessControls.list
    * @desc Retrieves default object ACL entries on the specified bucket.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Cloud Storage JSON API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/storage
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
    * var storage = google.storage('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Name of a bucket.
    *     bucket: 'my-bucket',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   storage.defaultObjectAccessControls.list(request, function(err,
    * response) { if (err) { console.error(err); return;
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
    * @alias storage.defaultObjectAccessControls.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {string=} params.ifMetagenerationMatch If present, only return default ACL listing if the bucket's current metageneration matches this value.
    * @param {string=} params.ifMetagenerationNotMatch If present, only return default ACL listing if the bucket's current metageneration does not match the given value.
    * @param {string=} params.userProject The project to be billed for this request. Required for Requester Pays buckets.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ObjectAccessControls] = js.native
  def list(callback: BodyResponseCallback[Schema$ObjectAccessControls]): Unit = js.native
  def list(params: ParamsDollarResourceDollarDefaultobjectaccesscontrolsDollarList): GaxiosPromise[Schema$ObjectAccessControls] = js.native
  def list(
    params: ParamsDollarResourceDollarDefaultobjectaccesscontrolsDollarList,
    callback: BodyResponseCallback[Schema$ObjectAccessControls]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarDefaultobjectaccesscontrolsDollarList,
    options: BodyResponseCallback[Schema$ObjectAccessControls],
    callback: BodyResponseCallback[Schema$ObjectAccessControls]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarDefaultobjectaccesscontrolsDollarList, options: MethodOptions): GaxiosPromise[Schema$ObjectAccessControls] = js.native
  def list(
    params: ParamsDollarResourceDollarDefaultobjectaccesscontrolsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ObjectAccessControls]
  ): Unit = js.native
  /**
    * storage.defaultObjectAccessControls.patch
    * @desc Patches a default object ACL entry on the specified bucket.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Cloud Storage JSON API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/storage
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
    * var storage = google.storage('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Name of a bucket.
    *     bucket: 'my-bucket',  // TODO: Update placeholder value.
    *
    *     // The entity holding the permission. Can be user-userId,
    * user-emailAddress, group-groupId,
    *     // group-emailAddress, allUsers, or allAuthenticatedUsers.
    *     entity: 'my-entity',  // TODO: Update placeholder value.
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
    *   storage.defaultObjectAccessControls.patch(request, function(err,
    * response) { if (err) { console.error(err); return;
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
    * @alias storage.defaultObjectAccessControls.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {string} params.entity The entity holding the permission. Can be user-userId, user-emailAddress, group-groupId, group-emailAddress, allUsers, or allAuthenticatedUsers.
    * @param {string=} params.userProject The project to be billed for this request. Required for Requester Pays buckets.
    * @param {().ObjectAccessControl} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$ObjectAccessControl] = js.native
  def patch(callback: BodyResponseCallback[Schema$ObjectAccessControl]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarDefaultobjectaccesscontrolsDollarPatch): GaxiosPromise[Schema$ObjectAccessControl] = js.native
  def patch(
    params: ParamsDollarResourceDollarDefaultobjectaccesscontrolsDollarPatch,
    callback: BodyResponseCallback[Schema$ObjectAccessControl]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarDefaultobjectaccesscontrolsDollarPatch,
    options: BodyResponseCallback[Schema$ObjectAccessControl],
    callback: BodyResponseCallback[Schema$ObjectAccessControl]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarDefaultobjectaccesscontrolsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$ObjectAccessControl] = js.native
  def patch(
    params: ParamsDollarResourceDollarDefaultobjectaccesscontrolsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ObjectAccessControl]
  ): Unit = js.native
  /**
    * storage.defaultObjectAccessControls.update
    * @desc Updates a default object ACL entry on the specified bucket.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Cloud Storage JSON API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/storage
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
    * var storage = google.storage('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Name of a bucket.
    *     bucket: 'my-bucket',  // TODO: Update placeholder value.
    *
    *     // The entity holding the permission. Can be user-userId,
    * user-emailAddress, group-groupId,
    *     // group-emailAddress, allUsers, or allAuthenticatedUsers.
    *     entity: 'my-entity',  // TODO: Update placeholder value.
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
    *   storage.defaultObjectAccessControls.update(request, function(err,
    * response) { if (err) { console.error(err); return;
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
    * @alias storage.defaultObjectAccessControls.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a bucket.
    * @param {string} params.entity The entity holding the permission. Can be user-userId, user-emailAddress, group-groupId, group-emailAddress, allUsers, or allAuthenticatedUsers.
    * @param {string=} params.userProject The project to be billed for this request. Required for Requester Pays buckets.
    * @param {().ObjectAccessControl} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$ObjectAccessControl] = js.native
  def update(callback: BodyResponseCallback[Schema$ObjectAccessControl]): Unit = js.native
  def update(params: ParamsDollarResourceDollarDefaultobjectaccesscontrolsDollarUpdate): GaxiosPromise[Schema$ObjectAccessControl] = js.native
  def update(
    params: ParamsDollarResourceDollarDefaultobjectaccesscontrolsDollarUpdate,
    callback: BodyResponseCallback[Schema$ObjectAccessControl]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarDefaultobjectaccesscontrolsDollarUpdate,
    options: BodyResponseCallback[Schema$ObjectAccessControl],
    callback: BodyResponseCallback[Schema$ObjectAccessControl]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarDefaultobjectaccesscontrolsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$ObjectAccessControl] = js.native
  def update(
    params: ParamsDollarResourceDollarDefaultobjectaccesscontrolsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ObjectAccessControl]
  ): Unit = js.native
}

