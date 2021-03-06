package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/youtube/v3", "youtube_v3.Resource$Videocategories")
@js.native
class Resource$Videocategories protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * youtube.videoCategories.list
    * @desc Returns a list of categories that can be associated with YouTube
    * videos.
    * @alias youtube.videoCategories.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.hl The hl parameter specifies the language that should be used for text values in the API response.
    * @param {string=} params.id The id parameter specifies a comma-separated list of video category IDs for the resources that you are retrieving.
    * @param {string} params.part The part parameter specifies the videoCategory resource properties that the API response will include. Set the parameter value to snippet.
    * @param {string=} params.regionCode The regionCode parameter instructs the API to return the list of video categories available in the specified country. The parameter value is an ISO 3166-1 alpha-2 country code.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$VideoCategoryListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$VideoCategoryListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarVideocategoriesDollarList): GaxiosPromise[Schema$VideoCategoryListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarVideocategoriesDollarList,
    callback: BodyResponseCallback[Schema$VideoCategoryListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarVideocategoriesDollarList,
    options: BodyResponseCallback[Schema$VideoCategoryListResponse],
    callback: BodyResponseCallback[Schema$VideoCategoryListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarVideocategoriesDollarList, options: MethodOptions): GaxiosPromise[Schema$VideoCategoryListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarVideocategoriesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$VideoCategoryListResponse]
  ): Unit = js.native
}

