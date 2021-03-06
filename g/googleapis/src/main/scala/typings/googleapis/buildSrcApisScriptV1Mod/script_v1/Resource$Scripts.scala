package typings.googleapis.buildSrcApisScriptV1Mod.script_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/script/v1", "script_v1.Resource$Scripts")
@js.native
class Resource$Scripts protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * script.scripts.run
    * @desc Runs a function in an Apps Script project. The script project must
    * be deployed for use with the Apps Script API and the calling application
    * must share the same Cloud Platform project.  This method requires
    * authorization with an OAuth 2.0 token that includes at least one of the
    * scopes listed in the [Authorization](#authorization) section; script
    * projects that do not require authorization cannot be executed through
    * this API. To find the correct scopes to include in the authentication
    * token, open the project in the script editor, then select **File >
    * Project properties** and click the **Scopes** tab.  The error `403,
    * PERMISSION_DENIED: The caller does not have permission` indicates that
    * the Cloud Platform project used to authorize the request is not the same
    * as the one used by the script.
    * @alias script.scripts.run
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.scriptId The script ID of the script to be executed. To find the script ID, open the project in the script editor and select **File > Project properties**.
    * @param {().ExecutionRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def run(): GaxiosPromise[Schema$Operation] = js.native
  def run(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def run(params: ParamsDollarResourceDollarScriptsDollarRun): GaxiosPromise[Schema$Operation] = js.native
  def run(
    params: ParamsDollarResourceDollarScriptsDollarRun,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def run(
    params: ParamsDollarResourceDollarScriptsDollarRun,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def run(params: ParamsDollarResourceDollarScriptsDollarRun, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def run(
    params: ParamsDollarResourceDollarScriptsDollarRun,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
}

