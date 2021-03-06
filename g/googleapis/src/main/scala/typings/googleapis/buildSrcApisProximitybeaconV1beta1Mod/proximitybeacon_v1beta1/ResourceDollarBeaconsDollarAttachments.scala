package typings.googleapis.buildSrcApisProximitybeaconV1beta1Mod.proximitybeacon_v1beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/proximitybeacon/v1beta1", "proximitybeacon_v1beta1.Resource$Beacons$Attachments")
@js.native
class ResourceDollarBeaconsDollarAttachments protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * proximitybeacon.beacons.attachments.batchDelete
    * @desc Deletes multiple attachments on a given beacon. This operation is
    * permanent and cannot be undone.  You can optionally specify
    * `namespacedType` to choose which attachments should be deleted. If you do
    * not specify `namespacedType`,  all your attachments on the given beacon
    * will be deleted. You also may explicitly specify `x/x` to delete all.
    * Authenticate using an [OAuth access
    * token](https://developers.google.com/identity/protocols/OAuth2) from a
    * signed-in user with **Is owner** or **Can edit** permissions in the
    * Google Developers Console project.
    * @alias proximitybeacon.beacons.attachments.batchDelete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.beaconName The beacon whose attachments should be deleted. A beacon name has the format "beacons/N!beaconId" where the beaconId is the base16 ID broadcast by the beacon and N is a code for the beacon's type. Possible values are `3` for Eddystone-UID, `4` for Eddystone-EID, `1` for iBeacon, or `5` for AltBeacon. For Eddystone-EID beacons, you may use either the current EID or the beacon's "stable" UID. Required.
    * @param {string=} params.namespacedType Specifies the namespace and type of attachments to delete in `namespace/type` format. Accepts `x/x` to specify "all types in all namespaces". Optional.
    * @param {string=} params.projectId The project id to delete beacon attachments under. This field can be used when "*" is specified to mean all attachment namespaces. Projects may have multiple attachments with multiple namespaces. If "*" is specified and the projectId string is empty, then the project making the request is used. Optional.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def batchDelete(): GaxiosPromise[Schema$DeleteAttachmentsResponse] = js.native
  def batchDelete(callback: BodyResponseCallback[Schema$DeleteAttachmentsResponse]): Unit = js.native
  def batchDelete(params: ParamsDollarResourceDollarBeaconsDollarAttachmentsDollarBatchdelete): GaxiosPromise[Schema$DeleteAttachmentsResponse] = js.native
  def batchDelete(
    params: ParamsDollarResourceDollarBeaconsDollarAttachmentsDollarBatchdelete,
    callback: BodyResponseCallback[Schema$DeleteAttachmentsResponse]
  ): Unit = js.native
  def batchDelete(
    params: ParamsDollarResourceDollarBeaconsDollarAttachmentsDollarBatchdelete,
    options: BodyResponseCallback[Schema$DeleteAttachmentsResponse],
    callback: BodyResponseCallback[Schema$DeleteAttachmentsResponse]
  ): Unit = js.native
  def batchDelete(
    params: ParamsDollarResourceDollarBeaconsDollarAttachmentsDollarBatchdelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$DeleteAttachmentsResponse] = js.native
  def batchDelete(
    params: ParamsDollarResourceDollarBeaconsDollarAttachmentsDollarBatchdelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$DeleteAttachmentsResponse]
  ): Unit = js.native
  /**
    * proximitybeacon.beacons.attachments.create
    * @desc Associates the given data with the specified beacon. Attachment
    * data must contain two parts: <ul> <li>A namespaced type.</li> <li>The
    * actual attachment data itself.</li> </ul> The namespaced type consists of
    * two parts, the namespace and the type. The namespace must be one of the
    * values returned by the `namespaces` endpoint, while the type can be a
    * string of any characters except for the forward slash (`/`) up to 100
    * characters in length.  Attachment data can be up to 1024 bytes long.
    * Authenticate using an [OAuth access
    * token](https://developers.google.com/identity/protocols/OAuth2) from a
    * signed-in user with **Is owner** or **Can edit** permissions in the
    * Google Developers Console project.
    * @alias proximitybeacon.beacons.attachments.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.beaconName Beacon on which the attachment should be created. A beacon name has the format "beacons/N!beaconId" where the beaconId is the base16 ID broadcast by the beacon and N is a code for the beacon's type. Possible values are `3` for Eddystone-UID, `4` for Eddystone-EID, `1` for iBeacon, or `5` for AltBeacon. For Eddystone-EID beacons, you may use either the current EID or the beacon's "stable" UID. Required.
    * @param {string=} params.projectId The project id of the project the attachment will belong to. If the project id is not specified then the project making the request is used. Optional.
    * @param {().BeaconAttachment} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$BeaconAttachment] = js.native
  def create(callback: BodyResponseCallback[Schema$BeaconAttachment]): Unit = js.native
  def create(params: ParamsDollarResourceDollarBeaconsDollarAttachmentsDollarCreate): GaxiosPromise[Schema$BeaconAttachment] = js.native
  def create(
    params: ParamsDollarResourceDollarBeaconsDollarAttachmentsDollarCreate,
    callback: BodyResponseCallback[Schema$BeaconAttachment]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarBeaconsDollarAttachmentsDollarCreate,
    options: BodyResponseCallback[Schema$BeaconAttachment],
    callback: BodyResponseCallback[Schema$BeaconAttachment]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarBeaconsDollarAttachmentsDollarCreate, options: MethodOptions): GaxiosPromise[Schema$BeaconAttachment] = js.native
  def create(
    params: ParamsDollarResourceDollarBeaconsDollarAttachmentsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$BeaconAttachment]
  ): Unit = js.native
  /**
    * proximitybeacon.beacons.attachments.delete
    * @desc Deletes the specified attachment for the given beacon. Each
    * attachment has a unique attachment name (`attachmentName`) which is
    * returned when you fetch the attachment data via this API. You specify
    * this with the delete request to control which attachment is removed. This
    * operation cannot be undone.  Authenticate using an [OAuth access
    * token](https://developers.google.com/identity/protocols/OAuth2) from a
    * signed-in user with **Is owner** or **Can edit** permissions in the
    * Google Developers Console project.
    * @alias proximitybeacon.beacons.attachments.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.attachmentName The attachment name (`attachmentName`) of the attachment to remove. For example: `beacons/3!893737abc9/attachments/c5e937-af0-494-959-ec49d12738`. For Eddystone-EID beacons, the beacon ID portion (`3!893737abc9`) may be the beacon's current EID, or its "stable" Eddystone-UID. Required.
    * @param {string=} params.projectId The project id of the attachment to delete. If not provided, the project that is making the request is used. Optional.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarBeaconsDollarAttachmentsDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarBeaconsDollarAttachmentsDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarBeaconsDollarAttachmentsDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarBeaconsDollarAttachmentsDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarBeaconsDollarAttachmentsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * proximitybeacon.beacons.attachments.list
    * @desc Returns the attachments for the specified beacon that match the
    * specified namespaced-type pattern.  To control which namespaced types are
    * returned, you add the `namespacedType` query parameter to the request.
    * You must either use `x/x`, to return all attachments, or the namespace
    * must be one of the ones returned from the  `namespaces` endpoint.
    * Authenticate using an [OAuth access
    * token](https://developers.google.com/identity/protocols/OAuth2) from a
    * signed-in user with **viewer**, **Is owner** or **Can edit** permissions
    * in the Google Developers Console project.
    * @alias proximitybeacon.beacons.attachments.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.beaconName Beacon whose attachments should be fetched. A beacon name has the format "beacons/N!beaconId" where the beaconId is the base16 ID broadcast by the beacon and N is a code for the beacon's type. Possible values are `3` for Eddystone-UID, `4` for Eddystone-EID, `1` for iBeacon, or `5` for AltBeacon. For Eddystone-EID beacons, you may use either the current EID or the beacon's "stable" UID. Required.
    * @param {string=} params.namespacedType Specifies the namespace and type of attachment to include in response in <var>namespace/type</var> format. Accepts `x/x` to specify "all types in all namespaces".
    * @param {string=} params.projectId The project id to list beacon attachments under. This field can be used when "*" is specified to mean all attachment namespaces. Projects may have multiple attachments with multiple namespaces. If "*" is specified and the projectId string is empty, then the project making the request is used. Optional.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListBeaconAttachmentsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListBeaconAttachmentsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarBeaconsDollarAttachmentsDollarList): GaxiosPromise[Schema$ListBeaconAttachmentsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarBeaconsDollarAttachmentsDollarList,
    callback: BodyResponseCallback[Schema$ListBeaconAttachmentsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarBeaconsDollarAttachmentsDollarList,
    options: BodyResponseCallback[Schema$ListBeaconAttachmentsResponse],
    callback: BodyResponseCallback[Schema$ListBeaconAttachmentsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarBeaconsDollarAttachmentsDollarList, options: MethodOptions): GaxiosPromise[Schema$ListBeaconAttachmentsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarBeaconsDollarAttachmentsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListBeaconAttachmentsResponse]
  ): Unit = js.native
}

