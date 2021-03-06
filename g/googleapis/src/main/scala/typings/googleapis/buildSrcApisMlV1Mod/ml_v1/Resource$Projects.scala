package typings.googleapis.buildSrcApisMlV1Mod.ml_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/ml/v1", "ml_v1.Resource$Projects")
@js.native
class Resource$Projects protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var jobs: ResourceDollarProjectsDollarJobs = js.native
  var locations: ResourceDollarProjectsDollarLocations = js.native
  var models: ResourceDollarProjectsDollarModels = js.native
  var operations: ResourceDollarProjectsDollarOperations = js.native
  /**
    * ml.projects.getConfig
    * @desc Get the service account information associated with your project.
    * You need this information in order to grant the service account
    * permissions for the Google Cloud Storage location where you put your
    * model training code for training the model with Google Cloud Machine
    * Learning.
    * @alias ml.projects.getConfig
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The project name.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getConfig(): GaxiosPromise[Schema$GoogleCloudMlV1__GetConfigResponse] = js.native
  def getConfig(callback: BodyResponseCallback[Schema$GoogleCloudMlV1__GetConfigResponse]): Unit = js.native
  def getConfig(params: ParamsDollarResourceDollarProjectsDollarGetconfig): GaxiosPromise[Schema$GoogleCloudMlV1__GetConfigResponse] = js.native
  def getConfig(
    params: ParamsDollarResourceDollarProjectsDollarGetconfig,
    callback: BodyResponseCallback[Schema$GoogleCloudMlV1__GetConfigResponse]
  ): Unit = js.native
  def getConfig(
    params: ParamsDollarResourceDollarProjectsDollarGetconfig,
    options: BodyResponseCallback[Schema$GoogleCloudMlV1__GetConfigResponse],
    callback: BodyResponseCallback[Schema$GoogleCloudMlV1__GetConfigResponse]
  ): Unit = js.native
  def getConfig(params: ParamsDollarResourceDollarProjectsDollarGetconfig, options: MethodOptions): GaxiosPromise[Schema$GoogleCloudMlV1__GetConfigResponse] = js.native
  def getConfig(
    params: ParamsDollarResourceDollarProjectsDollarGetconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleCloudMlV1__GetConfigResponse]
  ): Unit = js.native
  /**
    * ml.projects.predict
    * @desc Performs prediction on the data in the request. Cloud ML Engine
    * implements a custom `predict` verb on top of an HTTP POST method. <p>For
    * details of the request and response format, see the **guide to the
    * [predict request format](/ml-engine/docs/v1/predict-request)**.
    * @alias ml.projects.predict
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The resource name of a model or a version.  Authorization: requires the `predict` permission on the specified resource.
    * @param {().GoogleCloudMlV1__PredictRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def predict(): GaxiosPromise[Schema$GoogleApi__HttpBody] = js.native
  def predict(callback: BodyResponseCallback[Schema$GoogleApi__HttpBody]): Unit = js.native
  def predict(params: ParamsDollarResourceDollarProjectsDollarPredict): GaxiosPromise[Schema$GoogleApi__HttpBody] = js.native
  def predict(
    params: ParamsDollarResourceDollarProjectsDollarPredict,
    callback: BodyResponseCallback[Schema$GoogleApi__HttpBody]
  ): Unit = js.native
  def predict(
    params: ParamsDollarResourceDollarProjectsDollarPredict,
    options: BodyResponseCallback[Schema$GoogleApi__HttpBody],
    callback: BodyResponseCallback[Schema$GoogleApi__HttpBody]
  ): Unit = js.native
  def predict(params: ParamsDollarResourceDollarProjectsDollarPredict, options: MethodOptions): GaxiosPromise[Schema$GoogleApi__HttpBody] = js.native
  def predict(
    params: ParamsDollarResourceDollarProjectsDollarPredict,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleApi__HttpBody]
  ): Unit = js.native
}

