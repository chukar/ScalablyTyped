package typings.atOctokitRest

import typings.atOctokitRest.atOctokitRestMod.ActivityGetRepoSubscriptionParams
import typings.atOctokitRest.atOctokitRestMod.ActivityGetRepoSubscriptionResponse
import typings.atOctokitRest.atOctokitRestMod.Endpoint
import typings.atOctokitRest.atOctokitRestMod.EndpointOptions
import typings.atOctokitRest.atOctokitRestMod.RequestOptions
import typings.atOctokitRest.atOctokitRestMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_EndpointParamsActivityGetRepoSubscriptionParams extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[ActivityGetRepoSubscriptionResponse]] = js.native
  def apply(params: RequestOptions with ActivityGetRepoSubscriptionParams): js.Promise[Response[ActivityGetRepoSubscriptionResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

