package typings.googleapis.buildSrcApisToolresultsV1beta3Mod.toolresults_v1beta3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/toolresults/v1beta3", "toolresults_v1beta3.Resource$Projects$Histories$Executions$Steps$Thumbnails")
@js.native
class ResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarThumbnails protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * toolresults.projects.histories.executions.steps.thumbnails.list
    * @desc Lists thumbnails of images attached to a step.  May return any of
    * the following canonical error codes: - PERMISSION_DENIED - if the user is
    * not authorized to read from the project, or from any of the images -
    * INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the step
    * does not exist, or if any of the images do not exist
    * @alias toolresults.projects.histories.executions.steps.thumbnails.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.executionId An Execution id.  Required.
    * @param {string} params.historyId A History id.  Required.
    * @param {integer=} params.pageSize The maximum number of thumbnails to fetch.  Default value: 50. The server will use this default if the field is not set or has a value of 0.  Optional.
    * @param {string=} params.pageToken A continuation token to resume the query at the next item.  Optional.
    * @param {string} params.projectId A Project id.  Required.
    * @param {string} params.stepId A Step id.  Required.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListStepThumbnailsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListStepThumbnailsResponse]): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarThumbnailsDollarList
  ): GaxiosPromise[Schema$ListStepThumbnailsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarThumbnailsDollarList,
    callback: BodyResponseCallback[Schema$ListStepThumbnailsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarThumbnailsDollarList,
    options: BodyResponseCallback[Schema$ListStepThumbnailsResponse],
    callback: BodyResponseCallback[Schema$ListStepThumbnailsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarThumbnailsDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListStepThumbnailsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarThumbnailsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListStepThumbnailsResponse]
  ): Unit = js.native
}

