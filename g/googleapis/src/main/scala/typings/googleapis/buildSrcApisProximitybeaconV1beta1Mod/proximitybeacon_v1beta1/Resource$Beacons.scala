package typings.googleapis.buildSrcApisProximitybeaconV1beta1Mod.proximitybeacon_v1beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/proximitybeacon/v1beta1", "proximitybeacon_v1beta1.Resource$Beacons")
@js.native
class Resource$Beacons protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var attachments: ResourceDollarBeaconsDollarAttachments = js.native
  var context: APIRequestContext = js.native
  var diagnostics: ResourceDollarBeaconsDollarDiagnostics = js.native
  /**
    * proximitybeacon.beacons.activate
    * @desc Activates a beacon. A beacon that is active will return information
    * and attachment data when queried via `beaconinfo.getforobserved`. Calling
    * this method on an already active beacon will do nothing (but will return
    * a successful response code).  Authenticate using an [OAuth access
    * token](https://developers.google.com/identity/protocols/OAuth2) from a
    * signed-in user with **Is owner** or **Can edit** permissions in the
    * Google Developers Console project.
    * @alias proximitybeacon.beacons.activate
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.beaconName Beacon that should be activated. A beacon name has the format "beacons/N!beaconId" where the beaconId is the base16 ID broadcast by the beacon and N is a code for the beacon's type. Possible values are `3` for Eddystone-UID, `4` for Eddystone-EID, `1` for iBeacon, or `5` for AltBeacon. For Eddystone-EID beacons, you may use either the current EID or the beacon's "stable" UID. Required.
    * @param {string=} params.projectId The project id of the beacon to activate. If the project id is not specified then the project making the request is used. The project id must match the project that owns the beacon. Optional.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def activate(): GaxiosPromise[Schema$Empty] = js.native
  def activate(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def activate(params: ParamsDollarResourceDollarBeaconsDollarActivate): GaxiosPromise[Schema$Empty] = js.native
  def activate(
    params: ParamsDollarResourceDollarBeaconsDollarActivate,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def activate(
    params: ParamsDollarResourceDollarBeaconsDollarActivate,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def activate(params: ParamsDollarResourceDollarBeaconsDollarActivate, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def activate(
    params: ParamsDollarResourceDollarBeaconsDollarActivate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * proximitybeacon.beacons.deactivate
    * @desc Deactivates a beacon. Once deactivated, the API will not return
    * information nor attachment data for the beacon when queried via
    * `beaconinfo.getforobserved`. Calling this method on an already inactive
    * beacon will do nothing (but will return a successful response code).
    * Authenticate using an [OAuth access
    * token](https://developers.google.com/identity/protocols/OAuth2) from a
    * signed-in user with **Is owner** or **Can edit** permissions in the
    * Google Developers Console project.
    * @alias proximitybeacon.beacons.deactivate
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.beaconName Beacon that should be deactivated. A beacon name has the format "beacons/N!beaconId" where the beaconId is the base16 ID broadcast by the beacon and N is a code for the beacon's type. Possible values are `3` for Eddystone-UID, `4` for Eddystone-EID, `1` for iBeacon, or `5` for AltBeacon. For Eddystone-EID beacons, you may use either the current EID or the beacon's "stable" UID. Required.
    * @param {string=} params.projectId The project id of the beacon to deactivate. If the project id is not specified then the project making the request is used. The project id must match the project that owns the beacon. Optional.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def deactivate(): GaxiosPromise[Schema$Empty] = js.native
  def deactivate(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def deactivate(params: ParamsDollarResourceDollarBeaconsDollarDeactivate): GaxiosPromise[Schema$Empty] = js.native
  def deactivate(
    params: ParamsDollarResourceDollarBeaconsDollarDeactivate,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def deactivate(
    params: ParamsDollarResourceDollarBeaconsDollarDeactivate,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def deactivate(params: ParamsDollarResourceDollarBeaconsDollarDeactivate, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def deactivate(
    params: ParamsDollarResourceDollarBeaconsDollarDeactivate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * proximitybeacon.beacons.decommission
    * @desc Decommissions the specified beacon in the service. This beacon will
    * no longer be returned from `beaconinfo.getforobserved`. This operation is
    * permanent -- you will not be able to re-register a beacon with this ID
    * again.  Authenticate using an [OAuth access
    * token](https://developers.google.com/identity/protocols/OAuth2) from a
    * signed-in user with **Is owner** or **Can edit** permissions in the
    * Google Developers Console project.
    * @alias proximitybeacon.beacons.decommission
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.beaconName Beacon that should be decommissioned. A beacon name has the format "beacons/N!beaconId" where the beaconId is the base16 ID broadcast by the beacon and N is a code for the beacon's type. Possible values are `3` for Eddystone-UID, `4` for Eddystone-EID, `1` for iBeacon, or `5` for AltBeacon. For Eddystone-EID beacons, you may use either the current EID of the beacon's "stable" UID. Required.
    * @param {string=} params.projectId The project id of the beacon to decommission. If the project id is not specified then the project making the request is used. The project id must match the project that owns the beacon. Optional.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def decommission(): GaxiosPromise[Schema$Empty] = js.native
  def decommission(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def decommission(params: ParamsDollarResourceDollarBeaconsDollarDecommission): GaxiosPromise[Schema$Empty] = js.native
  def decommission(
    params: ParamsDollarResourceDollarBeaconsDollarDecommission,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def decommission(
    params: ParamsDollarResourceDollarBeaconsDollarDecommission,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def decommission(params: ParamsDollarResourceDollarBeaconsDollarDecommission, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def decommission(
    params: ParamsDollarResourceDollarBeaconsDollarDecommission,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * proximitybeacon.beacons.delete
    * @desc Deletes the specified beacon including all diagnostics data for the
    * beacon as well as any attachments on the beacon (including those
    * belonging to other projects). This operation cannot be undone.
    * Authenticate using an [OAuth access
    * token](https://developers.google.com/identity/protocols/OAuth2) from a
    * signed-in user with **Is owner** or **Can edit** permissions in the
    * Google Developers Console project.
    * @alias proximitybeacon.beacons.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.beaconName Beacon that should be deleted. A beacon name has the format "beacons/N!beaconId" where the beaconId is the base16 ID broadcast by the beacon and N is a code for the beacon's type. Possible values are `3` for Eddystone-UID, `4` for Eddystone-EID, `1` for iBeacon, or `5` for AltBeacon. For Eddystone-EID beacons, you may use either the current EID or the beacon's "stable" UID. Required.
    * @param {string=} params.projectId The project id of the beacon to delete. If not provided, the project that is making the request is used. Optional.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarBeaconsDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarBeaconsDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarBeaconsDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarBeaconsDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarBeaconsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * proximitybeacon.beacons.get
    * @desc Returns detailed information about the specified beacon.
    * Authenticate using an [OAuth access
    * token](https://developers.google.com/identity/protocols/OAuth2) from a
    * signed-in user with **viewer**, **Is owner** or **Can edit** permissions
    * in the Google Developers Console project.  Requests may supply an
    * Eddystone-EID beacon name in the form: `beacons/4!beaconId` where the
    * `beaconId` is the base16 ephemeral ID broadcast by the beacon. The
    * returned `Beacon` object will contain the beacon's stable Eddystone-UID.
    * Clients not authorized to resolve the beacon's ephemeral Eddystone-EID
    * broadcast will receive an error.
    * @alias proximitybeacon.beacons.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.beaconName Resource name of this beacon. A beacon name has the format "beacons/N!beaconId" where the beaconId is the base16 ID broadcast by the beacon and N is a code for the beacon's type. Possible values are `3` for Eddystone-UID, `4` for Eddystone-EID, `1` for iBeacon, or `5` for AltBeacon. For Eddystone-EID beacons, you may use either the current EID or the beacon's "stable" UID. Required.
    * @param {string=} params.projectId The project id of the beacon to request. If the project id is not specified then the project making the request is used. The project id must match the project that owns the beacon. Optional.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Beacon] = js.native
  def get(callback: BodyResponseCallback[Schema$Beacon]): Unit = js.native
  def get(params: ParamsDollarResourceDollarBeaconsDollarGet): GaxiosPromise[Schema$Beacon] = js.native
  def get(params: ParamsDollarResourceDollarBeaconsDollarGet, callback: BodyResponseCallback[Schema$Beacon]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarBeaconsDollarGet,
    options: BodyResponseCallback[Schema$Beacon],
    callback: BodyResponseCallback[Schema$Beacon]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarBeaconsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Beacon] = js.native
  def get(
    params: ParamsDollarResourceDollarBeaconsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Beacon]
  ): Unit = js.native
  /**
    * proximitybeacon.beacons.list
    * @desc Searches the beacon registry for beacons that match the given
    * search criteria. Only those beacons that the client has permission to
    * list will be returned.  Authenticate using an [OAuth access
    * token](https://developers.google.com/identity/protocols/OAuth2) from a
    * signed-in user with **viewer**, **Is owner** or **Can edit** permissions
    * in the Google Developers Console project.
    * @alias proximitybeacon.beacons.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize The maximum number of records to return for this request, up to a server-defined upper limit.
    * @param {string=} params.pageToken A pagination token obtained from a previous request to list beacons.
    * @param {string=} params.projectId The project id to list beacons under. If not present then the project credential that made the request is used as the project. Optional.
    * @param {string=} params.q Filter query string that supports the following field filters:  * **description:`"<string>"`**   For example: **description:"Room 3"**   Returns beacons whose description matches tokens in the string "Room 3"   (not necessarily that exact string).   The string must be double-quoted. * **status:`<enum>`**   For example: **status:active**   Returns beacons whose status matches the given value. Values must be   one of the Beacon.Status enum values (case insensitive). Accepts   multiple filters which will be combined with OR logic. * **stability:`<enum>`**   For example: **stability:mobile**   Returns beacons whose expected stability matches the given value.   Values must be one of the Beacon.Stability enum values (case   insensitive). Accepts multiple filters which will be combined with   OR logic. * **place\_id:`"<string>"`**   For example: **place\_id:"ChIJVSZzVR8FdkgRXGmmm6SslKw="**   Returns beacons explicitly registered at the given place, expressed as   a Place ID obtained from [Google Places API](/places/place-id). Does not   match places inside the given place. Does not consider the beacon's   actual location (which may be different from its registered place).   Accepts multiple filters that will be combined with OR logic. The place   ID must be double-quoted. * **registration\_time`[<|>|<=|>=]<integer>`**   For example: **registration\_time>=1433116800**   Returns beacons whose registration time matches the given filter.   Supports the operators: <, >, <=, and >=. Timestamp must be expressed as   an integer number of seconds since midnight January 1, 1970 UTC. Accepts   at most two filters that will be combined with AND logic, to support   "between" semantics. If more than two are supplied, the latter ones are   ignored. * **lat:`<double> lng:<double> radius:<integer>`**   For example: **lat:51.1232343 lng:-1.093852 radius:1000**   Returns beacons whose registered location is within the given circle.   When any of these fields are given, all are required. Latitude and   longitude must be decimal degrees between -90.0 and 90.0 and between   -180.0 and 180.0 respectively. Radius must be an integer number of   meters between 10 and 1,000,000 (1000 km). * **property:`"<string>=<string>"`**   For example: **property:"battery-type=CR2032"**   Returns beacons which have a property of the given name and value.   Supports multiple filters which will be combined with OR logic.   The entire name=value string must be double-quoted as one string. * **attachment\_type:`"<string>"`**   For example: **attachment_type:"my-namespace/my-type"**   Returns beacons having at least one attachment of the given namespaced   type. Supports "any within this namespace" via the partial wildcard   syntax: "my-namespace/x". Supports multiple filters which will be   combined with OR logic. The string must be double-quoted. * **indoor\_level:`"<string>"`**   For example: **indoor\_level:"1"**   Returns beacons which are located on the given indoor level. Accepts   multiple filters that will be combined with OR logic.  Multiple filters on the same field are combined with OR logic (except registration_time which is combined with AND logic). Multiple filters on different fields are combined with AND logic. Filters should be separated by spaces.  As with any HTTP query string parameter, the whole filter expression must be URL-encoded.  Example REST request: `GET /v1beta1/beacons?q=status:active%20lat:51.123%20lng:-1.095%20radius:1000`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListBeaconsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListBeaconsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarBeaconsDollarList): GaxiosPromise[Schema$ListBeaconsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarBeaconsDollarList,
    callback: BodyResponseCallback[Schema$ListBeaconsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarBeaconsDollarList,
    options: BodyResponseCallback[Schema$ListBeaconsResponse],
    callback: BodyResponseCallback[Schema$ListBeaconsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarBeaconsDollarList, options: MethodOptions): GaxiosPromise[Schema$ListBeaconsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarBeaconsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListBeaconsResponse]
  ): Unit = js.native
  /**
    * proximitybeacon.beacons.register
    * @desc Registers a previously unregistered beacon given its
    * `advertisedId`. These IDs are unique within the system. An ID can be
    * registered only once.  Authenticate using an [OAuth access
    * token](https://developers.google.com/identity/protocols/OAuth2) from a
    * signed-in user with **Is owner** or **Can edit** permissions in the
    * Google Developers Console project.
    * @alias proximitybeacon.beacons.register
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.projectId The project id of the project the beacon will be registered to. If the project id is not specified then the project making the request is used. Optional.
    * @param {().Beacon} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def register(): GaxiosPromise[Schema$Beacon] = js.native
  def register(callback: BodyResponseCallback[Schema$Beacon]): Unit = js.native
  def register(params: ParamsDollarResourceDollarBeaconsDollarRegister): GaxiosPromise[Schema$Beacon] = js.native
  def register(
    params: ParamsDollarResourceDollarBeaconsDollarRegister,
    callback: BodyResponseCallback[Schema$Beacon]
  ): Unit = js.native
  def register(
    params: ParamsDollarResourceDollarBeaconsDollarRegister,
    options: BodyResponseCallback[Schema$Beacon],
    callback: BodyResponseCallback[Schema$Beacon]
  ): Unit = js.native
  def register(params: ParamsDollarResourceDollarBeaconsDollarRegister, options: MethodOptions): GaxiosPromise[Schema$Beacon] = js.native
  def register(
    params: ParamsDollarResourceDollarBeaconsDollarRegister,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Beacon]
  ): Unit = js.native
  /**
    * proximitybeacon.beacons.update
    * @desc Updates the information about the specified beacon. **Any field
    * that you do not populate in the submitted beacon will be permanently
    * erased**, so you should follow the "read, modify, write" pattern to avoid
    * inadvertently destroying data.  Changes to the beacon status via this
    * method will be  silently ignored. To update beacon status, use the
    * separate methods on this API for activation, deactivation, and
    * decommissioning. Authenticate using an [OAuth access
    * token](https://developers.google.com/identity/protocols/OAuth2) from a
    * signed-in user with **Is owner** or **Can edit** permissions in the
    * Google Developers Console project.
    * @alias proximitybeacon.beacons.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.beaconName Resource name of this beacon. A beacon name has the format "beacons/N!beaconId" where the beaconId is the base16 ID broadcast by the beacon and N is a code for the beacon's type. Possible values are `3` for Eddystone, `1` for iBeacon, or `5` for AltBeacon.  This field must be left empty when registering. After reading a beacon, clients can use the name for future operations.
    * @param {string=} params.projectId The project id of the beacon to update. If the project id is not specified then the project making the request is used. The project id must match the project that owns the beacon. Optional.
    * @param {().Beacon} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Beacon] = js.native
  def update(callback: BodyResponseCallback[Schema$Beacon]): Unit = js.native
  def update(params: ParamsDollarResourceDollarBeaconsDollarUpdate): GaxiosPromise[Schema$Beacon] = js.native
  def update(
    params: ParamsDollarResourceDollarBeaconsDollarUpdate,
    callback: BodyResponseCallback[Schema$Beacon]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarBeaconsDollarUpdate,
    options: BodyResponseCallback[Schema$Beacon],
    callback: BodyResponseCallback[Schema$Beacon]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarBeaconsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Beacon] = js.native
  def update(
    params: ParamsDollarResourceDollarBeaconsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Beacon]
  ): Unit = js.native
}

