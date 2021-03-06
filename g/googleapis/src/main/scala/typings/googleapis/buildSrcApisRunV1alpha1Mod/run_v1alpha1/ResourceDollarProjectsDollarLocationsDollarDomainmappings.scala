package typings.googleapis.buildSrcApisRunV1alpha1Mod.run_v1alpha1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/run/v1alpha1", "run_v1alpha1.Resource$Projects$Locations$Domainmappings")
@js.native
class ResourceDollarProjectsDollarLocationsDollarDomainmappings protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * run.projects.locations.domainmappings.create
    * @desc Creates a new domain mapping.
    * @alias run.projects.locations.domainmappings.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The project ID or project number in which this domain mapping should be created.
    * @param {().DomainMapping} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$DomainMapping] = js.native
  def create(callback: BodyResponseCallback[Schema$DomainMapping]): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDomainmappingsDollarCreate): GaxiosPromise[Schema$DomainMapping] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDomainmappingsDollarCreate,
    callback: BodyResponseCallback[Schema$DomainMapping]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDomainmappingsDollarCreate,
    options: BodyResponseCallback[Schema$DomainMapping],
    callback: BodyResponseCallback[Schema$DomainMapping]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDomainmappingsDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$DomainMapping] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDomainmappingsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$DomainMapping]
  ): Unit = js.native
  /**
    * run.projects.locations.domainmappings.delete
    * @desc Rpc to delete a domain mapping.
    * @alias run.projects.locations.domainmappings.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.apiVersion Cloud Run currently ignores this parameter.
    * @param {string=} params.kind Cloud Run currently ignores this parameter.
    * @param {string} params.name The name of the domain mapping being deleted. If needed, replace {namespace_id} with the project ID.
    * @param {boolean=} params.orphanDependents Deprecated. Specifies the cascade behavior on delete. Cloud Run only supports cascading behavior, so this must be false. This attribute is deprecated, and is now replaced with PropagationPolicy See https://github.com/kubernetes/kubernetes/issues/46659 for more info.
    * @param {string=} params.propagationPolicy Specifies the propagation policy of delete. Cloud Run currently ignores this setting, and deletes in the background. Please see kubernetes.io/docs/concepts/workloads/controllers/garbage-collection/ for more information.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDomainmappingsDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDomainmappingsDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDomainmappingsDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDomainmappingsDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDomainmappingsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * run.projects.locations.domainmappings.get
    * @desc Rpc to get information about a domain mapping.
    * @alias run.projects.locations.domainmappings.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the domain mapping being retrieved. If needed, replace {namespace_id} with the project ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$DomainMapping] = js.native
  def get(callback: BodyResponseCallback[Schema$DomainMapping]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDomainmappingsDollarGet): GaxiosPromise[Schema$DomainMapping] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDomainmappingsDollarGet,
    callback: BodyResponseCallback[Schema$DomainMapping]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDomainmappingsDollarGet,
    options: BodyResponseCallback[Schema$DomainMapping],
    callback: BodyResponseCallback[Schema$DomainMapping]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDomainmappingsDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$DomainMapping] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDomainmappingsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$DomainMapping]
  ): Unit = js.native
  /**
    * run.projects.locations.domainmappings.list
    * @desc Rpc to list domain mappings.
    * @alias run.projects.locations.domainmappings.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.continue Optional encoded string to continue paging.
    * @param {string=} params.fieldSelector Allows to filter resources based on a specific value for a field name. Send this in a query string format. i.e. 'metadata.name%3Dlorem'. Not currently used by Cloud Run.
    * @param {boolean=} params.includeUninitialized Not currently used by Cloud Run.
    * @param {string=} params.labelSelector Allows to filter resources based on a label. Supported operations are =, !=, exists, in, and notIn.
    * @param {integer=} params.limit The maximum number of records that should be returned.
    * @param {string} params.parent The project ID or project number from which the domain mappings should be listed.
    * @param {string=} params.resourceVersion The baseline resource version from which the list or watch operation should start. Not currently used by Cloud Run.
    * @param {boolean=} params.watch Flag that indicates that the client expects to watch this resource as well. Not currently used by Cloud Run.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListDomainMappingsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListDomainMappingsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDomainmappingsDollarList): GaxiosPromise[Schema$ListDomainMappingsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDomainmappingsDollarList,
    callback: BodyResponseCallback[Schema$ListDomainMappingsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDomainmappingsDollarList,
    options: BodyResponseCallback[Schema$ListDomainMappingsResponse],
    callback: BodyResponseCallback[Schema$ListDomainMappingsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDomainmappingsDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListDomainMappingsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDomainmappingsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListDomainMappingsResponse]
  ): Unit = js.native
}

