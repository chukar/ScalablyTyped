package typings.googleapis.buildSrcApisVisionV1Mod.vision_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/vision/v1", "vision_v1.Resource$Images")
@js.native
class Resource$Images protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * vision.images.annotate
    * @desc Run image detection and annotation for a batch of images.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Cloud Vision API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/vision
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
    * var vision = google.vision('v1');
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
    *   vision.images.annotate(request, function(err, response) {
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
    * @alias vision.images.annotate
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().BatchAnnotateImagesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def annotate(): GaxiosPromise[Schema$BatchAnnotateImagesResponse] = js.native
  def annotate(callback: BodyResponseCallback[Schema$BatchAnnotateImagesResponse]): Unit = js.native
  def annotate(params: ParamsDollarResourceDollarImagesDollarAnnotate): GaxiosPromise[Schema$BatchAnnotateImagesResponse] = js.native
  def annotate(
    params: ParamsDollarResourceDollarImagesDollarAnnotate,
    callback: BodyResponseCallback[Schema$BatchAnnotateImagesResponse]
  ): Unit = js.native
  def annotate(
    params: ParamsDollarResourceDollarImagesDollarAnnotate,
    options: BodyResponseCallback[Schema$BatchAnnotateImagesResponse],
    callback: BodyResponseCallback[Schema$BatchAnnotateImagesResponse]
  ): Unit = js.native
  def annotate(params: ParamsDollarResourceDollarImagesDollarAnnotate, options: MethodOptions): GaxiosPromise[Schema$BatchAnnotateImagesResponse] = js.native
  def annotate(
    params: ParamsDollarResourceDollarImagesDollarAnnotate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$BatchAnnotateImagesResponse]
  ): Unit = js.native
}

