package typings.instagramDashPrivateDashApi.distCoreRequestMod

import typings.instagramDashPrivateDashApi.Anon_AcceptEncoding
import typings.instagramDashPrivateDashApi.PartialAttemptOptionsany
import typings.instagramDashPrivateDashApi.distCoreClientMod.IgApiClient
import typings.instagramDashPrivateDashApi.distErrorsMod.IgClientError
import typings.instagramDashPrivateDashApi.distTypesCommonDotTypesMod.IgResponse
import typings.request.requestMod.Options
import typings.rxjs.rxjsMod.Subject
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/core/request", "Request")
@js.native
class Request protected () extends js.Object {
  def this(client: IgApiClient) = this()
  var attemptOptions: PartialAttemptOptionsany = js.native
  var client: js.Any = js.native
  var defaults: Partial[Options] = js.native
  @JSName("end$")
  var end$: Subject[_] = js.native
  @JSName("error$")
  var error$: Subject[IgClientError] = js.native
  var handleResponseError: js.Any = js.native
  var updateState: js.Any = js.native
  /* protected */ def faultTolerantRequest(options: Options): js.Promise[_] = js.native
  def getDefaultHeaders(): Anon_AcceptEncoding = js.native
  def send[T](userOptions: Options): js.Promise[IgResponse[T]] = js.native
  def send[T](userOptions: Options, onlyCheckHttpStatus: Boolean): js.Promise[IgResponse[T]] = js.native
  def sign(payload: Payload): SignedPost = js.native
  def signature(data: String): String = js.native
  def userBreadcrumb(size: Double): String = js.native
}

/* static members */
@JSImport("instagram-private-api/dist/core/request", "Request")
@js.native
object Request extends js.Object {
  var requestTransform: js.Any = js.native
}

