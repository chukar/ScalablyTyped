package typings.gapiDotClientDotServiceuser.gapi.client.serviceuser

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotServiceuser.Anon_Accesstoken
import typings.gapiDotClientDotServiceuser.Anon_AccesstokenAlt
import typings.gapiDotClientDotServiceuser.Anon_AccesstokenAltBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServicesResource extends js.Object {
  /**
    * Disable a service so it can no longer be used with a
    * project. This prevents unintended usage that may cause unexpected billing
    * charges or security leaks.
    *
    * Operation<response: google.protobuf.Empty>
    */
  def disable(request: Anon_Accesstoken): Request[Operation]
  /**
    * Enable a service so it can be used with a project.
    * See [Cloud Auth Guide](https://cloud.google.com/docs/authentication) for
    * more information.
    *
    * Operation<response: google.protobuf.Empty>
    */
  def enable(request: Anon_Accesstoken): Request[Operation]
  /** List enabled services for the specified consumer. */
  def list(request: Anon_AccesstokenAlt): Request[ListEnabledServicesResponse]
  /**
    * Search available services.
    *
    * When no filter is specified, returns all accessible services. For
    * authenticated users, also returns all services the calling user has
    * "servicemanagement.services.bind" permission for.
    */
  def search(request: Anon_AccesstokenAltBearertoken): Request[SearchServicesResponse]
}

object ServicesResource {
  @scala.inline
  def apply(
    disable: Anon_Accesstoken => Request[Operation],
    enable: Anon_Accesstoken => Request[Operation],
    list: Anon_AccesstokenAlt => Request[ListEnabledServicesResponse],
    search: Anon_AccesstokenAltBearertoken => Request[SearchServicesResponse]
  ): ServicesResource = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction1(disable), enable = js.Any.fromFunction1(enable), list = js.Any.fromFunction1(list), search = js.Any.fromFunction1(search))
  
    __obj.asInstanceOf[ServicesResource]
  }
}

