package typings.googleapis.buildSrcApisServicebrokerV1alpha1Mod.servicebroker_v1alpha1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/servicebroker/v1alpha1", "servicebroker_v1alpha1.Resource$Projects$Brokers$Instances$Service_bindings")
@js.native
class ResourceDollarProjectsDollarBrokersDollarInstancesDollarService_bindings protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * servicebroker.projects.brokers.instances.service_bindings.list
    * @desc Lists all the bindings in the instance
    * @alias servicebroker.projects.brokers.instances.service_bindings.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Specifies the number of results to return per page. If there are fewer elements than the specified number, returns all elements. Optional. If unset or 0, all the results will be returned.
    * @param {string=} params.pageToken Specifies a page token to use. Set `pageToken` to a `nextPageToken` returned by a previous list request to get the next page of results.
    * @param {string} params.parent Parent must match `projects/[PROJECT_ID]/brokers/[BROKER_ID]/instances/[INSTANCE_ID]`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$GoogleCloudServicebrokerV1alpha1__ListBindingsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1alpha1__ListBindingsResponse]): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarInstancesDollarService_bindingsDollarList
  ): GaxiosPromise[Schema$GoogleCloudServicebrokerV1alpha1__ListBindingsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarInstancesDollarService_bindingsDollarList,
    callback: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1alpha1__ListBindingsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarInstancesDollarService_bindingsDollarList,
    options: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1alpha1__ListBindingsResponse],
    callback: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1alpha1__ListBindingsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarInstancesDollarService_bindingsDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleCloudServicebrokerV1alpha1__ListBindingsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarBrokersDollarInstancesDollarService_bindingsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleCloudServicebrokerV1alpha1__ListBindingsResponse]
  ): Unit = js.native
}

