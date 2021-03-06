package typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.3", "dfareporting_v3_3.Resource$Projects")
@js.native
class Resource$Projects protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.projects.get
    * @desc Gets one project by ID.
    * @alias dfareporting.projects.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Project ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Project] = js.native
  def get(callback: BodyResponseCallback[Schema$Project]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarGet): GaxiosPromise[Schema$Project] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarGet,
    callback: BodyResponseCallback[Schema$Project]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarGet,
    options: BodyResponseCallback[Schema$Project],
    callback: BodyResponseCallback[Schema$Project]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Project] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Project]
  ): Unit = js.native
  /**
    * dfareporting.projects.list
    * @desc Retrieves a list of projects, possibly filtered. This method
    * supports paging.
    * @alias dfareporting.projects.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.advertiserIds Select only projects with these advertiser IDs.
    * @param {string=} params.ids Select only projects with these IDs.
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.pageToken Value of the nextPageToken from the previous result page.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string=} params.searchString Allows searching for projects by name or ID. Wildcards (*) are allowed. For example, "project*2015" will return projects with names like "project June 2015", "project April 2015", or simply "project 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "project" will match projects with name "my project", "project 2015", or simply "project".
    * @param {string=} params.sortField Field by which to sort the list.
    * @param {string=} params.sortOrder Order of sorted results.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ProjectsListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ProjectsListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarList): GaxiosPromise[Schema$ProjectsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarList,
    callback: BodyResponseCallback[Schema$ProjectsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarList,
    options: BodyResponseCallback[Schema$ProjectsListResponse],
    callback: BodyResponseCallback[Schema$ProjectsListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarList, options: MethodOptions): GaxiosPromise[Schema$ProjectsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ProjectsListResponse]
  ): Unit = js.native
}

