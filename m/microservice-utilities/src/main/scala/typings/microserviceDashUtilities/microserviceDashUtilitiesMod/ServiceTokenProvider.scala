package typings.microserviceDashUtilities.microserviceDashUtilitiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("microservice-utilities", "ServiceTokenProvider")
@js.native
class ServiceTokenProvider protected () extends js.Object {
  def this(httpClient: js.Object, kmsClient: js.Object) = this()
  def this(httpClient: js.Object, kmsClient: js.Object, configuration: ServiceTokenProviderConfiguration) = this()
  def getToken(): js.Promise[String] = js.native
  def getTokenWithoutCache(): js.Promise[String] = js.native
}

