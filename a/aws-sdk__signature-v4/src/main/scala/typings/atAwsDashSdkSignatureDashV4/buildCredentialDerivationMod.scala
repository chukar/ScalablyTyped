package typings.atAwsDashSdkSignatureDashV4

import typings.atAwsDashSdkTypes.buildCredentialsMod.Credentials
import typings.atAwsDashSdkTypes.buildCryptoMod.HashConstructor
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/signature-v4/build/credentialDerivation", JSImport.Namespace)
@js.native
object buildCredentialDerivationMod extends js.Object {
  def createScope(shortDate: String, region: String, service: String): String = js.native
  def getSigningKey(
    sha256Constructor: HashConstructor,
    credentials: Credentials,
    shortDate: String,
    region: String,
    service: String
  ): js.Promise[Uint8Array] = js.native
}

