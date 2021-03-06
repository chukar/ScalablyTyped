package typings.atAngularCommon.httpHttpMod

import typings.atAngularCommon.Anon_Body
import typings.atAngularCommon.Anon_BodyHeaders
import typings.atAngularCommon.Anon_Headers
import typings.atAngularCommon.httpHttpMod.HttpEventType.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common/http/http", "HttpResponse")
@js.native
/**
  * Construct a new `HttpResponse`.
  */
class HttpResponse[T] ()
  extends HttpResponseBase
     with HttpEvent[T] {
  def this(init: Anon_Body[T]) = this()
  /**
    * The response body, or `null` if one was not returned.
    */
  val body: T | Null = js.native
  @JSName("type")
  val type_HttpResponse: Response = js.native
  def clone(update: Anon_Headers): HttpResponse[T] = js.native
  def clone[V](update: Anon_BodyHeaders[V]): HttpResponse[V] = js.native
}

