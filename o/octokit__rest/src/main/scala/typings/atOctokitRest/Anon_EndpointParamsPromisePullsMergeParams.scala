package typings.atOctokitRest

import typings.atOctokitRest.atOctokitRestMod.Endpoint
import typings.atOctokitRest.atOctokitRestMod.EndpointOptions
import typings.atOctokitRest.atOctokitRestMod.PullsMergeParams
import typings.atOctokitRest.atOctokitRestMod.PullsMergeParamsDeprecatedNumber
import typings.atOctokitRest.atOctokitRestMod.PullsMergeResponse
import typings.atOctokitRest.atOctokitRestMod.RequestOptions
import typings.atOctokitRest.atOctokitRestMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_EndpointParamsPromisePullsMergeParams extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[PullsMergeResponse]] = js.native
  def apply(params: RequestOptions with (PullsMergeParams | PullsMergeParamsDeprecatedNumber)): js.Promise[Response[PullsMergeResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

