package typings.atAwsDashCryptoSha256DashJs

import typings.atAwsDashSdkTypes.buildCryptoMod.SourceData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-crypto/sha256-js", JSImport.Namespace)
@js.native
object atAwsDashCryptoSha256DashJsMod extends js.Object {
  @js.native
  class Sha256 ()
    extends typings.atAwsDashCryptoSha256DashJs.buildJsSha256Mod.Sha256 {
    def this(secret: SourceData) = this()
  }
  
}

