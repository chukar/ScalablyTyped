package typings.googleapis.buildSrcApisTagmanagerV1Mod.tagmanager_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/tagmanager/v1", "tagmanager_v1.Resource$Accounts$Containers$Variables")
@js.native
class ResourceDollarAccountsDollarContainersDollarVariables protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * tagmanager.accounts.containers.variables.create
    * @desc Creates a GTM Variable.
    * @alias tagmanager.accounts.containers.variables.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID.
    * @param {string} params.containerId The GTM Container ID.
    * @param {().Variable} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Variable] = js.native
  def create(callback: BodyResponseCallback[Schema$Variable]): Unit = js.native
  def create(params: ParamsDollarResourceDollarAccountsDollarContainersDollarVariablesDollarCreate): GaxiosPromise[Schema$Variable] = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVariablesDollarCreate,
    callback: BodyResponseCallback[Schema$Variable]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVariablesDollarCreate,
    options: BodyResponseCallback[Schema$Variable],
    callback: BodyResponseCallback[Schema$Variable]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVariablesDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$Variable] = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVariablesDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Variable]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.variables.delete
    * @desc Deletes a GTM Variable.
    * @alias tagmanager.accounts.containers.variables.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID.
    * @param {string} params.containerId The GTM Container ID.
    * @param {string} params.variableId The GTM Variable ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarAccountsDollarContainersDollarVariablesDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVariablesDollarDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVariablesDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVariablesDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVariablesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.variables.get
    * @desc Gets a GTM Variable.
    * @alias tagmanager.accounts.containers.variables.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID.
    * @param {string} params.containerId The GTM Container ID.
    * @param {string} params.variableId The GTM Variable ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Variable] = js.native
  def get(callback: BodyResponseCallback[Schema$Variable]): Unit = js.native
  def get(params: ParamsDollarResourceDollarAccountsDollarContainersDollarVariablesDollarGet): GaxiosPromise[Schema$Variable] = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVariablesDollarGet,
    callback: BodyResponseCallback[Schema$Variable]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVariablesDollarGet,
    options: BodyResponseCallback[Schema$Variable],
    callback: BodyResponseCallback[Schema$Variable]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVariablesDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$Variable] = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVariablesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Variable]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.variables.list
    * @desc Lists all GTM Variables of a Container.
    * @alias tagmanager.accounts.containers.variables.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID.
    * @param {string} params.containerId The GTM Container ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListVariablesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListVariablesResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarAccountsDollarContainersDollarVariablesDollarList): GaxiosPromise[Schema$ListVariablesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVariablesDollarList,
    callback: BodyResponseCallback[Schema$ListVariablesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVariablesDollarList,
    options: BodyResponseCallback[Schema$ListVariablesResponse],
    callback: BodyResponseCallback[Schema$ListVariablesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVariablesDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListVariablesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVariablesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListVariablesResponse]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.variables.update
    * @desc Updates a GTM Variable.
    * @alias tagmanager.accounts.containers.variables.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID.
    * @param {string} params.containerId The GTM Container ID.
    * @param {string=} params.fingerprint When provided, this fingerprint must match the fingerprint of the variable in storage.
    * @param {string} params.variableId The GTM Variable ID.
    * @param {().Variable} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Variable] = js.native
  def update(callback: BodyResponseCallback[Schema$Variable]): Unit = js.native
  def update(params: ParamsDollarResourceDollarAccountsDollarContainersDollarVariablesDollarUpdate): GaxiosPromise[Schema$Variable] = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVariablesDollarUpdate,
    callback: BodyResponseCallback[Schema$Variable]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVariablesDollarUpdate,
    options: BodyResponseCallback[Schema$Variable],
    callback: BodyResponseCallback[Schema$Variable]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVariablesDollarUpdate,
    options: MethodOptions
  ): GaxiosPromise[Schema$Variable] = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarVariablesDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Variable]
  ): Unit = js.native
}

