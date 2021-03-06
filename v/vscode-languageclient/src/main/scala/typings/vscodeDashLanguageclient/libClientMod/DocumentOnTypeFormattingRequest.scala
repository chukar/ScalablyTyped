package typings.vscodeDashLanguageclient.libClientMod

import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.DocumentOnTypeFormattingParams
import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.DocumentOnTypeFormattingRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "DocumentOnTypeFormattingRequest")
@js.native
object DocumentOnTypeFormattingRequest extends js.Object {
  val `type`: typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.RequestType[
    DocumentOnTypeFormattingParams, 
    (js.Array[
      typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.TextEdit
    ]) | Null, 
    Unit, 
    DocumentOnTypeFormattingRegistrationOptions
  ] = js.native
}

