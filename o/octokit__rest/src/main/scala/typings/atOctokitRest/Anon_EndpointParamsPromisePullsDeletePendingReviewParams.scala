package typings.atOctokitRest

import typings.atOctokitRest.atOctokitRestMod.Endpoint
import typings.atOctokitRest.atOctokitRestMod.EndpointOptions
import typings.atOctokitRest.atOctokitRestMod.PullsDeletePendingReviewParams
import typings.atOctokitRest.atOctokitRestMod.PullsDeletePendingReviewParamsDeprecatedNumber
import typings.atOctokitRest.atOctokitRestMod.PullsDeletePendingReviewResponse
import typings.atOctokitRest.atOctokitRestMod.RequestOptions
import typings.atOctokitRest.atOctokitRestMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_EndpointParamsPromisePullsDeletePendingReviewParams extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[PullsDeletePendingReviewResponse]] = js.native
  def apply(
    params: RequestOptions with (PullsDeletePendingReviewParams | PullsDeletePendingReviewParamsDeprecatedNumber)
  ): js.Promise[Response[PullsDeletePendingReviewResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

