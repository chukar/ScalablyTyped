package typings.atOctokitRest

import typings.atOctokitRest.atOctokitRestMod.Endpoint
import typings.atOctokitRest.atOctokitRestMod.EndpointOptions
import typings.atOctokitRest.atOctokitRestMod.MigrationsUpdateImportParams
import typings.atOctokitRest.atOctokitRestMod.MigrationsUpdateImportResponse
import typings.atOctokitRest.atOctokitRestMod.RequestOptions
import typings.atOctokitRest.atOctokitRestMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_EndpointParamsMigrationsUpdateImportParams extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[MigrationsUpdateImportResponse]] = js.native
  def apply(params: RequestOptions with MigrationsUpdateImportParams): js.Promise[Response[MigrationsUpdateImportResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

