package typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.1", "dfareporting_v3_1.Resource$Languages")
@js.native
class Resource$Languages protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.languages.list
    * @desc Retrieves a list of languages.
    * @alias dfareporting.languages.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$LanguagesListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$LanguagesListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarLanguagesDollarList): GaxiosPromise[Schema$LanguagesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarLanguagesDollarList,
    callback: BodyResponseCallback[Schema$LanguagesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarLanguagesDollarList,
    options: BodyResponseCallback[Schema$LanguagesListResponse],
    callback: BodyResponseCallback[Schema$LanguagesListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarLanguagesDollarList, options: MethodOptions): GaxiosPromise[Schema$LanguagesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarLanguagesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$LanguagesListResponse]
  ): Unit = js.native
}

