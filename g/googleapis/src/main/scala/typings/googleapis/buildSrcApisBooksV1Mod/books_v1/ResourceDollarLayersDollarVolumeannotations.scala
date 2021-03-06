package typings.googleapis.buildSrcApisBooksV1Mod.books_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/books/v1", "books_v1.Resource$Layers$Volumeannotations")
@js.native
class ResourceDollarLayersDollarVolumeannotations protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * books.layers.volumeAnnotations.get
    * @desc Gets the volume annotation.
    * @alias books.layers.volumeAnnotations.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.annotationId The ID of the volume annotation to retrieve.
    * @param {string} params.layerId The ID for the layer to get the annotations.
    * @param {string=} params.locale The locale information for the data. ISO-639-1 language and ISO-3166-1 country code. Ex: 'en_US'.
    * @param {string=} params.source String to identify the originator of this request.
    * @param {string} params.volumeId The volume to retrieve annotations for.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Volumeannotation] = js.native
  def get(callback: BodyResponseCallback[Schema$Volumeannotation]): Unit = js.native
  def get(params: ParamsDollarResourceDollarLayersDollarVolumeannotationsDollarGet): GaxiosPromise[Schema$Volumeannotation] = js.native
  def get(
    params: ParamsDollarResourceDollarLayersDollarVolumeannotationsDollarGet,
    callback: BodyResponseCallback[Schema$Volumeannotation]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarLayersDollarVolumeannotationsDollarGet,
    options: BodyResponseCallback[Schema$Volumeannotation],
    callback: BodyResponseCallback[Schema$Volumeannotation]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarLayersDollarVolumeannotationsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Volumeannotation] = js.native
  def get(
    params: ParamsDollarResourceDollarLayersDollarVolumeannotationsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Volumeannotation]
  ): Unit = js.native
  /**
    * books.layers.volumeAnnotations.list
    * @desc Gets the volume annotations for a volume and layer.
    * @alias books.layers.volumeAnnotations.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.contentVersion The content version for the requested volume.
    * @param {string=} params.endOffset The end offset to end retrieving data from.
    * @param {string=} params.endPosition The end position to end retrieving data from.
    * @param {string} params.layerId The ID for the layer to get the annotations.
    * @param {string=} params.locale The locale information for the data. ISO-639-1 language and ISO-3166-1 country code. Ex: 'en_US'.
    * @param {integer=} params.maxResults Maximum number of results to return
    * @param {string=} params.pageToken The value of the nextToken from the previous page.
    * @param {boolean=} params.showDeleted Set to true to return deleted annotations. updatedMin must be in the request to use this. Defaults to false.
    * @param {string=} params.source String to identify the originator of this request.
    * @param {string=} params.startOffset The start offset to start retrieving data from.
    * @param {string=} params.startPosition The start position to start retrieving data from.
    * @param {string=} params.updatedMax RFC 3339 timestamp to restrict to items updated prior to this timestamp (exclusive).
    * @param {string=} params.updatedMin RFC 3339 timestamp to restrict to items updated since this timestamp (inclusive).
    * @param {string=} params.volumeAnnotationsVersion The version of the volume annotations that you are requesting.
    * @param {string} params.volumeId The volume to retrieve annotations for.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$Volumeannotations] = js.native
  def list(callback: BodyResponseCallback[Schema$Volumeannotations]): Unit = js.native
  def list(params: ParamsDollarResourceDollarLayersDollarVolumeannotationsDollarList): GaxiosPromise[Schema$Volumeannotations] = js.native
  def list(
    params: ParamsDollarResourceDollarLayersDollarVolumeannotationsDollarList,
    callback: BodyResponseCallback[Schema$Volumeannotations]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarLayersDollarVolumeannotationsDollarList,
    options: BodyResponseCallback[Schema$Volumeannotations],
    callback: BodyResponseCallback[Schema$Volumeannotations]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarLayersDollarVolumeannotationsDollarList, options: MethodOptions): GaxiosPromise[Schema$Volumeannotations] = js.native
  def list(
    params: ParamsDollarResourceDollarLayersDollarVolumeannotationsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Volumeannotations]
  ): Unit = js.native
}

