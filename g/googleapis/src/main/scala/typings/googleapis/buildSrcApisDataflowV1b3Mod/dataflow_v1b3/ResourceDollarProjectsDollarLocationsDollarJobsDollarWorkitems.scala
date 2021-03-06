package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dataflow/v1b3", "dataflow_v1b3.Resource$Projects$Locations$Jobs$Workitems")
@js.native
class ResourceDollarProjectsDollarLocationsDollarJobsDollarWorkitems protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dataflow.projects.locations.jobs.workItems.lease
    * @desc Leases a dataflow WorkItem to run.
    * @alias dataflow.projects.locations.jobs.workItems.lease
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.jobId Identifies the workflow job this worker belongs to.
    * @param {string} params.location The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that contains the WorkItem's job.
    * @param {string} params.projectId Identifies the project this worker belongs to.
    * @param {().LeaseWorkItemRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def lease(): GaxiosPromise[Schema$LeaseWorkItemResponse] = js.native
  def lease(callback: BodyResponseCallback[Schema$LeaseWorkItemResponse]): Unit = js.native
  def lease(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarJobsDollarWorkitemsDollarLease): GaxiosPromise[Schema$LeaseWorkItemResponse] = js.native
  def lease(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarJobsDollarWorkitemsDollarLease,
    callback: BodyResponseCallback[Schema$LeaseWorkItemResponse]
  ): Unit = js.native
  def lease(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarJobsDollarWorkitemsDollarLease,
    options: BodyResponseCallback[Schema$LeaseWorkItemResponse],
    callback: BodyResponseCallback[Schema$LeaseWorkItemResponse]
  ): Unit = js.native
  def lease(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarJobsDollarWorkitemsDollarLease,
    options: MethodOptions
  ): GaxiosPromise[Schema$LeaseWorkItemResponse] = js.native
  def lease(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarJobsDollarWorkitemsDollarLease,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$LeaseWorkItemResponse]
  ): Unit = js.native
  /**
    * dataflow.projects.locations.jobs.workItems.reportStatus
    * @desc Reports the status of dataflow WorkItems leased by a worker.
    * @alias dataflow.projects.locations.jobs.workItems.reportStatus
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.jobId The job which the WorkItem is part of.
    * @param {string} params.location The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that contains the WorkItem's job.
    * @param {string} params.projectId The project which owns the WorkItem's job.
    * @param {().ReportWorkItemStatusRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def reportStatus(): GaxiosPromise[Schema$ReportWorkItemStatusResponse] = js.native
  def reportStatus(callback: BodyResponseCallback[Schema$ReportWorkItemStatusResponse]): Unit = js.native
  def reportStatus(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarJobsDollarWorkitemsDollarReportstatus
  ): GaxiosPromise[Schema$ReportWorkItemStatusResponse] = js.native
  def reportStatus(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarJobsDollarWorkitemsDollarReportstatus,
    callback: BodyResponseCallback[Schema$ReportWorkItemStatusResponse]
  ): Unit = js.native
  def reportStatus(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarJobsDollarWorkitemsDollarReportstatus,
    options: BodyResponseCallback[Schema$ReportWorkItemStatusResponse],
    callback: BodyResponseCallback[Schema$ReportWorkItemStatusResponse]
  ): Unit = js.native
  def reportStatus(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarJobsDollarWorkitemsDollarReportstatus,
    options: MethodOptions
  ): GaxiosPromise[Schema$ReportWorkItemStatusResponse] = js.native
  def reportStatus(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarJobsDollarWorkitemsDollarReportstatus,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ReportWorkItemStatusResponse]
  ): Unit = js.native
}

