package typings.gapiDotClientDotCompute.gapi.client.compute

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotCompute.Anon_AltBackendServiceFieldsKey
import typings.gapiDotClientDotCompute.Anon_AltBackendServiceFieldsKeyOauthtoken
import typings.gapiDotClientDotCompute.Anon_AltFieldsFilter
import typings.gapiDotClientDotCompute.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegionBackendServicesResource extends js.Object {
  /** Deletes the specified regional BackendService resource. */
  def delete(request: Anon_AltBackendServiceFieldsKey): Request[Operation]
  /** Returns the specified regional BackendService resource. */
  def get(request: Anon_AltBackendServiceFieldsKeyOauthtoken): Request[BackendService]
  /** Gets the most recent health check results for this regional BackendService. */
  def getHealth(request: Anon_AltBackendServiceFieldsKeyOauthtoken): Request[BackendServiceGroupHealth]
  /**
    * Creates a regional BackendService resource in the specified project using the data included in the request. There are several restrictions and
    * guidelines to keep in mind when creating a regional backend service. Read  Restrictions and Guidelines for more information.
    */
  def insert(request: Anon_AltFieldsKey): Request[Operation]
  /** Retrieves the list of regional BackendService resources available to the specified project in the given region. */
  def list(request: Anon_AltFieldsFilter): Request[BackendServiceList]
  /**
    * Updates the specified regional BackendService resource with the data included in the request. There are several restrictions and guidelines to keep in
    * mind when updating a backend service. Read  Restrictions and Guidelines for more information. This method supports PATCH semantics and uses the JSON
    * merge patch format and processing rules.
    */
  def patch(request: Anon_AltBackendServiceFieldsKey): Request[Operation]
  /**
    * Updates the specified regional BackendService resource with the data included in the request. There are several restrictions and guidelines to keep in
    * mind when updating a backend service. Read  Restrictions and Guidelines for more information.
    */
  def update(request: Anon_AltBackendServiceFieldsKey): Request[Operation]
}

object RegionBackendServicesResource {
  @scala.inline
  def apply(
    delete: Anon_AltBackendServiceFieldsKey => Request[Operation],
    get: Anon_AltBackendServiceFieldsKeyOauthtoken => Request[BackendService],
    getHealth: Anon_AltBackendServiceFieldsKeyOauthtoken => Request[BackendServiceGroupHealth],
    insert: Anon_AltFieldsKey => Request[Operation],
    list: Anon_AltFieldsFilter => Request[BackendServiceList],
    patch: Anon_AltBackendServiceFieldsKey => Request[Operation],
    update: Anon_AltBackendServiceFieldsKey => Request[Operation]
  ): RegionBackendServicesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getHealth = js.Any.fromFunction1(getHealth), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[RegionBackendServicesResource]
  }
}

