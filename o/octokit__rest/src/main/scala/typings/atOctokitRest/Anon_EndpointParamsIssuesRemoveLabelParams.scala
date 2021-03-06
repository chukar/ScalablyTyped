package typings.atOctokitRest

import typings.atOctokitRest.atOctokitRestMod.Endpoint
import typings.atOctokitRest.atOctokitRestMod.EndpointOptions
import typings.atOctokitRest.atOctokitRestMod.IssuesRemoveLabelParams
import typings.atOctokitRest.atOctokitRestMod.IssuesRemoveLabelParamsDeprecatedNumber
import typings.atOctokitRest.atOctokitRestMod.IssuesRemoveLabelResponse
import typings.atOctokitRest.atOctokitRestMod.RequestOptions
import typings.atOctokitRest.atOctokitRestMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_EndpointParamsIssuesRemoveLabelParams extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[IssuesRemoveLabelResponse]] = js.native
  def apply(params: RequestOptions with (IssuesRemoveLabelParams | IssuesRemoveLabelParamsDeprecatedNumber)): js.Promise[Response[IssuesRemoveLabelResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

